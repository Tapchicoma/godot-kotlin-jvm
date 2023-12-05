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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class Range : Control() {
  public val valueChanged: Signal1<Double> by signal("value")

  public val changed: Signal0 by signal()

  public var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
    }

  public var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
    }

  public var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
    }

  public var page: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPagePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPagePtr, NIL)
    }

  public var `value`: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
    }

  public var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAsRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsRatioPtr, NIL)
    }

  public var expEdit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRatioExpPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpRatioPtr, NIL)
    }

  public var rounded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingRoundedValuesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseRoundedValuesPtr, NIL)
    }

  public var allowGreater: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGreaterAllowedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowGreaterPtr, NIL)
    }

  public var allowLesser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLesserAllowedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowLesserPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RANGE, scriptIndex)
    return true
  }

  public open fun _valueChanged(newValue: Double) {
  }

  public fun setValueNoSignal(`value`: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setValueNoSignalPtr, NIL)
  }

  public fun share(with: Node) {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(rawPtr, MethodBindings.sharePtr, NIL)
  }

  public fun unshare() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unsharePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _valueChangedPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "_value_changed")

    public val getValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_value")

    public val getMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_min")

    public val getMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_max")

    public val getStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_step")

    public val getPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_page")

    public val getAsRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_as_ratio")

    public val setValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_value")

    public val setValueNoSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_value_no_signal")

    public val setMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_min")

    public val setMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_max")

    public val setStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_step")

    public val setPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_page")

    public val setAsRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_as_ratio")

    public val setUseRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_use_rounded_values")

    public val isUsingRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_using_rounded_values")

    public val setExpRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_exp_ratio")

    public val isRatioExpPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "is_ratio_exp")

    public val setAllowGreaterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_greater")

    public val isGreaterAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_greater_allowed")

    public val setAllowLesserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_lesser")

    public val isLesserAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_lesser_allowed")

    public val sharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "share")

    public val unsharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "unshare")
  }
}
