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
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SkeletonIK3D : Node() {
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

  public var tipBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTipBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTipBonePtr, NIL)
    }

  public var interpolation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var target: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetTransformPtr, NIL)
    }

  public var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverrideTipBasisPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverrideTipBasisPtr, NIL)
    }

  public var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingMagnetPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseMagnetPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagnetPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMagnetPositionPtr, NIL)
    }

  public var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
    }

  public var minDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinDistancePtr, NIL)
    }

  public var maxIterations: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxIterationsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxIterationsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONIK3D, scriptIndex)
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
   * val myCoreType = skeletonik3d.target
   * //Your changes
   * skeletonik3d.target = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetMutate(block: Transform3D.() -> Unit): Transform3D = target.apply{
      block(this)
      target = this
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
   * val myCoreType = skeletonik3d.magnet
   * //Your changes
   * skeletonik3d.magnet = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun magnetMutate(block: Vector3.() -> Unit): Vector3 = magnet.apply{
      block(this)
      magnet = this
  }


  public fun getParentSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?)
  }

  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun start(oneTime: Boolean = false) {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_root_bone")

    public val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_root_bone")

    public val setTipBonePtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "set_tip_bone")

    public val getTipBonePtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "get_tip_bone")

    public val setInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_interpolation")

    public val getInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_interpolation")

    public val setTargetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_target_transform")

    public val getTargetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_target_transform")

    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_target_node")

    public val setOverrideTipBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_override_tip_basis")

    public val isOverrideTipBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "is_override_tip_basis")

    public val setUseMagnetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_use_magnet")

    public val isUsingMagnetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "is_using_magnet")

    public val setMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_magnet_position")

    public val getMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_magnet_position")

    public val getParentSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_parent_skeleton")

    public val isRunningPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "is_running")

    public val setMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_min_distance")

    public val getMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_min_distance")

    public val setMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_max_iterations")

    public val getMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_max_iterations")

    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "start")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "stop")
  }
}
