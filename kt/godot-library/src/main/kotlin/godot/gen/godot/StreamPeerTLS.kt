// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class StreamPeerTLS : StreamPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERTLS, scriptIndex)
    return true
  }

  public fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  public fun acceptStream(stream: StreamPeer, serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.acceptStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun connectToStream(
    stream: StreamPeer,
    commonName: String,
    clientOptions: TLSOptions? = null,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, STRING to commonName, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTLS.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getStream(): StreamPeer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeer?)
  }

  public fun disconnectFromStream() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromStreamPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    STATUS_DISCONNECTED(0),
    STATUS_HANDSHAKING(1),
    STATUS_CONNECTED(2),
    STATUS_ERROR(3),
    STATUS_ERROR_HOSTNAME_MISMATCH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Status = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "poll")

    public val acceptStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "accept_stream")

    public val connectToStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "connect_to_stream")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "get_status")

    public val getStreamPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "get_stream")

    public val disconnectFromStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "disconnect_from_stream")
  }
}
