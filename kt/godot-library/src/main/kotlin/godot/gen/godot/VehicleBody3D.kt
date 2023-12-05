// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class VehicleBody3D : RigidBody3D() {
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VEHICLEBODY3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "set_engine_force")

    public val getEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "get_engine_force")

    public val setBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleBody3D", "set_brake")

    public val getBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleBody3D", "get_brake")

    public val setSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "set_steering")

    public val getSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "get_steering")
  }
}
