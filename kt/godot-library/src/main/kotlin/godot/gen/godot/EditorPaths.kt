// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorPaths internal constructor() : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPATHS, scriptIndex)
    return true
  }

  public fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConfigDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isSelfContained(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSelfContainedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSelfContainedFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelfContainedFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getProjectSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectSettingsDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPaths", "get_data_dir")

    public val getConfigDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_config_dir")

    public val getCacheDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_cache_dir")

    public val isSelfContainedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "is_self_contained")

    public val getSelfContainedFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_self_contained_file")

    public val getProjectSettingsDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_project_settings_dir")
  }
}
