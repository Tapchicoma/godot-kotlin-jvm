// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class BoneMap : Resource() {
  public val boneMapUpdated: Signal0 by signal()

  public val profileUpdated: Signal0 by signal()

  public var profile: SkeletonProfile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProfilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SkeletonProfile?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProfilePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONEMAP, scriptIndex)
    return true
  }

  public fun getSkeletonBoneName(profileBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to profileBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setSkeletonBoneName(profileBoneName: StringName, skeletonBoneName: StringName) {
    TransferContext.writeArguments(STRING_NAME to profileBoneName, STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonBoneNamePtr, NIL)
  }

  public fun findProfileBoneName(skeletonBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.findProfileBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public companion object

  internal object MethodBindings {
    public val getProfilePtr: VoidPtr = TypeManager.getMethodBindPtr("BoneMap", "get_profile")

    public val setProfilePtr: VoidPtr = TypeManager.getMethodBindPtr("BoneMap", "set_profile")

    public val getSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "get_skeleton_bone_name")

    public val setSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "set_skeleton_bone_name")

    public val findProfileBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "find_profile_bone_name")
  }
}
