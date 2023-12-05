// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Texture2D : Texture() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURE2D, scriptIndex)
    return true
  }

  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for Texture2D")
  }

  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for Texture2D")
  }

  public open fun _isPixelOpaque(x: Int, y: Int): Boolean {
    throw NotImplementedError("_is_pixel_opaque is not implemented for Texture2D")
  }

  public open fun _hasAlpha(): Boolean {
    throw NotImplementedError("_has_alpha is not implemented for Texture2D")
  }

  public open fun _draw(
    toCanvasItem: RID,
    pos: Vector2,
    modulate: Color,
    transpose: Boolean,
  ) {
  }

  public open fun _drawRect(
    toCanvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
  ) {
  }

  public open fun _drawRectRegion(
    toCanvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    clipUv: Boolean,
  ) {
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

  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlphaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  @JvmOverloads
  public fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.drawRectPtr, NIL)
  }

  @JvmOverloads
  public fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, MethodBindings.drawRectRegionPtr, NIL)
  }

  public fun getImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val _getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_get_width")

    public val _getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_get_height")

    public val _isPixelOpaquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "_is_pixel_opaque")

    public val _hasAlphaPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_has_alpha")

    public val _drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_draw")

    public val _drawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_draw_rect")

    public val _drawRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "_draw_rect_region")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_width")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_height")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_size")

    public val hasAlphaPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "has_alpha")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "draw")

    public val drawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "draw_rect")

    public val drawRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "draw_rect_region")

    public val getImagePtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_image")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "create_placeholder")
  }
}
