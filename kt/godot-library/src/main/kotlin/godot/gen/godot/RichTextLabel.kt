// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
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
public open class RichTextLabel : Control() {
  public val metaClicked: Signal1<Any?> by signal("meta")

  public val metaHoverStarted: Signal1<Any?> by signal("meta")

  public val metaHoverEnded: Signal1<Any?> by signal("meta")

  public val finished: Signal0 by signal()

  public var bbcodeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingBbcodePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseBbcodePtr, NIL)
    }

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

  public var fitContent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFitContentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFitContentPtr, NIL)
    }

  public var scrollActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollActivePtr, NIL)
    }

  public var scrollFollowing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollFollowingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollFollowPtr, NIL)
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

  public var tabSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTabSizePtr, NIL)
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

  public var customEffects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEffectsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEffectsPtr, NIL)
    }

  public var metaUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMetaUnderlinedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetaUnderlinePtr, NIL)
    }

  public var hintUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHintUnderlinedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHintUnderlinePtr, NIL)
    }

  public var threaded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isThreadedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThreadedPtr, NIL)
    }

  public var progressBarDelay: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressBarDelayPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressBarDelayPtr, NIL)
    }

  public var selectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectionEnabledPtr, NIL)
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

  public var visibleCharacters: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersPtr, NIL)
    }

  public var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersBehaviorPtr, LONG)
      return TextServer.VisibleCharactersBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersBehaviorPtr, NIL)
    }

  public var visibleRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleRatioPtr, NIL)
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
    callConstructor(ENGINECLASS_RICHTEXTLABEL, scriptIndex)
    return true
  }

  public fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun addText(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.addTextPtr, NIL)
  }

  @JvmOverloads
  public fun addImage(
    image: Texture2D,
    width: Int = 0,
    height: Int = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to width.toLong(), LONG to height.toLong(), COLOR to color, LONG to inlineAlign.id, RECT2 to region)
    TransferContext.callMethod(rawPtr, MethodBindings.addImagePtr, NIL)
  }

  public fun newline() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.newlinePtr, NIL)
  }

  public fun removeParagraph(paragraph: Int): Boolean {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeParagraphPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun pushFont(font: Font, fontSize: Int) {
    TransferContext.writeArguments(OBJECT to font, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushFontPtr, NIL)
  }

  public fun pushFontSize(fontSize: Int) {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushFontSizePtr, NIL)
  }

  public fun pushNormal() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushNormalPtr, NIL)
  }

  public fun pushBold() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushBoldPtr, NIL)
  }

  public fun pushBoldItalics() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushBoldItalicsPtr, NIL)
  }

  public fun pushItalics() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushItalicsPtr, NIL)
  }

  public fun pushMono() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushMonoPtr, NIL)
  }

  public fun pushColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.pushColorPtr, NIL)
  }

  public fun pushOutlineSize(outlineSize: Int) {
    TransferContext.writeArguments(LONG to outlineSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushOutlineSizePtr, NIL)
  }

  public fun pushOutlineColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.pushOutlineColorPtr, NIL)
  }

  @JvmOverloads
  public fun pushParagraph(
    alignment: HorizontalAlignment,
    baseDirection: Control.TextDirection = Control.TextDirection.TEXT_DIRECTION_AUTO,
    language: String = "",
    stParser: TextServer.StructuredTextParser =
        TextServer.StructuredTextParser.STRUCTURED_TEXT_DEFAULT,
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(163),
    tabStops: PackedFloat32Array = PackedFloat32Array(),
  ) {
    TransferContext.writeArguments(LONG to alignment.id, LONG to baseDirection.id, STRING to language, LONG to stParser.id, LONG to justificationFlags.flag, PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.pushParagraphPtr, NIL)
  }

  public fun pushIndent(level: Int) {
    TransferContext.writeArguments(LONG to level.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushIndentPtr, NIL)
  }

  @JvmOverloads
  public fun pushList(
    level: Int,
    type: ListType,
    capitalize: Boolean,
    bullet: String = "•",
  ) {
    TransferContext.writeArguments(LONG to level.toLong(), LONG to type.id, BOOL to capitalize, STRING to bullet)
    TransferContext.callMethod(rawPtr, MethodBindings.pushListPtr, NIL)
  }

  public fun pushMeta(`data`: Any?) {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.pushMetaPtr, NIL)
  }

  public fun pushHint(description: String) {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.pushHintPtr, NIL)
  }

  public fun pushUnderline() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushUnderlinePtr, NIL)
  }

  public fun pushStrikethrough() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushStrikethroughPtr, NIL)
  }

  @JvmOverloads
  public fun pushTable(
    columns: Int,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_TOP_TO,
    alignToRow: Int = -1,
  ) {
    TransferContext.writeArguments(LONG to columns.toLong(), LONG to inlineAlign.id, LONG to alignToRow.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushTablePtr, NIL)
  }

  @JvmOverloads
  public fun pushDropcap(
    string: String,
    font: Font,
    size: Int,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    color: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Int = 0,
    outlineColor: Color = Color(Color(0, 0, 0, 0)),
  ) {
    TransferContext.writeArguments(STRING to string, OBJECT to font, LONG to size.toLong(), RECT2 to dropcapMargins, COLOR to color, LONG to outlineSize.toLong(), COLOR to outlineColor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushDropcapPtr, NIL)
  }

  public fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand, LONG to ratio.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTableColumnExpandPtr, NIL)
  }

  public fun setCellRowBackgroundColor(oddRowBg: Color, evenRowBg: Color) {
    TransferContext.writeArguments(COLOR to oddRowBg, COLOR to evenRowBg)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellRowBackgroundColorPtr, NIL)
  }

  public fun setCellBorderColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellBorderColorPtr, NIL)
  }

  public fun setCellSizeOverride(minSize: Vector2, maxSize: Vector2) {
    TransferContext.writeArguments(VECTOR2 to minSize, VECTOR2 to maxSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellSizeOverridePtr, NIL)
  }

  public fun setCellPadding(padding: Rect2) {
    TransferContext.writeArguments(RECT2 to padding)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPaddingPtr, NIL)
  }

  public fun pushCell() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushCellPtr, NIL)
  }

  public fun pushFgcolor(fgcolor: Color) {
    TransferContext.writeArguments(COLOR to fgcolor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushFgcolorPtr, NIL)
  }

  public fun pushBgcolor(bgcolor: Color) {
    TransferContext.writeArguments(COLOR to bgcolor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushBgcolorPtr, NIL)
  }

  public fun pushCustomfx(effect: RichTextEffect, env: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(OBJECT to effect, DICTIONARY to env)
    TransferContext.callMethod(rawPtr, MethodBindings.pushCustomfxPtr, NIL)
  }

  public fun pop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.popPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public fun scrollToLine(line: Int) {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToLinePtr, NIL)
  }

  public fun scrollToParagraph(paragraph: Int) {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToParagraphPtr, NIL)
  }

  public fun scrollToSelection() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToSelectionPtr, NIL)
  }

  public fun getSelectionFrom(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSelectionTo(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  public fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  public fun parseBbcode(bbcode: String) {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, MethodBindings.parseBbcodePtr, NIL)
  }

  public fun appendText(bbcode: String) {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, MethodBindings.appendTextPtr, NIL)
  }

  public fun isReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCharacterLine(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharacterLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCharacterParagraph(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharacterParagraphPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVisibleParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContentHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContentHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContentWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContentWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineOffset(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getParagraphOffset(paragraph: Int): Float {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getParagraphOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun parseExpressionsForValues(expressions: PackedStringArray): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr, MethodBindings.parseExpressionsForValuesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun installEffect(effect: Any?) {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, MethodBindings.installEffectPtr, NIL)
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

  public enum class ListType(
    id: Long,
  ) {
    LIST_NUMBERS(0),
    LIST_LETTERS(1),
    LIST_ROMAN(2),
    LIST_DOTS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ListType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MenuItems(
    id: Long,
  ) {
    MENU_COPY(0),
    MENU_SELECT_ALL(1),
    MENU_MAX(2),
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

  public companion object

  internal object MethodBindings {
    public val getParsedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_parsed_text")

    public val addTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "add_text")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "set_text")

    public val addImagePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "add_image")

    public val newlinePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "newline")

    public val removeParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "remove_paragraph")

    public val pushFontPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_font")

    public val pushFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_font_size")

    public val pushNormalPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_normal")

    public val pushBoldPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_bold")

    public val pushBoldItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bold_italics")

    public val pushItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_italics")

    public val pushMonoPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_mono")

    public val pushColorPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_color")

    public val pushOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_size")

    public val pushOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_color")

    public val pushParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_paragraph")

    public val pushIndentPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_indent")

    public val pushListPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_list")

    public val pushMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_meta")

    public val pushHintPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_hint")

    public val pushUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_underline")

    public val pushStrikethroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_strikethrough")

    public val pushTablePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_table")

    public val pushDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_dropcap")

    public val setTableColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_table_column_expand")

    public val setCellRowBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_row_background_color")

    public val setCellBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_border_color")

    public val setCellSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_size_override")

    public val setCellPaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_padding")

    public val pushCellPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_cell")

    public val pushFgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_fgcolor")

    public val pushBgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bgcolor")

    public val pushCustomfxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_customfx")

    public val popPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "pop")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "clear")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override_options")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_text_direction")

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_language")

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_language")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_autowrap_mode")

    public val setMetaUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_meta_underline")

    public val isMetaUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_meta_underlined")

    public val setHintUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_hint_underline")

    public val isHintUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_hint_underlined")

    public val setScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_active")

    public val isScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_active")

    public val setScrollFollowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_follow")

    public val isScrollFollowingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_following")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_v_scroll_bar")

    public val scrollToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_line")

    public val scrollToParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_paragraph")

    public val scrollToSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_selection")

    public val setTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_tab_size")

    public val getTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_tab_size")

    public val setFitContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_fit_content")

    public val isFitContentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_fit_content_enabled")

    public val setSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_selection_enabled")

    public val isSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_selection_enabled")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_context_menu_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_shortcut_keys_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_deselect_on_focus_loss_enabled")

    public val getSelectionFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_from")

    public val getSelectionToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_to")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "select_all")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selected_text")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "deselect")

    public val parseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_bbcode")

    public val appendTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "append_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_text")

    public val isReadyPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "is_ready")

    public val setThreadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_threaded")

    public val isThreadedPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "is_threaded")

    public val setProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_progress_bar_delay")

    public val getProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_progress_bar_delay")

    public val setVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters")

    public val getVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters")

    public val getVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters_behavior")

    public val setVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters_behavior")

    public val setVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_ratio")

    public val getVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_ratio")

    public val getCharacterLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_line")

    public val getCharacterParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_paragraph")

    public val getTotalCharacterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_total_character_count")

    public val setUseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_use_bbcode")

    public val isUsingBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_using_bbcode")

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_count")

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_line_count")

    public val getParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_count")

    public val getVisibleParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_paragraph_count")

    public val getContentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_height")

    public val getContentWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_width")

    public val getLineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_offset")

    public val getParagraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_offset")

    public val parseExpressionsForValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_expressions_for_values")

    public val setEffectsPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "set_effects")

    public val getEffectsPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_effects")

    public val installEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "install_effect")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_menu_visible")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "menu_option")
  }
}
