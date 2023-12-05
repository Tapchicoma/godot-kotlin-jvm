// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class PhysicalBone2D : RigidBody2D() {
  public var bone2dNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBone2dNodepathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBone2dNodepathPtr, NIL)
    }

  public var bone2dIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBone2dIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBone2dIndexPtr, NIL)
    }

  public var autoConfigureJoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoConfigureJointPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoConfigureJointPtr, NIL)
    }

  public var simulatePhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSimulatePhysicsPtr, NIL)
    }

  public var followBoneWhenSimulating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFollowBoneWhenSimulatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowBoneWhenSimulatingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICALBONE2D, scriptIndex)
    return true
  }

  public fun getJoint(): Joint2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Joint2D?)
  }

  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getJointPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicalBone2D", "get_joint")

    public val getAutoConfigureJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_auto_configure_joint")

    public val setAutoConfigureJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_auto_configure_joint")

    public val setSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_simulate_physics")

    public val getSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_simulate_physics")

    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "is_simulating_physics")

    public val setBone2dNodepathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_bone2d_nodepath")

    public val getBone2dNodepathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_bone2d_nodepath")

    public val setBone2dIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_bone2d_index")

    public val getBone2dIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_bone2d_index")

    public val setFollowBoneWhenSimulatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_follow_bone_when_simulating")

    public val getFollowBoneWhenSimulatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_follow_bone_when_simulating")
  }
}
