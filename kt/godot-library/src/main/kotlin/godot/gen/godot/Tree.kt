// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Tree : Control() {
  public val itemSelected: Signal0 by signal()

  public val cellSelected: Signal0 by signal()

  public val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  public val itemMouseSelected: Signal2<Vector2, Long> by signal("position", "mouseButtonIndex")

  public val emptyClicked: Signal2<Vector2, Long> by signal("position", "mouseButtonIndex")

  public val itemEdited: Signal0 by signal()

  public val customItemClicked: Signal1<Long> by signal("mouseButtonIndex")

  public val itemIconDoubleClicked: Signal0 by signal()

  public val itemCollapsed: Signal1<TreeItem> by signal("item")

  public val checkPropagatedToItem: Signal2<TreeItem, Long> by signal("item", "column")

  public val buttonClicked: Signal4<TreeItem, Long, Long, Long> by signal("item", "column", "id",
      "mouseButtonIndex")

  public val customPopupEdited: Signal1<Boolean> by signal("arrowClicked")

  public val itemActivated: Signal0 by signal()

  public val columnTitleClicked: Signal2<Long, Long> by signal("column", "mouseButtonIndex")

  public val nothingSelected: Signal0 by signal()

  public var columns: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColumnsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setColumnsPtr, NIL)
    }

  public var columnTitlesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areColumnTitlesVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitlesVisiblePtr, NIL)
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

  public var hideFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFoldingHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideFoldingPtr, NIL)
    }

  public var enableRecursiveFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRecursiveFoldingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableRecursiveFoldingPtr, NIL)
    }

  public var hideRoot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRootHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideRootPtr, NIL)
    }

  public var dropModeFlags: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDropModeFlagsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDropModeFlagsPtr, NIL)
    }

  public var selectMode: SelectMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectModePtr, LONG)
      return Tree.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectModePtr, NIL)
    }

  public var scrollHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollEnabledPtr, NIL)
    }

  public var scrollVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TREE, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  @JvmOverloads
  public fun createItem(parent: TreeItem? = null, index: Int = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createItemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun setColumnCustomMinimumWidth(column: Int, minWidth: Int) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to minWidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnCustomMinimumWidthPtr, NIL)
  }

  public fun setColumnExpand(column: Int, expand: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnExpandPtr, NIL)
  }

  public fun setColumnExpandRatio(column: Int, ratio: Int) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to ratio.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnExpandRatioPtr, NIL)
  }

  public fun setColumnClipContent(column: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnClipContentPtr, NIL)
  }

  public fun isColumnExpanding(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isColumnExpandingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isColumnClippingContent(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isColumnClippingContentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getColumnExpandRatio(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnExpandRatioPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getColumnWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNextSelected(from: TreeItem): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getSelected(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun setSelected(item: TreeItem, column: Int) {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
  }

  public fun getSelectedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPressedButton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPressedButtonPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun deselectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  public fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getEditedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun editSelected(forceEdit: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to forceEdit)
    TransferContext.callMethod(rawPtr, MethodBindings.editSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomPopupRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  @JvmOverloads
  public fun getItemAreaRect(
    item: TreeItem,
    column: Int = -1,
    buttonIndex: Int = -1,
  ): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAreaRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAtPositionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getColumnAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getDropSectionAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getDropSectionAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getButtonIdAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonIdAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun ensureCursorIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ensureCursorIsVisiblePtr, NIL)
  }

  public fun setColumnTitle(column: Int, title: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitlePtr, NIL)
  }

  public fun getColumnTitle(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setColumnTitleAlignment(column: Int, titleAlignment: HorizontalAlignment) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to titleAlignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleAlignmentPtr, NIL)
  }

  public fun getColumnTitleAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setColumnTitleDirection(column: Int, direction: Control.TextDirection) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleDirectionPtr, NIL)
  }

  public fun getColumnTitleDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setColumnTitleLanguage(column: Int, language: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleLanguagePtr, NIL)
  }

  public fun getColumnTitleLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun scrollToItem(item: TreeItem, centerOnItem: Boolean = false) {
    TransferContext.writeArguments(OBJECT to item, BOOL to centerOnItem)
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToItemPtr, NIL)
  }

  public enum class SelectMode(
    id: Long,
  ) {
    SELECT_SINGLE(0),
    SELECT_ROW(1),
    SELECT_MULTI(2),
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

  public enum class DropModeFlags(
    id: Long,
  ) {
    DROP_MODE_DISABLED(0),
    DROP_MODE_ON_ITEM(1),
    DROP_MODE_INBETWEEN(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DropModeFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "clear")

    public val createItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "create_item")

    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_root")

    public val setColumnCustomMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_custom_minimum_width")

    public val setColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand")

    public val setColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand_ratio")

    public val setColumnClipContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_clip_content")

    public val isColumnExpandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_expanding")

    public val isColumnClippingContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_clipping_content")

    public val getColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_expand_ratio")

    public val getColumnWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_column_width")

    public val setHideRootPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_hide_root")

    public val isRootHiddenPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "is_root_hidden")

    public val getNextSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_next_selected")

    public val getSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_selected")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_selected")

    public val getSelectedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_selected_column")

    public val getPressedButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_pressed_button")

    public val setSelectModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_select_mode")

    public val getSelectModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_select_mode")

    public val deselectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "deselect_all")

    public val setColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_columns")

    public val getColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_columns")

    public val getEditedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_edited")

    public val getEditedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_edited_column")

    public val editSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "edit_selected")

    public val getCustomPopupRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_custom_popup_rect")

    public val getItemAreaRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_area_rect")

    public val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_at_position")

    public val getColumnAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_at_position")

    public val getDropSectionAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_section_at_position")

    public val getButtonIdAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_button_id_at_position")

    public val ensureCursorIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "ensure_cursor_is_visible")

    public val setColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_titles_visible")

    public val areColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "are_column_titles_visible")

    public val setColumnTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_column_title")

    public val getColumnTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_column_title")

    public val setColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_alignment")

    public val getColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_alignment")

    public val setColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_direction")

    public val getColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_direction")

    public val setColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_language")

    public val getColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_language")

    public val getScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_scroll")

    public val scrollToItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "scroll_to_item")

    public val setHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_h_scroll_enabled")

    public val isHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_h_scroll_enabled")

    public val setVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_v_scroll_enabled")

    public val isVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_v_scroll_enabled")

    public val setHideFoldingPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_hide_folding")

    public val isFoldingHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_folding_hidden")

    public val setEnableRecursiveFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_enable_recursive_folding")

    public val isRecursiveFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_recursive_folding_enabled")

    public val setDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_drop_mode_flags")

    public val getDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_mode_flags")

    public val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_rmb_select")

    public val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_rmb_select")

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_reselect")

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_reselect")

    public val setAllowSearchPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_allow_search")
  }
}
