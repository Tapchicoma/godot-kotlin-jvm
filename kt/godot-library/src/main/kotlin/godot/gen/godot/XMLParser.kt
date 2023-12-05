// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class XMLParser : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XMLPARSER, scriptIndex)
    return true
  }

  public fun read(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getNodeType(): NodeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeTypePtr, LONG)
    return XMLParser.NodeType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getNodeName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getNodeData(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeDataPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getNodeOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getAttributeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getAttributeName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getAttributeValue(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun hasAttribute(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAttributePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getNamedAttributeValue(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNamedAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getNamedAttributeValueSafe(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNamedAttributeValueSafePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCurrentLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun skipSection() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skipSectionPtr, NIL)
  }

  public fun seek(position: Long): GodotError {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun `open`(`file`: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, MethodBindings.openPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun openBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.openBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class NodeType(
    id: Long,
  ) {
    NODE_NONE(0),
    NODE_ELEMENT(1),
    NODE_ELEMENT_END(2),
    NODE_TEXT(3),
    NODE_COMMENT(4),
    NODE_CDATA(5),
    NODE_UNKNOWN(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): NodeType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val readPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "read")

    public val getNodeTypePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_type")

    public val getNodeNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_name")

    public val getNodeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_data")

    public val getNodeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_offset")

    public val getAttributeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_count")

    public val getAttributeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_name")

    public val getAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_value")

    public val hasAttributePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "has_attribute")

    public val getNamedAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value")

    public val getNamedAttributeValueSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value_safe")

    public val isEmptyPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "is_empty")

    public val getCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_current_line")

    public val skipSectionPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "skip_section")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "seek")

    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "open")

    public val openBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "open_buffer")
  }
}
