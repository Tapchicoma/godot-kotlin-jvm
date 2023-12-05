// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class AnimationTree : Node() {
  public val animationPlayerChanged: Signal0 by signal()

  public val animationStarted: Signal1<StringName> by signal("animName")

  public val animationFinished: Signal1<StringName> by signal("animName")

  public var treeRoot: AnimationNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTreeRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AnimationNode?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTreeRootPtr, NIL)
    }

  public var animPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPlayerPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPlayerPtr, NIL)
    }

  public var advanceExpressionBaseNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceExpressionBaseNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceExpressionBaseNodePtr, NIL)
    }

  public var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
    }

  public var processCallback: AnimationProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
      return AnimationTree.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
    }

  public var audioMaxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioMaxPolyphonyPtr, NIL)
    }

  public var rootMotionTrack: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionTrackPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootMotionTrackPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONTREE, scriptIndex)
    return true
  }

  public open fun _postProcessKeyValue(
    animation: Animation,
    track: Int,
    `value`: Any?,
    _object: Object,
    objectIdx: Int,
  ): Any? {
    throw NotImplementedError("_post_process_key_value is not implemented for AnimationTree")
  }

  public fun getRootMotionPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getRootMotionRotation(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionRotationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun getRootMotionScale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getRootMotionPositionAccumulator(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionPositionAccumulatorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getRootMotionRotationAccumulator(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionRotationAccumulatorPtr,
        QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun getRootMotionScaleAccumulator(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionScaleAccumulatorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun advance(delta: Double) {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.advancePtr, NIL)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    ANIMATION_PROCESS_PHYSICS(0),
    ANIMATION_PROCESS_IDLE(1),
    ANIMATION_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationProcessCallback = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _postProcessKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "_post_process_key_value")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationTree", "set_active")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationTree", "is_active")

    public val setTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_tree_root")

    public val getTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_tree_root")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_process_callback")

    public val setAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_animation_player")

    public val getAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_animation_player")

    public val setAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_advance_expression_base_node")

    public val getAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_advance_expression_base_node")

    public val setRootMotionTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_root_motion_track")

    public val getRootMotionTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_track")

    public val setAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_audio_max_polyphony")

    public val getAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_audio_max_polyphony")

    public val getRootMotionPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_position")

    public val getRootMotionRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_rotation")

    public val getRootMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_scale")

    public val getRootMotionPositionAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_position_accumulator")

    public val getRootMotionRotationAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_rotation_accumulator")

    public val getRootMotionScaleAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_root_motion_scale_accumulator")

    public val advancePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationTree", "advance")
  }
}
