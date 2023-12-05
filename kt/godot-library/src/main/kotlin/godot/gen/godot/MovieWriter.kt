// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class MovieWriter : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MOVIEWRITER, scriptIndex)
    return true
  }

  public open fun _getAudioMixRate(): Long {
    throw NotImplementedError("_get_audio_mix_rate is not implemented for MovieWriter")
  }

  public open fun _getAudioSpeakerMode(): AudioServer.SpeakerMode {
    throw NotImplementedError("_get_audio_speaker_mode is not implemented for MovieWriter")
  }

  public open fun _handlesFile(path: String): Boolean {
    throw NotImplementedError("_handles_file is not implemented for MovieWriter")
  }

  public open fun _writeBegin(
    movieSize: Vector2i,
    fps: Long,
    basePath: String,
  ): GodotError {
    throw NotImplementedError("_write_begin is not implemented for MovieWriter")
  }

  public open fun _writeEnd() {
  }

  public companion object {
    public fun addWriter(writer: MovieWriter) {
      TransferContext.writeArguments(OBJECT to writer)
      TransferContext.callMethod(0, MethodBindings.addWriterPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val _getAudioMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_get_audio_mix_rate")

    public val _getAudioSpeakerModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_get_audio_speaker_mode")

    public val _handlesFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_handles_file")

    public val _writeBeginPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_begin")

    public val _writeFramePtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_frame")

    public val _writeEndPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_end")

    public val addWriterPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "add_writer")
  }
}
