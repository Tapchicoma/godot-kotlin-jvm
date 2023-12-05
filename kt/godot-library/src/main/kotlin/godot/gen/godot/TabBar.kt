// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
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
public open class TabBar : Control() {
  public val tabSelected: Signal1<Long> by signal("tab")

  public val tabChanged: Signal1<Long> by signal("tab")

  public val tabClicked: Signal1<Long> by signal("tab")

  public val tabRmbClicked: Signal1<Long> by signal("tab")

  public val tabClosePressed: Signal1<Long> by signal("tab")

  public val tabButtonPressed: Signal1<Long> by signal("tab")

  public val tabHovered: Signal1<Long> by signal("tab")

  public val activeTabRearranged: Signal1<Long> by signal("idxTo")

  public var currentTab: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentTabPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentTabPtr, NIL)
    }

  public var tabAlignment: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabAlignmentPtr, LONG)
      return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabAlignmentPtr, NIL)
    }

  public var clipTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClipTabsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipTabsPtr, NIL)
    }

  public var tabCloseDisplayPolicy: CloseButtonDisplayPolicy
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabCloseDisplayPolicyPtr, LONG)
      return TabBar.CloseButtonDisplayPolicy.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabCloseDisplayPolicyPtr, NIL)
    }

  public var maxTabWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxTabWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxTabWidthPtr, NIL)
    }

  public var scrollingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollingEnabledPtr, NIL)
    }

  public var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragToRearrangeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragToRearrangeEnabledPtr, NIL)
    }

  public var tabsRearrangeGroup: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabsRearrangeGroupPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTabsRearrangeGroupPtr, NIL)
    }

  public var scrollToSelected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollToSelectedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollToSelectedPtr, NIL)
    }

  public var selectWithRmb: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectWithRmbPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectWithRmbPtr, NIL)
    }

  public var tabCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTabCountPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TABBAR, scriptIndex)
    return true
  }

  public fun getPreviousTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreviousTabPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTabTitle(tabIdx: Int, title: String) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabTitlePtr, NIL)
  }

  public fun getTabTitle(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setTabTextDirection(tabIdx: Int, direction: Control.TextDirection) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabTextDirectionPtr, NIL)
  }

  public fun getTabTextDirection(tabIdx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setTabLanguage(tabIdx: Int, language: String) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabLanguagePtr, NIL)
  }

  public fun getTabLanguage(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setTabIcon(tabIdx: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabIconPtr, NIL)
  }

  public fun getTabIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setTabIconMaxWidth(tabIdx: Int, width: Int) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTabIconMaxWidthPtr, NIL)
  }

  public fun getTabIconMaxWidth(tabIdx: Int): Int {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTabButtonIcon(tabIdx: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  public fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabDisabledPtr, NIL)
  }

  public fun isTabDisabled(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTabDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setTabHidden(tabIdx: Int, hidden: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabHiddenPtr, NIL)
  }

  public fun isTabHidden(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTabHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setTabMetadata(tabIdx: Int, metadata: Any?) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabMetadataPtr, NIL)
  }

  public fun getTabMetadata(tabIdx: Int): Any? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun removeTab(tabIdx: Int) {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTabPtr, NIL)
  }

  @JvmOverloads
  public fun addTab(title: String = "", icon: Texture2D? = null) {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.addTabPtr, NIL)
  }

  public fun getTabIdxAtPoint(point: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIdxAtPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTabOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTabOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetButtonsVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun ensureTabVisible(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.ensureTabVisiblePtr, NIL)
  }

  public fun getTabRect(tabIdx: Int): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun moveTab(from: Int, to: Int) {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveTabPtr, NIL)
  }

  public fun clearTabs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearTabsPtr, NIL)
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    ALIGNMENT_LEFT(0),
    ALIGNMENT_CENTER(1),
    ALIGNMENT_RIGHT(2),
    ALIGNMENT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CloseButtonDisplayPolicy(
    id: Long,
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),
    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),
    CLOSE_BUTTON_SHOW_ALWAYS(2),
    CLOSE_BUTTON_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CloseButtonDisplayPolicy = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTabCountPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_tab_count")

    public val getTabCountPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_tab_count")

    public val setCurrentTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_current_tab")

    public val getCurrentTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_current_tab")

    public val getPreviousTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_previous_tab")

    public val setTabTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_tab_title")

    public val getTabTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_tab_title")

    public val setTabTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_text_direction")

    public val getTabTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_text_direction")

    public val setTabLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_language")

    public val getTabLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_language")

    public val setTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_tab_icon")

    public val getTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_tab_icon")

    public val setTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_icon_max_width")

    public val getTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_icon_max_width")

    public val setTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_button_icon")

    public val getTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_button_icon")

    public val setTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_disabled")

    public val isTabDisabledPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "is_tab_disabled")

    public val setTabHiddenPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_tab_hidden")

    public val isTabHiddenPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "is_tab_hidden")

    public val setTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_metadata")

    public val getTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_metadata")

    public val removeTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "remove_tab")

    public val addTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "add_tab")

    public val getTabIdxAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_idx_at_point")

    public val setTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_alignment")

    public val getTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_alignment")

    public val setClipTabsPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "set_clip_tabs")

    public val getClipTabsPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_clip_tabs")

    public val getTabOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_tab_offset")

    public val getOffsetButtonsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_offset_buttons_visible")

    public val ensureTabVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "ensure_tab_visible")

    public val getTabRectPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "get_tab_rect")

    public val moveTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "move_tab")

    public val setTabCloseDisplayPolicyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_close_display_policy")

    public val getTabCloseDisplayPolicyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_close_display_policy")

    public val setMaxTabWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_max_tab_width")

    public val getMaxTabWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_max_tab_width")

    public val setScrollingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_scrolling_enabled")

    public val getScrollingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_scrolling_enabled")

    public val setDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_drag_to_rearrange_enabled")

    public val getDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_drag_to_rearrange_enabled")

    public val setTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tabs_rearrange_group")

    public val getTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tabs_rearrange_group")

    public val setScrollToSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_scroll_to_selected")

    public val getScrollToSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_scroll_to_selected")

    public val setSelectWithRmbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_select_with_rmb")

    public val getSelectWithRmbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_select_with_rmb")

    public val clearTabsPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "clear_tabs")
  }
}
