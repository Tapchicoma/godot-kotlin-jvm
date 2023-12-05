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
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SkeletonModification2DFABRIK : SkeletonModification2D() {
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
    }

  public var fabrikDataChainLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFabrikDataChainLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFabrikDataChainLengthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DFABRIK, scriptIndex)
    return true
  }

  public fun setFabrikJointBone2dNode(jointIdx: Int, bone2dNodepath: NodePath) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointBone2dNodePtr, NIL)
  }

  public fun getFabrikJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setFabrikJointBoneIndex(jointIdx: Int, boneIdx: Int) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointBoneIndexPtr, NIL)
  }

  public fun getFabrikJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFabrikJointMagnetPosition(jointIdx: Int, magnetPosition: Vector2) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), VECTOR2 to magnetPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointMagnetPositionPtr, NIL)
  }

  public fun getFabrikJointMagnetPosition(jointIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointMagnetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setFabrikJointUseTargetRotation(jointIdx: Int, useTargetRotation: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to useTargetRotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointUseTargetRotationPtr, NIL)
  }

  public fun getFabrikJointUseTargetRotation(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointUseTargetRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_target_node")

    public val setFabrikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_data_chain_length")

    public val getFabrikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_data_chain_length")

    public val setFabrikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_bone2d_node")

    public val getFabrikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_bone2d_node")

    public val setFabrikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_bone_index")

    public val getFabrikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_bone_index")

    public val setFabrikJointMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_magnet_position")

    public val getFabrikJointMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_magnet_position")

    public val setFabrikJointUseTargetRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_use_target_rotation")

    public val getFabrikJointUseTargetRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_use_target_rotation")
  }
}
