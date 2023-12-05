// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class VideoStreamPlayback : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIDEOSTREAMPLAYBACK, scriptIndex)
    return true
  }

  public open fun _stop() {
  }

  public open fun _play() {
  }

  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for VideoStreamPlayback")
  }

  public open fun _setPaused(paused: Boolean) {
  }

  public open fun _isPaused(): Boolean {
    throw NotImplementedError("_is_paused is not implemented for VideoStreamPlayback")
  }

  public open fun _getLength(): Double {
    throw NotImplementedError("_get_length is not implemented for VideoStreamPlayback")
  }

  public open fun _getPlaybackPosition(): Double {
    throw NotImplementedError("_get_playback_position is not implemented for VideoStreamPlayback")
  }

  public open fun _seek(time: Double) {
  }

  public open fun _setAudioTrack(idx: Int) {
  }

  public open fun _getTexture(): Texture2D? {
    throw NotImplementedError("_get_texture is not implemented for VideoStreamPlayback")
  }

  public open fun _update(delta: Double) {
  }

  public open fun _getChannels(): Int {
    throw NotImplementedError("_get_channels is not implemented for VideoStreamPlayback")
  }

  public open fun _getMixRate(): Int {
    throw NotImplementedError("_get_mix_rate is not implemented for VideoStreamPlayback")
  }

  @JvmOverloads
  public fun mixAudio(
    numFrames: Int,
    buffer: PackedFloat32Array = PackedFloat32Array(),
    offset: Int = 0,
  ): Int {
    TransferContext.writeArguments(LONG to numFrames.toLong(), PACKED_FLOAT_32_ARRAY to buffer, LONG to offset.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.mixAudioPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val _stopPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayback", "_stop")

    public val _playPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayback", "_play")

    public val _isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_is_playing")

    public val _setPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_set_paused")

    public val _isPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_is_paused")

    public val _getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_get_length")

    public val _getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_get_playback_position")

    public val _seekPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayback", "_seek")

    public val _setAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_set_audio_track")

    public val _getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_get_texture")

    public val _updatePtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayback", "_update")

    public val _getChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_get_channels")

    public val _getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "_get_mix_rate")

    public val mixAudioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayback", "mix_audio")
  }
}
