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
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class BoneAttachment3D : Node3D() {
  public var boneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
    }

  public var boneIdx: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneIdxPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneIdxPtr, NIL)
    }

  public var overridePose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOverridePosePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverridePosePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONEATTACHMENT3D, scriptIndex)
    return true
  }

  public fun onBonePoseUpdate(boneIndex: Int) {
    TransferContext.writeArguments(LONG to boneIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.onBonePoseUpdatePtr, NIL)
  }

  public fun setUseExternalSkeleton(useExternalSkeleton: Boolean) {
    TransferContext.writeArguments(BOOL to useExternalSkeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseExternalSkeletonPtr, NIL)
  }

  public fun getUseExternalSkeleton(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseExternalSkeletonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setExternalSkeleton(externalSkeleton: NodePath) {
    TransferContext.writeArguments(NODE_PATH to externalSkeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.setExternalSkeletonPtr, NIL)
  }

  public fun getExternalSkeleton(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExternalSkeletonPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public companion object

  internal object MethodBindings {
    public val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_bone_name")

    public val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_bone_name")

    public val setBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_bone_idx")

    public val getBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_bone_idx")

    public val onBonePoseUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "on_bone_pose_update")

    public val setOverridePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_override_pose")

    public val getOverridePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_override_pose")

    public val setUseExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_use_external_skeleton")

    public val getUseExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_use_external_skeleton")

    public val setExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_external_skeleton")

    public val getExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_external_skeleton")
  }
}
