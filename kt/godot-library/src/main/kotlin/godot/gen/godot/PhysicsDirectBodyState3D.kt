// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
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
public open class PhysicsDirectBodyState3D internal constructor() : Object() {
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
  public val inverseInertia: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  @CoreTypeLocalCopy
  public val inverseInertiaTensor: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInverseInertiaTensorPtr, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }

  @CoreTypeLocalCopy
  public val totalGravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalGravityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  @CoreTypeLocalCopy
  public val centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  @CoreTypeLocalCopy
  public val centerOfMassLocal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassLocalPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }

  @CoreTypeLocalCopy
  public val principalInertiaAxes: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPrincipalInertiaAxesPtr, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }

  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
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
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTBODYSTATE3D, scriptIndex)
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
   * val myCoreType = physicsdirectbodystate3d.angularVelocity
   * //Your changes
   * physicsdirectbodystate3d.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
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
   * val myCoreType = physicsdirectbodystate3d.linearVelocity
   * //Your changes
   * physicsdirectbodystate3d.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
   * val myCoreType = physicsdirectbodystate3d.transform
   * //Your changes
   * physicsdirectbodystate3d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  public fun getVelocityAtLocalPosition(localPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityAtLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun applyCentralImpulse(impulse: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public fun applyTorqueImpulse(impulse: Vector3) {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyCentralForce(force: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun applyForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyForcePtr, NIL)
  }

  public fun applyTorque(torque: Vector3) {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorquePtr, NIL)
  }

  @JvmOverloads
  public fun addConstantCentralForce(force: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun addConstantForce(force: Vector3, position: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantForcePtr, NIL)
  }

  public fun addConstantTorque(torque: Vector3) {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.addConstantTorquePtr, NIL)
  }

  public fun setConstantForce(force: Vector3) {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
  }

  public fun getConstantForce(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setConstantTorque(torque: Vector3) {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
  }

  public fun getConstantTorque(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactLocalPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getContactLocalNormal(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getContactImpulse(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactImpulsePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getContactLocalShape(contactIdx: Int): Int {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getContactLocalVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactLocalVelocityAtPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getContactCollider(contactIdx: Int): RID {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getContactColliderPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
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

  public fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to contactIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getContactColliderVelocityAtPositionPtr,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun integrateForces() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.integrateForcesPtr, NIL)
  }

  public fun getSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
  }

  public companion object

  internal object MethodBindings {
    public val getTotalGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_gravity")

    public val getTotalLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_linear_damp")

    public val getTotalAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_total_angular_damp")

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass")

    public val getCenterOfMassLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_center_of_mass_local")

    public val getPrincipalInertiaAxesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_principal_inertia_axes")

    public val getInverseMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_mass")

    public val getInverseInertiaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia")

    public val getInverseInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_inverse_inertia_tensor")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_angular_velocity")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_transform")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_transform")

    public val getVelocityAtLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_velocity_at_local_position")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_impulse")

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque_impulse")

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_central_force")

    public val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_force")

    public val applyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "apply_torque")

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_central_force")

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_force")

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "add_constant_torque")

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_force")

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_force")

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_constant_torque")

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_constant_torque")

    public val setSleepStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "set_sleep_state")

    public val isSleepingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "is_sleeping")

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_count")

    public val getContactLocalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_position")

    public val getContactLocalNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_normal")

    public val getContactImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_impulse")

    public val getContactLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_shape")

    public val getContactLocalVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_local_velocity_at_position")

    public val getContactColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider")

    public val getContactColliderPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_position")

    public val getContactColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_id")

    public val getContactColliderObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_object")

    public val getContactColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_shape")

    public val getContactColliderVelocityAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_contact_collider_velocity_at_position")

    public val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_step")

    public val integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "integrate_forces")

    public val getSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectBodyState3D", "get_space_state")
  }
}
