// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class StyleBox : Resource() {
  public var contentMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getContentMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginPtr, NIL)
    }

  public var contentMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getContentMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginPtr, NIL)
    }

  public var contentMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getContentMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginPtr, NIL)
    }

  public var contentMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getContentMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOX, scriptIndex)
    return true
  }

  public open fun _draw(toCanvasItem: RID, rect: Rect2) {
  }

  public open fun _getDrawRect(rect: Rect2): Rect2 {
    throw NotImplementedError("_get_draw_rect is not implemented for StyleBox")
  }

  public open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for StyleBox")
  }

  public open fun _testMask(point: Vector2, rect: Rect2): Boolean {
    throw NotImplementedError("_test_mask is not implemented for StyleBox")
  }

  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setContentMarginAll(offset: Float) {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setContentMarginAllPtr, NIL)
  }

  public fun getMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun draw(canvasItem: RID, rect: Rect2) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  public fun getCurrentItemDrawn(): CanvasItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentItemDrawnPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CanvasItem?)
  }

  public fun testMask(point: Vector2, rect: Rect2): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.testMaskPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val _drawPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "_draw")

    public val _getDrawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "_get_draw_rect")

    public val _getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "_get_minimum_size")

    public val _testMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "_test_mask")

    public val getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_minimum_size")

    public val setContentMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "set_content_margin")

    public val setContentMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "set_content_margin_all")

    public val getContentMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_content_margin")

    public val getMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "get_margin")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "get_offset")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "draw")

    public val getCurrentItemDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBox", "get_current_item_drawn")

    public val testMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBox", "test_mask")
  }
}
