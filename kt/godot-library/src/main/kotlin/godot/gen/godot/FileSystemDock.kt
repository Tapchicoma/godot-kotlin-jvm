// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class FileSystemDock internal constructor() : VBoxContainer() {
  public val inherit: Signal1<String> by signal("file")

  public val instantiate: Signal1<PackedStringArray> by signal("files")

  public val resourceRemoved: Signal1<Resource> by signal("resource")

  public val fileRemoved: Signal1<String> by signal("file")

  public val folderRemoved: Signal1<String> by signal("folder")

  public val filesMoved: Signal2<String, String> by signal("oldFile", "newFile")

  public val folderMoved: Signal2<String, String> by signal("oldFolder", "newFolder")

  public val displayModeChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILESYSTEMDOCK, scriptIndex)
    return true
  }

  public fun navigateToPath(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.navigateToPathPtr, NIL)
  }

  public fun addResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.addResourceTooltipPluginPtr, NIL)
  }

  public fun removeResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeResourceTooltipPluginPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val navigateToPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileSystemDock", "navigate_to_path")

    public val addResourceTooltipPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileSystemDock", "add_resource_tooltip_plugin")

    public val removeResourceTooltipPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileSystemDock", "remove_resource_tooltip_plugin")
  }
}
