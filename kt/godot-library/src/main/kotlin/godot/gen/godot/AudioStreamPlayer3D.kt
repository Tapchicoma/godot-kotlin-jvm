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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AudioStreamPlayer3D : Node3D() {
  public val finished: Signal0 by signal()

  public var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
    }

  public var attenuationModel: AttenuationModel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationModelPtr, LONG)
      return AudioStreamPlayer3D.AttenuationModel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationModelPtr, NIL)
    }

  public var volumeDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
    }

  public var unitSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnitSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUnitSizePtr, NIL)
    }

  public var maxDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDbPtr, NIL)
    }

  public var pitchScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPitchScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPitchScalePtr, NIL)
    }

  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoplayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  public var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPausedPtr, NIL)
    }

  public var maxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
    }

  public var maxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPolyphonyPtr, NIL)
    }

  public var panningStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanningStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPanningStrengthPtr, NIL)
    }

  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBusPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBusPtr, NIL)
    }

  public var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAreaMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAreaMaskPtr, NIL)
    }

  public var emissionAngleEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmissionAngleEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAngleEnabledPtr, NIL)
    }

  public var emissionAngleDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAnglePtr, NIL)
    }

  public var emissionAngleFilterAttenuationDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionAngleFilterAttenuationDbPtr,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAngleFilterAttenuationDbPtr, NIL)
    }

  public var attenuationFilterCutoffHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationFilterCutoffHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationFilterCutoffHzPtr, NIL)
    }

  public var attenuationFilterDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationFilterDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationFilterDbPtr, NIL)
    }

  public var dopplerTracking: DopplerTracking
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDopplerTrackingPtr, LONG)
      return AudioStreamPlayer3D.DopplerTracking.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDopplerTrackingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER3D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun play(fromPosition: Float = 0.0f) {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  public fun seek(toPosition: Float) {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
  }

  public enum class AttenuationModel(
    id: Long,
  ) {
    ATTENUATION_INVERSE_DISTANCE(0),
    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),
    ATTENUATION_LOGARITHMIC(2),
    ATTENUATION_DISABLED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AttenuationModel = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DopplerTracking(
    id: Long,
  ) {
    DOPPLER_TRACKING_DISABLED(0),
    DOPPLER_TRACKING_IDLE_STEP(1),
    DOPPLER_TRACKING_PHYSICS_STEP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DopplerTracking = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_volume_db")

    public val setUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_unit_size")

    public val getUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_unit_size")

    public val setMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_db")

    public val getMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_db")

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_pitch_scale")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "play")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "seek")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_playing")

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_position")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_bus")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_autoplay")

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_autoplay_enabled")

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_distance")

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_distance")

    public val setAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_area_mask")

    public val getAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_area_mask")

    public val setEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle")

    public val getEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle")

    public val setEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_enabled")

    public val isEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_emission_angle_enabled")

    public val setEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db")

    public val getEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db")

    public val setAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz")

    public val getAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz")

    public val setAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_db")

    public val getAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_db")

    public val setAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_model")

    public val getAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_model")

    public val setDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_doppler_tracking")

    public val getDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_doppler_tracking")

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream_paused")

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_paused")

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_polyphony")

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_polyphony")

    public val setPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_panning_strength")

    public val getPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_panning_strength")

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "has_stream_playback")

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_playback")
  }
}
