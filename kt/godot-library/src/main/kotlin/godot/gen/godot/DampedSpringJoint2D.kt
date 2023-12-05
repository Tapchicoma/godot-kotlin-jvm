// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class DampedSpringJoint2D : Joint2D() {
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  public var restLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRestLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRestLengthPtr, NIL)
    }

  public var stiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStiffnessPtr, NIL)
    }

  public var damping: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DAMPEDSPRINGJOINT2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_length")

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_length")

    public val setRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_rest_length")

    public val getRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_rest_length")

    public val setStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_stiffness")

    public val getStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_stiffness")

    public val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_damping")

    public val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_damping")
  }
}
