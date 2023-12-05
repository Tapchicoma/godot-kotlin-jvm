// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SliderJoint3D : Joint3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SLIDERJOINT3D, scriptIndex)
    return true
  }

  public fun setParam(`param`: Param, `value`: Float) {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
  }

  public fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    PARAM_LINEAR_LIMIT_UPPER(0),
    PARAM_LINEAR_LIMIT_LOWER(1),
    PARAM_LINEAR_LIMIT_SOFTNESS(2),
    PARAM_LINEAR_LIMIT_RESTITUTION(3),
    PARAM_LINEAR_LIMIT_DAMPING(4),
    PARAM_LINEAR_MOTION_SOFTNESS(5),
    PARAM_LINEAR_MOTION_RESTITUTION(6),
    PARAM_LINEAR_MOTION_DAMPING(7),
    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),
    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),
    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),
    PARAM_ANGULAR_LIMIT_UPPER(11),
    PARAM_ANGULAR_LIMIT_LOWER(12),
    PARAM_ANGULAR_LIMIT_SOFTNESS(13),
    PARAM_ANGULAR_LIMIT_RESTITUTION(14),
    PARAM_ANGULAR_LIMIT_DAMPING(15),
    PARAM_ANGULAR_MOTION_SOFTNESS(16),
    PARAM_ANGULAR_MOTION_RESTITUTION(17),
    PARAM_ANGULAR_MOTION_DAMPING(18),
    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),
    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),
    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),
    PARAM_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Param = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParamPtr: VoidPtr = TypeManager.getMethodBindPtr("SliderJoint3D", "set_param")

    public val getParamPtr: VoidPtr = TypeManager.getMethodBindPtr("SliderJoint3D", "get_param")
  }
}
