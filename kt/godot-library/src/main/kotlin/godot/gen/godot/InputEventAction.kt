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
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class InputEventAction : InputEvent() {
  public var action: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
    }

  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTACTION, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_action")

    public val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_action")

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_pressed")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_strength")
  }
}
