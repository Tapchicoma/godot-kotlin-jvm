// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class EditorFileSystemImportFormatSupportQuery internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILESYSTEMIMPORTFORMATSUPPORTQUERY, scriptIndex)
    return true
  }

  public open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  public open fun _getFileExtensions(): PackedStringArray {
    throw NotImplementedError("_get_file_extensions is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  public open fun _query(): Boolean {
    throw NotImplementedError("_query is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  public companion object

  internal object MethodBindings {
    public val _isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemImportFormatSupportQuery", "_is_active")

    public val _getFileExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemImportFormatSupportQuery", "_get_file_extensions")

    public val _queryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemImportFormatSupportQuery", "_query")
  }
}
