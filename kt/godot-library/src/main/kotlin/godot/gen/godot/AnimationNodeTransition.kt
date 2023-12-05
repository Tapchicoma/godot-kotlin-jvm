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
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class AnimationNodeTransition : AnimationNodeSync() {
  public var xfadeTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXfadeTimePtr, NIL)
    }

  public var xfadeCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXfadeCurvePtr, NIL)
    }

  public var allowTransitionToSelf: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowTransitionToSelfPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowTransitionToSelfPtr, NIL)
    }

  public var inputCount: Int
    @JvmName("getInputCount_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getInputCount()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInputCountPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION, scriptIndex)
    return true
  }

  public fun setInputAsAutoAdvance(input: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputAsAutoAdvancePtr, NIL)
  }

  public fun isInputSetAsAutoAdvance(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputSetAsAutoAdvancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setInputReset(input: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputResetPtr, NIL)
  }

  public fun isInputReset(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputResetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_count")

    public val setInputAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_as_auto_advance")

    public val isInputSetAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_set_as_auto_advance")

    public val setInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_reset")

    public val isInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_reset")

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_time")

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_time")

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_curve")

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_curve")

    public val setAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_allow_transition_to_self")

    public val isAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_allow_transition_to_self")
  }
}
