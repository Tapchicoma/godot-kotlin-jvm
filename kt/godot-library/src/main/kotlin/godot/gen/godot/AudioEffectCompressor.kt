// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioEffectCompressor : AudioEffect() {
  public var threshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setThresholdPtr, NIL)
    }

  public var ratio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
    }

  public var gain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
    }

  public var attackUs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttackUsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttackUsPtr, NIL)
    }

  public var releaseMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReleaseMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReleaseMsPtr, NIL)
    }

  public var mix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMixPtr, NIL)
    }

  public var sidechain: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSidechainPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSidechainPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTCOMPRESSOR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_threshold")

    public val getThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_threshold")

    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_ratio")

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_ratio")

    public val setGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_gain")

    public val getGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_gain")

    public val setAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_attack_us")

    public val getAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_attack_us")

    public val setReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_release_ms")

    public val getReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_release_ms")

    public val setMixPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_mix")

    public val getMixPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_mix")

    public val setSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_sidechain")

    public val getSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_sidechain")
  }
}
