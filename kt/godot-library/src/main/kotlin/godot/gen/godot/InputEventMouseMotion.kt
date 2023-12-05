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
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class InputEventMouseMotion : InputEventMouse() {
  @CoreTypeLocalCopy
  public var tilt: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTiltPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTiltPtr, NIL)
    }

  public var pressure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressurePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
    }

  public var penInverted: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPenInvertedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPenInvertedPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var relative: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRelativePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRelativePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEMOTION, scriptIndex)
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
   * val myCoreType = inputeventmousemotion.tilt
   * //Your changes
   * inputeventmousemotion.tilt = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tiltMutate(block: Vector2.() -> Unit): Vector2 = tilt.apply{
      block(this)
      tilt = this
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
   * val myCoreType = inputeventmousemotion.relative
   * //Your changes
   * inputeventmousemotion.relative = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun relativeMutate(block: Vector2.() -> Unit): Vector2 = relative.apply{
      block(this)
      relative = this
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
   * val myCoreType = inputeventmousemotion.velocity
   * //Your changes
   * inputeventmousemotion.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  public companion object

  internal object MethodBindings {
    public val setTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_tilt")

    public val getTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_tilt")

    public val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_pressure")

    public val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_pressure")

    public val setPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_pen_inverted")

    public val getPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_pen_inverted")

    public val setRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_relative")

    public val getRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_relative")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_velocity")
  }
}
