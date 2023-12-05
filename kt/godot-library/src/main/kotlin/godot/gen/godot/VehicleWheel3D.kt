// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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

@GodotBaseType
public open class VehicleWheel3D : Node3D() {
  public var engineForce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEngineForcePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEngineForcePtr, NIL)
    }

  public var brake: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBrakePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBrakePtr, NIL)
    }

  public var steering: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSteeringPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSteeringPtr, NIL)
    }

  public var useAsTraction: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsedAsTractionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAsTractionPtr, NIL)
    }

  public var useAsSteering: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsedAsSteeringPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAsSteeringPtr, NIL)
    }

  public var wheelRollInfluence: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRollInfluencePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRollInfluencePtr, NIL)
    }

  public var wheelRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  public var wheelRestLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionRestLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionRestLengthPtr, NIL)
    }

  public var wheelFrictionSlip: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrictionSlipPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrictionSlipPtr, NIL)
    }

  public var suspensionTravel: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionTravelPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionTravelPtr, NIL)
    }

  public var suspensionStiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionStiffnessPtr, NIL)
    }

  public var suspensionMaxForce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionMaxForcePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionMaxForcePtr, NIL)
    }

  public var dampingCompression: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingCompressionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingCompressionPtr, NIL)
    }

  public var dampingRelaxation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingRelaxationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingRelaxationPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VEHICLEWHEEL3D, scriptIndex)
    return true
  }

  public fun isInContact(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInContactPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getContactBody(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactBodyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node3D?)
  }

  public fun getSkidinfo(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkidinfoPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getRpm(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRpmPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_radius")

    public val setSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_rest_length")

    public val getSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_rest_length")

    public val setSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_travel")

    public val getSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_travel")

    public val setSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_stiffness")

    public val getSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_stiffness")

    public val setSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_max_force")

    public val getSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_max_force")

    public val setDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_compression")

    public val getDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_compression")

    public val setDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_relaxation")

    public val getDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_relaxation")

    public val setUseAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_traction")

    public val isUsedAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_traction")

    public val setUseAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_steering")

    public val isUsedAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_steering")

    public val setFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_friction_slip")

    public val getFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_friction_slip")

    public val isInContactPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_in_contact")

    public val getContactBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_contact_body")

    public val setRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_roll_influence")

    public val getRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_roll_influence")

    public val getSkidinfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_skidinfo")

    public val getRpmPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_rpm")

    public val setEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_engine_force")

    public val getEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_engine_force")

    public val setBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "set_brake")

    public val getBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_brake")

    public val setSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_steering")

    public val getSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_steering")
  }
}
