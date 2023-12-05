// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class AudioStreamWAV : AudioStream() {
  public var `data`: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
    }

  public var format: Format
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
      return AudioStreamWAV.Format.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
    }

  public var loopMode: LoopMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopModePtr, LONG)
      return AudioStreamWAV.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopModePtr, NIL)
    }

  public var loopBegin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopBeginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopBeginPtr, NIL)
    }

  public var loopEnd: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopEndPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopEndPtr, NIL)
    }

  public var mixRate: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixRatePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMixRatePtr, NIL)
    }

  public var stereo: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isStereoPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStereoPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMWAV, scriptIndex)
    return true
  }

  public fun saveToWav(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.saveToWavPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Format(
    id: Long,
  ) {
    FORMAT_8_BITS(0),
    FORMAT_16_BITS(1),
    FORMAT_IMA_ADPCM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Format = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LoopMode(
    id: Long,
  ) {
    LOOP_DISABLED(0),
    LOOP_FORWARD(1),
    LOOP_PINGPONG(2),
    LOOP_BACKWARD(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LoopMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "set_data")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "get_data")

    public val setFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "set_format")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "get_format")

    public val setLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_mode")

    public val getLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_mode")

    public val setLoopBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_begin")

    public val getLoopBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_begin")

    public val setLoopEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_end")

    public val getLoopEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_end")

    public val setMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_mix_rate")

    public val getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_mix_rate")

    public val setStereoPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "set_stereo")

    public val isStereoPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "is_stereo")

    public val saveToWavPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamWAV", "save_to_wav")
  }
}
