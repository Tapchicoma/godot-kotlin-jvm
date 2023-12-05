// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class ResourceFormatLoader : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEFORMATLOADER, scriptIndex)
    return true
  }

  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  public open fun _recognizePath(path: String, type: StringName): Boolean {
    throw NotImplementedError("_recognize_path is not implemented for ResourceFormatLoader")
  }

  public open fun _handlesType(type: StringName): Boolean {
    throw NotImplementedError("_handles_type is not implemented for ResourceFormatLoader")
  }

  public open fun _getResourceType(path: String): String {
    throw NotImplementedError("_get_resource_type is not implemented for ResourceFormatLoader")
  }

  public open fun _getResourceScriptClass(path: String): String {
    throw NotImplementedError("_get_resource_script_class is not implemented for ResourceFormatLoader")
  }

  public open fun _getResourceUid(path: String): Long {
    throw NotImplementedError("_get_resource_uid is not implemented for ResourceFormatLoader")
  }

  public open fun _getDependencies(path: String, addTypes: Boolean): PackedStringArray {
    throw NotImplementedError("_get_dependencies is not implemented for ResourceFormatLoader")
  }

  public open fun _renameDependencies(path: String, renames: Dictionary<Any?, Any?>): GodotError {
    throw NotImplementedError("_rename_dependencies is not implemented for ResourceFormatLoader")
  }

  public open fun _exists(path: String): Boolean {
    throw NotImplementedError("_exists is not implemented for ResourceFormatLoader")
  }

  public open fun _getClassesUsed(path: String): PackedStringArray {
    throw NotImplementedError("_get_classes_used is not implemented for ResourceFormatLoader")
  }

  public open fun _load(
    path: String,
    originalPath: String,
    useSubThreads: Boolean,
    cacheMode: Int,
  ): Any? {
    throw NotImplementedError("_load is not implemented for ResourceFormatLoader")
  }

  public enum class CacheMode(
    id: Long,
  ) {
    CACHE_MODE_IGNORE(0),
    CACHE_MODE_REUSE(1),
    CACHE_MODE_REPLACE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CacheMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_recognized_extensions")

    public val _recognizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_recognize_path")

    public val _handlesTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_handles_type")

    public val _getResourceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_type")

    public val _getResourceScriptClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_script_class")

    public val _getResourceUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_uid")

    public val _getDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_dependencies")

    public val _renameDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_rename_dependencies")

    public val _existsPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatLoader", "_exists")

    public val _getClassesUsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_classes_used")

    public val _loadPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatLoader", "_load")
  }
}
