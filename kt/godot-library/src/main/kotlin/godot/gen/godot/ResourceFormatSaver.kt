// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class ResourceFormatSaver : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEFORMATSAVER, scriptIndex)
    return true
  }

  public open fun _save(
    resource: Resource,
    path: String,
    flags: Long,
  ): GodotError {
    throw NotImplementedError("_save is not implemented for ResourceFormatSaver")
  }

  public open fun _setUid(path: String, uid: Long): GodotError {
    throw NotImplementedError("_set_uid is not implemented for ResourceFormatSaver")
  }

  public open fun _recognize(resource: Resource): Boolean {
    throw NotImplementedError("_recognize is not implemented for ResourceFormatSaver")
  }

  public open fun _getRecognizedExtensions(resource: Resource): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  public open fun _recognizePath(resource: Resource, path: String): Boolean {
    throw NotImplementedError("_recognize_path is not implemented for ResourceFormatSaver")
  }

  public companion object

  internal object MethodBindings {
    public val _savePtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatSaver", "_save")

    public val _setUidPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatSaver", "_set_uid")

    public val _recognizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatSaver", "_recognize")

    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatSaver", "_get_recognized_extensions")

    public val _recognizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatSaver", "_recognize_path")
  }
}
