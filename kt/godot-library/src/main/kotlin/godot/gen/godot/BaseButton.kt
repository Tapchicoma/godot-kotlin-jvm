// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class BaseButton : Control() {
  public val pressed: Signal0 by signal()

  public val buttonUp: Signal0 by signal()

  public val buttonDown: Signal0 by signal()

  public val toggled: Signal1<Boolean> by signal("buttonPressed")

  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  public var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isToggleModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setToggleModePtr, NIL)
    }

  public var buttonPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  public var actionMode: ActionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionModePtr, LONG)
      return BaseButton.ActionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionModePtr, NIL)
    }

  public var buttonMask: MouseButtonMask
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonMaskPtr, LONG)
      return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonMaskPtr, NIL)
    }

  public var keepPressedOutside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isKeepPressedOutsidePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepPressedOutsidePtr, NIL)
    }

  public var buttonGroup: ButtonGroup?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonGroupPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ButtonGroup?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonGroupPtr, NIL)
    }

  public var shortcut: Shortcut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShortcutPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutPtr, NIL)
    }

  public var shortcutFeedback: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShortcutFeedbackPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutFeedbackPtr, NIL)
    }

  public var shortcutInTooltip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShortcutInTooltipEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutInTooltipPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BASEBUTTON, scriptIndex)
    return true
  }

  public open fun _pressed() {
  }

  public open fun _toggled(buttonPressed: Boolean) {
  }

  public fun setPressedNoSignal(pressed: Boolean) {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setPressedNoSignalPtr, NIL)
  }

  public fun isHovered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isHoveredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getDrawMode(): DrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDrawModePtr, LONG)
    return BaseButton.DrawMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class DrawMode(
    id: Long,
  ) {
    DRAW_NORMAL(0),
    DRAW_PRESSED(1),
    DRAW_HOVER(2),
    DRAW_DISABLED(3),
    DRAW_HOVER_PRESSED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ActionMode(
    id: Long,
  ) {
    ACTION_MODE_BUTTON_PRESS(0),
    ACTION_MODE_BUTTON_RELEASE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ActionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _pressedPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "_pressed")

    public val _toggledPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "_toggled")

    public val setPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "set_pressed")

    public val isPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "is_pressed")

    public val setPressedNoSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_pressed_no_signal")

    public val isHoveredPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "is_hovered")

    public val setToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_toggle_mode")

    public val isToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_toggle_mode")

    public val setShortcutInTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_shortcut_in_tooltip")

    public val isShortcutInTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_shortcut_in_tooltip_enabled")

    public val setDisabledPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "set_disabled")

    public val isDisabledPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "is_disabled")

    public val setActionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_action_mode")

    public val getActionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_action_mode")

    public val setButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_button_mask")

    public val getButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_button_mask")

    public val getDrawModePtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "get_draw_mode")

    public val setKeepPressedOutsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_keep_pressed_outside")

    public val isKeepPressedOutsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_keep_pressed_outside")

    public val setShortcutFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_shortcut_feedback")

    public val isShortcutFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_shortcut_feedback")

    public val setShortcutPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "set_shortcut")

    public val getShortcutPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseButton", "get_shortcut")

    public val setButtonGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_button_group")

    public val getButtonGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_button_group")
  }
}
