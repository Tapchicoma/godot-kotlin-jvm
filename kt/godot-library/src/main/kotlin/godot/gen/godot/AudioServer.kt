// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
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
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object AudioServer : Object() {
  public val busLayoutChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_AUDIOSERVER)
    return false
  }

  public fun setBusCount(amount: Int) {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBusCountPtr, NIL)
  }

  public fun getBusCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBusCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeBus(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBusPtr, NIL)
  }

  @JvmOverloads
  public fun addBus(atPosition: Int = -1) {
    TransferContext.writeArguments(LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBusPtr, NIL)
  }

  public fun moveBus(index: Int, toIndex: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to toIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveBusPtr, NIL)
  }

  public fun setBusName(busIdx: Int, name: String) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusNamePtr, NIL)
  }

  public fun getBusName(busIdx: Int): String {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getBusIndex(busName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to busName)
    TransferContext.callMethod(rawPtr, MethodBindings.getBusIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBusChannels(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setBusVolumeDb(busIdx: Int, volumeDb: Float) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBusVolumeDbPtr, NIL)
  }

  public fun getBusVolumeDb(busIdx: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBusSend(busIdx: Int, send: StringName) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING_NAME to send)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusSendPtr, NIL)
  }

  public fun getBusSend(busIdx: Int): StringName {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusSendPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBusSolo(busIdx: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusSoloPtr, NIL)
  }

  public fun isBusSolo(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusSoloPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setBusMute(busIdx: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusMutePtr, NIL)
  }

  public fun isBusMute(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusMutePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setBusBypassEffects(busIdx: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusBypassEffectsPtr, NIL)
  }

  public fun isBusBypassingEffects(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusBypassingEffectsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect,
    atPosition: Int = -1,
  ) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), OBJECT to effect, LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBusEffectPtr, NIL)
  }

  public fun removeBusEffect(busIdx: Int, effectIdx: Int) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBusEffectPtr, NIL)
  }

  public fun getBusEffectCount(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioEffect?)
  }

  @JvmOverloads
  public fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int = 0,
  ): AudioEffectInstance? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioEffectInstance?)
  }

  public fun swapBusEffects(
    busIdx: Int,
    effectIdx: Int,
    byEffectIdx: Int,
  ) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to byEffectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.swapBusEffectsPtr, NIL)
  }

  public fun setBusEffectEnabled(
    busIdx: Int,
    effectIdx: Int,
    enabled: Boolean,
  ) {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusEffectEnabledPtr, NIL)
  }

  public fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusEffectEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusPeakVolumeLeftDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusPeakVolumeRightDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPlaybackSpeedScale(scale: Float) {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPlaybackSpeedScalePtr, NIL)
  }

  public fun getPlaybackSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun lock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.lockPtr, NIL)
  }

  public fun unlock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unlockPtr, NIL)
  }

  public fun getSpeakerMode(): SpeakerMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpeakerModePtr, LONG)
    return AudioServer.SpeakerMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMixRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getOutputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getOutputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setOutputDevice(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputDevicePtr, NIL)
  }

  public fun getTimeToNextMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeToNextMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getTimeSinceLastMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeSinceLastMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getOutputLatency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputLatencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getInputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getInputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setInputDevice(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputDevicePtr, NIL)
  }

  public fun setBusLayout(busLayout: AudioBusLayout) {
    TransferContext.writeArguments(OBJECT to busLayout)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusLayoutPtr, NIL)
  }

  public fun generateBusLayout(): AudioBusLayout? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateBusLayoutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioBusLayout?)
  }

  public fun setEnableTaggingUsedAudioStreams(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnableTaggingUsedAudioStreamsPtr, NIL)
  }

  public enum class SpeakerMode(
    id: Long,
  ) {
    SPEAKER_MODE_STEREO(0),
    SPEAKER_SURROUND_31(1),
    SPEAKER_SURROUND_51(2),
    SPEAKER_SURROUND_71(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpeakerMode = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val setBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_count")

    public val getBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_count")

    public val removeBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "remove_bus")

    public val addBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "add_bus")

    public val moveBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "move_bus")

    public val setBusNamePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_name")

    public val getBusNamePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_bus_name")

    public val getBusIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_index")

    public val getBusChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_channels")

    public val setBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_volume_db")

    public val getBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_volume_db")

    public val setBusSendPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_send")

    public val getBusSendPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_bus_send")

    public val setBusSoloPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_solo")

    public val isBusSoloPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "is_bus_solo")

    public val setBusMutePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_mute")

    public val isBusMutePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "is_bus_mute")

    public val setBusBypassEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_bypass_effects")

    public val isBusBypassingEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_bypassing_effects")

    public val addBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "add_bus_effect")

    public val removeBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "remove_bus_effect")

    public val getBusEffectCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_count")

    public val getBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect")

    public val getBusEffectInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_instance")

    public val swapBusEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "swap_bus_effects")

    public val setBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_effect_enabled")

    public val isBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_effect_enabled")

    public val getBusPeakVolumeLeftDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_left_db")

    public val getBusPeakVolumeRightDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_right_db")

    public val setPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_playback_speed_scale")

    public val getPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_playback_speed_scale")

    public val lockPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "lock")

    public val unlockPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "unlock")

    public val getSpeakerModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_speaker_mode")

    public val getMixRatePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_mix_rate")

    public val getOutputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device_list")

    public val getOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device")

    public val setOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_output_device")

    public val getTimeToNextMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_to_next_mix")

    public val getTimeSinceLastMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_since_last_mix")

    public val getOutputLatencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_latency")

    public val getInputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device_list")

    public val getInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device")

    public val setInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_input_device")

    public val setBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_layout")

    public val generateBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "generate_bus_layout")

    public val setEnableTaggingUsedAudioStreamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_enable_tagging_used_audio_streams")
  }
}
