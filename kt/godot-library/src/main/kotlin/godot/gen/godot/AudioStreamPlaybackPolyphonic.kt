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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AudioStreamPlaybackPolyphonic internal constructor() : AudioStreamPlayback() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun playStream(
    stream: AudioStream,
    fromOffset: Float = 0.0f,
    volumeDb: Float = 0.0f,
    pitchScale: Float = 1.0f,
  ): Long {
    TransferContext.writeArguments(OBJECT to stream, DOUBLE to fromOffset.toDouble(), DOUBLE to volumeDb.toDouble(), DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playStreamPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setStreamVolume(stream: Long, volumeDb: Float) {
    TransferContext.writeArguments(LONG to stream, DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamVolumePtr, NIL)
  }

  public fun setStreamPitchScale(stream: Long, pitchScale: Float) {
    TransferContext.writeArguments(LONG to stream, DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamPitchScalePtr, NIL)
  }

  public fun isStreamPlaying(stream: Long): Boolean {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.isStreamPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun stopStream(stream: Long) {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.stopStreamPtr, NIL)
  }

  public companion object {
    public final const val INVALID_ID: Long = -1
  }

  internal object MethodBindings {
    public val playStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "play_stream")

    public val setStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_volume")

    public val setStreamPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale")

    public val isStreamPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "is_stream_playing")

    public val stopStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "stop_stream")
  }
}
