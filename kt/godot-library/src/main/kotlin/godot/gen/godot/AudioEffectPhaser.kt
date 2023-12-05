// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioEffectPhaser : AudioEffect() {
  public var rangeMinHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangeMinHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRangeMinHzPtr, NIL)
    }

  public var rangeMaxHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRangeMaxHzPtr, NIL)
    }

  public var rateHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRateHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRateHzPtr, NIL)
    }

  public var feedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackPtr, NIL)
    }

  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTPHASER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_min_hz")

    public val getRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_min_hz")

    public val setRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_max_hz")

    public val getRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_max_hz")

    public val setRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_rate_hz")

    public val getRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_rate_hz")

    public val setFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_feedback")

    public val getFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_feedback")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_depth")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_depth")
  }
}
