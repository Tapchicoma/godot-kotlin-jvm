// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorSpinSlider internal constructor() : Range() {
  public val grabbed: Signal0 by signal()

  public val ungrabbed: Signal0 by signal()

  public val valueFocusEntered: Signal0 by signal()

  public val valueFocusExited: Signal0 by signal()

  public var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLabelPtr, NIL)
    }

  public var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuffixPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSuffixPtr, NIL)
    }

  public var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isReadOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReadOnlyPtr, NIL)
    }

  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  public var hideSlider: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHidingSliderPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideSliderPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSPINSLIDER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "set_label")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "get_label")

    public val setSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_suffix")

    public val getSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "get_suffix")

    public val setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_read_only")

    public val isReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "is_read_only")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "is_flat")

    public val setHideSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_hide_slider")

    public val isHidingSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "is_hiding_slider")
  }
}
