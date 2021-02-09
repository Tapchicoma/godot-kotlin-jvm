package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import godot.kotlincompilerplugin.common.CompilerPluginConst
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.*
import java.io.File


class GodotPlugin : KotlinCompilerPluginSupportPlugin {
    override fun apply(target: Project) {
        require(target.rootProject == target) { "godot-jvm plugin can only be applied on the root project!" }
        val jvm = target.extensions.getByType<KotlinJvmProjectExtension>()
        target.pluginManager.apply(ShadowPlugin::class)
        target.pluginManager.apply("org.jetbrains.kotlin.kapt")
        setupPlugin(target, jvm)
    }

    private fun setupPlugin(project: Project, jvm: KotlinJvmProjectExtension) {
        project.afterEvaluate {
            setupConfigurationsAndCompilations(jvm)
        }
    }

    //START: Compiler plugin configuration
    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project

        val srcDirs = kotlinCompilation.allKotlinSourceSets.flatMap { it.kotlin.srcDirs }

        return project.provider {
            listOf(
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.enabledOption,
                    (kotlinCompilation.name == "main").toString() //only apply the plugin to the main compilation.
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.serviceFileDirPathOption,
                    File(project.rootDir, "/src/main/resources/META-INF/services/").apply {
                        mkdirs()
                    }.absolutePath
                ),
                FilesSubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.sourcesDirPathOption,
                    srcDirs
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
                    project.buildDir.resolve("godot-entry").absolutePath
                )
            )
        }
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun isApplicable(kotlinCompilation: KotlinCompilation<*>): Boolean =
        kotlinCompilation.target.project.plugins.findPlugin(GodotPlugin::class.java) != null

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )
    //END: Compiler plugin configuration
}