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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ColorPickerButton : Button() {
  public val colorChanged: Signal1<Color> by signal("color")

  public val popupClosed: Signal0 by signal()

  public val pickerCreated: Signal0 by signal()

  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPickColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickColorPtr, NIL)
    }

  public var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditingAlphaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditAlphaPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLORPICKERBUTTON, scriptIndex)
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
   * val myCoreType = colorpickerbutton.color
   * //Your changes
   * colorpickerbutton.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public fun getPicker(): ColorPicker? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPickerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ColorPicker?)
  }

  public fun getPopup(): PopupPanel? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupPanel?)
  }

  public companion object

  internal object MethodBindings {
    public val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_pick_color")

    public val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_pick_color")

    public val getPickerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_picker")

    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPickerButton", "get_popup")

    public val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_edit_alpha")

    public val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "is_editing_alpha")
  }
}
