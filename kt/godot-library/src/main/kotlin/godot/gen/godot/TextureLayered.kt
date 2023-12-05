// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class TextureLayered : Texture() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURELAYERED, scriptIndex)
    return true
  }

  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for TextureLayered")
  }

  public open fun _getLayeredType(): Long {
    throw NotImplementedError("_get_layered_type is not implemented for TextureLayered")
  }

  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for TextureLayered")
  }

  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for TextureLayered")
  }

  public open fun _getLayers(): Int {
    throw NotImplementedError("_get_layers is not implemented for TextureLayered")
  }

  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for TextureLayered")
  }

  public open fun _getLayerData(layerIndex: Int): Image? {
    throw NotImplementedError("_get_layer_data is not implemented for TextureLayered")
  }

  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getLayeredType(): LayeredType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayeredTypePtr, LONG)
    return TextureLayered.LayeredType.from(TransferContext.readReturnValue(LONG) as Long)
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

  public fun getLayers(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getLayerData(layer: Int): Image? {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public enum class LayeredType(
    id: Long,
  ) {
    LAYERED_TYPE_2D_ARRAY(0),
    LAYERED_TYPE_CUBEMAP(1),
    LAYERED_TYPE_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayeredType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_get_format")

    public val _getLayeredTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_get_layered_type")

    public val _getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureLayered", "_get_width")

    public val _getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_get_height")

    public val _getLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_get_layers")

    public val _hasMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_has_mipmaps")

    public val _getLayerDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "_get_layer_data")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureLayered", "get_format")

    public val getLayeredTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layered_type")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureLayered", "get_width")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureLayered", "get_height")

    public val getLayersPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureLayered", "get_layers")

    public val hasMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "has_mipmaps")

    public val getLayerDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layer_data")
  }
}
