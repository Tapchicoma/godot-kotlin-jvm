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
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class TabContainer : Container() {
  public val activeTabRearranged: Signal1<Long> by signal("idxTo")

  public val tabChanged: Signal1<Long> by signal("tab")

  public val tabClicked: Signal1<Long> by signal("tab")

  public val tabHovered: Signal1<Long> by signal("tab")

  public val tabSelected: Signal1<Long> by signal("tab")

  public val tabButtonPressed: Signal1<Long> by signal("tab")

  public val prePopupPressed: Signal0 by signal()

  public var tabAlignment: TabBar.AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabAlignmentPtr, LONG)
      return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabAlignmentPtr, NIL)
    }

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

  public var tabsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areTabsVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabsVisiblePtr, NIL)
    }

  public var allTabsInFront: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllTabsInFrontPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllTabsInFrontPtr, NIL)
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

  public var useHiddenTabsForMinSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseHiddenTabsForMinSizePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHiddenTabsForMinSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TABCONTAINER, scriptIndex)
    return true
  }

  public fun getTabCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTabCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPreviousTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreviousTabPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun getTabControl(tabIdx: Int): Control? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
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

  public fun setTabIcon(tabIdx: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabIconPtr, NIL)
  }

  public fun getTabIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIconPtr, OBJECT)
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

  public fun setTabButtonIcon(tabIdx: Int, icon: Texture2D) {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  public fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun getTabIdxAtPoint(point: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIdxAtPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTabIdxFromControl(control: Control): Int {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIdxFromControlPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setPopup(popup: Node) {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(rawPtr, MethodBindings.setPopupPtr, NIL)
  }

  public fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Popup?)
  }

  public companion object

  internal object MethodBindings {
    public val getTabCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_count")

    public val setCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_current_tab")

    public val getCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab")

    public val getPreviousTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_previous_tab")

    public val getCurrentTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab_control")

    public val getTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_control")

    public val setTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_alignment")

    public val getTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_alignment")

    public val setClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_clip_tabs")

    public val getClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_clip_tabs")

    public val setTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_visible")

    public val areTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "are_tabs_visible")

    public val setAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_all_tabs_in_front")

    public val isAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_all_tabs_in_front")

    public val setTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_title")

    public val getTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_title")

    public val setTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "set_tab_icon")

    public val getTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "get_tab_icon")

    public val setTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_disabled")

    public val isTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_disabled")

    public val setTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_hidden")

    public val isTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_hidden")

    public val setTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_metadata")

    public val getTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_metadata")

    public val setTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_button_icon")

    public val getTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_button_icon")

    public val getTabIdxAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_at_point")

    public val getTabIdxFromControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_from_control")

    public val setPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "set_popup")

    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "get_popup")

    public val setDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_drag_to_rearrange_enabled")

    public val getDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_drag_to_rearrange_enabled")

    public val setTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_rearrange_group")

    public val getTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tabs_rearrange_group")

    public val setUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_use_hidden_tabs_for_min_size")

    public val getUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_use_hidden_tabs_for_min_size")
  }
}
