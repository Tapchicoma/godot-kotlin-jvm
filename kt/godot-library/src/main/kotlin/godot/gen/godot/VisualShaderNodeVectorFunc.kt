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
public open class VisualShaderNodeVectorFunc : VisualShaderNodeVectorBase() {
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeVectorFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    FUNC_NORMALIZE(0),
    FUNC_SATURATE(1),
    FUNC_NEGATE(2),
    FUNC_RECIPROCAL(3),
    FUNC_ABS(4),
    FUNC_ACOS(5),
    FUNC_ACOSH(6),
    FUNC_ASIN(7),
    FUNC_ASINH(8),
    FUNC_ATAN(9),
    FUNC_ATANH(10),
    FUNC_CEIL(11),
    FUNC_COS(12),
    FUNC_COSH(13),
    FUNC_DEGREES(14),
    FUNC_EXP(15),
    FUNC_EXP2(16),
    FUNC_FLOOR(17),
    FUNC_FRACT(18),
    FUNC_INVERSE_SQRT(19),
    FUNC_LOG(20),
    FUNC_LOG2(21),
    FUNC_RADIANS(22),
    FUNC_ROUND(23),
    FUNC_ROUNDEVEN(24),
    FUNC_SIGN(25),
    FUNC_SIN(26),
    FUNC_SINH(27),
    FUNC_SQRT(28),
    FUNC_TAN(29),
    FUNC_TANH(30),
    FUNC_TRUNC(31),
    FUNC_ONEMINUS(32),
    FUNC_MAX(33),
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

  public companion object

  internal object MethodBindings {
    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVectorFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVectorFunc", "get_function")
  }
}
