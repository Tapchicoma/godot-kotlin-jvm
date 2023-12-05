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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AcceptDialog : Window() {
  public val confirmed: Signal0 by signal()

  public val canceled: Signal0 by signal()

  public val customAction: Signal1<StringName> by signal("action")

  public var okButtonText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOkButtonTextPtr, NIL)
    }

  public var dialogText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  public var dialogHideOnOk: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHideOnOkPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnOkPtr, NIL)
    }

  public var dialogCloseOnEscape: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCloseOnEscapePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCloseOnEscapePtr, NIL)
    }

  public var dialogAutowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutowrapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ACCEPTDIALOG, scriptIndex)
    return true
  }

  public fun getOkButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Label?)
  }

  @JvmOverloads
  public fun addButton(
    text: String,
    right: Boolean = false,
    action: String = "",
  ): Button? {
    TransferContext.writeArguments(STRING to text, BOOL to right, STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.addButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public fun addCancelButton(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public fun removeButton(button: Control) {
    TransferContext.writeArguments(OBJECT to button)
    TransferContext.callMethod(rawPtr, MethodBindings.removeButtonPtr, NIL)
  }

  public fun registerTextEnter(lineEdit: Control) {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, MethodBindings.registerTextEnterPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getOkButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "get_label")

    public val setHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_hide_on_ok")

    public val getHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_hide_on_ok")

    public val setCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_close_on_escape")

    public val getCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_close_on_escape")

    public val addButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "add_button")

    public val addCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "add_cancel_button")

    public val removeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "remove_button")

    public val registerTextEnterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "register_text_enter")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "get_text")

    public val setAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_autowrap")

    public val hasAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "has_autowrap")

    public val setOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_ok_button_text")

    public val getOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button_text")
  }
}
