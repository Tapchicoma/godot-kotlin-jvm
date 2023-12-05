// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class ScrollContainer : Container() {
  public val scrollStarted: Signal0 by signal()

  public val scrollEnded: Signal0 by signal()

  public var followFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFollowingFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowFocusPtr, NIL)
    }

  public var scrollHorizontal: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollPtr, NIL)
    }

  public var scrollVertical: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollPtr, NIL)
    }

  public var scrollHorizontalCustomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalCustomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalCustomStepPtr, NIL)
    }

  public var scrollVerticalCustomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalCustomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalCustomStepPtr, NIL)
    }

  public var horizontalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalScrollModePtr, LONG)
      return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalScrollModePtr, NIL)
    }

  public var verticalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalScrollModePtr, LONG)
      return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalScrollModePtr, NIL)
    }

  public var scrollDeadzone: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDeadzonePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDeadzonePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCROLLCONTAINER, scriptIndex)
    return true
  }

  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HScrollBar?)
  }

  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public fun ensureControlVisible(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.ensureControlVisiblePtr, NIL)
  }

  public enum class ScrollMode(
    id: Long,
  ) {
    SCROLL_MODE_DISABLED(0),
    SCROLL_MODE_AUTO(1),
    SCROLL_MODE_SHOW_ALWAYS(2),
    SCROLL_MODE_SHOW_NEVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScrollMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_h_scroll")

    public val getHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll")

    public val setVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_v_scroll")

    public val getVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll")

    public val setHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_custom_step")

    public val getHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_custom_step")

    public val setVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_custom_step")

    public val getVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_custom_step")

    public val setHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_scroll_mode")

    public val getHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_scroll_mode")

    public val setVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_scroll_mode")

    public val getVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_scroll_mode")

    public val setDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_deadzone")

    public val getDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_deadzone")

    public val setFollowFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_follow_focus")

    public val isFollowingFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "is_following_focus")

    public val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll_bar")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll_bar")

    public val ensureControlVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "ensure_control_visible")
  }
}
