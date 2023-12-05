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
public open class VisualShaderNodeDerivativeFunc : VisualShaderNode() {
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
      return VisualShaderNodeDerivativeFunc.OpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
    }

  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeDerivativeFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  public var precision: Precision
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPrecisionPtr, LONG)
      return VisualShaderNodeDerivativeFunc.Precision.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPrecisionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long,
  ) {
    OP_TYPE_SCALAR(0),
    OP_TYPE_VECTOR_2D(1),
    OP_TYPE_VECTOR_3D(2),
    OP_TYPE_VECTOR_4D(3),
    OP_TYPE_MAX(4),
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

  public enum class Function(
    id: Long,
  ) {
    FUNC_SUM(0),
    FUNC_X(1),
    FUNC_Y(2),
    FUNC_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Precision(
    id: Long,
  ) {
    PRECISION_NONE(0),
    PRECISION_COARSE(1),
    PRECISION_FINE(2),
    PRECISION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Precision = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_op_type")

    public val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_op_type")

    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_function")

    public val setPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_precision")

    public val getPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_precision")
  }
}
