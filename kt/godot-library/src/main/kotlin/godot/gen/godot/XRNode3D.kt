// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class XRNode3D internal constructor() : Node3D() {
  public var tracker: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerPtr, NIL)
    }

  public var pose: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPoseNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPoseNamePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRNODE3D, scriptIndex)
    return true
  }

  public fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPose(): XRPose? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRPose?)
  }

  public fun triggerHapticPulse(
    actionName: String,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ) {
    TransferContext.writeArguments(STRING to actionName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "set_tracker")

    public val getTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_tracker")

    public val setPoseNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "set_pose_name")

    public val getPoseNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_pose_name")

    public val getIsActivePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_is_active")

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_has_tracking_data")

    public val getPosePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_pose")

    public val triggerHapticPulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "trigger_haptic_pulse")
  }
}
