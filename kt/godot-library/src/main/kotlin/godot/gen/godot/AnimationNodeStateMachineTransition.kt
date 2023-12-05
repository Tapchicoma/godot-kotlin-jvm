// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class AnimationNodeStateMachineTransition : Resource() {
  public val advanceConditionChanged: Signal0 by signal()

  public var xfadeTime: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
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

  public var reset: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResetPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetPtr, NIL)
    }

  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  public var switchMode: SwitchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwitchModePtr, LONG)
      return AnimationNodeStateMachineTransition.SwitchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwitchModePtr, NIL)
    }

  public var advanceMode: AdvanceMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceModePtr, LONG)
      return AnimationNodeStateMachineTransition.AdvanceMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceModePtr, NIL)
    }

  public var advanceCondition: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceConditionPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceConditionPtr, NIL)
    }

  public var advanceExpression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceExpressionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceExpressionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION, scriptIndex)
    return true
  }

  public enum class SwitchMode(
    id: Long,
  ) {
    SWITCH_MODE_IMMEDIATE(0),
    SWITCH_MODE_SYNC(1),
    SWITCH_MODE_AT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SwitchMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AdvanceMode(
    id: Long,
  ) {
    ADVANCE_MODE_DISABLED(0),
    ADVANCE_MODE_ENABLED(1),
    ADVANCE_MODE_AUTO(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AdvanceMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_switch_mode")

    public val getSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_switch_mode")

    public val setAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_mode")

    public val getAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_mode")

    public val setAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_condition")

    public val getAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_condition")

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_time")

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_time")

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_curve")

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_curve")

    public val setResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_reset")

    public val isResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "is_reset")

    public val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_priority")

    public val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_priority")

    public val setAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_expression")

    public val getAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_expression")
  }
}
