// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorFileSystem internal constructor() : Node() {
  public val filesystemChanged: Signal0 by signal()

  public val scriptClassesUpdated: Signal0 by signal()

  public val sourcesChanged: Signal1<Boolean> by signal("exist")

  public val resourcesReimported: Signal1<PackedStringArray> by signal("resources")

  public val resourcesReload: Signal1<PackedStringArray> by signal("resources")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILESYSTEM, scriptIndex)
    return true
  }

  public fun getFilesystem(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesystemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  public fun isScanning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isScanningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getScanningProgress(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScanningProgressPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun scan() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scanPtr, NIL)
  }

  public fun scanSources() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scanSourcesPtr, NIL)
  }

  public fun updateFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.updateFilePtr, NIL)
  }

  public fun getFilesystemPath(path: String): EditorFileSystemDirectory? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesystemPathPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  public fun getFileType(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getFileTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun reimportFiles(files: PackedStringArray) {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to files)
    TransferContext.callMethod(rawPtr, MethodBindings.reimportFilesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_filesystem")

    public val isScanningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "is_scanning")

    public val getScanningProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_scanning_progress")

    public val scanPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorFileSystem", "scan")

    public val scanSourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "scan_sources")

    public val updateFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "update_file")

    public val getFilesystemPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_filesystem_path")

    public val getFileTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_file_type")

    public val reimportFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "reimport_files")
  }
}
