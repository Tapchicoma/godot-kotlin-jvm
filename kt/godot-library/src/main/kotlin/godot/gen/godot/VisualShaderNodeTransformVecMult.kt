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
public open class VisualShaderNodeTransformVecMult : VisualShaderNode() {
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
      return VisualShaderNodeTransformVecMult.Operator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMVECMULT, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long,
  ) {
    OP_AxB(0),
    OP_BxA(1),
    OP_3x3_AxB(2),
    OP_3x3_BxA(3),
    OP_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Operator = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "set_operator")

    public val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "get_operator")
  }
}
