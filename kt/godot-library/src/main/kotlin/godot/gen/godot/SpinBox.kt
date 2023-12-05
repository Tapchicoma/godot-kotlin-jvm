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
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class SpinBox : Range() {
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  public var updateOnTextChanged: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateOnTextChangedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateOnTextChangedPtr, NIL)
    }

  public var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPrefixPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPrefixPtr, NIL)
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

  public var customArrowStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomArrowStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomArrowStepPtr, NIL)
    }

  public var selectAllOnFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectAllOnFocusPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPINBOX, scriptIndex)
    return true
  }

  public fun apply() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyPtr, NIL)
  }

  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_horizontal_alignment")

    public val setSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_suffix")

    public val getSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_suffix")

    public val setPrefixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_prefix")

    public val getPrefixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_prefix")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_editable")

    public val setCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_custom_arrow_step")

    public val getCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_custom_arrow_step")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "is_editable")

    public val setUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_update_on_text_changed")

    public val getUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_update_on_text_changed")

    public val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_select_all_on_focus")

    public val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_select_all_on_focus")

    public val applyPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "apply")

    public val getLineEditPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_line_edit")
  }
}
