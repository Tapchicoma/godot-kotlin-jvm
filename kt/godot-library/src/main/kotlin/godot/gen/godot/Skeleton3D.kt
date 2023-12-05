// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.RID
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Skeleton3D : Node3D() {
  public val poseUpdated: Signal0 by signal()

  public val bonePoseChanged: Signal1<Long> by signal("boneIdx")

  public val boneEnabledChanged: Signal1<Long> by signal("boneIdx")

  public val showRestOnlyChanged: Signal0 by signal()

  public var motionScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionScalePtr, NIL)
    }

  public var showRestOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowRestOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowRestOnlyPtr, NIL)
    }

  public var animatePhysicalBones: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimatePhysicalBonesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimatePhysicalBonesPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETON3D, scriptIndex)
    return true
  }

  public fun addBone(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addBonePtr, NIL)
  }

  public fun findBone(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBoneName(boneIdx: Int): String {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setBoneName(boneIdx: Int, name: String) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  public fun getBoneParent(boneIdx: Int): Int {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneParentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setBoneParent(boneIdx: Int, parentIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to parentIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneParentPtr, NIL)
  }

  public fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun unparentBoneAndRest(boneIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.unparentBoneAndRestPtr, NIL)
  }

  public fun getBoneChildren(boneIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneChildrenPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getParentlessBones(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentlessBonesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getBoneRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneRestPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setBoneRest(boneIdx: Int, rest: Transform3D) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to rest)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneRestPtr, NIL)
  }

  public fun getBoneGlobalRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalRestPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun createSkinFromRestTransforms(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createSkinFromRestTransformsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
  }

  public fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkinReference?)
  }

  public fun localizeRests() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.localizeRestsPtr, NIL)
  }

  public fun clearBones() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesPtr, NIL)
  }

  public fun getBonePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setBonePosePosition(boneIdx: Int, position: Vector3) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePosePositionPtr, NIL)
  }

  public fun setBonePoseRotation(boneIdx: Int, rotation: Quaternion) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePoseRotationPtr, NIL)
  }

  public fun setBonePoseScale(boneIdx: Int, scale: Vector3) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePoseScalePtr, NIL)
  }

  public fun getBonePosePosition(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getBonePoseRotation(boneIdx: Int): Quaternion {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePoseRotationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun getBonePoseScale(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePoseScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun resetBonePose(boneIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.resetBonePosePtr, NIL)
  }

  public fun resetBonePoses() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetBonePosesPtr, NIL)
  }

  public fun isBoneEnabled(boneIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBoneEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun setBoneEnabled(boneIdx: Int, enabled: Boolean = true) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneEnabledPtr, NIL)
  }

  public fun clearBonesGlobalPoseOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesGlobalPoseOverridePtr, NIL)
  }

  @JvmOverloads
  public fun setBoneGlobalPoseOverride(
    boneIdx: Int,
    pose: Transform3D,
    amount: Float,
    persistent: Boolean = false,
  ) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to pose, DOUBLE to amount.toDouble(), BOOL to persistent)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneGlobalPoseOverridePtr, NIL)
  }

  public fun getBoneGlobalPoseOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPoseOverridePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getBoneGlobalPose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getBoneGlobalPoseNoOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPoseNoOverridePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun forceUpdateAllBoneTransforms() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateAllBoneTransformsPtr, NIL)
  }

  public fun forceUpdateBoneChildTransform(boneIdx: Int) {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateBoneChildTransformPtr, NIL)
  }

  public fun physicalBonesStopSimulation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStopSimulationPtr, NIL)
  }

  @JvmOverloads
  public fun physicalBonesStartSimulation(bones: VariantArray<StringName> =
      godot.core.variantArrayOf()) {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStartSimulationPtr, NIL)
  }

  public fun physicalBonesAddCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesAddCollisionExceptionPtr, NIL)
  }

  public fun physicalBonesRemoveCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesRemoveCollisionExceptionPtr, NIL)
  }

  public companion object {
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }

  internal object MethodBindings {
    public val addBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "add_bone")

    public val findBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "find_bone")

    public val getBoneNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_name")

    public val setBoneNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_name")

    public val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_parent")

    public val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_parent")

    public val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_count")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_version")

    public val unparentBoneAndRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "unparent_bone_and_rest")

    public val getBoneChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_children")

    public val getParentlessBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_parentless_bones")

    public val getBoneRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_rest")

    public val setBoneRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_rest")

    public val getBoneGlobalRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_rest")

    public val createSkinFromRestTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "create_skin_from_rest_transforms")

    public val registerSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "register_skin")

    public val localizeRestsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "localize_rests")

    public val clearBonesPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones")

    public val getBonePosePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose")

    public val setBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_position")

    public val setBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_rotation")

    public val setBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_scale")

    public val getBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_position")

    public val getBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_rotation")

    public val getBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_scale")

    public val resetBonePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_pose")

    public val resetBonePosesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_poses")

    public val isBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_bone_enabled")

    public val setBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_enabled")

    public val clearBonesGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones_global_pose_override")

    public val setBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_global_pose_override")

    public val getBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_override")

    public val getBoneGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose")

    public val getBoneGlobalPoseNoOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_no_override")

    public val forceUpdateAllBoneTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_all_bone_transforms")

    public val forceUpdateBoneChildTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_bone_child_transform")

    public val setMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_motion_scale")

    public val getMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_motion_scale")

    public val setShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_show_rest_only")

    public val isShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_show_rest_only")

    public val setAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_animate_physical_bones")

    public val getAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_animate_physical_bones")

    public val physicalBonesStopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_stop_simulation")

    public val physicalBonesStartSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_start_simulation")

    public val physicalBonesAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_add_collision_exception")

    public val physicalBonesRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_remove_collision_exception")
  }
}
