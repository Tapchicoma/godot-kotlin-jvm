// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimationNodeStateMachine : AnimationRootNode() {
  public var stateMachineType: StateMachineType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStateMachineTypePtr, LONG)
      return AnimationNodeStateMachine.StateMachineType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStateMachineTypePtr, NIL)
    }

  public var allowTransitionToSelf: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowTransitionToSelfPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowTransitionToSelfPtr, NIL)
    }

  public var resetEnds: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areEndsResetPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetEndsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE, scriptIndex)
    return true
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

  public fun replaceNode(name: StringName, node: AnimationNode) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.replaceNodePtr, NIL)
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

  public fun getNodeName(node: AnimationNode): StringName {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
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

  public fun hasTransition(from: StringName, to: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr, MethodBindings.hasTransitionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addTransition(
    from: StringName,
    to: StringName,
    transition: AnimationNodeStateMachineTransition,
  ) {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr, MethodBindings.addTransitionPtr, NIL)
  }

  public fun getTransition(idx: Int): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationNodeStateMachineTransition?)
  }

  public fun getTransitionFrom(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFromPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getTransitionTo(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionToPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getTransitionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeTransitionByIndex(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTransitionByIndexPtr, NIL)
  }

  public fun removeTransition(from: StringName, to: StringName) {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTransitionPtr, NIL)
  }

  public fun setGraphOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setGraphOffsetPtr, NIL)
  }

  public fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGraphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public enum class StateMachineType(
    id: Long,
  ) {
    STATE_MACHINE_TYPE_ROOT(0),
    STATE_MACHINE_TYPE_NESTED(1),
    STATE_MACHINE_TYPE_GROUPED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StateMachineType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "add_node")

    public val replaceNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "replace_node")

    public val getNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node")

    public val removeNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_node")

    public val renameNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "rename_node")

    public val hasNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "has_node")

    public val getNodeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node_name")

    public val setNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_node_position")

    public val getNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node_position")

    public val hasTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "has_transition")

    public val addTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "add_transition")

    public val getTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition")

    public val getTransitionFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_from")

    public val getTransitionToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_to")

    public val getTransitionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_count")

    public val removeTransitionByIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_transition_by_index")

    public val removeTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_transition")

    public val setGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_graph_offset")

    public val getGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_graph_offset")

    public val setStateMachineTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_state_machine_type")

    public val getStateMachineTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_state_machine_type")

    public val setAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_allow_transition_to_self")

    public val isAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "is_allow_transition_to_self")

    public val setResetEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_reset_ends")

    public val areEndsResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "are_ends_reset")
  }
}
