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
public open class VisualShaderNodeCompare : VisualShaderNode() {
  public var type: ComparisonType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getComparisonTypePtr, LONG)
      return VisualShaderNodeCompare.ComparisonType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setComparisonTypePtr, NIL)
    }

  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeCompare.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  public var condition: Condition
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConditionPtr, LONG)
      return VisualShaderNodeCompare.Condition.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setConditionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOMPARE, scriptIndex)
    return true
  }

  public enum class ComparisonType(
    id: Long,
  ) {
    CTYPE_SCALAR(0),
    CTYPE_SCALAR_INT(1),
    CTYPE_SCALAR_UINT(2),
    CTYPE_VECTOR_2D(3),
    CTYPE_VECTOR_3D(4),
    CTYPE_VECTOR_4D(5),
    CTYPE_BOOLEAN(6),
    CTYPE_TRANSFORM(7),
    CTYPE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ComparisonType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Function(
    id: Long,
  ) {
    FUNC_EQUAL(0),
    FUNC_NOT_EQUAL(1),
    FUNC_GREATER_THAN(2),
    FUNC_GREATER_THAN_EQUAL(3),
    FUNC_LESS_THAN(4),
    FUNC_LESS_THAN_EQUAL(5),
    FUNC_MAX(6),
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

  public enum class Condition(
    id: Long,
  ) {
    COND_ALL(0),
    COND_ANY(1),
    COND_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Condition = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_comparison_type")

    public val getComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_comparison_type")

    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_function")

    public val setConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_condition")

    public val getConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_condition")
  }
}
