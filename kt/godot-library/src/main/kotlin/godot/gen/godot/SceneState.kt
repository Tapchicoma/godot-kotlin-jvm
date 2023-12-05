// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneState internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENESTATE, scriptIndex)
    return true
  }

  public fun getNodeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNodeType(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeTypePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getNodeName(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  @JvmOverloads
  public fun getNodePath(idx: Int, forParent: Boolean = false): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to forParent)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun getNodeOwnerPath(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeOwnerPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun isNodeInstancePlaceholder(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeInstancePlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getNodeInstancePlaceholder(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeInstancePlaceholderPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getNodeInstance(idx: Int): PackedScene? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PackedScene?)
  }

  public fun getNodeGroups(idx: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeGroupsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getNodeIndex(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNodePropertyCount(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNodePropertyName(idx: Int, propIdx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to propIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getNodePropertyValue(idx: Int, propIdx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to propIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getConnectionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionSource(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionSourcePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun getConnectionSignal(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionSignalPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getConnectionTarget(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionTargetPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun getConnectionMethod(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionMethodPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getConnectionFlags(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionFlagsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionBinds(idx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionBindsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getConnectionUnbinds(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionUnbindsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class GenEditState(
    id: Long,
  ) {
    GEN_EDIT_STATE_DISABLED(0),
    GEN_EDIT_STATE_INSTANCE(1),
    GEN_EDIT_STATE_MAIN(2),
    GEN_EDIT_STATE_MAIN_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GenEditState = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNodeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_count")

    public val getNodeTypePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneState", "get_node_type")

    public val getNodeNamePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneState", "get_node_name")

    public val getNodePathPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneState", "get_node_path")

    public val getNodeOwnerPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_owner_path")

    public val isNodeInstancePlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "is_node_instance_placeholder")

    public val getNodeInstancePlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_instance_placeholder")

    public val getNodeInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_instance")

    public val getNodeGroupsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_groups")

    public val getNodeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_index")

    public val getNodePropertyCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_count")

    public val getNodePropertyNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_name")

    public val getNodePropertyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_value")

    public val getConnectionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_count")

    public val getConnectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_source")

    public val getConnectionSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_signal")

    public val getConnectionTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_target")

    public val getConnectionMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_method")

    public val getConnectionFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_flags")

    public val getConnectionBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_binds")

    public val getConnectionUnbindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_unbinds")
  }
}
