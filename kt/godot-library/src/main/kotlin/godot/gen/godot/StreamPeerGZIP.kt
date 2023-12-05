// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class StreamPeerGZIP : StreamPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERGZIP, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun startCompression(useDeflate: Boolean = false, bufferSize: Int = 65535): GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.startCompressionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun startDecompression(useDeflate: Boolean = false, bufferSize: Int = 65535): GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.startDecompressionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun finish(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val startCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "start_compression")

    public val startDecompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "start_decompression")

    public val finishPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerGZIP", "finish")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerGZIP", "clear")
  }
}
