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
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class MenuBar : Control() {
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  public var startIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStartIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStartIndexPtr, NIL)
    }

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

  public var preferGlobalMenu: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPreferGlobalMenuPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreferGlobalMenuPtr, NIL)
    }

  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MENUBAR, scriptIndex)
    return true
  }

  public fun setDisableShortcuts(disabled: Boolean) {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableShortcutsPtr, NIL)
  }

  public fun isNativeMenu(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNativeMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getMenuCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setMenuTitle(menu: Int, title: String) {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setMenuTitlePtr, NIL)
  }

  public fun getMenuTitle(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setMenuTooltip(menu: Int, tooltip: String) {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setMenuTooltipPtr, NIL)
  }

  public fun getMenuTooltip(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setMenuDisabled(menu: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setMenuDisabledPtr, NIL)
  }

  public fun isMenuDisabled(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setMenuHidden(menu: Int, hidden: Boolean) {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, MethodBindings.setMenuHiddenPtr, NIL)
  }

  public fun isMenuHidden(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getMenuPopup(menu: Int): PopupMenu? {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  public companion object

  internal object MethodBindings {
    public val setSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_switch_on_hover")

    public val isSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_switch_on_hover")

    public val setDisableShortcutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_disable_shortcuts")

    public val setPreferGlobalMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_prefer_global_menu")

    public val isPreferGlobalMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_prefer_global_menu")

    public val isNativeMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "is_native_menu")

    public val getMenuCountPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "get_menu_count")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "get_language")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "is_flat")

    public val setStartIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_start_index")

    public val getStartIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_start_index")

    public val setMenuTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "set_menu_title")

    public val getMenuTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "get_menu_title")

    public val setMenuTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_tooltip")

    public val getMenuTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_menu_tooltip")

    public val setMenuDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_disabled")

    public val isMenuDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_menu_disabled")

    public val setMenuHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_hidden")

    public val isMenuHiddenPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "is_menu_hidden")

    public val getMenuPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "get_menu_popup")
  }
}
