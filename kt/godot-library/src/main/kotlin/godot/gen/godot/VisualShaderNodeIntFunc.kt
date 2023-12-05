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
public open class VisualShaderNodeIntFunc : VisualShaderNode() {
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeIntFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    FUNC_ABS(0),
    FUNC_NEGATE(1),
    FUNC_SIGN(2),
    FUNC_BITWISE_NOT(3),
    FUNC_MAX(4),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeIntFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntFunc", "get_function")
  }
}
