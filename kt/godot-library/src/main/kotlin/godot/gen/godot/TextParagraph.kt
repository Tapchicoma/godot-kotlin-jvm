// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.TextServer.LineBreakFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
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
public open class TextParagraph : RefCounted() {
  public var direction: TextServer.Direction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  public var customPunctuation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomPunctuationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomPunctuationPtr, NIL)
    }

  public var orientation: TextServer.Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
      return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
    }

  public var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveInvalidPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveInvalidPtr, NIL)
    }

  public var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveControlPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveControlPtr, NIL)
    }

  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
    }

  public var breakFlags: TextServer.LineBreakFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBreakFlagsPtr, LONG)
      return LineBreakFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setBreakFlagsPtr, NIL)
    }

  public var justificationFlags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
    }

  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var maxLinesVisible: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTPARAGRAPH, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun setBidiOverride(`override`: VariantArray<Any?>) {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
  }

  @JvmOverloads
  public fun setDropcap(
    text: String,
    font: Font,
    fontSize: Int,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    language: String = "",
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), RECT2 to dropcapMargins, STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setDropcapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearDropcap() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDropcapPtr, NIL)
  }

  @JvmOverloads
  public fun addString(
    text: String,
    font: Font,
    fontSize: Int,
    language: String = "",
    meta: Any? = null,
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), STRING to language, ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.addStringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Int = 1,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length.toLong(), DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun resizeObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.resizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun tabAlign(tabStops: PackedFloat32Array) {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  public fun getNonWrappedSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNonWrappedSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getLineRid(line: Int): RID {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getDropcapRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineObjects(line: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getLineObjectRect(line: Int, key: Any?): Rect2 {
    TransferContext.writeArguments(LONG to line.toLong(), ANY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getLineSize(line: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getLineRange(line: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getLineAscent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineDescent(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineWidth(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineUnderlinePosition(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineUnderlineThickness(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getDropcapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getDropcapLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDropcapLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  @JvmOverloads
  public fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
    dcColor: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color, COLOR to dcColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawLine(
    canvas: RID,
    pos: Vector2,
    line: Int,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLinePtr, NIL)
  }

  @JvmOverloads
  public fun drawLineOutline(
    canvas: RID,
    pos: Vector2,
    line: Int,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to line.toLong(), LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLineOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawDropcap(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawDropcapPtr, NIL)
  }

  @JvmOverloads
  public fun drawDropcapOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawDropcapOutlinePtr, NIL)
  }

  public fun hitTest(coords: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "clear")

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_direction")

    public val setCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_custom_punctuation")

    public val getCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_custom_punctuation")

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_orientation")

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_orientation")

    public val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_invalid")

    public val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_invalid")

    public val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_preserve_control")

    public val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_preserve_control")

    public val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_bidi_override")

    public val setDropcapPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "set_dropcap")

    public val clearDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "clear_dropcap")

    public val addStringPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "add_string")

    public val addObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "add_object")

    public val resizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "resize_object")

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_alignment")

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_alignment")

    public val tabAlignPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "tab_align")

    public val setBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_break_flags")

    public val getBreakFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_break_flags")

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_justification_flags")

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_justification_flags")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_text_overrun_behavior")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_width")

    public val getNonWrappedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_non_wrapped_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_size")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "get_rid")

    public val getLineRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_rid")

    public val getDropcapRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_rid")

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_count")

    public val setMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "set_max_lines_visible")

    public val getMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_max_lines_visible")

    public val getLineObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_objects")

    public val getLineObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_object_rect")

    public val getLineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_size")

    public val getLineRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_range")

    public val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_ascent")

    public val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_descent")

    public val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_width")

    public val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_position")

    public val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_line_underline_thickness")

    public val getDropcapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_size")

    public val getDropcapLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "get_dropcap_lines")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "draw")

    public val drawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_outline")

    public val drawLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "draw_line")

    public val drawLineOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_line_outline")

    public val drawDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap")

    public val drawDropcapOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextParagraph", "draw_dropcap_outline")

    public val hitTestPtr: VoidPtr = TypeManager.getMethodBindPtr("TextParagraph", "hit_test")
  }
}
