// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PopupMenu : Popup() {
  public val idPressed: Signal1<Long> by signal("id")

  public val idFocused: Signal1<Long> by signal("id")

  public val indexPressed: Signal1<Long> by signal("index")

  public val menuChanged: Signal0 by signal()

  public var hideOnItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnItemSelectionPtr, NIL)
    }

  public var hideOnCheckableItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnCheckableItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnCheckableItemSelectionPtr, NIL)
    }

  public var hideOnStateItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnStateItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnStateItemSelectionPtr, NIL)
    }

  public var submenuPopupDelay: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubmenuPopupDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubmenuPopupDelayPtr, NIL)
    }

  public var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowSearchPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowSearchPtr, NIL)
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
    callConstructor(ENGINECLASS_POPUPMENU, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, NIL)
  }

  @JvmOverloads
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, NIL)
  }

  @JvmOverloads
  public fun addCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addCheckItemPtr, NIL)
  }

  @JvmOverloads
  public fun addIconCheckItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconCheckItemPtr, NIL)
  }

  @JvmOverloads
  public fun addRadioCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addRadioCheckItemPtr, NIL)
  }

  @JvmOverloads
  public fun addIconRadioCheckItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconRadioCheckItemPtr, NIL)
  }

  @JvmOverloads
  public fun addMultistateItem(
    label: String,
    maxStates: Int,
    defaultState: Int = 0,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ) {
    TransferContext.writeArguments(STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addMultistateItemPtr, NIL)
  }

  @JvmOverloads
  public fun addShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addIconShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addCheckShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addIconCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconCheckShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addRadioCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addRadioCheckShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addIconRadioCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconRadioCheckShortcutPtr, NIL)
  }

  @JvmOverloads
  public fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int = -1,
  ) {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSubmenuItemPtr, NIL)
  }

  public fun setItemText(index: Int, text: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  public fun setItemTextDirection(index: Int, direction: Control.TextDirection) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  public fun setItemLanguage(index: Int, language: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  public fun setItemIcon(index: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  public fun setItemIconMaxWidth(index: Int, width: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconMaxWidthPtr, NIL)
  }

  public fun setItemIconModulate(index: Int, modulate: Color) {
    TransferContext.writeArguments(LONG to index.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  public fun setItemChecked(index: Int, checked: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCheckedPtr, NIL)
  }

  public fun setItemId(index: Int, id: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIdPtr, NIL)
  }

  public fun setItemAccelerator(index: Int, accel: Key) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAcceleratorPtr, NIL)
  }

  public fun setItemMetadata(index: Int, metadata: Any?) {
    TransferContext.writeArguments(LONG to index.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  public fun setItemDisabled(index: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  public fun setItemSubmenu(index: Int, submenu: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to submenu)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSubmenuPtr, NIL)
  }

  public fun setItemAsSeparator(index: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsSeparatorPtr, NIL)
  }

  public fun setItemAsCheckable(index: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsCheckablePtr, NIL)
  }

  public fun setItemAsRadioCheckable(index: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsRadioCheckablePtr, NIL)
  }

  public fun setItemTooltip(index: Int, tooltip: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  @JvmOverloads
  public fun setItemShortcut(
    index: Int,
    shortcut: Shortcut,
    global: Boolean = false,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to shortcut, BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemShortcutPtr, NIL)
  }

  public fun setItemIndent(index: Int, indent: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to indent.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIndentPtr, NIL)
  }

  public fun setItemMultistate(index: Int, state: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to state.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMultistatePtr, NIL)
  }

  public fun setItemShortcutDisabled(index: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemShortcutDisabledPtr, NIL)
  }

  public fun toggleItemChecked(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleItemCheckedPtr, NIL)
  }

  public fun toggleItemMultistate(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleItemMultistatePtr, NIL)
  }

  public fun getItemText(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getItemTextDirection(index: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getItemLanguage(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getItemIcon(index: Int): Texture2D? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun getItemIconMaxWidth(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getItemIconModulate(index: Int): Color {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun isItemChecked(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getItemId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getItemIndex(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getItemAccelerator(index: Int): Key {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getItemMetadata(index: Int): Any? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun isItemDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getItemSubmenu(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemSubmenuPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isItemSeparator(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSeparatorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isItemCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isItemRadioCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isItemShortcutDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemShortcutDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getItemTooltip(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getItemShortcut(index: Int): Shortcut? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemShortcutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
  }

  public fun getItemIndent(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFocusedItem(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusedItemPtr, NIL)
  }

  public fun getFocusedItem(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusedItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun scrollToItem(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToItemPtr, NIL)
  }

  public fun removeItem(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  @JvmOverloads
  public fun addSeparator(label: String = "", id: Int = -1) {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSeparatorPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_item")

    public val addIconItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_icon_item")

    public val addCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_check_item")

    public val addIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_check_item")

    public val addRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_radio_check_item")

    public val addIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_radio_check_item")

    public val addMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_multistate_item")

    public val addShortcutPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_shortcut")

    public val addIconShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_shortcut")

    public val addCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_check_shortcut")

    public val addIconCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_check_shortcut")

    public val addRadioCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_radio_check_shortcut")

    public val addIconRadioCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_radio_check_shortcut")

    public val addSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_submenu_item")

    public val setItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_text")

    public val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_text_direction")

    public val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_language")

    public val setItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon")

    public val setItemIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon_max_width")

    public val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon_modulate")

    public val setItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_checked")

    public val setItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_id")

    public val setItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_accelerator")

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_metadata")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_disabled")

    public val setItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_submenu")

    public val setItemAsSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_separator")

    public val setItemAsCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_checkable")

    public val setItemAsRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_radio_checkable")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_tooltip")

    public val setItemShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_shortcut")

    public val setItemIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_indent")

    public val setItemMultistatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_multistate")

    public val setItemShortcutDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_shortcut_disabled")

    public val toggleItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "toggle_item_checked")

    public val toggleItemMultistatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "toggle_item_multistate")

    public val getItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_text")

    public val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_text_direction")

    public val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_language")

    public val getItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon")

    public val getItemIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon_max_width")

    public val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon_modulate")

    public val isItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_checked")

    public val getItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_id")

    public val getItemIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_index")

    public val getItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_accelerator")

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_metadata")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_disabled")

    public val getItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_submenu")

    public val isItemSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_separator")

    public val isItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_checkable")

    public val isItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_radio_checkable")

    public val isItemShortcutDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_shortcut_disabled")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_tooltip")

    public val getItemShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_shortcut")

    public val getItemIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_indent")

    public val setFocusedItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_focused_item")

    public val getFocusedItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_focused_item")

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_count")

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_count")

    public val scrollToItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "scroll_to_item")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "remove_item")

    public val addSeparatorPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_separator")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "clear")

    public val setHideOnItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_item_selection")

    public val isHideOnItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_item_selection")

    public val setHideOnCheckableItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_checkable_item_selection")

    public val isHideOnCheckableItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_checkable_item_selection")

    public val setHideOnStateItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_state_item_selection")

    public val isHideOnStateItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_state_item_selection")

    public val setSubmenuPopupDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_submenu_popup_delay")

    public val getSubmenuPopupDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_submenu_popup_delay")

    public val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_allow_search")
  }
}
