// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class VisualShaderNodeStep : VisualShaderNode() {
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
      return VisualShaderNodeStep.OpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODESTEP, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long,
  ) {
    OP_TYPE_SCALAR(0),
    OP_TYPE_VECTOR_2D(1),
    OP_TYPE_VECTOR_2D_SCALAR(2),
    OP_TYPE_VECTOR_3D(3),
    OP_TYPE_VECTOR_3D_SCALAR(4),
    OP_TYPE_VECTOR_4D(5),
    OP_TYPE_VECTOR_4D_SCALAR(6),
    OP_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeStep", "set_op_type")

    public val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeStep", "get_op_type")
  }
}
