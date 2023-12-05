// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class CollisionShape2D : Node2D() {
  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
    }

  public var oneWayCollisionMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var debugColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugColorPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONSHAPE2D, scriptIndex)
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
   * val myCoreType = collisionshape2d.debugColor
   * //Your changes
   * collisionshape2d.debugColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugColorMutate(block: Color.() -> Unit): Color = debugColor.apply{
      block(this)
      debugColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape2D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape2D", "get_shape")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "is_disabled")

    public val setOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_one_way_collision")

    public val isOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "is_one_way_collision_enabled")

    public val setOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_one_way_collision_margin")

    public val getOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "get_one_way_collision_margin")

    public val setDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_debug_color")

    public val getDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "get_debug_color")
  }
}
