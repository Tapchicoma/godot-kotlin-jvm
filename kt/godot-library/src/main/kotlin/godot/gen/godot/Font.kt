// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.FontStyleValue
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
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
public open class Font internal constructor() : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONT, scriptIndex)
    return true
  }

  public fun setFallbacks(fallbacks: VariantArray<Font>) {
    TransferContext.writeArguments(ARRAY to fallbacks)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbacksPtr, NIL)
  }

  public fun getFallbacks(): VariantArray<Font> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbacksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Font>)
  }

  @JvmOverloads
  public fun findVariation(
    variationCoordinates: Dictionary<Any?, Any?>,
    faceIndex: Int = 0,
    strength: Float = 0.0f,
    transform: Transform2D = Transform2D(),
  ): RID {
    TransferContext.writeArguments(DICTIONARY to variationCoordinates, LONG to faceIndex.toLong(), DOUBLE to strength.toDouble(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.findVariationPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getRids(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  @JvmOverloads
  public fun getHeight(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getAscent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getDescent(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getUnderlinePosition(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getUnderlineThickness(fontSize: Int = 16): Float {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getFontName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getFontStyleName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStyleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getOtNameStrings(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOtNameStringsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getFontStyle(): TextServer.FontStyle {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStylePtr, LONG)
    return FontStyleValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getFontWeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontWeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFontStretch(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontStretchPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSpacing(spacing: TextServer.SpacingType): Int {
    TransferContext.writeArguments(LONG to spacing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getOpentypeFeatures(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeaturesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun setCacheCapacity(singleLine: Int, multiLine: Int) {
    TransferContext.writeArguments(LONG to singleLine.toLong(), LONG to multiLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheCapacityPtr, NIL)
  }

  @JvmOverloads
  public fun getStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getStringSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun getMultilineStringSize(
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Vector2 {
    TransferContext.writeArguments(STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMultilineStringSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun drawString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringPtr, NIL)
  }

  @JvmOverloads
  public fun drawMultilineString(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringPtr, NIL)
  }

  @JvmOverloads
  public fun drawStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawMultilineStringOutline(
    canvasItem: RID,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringOutlinePtr, NIL)
  }

  public fun getCharSize(char: Long, fontSize: Int): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun drawChar(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun drawCharOutline(
    canvasItem: RID,
    pos: Vector2,
    char: Long,
    fontSize: Int,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Float {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to pos, LONG to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharOutlinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCharPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedCharsPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isLanguageSupported(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.isLanguageSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isScriptSupported(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.isScriptSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSupportedFeatureList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedFeatureListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getSupportedVariationList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedVariationListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setFallbacksPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "set_fallbacks")

    public val getFallbacksPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_fallbacks")

    public val findVariationPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "find_variation")

    public val getRidsPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_rids")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_height")

    public val getAscentPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_ascent")

    public val getDescentPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_descent")

    public val getUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_position")

    public val getUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_underline_thickness")

    public val getFontNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_name")

    public val getFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_font_style_name")

    public val getOtNameStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_ot_name_strings")

    public val getFontStylePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_style")

    public val getFontWeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_weight")

    public val getFontStretchPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_font_stretch")

    public val getSpacingPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_spacing")

    public val getOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_opentype_features")

    public val setCacheCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "set_cache_capacity")

    public val getStringSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_string_size")

    public val getMultilineStringSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_multiline_string_size")

    public val drawStringPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "draw_string")

    public val drawMultilineStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string")

    public val drawStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_string_outline")

    public val drawMultilineStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_multiline_string_outline")

    public val getCharSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_char_size")

    public val drawCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "draw_char")

    public val drawCharOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "draw_char_outline")

    public val hasCharPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "has_char")

    public val getSupportedCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_chars")

    public val isLanguageSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_language_supported")

    public val isScriptSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "is_script_supported")

    public val getSupportedFeatureListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_feature_list")

    public val getSupportedVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Font", "get_supported_variation_list")

    public val getFaceCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Font", "get_face_count")
  }
}
