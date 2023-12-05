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
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioEffectDelay : AudioEffect() {
  public var dry: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
    }

  public var tap1Active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTap1ActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1ActivePtr, NIL)
    }

  public var tap1DelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1DelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1DelayMsPtr, NIL)
    }

  public var tap1LevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1LevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1LevelDbPtr, NIL)
    }

  public var tap1Pan: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1PanPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1PanPtr, NIL)
    }

  public var tap2Active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTap2ActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2ActivePtr, NIL)
    }

  public var tap2DelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2DelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2DelayMsPtr, NIL)
    }

  public var tap2LevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2LevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2LevelDbPtr, NIL)
    }

  public var tap2Pan: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2PanPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2PanPtr, NIL)
    }

  public var feedbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFeedbackActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackActivePtr, NIL)
    }

  public var feedbackDelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackDelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackDelayMsPtr, NIL)
    }

  public var feedbackLevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackLevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackLevelDbPtr, NIL)
    }

  public var feedbackLowpass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackLowpassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackLowpassPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTDELAY, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectDelay", "set_dry")

    public val getDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectDelay", "get_dry")

    public val setTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_active")

    public val isTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap1_active")

    public val setTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_delay_ms")

    public val getTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_delay_ms")

    public val setTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_level_db")

    public val getTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_level_db")

    public val setTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_pan")

    public val getTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_pan")

    public val setTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_active")

    public val isTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap2_active")

    public val setTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_delay_ms")

    public val getTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_delay_ms")

    public val setTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_level_db")

    public val getTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_level_db")

    public val setTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_pan")

    public val getTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_pan")

    public val setFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_active")

    public val isFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_feedback_active")

    public val setFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_delay_ms")

    public val getFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_delay_ms")

    public val setFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_level_db")

    public val getFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_level_db")

    public val setFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_lowpass")

    public val getFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_lowpass")
  }
}
