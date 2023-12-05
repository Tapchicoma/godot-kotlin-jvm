// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.KeyModifierMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class InputEventWithModifiers internal constructor() : InputEventFromWindow() {
  public var commandOrControlAutoremap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlAutoremapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommandOrControlAutoremapPtr, NIL)
    }

  public var altPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAltPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAltPressedPtr, NIL)
    }

  public var shiftPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShiftPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShiftPressedPtr, NIL)
    }

  public var ctrlPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCtrlPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCtrlPressedPtr, NIL)
    }

  public var metaPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMetaPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetaPressedPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTWITHMODIFIERS, scriptIndex)
    return true
  }

  public fun isCommandOrControlPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getModifiersMask(): KeyModifierMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModifiersMaskPtr, LONG)
    return KeyModifierMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setCommandOrControlAutoremapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_command_or_control_autoremap")

    public val isCommandOrControlAutoremapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_command_or_control_autoremap")

    public val isCommandOrControlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_command_or_control_pressed")

    public val setAltPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_alt_pressed")

    public val isAltPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_alt_pressed")

    public val setShiftPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_shift_pressed")

    public val isShiftPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_shift_pressed")

    public val setCtrlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_ctrl_pressed")

    public val isCtrlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_ctrl_pressed")

    public val setMetaPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_meta_pressed")

    public val isMetaPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_meta_pressed")

    public val getModifiersMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "get_modifiers_mask")
  }
}
