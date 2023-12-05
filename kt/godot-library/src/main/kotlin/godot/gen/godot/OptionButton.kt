// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class OptionButton : Button() {
  public val itemSelected: Signal1<Long> by signal("index")

  public val itemFocused: Signal1<Long> by signal("index")

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

  public val selected: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }

  public var fitToLongestItem: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFitToLongestItemPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFitToLongestItemPtr, NIL)
    }

  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowReselectPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowReselectPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPTIONBUTTON, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addItem(label: String, id: Int = -1) {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, NIL)
  }

  @JvmOverloads
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, NIL)
  }

  public fun setItemText(idx: Int, text: String) {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  public fun setItemIcon(idx: Int, texture: Texture2D) {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  public fun setItemDisabled(idx: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  public fun setItemId(idx: Int, id: Int) {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIdPtr, NIL)
  }

  public fun setItemMetadata(idx: Int, metadata: Any?) {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  public fun setItemTooltip(idx: Int, tooltip: String) {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  public fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun getItemId(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getItemIndex(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isItemSeparator(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSeparatorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addSeparator(text: String = "") {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.addSeparatorPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun select(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  public fun getSelectedId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun removeItem(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
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

  public fun hasSelectableItems(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectableItemsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getSelectableItem(fromLast: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to fromLast)
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectableItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "add_item")

    public val addIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "add_icon_item")

    public val setItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_text")

    public val setItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_icon")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_disabled")

    public val setItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "set_item_id")

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_metadata")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_tooltip")

    public val getItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_text")

    public val getItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_icon")

    public val getItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "get_item_id")

    public val getItemIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_index")

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_metadata")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_tooltip")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_item_disabled")

    public val isItemSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_item_separator")

    public val addSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "add_separator")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "clear")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "select")

    public val getSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected")

    public val getSelectedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected_id")

    public val getSelectedMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected_metadata")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "remove_item")

    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "get_popup")

    public val showPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "show_popup")

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_count")

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_count")

    public val hasSelectableItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "has_selectable_items")

    public val getSelectableItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selectable_item")

    public val setFitToLongestItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_fit_to_longest_item")

    public val isFitToLongestItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_fit_to_longest_item")

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_allow_reselect")

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_allow_reselect")
  }
}
