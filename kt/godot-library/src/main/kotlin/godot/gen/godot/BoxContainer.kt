// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class BoxContainer : Container() {
  public var alignment: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
      return BoxContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
    }

  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BOXCONTAINER, scriptIndex)
    return true
  }

  public fun addSpacer(begin: Boolean): Control? {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(rawPtr, MethodBindings.addSpacerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    ALIGNMENT_BEGIN(0),
    ALIGNMENT_CENTER(1),
    ALIGNMENT_END(2),
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

  public companion object

  internal object MethodBindings {
    public val addSpacerPtr: VoidPtr = TypeManager.getMethodBindPtr("BoxContainer", "add_spacer")

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_alignment")

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "get_alignment")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_vertical")

    public val isVerticalPtr: VoidPtr = TypeManager.getMethodBindPtr("BoxContainer", "is_vertical")
  }
}
