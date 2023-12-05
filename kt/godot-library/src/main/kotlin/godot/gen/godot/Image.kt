// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Image : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGE, scriptIndex)
    return true
  }

  public fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getFormat(): Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun convert(format: Format) {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.convertPtr, NIL)
  }

  public fun getMipmapOffset(mipmap: Int): Int {
    TransferContext.writeArguments(LONG to mipmap.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMipmapOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun resizeToPo2(square: Boolean = false, interpolation: Interpolation =
      Image.Interpolation.INTERPOLATE_BILINEAR) {
    TransferContext.writeArguments(BOOL to square, LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resizeToPo2Ptr, NIL)
  }

  @JvmOverloads
  public fun resize(
    width: Int,
    height: Int,
    interpolation: Interpolation = Image.Interpolation.INTERPOLATE_BILINEAR,
  ) {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  public fun shrinkX2() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.shrinkX2Ptr, NIL)
  }

  public fun crop(width: Int, height: Int) {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.cropPtr, NIL)
  }

  public fun flipX() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flipXPtr, NIL)
  }

  public fun flipY() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flipYPtr, NIL)
  }

  @JvmOverloads
  public fun generateMipmaps(renormalize: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(rawPtr, MethodBindings.generateMipmapsPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun clearMipmaps() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearMipmapsPtr, NIL)
  }

  public fun setData(
    width: Int,
    height: Int,
    useMipmaps: Boolean,
    format: Format,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
  }

  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun savePng(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.savePngPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun savePngToBuffer(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.savePngToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  @JvmOverloads
  public fun saveJpg(path: String, quality: Float = 0.75f): GodotError {
    TransferContext.writeArguments(STRING to path, DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveJpgPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun saveJpgToBuffer(quality: Float = 0.75f): PackedByteArray {
    TransferContext.writeArguments(DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveJpgToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  @JvmOverloads
  public fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(rawPtr, MethodBindings.saveExrPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun saveExrToBuffer(grayscale: Boolean = false): PackedByteArray {
    TransferContext.writeArguments(BOOL to grayscale)
    TransferContext.callMethod(rawPtr, MethodBindings.saveExrToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  @JvmOverloads
  public fun saveWebp(
    path: String,
    lossy: Boolean = false,
    quality: Float = 0.75f,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to lossy, DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveWebpPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun saveWebpToBuffer(lossy: Boolean = false, quality: Float = 0.75f): PackedByteArray {
    TransferContext.writeArguments(BOOL to lossy, DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveWebpToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun detectAlpha(): AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.detectAlphaPtr, LONG)
    return Image.AlphaMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInvisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun detectUsedChannels(source: CompressSource =
      Image.CompressSource.COMPRESS_SOURCE_GENERIC): UsedChannels {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(rawPtr, MethodBindings.detectUsedChannelsPtr, LONG)
    return Image.UsedChannels.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun compress(
    mode: CompressMode,
    source: CompressSource = Image.CompressSource.COMPRESS_SOURCE_GENERIC,
    astcFormat: ASTCFormat = Image.ASTCFormat.ASTC_FORMAT_4x4,
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, LONG to source.id, LONG to astcFormat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.compressPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun compressFromChannels(
    mode: CompressMode,
    channels: UsedChannels,
    astcFormat: ASTCFormat = Image.ASTCFormat.ASTC_FORMAT_4x4,
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, LONG to channels.id, LONG to astcFormat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.compressFromChannelsPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun decompress(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.decompressPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCompressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun rotate90(direction: ClockDirection) {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.rotate90Ptr, NIL)
  }

  public fun rotate180() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.rotate180Ptr, NIL)
  }

  public fun fixAlphaEdges() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fixAlphaEdgesPtr, NIL)
  }

  public fun premultiplyAlpha() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.premultiplyAlphaPtr, NIL)
  }

  public fun srgbToLinear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.srgbToLinearPtr, NIL)
  }

  public fun normalMapToXy() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.normalMapToXyPtr, NIL)
  }

  public fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.rgbeToSrgbPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  @JvmOverloads
  public fun bumpMapToNormalMap(bumpScale: Float = 1.0f) {
    TransferContext.writeArguments(DOUBLE to bumpScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bumpMapToNormalMapPtr, NIL)
  }

  public fun computeImageMetrics(comparedImage: Image, useLuma: Boolean): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to comparedImage, BOOL to useLuma)
    TransferContext.callMethod(rawPtr, MethodBindings.computeImageMetricsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun blitRect(
    src: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ) {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blitRectPtr, NIL)
  }

  public fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ) {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blitRectMaskPtr, NIL)
  }

  public fun blendRect(
    src: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ) {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blendRectPtr, NIL)
  }

  public fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ) {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blendRectMaskPtr, NIL)
  }

  public fun fill(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.fillPtr, NIL)
  }

  public fun fillRect(rect: Rect2i, color: Color) {
    TransferContext.writeArguments(RECT2I to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.fillRectPtr, NIL)
  }

  public fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public fun getRegion(region: Rect2i): Image? {
    TransferContext.writeArguments(RECT2I to region)
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun copyFrom(src: Image) {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(rawPtr, MethodBindings.copyFromPtr, NIL)
  }

  public fun getPixelv(point: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getPixelvPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getPixel(x: Int, y: Int): Color {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPixelPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setPixelv(point: Vector2i, color: Color) {
    TransferContext.writeArguments(VECTOR2I to point, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setPixelvPtr, NIL)
  }

  public fun setPixel(
    x: Int,
    y: Int,
    color: Color,
  ) {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setPixelPtr, NIL)
  }

  public fun adjustBcs(
    brightness: Float,
    contrast: Float,
    saturation: Float,
  ) {
    TransferContext.writeArguments(DOUBLE to brightness.toDouble(), DOUBLE to contrast.toDouble(), DOUBLE to saturation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustBcsPtr, NIL)
  }

  public fun loadPngFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPngFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadJpgFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadJpgFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadWebpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadWebpFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadTgaFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadTgaFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadBmpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBmpFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Format(
    id: Long,
  ) {
    FORMAT_L8(0),
    FORMAT_LA8(1),
    FORMAT_R8(2),
    FORMAT_RG8(3),
    FORMAT_RGB8(4),
    FORMAT_RGBA8(5),
    FORMAT_RGBA4444(6),
    FORMAT_RGB565(7),
    FORMAT_RF(8),
    FORMAT_RGF(9),
    FORMAT_RGBF(10),
    FORMAT_RGBAF(11),
    FORMAT_RH(12),
    FORMAT_RGH(13),
    FORMAT_RGBH(14),
    FORMAT_RGBAH(15),
    FORMAT_RGBE9995(16),
    FORMAT_DXT1(17),
    FORMAT_DXT3(18),
    FORMAT_DXT5(19),
    FORMAT_RGTC_R(20),
    FORMAT_RGTC_RG(21),
    FORMAT_BPTC_RGBA(22),
    FORMAT_BPTC_RGBF(23),
    FORMAT_BPTC_RGBFU(24),
    FORMAT_ETC(25),
    FORMAT_ETC2_R11(26),
    FORMAT_ETC2_R11S(27),
    FORMAT_ETC2_RG11(28),
    FORMAT_ETC2_RG11S(29),
    FORMAT_ETC2_RGB8(30),
    FORMAT_ETC2_RGBA8(31),
    FORMAT_ETC2_RGB8A1(32),
    FORMAT_ETC2_RA_AS_RG(33),
    FORMAT_DXT5_RA_AS_RG(34),
    FORMAT_ASTC_4x4(35),
    FORMAT_ASTC_4x4_HDR(36),
    FORMAT_ASTC_8x8(37),
    FORMAT_ASTC_8x8_HDR(38),
    FORMAT_MAX(39),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Format = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Interpolation(
    id: Long,
  ) {
    INTERPOLATE_NEAREST(0),
    INTERPOLATE_BILINEAR(1),
    INTERPOLATE_CUBIC(2),
    INTERPOLATE_TRILINEAR(3),
    INTERPOLATE_LANCZOS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Interpolation = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AlphaMode(
    id: Long,
  ) {
    ALPHA_NONE(0),
    ALPHA_BIT(1),
    ALPHA_BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CompressMode(
    id: Long,
  ) {
    COMPRESS_S3TC(0),
    COMPRESS_ETC(1),
    COMPRESS_ETC2(2),
    COMPRESS_BPTC(3),
    COMPRESS_ASTC(4),
    COMPRESS_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class UsedChannels(
    id: Long,
  ) {
    USED_CHANNELS_L(0),
    USED_CHANNELS_LA(1),
    USED_CHANNELS_R(2),
    USED_CHANNELS_RG(3),
    USED_CHANNELS_RGB(4),
    USED_CHANNELS_RGBA(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UsedChannels = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CompressSource(
    id: Long,
  ) {
    COMPRESS_SOURCE_GENERIC(0),
    COMPRESS_SOURCE_SRGB(1),
    COMPRESS_SOURCE_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressSource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ASTCFormat(
    id: Long,
  ) {
    ASTC_FORMAT_4x4(0),
    ASTC_FORMAT_8x8(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ASTCFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val MAX_WIDTH: Long = 16777216

    public final const val MAX_HEIGHT: Long = 16777216

    public fun create(
      width: Int,
      height: Int,
      useMipmaps: Boolean,
      format: Format,
    ): Image? {
      TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id)
      TransferContext.callMethod(0, MethodBindings.createPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Image?)
    }

    public fun createFromData(
      width: Int,
      height: Int,
      useMipmaps: Boolean,
      format: Format,
      `data`: PackedByteArray,
    ): Image? {
      TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
      TransferContext.callMethod(0, MethodBindings.createFromDataPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Image?)
    }

    public fun loadFromFile(path: String): Image? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Image?)
    }
  }

  internal object MethodBindings {
    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_width")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_height")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_size")

    public val hasMipmapsPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "has_mipmaps")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_format")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_data")

    public val convertPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "convert")

    public val getMipmapOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_mipmap_offset")

    public val resizeToPo2Ptr: VoidPtr = TypeManager.getMethodBindPtr("Image", "resize_to_po2")

    public val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "resize")

    public val shrinkX2Ptr: VoidPtr = TypeManager.getMethodBindPtr("Image", "shrink_x2")

    public val cropPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "crop")

    public val flipXPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "flip_x")

    public val flipYPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "flip_y")

    public val generateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "generate_mipmaps")

    public val clearMipmapsPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "clear_mipmaps")

    public val createPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "create")

    public val createFromDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "create_from_data")

    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "set_data")

    public val isEmptyPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "is_empty")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "load")

    public val loadFromFilePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "load_from_file")

    public val savePngPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_png")

    public val savePngToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_png_to_buffer")

    public val saveJpgPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_jpg")

    public val saveJpgToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_jpg_to_buffer")

    public val saveExrPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_exr")

    public val saveExrToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_exr_to_buffer")

    public val saveWebpPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_webp")

    public val saveWebpToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_webp_to_buffer")

    public val detectAlphaPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "detect_alpha")

    public val isInvisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "is_invisible")

    public val detectUsedChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "detect_used_channels")

    public val compressPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "compress")

    public val compressFromChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "compress_from_channels")

    public val decompressPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "decompress")

    public val isCompressedPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "is_compressed")

    public val rotate90Ptr: VoidPtr = TypeManager.getMethodBindPtr("Image", "rotate_90")

    public val rotate180Ptr: VoidPtr = TypeManager.getMethodBindPtr("Image", "rotate_180")

    public val fixAlphaEdgesPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "fix_alpha_edges")

    public val premultiplyAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "premultiply_alpha")

    public val srgbToLinearPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "srgb_to_linear")

    public val normalMapToXyPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "normal_map_to_xy")

    public val rgbeToSrgbPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "rgbe_to_srgb")

    public val bumpMapToNormalMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "bump_map_to_normal_map")

    public val computeImageMetricsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "compute_image_metrics")

    public val blitRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "blit_rect")

    public val blitRectMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "blit_rect_mask")

    public val blendRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "blend_rect")

    public val blendRectMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "blend_rect_mask")

    public val fillPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "fill")

    public val fillRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "fill_rect")

    public val getUsedRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_used_rect")

    public val getRegionPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_region")

    public val copyFromPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "copy_from")

    public val getPixelvPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_pixelv")

    public val getPixelPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_pixel")

    public val setPixelvPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "set_pixelv")

    public val setPixelPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "set_pixel")

    public val adjustBcsPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "adjust_bcs")

    public val loadPngFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_png_from_buffer")

    public val loadJpgFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_jpg_from_buffer")

    public val loadWebpFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_webp_from_buffer")

    public val loadTgaFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_tga_from_buffer")

    public val loadBmpFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_bmp_from_buffer")
  }
}
