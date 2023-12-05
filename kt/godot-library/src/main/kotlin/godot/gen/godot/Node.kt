// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Node.ProcessThreadMessages
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.asStringName
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads
import kotlin.reflect.KFunction0
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction10
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8
import kotlin.reflect.KFunction9

@GodotBaseType
public open class Node : Object() {
  public val ready: Signal0 by signal()

  public val renamed: Signal0 by signal()

  public val treeEntered: Signal0 by signal()

  public val treeExiting: Signal0 by signal()

  public val treeExited: Signal0 by signal()

  public val childEnteredTree: Signal1<Node> by signal("node")

  public val childExitingTree: Signal1<Node> by signal("node")

  public val childOrderChanged: Signal0 by signal()

  public val replacingBy: Signal1<Node> by signal("node")

  public var name: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNamePtr, NIL)
    }

  public var uniqueNameInOwner: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUniqueNameInOwnerPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUniqueNameInOwnerPtr, NIL)
    }

  public var sceneFilePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSceneFilePathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSceneFilePathPtr, NIL)
    }

  public var owner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOwnerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOwnerPtr, NIL)
    }

  public val multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?)
    }

  public var processMode: ProcessMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessModePtr, LONG)
      return Node.ProcessMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessModePtr, NIL)
    }

  public var processPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessPriorityPtr, NIL)
    }

  public var processPhysicsPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsProcessPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsProcessPriorityPtr, NIL)
    }

  public var processThreadGroup: ProcessThreadGroup
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessThreadGroupPtr, LONG)
      return Node.ProcessThreadGroup.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessThreadGroupPtr, NIL)
    }

  public var processThreadGroupOrder: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessThreadGroupOrderPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessThreadGroupOrderPtr, NIL)
    }

  public var processThreadMessages: ProcessThreadMessages
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessThreadMessagesPtr, LONG)
      return godot.Node.ProcessThreadMessagesValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessThreadMessagesPtr, NIL)
    }

  public var editorDescription: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditorDescriptionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditorDescriptionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NODE, scriptIndex)
    return true
  }

  public inline fun <reified FUNCTION : KFunction0<*>> rpc(function: FUNCTION): GodotError =
      rpc(function.name.camelToSnakeCase().asStringName())

  public inline fun <reified FUNCTION : KFunction0<*>> rpcId(id: Long, function: FUNCTION):
      GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName())

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpc(function: FUNCTION,
      arg0: ARG0): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0)

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4,
      arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4, arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION :
      KFunction7<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4,
      arg5, arg6)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION :
      KFunction7<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4, arg5, arg6)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION :
      KFunction8<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4,
      arg5, arg6, arg7)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION :
      KFunction8<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4, arg5, arg6, arg7)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4,
      arg5, arg6, arg7, arg8)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4, arg5, arg6, arg7, arg8)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9,
  ): GodotError = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4,
      arg5, arg6, arg7, arg8, arg9)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9,
  ): GodotError = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3,
      arg4, arg5, arg6, arg7, arg8, arg9)

  public open fun _process(delta: Double) {
  }

  public open fun _physicsProcess(delta: Double) {
  }

  public open fun _enterTree() {
  }

  public open fun _exitTree() {
  }

  public open fun _ready() {
  }

  public open fun _getConfigurationWarnings(): PackedStringArray {
    throw NotImplementedError("_get_configuration_warnings is not implemented for Node")
  }

  public open fun _input(event: InputEvent) {
  }

  public open fun _shortcutInput(event: InputEvent) {
  }

  public open fun _unhandledInput(event: InputEvent) {
  }

  public open fun _unhandledKeyInput(event: InputEvent) {
  }

  @JvmOverloads
  public fun addSibling(sibling: Node, forceReadableName: Boolean = false) {
    TransferContext.writeArguments(OBJECT to sibling, BOOL to forceReadableName)
    TransferContext.callMethod(rawPtr, MethodBindings.addSiblingPtr, NIL)
  }

  @JvmOverloads
  public fun addChild(
    node: Node,
    forceReadableName: Boolean = false,
    `internal`: InternalMode = Node.InternalMode.INTERNAL_MODE_DISABLED,
  ) {
    TransferContext.writeArguments(OBJECT to node, BOOL to forceReadableName, LONG to internal.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addChildPtr, NIL)
  }

  public fun removeChild(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.removeChildPtr, NIL)
  }

  @JvmOverloads
  public fun reparent(newParent: Node, keepGlobalTransform: Boolean = true) {
    TransferContext.writeArguments(OBJECT to newParent, BOOL to keepGlobalTransform)
    TransferContext.callMethod(rawPtr, MethodBindings.reparentPtr, NIL)
  }

  @JvmOverloads
  public fun getChildCount(includeInternal: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, MethodBindings.getChildCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getChildren(includeInternal: Boolean = false): VariantArray<Node> {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, MethodBindings.getChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  @JvmOverloads
  public fun getChild(idx: Int, includeInternal: Boolean = false): Node? {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, MethodBindings.getChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  public fun hasNode(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasNodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getNode(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  public fun getNodeOrNull(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeOrNullPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  public fun getParent(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  @JvmOverloads
  public fun findChild(
    pattern: String,
    recursive: Boolean = true,
    owned: Boolean = true,
  ): Node? {
    TransferContext.writeArguments(STRING to pattern, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(rawPtr, MethodBindings.findChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  @JvmOverloads
  public fun findChildren(
    pattern: String,
    type: String = "",
    recursive: Boolean = true,
    owned: Boolean = true,
  ): VariantArray<Node> {
    TransferContext.writeArguments(STRING to pattern, STRING to type, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(rawPtr, MethodBindings.findChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  public fun findParent(pattern: String): Node? {
    TransferContext.writeArguments(STRING to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.findParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  public fun hasNodeAndResource(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasNodeAndResourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getNodeAndResource(path: NodePath): VariantArray<Any?> {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeAndResourcePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun isInsideTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInsideTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isAncestorOf(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.isAncestorOfPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isGreaterThan(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.isGreaterThanPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  @JvmOverloads
  public fun getPathTo(node: Node, useUniquePath: Boolean = false): NodePath {
    TransferContext.writeArguments(OBJECT to node, BOOL to useUniquePath)
    TransferContext.callMethod(rawPtr, MethodBindings.getPathToPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  @JvmOverloads
  public fun addToGroup(group: StringName, persistent: Boolean = false) {
    TransferContext.writeArguments(STRING_NAME to group, BOOL to persistent)
    TransferContext.callMethod(rawPtr, MethodBindings.addToGroupPtr, NIL)
  }

  public fun removeFromGroup(group: StringName) {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.removeFromGroupPtr, NIL)
  }

  public fun isInGroup(group: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.isInGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun moveChild(childNode: Node, toIndex: Int) {
    TransferContext.writeArguments(OBJECT to childNode, LONG to toIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveChildPtr, NIL)
  }

  public fun getGroups(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  @JvmOverloads
  public fun getIndex(includeInternal: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun printTree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.printTreePtr, NIL)
  }

  public fun printTreePretty() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.printTreePrettyPtr, NIL)
  }

  public fun propagateNotification(what: Int) {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.propagateNotificationPtr, NIL)
  }

  @JvmOverloads
  public fun propagateCall(
    method: StringName,
    args: VariantArray<Any?> = godot.core.variantArrayOf(),
    parentFirst: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to args, BOOL to parentFirst)
    TransferContext.callMethod(rawPtr, MethodBindings.propagateCallPtr, NIL)
  }

  public fun setPhysicsProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsProcessPtr, NIL)
  }

  public fun getPhysicsProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsProcessDeltaTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun isPhysicsProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPhysicsProcessingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessDeltaTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessPtr, NIL)
  }

  public fun isProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setProcessInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessInputPtr, NIL)
  }

  public fun isProcessingInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setProcessShortcutInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessShortcutInputPtr, NIL)
  }

  public fun isProcessingShortcutInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingShortcutInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setProcessUnhandledInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessUnhandledInputPtr, NIL)
  }

  public fun isProcessingUnhandledInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingUnhandledInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setProcessUnhandledKeyInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessUnhandledKeyInputPtr, NIL)
  }

  public fun isProcessingUnhandledKeyInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingUnhandledKeyInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun canProcess(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canProcessPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDisplayFolded(fold: Boolean) {
    TransferContext.writeArguments(BOOL to fold)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisplayFoldedPtr, NIL)
  }

  public fun isDisplayedFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDisplayedFoldedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessInternalPtr, NIL)
  }

  public fun isProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessingInternalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setPhysicsProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsProcessInternalPtr, NIL)
  }

  public fun isPhysicsProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPhysicsProcessingInternalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getWindow(): Window? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWindowPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Window?)
  }

  public fun getLastExclusiveWindow(): Window? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastExclusiveWindowPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Window?)
  }

  public fun getTree(): SceneTree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SceneTree?)
  }

  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTweenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  @JvmOverloads
  public fun duplicate(flags: Int = 15): Node? {
    TransferContext.writeArguments(LONG to flags.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Node)
  }

  @JvmOverloads
  public fun replaceBy(node: Node, keepGroups: Boolean = false) {
    TransferContext.writeArguments(OBJECT to node, BOOL to keepGroups)
    TransferContext.callMethod(rawPtr, MethodBindings.replaceByPtr, NIL)
  }

  public fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    TransferContext.writeArguments(BOOL to loadPlaceholder)
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneInstanceLoadPlaceholderPtr, NIL)
  }

  public fun getSceneInstanceLoadPlaceholder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneInstanceLoadPlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setEditableInstance(node: Node, isEditable: Boolean) {
    TransferContext.writeArguments(OBJECT to node, BOOL to isEditable)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditableInstancePtr, NIL)
  }

  public fun isEditableInstance(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.isEditableInstancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getViewport(): Viewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewportPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Viewport?)
  }

  public fun queueFree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queueFreePtr, NIL)
  }

  public fun requestReady() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.requestReadyPtr, NIL)
  }

  public fun isNodeReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun setMultiplayerAuthority(id: Int, recursive: Boolean = true) {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to recursive)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerAuthorityPtr, NIL)
  }

  public fun getMultiplayerAuthority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerAuthorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isMultiplayerAuthority(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMultiplayerAuthorityPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun rpcConfig(method: StringName, config: Any?) {
    TransferContext.writeArguments(STRING_NAME to method, ANY to config)
    TransferContext.callMethod(rawPtr, MethodBindings.rpcConfigPtr, NIL)
  }

  public fun rpc(method: StringName, vararg __var_args: Any?): GodotError {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.rpcPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun rpcId(
    peerId: Long,
    method: StringName,
    vararg __var_args: Any?,
  ): GodotError {
    TransferContext.writeArguments(LONG to peerId, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.rpcIdPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun updateConfigurationWarnings() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateConfigurationWarningsPtr, NIL)
  }

  public fun callDeferredThreadGroup(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callDeferredThreadGroupPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setDeferredThreadGroup(`property`: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setDeferredThreadGroupPtr, NIL)
  }

  public fun notifyDeferredThreadGroup(what: Int) {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyDeferredThreadGroupPtr, NIL)
  }

  public fun callThreadSafe(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callThreadSafePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setThreadSafe(`property`: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setThreadSafePtr, NIL)
  }

  public fun notifyThreadSafe(what: Int) {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyThreadSafePtr, NIL)
  }

  public enum class ProcessMode(
    id: Long,
  ) {
    PROCESS_MODE_INHERIT(0),
    PROCESS_MODE_PAUSABLE(1),
    PROCESS_MODE_WHEN_PAUSED(2),
    PROCESS_MODE_ALWAYS(3),
    PROCESS_MODE_DISABLED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ProcessThreadGroup(
    id: Long,
  ) {
    PROCESS_THREAD_GROUP_INHERIT(0),
    PROCESS_THREAD_GROUP_MAIN_THREAD(1),
    PROCESS_THREAD_GROUP_SUB_THREAD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessThreadGroup = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface ProcessThreadMessages {
    public val flag: Long

    public infix fun or(other: godot.Node.ProcessThreadMessages): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.or(other))

    public infix fun xor(other: godot.Node.ProcessThreadMessages): godot.Node.ProcessThreadMessages
        = ProcessThreadMessagesValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.xor(other))

    public infix fun and(other: godot.Node.ProcessThreadMessages): godot.Node.ProcessThreadMessages
        = ProcessThreadMessagesValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.and(other))

    public operator fun plus(other: godot.Node.ProcessThreadMessages):
        godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.plus(other))

    public operator fun minus(other: godot.Node.ProcessThreadMessages):
        godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.minus(other))

    public operator fun times(other: godot.Node.ProcessThreadMessages):
        godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.times(other))

    public operator fun div(other: godot.Node.ProcessThreadMessages):
        godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.div(other))

    public operator fun rem(other: godot.Node.ProcessThreadMessages):
        godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.rem(other))

    public fun unaryPlus(): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.unaryPlus())

    public fun unaryMinus(): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.unaryMinus())

    public fun inv(): godot.Node.ProcessThreadMessages = ProcessThreadMessagesValue(flag.inv())

    public infix fun shl(bits: Int): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag shl bits)

    public infix fun shr(bits: Int): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.Node.ProcessThreadMessages =
        ProcessThreadMessagesValue(flag ushr bits)

    public companion object {
      public val FLAG_PROCESS_THREAD_MESSAGES: godot.Node.ProcessThreadMessages =
          godot.Node.ProcessThreadMessagesValue(1)

      public val FLAG_PROCESS_THREAD_MESSAGES_PHYSICS: godot.Node.ProcessThreadMessages =
          godot.Node.ProcessThreadMessagesValue(2)

      public val FLAG_PROCESS_THREAD_MESSAGES_ALL: godot.Node.ProcessThreadMessages =
          godot.Node.ProcessThreadMessagesValue(3)
    }
  }

  @JvmInline
  internal value class ProcessThreadMessagesValue internal constructor(
    override val flag: Long,
  ) : godot.Node.ProcessThreadMessages

  public enum class DuplicateFlags(
    id: Long,
  ) {
    DUPLICATE_SIGNALS(1),
    DUPLICATE_GROUPS(2),
    DUPLICATE_SCRIPTS(4),
    DUPLICATE_USE_INSTANTIATION(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DuplicateFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class InternalMode(
    id: Long,
  ) {
    INTERNAL_MODE_DISABLED(0),
    INTERNAL_MODE_FRONT(1),
    INTERNAL_MODE_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InternalMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_ENTER_TREE: Long = 10

    public final const val NOTIFICATION_EXIT_TREE: Long = 11

    public final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    public final const val NOTIFICATION_READY: Long = 13

    public final const val NOTIFICATION_PAUSED: Long = 14

    public final const val NOTIFICATION_UNPAUSED: Long = 15

    public final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    public final const val NOTIFICATION_PROCESS: Long = 17

    public final const val NOTIFICATION_PARENTED: Long = 18

    public final const val NOTIFICATION_UNPARENTED: Long = 19

    public final const val NOTIFICATION_SCENE_INSTANTIATED: Long = 20

    public final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    public final const val NOTIFICATION_DRAG_END: Long = 22

    public final const val NOTIFICATION_PATH_RENAMED: Long = 23

    public final const val NOTIFICATION_CHILD_ORDER_CHANGED: Long = 24

    public final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    public final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    public final const val NOTIFICATION_POST_ENTER_TREE: Long = 27

    public final const val NOTIFICATION_DISABLED: Long = 28

    public final const val NOTIFICATION_ENABLED: Long = 29

    public final const val NOTIFICATION_NODE_RECACHE_REQUESTED: Long = 30

    public final const val NOTIFICATION_EDITOR_PRE_SAVE: Long = 9001

    public final const val NOTIFICATION_EDITOR_POST_SAVE: Long = 9002

    public final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    public final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    public final const val NOTIFICATION_WM_WINDOW_FOCUS_IN: Long = 1004

    public final const val NOTIFICATION_WM_WINDOW_FOCUS_OUT: Long = 1005

    public final const val NOTIFICATION_WM_CLOSE_REQUEST: Long = 1006

    public final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    public final const val NOTIFICATION_WM_SIZE_CHANGED: Long = 1008

    public final const val NOTIFICATION_WM_DPI_CHANGE: Long = 1009

    public final const val NOTIFICATION_VP_MOUSE_ENTER: Long = 1010

    public final const val NOTIFICATION_VP_MOUSE_EXIT: Long = 1011

    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    public final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 2010

    public final const val NOTIFICATION_WM_ABOUT: Long = 2011

    public final const val NOTIFICATION_CRASH: Long = 2012

    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018

    public fun printOrphanNodes() {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.printOrphanNodesPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val _processPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_process")

    public val _physicsProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "_physics_process")

    public val _enterTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_enter_tree")

    public val _exitTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_exit_tree")

    public val _readyPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_ready")

    public val _getConfigurationWarningsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "_get_configuration_warnings")

    public val _inputPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_input")

    public val _shortcutInputPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "_shortcut_input")

    public val _unhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "_unhandled_input")

    public val _unhandledKeyInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "_unhandled_key_input")

    public val printOrphanNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "print_orphan_nodes")

    public val addSiblingPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "add_sibling")

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_name")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_name")

    public val addChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "add_child")

    public val removeChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "remove_child")

    public val reparentPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "reparent")

    public val getChildCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_child_count")

    public val getChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_children")

    public val getChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_child")

    public val hasNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "has_node")

    public val getNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_node")

    public val getNodeOrNullPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_node_or_null")

    public val getParentPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_parent")

    public val findChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "find_child")

    public val findChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "find_children")

    public val findParentPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "find_parent")

    public val hasNodeAndResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "has_node_and_resource")

    public val getNodeAndResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_node_and_resource")

    public val isInsideTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_inside_tree")

    public val isAncestorOfPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_ancestor_of")

    public val isGreaterThanPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_greater_than")

    public val getPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_path")

    public val getPathToPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_path_to")

    public val addToGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "add_to_group")

    public val removeFromGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "remove_from_group")

    public val isInGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_in_group")

    public val moveChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "move_child")

    public val getGroupsPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_groups")

    public val setOwnerPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_owner")

    public val getOwnerPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_owner")

    public val getIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_index")

    public val printTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "print_tree")

    public val printTreePrettyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "print_tree_pretty")

    public val setSceneFilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_scene_file_path")

    public val getSceneFilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_scene_file_path")

    public val propagateNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "propagate_notification")

    public val propagateCallPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "propagate_call")

    public val setPhysicsProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process")

    public val getPhysicsProcessDeltaTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_physics_process_delta_time")

    public val isPhysicsProcessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_processing")

    public val getProcessDeltaTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_delta_time")

    public val setProcessPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_process")

    public val setProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_priority")

    public val getProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_priority")

    public val setPhysicsProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process_priority")

    public val getPhysicsProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_physics_process_priority")

    public val isProcessingPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_processing")

    public val setProcessInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_input")

    public val isProcessingInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_input")

    public val setProcessShortcutInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_shortcut_input")

    public val isProcessingShortcutInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_shortcut_input")

    public val setProcessUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_unhandled_input")

    public val isProcessingUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_unhandled_input")

    public val setProcessUnhandledKeyInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_unhandled_key_input")

    public val isProcessingUnhandledKeyInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_unhandled_key_input")

    public val setProcessModePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_process_mode")

    public val getProcessModePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_process_mode")

    public val canProcessPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "can_process")

    public val setProcessThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_group")

    public val getProcessThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_group")

    public val setProcessThreadMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_messages")

    public val getProcessThreadMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_messages")

    public val setProcessThreadGroupOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_group_order")

    public val getProcessThreadGroupOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_group_order")

    public val setDisplayFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_display_folded")

    public val isDisplayedFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_displayed_folded")

    public val setProcessInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_internal")

    public val isProcessingInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_internal")

    public val setPhysicsProcessInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process_internal")

    public val isPhysicsProcessingInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_processing_internal")

    public val getWindowPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_window")

    public val getLastExclusiveWindowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_last_exclusive_window")

    public val getTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_tree")

    public val createTweenPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "create_tween")

    public val duplicatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "duplicate")

    public val replaceByPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "replace_by")

    public val setSceneInstanceLoadPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_scene_instance_load_placeholder")

    public val getSceneInstanceLoadPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_scene_instance_load_placeholder")

    public val setEditableInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_editable_instance")

    public val isEditableInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_editable_instance")

    public val getViewportPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_viewport")

    public val queueFreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "queue_free")

    public val requestReadyPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "request_ready")

    public val isNodeReadyPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "is_node_ready")

    public val setMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_multiplayer_authority")

    public val getMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_multiplayer_authority")

    public val isMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_multiplayer_authority")

    public val getMultiplayerPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_multiplayer")

    public val rpcConfigPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "rpc_config")

    public val setEditorDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_editor_description")

    public val getEditorDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_editor_description")

    public val setUniqueNameInOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_unique_name_in_owner")

    public val isUniqueNameInOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_unique_name_in_owner")

    public val rpcPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "rpc")

    public val rpcIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "rpc_id")

    public val updateConfigurationWarningsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "update_configuration_warnings")

    public val callDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "call_deferred_thread_group")

    public val setDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_deferred_thread_group")

    public val notifyDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "notify_deferred_thread_group")

    public val callThreadSafePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "call_thread_safe")

    public val setThreadSafePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_thread_safe")

    public val notifyThreadSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "notify_thread_safe")
  }
}

public infix fun Long.or(other: ProcessThreadMessages): Long = this.or(other.flag)

public infix fun Long.xor(other: ProcessThreadMessages): Long = this.xor(other.flag)

public infix fun Long.and(other: ProcessThreadMessages): Long = this.and(other.flag)

public operator fun Long.plus(other: ProcessThreadMessages): Long = this.plus(other.flag)

public operator fun Long.minus(other: ProcessThreadMessages): Long = this.minus(other.flag)

public operator fun Long.times(other: ProcessThreadMessages): Long = this.times(other.flag)

public operator fun Long.div(other: ProcessThreadMessages): Long = this.div(other.flag)

public operator fun Long.rem(other: ProcessThreadMessages): Long = this.rem(other.flag)
