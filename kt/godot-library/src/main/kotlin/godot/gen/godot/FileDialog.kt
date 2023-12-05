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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class FileDialog : ConfirmationDialog() {
  public val fileSelected: Signal1<String> by signal("path")

  public val filesSelected: Signal1<PackedStringArray> by signal("paths")

  public val dirSelected: Signal1<String> by signal("dir")

  public var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isModeOverridingTitlePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModeOverridesTitlePtr, NIL)
    }

  public var fileMode: FileMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFileModePtr, LONG)
      return FileDialog.FileMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFileModePtr, NIL)
    }

  public var access: Access
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessPtr, LONG)
      return FileDialog.Access.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessPtr, NIL)
    }

  public var rootSubfolder: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootSubfolderPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootSubfolderPtr, NIL)
    }

  public var filters: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFiltersPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFiltersPtr, NIL)
    }

  public var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingHiddenFilesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowHiddenFilesPtr, NIL)
    }

  public var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentDirPtr, NIL)
    }

  public var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentFilePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentFilePtr, NIL)
    }

  public var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentPathPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILEDIALOG, scriptIndex)
    return true
  }

  public fun clearFilters() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearFiltersPtr, NIL)
  }

  @JvmOverloads
  public fun addFilter(filter: String, description: String = "") {
    TransferContext.writeArguments(STRING to filter, STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.addFilterPtr, NIL)
  }

  public fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  public fun deselectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  public fun invalidate() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.invalidatePtr, NIL)
  }

  public enum class FileMode(
    id: Long,
  ) {
    FILE_MODE_OPEN_FILE(0),
    FILE_MODE_OPEN_FILES(1),
    FILE_MODE_OPEN_DIR(2),
    FILE_MODE_OPEN_ANY(3),
    FILE_MODE_SAVE_FILE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FileMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Access(
    id: Long,
  ) {
    ACCESS_RESOURCES(0),
    ACCESS_USERDATA(1),
    ACCESS_FILESYSTEM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Access = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "clear_filters")

    public val addFilterPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "add_filter")

    public val setFiltersPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "set_filters")

    public val getFiltersPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "get_filters")

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_dir")

    public val getCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_file")

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_path")

    public val setCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_dir")

    public val setCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_file")

    public val setCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_path")

    public val setModeOverridesTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_mode_overrides_title")

    public val isModeOverridingTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "is_mode_overriding_title")

    public val setFileModePtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "set_file_mode")

    public val getFileModePtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "get_file_mode")

    public val getVboxPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "get_vbox")

    public val getLineEditPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "get_line_edit")

    public val setAccessPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "set_access")

    public val getAccessPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "get_access")

    public val setRootSubfolderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_root_subfolder")

    public val getRootSubfolderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_root_subfolder")

    public val setShowHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_show_hidden_files")

    public val isShowingHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "is_showing_hidden_files")

    public val deselectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "deselect_all")

    public val invalidatePtr: VoidPtr = TypeManager.getMethodBindPtr("FileDialog", "invalidate")
  }
}
