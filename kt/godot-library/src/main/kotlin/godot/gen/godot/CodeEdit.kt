// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class CodeEdit : TextEdit() {
  public val breakpointToggled: Signal1<Long> by signal("line")

  public val codeCompletionRequested: Signal0 by signal()

  public val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "line", "column")

  public val symbolValidate: Signal1<String> by signal("symbol")

  public var symbolLookupOnClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSymbolLookupOnClickEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSymbolLookupOnClickEnabledPtr, NIL)
    }

  public var lineFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLineFoldingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineFoldingEnabledPtr, NIL)
    }

  public var lineLengthGuidelines: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineLengthGuidelinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineLengthGuidelinesPtr, NIL)
    }

  public var guttersDrawBreakpointsGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingBreakpointsGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawBreakpointsGutterPtr, NIL)
    }

  public var guttersDrawBookmarks: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingBookmarksGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawBookmarksGutterPtr, NIL)
    }

  public var guttersDrawExecutingLines: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingExecutingLinesGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawExecutingLinesGutterPtr, NIL)
    }

  public var guttersDrawLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawLineNumbersEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawLineNumbersPtr, NIL)
    }

  public var guttersZeroPadLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLineNumbersZeroPaddedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineNumbersZeroPaddedPtr, NIL)
    }

  public var guttersDrawFoldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingFoldGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFoldGutterPtr, NIL)
    }

  public var delimiterStrings: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStringDelimitersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStringDelimitersPtr, NIL)
    }

  public var delimiterComments: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCommentDelimitersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommentDelimitersPtr, NIL)
    }

  public var codeCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCodeCompletionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionEnabledPtr, NIL)
    }

  public var codeCompletionPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionPrefixesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionPrefixesPtr, NIL)
    }

  public var indentSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndentSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setIndentSizePtr, NIL)
    }

  public var indentUseSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIndentUsingSpacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndentUsingSpacesPtr, NIL)
    }

  public var indentAutomatic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoIndentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoIndentEnabledPtr, NIL)
    }

  public var indentAutomaticPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoIndentPrefixesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoIndentPrefixesPtr, NIL)
    }

  public var autoBraceCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoBraceCompletionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionEnabledPtr, NIL)
    }

  public var autoBraceCompletionHighlightMatching: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightMatchingBracesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightMatchingBracesEnabledPtr, NIL)
    }

  public var autoBraceCompletionPairs: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionPairsPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionPairsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CODEEDIT, scriptIndex)
    return true
  }

  public open fun _confirmCodeCompletion(replace: Boolean) {
  }

  public open fun _requestCodeCompletion(force: Boolean) {
  }

  public open fun _filterCodeCompletionCandidates(candidates: VariantArray<Dictionary<Any?, Any?>>):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_filter_code_completion_candidates is not implemented for CodeEdit")
  }

  public fun doIndent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.doIndentPtr, NIL)
  }

  public fun indentLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.indentLinesPtr, NIL)
  }

  public fun unindentLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unindentLinesPtr, NIL)
  }

  @JvmOverloads
  public fun convertIndent(fromLine: Int = -1, toLine: Int = -1) {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.convertIndentPtr, NIL)
  }

  public fun addAutoBraceCompletionPair(startKey: String, endKey: String) {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey)
    TransferContext.callMethod(rawPtr, MethodBindings.addAutoBraceCompletionPairPtr, NIL)
  }

  public fun hasAutoBraceCompletionOpenKey(openKey: String): Boolean {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionOpenKeyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasAutoBraceCompletionCloseKey(closeKey: String): Boolean {
    TransferContext.writeArguments(STRING to closeKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionCloseKeyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAutoBraceCompletionCloseKey(openKey: String): String {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionCloseKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setLineAsBreakpoint(line: Int, breakpointed: Boolean) {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to breakpointed)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsBreakpointPtr, NIL)
  }

  public fun isLineBreakpointed(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineBreakpointedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearBreakpointedLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBreakpointedLinesPtr, NIL)
  }

  public fun getBreakpointedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBreakpointedLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setLineAsBookmarked(line: Int, bookmarked: Boolean) {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to bookmarked)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsBookmarkedPtr, NIL)
  }

  public fun isLineBookmarked(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineBookmarkedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearBookmarkedLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBookmarkedLinesPtr, NIL)
  }

  public fun getBookmarkedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBookmarkedLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setLineAsExecuting(line: Int, executing: Boolean) {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to executing)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsExecutingPtr, NIL)
  }

  public fun isLineExecuting(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineExecutingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearExecutingLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExecutingLinesPtr, NIL)
  }

  public fun getExecutingLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExecutingLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun canFoldLine(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canFoldLinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun foldLine(line: Int) {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.foldLinePtr, NIL)
  }

  public fun unfoldLine(line: Int) {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.unfoldLinePtr, NIL)
  }

  public fun foldAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.foldAllLinesPtr, NIL)
  }

  public fun unfoldAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unfoldAllLinesPtr, NIL)
  }

  public fun toggleFoldableLine(line: Int) {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleFoldableLinePtr, NIL)
  }

  public fun isLineFolded(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineFoldedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getFoldedLines(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFoldedLinesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
  }

  @JvmOverloads
  public fun addStringDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.addStringDelimiterPtr, NIL)
  }

  public fun removeStringDelimiter(startKey: String) {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeStringDelimiterPtr, NIL)
  }

  public fun hasStringDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasStringDelimiterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearStringDelimiters() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearStringDelimitersPtr, NIL)
  }

  @JvmOverloads
  public fun isInString(line: Int, column: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInStringPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addCommentDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.addCommentDelimiterPtr, NIL)
  }

  public fun removeCommentDelimiter(startKey: String) {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCommentDelimiterPtr, NIL)
  }

  public fun hasCommentDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCommentDelimiterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearCommentDelimiters() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCommentDelimitersPtr, NIL)
  }

  @JvmOverloads
  public fun isInComment(line: Int, column: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInCommentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getDelimiterStartKey(delimiterIndex: Int): String {
    TransferContext.writeArguments(LONG to delimiterIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterStartKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDelimiterEndKey(delimiterIndex: Int): String {
    TransferContext.writeArguments(LONG to delimiterIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterEndKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDelimiterStartPosition(line: Int, column: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterStartPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getDelimiterEndPosition(line: Int, column: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterEndPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setCodeHint(codeHint: String) {
    TransferContext.writeArguments(STRING to codeHint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeHintPtr, NIL)
  }

  public fun setCodeHintDrawBelow(drawBelow: Boolean) {
    TransferContext.writeArguments(BOOL to drawBelow)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeHintDrawBelowPtr, NIL)
  }

  public fun getTextForCodeCompletion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextForCodeCompletionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun requestCodeCompletion(force: Boolean = false) {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.requestCodeCompletionPtr, NIL)
  }

  @JvmOverloads
  public fun addCodeCompletionOption(
    type: CodeCompletionKind,
    displayText: String,
    insertText: String,
    textColor: Color = Color(Color(1, 1, 1, 1)),
    icon: Resource? = null,
    `value`: Any? = 0,
    location: Int = 1024,
  ) {
    TransferContext.writeArguments(LONG to type.id, STRING to displayText, STRING to insertText, COLOR to textColor, OBJECT to icon, ANY to value, LONG to location.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCodeCompletionOptionPtr, NIL)
  }

  public fun updateCodeCompletionOptions(force: Boolean) {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.updateCodeCompletionOptionsPtr, NIL)
  }

  public fun getCodeCompletionOptions(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getCodeCompletionOption(index: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getCodeCompletionSelectedIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionSelectedIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setCodeCompletionSelectedIndex(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionSelectedIndexPtr, NIL)
  }

  @JvmOverloads
  public fun confirmCodeCompletion(replace: Boolean = false) {
    TransferContext.writeArguments(BOOL to replace)
    TransferContext.callMethod(rawPtr, MethodBindings.confirmCodeCompletionPtr, NIL)
  }

  public fun cancelCodeCompletion() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cancelCodeCompletionPtr, NIL)
  }

  public fun getTextForSymbolLookup(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextForSymbolLookupPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setSymbolLookupWordAsValid(valid: Boolean) {
    TransferContext.writeArguments(BOOL to valid)
    TransferContext.callMethod(rawPtr, MethodBindings.setSymbolLookupWordAsValidPtr, NIL)
  }

  public enum class CodeCompletionKind(
    id: Long,
  ) {
    KIND_CLASS(0),
    KIND_FUNCTION(1),
    KIND_SIGNAL(2),
    KIND_VARIABLE(3),
    KIND_MEMBER(4),
    KIND_ENUM(5),
    KIND_CONSTANT(6),
    KIND_NODE_PATH(7),
    KIND_FILE_PATH(8),
    KIND_PLAIN_TEXT(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionKind = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CodeCompletionLocation(
    id: Long,
  ) {
    LOCATION_LOCAL(0),
    LOCATION_PARENT_MASK(256),
    LOCATION_OTHER_USER_CODE(512),
    LOCATION_OTHER(1_024),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionLocation = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _confirmCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "_confirm_code_completion")

    public val _requestCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "_request_code_completion")

    public val _filterCodeCompletionCandidatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "_filter_code_completion_candidates")

    public val setIndentSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_indent_size")

    public val getIndentSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_indent_size")

    public val setIndentUsingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_indent_using_spaces")

    public val isIndentUsingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_indent_using_spaces")

    public val setAutoIndentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_indent_enabled")

    public val isAutoIndentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_auto_indent_enabled")

    public val setAutoIndentPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_indent_prefixes")

    public val getAutoIndentPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_indent_prefixes")

    public val doIndentPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "do_indent")

    public val indentLinesPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "indent_lines")

    public val unindentLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "unindent_lines")

    public val convertIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "convert_indent")

    public val setAutoBraceCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_enabled")

    public val isAutoBraceCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_auto_brace_completion_enabled")

    public val setHighlightMatchingBracesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_highlight_matching_braces_enabled")

    public val isHighlightMatchingBracesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_highlight_matching_braces_enabled")

    public val addAutoBraceCompletionPairPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_auto_brace_completion_pair")

    public val setAutoBraceCompletionPairsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_pairs")

    public val getAutoBraceCompletionPairsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_pairs")

    public val hasAutoBraceCompletionOpenKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_open_key")

    public val hasAutoBraceCompletionCloseKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_close_key")

    public val getAutoBraceCompletionCloseKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_close_key")

    public val setDrawBreakpointsGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_breakpoints_gutter")

    public val isDrawingBreakpointsGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_breakpoints_gutter")

    public val setDrawBookmarksGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_bookmarks_gutter")

    public val isDrawingBookmarksGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_bookmarks_gutter")

    public val setDrawExecutingLinesGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_executing_lines_gutter")

    public val isDrawingExecutingLinesGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_executing_lines_gutter")

    public val setLineAsBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_breakpoint")

    public val isLineBreakpointedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_breakpointed")

    public val clearBreakpointedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_breakpointed_lines")

    public val getBreakpointedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_breakpointed_lines")

    public val setLineAsBookmarkedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_bookmarked")

    public val isLineBookmarkedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_bookmarked")

    public val clearBookmarkedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_bookmarked_lines")

    public val getBookmarkedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_bookmarked_lines")

    public val setLineAsExecutingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_executing")

    public val isLineExecutingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_executing")

    public val clearExecutingLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_executing_lines")

    public val getExecutingLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_executing_lines")

    public val setDrawLineNumbersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_line_numbers")

    public val isDrawLineNumbersEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_draw_line_numbers_enabled")

    public val setLineNumbersZeroPaddedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_numbers_zero_padded")

    public val isLineNumbersZeroPaddedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_numbers_zero_padded")

    public val setDrawFoldGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_fold_gutter")

    public val isDrawingFoldGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_fold_gutter")

    public val setLineFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_folding_enabled")

    public val isLineFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_folding_enabled")

    public val canFoldLinePtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "can_fold_line")

    public val foldLinePtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "fold_line")

    public val unfoldLinePtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "unfold_line")

    public val foldAllLinesPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "fold_all_lines")

    public val unfoldAllLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "unfold_all_lines")

    public val toggleFoldableLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "toggle_foldable_line")

    public val isLineFoldedPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "is_line_folded")

    public val getFoldedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_folded_lines")

    public val addStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_string_delimiter")

    public val removeStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "remove_string_delimiter")

    public val hasStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_string_delimiter")

    public val setStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_string_delimiters")

    public val clearStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_string_delimiters")

    public val getStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_string_delimiters")

    public val isInStringPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "is_in_string")

    public val addCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_comment_delimiter")

    public val removeCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "remove_comment_delimiter")

    public val hasCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_comment_delimiter")

    public val setCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_comment_delimiters")

    public val clearCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_comment_delimiters")

    public val getCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_comment_delimiters")

    public val isInCommentPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "is_in_comment")

    public val getDelimiterStartKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_start_key")

    public val getDelimiterEndKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_end_key")

    public val getDelimiterStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_start_position")

    public val getDelimiterEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_end_position")

    public val setCodeHintPtr: VoidPtr = TypeManager.getMethodBindPtr("CodeEdit", "set_code_hint")

    public val setCodeHintDrawBelowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_hint_draw_below")

    public val getTextForCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_text_for_code_completion")

    public val requestCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "request_code_completion")

    public val addCodeCompletionOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_code_completion_option")

    public val updateCodeCompletionOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "update_code_completion_options")

    public val getCodeCompletionOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_options")

    public val getCodeCompletionOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_option")

    public val getCodeCompletionSelectedIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_selected_index")

    public val setCodeCompletionSelectedIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_selected_index")

    public val confirmCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "confirm_code_completion")

    public val cancelCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "cancel_code_completion")

    public val setCodeCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_enabled")

    public val isCodeCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_code_completion_enabled")

    public val setCodeCompletionPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_prefixes")

    public val getCodeCompletionPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_prefixes")

    public val setLineLengthGuidelinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_length_guidelines")

    public val getLineLengthGuidelinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_line_length_guidelines")

    public val setSymbolLookupOnClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_symbol_lookup_on_click_enabled")

    public val isSymbolLookupOnClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_symbol_lookup_on_click_enabled")

    public val getTextForSymbolLookupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_text_for_symbol_lookup")

    public val setSymbolLookupWordAsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_symbol_lookup_word_as_valid")
  }
}
