// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
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
public open class AnimationNodeBlendSpace1D : AnimationRootNode() {
  public var minSpace: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinSpacePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinSpacePtr, NIL)
    }

  public var maxSpace: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSpacePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSpacePtr, NIL)
    }

  public var snap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnapPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
    }

  public var valueLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getValueLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setValueLabelPtr, NIL)
    }

  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return AnimationNodeBlendSpace1D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingSyncPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseSyncPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE1D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Float,
    atIndex: Int = -1,
  ) {
    TransferContext.writeArguments(OBJECT to node, DOUBLE to pos.toDouble(), LONG to atIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendPointPtr, NIL)
  }

  public fun setBlendPointPosition(point: Int, pos: Float) {
    TransferContext.writeArguments(LONG to point.toLong(), DOUBLE to pos.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointPositionPtr, NIL)
  }

  public fun getBlendPointPosition(point: Int): Float {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    TransferContext.writeArguments(LONG to point.toLong(), OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointNodePtr, NIL)
  }

  public fun getBlendPointNode(point: Int): AnimationRootNode? {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?)
  }

  public fun removeBlendPoint(point: Int) {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBlendPointPtr, NIL)
  }

  public fun getBlendPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class BlendMode(
    id: Long,
  ) {
    BLEND_MODE_INTERPOLATED(0),
    BLEND_MODE_DISCRETE(1),
    BLEND_MODE_DISCRETE_CARRY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "add_blend_point")

    public val setBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_position")

    public val getBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_position")

    public val setBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_node")

    public val getBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_node")

    public val removeBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "remove_blend_point")

    public val getBlendPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_count")

    public val setMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_min_space")

    public val getMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_min_space")

    public val setMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_max_space")

    public val getMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_max_space")

    public val setSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_snap")

    public val getSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_snap")

    public val setValueLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_value_label")

    public val getValueLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_value_label")

    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_mode")

    public val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_use_sync")

    public val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "is_using_sync")
  }
}
