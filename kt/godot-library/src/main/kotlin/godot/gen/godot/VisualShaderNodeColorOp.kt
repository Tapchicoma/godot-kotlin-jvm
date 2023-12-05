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
public open class VisualShaderNodeColorOp : VisualShaderNode() {
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
      return VisualShaderNodeColorOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLOROP, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long,
  ) {
    OP_SCREEN(0),
    OP_DIFFERENCE(1),
    OP_DARKEN(2),
    OP_LIGHTEN(3),
    OP_OVERLAY(4),
    OP_DODGE(5),
    OP_BURN(6),
    OP_SOFT_LIGHT(7),
    OP_HARD_LIGHT(8),
    OP_MAX(9),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeColorOp", "set_operator")

    public val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorOp", "get_operator")
  }
}
