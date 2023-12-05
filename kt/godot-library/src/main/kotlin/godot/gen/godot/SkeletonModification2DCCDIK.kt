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
public open class SkeletonModification2DCCDIK : SkeletonModification2D() {
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

  public var tipNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTipNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTipNodePtr, NIL)
    }

  public var ccdikDataChainLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCcdikDataChainLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCcdikDataChainLengthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DCCDIK, scriptIndex)
    return true
  }

  public fun setCcdikJointBone2dNode(jointIdx: Int, bone2dNodepath: NodePath) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBone2dNodePtr, NIL)
  }

  public fun getCcdikJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setCcdikJointBoneIndex(jointIdx: Int, boneIdx: Int) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBoneIndexPtr, NIL)
  }

  public fun getCcdikJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setCcdikJointRotateFromJoint(jointIdx: Int, rotateFromJoint: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to rotateFromJoint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointRotateFromJointPtr, NIL)
  }

  public fun getCcdikJointRotateFromJoint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointRotateFromJointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCcdikJointEnableConstraint(jointIdx: Int, enableConstraint: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointEnableConstraintPtr, NIL)
  }

  public fun getCcdikJointEnableConstraint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCcdikJointConstraintAngleMin(jointIdx: Int, angleMin: Float) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMinPtr, NIL)
  }

  public fun getCcdikJointConstraintAngleMin(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCcdikJointConstraintAngleMax(jointIdx: Int, angleMax: Float) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMaxPtr, NIL)
  }

  public fun getCcdikJointConstraintAngleMax(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCcdikJointConstraintAngleInvert(jointIdx: Int, invert: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleInvertPtr, NIL)
  }

  public fun getCcdikJointConstraintAngleInvert(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_target_node")

    public val setTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_tip_node")

    public val getTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_tip_node")

    public val setCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_data_chain_length")

    public val getCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_data_chain_length")

    public val setCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone2d_node")

    public val getCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone2d_node")

    public val setCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index")

    public val getCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index")

    public val setCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint")

    public val getCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint")

    public val setCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint")

    public val getCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint")

    public val setCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min")

    public val getCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min")

    public val setCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max")

    public val getCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max")

    public val setCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert")

    public val getCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert")
  }
}
