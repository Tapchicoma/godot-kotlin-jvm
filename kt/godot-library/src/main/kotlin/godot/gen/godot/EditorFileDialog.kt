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
public open class EditorFileDialog internal constructor() : ConfirmationDialog() {
  public val fileSelected: Signal1<String> by signal("path")

  public val filesSelected: Signal1<PackedStringArray> by signal("paths")

  public val dirSelected: Signal1<String> by signal("dir")

  public var access: Access
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessPtr, LONG)
      return EditorFileDialog.Access.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessPtr, NIL)
    }

  public var displayMode: DisplayMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisplayModePtr, LONG)
      return EditorFileDialog.DisplayMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisplayModePtr, NIL)
    }

  public var fileMode: FileMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFileModePtr, LONG)
      return EditorFileDialog.FileMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFileModePtr, NIL)
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

  public var disableOverwriteWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverwriteWarningDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableOverwriteWarningPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILEDIALOG, scriptIndex)
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

  public enum class DisplayMode(
    id: Long,
  ) {
    DISPLAY_THUMBNAILS(0),
    DISPLAY_LIST(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DisplayMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "clear_filters")

    public val addFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "add_filter")

    public val setFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_filters")

    public val getFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_filters")

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_dir")

    public val getCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_file")

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_path")

    public val setCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_dir")

    public val setCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_file")

    public val setCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_path")

    public val setFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_file_mode")

    public val getFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_file_mode")

    public val getVboxPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorFileDialog", "get_vbox")

    public val getLineEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_line_edit")

    public val setAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_access")

    public val getAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_access")

    public val setShowHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_show_hidden_files")

    public val isShowingHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "is_showing_hidden_files")

    public val setDisplayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_display_mode")

    public val getDisplayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_display_mode")

    public val setDisableOverwriteWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_disable_overwrite_warning")

    public val isOverwriteWarningDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "is_overwrite_warning_disabled")

    public val invalidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "invalidate")
  }
}
