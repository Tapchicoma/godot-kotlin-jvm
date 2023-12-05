// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class StaticBody2D : PhysicsBody2D() {
  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsMaterialOverridePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsMaterialOverridePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var constantLinearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
    }

  public var constantAngularVelocity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STATICBODY2D, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = staticbody2d.constantLinearVelocity
   * //Your changes
   * staticbody2d.constantLinearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantLinearVelocityMutate(block: Vector2.() -> Unit): Vector2 =
      constantLinearVelocity.apply{
      block(this)
      constantLinearVelocity = this
  }


  public companion object

  internal object MethodBindings {
    public val setConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_constant_linear_velocity")

    public val setConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_constant_angular_velocity")

    public val getConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_constant_linear_velocity")

    public val getConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_constant_angular_velocity")

    public val setPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "set_physics_material_override")

    public val getPhysicsMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StaticBody2D", "get_physics_material_override")
  }
}
