// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class BitMap : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BITMAP, scriptIndex)
    return true
  }

  public fun create(size: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.createPtr, NIL)
  }

  @JvmOverloads
  public fun createFromImageAlpha(image: Image, threshold: Float = 0.1f) {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromImageAlphaPtr, NIL)
  }

  public fun setBitv(position: Vector2i, bit: Boolean) {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitvPtr, NIL)
  }

  public fun setBit(
    x: Int,
    y: Int,
    bit: Boolean,
  ) {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitPtr, NIL)
  }

  public fun getBitv(position: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getBitvPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBit(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setBitRect(rect: Rect2i, bit: Boolean) {
    TransferContext.writeArguments(RECT2I to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitRectPtr, NIL)
  }

  public fun getTrueBitCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrueBitCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun resize(newSize: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  public fun growMask(pixels: Int, rect: Rect2i) {
    TransferContext.writeArguments(LONG to pixels.toLong(), RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.growMaskPtr, NIL)
  }

  public fun convertToImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.convertToImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  @JvmOverloads
  public fun opaqueToPolygons(rect: Rect2i, epsilon: Float = 2.0f):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(RECT2I to rect, DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.opaqueToPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public companion object

  internal object MethodBindings {
    public val createPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "create")

    public val createFromImageAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "create_from_image_alpha")

    public val setBitvPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "set_bitv")

    public val setBitPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "set_bit")

    public val getBitvPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_bitv")

    public val getBitPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_bit")

    public val setBitRectPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "set_bit_rect")

    public val getTrueBitCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "get_true_bit_count")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_size")

    public val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "resize")

    public val growMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "grow_mask")

    public val convertToImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "convert_to_image")

    public val opaqueToPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "opaque_to_polygons")
  }
}
