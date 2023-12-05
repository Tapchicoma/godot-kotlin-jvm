// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class StreamPeerBuffer : StreamPeer() {
  public var dataArray: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataArrayPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataArrayPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERBUFFER, scriptIndex)
    return true
  }

  public fun seek(position: Int) {
    TransferContext.writeArguments(LONG to position.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  public fun getSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPosition(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun resize(size: Int) {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun duplicate(): StreamPeerBuffer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeerBuffer?)
  }

  public companion object

  internal object MethodBindings {
    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerBuffer", "seek")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_size")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_position")

    public val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerBuffer", "resize")

    public val setDataArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "set_data_array")

    public val getDataArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_data_array")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerBuffer", "clear")

    public val duplicatePtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerBuffer", "duplicate")
  }
}
