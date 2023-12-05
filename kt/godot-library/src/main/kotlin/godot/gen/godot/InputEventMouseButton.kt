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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class InputEventMouseButton : InputEventMouse() {
  public var factor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFactorPtr, NIL)
    }

  public var buttonIndex: MouseButton
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonIndexPtr, LONG)
      return MouseButton.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonIndexPtr, NIL)
    }

  public var canceled: Boolean
    @JvmName("isCanceled_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isCanceled()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanceledPtr, NIL)
    }

  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  public var doubleClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDoubleClickPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDoubleClickPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEBUTTON, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_factor")

    public val getFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "get_factor")

    public val setButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_button_index")

    public val getButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "get_button_index")

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_pressed")

    public val setCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_canceled")

    public val setDoubleClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_double_click")

    public val isDoubleClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "is_double_click")
  }
}
