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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SkeletonModification2DTwoBoneIK : SkeletonModification2D() {
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

  public var targetMinimumDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetMinimumDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetMinimumDistancePtr, NIL)
    }

  public var targetMaximumDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetMaximumDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetMaximumDistancePtr, NIL)
    }

  public var flipBendDirection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlipBendDirectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipBendDirectionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK, scriptIndex)
    return true
  }

  public fun setJointOneBone2dNode(bone2dNode: NodePath) {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointOneBone2dNodePtr, NIL)
  }

  public fun getJointOneBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointOneBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setJointOneBoneIdx(boneIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setJointOneBoneIdxPtr, NIL)
  }

  public fun getJointOneBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointOneBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setJointTwoBone2dNode(bone2dNode: NodePath) {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointTwoBone2dNodePtr, NIL)
  }

  public fun getJointTwoBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointTwoBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setJointTwoBoneIdx(boneIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setJointTwoBoneIdxPtr, NIL)
  }

  public fun getJointTwoBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointTwoBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_node")

    public val setTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance")

    public val getTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance")

    public val setTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance")

    public val getTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance")

    public val setFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction")

    public val getFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction")

    public val setJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone2d_node")

    public val getJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone2d_node")

    public val setJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx")

    public val getJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx")

    public val setJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone2d_node")

    public val getJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone2d_node")

    public val setJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx")

    public val getJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx")
  }
}
