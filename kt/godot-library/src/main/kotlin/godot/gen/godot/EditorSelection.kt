// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class EditorSelection internal constructor() : Object() {
  public val selectionChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSELECTION, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun addNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addNodePtr, NIL)
  }

  public fun removeNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.removeNodePtr, NIL)
  }

  public fun getSelectedNodes(): VariantArray<Node> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedNodesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  public fun getTransformableSelectedNodes(): VariantArray<Node> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformableSelectedNodesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSelection", "clear")

    public val addNodePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSelection", "add_node")

    public val removeNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSelection", "remove_node")

    public val getSelectedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSelection", "get_selected_nodes")

    public val getTransformableSelectedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSelection", "get_transformable_selected_nodes")
  }
}
