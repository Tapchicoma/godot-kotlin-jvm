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
public open class Generic6DOFJoint3D : Joint3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GENERIC6DOFJOINT3D, scriptIndex)
    return true
  }

  public fun setParamX(`param`: Param, `value`: Float) {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamXPtr, NIL)
  }

  public fun getParamX(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamXPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setParamY(`param`: Param, `value`: Float) {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamYPtr, NIL)
  }

  public fun getParamY(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamYPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setParamZ(`param`: Param, `value`: Float) {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamZPtr, NIL)
  }

  public fun getParamZ(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamZPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFlagX(flag: Flag, `value`: Boolean) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagXPtr, NIL)
  }

  public fun getFlagX(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagXPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setFlagY(flag: Flag, `value`: Boolean) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagYPtr, NIL)
  }

  public fun getFlagY(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagYPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setFlagZ(flag: Flag, `value`: Boolean) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagZPtr, NIL)
  }

  public fun getFlagZ(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagZPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Param(
    id: Long,
  ) {
    PARAM_LINEAR_LOWER_LIMIT(0),
    PARAM_LINEAR_UPPER_LIMIT(1),
    PARAM_LINEAR_LIMIT_SOFTNESS(2),
    PARAM_LINEAR_RESTITUTION(3),
    PARAM_LINEAR_DAMPING(4),
    PARAM_LINEAR_MOTOR_TARGET_VELOCITY(5),
    PARAM_LINEAR_MOTOR_FORCE_LIMIT(6),
    PARAM_LINEAR_SPRING_STIFFNESS(7),
    PARAM_LINEAR_SPRING_DAMPING(8),
    PARAM_LINEAR_SPRING_EQUILIBRIUM_POINT(9),
    PARAM_ANGULAR_LOWER_LIMIT(10),
    PARAM_ANGULAR_UPPER_LIMIT(11),
    PARAM_ANGULAR_LIMIT_SOFTNESS(12),
    PARAM_ANGULAR_DAMPING(13),
    PARAM_ANGULAR_RESTITUTION(14),
    PARAM_ANGULAR_FORCE_LIMIT(15),
    PARAM_ANGULAR_ERP(16),
    PARAM_ANGULAR_MOTOR_TARGET_VELOCITY(17),
    PARAM_ANGULAR_MOTOR_FORCE_LIMIT(18),
    PARAM_ANGULAR_SPRING_STIFFNESS(19),
    PARAM_ANGULAR_SPRING_DAMPING(20),
    PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT(21),
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

  public enum class Flag(
    id: Long,
  ) {
    FLAG_ENABLE_LINEAR_LIMIT(0),
    FLAG_ENABLE_ANGULAR_LIMIT(1),
    FLAG_ENABLE_LINEAR_SPRING(3),
    FLAG_ENABLE_ANGULAR_SPRING(2),
    FLAG_ENABLE_MOTOR(4),
    FLAG_ENABLE_LINEAR_MOTOR(5),
    FLAG_MAX(6),
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
    public val setParamXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_x")

    public val getParamXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_x")

    public val setParamYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_y")

    public val getParamYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_y")

    public val setParamZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_z")

    public val getParamZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_z")

    public val setFlagXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_x")

    public val getFlagXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_x")

    public val setFlagYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_y")

    public val getFlagYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_y")

    public val setFlagZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_z")

    public val getFlagZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_z")
  }
}
