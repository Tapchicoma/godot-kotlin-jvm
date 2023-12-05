// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PhysicsTestMotionParameters2D : RefCounted() {
  @CoreTypeLocalCopy
  public var from: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFromPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFromPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var motion: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
    }

  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  public var collideSeparationRay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideSeparationRayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideSeparationRayEnabledPtr, NIL)
    }

  public var excludeBodies: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeBodiesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeBodiesPtr, NIL)
    }

  public var excludeObjects: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeObjectsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeObjectsPtr, NIL)
    }

  public var recoveryAsCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRecoveryAsCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRecoveryAsCollisionEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D, scriptIndex)
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
   * val myCoreType = physicstestmotionparameters2d.from
   * //Your changes
   * physicstestmotionparameters2d.from = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fromMutate(block: Transform2D.() -> Unit): Transform2D = from.apply{
      block(this)
      from = this
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
   * val myCoreType = physicstestmotionparameters2d.motion
   * //Your changes
   * physicstestmotionparameters2d.motion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMutate(block: Vector2.() -> Unit): Vector2 = motion.apply{
      block(this)
      motion = this
  }


  public companion object

  internal object MethodBindings {
    public val getFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_from")

    public val setFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_from")

    public val getMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_motion")

    public val setMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_motion")

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_margin")

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_margin")

    public val isCollideSeparationRayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "is_collide_separation_ray_enabled")

    public val setCollideSeparationRayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_collide_separation_ray_enabled")

    public val getExcludeBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_exclude_bodies")

    public val setExcludeBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_exclude_bodies")

    public val getExcludeObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_exclude_objects")

    public val setExcludeObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_exclude_objects")

    public val isRecoveryAsCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "is_recovery_as_collision_enabled")

    public val setRecoveryAsCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_recovery_as_collision_enabled")
  }
}
