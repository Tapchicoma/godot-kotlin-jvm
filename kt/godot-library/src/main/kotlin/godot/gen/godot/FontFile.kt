// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
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
import kotlin.jvm.JvmName

@GodotBaseType
public open class FontFile : Font() {
  public var `data`: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
    }

  public var generateMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGenerateMipmapsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGenerateMipmapsPtr, NIL)
    }

  public var antialiasing: TextServer.FontAntialiasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAntialiasingPtr, LONG)
      return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntialiasingPtr, NIL)
    }

  public var fontName: String
    @JvmName("getFontName_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontName()
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontNamePtr, NIL)
    }

  public var styleName: String
    @JvmName("getFontStyleName_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStyleName()
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStyleNamePtr, NIL)
    }

  public var fontStyle: TextServer.FontStyle
    @JvmName("getFontStyle_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStyle()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStylePtr, NIL)
    }

  public var fontWeight: Int
    @JvmName("getFontWeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontWeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontWeightPtr, NIL)
    }

  public var fontStretch: Int
    @JvmName("getFontStretch_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStretch()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontStretchPtr, NIL)
    }

  public var subpixelPositioning: TextServer.SubpixelPositioning
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubpixelPositioningPtr, LONG)
      return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubpixelPositioningPtr, NIL)
    }

  public var multichannelSignedDistanceField: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultichannelSignedDistanceFieldPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultichannelSignedDistanceFieldPtr, NIL)
    }

  public var msdfPixelRange: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfPixelRangePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfPixelRangePtr, NIL)
    }

  public var msdfSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfSizePtr, NIL)
    }

  public var allowSystemFallback: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowSystemFallbackPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowSystemFallbackPtr, NIL)
    }

  public var forceAutohinter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isForceAutohinterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setForceAutohinterPtr, NIL)
    }

  public var hinting: TextServer.Hinting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHintingPtr, LONG)
      return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHintingPtr, NIL)
    }

  public var oversampling: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOversamplingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOversamplingPtr, NIL)
    }

  public var fixedSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedSizePtr, NIL)
    }

  public var opentypeFeatureOverrides: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpentypeFeatureOverridesPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpentypeFeatureOverridesPtr, NIL)
    }

  public var fallbacks: VariantArray<Font>
    @JvmName("getFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFallbacks()
    @JvmName("setFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    set(`value`) {
      super.setFallbacks(value)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONTFILE, scriptIndex)
    return true
  }

  public fun loadBitmapFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBitmapFontPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadDynamicFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadDynamicFontPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getCacheCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun clearCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachePtr, NIL)
  }

  public fun removeCache(cacheIndex: Int) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCachePtr, NIL)
  }

  public fun getSizeCacheList(cacheIndex: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSizeCacheListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public fun clearSizeCache(cacheIndex: Int) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSizeCachePtr, NIL)
  }

  public fun removeSizeCache(cacheIndex: Int, size: Vector2i) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSizeCachePtr, NIL)
  }

  public fun setVariationCoordinates(cacheIndex: Int,
      variationCoordinates: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, MethodBindings.setVariationCoordinatesPtr, NIL)
  }

  public fun getVariationCoordinates(cacheIndex: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVariationCoordinatesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun setEmbolden(cacheIndex: Int, strength: Float) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEmboldenPtr, NIL)
  }

  public fun getEmbolden(cacheIndex: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEmboldenPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setTransform(cacheIndex: Int, transform: Transform2D) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  public fun getTransform(cacheIndex: Int): Transform2D {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun setFaceIndex(cacheIndex: Int, faceIndex: Long) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to faceIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.setFaceIndexPtr, NIL)
  }

  public fun getFaceIndex(cacheIndex: Int): Long {
    TransferContext.writeArguments(LONG to cacheIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setCacheAscent(
    cacheIndex: Int,
    size: Int,
    ascent: Float,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to ascent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheAscentPtr, NIL)
  }

  public fun getCacheAscent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCacheDescent(
    cacheIndex: Int,
    size: Int,
    descent: Float,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to descent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheDescentPtr, NIL)
  }

  public fun getCacheDescent(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCacheUnderlinePosition(
    cacheIndex: Int,
    size: Int,
    underlinePosition: Float,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to underlinePosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheUnderlinePositionPtr, NIL)
  }

  public fun getCacheUnderlinePosition(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCacheUnderlineThickness(
    cacheIndex: Int,
    size: Int,
    underlineThickness: Float,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to underlineThickness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheUnderlineThicknessPtr, NIL)
  }

  public fun getCacheUnderlineThickness(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCacheScale(
    cacheIndex: Int,
    size: Int,
    scale: Float,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCacheScalePtr, NIL)
  }

  public fun getCacheScale(cacheIndex: Int, size: Int): Float {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getTextureCount(cacheIndex: Int, size: Vector2i): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun clearTextures(cacheIndex: Int, size: Vector2i) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearTexturesPtr, NIL)
  }

  public fun removeTexture(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTexturePtr, NIL)
  }

  public fun setTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
    image: Image,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong(), OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureImagePtr, NIL)
  }

  public fun getTextureImage(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): Image? {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun setTextureOffsets(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
    offset: PackedInt32Array,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong(), PACKED_INT_32_ARRAY to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureOffsetsPtr, NIL)
  }

  public fun getTextureOffsets(
    cacheIndex: Int,
    size: Vector2i,
    textureIndex: Int,
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to textureIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureOffsetsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getGlyphList(cacheIndex: Int, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun clearGlyphs(cacheIndex: Int, size: Vector2i) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.clearGlyphsPtr, NIL)
  }

  public fun removeGlyph(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeGlyphPtr, NIL)
  }

  public fun setGlyphAdvance(
    cacheIndex: Int,
    size: Int,
    glyph: Int,
    advance: Vector2,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), LONG to glyph.toLong(), VECTOR2 to advance)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphAdvancePtr, NIL)
  }

  public fun getGlyphAdvance(
    cacheIndex: Int,
    size: Int,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphAdvancePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setGlyphOffset(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    offset: Vector2,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphOffsetPtr, NIL)
  }

  public fun getGlyphOffset(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setGlyphSize(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    glSize: Vector2,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), VECTOR2 to glSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphSizePtr, NIL)
  }

  public fun getGlyphSize(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setGlyphUvRect(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    uvRect: Rect2,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), RECT2 to uvRect)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphUvRectPtr, NIL)
  }

  public fun getGlyphUvRect(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Rect2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphUvRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setGlyphTextureIdx(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
    textureIdx: Int,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong(), LONG to textureIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setGlyphTextureIdxPtr, NIL)
  }

  public fun getGlyphTextureIdx(
    cacheIndex: Int,
    size: Vector2i,
    glyph: Int,
  ): Int {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to glyph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphTextureIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getKerningList(cacheIndex: Int, size: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public fun clearKerningMap(cacheIndex: Int, size: Int) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearKerningMapPtr, NIL)
  }

  public fun removeKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, MethodBindings.removeKerningPtr, NIL)
  }

  public fun setKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
    kerning: Vector2,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair, VECTOR2 to kerning)
    TransferContext.callMethod(rawPtr, MethodBindings.setKerningPtr, NIL)
  }

  public fun getKerning(
    cacheIndex: Int,
    size: Int,
    glyphPair: Vector2i,
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), LONG to size.toLong(), VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, MethodBindings.getKerningPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun renderRange(
    cacheIndex: Int,
    size: Vector2i,
    start: Long,
    end: Long,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr, MethodBindings.renderRangePtr, NIL)
  }

  public fun renderGlyph(
    cacheIndex: Int,
    size: Vector2i,
    index: Int,
  ) {
    TransferContext.writeArguments(LONG to cacheIndex.toLong(), VECTOR2I to size, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.renderGlyphPtr, NIL)
  }

  public fun setLanguageSupportOverride(language: String, supported: Boolean) {
    TransferContext.writeArguments(STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguageSupportOverridePtr, NIL)
  }

  public fun getLanguageSupportOverride(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeLanguageSupportOverride(language: String) {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.removeLanguageSupportOverridePtr, NIL)
  }

  public fun getLanguageSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setScriptSupportOverride(script: String, supported: Boolean) {
    TransferContext.writeArguments(STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr, MethodBindings.setScriptSupportOverridePtr, NIL)
  }

  public fun getScriptSupportOverride(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeScriptSupportOverride(script: String) {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.removeScriptSupportOverridePtr, NIL)
  }

  public fun getScriptSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getGlyphIndex(
    size: Int,
    char: Long,
    variationSelector: Long,
  ): Int {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to char, LONG to variationSelector)
    TransferContext.callMethod(rawPtr, MethodBindings.getGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCharFromGlyphIndex(size: Int, glyphIndex: Int): Long {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to glyphIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharFromGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val loadBitmapFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_bitmap_font")

    public val loadDynamicFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "load_dynamic_font")

    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_data")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_data")

    public val setFontNamePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_font_name")

    public val setFontStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_style_name")

    public val setFontStylePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_font_style")

    public val setFontWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_weight")

    public val setFontStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_font_stretch")

    public val setAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_antialiasing")

    public val getAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_antialiasing")

    public val setGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_generate_mipmaps")

    public val getGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_generate_mipmaps")

    public val setMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_multichannel_signed_distance_field")

    public val isMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_multichannel_signed_distance_field")

    public val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_msdf_pixel_range")

    public val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_msdf_pixel_range")

    public val setMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_msdf_size")

    public val getMsdfSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_msdf_size")

    public val setFixedSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_fixed_size")

    public val getFixedSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_fixed_size")

    public val setAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_allow_system_fallback")

    public val isAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_allow_system_fallback")

    public val setForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_force_autohinter")

    public val isForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "is_force_autohinter")

    public val setHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_hinting")

    public val getHintingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_hinting")

    public val setSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_subpixel_positioning")

    public val getSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_subpixel_positioning")

    public val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_oversampling")

    public val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_oversampling")

    public val getCacheCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_count")

    public val clearCachePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "clear_cache")

    public val removeCachePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "remove_cache")

    public val getSizeCacheListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_size_cache_list")

    public val clearSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_size_cache")

    public val removeSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_size_cache")

    public val setVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_variation_coordinates")

    public val getVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_variation_coordinates")

    public val setEmboldenPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_embolden")

    public val getEmboldenPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_embolden")

    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_transform")

    public val getTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_transform")

    public val setFaceIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_face_index")

    public val getFaceIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_face_index")

    public val setCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_ascent")

    public val getCacheAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_ascent")

    public val setCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_descent")

    public val getCacheDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_descent")

    public val setCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_position")

    public val getCacheUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_position")

    public val setCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_underline_thickness")

    public val getCacheUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_underline_thickness")

    public val setCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_cache_scale")

    public val getCacheScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_cache_scale")

    public val getTextureCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_count")

    public val clearTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_textures")

    public val removeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_texture")

    public val setTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_image")

    public val getTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_image")

    public val setTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_texture_offsets")

    public val getTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_texture_offsets")

    public val getGlyphListPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_glyph_list")

    public val clearGlyphsPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "clear_glyphs")

    public val removeGlyphPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "remove_glyph")

    public val setGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_advance")

    public val getGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_advance")

    public val setGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_offset")

    public val getGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_offset")

    public val setGlyphSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_glyph_size")

    public val getGlyphSizePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_glyph_size")

    public val setGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_uv_rect")

    public val getGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_uv_rect")

    public val setGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_glyph_texture_idx")

    public val getGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_texture_idx")

    public val getKerningListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_kerning_list")

    public val clearKerningMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "clear_kerning_map")

    public val removeKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_kerning")

    public val setKerningPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "set_kerning")

    public val getKerningPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "get_kerning")

    public val renderRangePtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "render_range")

    public val renderGlyphPtr: VoidPtr = TypeManager.getMethodBindPtr("FontFile", "render_glyph")

    public val setLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_language_support_override")

    public val getLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_override")

    public val removeLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_language_support_override")

    public val getLanguageSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_language_support_overrides")

    public val setScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_script_support_override")

    public val getScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_override")

    public val removeScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "remove_script_support_override")

    public val getScriptSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_script_support_overrides")

    public val setOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "set_opentype_feature_overrides")

    public val getOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_opentype_feature_overrides")

    public val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_glyph_index")

    public val getCharFromGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontFile", "get_char_from_glyph_index")
  }
}
