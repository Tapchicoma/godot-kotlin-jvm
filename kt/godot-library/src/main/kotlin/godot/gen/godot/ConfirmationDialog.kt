// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class ConfirmationDialog : AcceptDialog() {
  public var cancelButtonText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCancelButtonTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCancelButtonTextPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONFIRMATIONDIALOG, scriptIndex)
    return true
  }

  public fun getCancelButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public companion object

  internal object MethodBindings {
    public val getCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button")

    public val setCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "set_cancel_button_text")

    public val getCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button_text")
  }
}
