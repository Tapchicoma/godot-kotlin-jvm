// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class SkeletonModification2DJiggle : SkeletonModification2D() {
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

  public var jiggleDataChainLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJiggleDataChainLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setJiggleDataChainLengthPtr, NIL)
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

  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
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

  public var useGravity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseGravityPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseGravityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var gravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DJIGGLE, scriptIndex)
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
   * val myCoreType = skeletonmodification2djiggle.gravity
   * //Your changes
   * skeletonmodification2djiggle.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityMutate(block: Vector2.() -> Unit): Vector2 = gravity.apply{
      block(this)
      gravity = this
  }


  public fun setUseColliders(useColliders: Boolean) {
    TransferContext.writeArguments(BOOL to useColliders)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseCollidersPtr, NIL)
  }

  public fun getUseColliders(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseCollidersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCollisionMask(collisionMask: Int) {
    TransferContext.writeArguments(LONG to collisionMask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public fun getCollisionMask(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setJiggleJointBone2dNode(jointIdx: Int, bone2dNode: NodePath) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointBone2dNodePtr, NIL)
  }

  public fun getJiggleJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setJiggleJointBoneIndex(jointIdx: Int, boneIdx: Int) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointBoneIndexPtr, NIL)
  }

  public fun getJiggleJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setJiggleJointOverride(jointIdx: Int, `override`: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointOverridePtr, NIL)
  }

  public fun getJiggleJointOverride(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setJiggleJointStiffness(jointIdx: Int, stiffness: Float) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to stiffness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointStiffnessPtr, NIL)
  }

  public fun getJiggleJointStiffness(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointStiffnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setJiggleJointMass(jointIdx: Int, mass: Float) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to mass.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointMassPtr, NIL)
  }

  public fun getJiggleJointMass(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setJiggleJointDamping(jointIdx: Int, damping: Float) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to damping.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointDampingPtr, NIL)
  }

  public fun getJiggleJointDamping(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointDampingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setJiggleJointUseGravity(jointIdx: Int, useGravity: Boolean) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to useGravity)
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointUseGravityPtr, NIL)
  }

  public fun getJiggleJointUseGravity(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointUseGravityPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setJiggleJointGravity(jointIdx: Int, gravity: Vector2) {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), VECTOR2 to gravity)
    TransferContext.callMethod(rawPtr, MethodBindings.setJiggleJointGravityPtr, NIL)
  }

  public fun getJiggleJointGravity(jointIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJiggleJointGravityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_target_node")

    public val setJiggleDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_data_chain_length")

    public val getJiggleDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_data_chain_length")

    public val setStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_stiffness")

    public val getStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_stiffness")

    public val setMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_mass")

    public val getMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_mass")

    public val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_damping")

    public val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_damping")

    public val setUseGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_use_gravity")

    public val getUseGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_use_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_gravity")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_gravity")

    public val setUseCollidersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_use_colliders")

    public val getUseCollidersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_use_colliders")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_collision_mask")

    public val setJiggleJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_bone2d_node")

    public val getJiggleJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_bone2d_node")

    public val setJiggleJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_bone_index")

    public val getJiggleJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_bone_index")

    public val setJiggleJointOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_override")

    public val getJiggleJointOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_override")

    public val setJiggleJointStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_stiffness")

    public val getJiggleJointStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_stiffness")

    public val setJiggleJointMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_mass")

    public val getJiggleJointMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_mass")

    public val setJiggleJointDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_damping")

    public val getJiggleJointDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_damping")

    public val setJiggleJointUseGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_use_gravity")

    public val getJiggleJointUseGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_use_gravity")

    public val setJiggleJointGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_gravity")

    public val getJiggleJointGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_gravity")
  }
}
