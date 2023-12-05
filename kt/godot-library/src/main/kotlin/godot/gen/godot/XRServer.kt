// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
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
public object XRServer : Object() {
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  public val trackerAdded: Signal2<StringName, Long> by signal("trackerName", "type")

  public val trackerUpdated: Signal2<StringName, Long> by signal("trackerName", "type")

  public val trackerRemoved: Signal2<StringName, Long> by signal("trackerName", "type")

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_XRSERVER)
    return false
  }

  public fun getWorldScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorldScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setWorldScale(scale: Double) {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setWorldScalePtr, NIL)
  }

  public fun getWorldOrigin(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorldOriginPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setWorldOrigin(worldOrigin: Transform3D) {
    TransferContext.writeArguments(TRANSFORM3D to worldOrigin)
    TransferContext.callMethod(rawPtr, MethodBindings.setWorldOriginPtr, NIL)
  }

  public fun getReferenceFrame(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReferenceFramePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun centerOnHmd(rotationMode: RotationMode, keepHeight: Boolean) {
    TransferContext.writeArguments(LONG to rotationMode.id, BOOL to keepHeight)
    TransferContext.callMethod(rawPtr, MethodBindings.centerOnHmdPtr, NIL)
  }

  public fun getHmdTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHmdTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun addInterface(_interface: XRInterface) {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.addInterfacePtr, NIL)
  }

  public fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeInterface(_interface: XRInterface) {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInterfacePtr, NIL)
  }

  public fun getInterface(idx: Int): XRInterface? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  public fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun findInterface(name: String): XRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  public fun addTracker(tracker: XRPositionalTracker) {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, MethodBindings.addTrackerPtr, NIL)
  }

  public fun removeTracker(tracker: XRPositionalTracker) {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTrackerPtr, NIL)
  }

  public fun getTrackers(trackerTypes: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to trackerTypes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackersPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getTracker(trackerName: StringName): XRPositionalTracker? {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRPositionalTracker?)
  }

  public fun getPrimaryInterface(): XRInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  public fun setPrimaryInterface(_interface: XRInterface) {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  public enum class TrackerType(
    id: Long,
  ) {
    TRACKER_HEAD(1),
    TRACKER_CONTROLLER(2),
    TRACKER_BASESTATION(4),
    TRACKER_ANCHOR(8),
    TRACKER_ANY_KNOWN(127),
    TRACKER_UNKNOWN(128),
    TRACKER_ANY(255),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackerType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class RotationMode(
    id: Long,
  ) {
    RESET_FULL_ROTATION(0),
    RESET_BUT_KEEP_TILT(1),
    DONT_RESET_ROTATION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RotationMode = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_scale")

    public val setWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_scale")

    public val getWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_origin")

    public val setWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_origin")

    public val getReferenceFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_reference_frame")

    public val centerOnHmdPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "center_on_hmd")

    public val getHmdTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_hmd_transform")

    public val addInterfacePtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "add_interface")

    public val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interface_count")

    public val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_interface")

    public val getInterfacePtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_interface")

    public val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interfaces")

    public val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "find_interface")

    public val addTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "add_tracker")

    public val removeTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_tracker")

    public val getTrackersPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_trackers")

    public val getTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_tracker")

    public val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_primary_interface")

    public val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_primary_interface")
  }
}
