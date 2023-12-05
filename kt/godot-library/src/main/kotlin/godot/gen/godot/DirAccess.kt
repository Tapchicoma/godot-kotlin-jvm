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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class DirAccess internal constructor() : RefCounted() {
  public var includeNavigational: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIncludeNavigationalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIncludeNavigationalPtr, NIL)
    }

  public var includeHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIncludeHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIncludeHiddenPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DIRACCESS, scriptIndex)
    return true
  }

  public fun listDirBegin(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.listDirBeginPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.currentIsDirPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun listDirEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.listDirEndPtr, NIL)
  }

  public fun getFiles(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getDirectories(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDirectoriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getCurrentDrive(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDrivePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun changeDir(toDir: String): GodotError {
    TransferContext.writeArguments(STRING to toDir)
    TransferContext.callMethod(rawPtr, MethodBindings.changeDirPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun getCurrentDir(includeDrive: Boolean = true): String {
    TransferContext.writeArguments(BOOL to includeDrive)
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.makeDirPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.makeDirRecursivePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.fileExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.dirExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpaceLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun copy(
    from: String,
    to: String,
    chmodFlags: Int = -1,
  ): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.copyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, MethodBindings.renamePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun remove(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.removePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object {
    public fun `open`(path: String): DirAccess? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.openPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as DirAccess?)
    }

    public fun getOpenError(): GodotError {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getOpenErrorPtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun getFilesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFilesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }

    public fun getDirectoriesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getDirectoriesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }

    public fun getDriveCount(): Int {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getDriveCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }

    public fun getDriveName(idx: Int): String {
      TransferContext.writeArguments(LONG to idx.toLong())
      TransferContext.callMethod(0, MethodBindings.getDriveNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    public fun makeDirAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun makeDirRecursiveAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirRecursiveAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun dirExistsAbsolute(path: String): Boolean {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.dirExistsAbsolutePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

    @JvmOverloads
    public fun copyAbsolute(
      from: String,
      to: String,
      chmodFlags: Int = -1,
    ): GodotError {
      TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
      TransferContext.callMethod(0, MethodBindings.copyAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun renameAbsolute(from: String, to: String): GodotError {
      TransferContext.writeArguments(STRING to from, STRING to to)
      TransferContext.callMethod(0, MethodBindings.renameAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun removeAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.removeAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }
  }

  internal object MethodBindings {
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "open")

    public val getOpenErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_open_error")

    public val listDirBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "list_dir_begin")

    public val getNextPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_next")

    public val currentIsDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "current_is_dir")

    public val listDirEndPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "list_dir_end")

    public val getFilesPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_files")

    public val getFilesAtPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_files_at")

    public val getDirectoriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories")

    public val getDirectoriesAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories_at")

    public val getDriveCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_count")

    public val getDriveNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_name")

    public val getCurrentDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_drive")

    public val changeDirPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "change_dir")

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_dir")

    public val makeDirPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "make_dir")

    public val makeDirAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_absolute")

    public val makeDirRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive")

    public val makeDirRecursiveAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive_absolute")

    public val fileExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "file_exists")

    public val dirExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "dir_exists")

    public val dirExistsAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "dir_exists_absolute")

    public val getSpaceLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_space_left")

    public val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "copy")

    public val copyAbsolutePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "copy_absolute")

    public val renamePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "rename")

    public val renameAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "rename_absolute")

    public val removePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "remove")

    public val removeAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "remove_absolute")

    public val setIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_navigational")

    public val getIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_navigational")

    public val setIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_hidden")

    public val getIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_hidden")
  }
}
