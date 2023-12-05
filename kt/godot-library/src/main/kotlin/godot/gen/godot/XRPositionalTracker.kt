// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class XRPositionalTracker : RefCounted() {
  public val poseChanged: Signal1<XRPose> by signal("pose")

  public val buttonPressed: Signal1<String> by signal("name")

  public val buttonReleased: Signal1<String> by signal("name")

  public val inputFloatChanged: Signal2<String, Double> by signal("name", "value")

  public val inputVector2Changed: Signal2<String, Vector2> by signal("name", "vector")

  public val profileChanged: Signal1<String> by signal("role")

  public var type: XRServer.TrackerType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerTypePtr, LONG)
      return XRServer.TrackerType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerTypePtr, NIL)
    }

  public var name: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerNamePtr, NIL)
    }

  public var description: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerDescPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerDescPtr, NIL)
    }

  public var profile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerProfilePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerProfilePtr, NIL)
    }

  public var hand: TrackerHand
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerHandPtr, LONG)
      return XRPositionalTracker.TrackerHand.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerHandPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRPOSITIONALTRACKER, scriptIndex)
    return true
  }

  public fun hasPose(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasPosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPose(name: StringName): XRPose? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRPose?)
  }

  public fun invalidatePose(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.invalidatePosePtr, NIL)
  }

  public fun setPose(
    name: StringName,
    transform: Transform3D,
    linearVelocity: Vector3,
    angularVelocity: Vector3,
    trackingConfidence: XRPose.TrackingConfidence,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, TRANSFORM3D to transform, VECTOR3 to linearVelocity, VECTOR3 to angularVelocity, LONG to trackingConfidence.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPosePtr, NIL)
  }

  public fun getInput(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setInput(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputPtr, NIL)
  }

  public enum class TrackerHand(
    id: Long,
  ) {
    TRACKER_HAND_UNKNOWN(0),
    TRACKER_HAND_LEFT(1),
    TRACKER_HAND_RIGHT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackerHand = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_type")

    public val setTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_type")

    public val getTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_name")

    public val setTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_name")

    public val getTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_desc")

    public val setTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_desc")

    public val getTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_profile")

    public val setTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_profile")

    public val getTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_hand")

    public val setTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_hand")

    public val hasPosePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPositionalTracker", "has_pose")

    public val getPosePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPositionalTracker", "get_pose")

    public val invalidatePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "invalidate_pose")

    public val setPosePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPositionalTracker", "set_pose")

    public val getInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_input")

    public val setInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_input")
  }
}
