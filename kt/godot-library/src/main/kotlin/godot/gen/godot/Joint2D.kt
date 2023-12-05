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
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class Joint2D internal constructor() : Node2D() {
  public var nodeA: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNodeAPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNodeAPtr, NIL)
    }

  public var nodeB: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNodeBPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNodeBPtr, NIL)
    }

  public var bias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
    }

  public var disableCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_JOINT2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_node_a")

    public val getNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_node_a")

    public val setNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_node_b")

    public val getNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_node_b")

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_bias")

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_bias")

    public val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_exclude_nodes_from_collision")

    public val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_exclude_nodes_from_collision")
  }
}
