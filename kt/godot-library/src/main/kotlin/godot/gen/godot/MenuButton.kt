// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class MenuButton : Button() {
  public val aboutToPopup: Signal0 by signal()

  public var switchOnHover: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSwitchOnHoverPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwitchOnHoverPtr, NIL)
    }

  public var itemCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setItemCountPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MENUBUTTON, scriptIndex)
    return true
  }

  public fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  public fun showPopup() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPopupPtr, NIL)
  }

  public fun setDisableShortcuts(disabled: Boolean) {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableShortcutsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuButton", "get_popup")

    public val showPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuButton", "show_popup")

    public val setSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuButton", "set_switch_on_hover")

    public val isSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuButton", "is_switch_on_hover")

    public val setDisableShortcutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuButton", "set_disable_shortcuts")

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuButton", "set_item_count")

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuButton", "get_item_count")
  }
}
