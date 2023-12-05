// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal2
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
public open class TextEdit : Control() {
  public val textSet: Signal0 by signal()

  public val textChanged: Signal0 by signal()

  public val linesEditedFrom: Signal2<Long, Long> by signal("fromLine", "toLine")

  public val caretChanged: Signal0 by signal()

  public val gutterClicked: Signal2<Long, Long> by signal("line", "gutter")

  public val gutterAdded: Signal0 by signal()

  public val gutterRemoved: Signal0 by signal()

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

  public var dragAndDropSelectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
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

  public var wrapMode: LineWrappingMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineWrappingModePtr, LONG)
      return TextEdit.LineWrappingMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineWrappingModePtr, NIL)
    }

  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
    }

  public var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightAllOccurrencesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightAllOccurrencesPtr, NIL)
    }

  public var highlightCurrentLine: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightCurrentLineEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightCurrentLinePtr, NIL)
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

  public var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingTabsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawTabsPtr, NIL)
    }

  public var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingSpacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawSpacesPtr, NIL)
    }

  public var syntaxHighlighter: SyntaxHighlighter?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSyntaxHighlighterPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SyntaxHighlighter?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSyntaxHighlighterPtr, NIL)
    }

  public var scrollSmooth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSmoothScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSmoothScrollEnabledPtr, NIL)
    }

  public var scrollVScrollSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollSpeedPtr, NIL)
    }

  public var scrollPastEndOfFile: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollPastEndOfFileEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollPastEndOfFileEnabledPtr, NIL)
    }

  public var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollPtr, NIL)
    }

  public var scrollHorizontal: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollPtr, NIL)
    }

  public var scrollFitContentHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFitContentHeightEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFitContentHeightEnabledPtr, NIL)
    }

  public var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingMinimapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawMinimapPtr, NIL)
    }

  public var minimapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapWidthPtr, NIL)
    }

  public var caretType: CaretType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretTypePtr, LONG)
      return TextEdit.CaretType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretTypePtr, NIL)
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

  public var caretDrawWhenEditableDisabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingCaretWhenEditableDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawCaretWhenEditableDisabledPtr, NIL)
    }

  public var caretMoveOnRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMoveCaretOnRightClickEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMoveCaretOnRightClickEnabledPtr, NIL)
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

  public var caretMultiple: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultipleCaretsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultipleCaretsEnabledPtr, NIL)
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
    callConstructor(ENGINECLASS_TEXTEDIT, scriptIndex)
    return true
  }

  public open fun _handleUnicodeInput(unicodeChar: Int, caretIndex: Int) {
  }

  public open fun _backspace(caretIndex: Int) {
  }

  public open fun _cut(caretIndex: Int) {
  }

  public open fun _copy(caretIndex: Int) {
  }

  public open fun _paste(caretIndex: Int) {
  }

  public open fun _pastePrimaryClipboard(caretIndex: Int) {
  }

  public fun hasImeText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasImeTextPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setTabSize(size: Int) {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTabSizePtr, NIL)
  }

  public fun getTabSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTabSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setOvertypeModeEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setOvertypeModeEnabledPtr, NIL)
  }

  public fun isOvertypeModeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOvertypeModeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setLine(line: Int, newText: String) {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to newText)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinePtr, NIL)
  }

  public fun getLine(line: Int): String {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLinePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getLineWidth(line: Int, wrapIndex: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getIndentLevel(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIndentLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFirstNonWhitespaceColumn(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstNonWhitespaceColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun swapLines(fromLine: Int, toLine: Int) {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.swapLinesPtr, NIL)
  }

  public fun insertLineAt(line: Int, text: String) {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.insertLineAtPtr, NIL)
  }

  @JvmOverloads
  public fun insertTextAtCaret(text: String, caretIndex: Int = -1) {
    TransferContext.writeArguments(STRING to text, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.insertTextAtCaretPtr, NIL)
  }

  public fun removeText(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
  ) {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTextPtr, NIL)
  }

  public fun getLastUnhiddenLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastUnhiddenLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNextVisibleLineOffsetFrom(line: Int, visibleAmount: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisibleLineOffsetFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNextVisibleLineIndexOffsetFrom(
    line: Int,
    wrapIndex: Int,
    visibleAmount: Int,
  ): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisibleLineIndexOffsetFromPtr,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun backspace(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.backspacePtr, NIL)
  }

  @JvmOverloads
  public fun cut(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.cutPtr, NIL)
  }

  @JvmOverloads
  public fun copy(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.copyPtr, NIL)
  }

  @JvmOverloads
  public fun paste(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pastePtr, NIL)
  }

  @JvmOverloads
  public fun pastePrimaryClipboard(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pastePrimaryClipboardPtr, NIL)
  }

  public fun startAction(action: EditAction) {
    TransferContext.writeArguments(LONG to action.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startActionPtr, NIL)
  }

  public fun endAction() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endActionPtr, NIL)
  }

  public fun beginComplexOperation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginComplexOperationPtr, NIL)
  }

  public fun endComplexOperation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endComplexOperationPtr, NIL)
  }

  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun undo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.undoPtr, NIL)
  }

  public fun redo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.redoPtr, NIL)
  }

  public fun clearUndoHistory() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearUndoHistoryPtr, NIL)
  }

  public fun tagSavedVersion() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tagSavedVersionPtr, NIL)
  }

  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getSavedVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSavedVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setSearchText(searchText: String) {
    TransferContext.writeArguments(STRING to searchText)
    TransferContext.callMethod(rawPtr, MethodBindings.setSearchTextPtr, NIL)
  }

  public fun setSearchFlags(flags: Long) {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.setSearchFlagsPtr, NIL)
  }

  public fun search(
    text: String,
    flags: Long,
    fromLine: Int,
    fromColum: Int,
  ): Vector2i {
    TransferContext.writeArguments(STRING to text, LONG to flags, LONG to fromLine.toLong(), LONG to fromColum.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.searchPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun setTooltipRequestFunc(callback: Callable) {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipRequestFuncPtr, NIL)
  }

  public fun getLocalMousePos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalMousePosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getWordAtPos(position: Vector2): String {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getWordAtPosPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true): Vector2i {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineColumnAtPosPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getPosAtLineColumn(line: Int, column: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPosAtLineColumnPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getRectAtLineColumn(line: Int, column: Int): Rect2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRectAtLineColumnPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public fun getMinimapLineAtPos(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimapLineAtPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isDraggingCursor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDraggingCursorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isMouseOverSelection(edges: Boolean, caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(BOOL to edges, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isMouseOverSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addCaret(line: Int, col: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to col.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCaretPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeCaret(caret: Int) {
    TransferContext.writeArguments(LONG to caret.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCaretPtr, NIL)
  }

  public fun removeSecondaryCarets() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.removeSecondaryCaretsPtr, NIL)
  }

  public fun mergeOverlappingCarets() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mergeOverlappingCaretsPtr, NIL)
  }

  public fun getCaretCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun addCaretAtCarets(below: Boolean) {
    TransferContext.writeArguments(BOOL to below)
    TransferContext.callMethod(rawPtr, MethodBindings.addCaretAtCaretsPtr, NIL)
  }

  public fun getCaretIndexEditOrder(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretIndexEditOrderPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun adjustCaretsAfterEdit(
    caret: Int,
    fromLine: Int,
    fromCol: Int,
    toLine: Int,
    toCol: Int,
  ) {
    TransferContext.writeArguments(LONG to caret.toLong(), LONG to fromLine.toLong(), LONG to fromCol.toLong(), LONG to toLine.toLong(), LONG to toCol.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustCaretsAfterEditPtr, NIL)
  }

  @JvmOverloads
  public fun isCaretVisible(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCaretVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getCaretDrawPos(caretIndex: Int = 0): Vector2 {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretDrawPosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun setCaretLine(
    line: Int,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Int = 0,
    caretIndex: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to adjustViewport, BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCaretLinePtr, NIL)
  }

  @JvmOverloads
  public fun getCaretLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun setCaretColumn(
    column: Int,
    adjustViewport: Boolean = true,
    caretIndex: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to adjustViewport, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCaretColumnPtr, NIL)
  }

  @JvmOverloads
  public fun getCaretColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getCaretWrapIndex(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getWordUnderCaret(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getWordUnderCaretPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun setSelectionMode(
    mode: SelectionMode,
    line: Int = -1,
    column: Int = -1,
    caretIndex: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to mode.id, LONG to line.toLong(), LONG to column.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectionModePtr, NIL)
  }

  public fun getSelectionMode(): SelectionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionModePtr, LONG)
    return TextEdit.SelectionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  @JvmOverloads
  public fun selectWordUnderCaret(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectWordUnderCaretPtr, NIL)
  }

  public fun addSelectionForNextOccurrence() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.addSelectionForNextOccurrencePtr, NIL)
  }

  @JvmOverloads
  public fun select(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
    caretIndex: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  @JvmOverloads
  public fun hasSelection(caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getSelectedText(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getSelectionLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getSelectionColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getSelectionFromLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getSelectionFromColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getSelectionToLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getSelectionToColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun deselect(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  @JvmOverloads
  public fun deleteSelection(caretIndex: Int = -1) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteSelectionPtr, NIL)
  }

  public fun isLineWrapped(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineWrappedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getLineWrapCount(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrapCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineWrapIndexAtColumn(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrapIndexAtColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineWrappedText(line: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrappedTextPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HScrollBar?)
  }

  @JvmOverloads
  public fun getScrollPosForLine(line: Int, wrapIndex: Int = 0): Double {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollPosForLinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun setLineAsFirstVisible(line: Int, wrapIndex: Int = 0) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsFirstVisiblePtr, NIL)
  }

  public fun getFirstVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun setLineAsCenterVisible(line: Int, wrapIndex: Int = 0) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsCenterVisiblePtr, NIL)
  }

  @JvmOverloads
  public fun setLineAsLastVisible(line: Int, wrapIndex: Int = 0) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsLastVisiblePtr, NIL)
  }

  public fun getLastFullVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastFullVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLastFullVisibleLineWrapIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastFullVisibleLineWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVisibleLineCountInRange(fromLine: Int, toLine: Int): Int {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountInRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTotalVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun adjustViewportToCaret(caretIndex: Int = 0) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustViewportToCaretPtr, NIL)
  }

  @JvmOverloads
  public fun centerViewportToCaret(caretIndex: Int = 0) {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.centerViewportToCaretPtr, NIL)
  }

  public fun getMinimapVisibleLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimapVisibleLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addGutter(at: Int = -1) {
    TransferContext.writeArguments(LONG to at.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addGutterPtr, NIL)
  }

  public fun removeGutter(gutter: Int) {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeGutterPtr, NIL)
  }

  public fun getGutterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setGutterName(gutter: Int, name: String) {
    TransferContext.writeArguments(LONG to gutter.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterNamePtr, NIL)
  }

  public fun getGutterName(gutter: Int): String {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setGutterType(gutter: Int, type: GutterType) {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterTypePtr, NIL)
  }

  public fun getGutterType(gutter: Int): GutterType {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterTypePtr, LONG)
    return TextEdit.GutterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setGutterWidth(gutter: Int, width: Int) {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterWidthPtr, NIL)
  }

  public fun getGutterWidth(gutter: Int): Int {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setGutterDraw(gutter: Int, draw: Boolean) {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to draw)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterDrawPtr, NIL)
  }

  public fun isGutterDrawn(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterDrawnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setGutterClickable(gutter: Int, clickable: Boolean) {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterClickablePtr, NIL)
  }

  public fun isGutterClickable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setGutterOverwritable(gutter: Int, overwritable: Boolean) {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to overwritable)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterOverwritablePtr, NIL)
  }

  public fun isGutterOverwritable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterOverwritablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun mergeGutters(fromLine: Int, toLine: Int) {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.mergeGuttersPtr, NIL)
  }

  public fun setGutterCustomDraw(column: Int, drawCallback: Callable) {
    TransferContext.writeArguments(LONG to column.toLong(), CALLABLE to drawCallback)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterCustomDrawPtr, NIL)
  }

  public fun getTotalGutterWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setLineGutterMetadata(
    line: Int,
    gutter: Int,
    metadata: Any?,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterMetadataPtr, NIL)
  }

  public fun getLineGutterMetadata(line: Int, gutter: Int): Any? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setLineGutterText(
    line: Int,
    gutter: Int,
    text: String,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterTextPtr, NIL)
  }

  public fun getLineGutterText(line: Int, gutter: Int): String {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setLineGutterIcon(
    line: Int,
    gutter: Int,
    icon: Texture2D,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterIconPtr, NIL)
  }

  public fun getLineGutterIcon(line: Int, gutter: Int): Texture2D? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setLineGutterItemColor(
    line: Int,
    gutter: Int,
    color: Color,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterItemColorPtr, NIL)
  }

  public fun getLineGutterItemColor(line: Int, gutter: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterItemColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setLineGutterClickable(
    line: Int,
    gutter: Int,
    clickable: Boolean,
  ) {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterClickablePtr, NIL)
  }

  public fun isLineGutterClickable(line: Int, gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLineBackgroundColor(line: Int, color: Color) {
    TransferContext.writeArguments(LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineBackgroundColorPtr, NIL)
  }

  public fun getLineBackgroundColor(line: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineBackgroundColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
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

  public fun menuOption(option: Int) {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
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

  public enum class EditAction(
    id: Long,
  ) {
    ACTION_NONE(0),
    ACTION_TYPING(1),
    ACTION_BACKSPACE(2),
    ACTION_DELETE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EditAction = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SearchFlags(
    id: Long,
  ) {
    SEARCH_MATCH_CASE(1),
    SEARCH_WHOLE_WORDS(2),
    SEARCH_BACKWARDS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SearchFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CaretType(
    id: Long,
  ) {
    CARET_TYPE_LINE(0),
    CARET_TYPE_BLOCK(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CaretType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SelectionMode(
    id: Long,
  ) {
    SELECTION_MODE_NONE(0),
    SELECTION_MODE_SHIFT(1),
    SELECTION_MODE_POINTER(2),
    SELECTION_MODE_WORD(3),
    SELECTION_MODE_LINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SelectionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LineWrappingMode(
    id: Long,
  ) {
    LINE_WRAPPING_NONE(0),
    LINE_WRAPPING_BOUNDARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineWrappingMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GutterType(
    id: Long,
  ) {
    GUTTER_TYPE_STRING(0),
    GUTTER_TYPE_ICON(1),
    GUTTER_TYPE_CUSTOM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GutterType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _handleUnicodeInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "_handle_unicode_input")

    public val _backspacePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_backspace")

    public val _cutPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_cut")

    public val _copyPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_copy")

    public val _pastePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_paste")

    public val _pastePrimaryClipboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "_paste_primary_clipboard")

    public val hasImeTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_ime_text")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "is_editable")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_language")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override_options")

    public val setTabSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_tab_size")

    public val getTabSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_tab_size")

    public val setOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_overtype_mode_enabled")

    public val isOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_overtype_mode_enabled")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_context_menu_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_shortcut_keys_enabled")

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_virtual_keyboard_enabled")

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_virtual_keyboard_enabled")

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_middle_mouse_paste_enabled")

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_middle_mouse_paste_enabled")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "clear")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_text")

    public val getLineCountPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line_count")

    public val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_placeholder")

    public val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_placeholder")

    public val setLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_line")

    public val getLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line")

    public val getLineWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line_width")

    public val getLineHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_height")

    public val getIndentLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_indent_level")

    public val getFirstNonWhitespaceColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_non_whitespace_column")

    public val swapLinesPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "swap_lines")

    public val insertLineAtPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "insert_line_at")

    public val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "insert_text_at_caret")

    public val removeTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_text")

    public val getLastUnhiddenLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_unhidden_line")

    public val getNextVisibleLineOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_offset_from")

    public val getNextVisibleLineIndexOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_index_offset_from")

    public val backspacePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "backspace")

    public val cutPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "cut")

    public val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "copy")

    public val pastePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "paste")

    public val pastePrimaryClipboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "paste_primary_clipboard")

    public val startActionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "start_action")

    public val endActionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "end_action")

    public val beginComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "begin_complex_operation")

    public val endComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_complex_operation")

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_undo")

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_redo")

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "undo")

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "redo")

    public val clearUndoHistoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "clear_undo_history")

    public val tagSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "tag_saved_version")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_version")

    public val getSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_saved_version")

    public val setSearchTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_text")

    public val setSearchFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_flags")

    public val searchPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "search")

    public val setTooltipRequestFuncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_tooltip_request_func")

    public val getLocalMousePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_local_mouse_pos")

    public val getWordAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_at_pos")

    public val getLineColumnAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_column_at_pos")

    public val getPosAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_pos_at_line_column")

    public val getRectAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_rect_at_line_column")

    public val getMinimapLineAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_line_at_pos")

    public val isDraggingCursorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_dragging_cursor")

    public val isMouseOverSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_mouse_over_selection")

    public val setCaretTypePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_caret_type")

    public val getCaretTypePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_caret_type")

    public val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_enabled")

    public val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_blink_enabled")

    public val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_interval")

    public val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_blink_interval")

    public val setDrawCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_caret_when_editable_disabled")

    public val isDrawingCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_caret_when_editable_disabled")

    public val setMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_move_caret_on_right_click_enabled")

    public val isMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_move_caret_on_right_click_enabled")

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_mid_grapheme_enabled")

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_mid_grapheme_enabled")

    public val setMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_multiple_carets_enabled")

    public val isMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_multiple_carets_enabled")

    public val addCaretPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "add_caret")

    public val removeCaretPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_caret")

    public val removeSecondaryCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_secondary_carets")

    public val mergeOverlappingCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "merge_overlapping_carets")

    public val getCaretCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_count")

    public val addCaretAtCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_caret_at_carets")

    public val getCaretIndexEditOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_index_edit_order")

    public val adjustCaretsAfterEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_carets_after_edit")

    public val isCaretVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_visible")

    public val getCaretDrawPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_draw_pos")

    public val setCaretLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_caret_line")

    public val getCaretLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_caret_line")

    public val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_column")

    public val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_column")

    public val getCaretWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_wrap_index")

    public val getWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_under_caret")

    public val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selecting_enabled")

    public val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_selecting_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_deselect_on_focus_loss_enabled")

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_drag_and_drop_selection_enabled")

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drag_and_drop_selection_enabled")

    public val setSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_mode")

    public val getSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_mode")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "select_all")

    public val selectWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "select_word_under_caret")

    public val addSelectionForNextOccurrencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_selection_for_next_occurrence")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "select")

    public val hasSelectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_selection")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selected_text")

    public val getSelectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_line")

    public val getSelectionColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_column")

    public val getSelectionFromLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_line")

    public val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_column")

    public val getSelectionToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_line")

    public val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_column")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "deselect")

    public val deleteSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "delete_selection")

    public val setLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_wrapping_mode")

    public val getLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapping_mode")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_autowrap_mode")

    public val isLineWrappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_wrapped")

    public val getLineWrapCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_count")

    public val getLineWrapIndexAtColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_index_at_column")

    public val getLineWrappedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapped_text")

    public val setSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_smooth_scroll_enabled")

    public val isSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_smooth_scroll_enabled")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_bar")

    public val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll_bar")

    public val setVScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll")

    public val getVScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll")

    public val setHScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_h_scroll")

    public val getHScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll")

    public val setScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_scroll_past_end_of_file_enabled")

    public val isScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_scroll_past_end_of_file_enabled")

    public val setVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll_speed")

    public val getVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_speed")

    public val setFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_fit_content_height_enabled")

    public val isFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_fit_content_height_enabled")

    public val getScrollPosForLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_scroll_pos_for_line")

    public val setLineAsFirstVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_first_visible")

    public val getFirstVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_visible_line")

    public val setLineAsCenterVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_center_visible")

    public val setLineAsLastVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_last_visible")

    public val getLastFullVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line")

    public val getLastFullVisibleLineWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line_wrap_index")

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count")

    public val getVisibleLineCountInRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count_in_range")

    public val getTotalVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_visible_line_count")

    public val adjustViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_viewport_to_caret")

    public val centerViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "center_viewport_to_caret")

    public val setDrawMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_minimap")

    public val isDrawingMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_minimap")

    public val setMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_minimap_width")

    public val getMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_width")

    public val getMinimapVisibleLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_visible_lines")

    public val addGutterPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "add_gutter")

    public val removeGutterPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_gutter")

    public val getGutterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_count")

    public val setGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_name")

    public val getGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_name")

    public val setGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_type")

    public val getGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_type")

    public val setGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_width")

    public val getGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_width")

    public val setGutterDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_draw")

    public val isGutterDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_drawn")

    public val setGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_clickable")

    public val isGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_clickable")

    public val setGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_overwritable")

    public val isGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_overwritable")

    public val mergeGuttersPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "merge_gutters")

    public val setGutterCustomDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_custom_draw")

    public val getTotalGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_gutter_width")

    public val setLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_metadata")

    public val getLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_metadata")

    public val setLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_text")

    public val getLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_text")

    public val setLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_icon")

    public val getLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_icon")

    public val setLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_item_color")

    public val getLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_item_color")

    public val setLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_clickable")

    public val isLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_gutter_clickable")

    public val setLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_background_color")

    public val getLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_background_color")

    public val setSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_syntax_highlighter")

    public val getSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_syntax_highlighter")

    public val setHighlightCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_current_line")

    public val isHighlightCurrentLineEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_current_line_enabled")

    public val setHighlightAllOccurrencesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_all_occurrences")

    public val isHighlightAllOccurrencesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_all_occurrences_enabled")

    public val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_draw_control_chars")

    public val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_control_chars")

    public val setDrawTabsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_draw_tabs")

    public val isDrawingTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_tabs")

    public val setDrawSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_spaces")

    public val isDrawingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_spaces")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_menu_visible")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "menu_option")
  }
}
