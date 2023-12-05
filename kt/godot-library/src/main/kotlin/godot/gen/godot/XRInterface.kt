// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.Projection
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
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PROJECTION
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
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
public open class XRInterface internal constructor() : RefCounted() {
  public val playAreaChanged: Signal1<Long> by signal("mode")

  public var interfaceIsPrimary: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPrimaryPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPrimaryPtr, NIL)
    }

  public val xrPlayAreaMode: PlayAreaMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlayAreaModePtr, LONG)
      return XRInterface.PlayAreaMode.from(TransferContext.readReturnValue(LONG) as Long)
    }

  public var arIsAnchorDetectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorDetectionIsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnchorDetectionIsEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRINTERFACE, scriptIndex)
    return true
  }

  public fun getName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getCapabilities(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCapabilitiesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun isInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInitializedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun initialize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.initializePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun uninitialize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.uninitializePtr, NIL)
  }

  public fun getSystemInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getTrackingStatus(): TrackingStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackingStatusPtr, LONG)
    return XRInterface.TrackingStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getRenderTargetSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderTargetSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun triggerHapticPulse(
    actionName: String,
    trackerName: StringName,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ) {
    TransferContext.writeArguments(STRING to actionName, STRING_NAME to trackerName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  public fun supportsPlayAreaMode(mode: PlayAreaMode): Boolean {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.supportsPlayAreaModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setPlayAreaMode(mode: PlayAreaMode): Boolean {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPlayAreaModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPlayArea(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayAreaPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getCameraFeedId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isPassthroughSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPassthroughSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isPassthroughEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPassthroughEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun startPassthrough(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.startPassthroughPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun stopPassthrough() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPassthroughPtr, NIL)
  }

  public fun getTransformForView(view: Long, camTransform: Transform3D): Transform3D {
    TransferContext.writeArguments(LONG to view, TRANSFORM3D to camTransform)
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformForViewPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getProjectionForView(
    view: Long,
    aspect: Double,
    near: Double,
    far: Double,
  ): Projection {
    TransferContext.writeArguments(LONG to view, DOUBLE to aspect, DOUBLE to near, DOUBLE to far)
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectionForViewPtr, PROJECTION)
    return (TransferContext.readReturnValue(PROJECTION, false) as Projection)
  }

  public fun getSupportedEnvironmentBlendModes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSupportedEnvironmentBlendModesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun setEnvironmentBlendMode(mode: EnvironmentBlendMode): Boolean {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentBlendModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Capabilities(
    id: Long,
  ) {
    XR_NONE(0),
    XR_MONO(1),
    XR_STEREO(2),
    XR_QUAD(4),
    XR_VR(8),
    XR_AR(16),
    XR_EXTERNAL(32),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Capabilities = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TrackingStatus(
    id: Long,
  ) {
    XR_NORMAL_TRACKING(0),
    XR_EXCESSIVE_MOTION(1),
    XR_INSUFFICIENT_FEATURES(2),
    XR_UNKNOWN_TRACKING(3),
    XR_NOT_TRACKING(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackingStatus = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PlayAreaMode(
    id: Long,
  ) {
    XR_PLAY_AREA_UNKNOWN(0),
    XR_PLAY_AREA_3DOF(1),
    XR_PLAY_AREA_SITTING(2),
    XR_PLAY_AREA_ROOMSCALE(3),
    XR_PLAY_AREA_STAGE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlayAreaMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentBlendMode(
    id: Long,
  ) {
    XR_ENV_BLEND_MODE_OPAQUE(0),
    XR_ENV_BLEND_MODE_ADDITIVE(1),
    XR_ENV_BLEND_MODE_ALPHA_BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentBlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRInterface", "get_name")

    public val getCapabilitiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_capabilities")

    public val isPrimaryPtr: VoidPtr = TypeManager.getMethodBindPtr("XRInterface", "is_primary")

    public val setPrimaryPtr: VoidPtr = TypeManager.getMethodBindPtr("XRInterface", "set_primary")

    public val isInitializedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "is_initialized")

    public val initializePtr: VoidPtr = TypeManager.getMethodBindPtr("XRInterface", "initialize")

    public val uninitializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "uninitialize")

    public val getSystemInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_system_info")

    public val getTrackingStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_tracking_status")

    public val getRenderTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_render_target_size")

    public val getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_view_count")

    public val triggerHapticPulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "trigger_haptic_pulse")

    public val supportsPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "supports_play_area_mode")

    public val getPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_play_area_mode")

    public val setPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "set_play_area_mode")

    public val getPlayAreaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_play_area")

    public val getAnchorDetectionIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_anchor_detection_is_enabled")

    public val setAnchorDetectionIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "set_anchor_detection_is_enabled")

    public val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_camera_feed_id")

    public val isPassthroughSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "is_passthrough_supported")

    public val isPassthroughEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "is_passthrough_enabled")

    public val startPassthroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "start_passthrough")

    public val stopPassthroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "stop_passthrough")

    public val getTransformForViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_transform_for_view")

    public val getProjectionForViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_projection_for_view")

    public val getSupportedEnvironmentBlendModesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "get_supported_environment_blend_modes")

    public val setEnvironmentBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterface", "set_environment_blend_mode")
  }
}
