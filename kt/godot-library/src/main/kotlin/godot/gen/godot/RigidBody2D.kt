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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
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
public open class RigidBody2D : PhysicsBody2D() {
  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public val bodyEntered: Signal1<Node> by signal("body")

  public val bodyExited: Signal1<Node> by signal("body")

  public val sleepingStateChanged: Signal0 by signal()

  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
    }

  public var inertia: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInertiaPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInertiaPtr, NIL)
    }

  public var centerOfMassMode: CenterOfMassMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassModePtr, LONG)
      return RigidBody2D.CenterOfMassMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOfMassModePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var centerOfMass: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOfMassPtr, NIL)
    }

  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
    }

  public var gravityScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityScalePtr, NIL)
    }

  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomIntegratorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomIntegratorPtr, NIL)
    }

  public var continuousCd: CCDMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getContinuousCollisionDetectionModePtr,
          LONG)
      return RigidBody2D.CCDMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setContinuousCollisionDetectionModePtr, NIL)
    }

  public var maxContactsReported: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxContactsReportedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxContactsReportedPtr, NIL)
    }

  public var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isContactMonitorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContactMonitorPtr, NIL)
    }

  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSleepingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSleepingPtr, NIL)
    }

  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAbleToSleepPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanSleepPtr, NIL)
    }

  public var lockRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLockRotationEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLockRotationEnabledPtr, NIL)
    }

  public var freeze: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFreezeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFreezeEnabledPtr, NIL)
    }

  public var freezeMode: FreezeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFreezeModePtr, LONG)
      return RigidBody2D.FreezeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFreezeModePtr, NIL)
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

  public var linearDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
      return RigidBody2D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampModePtr, NIL)
    }

  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
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

  public var angularDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
      return RigidBody2D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampModePtr, NIL)
    }

  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var constantForce: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantForcePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantForcePtr, NIL)
    }

  public var constantTorque: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantTorquePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantTorquePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RIGIDBODY2D, scriptIndex)
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
   * val myCoreType = rigidbody2d.centerOfMass
   * //Your changes
   * rigidbody2d.centerOfMass = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun centerOfMassMutate(block: Vector2.() -> Unit): Vector2 = centerOfMass.apply{
      block(this)
      centerOfMass = this
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
   * val myCoreType = rigidbody2d.linearVelocity
   * //Your changes
   * rigidbody2d.linearVelocity = myCoreType
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
   * val myCoreType = rigidbody2d.constantForce
   * //Your changes
   * rigidbody2d.constantForce = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantForceMutate(block: Vector2.() -> Unit): Vector2 = constantForce.apply{
      block(this)
      constantForce = this
  }


  public open fun _integrateForces(state: PhysicsDirectBodyState2D) {
  }

  public fun getContactCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setAxisVelocity(axisVelocity: Vector2) {
    TransferContext.writeArguments(VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setAxisVelocityPtr, NIL)
  }

  @JvmOverloads
  public fun applyCentralImpulse(impulse: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)) {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public fun applyTorqueImpulse(torque: Float) {
    TransferContext.writeArguments(DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.applyTorqueImpulsePtr, NIL)
  }

  public fun applyCentralForce(force: Vector2) {
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

  public fun addConstantCentralForce(force: Vector2) {
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

  public fun getCollidingBodies(): VariantArray<Node2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollidingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node2D>)
  }

  public enum class FreezeMode(
    id: Long,
  ) {
    FREEZE_MODE_STATIC(0),
    FREEZE_MODE_KINEMATIC(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FreezeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CenterOfMassMode(
    id: Long,
  ) {
    CENTER_OF_MASS_MODE_AUTO(0),
    CENTER_OF_MASS_MODE_CUSTOM(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CenterOfMassMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DampMode(
    id: Long,
  ) {
    DAMP_MODE_COMBINE(0),
    DAMP_MODE_REPLACE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DampMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CCDMode(
    id: Long,
  ) {
    CCD_MODE_DISABLED(0),
    CCD_MODE_CAST_RAY(1),
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CCDMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "_integrate_forces")

    public val setMassPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "set_mass")

    public val getMassPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "get_mass")

    public val getInertiaPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "get_inertia")

    public val setInertiaPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "set_inertia")

    public val setCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_center_of_mass_mode")

    public val getCenterOfMassModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_center_of_mass_mode")

    public val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_center_of_mass")

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_center_of_mass")

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_physics_material_override")

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_physics_material_override")

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_gravity_scale")

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_gravity_scale")

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_linear_damp_mode")

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_linear_damp_mode")

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_angular_damp_mode")

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_angular_damp_mode")

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_linear_damp")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_angular_damp")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_angular_velocity")

    public val setMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_max_contacts_reported")

    public val getMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_max_contacts_reported")

    public val getContactCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_contact_count")

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_use_custom_integrator")

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "is_using_custom_integrator")

    public val setContactMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_contact_monitor")

    public val isContactMonitorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "is_contact_monitor_enabled")

    public val setContinuousCollisionDetectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_continuous_collision_detection_mode")

    public val getContinuousCollisionDetectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_continuous_collision_detection_mode")

    public val setAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_axis_velocity")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "apply_central_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "apply_impulse")

    public val applyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "apply_torque_impulse")

    public val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "apply_central_force")

    public val applyForcePtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "apply_force")

    public val applyTorquePtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "apply_torque")

    public val addConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "add_constant_central_force")

    public val addConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "add_constant_force")

    public val addConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "add_constant_torque")

    public val setConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_constant_force")

    public val getConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_constant_force")

    public val setConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_constant_torque")

    public val getConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_constant_torque")

    public val setSleepingPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "set_sleeping")

    public val isSleepingPtr: VoidPtr = TypeManager.getMethodBindPtr("RigidBody2D", "is_sleeping")

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_can_sleep")

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "is_able_to_sleep")

    public val setLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_lock_rotation_enabled")

    public val isLockRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "is_lock_rotation_enabled")

    public val setFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_freeze_enabled")

    public val isFreezeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "is_freeze_enabled")

    public val setFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "set_freeze_mode")

    public val getFreezeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_freeze_mode")

    public val getCollidingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RigidBody2D", "get_colliding_bodies")
  }
}
