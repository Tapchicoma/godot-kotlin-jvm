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
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Image datatype.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_images.html]($DOCS_URL/tutorials/assets_pipeline/importing_images.html)
 *
 * Native image datatype. Contains image data which can be converted to an [godot.ImageTexture] and provides commonly used *image processing* methods. The maximum width and height for an [godot.Image] are [MAX_WIDTH] and [MAX_HEIGHT].
 *
 * An [godot.Image] cannot be assigned to a `texture` property of an object directly (such as [godot.Sprite2D]), and has to be converted manually to an [godot.ImageTexture] first.
 *
 * **Note:** The maximum image size is 16384×16384 pixels due to graphics hardware limitations. Larger images may fail to import.
 */
@GodotBaseType
public open class Image : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGE, scriptIndex)
    return true
  }

  /**
   * Returns the image's width.
   */
  public fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the image's height.
   */
  public fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the image's size (width and height).
   */
  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns `true` if the image has generated mipmaps.
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the image's format. See [enum Format] constants.
   */
  public fun getFormat(): Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a copy of the image's raw data.
   */
  public fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Converts the image's format. See [enum Format] constants.
   */
  public fun convert(format: Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.convertPtr, NIL)
  }

  /**
   * Returns the offset where the image's mipmap with index [mipmap] is stored in the `data` dictionary.
   */
  public fun getMipmapOffset(mipmap: Int): Int {
    TransferContext.writeArguments(LONG to mipmap.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMipmapOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Resizes the image to the nearest power of 2 for the width and height. If [square] is `true` then set width and height to be the same. New pixels are calculated using the [interpolation] mode defined via [enum Interpolation] constants.
   */
  @JvmOverloads
  public fun resizeToPo2(square: Boolean = false, interpolation: Interpolation =
      Image.Interpolation.INTERPOLATE_BILINEAR): Unit {
    TransferContext.writeArguments(BOOL to square, LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resizeToPo2Ptr, NIL)
  }

  /**
   * Resizes the image to the given [width] and [height]. New pixels are calculated using the [interpolation] mode defined via [enum Interpolation] constants.
   */
  @JvmOverloads
  public fun resize(
    width: Int,
    height: Int,
    interpolation: Interpolation = Image.Interpolation.INTERPOLATE_BILINEAR,
  ): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  /**
   * Shrinks the image by a factor of 2.
   */
  public fun shrinkX2(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.shrinkX2Ptr, NIL)
  }

  /**
   * Crops the image to the given [width] and [height]. If the specified size is larger than the current size, the extra area is filled with black pixels.
   */
  public fun crop(width: Int, height: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.cropPtr, NIL)
  }

  /**
   * Flips the image horizontally.
   */
  public fun flipX(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flipXPtr, NIL)
  }

  /**
   * Flips the image vertically.
   */
  public fun flipY(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flipYPtr, NIL)
  }

  /**
   * Generates mipmaps for the image. Mipmaps are precalculated lower-resolution copies of the image that are automatically used if the image needs to be scaled down when rendered. They help improve image quality and performance when rendering. This method returns an error if the image is compressed, in a custom format, or if the image's width/height is `0`.
   */
  @JvmOverloads
  public fun generateMipmaps(renormalize: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(rawPtr, MethodBindings.generateMipmapsPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the image's mipmaps.
   */
  public fun clearMipmaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearMipmapsPtr, NIL)
  }

  /**
   * Overwrites data of an existing [godot.Image]. Non-static equivalent of [createFromData].
   */
  public fun setData(
    width: Int,
    height: Int,
    useMipmaps: Boolean,
    format: Format,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
  }

  /**
   * Returns `true` if the image has no data.
   */
  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Loads an image from file [path]. See [godot.Supported image formats]($DOCS_URL/tutorials/assets_pipeline/importing_images.html#supported-image-formats) for a list of supported image formats and limitations.
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external images at run-time, such as images located at the `user://` directory, and may not work in exported projects.
   *
   * See also [godot.ImageTexture] description for usage examples.
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a PNG file to the file at [path].
   */
  public fun savePng(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.savePngPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a PNG file to a byte array.
   */
  public fun savePngToBuffer(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.savePngToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Saves the image as a JPEG file to [path] with the specified [quality] between `0.01` and `1.0` (inclusive). Higher [quality] values result in better-looking output at the cost of larger file sizes. Recommended [quality] values are between `0.75` and `0.90`. Even at quality `1.00`, JPEG compression remains lossy.
   *
   * **Note:** JPEG does not save an alpha channel. If the [godot.Image] contains an alpha channel, the image will still be saved, but the resulting JPEG file won't contain the alpha channel.
   */
  @JvmOverloads
  public fun saveJpg(path: String, quality: Float = 0.75f): GodotError {
    TransferContext.writeArguments(STRING to path, DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveJpgPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a JPEG file to a byte array with the specified [quality] between `0.01` and `1.0` (inclusive). Higher [quality] values result in better-looking output at the cost of larger byte array sizes (and therefore memory usage). Recommended [quality] values are between `0.75` and `0.90`. Even at quality `1.00`, JPEG compression remains lossy.
   *
   * **Note:** JPEG does not save an alpha channel. If the [godot.Image] contains an alpha channel, the image will still be saved, but the resulting byte array won't contain the alpha channel.
   */
  @JvmOverloads
  public fun saveJpgToBuffer(quality: Float = 0.75f): PackedByteArray {
    TransferContext.writeArguments(DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveJpgToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Saves the image as an EXR file to [path]. If [grayscale] is `true` and the image has only one channel, it will be saved explicitly as monochrome rather than one red channel. This function will return [ERR_UNAVAILABLE] if Godot was compiled without the TinyEXR module.
   *
   * **Note:** The TinyEXR module is disabled in non-editor builds, which means [saveExr] will return [ERR_UNAVAILABLE] when it is called from an exported project.
   */
  @JvmOverloads
  public fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(rawPtr, MethodBindings.saveExrPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as an EXR file to a byte array. If [grayscale] is `true` and the image has only one channel, it will be saved explicitly as monochrome rather than one red channel. This function will return an empty byte array if Godot was compiled without the TinyEXR module.
   *
   * **Note:** The TinyEXR module is disabled in non-editor builds, which means [saveExr] will return an empty byte array when it is called from an exported project.
   */
  @JvmOverloads
  public fun saveExrToBuffer(grayscale: Boolean = false): PackedByteArray {
    TransferContext.writeArguments(BOOL to grayscale)
    TransferContext.callMethod(rawPtr, MethodBindings.saveExrToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Saves the image as a WebP (Web Picture) file to the file at [path]. By default it will save lossless. If [lossy] is true, the image will be saved lossy, using the [quality] setting between 0.0 and 1.0 (inclusive).
   */
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

  /**
   * Saves the image as a WebP (Web Picture) file to a byte array. By default it will save lossless. If [lossy] is true, the image will be saved lossy, using the [quality] setting between 0.0 and 1.0 (inclusive).
   */
  @JvmOverloads
  public fun saveWebpToBuffer(lossy: Boolean = false, quality: Float = 0.75f): PackedByteArray {
    TransferContext.writeArguments(BOOL to lossy, DOUBLE to quality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.saveWebpToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Returns [ALPHA_BLEND] if the image has data for alpha values. Returns [ALPHA_BIT] if all the alpha values are stored in a single bit. Returns [ALPHA_NONE] if no data for alpha values is found.
   */
  public fun detectAlpha(): AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.detectAlphaPtr, LONG)
    return Image.AlphaMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if all the image's pixels have an alpha value of 0. Returns `false` if any pixel has an alpha value higher than 0.
   */
  public fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInvisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   *
   */
  @JvmOverloads
  public fun detectUsedChannels(source: CompressSource =
      Image.CompressSource.COMPRESS_SOURCE_GENERIC): UsedChannels {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(rawPtr, MethodBindings.detectUsedChannelsPtr, LONG)
    return Image.UsedChannels.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is compressed. Returns error if the chosen compression mode is not available.
   *
   * The [source] parameter helps to pick the best compression method for DXT and ETC2 formats. It is ignored for ASTC compression.
   *
   * For ASTC compression, the [astcFormat] parameter must be supplied.
   */
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

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is compressed. Returns error if the chosen compression mode is not available.
   *
   * This is an alternative to [compress] that lets the user supply the channels used in order for the compressor to pick the best DXT and ETC2 formats. For other formats (non DXT or ETC2), this argument is ignored.
   *
   * For ASTC compression, the [astcFormat] parameter must be supplied.
   */
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

  /**
   * Decompresses the image if it is VRAM compressed in a supported format. Returns [OK] if the format is supported, otherwise [ERR_UNAVAILABLE].
   *
   * **Note:** The following formats can be decompressed: DXT, RGTC, BPTC. The formats ETC1 and ETC2 are not supported.
   */
  public fun decompress(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.decompressPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the image is compressed.
   */
  public fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCompressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Rotates the image in the specified [direction] by `90` degrees. The width and height of the image must be greater than `1`. If the width and height are not equal, the image will be resized.
   */
  public fun rotate90(direction: ClockDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.rotate90Ptr, NIL)
  }

  /**
   * Rotates the image by `180` degrees. The width and height of the image must be greater than `1`.
   */
  public fun rotate180(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.rotate180Ptr, NIL)
  }

  /**
   * Blends low-alpha pixels with nearby pixels.
   */
  public fun fixAlphaEdges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fixAlphaEdgesPtr, NIL)
  }

  /**
   * Multiplies color values with alpha values. Resulting color values for a pixel are `(color * alpha)/256`.
   */
  public fun premultiplyAlpha(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.premultiplyAlphaPtr, NIL)
  }

  /**
   * Converts the raw data from the sRGB colorspace to a linear scale.
   */
  public fun srgbToLinear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.srgbToLinearPtr, NIL)
  }

  /**
   * Converts the image's data to represent coordinates on a 3D plane. This is used when the image represents a normal map. A normal map can add lots of detail to a 3D surface without increasing the polygon count.
   */
  public fun normalMapToXy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.normalMapToXyPtr, NIL)
  }

  /**
   * Converts a standard RGBE (Red Green Blue Exponent) image to an sRGB image.
   */
  public fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.rgbeToSrgbPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Converts a bump map to a normal map. A bump map provides a height offset per-pixel, while a normal map provides a normal direction per pixel.
   */
  @JvmOverloads
  public fun bumpMapToNormalMap(bumpScale: Float = 1.0f): Unit {
    TransferContext.writeArguments(DOUBLE to bumpScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bumpMapToNormalMapPtr, NIL)
  }

  /**
   * Compute image metrics on the current image and the compared image.
   *
   * The dictionary contains `max`, `mean`, `mean_squared`, `root_mean_squared` and `peak_snr`.
   */
  public fun computeImageMetrics(comparedImage: Image, useLuma: Boolean): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to comparedImage, BOOL to useLuma)
    TransferContext.callMethod(rawPtr, MethodBindings.computeImageMetricsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Copies [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly to both image bounds. This image and [src] image **must** have the same format. [srcRect] with non-positive size is treated as empty.
   */
  public fun blitRect(
    src: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blitRectPtr, NIL)
  }

  /**
   * Blits [srcRect] area from [src] image to this image at the coordinates given by [dst], clipped accordingly to both image bounds. [src] pixel is copied onto [dst] if the corresponding [mask] pixel's alpha value is not 0. This image and [src] image **must** have the same format. [src] image and [mask] image **must** have the same size (width and height) but they can have different formats. [srcRect] with non-positive size is treated as empty.
   */
  public fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blitRectMaskPtr, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly to both image bounds. This image and [src] image **must** have the same format. [srcRect] with non-positive size is treated as empty.
   */
  public fun blendRect(
    src: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blendRectPtr, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image using [mask] image at coordinates [dst], clipped accordingly to both image bounds. Alpha channels are required for both [src] and [mask]. [dst] pixels and [src] pixels will blend if the corresponding mask pixel's alpha value is not 0. This image and [src] image **must** have the same format. [src] image and [mask] image **must** have the same size (width and height) but they can have different formats. [srcRect] with non-positive size is treated as empty.
   */
  public fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(rawPtr, MethodBindings.blendRectMaskPtr, NIL)
  }

  /**
   * Fills the image with [color].
   */
  public fun fill(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.fillPtr, NIL)
  }

  /**
   * Fills [rect] with [color].
   */
  public fun fillRect(rect: Rect2i, color: Color): Unit {
    TransferContext.writeArguments(RECT2I to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.fillRectPtr, NIL)
  }

  /**
   * Returns a [godot.Rect2i] enclosing the visible portion of the image, considering each pixel with a non-zero alpha channel as visible.
   */
  public fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * Returns a new [godot.Image] that is a copy of this [godot.Image]'s area specified with [region].
   */
  public fun getRegion(region: Rect2i): Image? {
    TransferContext.writeArguments(RECT2I to region)
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Copies [src] image to this image.
   */
  public fun copyFrom(src: Image): Unit {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(rawPtr, MethodBindings.copyFromPtr, NIL)
  }

  /**
   * Returns the color of the pixel at [point].
   *
   * This is the same as [getPixel], but with a [godot.Vector2i] argument instead of two integer arguments.
   */
  public fun getPixelv(point: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getPixelvPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the color of the pixel at `(x, y)`.
   *
   * This is the same as [getPixelv], but with two integer arguments instead of a [godot.Vector2i] argument.
   */
  public fun getPixel(x: Int, y: Int): Color {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPixelPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the [godot.core.Color] of the pixel at [point] to [color].
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var img_width = 10
   *
   * var img_height = 5
   *
   * var img = Image.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   *
   *
   * img.set_pixelv(Vector2i(1, 2), Color.RED) # Sets the color at (1, 2) to red.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * int imgWidth = 10;
   *
   * int imgHeight = 5;
   *
   * var img = Image.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   *
   *
   * img.SetPixelv(new Vector2I(1, 2), Colors.Red); // Sets the color at (1, 2) to red.
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * This is the same as [setPixel], but with a [godot.Vector2i] argument instead of two integer arguments.
   */
  public fun setPixelv(point: Vector2i, color: Color): Unit {
    TransferContext.writeArguments(VECTOR2I to point, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setPixelvPtr, NIL)
  }

  /**
   * Sets the [godot.core.Color] of the pixel at `(x, y)` to [color].
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var img_width = 10
   *
   * var img_height = 5
   *
   * var img = Image.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   *
   *
   * img.set_pixel(1, 2, Color.RED) # Sets the color at (1, 2) to red.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * int imgWidth = 10;
   *
   * int imgHeight = 5;
   *
   * var img = Image.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   *
   *
   * img.SetPixel(1, 2, Colors.Red); // Sets the color at (1, 2) to red.
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * This is the same as [setPixelv], but with a two integer arguments instead of a [godot.Vector2i] argument.
   */
  public fun setPixel(
    x: Int,
    y: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setPixelPtr, NIL)
  }

  /**
   *
   */
  public fun adjustBcs(
    brightness: Float,
    contrast: Float,
    saturation: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to brightness.toDouble(), DOUBLE to contrast.toDouble(), DOUBLE to saturation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustBcsPtr, NIL)
  }

  /**
   * Loads an image from the binary contents of a PNG file.
   */
  public fun loadPngFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPngFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a JPEG file.
   */
  public fun loadJpgFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadJpgFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a WebP file.
   */
  public fun loadWebpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadWebpFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a TGA file.
   */
  public fun loadTgaFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadTgaFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a BMP file.
   *
   * **Note:** Godot's BMP module doesn't support 16-bit per pixel images. Only 1-bit, 4-bit, 8-bit, 24-bit, and 32-bit per pixel images are supported.
   */
  public fun loadBmpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBmpFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Format(
    id: Long,
  ) {
    /**
     * Texture format with a single 8-bit depth representing luminance.
     */
    FORMAT_L8(0),
    /**
     * OpenGL texture format with two values, luminance and alpha each stored with 8 bits.
     */
    FORMAT_LA8(1),
    /**
     * OpenGL texture format `RED` with a single component and a bitdepth of 8.
     */
    FORMAT_R8(2),
    /**
     * OpenGL texture format `RG` with two components and a bitdepth of 8 for each.
     */
    FORMAT_RG8(3),
    /**
     * OpenGL texture format `RGB` with three components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_RGB8(4),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_RGBA8(5),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 4.
     */
    FORMAT_RGBA4444(6),
    /**
     *
     */
    FORMAT_RGB565(7),
    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 32-bit floating-point value.
     */
    FORMAT_RF(8),
    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 32-bit floating-point values.
     */
    FORMAT_RGF(9),
    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 32-bit floating-point values.
     */
    FORMAT_RGBF(10),
    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 32-bit floating-point values.
     */
    FORMAT_RGBAF(11),
    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RH(12),
    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGH(13),
    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGBH(14),
    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGBAH(15),
    /**
     * A special OpenGL texture format where the three color components have 9 bits of precision and all three share a single 5-bit exponent.
     */
    FORMAT_RGBE9995(16),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 1, and is the smallest variation of S3TC, only providing 1 bit of alpha and color data being premultiplied with alpha.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT1(17),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 2, and color data is interpreted as not having been premultiplied by alpha. Well suited for images with sharp alpha transitions between translucent and opaque areas.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT3(18),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format also known as Block Compression 3 or BC3 that contains 64 bits of alpha channel data followed by 64 bits of DXT1-encoded color data. Color data is not premultiplied by alpha, same as DXT3. DXT5 generally produces superior results for transparent gradients compared to DXT3.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT5(19),
    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    FORMAT_RGTC_R(20),
    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red and green channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    FORMAT_RGTC_RG(21),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned normalized RGBA components.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_BPTC_RGBA(22),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with signed floating-point RGB components.
     */
    FORMAT_BPTC_RGBF(23),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned floating-point RGB components.
     */
    FORMAT_BPTC_RGBFU(24),
    /**
     * [godot.Ericsson Texture Compression format 1](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC1), also referred to as "ETC1", and is part of the OpenGL ES graphics standard. This format cannot store an alpha channel.
     */
    FORMAT_ETC(25),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`R11_EAC` variant), which provides one channel of unsigned data.
     */
    FORMAT_ETC2_R11(26),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_R11_EAC` variant), which provides one channel of signed data.
     */
    FORMAT_ETC2_R11S(27),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RG11_EAC` variant), which provides two channels of unsigned data.
     */
    FORMAT_ETC2_RG11(28),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_RG11_EAC` variant), which provides two channels of signed data.
     */
    FORMAT_ETC2_RG11S(29),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8` variant), which is a follow-up of ETC1 and compresses RGB888 data.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8(30),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGBA8`variant), which compresses RGBA8888 data with full alpha support.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGBA8(31),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8_PUNCHTHROUGH_ALPHA1` variant), which compresses RGBA data to make alpha either fully transparent or fully opaque.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8A1(32),
    /**
     *
     */
    FORMAT_ETC2_RA_AS_RG(33),
    /**
     *
     */
    FORMAT_DXT5_RA_AS_RG(34),
    /**
     * [godot.Adaptive Scalable Texutre Compression](https://en.wikipedia.org/wiki/Adaptive_scalable_texture_compression). This implements the 4x4 (high quality) mode.
     */
    FORMAT_ASTC_4x4(35),
    /**
     * Same format as [godot.FORMAT_ASTC_4x4], but with the hint to let the GPU know it is used for HDR.
     */
    FORMAT_ASTC_4x4_HDR(36),
    /**
     * [godot.Adaptive Scalable Texutre Compression](https://en.wikipedia.org/wiki/Adaptive_scalable_texture_compression). This implements the 8x8 (low quality) mode.
     */
    FORMAT_ASTC_8x8(37),
    /**
     * Same format as [godot.FORMAT_ASTC_8x8], but with the hint to let the GPU know it is used for HDR.
     */
    FORMAT_ASTC_8x8_HDR(38),
    /**
     * Represents the size of the [enum Format] enum.
     */
    FORMAT_MAX(39),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Interpolation(
    id: Long,
  ) {
    /**
     * Performs nearest-neighbor interpolation. If the image is resized, it will be pixelated.
     */
    INTERPOLATE_NEAREST(0),
    /**
     * Performs bilinear interpolation. If the image is resized, it will be blurry. This mode is faster than [INTERPOLATE_CUBIC], but it results in lower quality.
     */
    INTERPOLATE_BILINEAR(1),
    /**
     * Performs cubic interpolation. If the image is resized, it will be blurry. This mode often gives better results compared to [INTERPOLATE_BILINEAR], at the cost of being slower.
     */
    INTERPOLATE_CUBIC(2),
    /**
     * Performs bilinear separately on the two most-suited mipmap levels, then linearly interpolates between them.
     *
     * It's slower than [INTERPOLATE_BILINEAR], but produces higher-quality results with far fewer aliasing artifacts.
     *
     * If the image does not have mipmaps, they will be generated and used internally, but no mipmaps will be generated on the resulting image.
     *
     * **Note:** If you intend to scale multiple copies of the original image, it's better to call [generateMipmaps]] on it in advance, to avoid wasting processing power in generating them again and again.
     *
     * On the other hand, if the image already has mipmaps, they will be used, and a new set will be generated for the resulting image.
     */
    INTERPOLATE_TRILINEAR(3),
    /**
     * Performs Lanczos interpolation. This is the slowest image resizing mode, but it typically gives the best results, especially when downscalng images.
     */
    INTERPOLATE_LANCZOS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaMode(
    id: Long,
  ) {
    /**
     * Image does not have alpha.
     */
    ALPHA_NONE(0),
    /**
     * Image stores alpha in a single bit.
     */
    ALPHA_BIT(1),
    /**
     * Image uses alpha.
     */
    ALPHA_BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CompressMode(
    id: Long,
  ) {
    /**
     * Use S3TC compression.
     */
    COMPRESS_S3TC(0),
    /**
     * Use ETC compression.
     */
    COMPRESS_ETC(1),
    /**
     * Use ETC2 compression.
     */
    COMPRESS_ETC2(2),
    /**
     * Use BPTC compression.
     */
    COMPRESS_BPTC(3),
    /**
     * Use ASTC compression.
     */
    COMPRESS_ASTC(4),
    /**
     * Represents the size of the [enum CompressMode] enum.
     */
    COMPRESS_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class UsedChannels(
    id: Long,
  ) {
    /**
     *
     */
    USED_CHANNELS_L(0),
    /**
     *
     */
    USED_CHANNELS_LA(1),
    /**
     *
     */
    USED_CHANNELS_R(2),
    /**
     *
     */
    USED_CHANNELS_RG(3),
    /**
     *
     */
    USED_CHANNELS_RGB(4),
    /**
     *
     */
    USED_CHANNELS_RGBA(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CompressSource(
    id: Long,
  ) {
    /**
     * Source texture (before compression) is a regular texture. Default for all textures.
     */
    COMPRESS_SOURCE_GENERIC(0),
    /**
     * Source texture (before compression) is in sRGB space.
     */
    COMPRESS_SOURCE_SRGB(1),
    /**
     * Source texture (before compression) is a normal texture (e.g. it can be compressed into two channels).
     */
    COMPRESS_SOURCE_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ASTCFormat(
    id: Long,
  ) {
    /**
     * Hint to indicate that the high quality 4x4 ASTC compression format should be used.
     */
    ASTC_FORMAT_4x4(0),
    /**
     * Hint to indicate that the low quality 8x8 ASTC compression format should be used.
     */
    ASTC_FORMAT_8x8(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The maximal width allowed for [godot.Image] resources.
     */
    public final const val MAX_WIDTH: Long = 16777216

    /**
     * The maximal height allowed for [godot.Image] resources.
     */
    public final const val MAX_HEIGHT: Long = 16777216

    /**
     * Creates an empty image of given size and format. See [enum Format] constants. If [useMipmaps] is `true`, then generate mipmaps for this image. See the [generateMipmaps].
     */
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

    /**
     * Creates a new image of given size and format. See [enum Format] constants. Fills the image with the given raw data. If [useMipmaps] is `true` then loads mipmaps for this image from [data]. See [generateMipmaps].
     */
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

    /**
     * Creates a new [godot.Image] and loads data from the specified file.
     */
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
