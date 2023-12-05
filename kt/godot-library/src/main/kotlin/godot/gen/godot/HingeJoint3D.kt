// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
public open class HingeJoint3D : Joint3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HINGEJOINT3D, scriptIndex)
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

  public fun setFlag(flag: Flag, enabled: Boolean) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
  }

  public fun getFlag(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Param(
    id: Long,
  ) {
    PARAM_BIAS(0),
    PARAM_LIMIT_UPPER(1),
    PARAM_LIMIT_LOWER(2),
    PARAM_LIMIT_BIAS(3),
    PARAM_LIMIT_SOFTNESS(4),
    PARAM_LIMIT_RELAXATION(5),
    PARAM_MOTOR_TARGET_VELOCITY(6),
    PARAM_MOTOR_MAX_IMPULSE(7),
    PARAM_MAX(8),
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

  public enum class Flag(
    id: Long,
  ) {
    FLAG_USE_LIMIT(0),
    FLAG_ENABLE_MOTOR(1),
    FLAG_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flag = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParamPtr: VoidPtr = TypeManager.getMethodBindPtr("HingeJoint3D", "set_param")

    public val getParamPtr: VoidPtr = TypeManager.getMethodBindPtr("HingeJoint3D", "get_param")

    public val setFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("HingeJoint3D", "set_flag")

    public val getFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("HingeJoint3D", "get_flag")
  }
}
