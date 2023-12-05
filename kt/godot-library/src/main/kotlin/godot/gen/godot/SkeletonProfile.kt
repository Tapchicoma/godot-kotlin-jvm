// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SkeletonProfile : Resource() {
  public val profileUpdated: Signal0 by signal()

  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootBonePtr, NIL)
    }

  public var scaleBaseBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleBaseBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleBaseBonePtr, NIL)
    }

  public var groupSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroupSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setGroupSizePtr, NIL)
    }

  public var boneSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONPROFILE, scriptIndex)
    return true
  }

  public fun getGroupName(groupIdx: Int): StringName {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setGroupName(groupIdx: Int, groupName: StringName) {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), STRING_NAME to groupName)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupNamePtr, NIL)
  }

  public fun getTexture(groupIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setTexture(groupIdx: Int, texture: Texture2D) {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public fun findBone(boneName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.findBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBoneName(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBoneName(boneIdx: Int, boneName: StringName) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  public fun getBoneParent(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneParentPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBoneParent(boneIdx: Int, boneParent: StringName) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneParent)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneParentPtr, NIL)
  }

  public fun getTailDirection(boneIdx: Int): TailDirection {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTailDirectionPtr, LONG)
    return SkeletonProfile.TailDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setTailDirection(boneIdx: Int, tailDirection: TailDirection) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to tailDirection.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTailDirectionPtr, NIL)
  }

  public fun getBoneTail(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneTailPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBoneTail(boneIdx: Int, boneTail: StringName) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneTail)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneTailPtr, NIL)
  }

  public fun getReferencePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getReferencePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setReferencePose(boneIdx: Int, boneName: Transform3D) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setReferencePosePtr, NIL)
  }

  public fun getHandleOffset(boneIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHandleOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setHandleOffset(boneIdx: Int, handleOffset: Vector2) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR2 to handleOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandleOffsetPtr, NIL)
  }

  public fun getGroup(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setGroup(boneIdx: Int, group: StringName) {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupPtr, NIL)
  }

  public enum class TailDirection(
    id: Long,
  ) {
    TAIL_DIRECTION_AVERAGE_CHILDREN(0),
    TAIL_DIRECTION_SPECIFIC_CHILD(1),
    TAIL_DIRECTION_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TailDirection = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_root_bone")

    public val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_root_bone")

    public val setScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_scale_base_bone")

    public val getScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_scale_base_bone")

    public val setGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_size")

    public val getGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_size")

    public val getGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_name")

    public val setGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_name")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_texture")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_texture")

    public val setBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_size")

    public val getBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_size")

    public val findBonePtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "find_bone")

    public val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_name")

    public val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_name")

    public val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_parent")

    public val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_parent")

    public val getTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_tail_direction")

    public val setTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_tail_direction")

    public val getBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_tail")

    public val setBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_tail")

    public val getReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_reference_pose")

    public val setReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_reference_pose")

    public val getHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_handle_offset")

    public val setHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_handle_offset")

    public val getGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "get_group")

    public val setGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "set_group")
  }
}
