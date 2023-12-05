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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class FlowContainer : Container() {
  public var alignment: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
      return FlowContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
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
    callConstructor(ENGINECLASS_FLOWCONTAINER, scriptIndex)
    return true
  }

  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_line_count")

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_alignment")

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_alignment")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_vertical")

    public val isVerticalPtr: VoidPtr = TypeManager.getMethodBindPtr("FlowContainer", "is_vertical")
  }
}
