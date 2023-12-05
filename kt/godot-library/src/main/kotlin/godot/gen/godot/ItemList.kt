// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
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
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ItemList : Control() {
  public val itemSelected: Signal1<Long> by signal("index")

  public val emptyClicked: Signal2<Vector2, Long> by signal("atPosition", "mouseButtonIndex")

  public val itemClicked: Signal3<Long, Vector2, Long> by signal("index", "atPosition",
      "mouseButtonIndex")

  public val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  public val itemActivated: Signal1<Long> by signal("index")

  public var selectMode: SelectMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectModePtr, LONG)
      return ItemList.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectModePtr, NIL)
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

  public var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowRmbSelectPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowRmbSelectPtr, NIL)
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

  public var maxTextLines: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxTextLinesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxTextLinesPtr, NIL)
    }

  public var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutoHeightPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoHeightPtr, NIL)
    }

  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
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

  public var maxColumns: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxColumnsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxColumnsPtr, NIL)
    }

  public var sameColumnWidth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSameColumnWidthPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSameColumnWidthPtr, NIL)
    }

  public var fixedColumnWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedColumnWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedColumnWidthPtr, NIL)
    }

  public var iconMode: IconMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconModePtr, LONG)
      return ItemList.IconMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setIconModePtr, NIL)
    }

  public var iconScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setIconScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var fixedIconSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedIconSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedIconSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ITEMLIST, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = itemlist.fixedIconSize
   * //Your changes
   * itemlist.fixedIconSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fixedIconSizeMutate(block: Vector2i.() -> Unit): Vector2i = fixedIconSize.apply{
      block(this)
      fixedIconSize = this
  }


  @JvmOverloads
  public fun addItem(
    text: String,
    icon: Texture2D? = null,
    selectable: Boolean = true,
  ): Int {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addIconItem(icon: Texture2D, selectable: Boolean = true): Int {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setItemText(idx: Int, text: String) {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  public fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setItemIcon(idx: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  public fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setItemTextDirection(idx: Int, direction: Control.TextDirection) {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  public fun getItemTextDirection(idx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setItemLanguage(idx: Int, language: String) {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  public fun getItemLanguage(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setItemIconTransposed(idx: Int, transposed: Boolean) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to transposed)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconTransposedPtr, NIL)
  }

  public fun isItemIconTransposed(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemIconTransposedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setItemIconRegion(idx: Int, rect: Rect2) {
    TransferContext.writeArguments(LONG to idx.toLong(), RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconRegionPtr, NIL)
  }

  public fun getItemIconRegion(idx: Int): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setItemIconModulate(idx: Int, modulate: Color) {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  public fun getItemIconModulate(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setItemSelectable(idx: Int, selectable: Boolean) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSelectablePtr, NIL)
  }

  public fun isItemSelectable(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setItemDisabled(idx: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  public fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setItemMetadata(idx: Int, metadata: Any?) {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  public fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setItemCustomBgColor(idx: Int, customBgColor: Color) {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomBgColorPtr, NIL)
  }

  public fun getItemCustomBgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setItemCustomFgColor(idx: Int, customFgColor: Color) {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomFgColorPtr, NIL)
  }

  public fun getItemCustomFgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomFgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  @JvmOverloads
  public fun getItemRect(idx: Int, expand: Boolean = true): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to expand)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setItemTooltipEnabled(idx: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipEnabledPtr, NIL)
  }

  public fun isItemTooltipEnabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setItemTooltip(idx: Int, tooltip: String) {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  public fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun select(idx: Int, single: Boolean = true) {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to single)
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  public fun deselect(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  public fun deselectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  public fun isSelected(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSelectedItems(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedItemsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun moveItem(fromIdx: Int, toIdx: Int) {
    TransferContext.writeArguments(LONG to fromIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveItemPtr, NIL)
  }

  public fun removeItem(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun sortItemsByText() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sortItemsByTextPtr, NIL)
  }

  public fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAnythingSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getItemAtPosition(position: Vector2, exact: Boolean = false): Int {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun ensureCurrentIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ensureCurrentIsVisiblePtr, NIL)
  }

  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public enum class IconMode(
    id: Long,
  ) {
    ICON_MODE_TOP(0),
    ICON_MODE_LEFT(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): IconMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SelectMode(
    id: Long,
  ) {
    SELECT_SINGLE(0),
    SELECT_MULTI(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SelectMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "add_item")

    public val addIconItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "add_icon_item")

    public val setItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_text")

    public val getItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_text")

    public val setItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_icon")

    public val getItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_icon")

    public val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text_direction")

    public val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text_direction")

    public val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_language")

    public val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_language")

    public val setItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_transposed")

    public val isItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_icon_transposed")

    public val setItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_region")

    public val getItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_region")

    public val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_modulate")

    public val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_modulate")

    public val setItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_selectable")

    public val isItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_selectable")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_disabled")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_disabled")

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_metadata")

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_metadata")

    public val setItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_bg_color")

    public val getItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_bg_color")

    public val setItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_fg_color")

    public val getItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_fg_color")

    public val getItemRectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_rect")

    public val setItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip_enabled")

    public val isItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_tooltip_enabled")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_tooltip")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "select")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "deselect")

    public val deselectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "deselect_all")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "is_selected")

    public val getSelectedItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_selected_items")

    public val moveItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "move_item")

    public val setItemCountPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_count")

    public val getItemCountPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_count")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "remove_item")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "clear")

    public val sortItemsByTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "sort_items_by_text")

    public val setFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_column_width")

    public val getFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_column_width")

    public val setSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_same_column_width")

    public val isSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_same_column_width")

    public val setMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_text_lines")

    public val getMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_text_lines")

    public val setMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_columns")

    public val getMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_columns")

    public val setSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_select_mode")

    public val getSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_select_mode")

    public val setIconModePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_icon_mode")

    public val getIconModePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_icon_mode")

    public val setFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_icon_size")

    public val getFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_icon_size")

    public val setIconScalePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_icon_scale")

    public val getIconScalePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_icon_scale")

    public val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_rmb_select")

    public val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_rmb_select")

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_reselect")

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_reselect")

    public val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_search")

    public val setAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_auto_height")

    public val hasAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_auto_height")

    public val isAnythingSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_anything_selected")

    public val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_at_position")

    public val ensureCurrentIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "ensure_current_is_visible")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_v_scroll_bar")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_text_overrun_behavior")
  }
}
