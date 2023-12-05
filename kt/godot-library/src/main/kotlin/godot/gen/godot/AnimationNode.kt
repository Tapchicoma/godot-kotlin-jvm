// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimationNode : Resource() {
  public val treeChanged: Signal0 by signal()

  public val animationNodeRenamed: Signal3<Long, String, String> by signal("objectId", "oldName",
      "newName")

  public val animationNodeRemoved: Signal2<Long, String> by signal("objectId", "name")

  public var filterEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFilterEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODE, scriptIndex)
    return true
  }

  public open fun _getChildNodes(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_child_nodes is not implemented for AnimationNode")
  }

  public open fun _getParameterList(): VariantArray<Any?> {
    throw NotImplementedError("_get_parameter_list is not implemented for AnimationNode")
  }

  public open fun _getChildByName(name: StringName): AnimationNode? {
    throw NotImplementedError("_get_child_by_name is not implemented for AnimationNode")
  }

  public open fun _getParameterDefaultValue(parameter: StringName): Any? {
    throw NotImplementedError("_get_parameter_default_value is not implemented for AnimationNode")
  }

  public open fun _isParameterReadOnly(parameter: StringName): Boolean {
    throw NotImplementedError("_is_parameter_read_only is not implemented for AnimationNode")
  }

  public open fun _process(
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    testOnly: Boolean,
  ): Double {
    throw NotImplementedError("_process is not implemented for AnimationNode")
  }

  public open fun _getCaption(): String {
    throw NotImplementedError("_get_caption is not implemented for AnimationNode")
  }

  public open fun _hasFilter(): Boolean {
    throw NotImplementedError("_has_filter is not implemented for AnimationNode")
  }

  public fun addInput(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeInput(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeInputPtr, NIL)
  }

  public fun setInputName(input: Int, name: String): Boolean {
    TransferContext.writeArguments(LONG to input.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputNamePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getInputName(input: Int): String {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getInputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findInput(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInputPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFilterPath(path: NodePath, enable: Boolean) {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterPathPtr, NIL)
  }

  public fun isPathFiltered(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.isPathFilteredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun blendAnimation(
    animation: StringName,
    time: Double,
    delta: Double,
    seeked: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    loopedFlag: Animation.LoopedFlag = Animation.LoopedFlag.LOOPED_FLAG_NONE,
  ) {
    TransferContext.writeArguments(STRING_NAME to animation, DOUBLE to time, DOUBLE to delta, BOOL to seeked, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to loopedFlag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.blendAnimationPtr, NIL)
  }

  @JvmOverloads
  public fun blendNode(
    name: StringName,
    node: AnimationNode,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.blendNodePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun blendInput(
    inputIndex: Int,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(LONG to inputIndex.toLong(), DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.blendInputPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setParameter(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setParameterPtr, NIL)
  }

  public fun getParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public enum class FilterAction(
    id: Long,
  ) {
    FILTER_IGNORE(0),
    FILTER_PASS(1),
    FILTER_STOP(2),
    FILTER_BLEND(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FilterAction = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getChildNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_get_child_nodes")

    public val _getParameterListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_get_parameter_list")

    public val _getChildByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_get_child_by_name")

    public val _getParameterDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_get_parameter_default_value")

    public val _isParameterReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_is_parameter_read_only")

    public val _processPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "_process")

    public val _getCaptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "_get_caption")

    public val _hasFilterPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "_has_filter")

    public val addInputPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "add_input")

    public val removeInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "remove_input")

    public val setInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_input_name")

    public val getInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_input_name")

    public val getInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_input_count")

    public val findInputPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "find_input")

    public val setFilterPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_filter_path")

    public val isPathFilteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "is_path_filtered")

    public val setFilterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_filter_enabled")

    public val isFilterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "is_filter_enabled")

    public val blendAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "blend_animation")

    public val blendNodePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "blend_node")

    public val blendInputPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationNode", "blend_input")

    public val setParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_parameter")

    public val getParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_parameter")
  }
}
