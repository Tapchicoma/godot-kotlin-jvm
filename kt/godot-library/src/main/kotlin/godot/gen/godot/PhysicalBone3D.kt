// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
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
public open class PhysicalBone3D : PhysicsBody3D() {
  public var jointType: JointType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointTypePtr, LONG)
      return PhysicalBone3D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointTypePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var jointOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointOffsetPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointOffsetPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var jointRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointRotationPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var bodyOffset: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodyOffsetPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBodyOffsetPtr, NIL)
    }

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

  public var friction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
    }

  public var bounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
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

  public var linearDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampModePtr, LONG)
      return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public var angularDampMode: DampMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampModePtr, LONG)
      return PhysicalBone3D.DampMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICALBONE3D, scriptIndex)
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
   * val myCoreType = physicalbone3d.jointOffset
   * //Your changes
   * physicalbone3d.jointOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun jointOffsetMutate(block: Transform3D.() -> Unit): Transform3D = jointOffset.apply{
      block(this)
      jointOffset = this
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
   * val myCoreType = physicalbone3d.jointRotation
   * //Your changes
   * physicalbone3d.jointRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun jointRotationMutate(block: Vector3.() -> Unit): Vector3 = jointRotation.apply{
      block(this)
      jointRotation = this
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
   * val myCoreType = physicalbone3d.bodyOffset
   * //Your changes
   * physicalbone3d.bodyOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bodyOffsetMutate(block: Transform3D.() -> Unit): Transform3D = bodyOffset.apply{
      block(this)
      bodyOffset = this
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
   * val myCoreType = physicalbone3d.linearVelocity
   * //Your changes
   * physicalbone3d.linearVelocity = myCoreType
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
   * val myCoreType = physicalbone3d.angularVelocity
   * //Your changes
   * physicalbone3d.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  public open fun _integrateForces(state: PhysicsDirectBodyState3D) {
  }

  public fun applyCentralImpulse(impulse: Vector3) {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun applyImpulse(impulse: Vector3, position: Vector3 = Vector3(0, 0, 0)) {
    TransferContext.writeArguments(VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.applyImpulsePtr, NIL)
  }

  public fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBoneId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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

  public enum class JointType(
    id: Long,
  ) {
    JOINT_TYPE_NONE(0),
    JOINT_TYPE_PIN(1),
    JOINT_TYPE_CONE(2),
    JOINT_TYPE_HINGE(3),
    JOINT_TYPE_SLIDER(4),
    JOINT_TYPE_6DOF(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): JointType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _integrateForcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "_integrate_forces")

    public val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_central_impulse")

    public val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "apply_impulse")

    public val setJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_type")

    public val getJointTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_type")

    public val setJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_offset")

    public val getJointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_offset")

    public val setJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_joint_rotation")

    public val getJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_joint_rotation")

    public val setBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_body_offset")

    public val getBodyOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_body_offset")

    public val getSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_simulate_physics")

    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_simulating_physics")

    public val getBoneIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bone_id")

    public val setMassPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "set_mass")

    public val getMassPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_mass")

    public val setFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_friction")

    public val getFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_friction")

    public val setBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "set_bounce")

    public val getBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone3D", "get_bounce")

    public val setGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_gravity_scale")

    public val getGravityScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_gravity_scale")

    public val setLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp_mode")

    public val getLinearDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp_mode")

    public val setAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp_mode")

    public val getAngularDampModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp_mode")

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_damp")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_damp")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "get_angular_velocity")

    public val setUseCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_use_custom_integrator")

    public val isUsingCustomIntegratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_using_custom_integrator")

    public val setCanSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "set_can_sleep")

    public val isAbleToSleepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone3D", "is_able_to_sleep")
  }
}
