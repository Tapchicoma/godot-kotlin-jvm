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
public open class AudioEffectDistortion : AudioEffect() {
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return AudioEffectDistortion.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  public var preGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPreGainPtr, NIL)
    }

  public var keepHfHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeepHfHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepHfHzPtr, NIL)
    }

  public var drive: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrivePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDrivePtr, NIL)
    }

  public var postGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPostGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPostGainPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTDISTORTION, scriptIndex)
    return true
  }

  public enum class Mode(
    id: Long,
  ) {
    MODE_CLIP(0),
    MODE_ATAN(1),
    MODE_LOFI(2),
    MODE_OVERDRIVE(3),
    MODE_WAVESHAPE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_mode")

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_mode")

    public val setPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_pre_gain")

    public val getPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_pre_gain")

    public val setKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_keep_hf_hz")

    public val getKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_keep_hf_hz")

    public val setDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_drive")

    public val getDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_drive")

    public val setPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_post_gain")

    public val getPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_post_gain")
  }
}
