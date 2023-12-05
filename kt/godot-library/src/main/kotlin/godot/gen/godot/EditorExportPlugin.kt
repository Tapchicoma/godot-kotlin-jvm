// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorExportPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITOREXPORTPLUGIN, scriptIndex)
    return true
  }

  public open fun _exportFile(
    path: String,
    type: String,
    features: PackedStringArray,
  ) {
  }

  public open fun _exportBegin(
    features: PackedStringArray,
    isDebug: Boolean,
    path: String,
    flags: Long,
  ) {
  }

  public open fun _exportEnd() {
  }

  public open fun _beginCustomizeResources(platform: EditorExportPlatform,
      features: PackedStringArray): Boolean {
    throw NotImplementedError("_begin_customize_resources is not implemented for EditorExportPlugin")
  }

  public open fun _customizeResource(resource: Resource, path: String): Resource? {
    throw NotImplementedError("_customize_resource is not implemented for EditorExportPlugin")
  }

  public open fun _beginCustomizeScenes(platform: EditorExportPlatform,
      features: PackedStringArray): Boolean {
    throw NotImplementedError("_begin_customize_scenes is not implemented for EditorExportPlugin")
  }

  public open fun _customizeScene(scene: Node, path: String): Node? {
    throw NotImplementedError("_customize_scene is not implemented for EditorExportPlugin")
  }

  public open fun _getCustomizationConfigurationHash(): Long {
    throw NotImplementedError("_get_customization_configuration_hash is not implemented for EditorExportPlugin")
  }

  public open fun _endCustomizeScenes() {
  }

  public open fun _endCustomizeResources() {
  }

  public open fun _getExportOptions(platform: EditorExportPlatform):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_export_options is not implemented for EditorExportPlugin")
  }

  public open fun _shouldUpdateExportOptions(platform: EditorExportPlatform): Boolean {
    throw NotImplementedError("_should_update_export_options is not implemented for EditorExportPlugin")
  }

  public open fun _getExportFeatures(platform: EditorExportPlatform, debug: Boolean):
      PackedStringArray {
    throw NotImplementedError("_get_export_features is not implemented for EditorExportPlugin")
  }

  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for EditorExportPlugin")
  }

  public fun addSharedObject(
    path: String,
    tags: PackedStringArray,
    target: String,
  ) {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to tags, STRING to target)
    TransferContext.callMethod(rawPtr, MethodBindings.addSharedObjectPtr, NIL)
  }

  public fun addIosProjectStaticLib(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosProjectStaticLibPtr, NIL)
  }

  public fun addFile(
    path: String,
    `file`: PackedByteArray,
    remap: Boolean,
  ) {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to file, BOOL to remap)
    TransferContext.callMethod(rawPtr, MethodBindings.addFilePtr, NIL)
  }

  public fun addIosFramework(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosFrameworkPtr, NIL)
  }

  public fun addIosEmbeddedFramework(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosEmbeddedFrameworkPtr, NIL)
  }

  public fun addIosPlistContent(plistContent: String) {
    TransferContext.writeArguments(STRING to plistContent)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosPlistContentPtr, NIL)
  }

  public fun addIosLinkerFlags(flags: String) {
    TransferContext.writeArguments(STRING to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosLinkerFlagsPtr, NIL)
  }

  public fun addIosBundleFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosBundleFilePtr, NIL)
  }

  public fun addIosCppCode(code: String) {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(rawPtr, MethodBindings.addIosCppCodePtr, NIL)
  }

  public fun addMacosPluginFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addMacosPluginFilePtr, NIL)
  }

  public fun skip() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skipPtr, NIL)
  }

  public fun getOption(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getOptionPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val _exportFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_export_file")

    public val _exportBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_export_begin")

    public val _exportEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_export_end")

    public val _beginCustomizeResourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_begin_customize_resources")

    public val _customizeResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_customize_resource")

    public val _beginCustomizeScenesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_begin_customize_scenes")

    public val _customizeScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_customize_scene")

    public val _getCustomizationConfigurationHashPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_get_customization_configuration_hash")

    public val _endCustomizeScenesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_end_customize_scenes")

    public val _endCustomizeResourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_end_customize_resources")

    public val _getExportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_get_export_options")

    public val _shouldUpdateExportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_should_update_export_options")

    public val _getExportFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_get_export_features")

    public val _getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "_get_name")

    public val addSharedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_shared_object")

    public val addIosProjectStaticLibPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_project_static_lib")

    public val addFilePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorExportPlugin", "add_file")

    public val addIosFrameworkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_framework")

    public val addIosEmbeddedFrameworkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_embedded_framework")

    public val addIosPlistContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_plist_content")

    public val addIosLinkerFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_linker_flags")

    public val addIosBundleFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_bundle_file")

    public val addIosCppCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_ios_cpp_code")

    public val addMacosPluginFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "add_macos_plugin_file")

    public val skipPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorExportPlugin", "skip")

    public val getOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorExportPlugin", "get_option")
  }
}
