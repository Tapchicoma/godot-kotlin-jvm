// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PortableCompressedTexture2D : Texture2D() {
  @CoreTypeLocalCopy
  public var sizeOverride: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizeOverridePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizeOverridePtr, NIL)
    }

  public var keepCompressedBuffer: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isKeepingCompressedBufferPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepCompressedBufferPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = portablecompressedtexture2d.sizeOverride
   * //Your changes
   * portablecompressedtexture2d.sizeOverride = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeOverrideMutate(block: Vector2.() -> Unit): Vector2 = sizeOverride.apply{
      block(this)
      sizeOverride = this
  }


  @JvmOverloads
  public fun createFromImage(
    image: Image,
    compressionMode: CompressionMode,
    normalMap: Boolean = false,
    lossyQuality: Float = 0.8f,
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to compressionMode.id, BOOL to normalMap, DOUBLE to lossyQuality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromImagePtr, NIL)
  }

  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getCompressionMode(): CompressionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCompressionModePtr, LONG)
    return PortableCompressedTexture2D.CompressionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    COMPRESSION_MODE_LOSSLESS(0),
    COMPRESSION_MODE_LOSSY(1),
    COMPRESSION_MODE_BASIS_UNIVERSAL(2),
    COMPRESSION_MODE_S3TC(3),
    COMPRESSION_MODE_ETC2(4),
    COMPRESSION_MODE_BPTC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public fun setKeepAllCompressedBuffers(keep: Boolean) {
      TransferContext.writeArguments(BOOL to keep)
      TransferContext.callMethod(0, MethodBindings.setKeepAllCompressedBuffersPtr, NIL)
    }

    public fun isKeepingAllCompressedBuffers(): Boolean {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.isKeepingAllCompressedBuffersPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
  }

  internal object MethodBindings {
    public val createFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "create_from_image")

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_format")

    public val getCompressionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_compression_mode")

    public val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_size_override")

    public val getSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_size_override")

    public val setKeepCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_compressed_buffer")

    public val isKeepingCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_compressed_buffer")

    public val setKeepAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_all_compressed_buffers")

    public val isKeepingAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_all_compressed_buffers")
  }
}
