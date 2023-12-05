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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class AudioStream : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAM, scriptIndex)
    return true
  }

  public open fun _instantiatePlayback(): AudioStreamPlayback? {
    throw NotImplementedError("_instantiate_playback is not implemented for AudioStream")
  }

  public open fun _getStreamName(): String {
    throw NotImplementedError("_get_stream_name is not implemented for AudioStream")
  }

  public open fun _getLength(): Double {
    throw NotImplementedError("_get_length is not implemented for AudioStream")
  }

  public open fun _isMonophonic(): Boolean {
    throw NotImplementedError("_is_monophonic is not implemented for AudioStream")
  }

  public open fun _getBpm(): Double {
    throw NotImplementedError("_get_bpm is not implemented for AudioStream")
  }

  public open fun _getBeatCount(): Int {
    throw NotImplementedError("_get_beat_count is not implemented for AudioStream")
  }

  public fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun isMonophonic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMonophonicPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun instantiatePlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.instantiatePlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
  }

  public companion object

  internal object MethodBindings {
    public val _instantiatePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "_instantiate_playback")

    public val _getStreamNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "_get_stream_name")

    public val _getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStream", "_get_length")

    public val _isMonophonicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "_is_monophonic")

    public val _getBpmPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStream", "_get_bpm")

    public val _getBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "_get_beat_count")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStream", "get_length")

    public val isMonophonicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "is_monophonic")

    public val instantiatePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStream", "instantiate_playback")
  }
}
