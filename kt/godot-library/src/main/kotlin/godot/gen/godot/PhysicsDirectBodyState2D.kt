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
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PhysicsDirectBodyState2D internal constructor() : Object() {
  public val step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val inverseMass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInverseMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val inverseInertia: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val totalAngularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val totalLinearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  @CoreTypeLocalCopy
  public val totalGravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalGravityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  @CoreTypeLocalCopy
  public val centerOfMass: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  @CoreTypeLocalCopy
  public val centerOfMassLocal: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassLocalPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  public var angularVelocity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
    }

  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSleepingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSleepStatePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE2D, scriptIndex)
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
   * val myCoreType = physicsdirectbodystate2d.linearVelocity
   * //Your changes
   * physicsdirectbodystate2d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun linearVelocityMutate(block: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      block(this)
      linearVelocity = this
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
   * val myCoreType = physicsdirectbodystate2d.transform
   * //Your changes
   * physicsdirectbodystate2d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  public fun getVelocityAtLocalPosition(localPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityAtLocalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun applyCentralImpulse(impulse: Vector2) {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  public fun applyTorqueImpulse(impulse: Float) {
    TransferContext.writeArguments(DOUBLE to impulse.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyCentralForce(force: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyForcePtr, NIL)
  }

  public fun applyTorque(torque: Float) {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorquePtr, NIL)
  }

  @JvmOverloads
  public fun addConstantCentralForce(force: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantForcePtr, NIL)
  }

  public fun addConstantTorque(torque: Float) {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantTorquePtr, NIL)
  }

  public fun setConstantForce(force: Vector2) {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
  }

  public fun getConstantForce(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setConstantTorque(torque: Float) {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
  }

  public fun getConstantTorque(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactLocalPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getContactLocalNormal(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getContactLocalShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalVelocityAtPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getContactCollider(contactIdx: Int): RID {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getContactColliderPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getContactColliderId(contactIdx: Int): Long {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getContactColliderObject(contactIdx: Int): Object? {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getContactColliderShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderVelocityAtPositionPtr,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getContactImpulse(contactIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactImpulsePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun integrateForces() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.integrateForcesPtr, NIL)
  }

  public fun getSpaceState(): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?)
  }

  public companion object

  internal object MethodBindings {
    public val getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_gravity")

    public val getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_linear_damp")

    public val getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_total_angular_damp")

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_center_of_mass")

    public val getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_center_of_mass_local")

    public val getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_inverse_mass")

    public val getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_inverse_inertia")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_angular_velocity")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_transform")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_transform")

    public val getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_velocity_at_local_position")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_central_impulse")

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_torque_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_impulse")

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_central_force")

    public val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_force")

    public val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "apply_torque")

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_central_force")

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_force")

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "add_constant_torque")

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_constant_force")

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_constant_force")

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_constant_torque")

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_constant_torque")

    public val setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "set_sleep_state")

    public val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "is_sleeping")

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_count")

    public val getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_position")

    public val getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_normal")

    public val getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_shape")

    public val getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_local_velocity_at_position")

    public val getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider")

    public val getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_position")

    public val getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_id")

    public val getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_object")

    public val getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_shape")

    public val getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_collider_velocity_at_position")

    public val getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_contact_impulse")

    public val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_step")

    public val integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "integrate_forces")

    public val getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState2D", "get_space_state")
  }
}
