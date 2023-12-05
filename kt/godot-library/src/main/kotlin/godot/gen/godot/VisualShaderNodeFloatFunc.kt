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
public open class VisualShaderNodeFloatFunc : VisualShaderNode() {
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeFloatFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    FUNC_SIN(0),
    FUNC_COS(1),
    FUNC_TAN(2),
    FUNC_ASIN(3),
    FUNC_ACOS(4),
    FUNC_ATAN(5),
    FUNC_SINH(6),
    FUNC_COSH(7),
    FUNC_TANH(8),
    FUNC_LOG(9),
    FUNC_EXP(10),
    FUNC_SQRT(11),
    FUNC_ABS(12),
    FUNC_SIGN(13),
    FUNC_FLOOR(14),
    FUNC_ROUND(15),
    FUNC_CEIL(16),
    FUNC_FRACT(17),
    FUNC_SATURATE(18),
    FUNC_NEGATE(19),
    FUNC_ACOSH(20),
    FUNC_ASINH(21),
    FUNC_ATANH(22),
    FUNC_DEGREES(23),
    FUNC_EXP2(24),
    FUNC_INVERSE_SQRT(25),
    FUNC_LOG2(26),
    FUNC_RADIANS(27),
    FUNC_RECIPROCAL(28),
    FUNC_ROUNDEVEN(29),
    FUNC_TRUNC(30),
    FUNC_ONEMINUS(31),
    FUNC_MAX(32),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatFunc", "get_function")
  }
}
