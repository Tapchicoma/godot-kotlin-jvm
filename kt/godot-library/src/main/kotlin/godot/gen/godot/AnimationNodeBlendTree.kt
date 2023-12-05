// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimationNodeBlendTree : AnimationRootNode() {
  public val nodeChanged: Signal1<StringName> by signal("nodeName")

  @CoreTypeLocalCopy
  public var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGraphOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGraphOffsetPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDTREE, scriptIndex)
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
   * val myCoreType = animationnodeblendtree.graphOffset
   * //Your changes
   * animationnodeblendtree.graphOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun graphOffsetMutate(block: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      block(this)
      graphOffset = this
  }


  @JvmOverloads
  public fun addNode(
    name: StringName,
    node: AnimationNode,
    position: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addNodePtr, NIL)
  }

  public fun getNode(name: StringName): AnimationNode? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationNode?)
  }

  public fun removeNode(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeNodePtr, NIL)
  }

  public fun renameNode(name: StringName, newName: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, MethodBindings.renameNodePtr, NIL)
  }

  public fun hasNode(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasNodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun connectNode(
    inputNode: StringName,
    inputIndex: Int,
    outputNode: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong(), STRING_NAME to outputNode)
    TransferContext.callMethod(rawPtr, MethodBindings.connectNodePtr, NIL)
  }

  public fun disconnectNode(inputNode: StringName, inputIndex: Int) {
    TransferContext.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectNodePtr, NIL)
  }

  public fun setNodePosition(name: StringName, position: Vector2) {
    TransferContext.writeArguments(STRING_NAME to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setNodePositionPtr, NIL)
  }

  public fun getNodePosition(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object {
    public final const val CONNECTION_OK: Long = 0

    public final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    public final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    public final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    public final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    public final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5
  }

  internal object MethodBindings {
    public val addNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "add_node")

    public val getNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "get_node")

    public val removeNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "remove_node")

    public val renameNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "rename_node")

    public val hasNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "has_node")

    public val connectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "connect_node")

    public val disconnectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "disconnect_node")

    public val setNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "set_node_position")

    public val getNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "get_node_position")

    public val setGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "set_graph_offset")

    public val getGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendTree", "get_graph_offset")
  }
}
