// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class LineEdit : Control() {
  public val textChanged: Signal1<String> by signal("newText")

  public val textChangeRejected: Signal1<String> by signal("rejectedSubstring")

  public val textSubmitted: Signal1<String> by signal("newText")

  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  public var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlaceholderPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlaceholderPtr, NIL)
    }

  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  public var maxLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLengthPtr, NIL)
    }

  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  public var secret: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSecretPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSecretPtr, NIL)
    }

  public var secretCharacter: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSecretCharacterPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSecretCharacterPtr, NIL)
    }

  public var expandToTextLength: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isExpandToTextLengthEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandToTextLengthEnabledPtr, NIL)
    }

  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isContextMenuEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContextMenuEnabledPtr, NIL)
    }

  public var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVirtualKeyboardEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVirtualKeyboardEnabledPtr, NIL)
    }

  public var virtualKeyboardType: VirtualKeyboardType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVirtualKeyboardTypePtr, LONG)
      return LineEdit.VirtualKeyboardType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVirtualKeyboardTypePtr, NIL)
    }

  public var clearButtonEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClearButtonEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClearButtonEnabledPtr, NIL)
    }

  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
    }

  public var middleMousePasteEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMiddleMousePasteEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMiddleMousePasteEnabledPtr, NIL)
    }

  public var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectingEnabledPtr, NIL)
    }

  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
    }

  public var rightIcon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRightIconPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRightIconPtr, NIL)
    }

  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  public var drawControlChars: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawControlCharsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawControlCharsPtr, NIL)
    }

  public var selectAllOnFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectAllOnFocusPtr, NIL)
    }

  public var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretBlinkEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretBlinkEnabledPtr, NIL)
    }

  public var caretBlinkInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretBlinkIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretBlinkIntervalPtr, NIL)
    }

  public var caretColumn: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretColumnPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretColumnPtr, NIL)
    }

  public var caretForceDisplayed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretForceDisplayedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretForceDisplayedPtr, NIL)
    }

  public var caretMidGrapheme: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretMidGraphemeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretMidGraphemeEnabledPtr, NIL)
    }

  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LINEEDIT, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  @JvmOverloads
  public fun select(from: Int = 0, to: Int = -1) {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  public fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  public fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  public fun hasSelection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getSelectionFromColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSelectionToColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getScrollOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun insertTextAtCaret(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.insertTextAtCaretPtr, NIL)
  }

  public fun deleteCharAtCaret() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deleteCharAtCaretPtr, NIL)
  }

  public fun deleteText(fromColumn: Int, toColumn: Int) {
    TransferContext.writeArguments(LONG to fromColumn.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteTextPtr, NIL)
  }

  public fun menuOption(option: Int) {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
  }

  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class MenuItems(
    id: Long,
  ) {
    MENU_CUT(0),
    MENU_COPY(1),
    MENU_PASTE(2),
    MENU_CLEAR(3),
    MENU_SELECT_ALL(4),
    MENU_UNDO(5),
    MENU_REDO(6),
    MENU_SUBMENU_TEXT_DIR(7),
    MENU_DIR_INHERITED(8),
    MENU_DIR_AUTO(9),
    MENU_DIR_LTR(10),
    MENU_DIR_RTL(11),
    MENU_DISPLAY_UCC(12),
    MENU_SUBMENU_INSERT_UCC(13),
    MENU_INSERT_LRM(14),
    MENU_INSERT_RLM(15),
    MENU_INSERT_LRE(16),
    MENU_INSERT_RLE(17),
    MENU_INSERT_LRO(18),
    MENU_INSERT_RLO(19),
    MENU_INSERT_PDF(20),
    MENU_INSERT_ALM(21),
    MENU_INSERT_LRI(22),
    MENU_INSERT_RLI(23),
    MENU_INSERT_FSI(24),
    MENU_INSERT_PDI(25),
    MENU_INSERT_ZWJ(26),
    MENU_INSERT_ZWNJ(27),
    MENU_INSERT_WJ(28),
    MENU_INSERT_SHY(29),
    MENU_MAX(30),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MenuItems = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VirtualKeyboardType(
    id: Long,
  ) {
    KEYBOARD_TYPE_DEFAULT(0),
    KEYBOARD_TYPE_MULTILINE(1),
    KEYBOARD_TYPE_NUMBER(2),
    KEYBOARD_TYPE_NUMBER_DECIMAL(3),
    KEYBOARD_TYPE_PHONE(4),
    KEYBOARD_TYPE_EMAIL_ADDRESS(5),
    KEYBOARD_TYPE_PASSWORD(6),
    KEYBOARD_TYPE_URL(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VirtualKeyboardType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_horizontal_alignment")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "clear")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "select")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "select_all")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "deselect")

    public val hasSelectionPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "has_selection")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selected_text")

    public val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_from_column")

    public val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_to_column")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_text")

    public val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_draw_control_chars")

    public val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_draw_control_chars")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_language")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override_options")

    public val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_placeholder")

    public val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_placeholder")

    public val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_column")

    public val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_column")

    public val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_scroll_offset")

    public val setExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_expand_to_text_length_enabled")

    public val isExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_expand_to_text_length_enabled")

    public val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_enabled")

    public val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_blink_enabled")

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_mid_grapheme_enabled")

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_mid_grapheme_enabled")

    public val setCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_force_displayed")

    public val isCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_force_displayed")

    public val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_interval")

    public val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_blink_interval")

    public val setMaxLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_max_length")

    public val getMaxLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_max_length")

    public val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "insert_text_at_caret")

    public val deleteCharAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "delete_char_at_caret")

    public val deleteTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "delete_text")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_editable")

    public val setSecretPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_secret")

    public val isSecretPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_secret")

    public val setSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_secret_character")

    public val getSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_secret_character")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "menu_option")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_menu_visible")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_context_menu_enabled")

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_enabled")

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_virtual_keyboard_enabled")

    public val setVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_type")

    public val getVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_virtual_keyboard_type")

    public val setClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_clear_button_enabled")

    public val isClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_clear_button_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_shortcut_keys_enabled")

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_middle_mouse_paste_enabled")

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_middle_mouse_paste_enabled")

    public val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_selecting_enabled")

    public val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_selecting_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_deselect_on_focus_loss_enabled")

    public val setRightIconPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_right_icon")

    public val getRightIconPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_right_icon")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_flat")

    public val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_select_all_on_focus")

    public val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_select_all_on_focus")
  }
}
