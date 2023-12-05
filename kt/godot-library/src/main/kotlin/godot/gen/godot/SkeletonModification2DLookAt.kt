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
public open class SkeletonModification2DLookAt : SkeletonModification2D() {
  public var boneIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneIndexPtr, NIL)
    }

  public var bone2dNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBone2dNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBone2dNodePtr, NIL)
    }

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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DLOOKAT, scriptIndex)
    return true
  }

  public fun setAdditionalRotation(rotation: Float) {
    TransferContext.writeArguments(DOUBLE to rotation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalRotationPtr, NIL)
  }

  public fun getAdditionalRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setEnableConstraint(enableConstraint: Boolean) {
    TransferContext.writeArguments(BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnableConstraintPtr, NIL)
  }

  public fun getEnableConstraint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setConstraintAngleMin(angleMin: Float) {
    TransferContext.writeArguments(DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleMinPtr, NIL)
  }

  public fun getConstraintAngleMin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setConstraintAngleMax(angleMax: Float) {
    TransferContext.writeArguments(DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleMaxPtr, NIL)
  }

  public fun getConstraintAngleMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setConstraintAngleInvert(invert: Boolean) {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleInvertPtr, NIL)
  }

  public fun getConstraintAngleInvert(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone2d_node")

    public val getBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone2d_node")

    public val setBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone_index")

    public val getBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone_index")

    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_target_node")

    public val setAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_additional_rotation")

    public val getAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_additional_rotation")

    public val setEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_enable_constraint")

    public val getEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_enable_constraint")

    public val setConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_min")

    public val getConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_min")

    public val setConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_max")

    public val getConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_max")

    public val setConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_invert")

    public val getConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_invert")
  }
}
