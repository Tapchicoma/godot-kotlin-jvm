// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AudioEffectPitchShift : AudioEffect() {
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

  public var oversampling: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOversamplingPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOversamplingPtr, NIL)
    }

  public var fftSize: FFTSize
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFftSizePtr, LONG)
      return AudioEffectPitchShift.FFTSize.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFftSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTPITCHSHIFT, scriptIndex)
    return true
  }

  public enum class FFTSize(
    id: Long,
  ) {
    FFT_SIZE_256(0),
    FFT_SIZE_512(1),
    FFT_SIZE_1024(2),
    FFT_SIZE_2048(3),
    FFT_SIZE_4096(4),
    FFT_SIZE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FFTSize = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_pitch_scale")

    public val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_oversampling")

    public val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_oversampling")

    public val setFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_fft_size")

    public val getFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_fft_size")
  }
}
