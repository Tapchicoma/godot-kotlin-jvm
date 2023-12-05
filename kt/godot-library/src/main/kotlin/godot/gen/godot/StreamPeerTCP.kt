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
public open class StreamPeerTCP : StreamPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERTCP, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun bind(port: Int, host: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to host)
    TransferContext.callMethod(rawPtr, MethodBindings.bindPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun connectToHost(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTCP.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedHostPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun disconnectFromHost() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromHostPtr, NIL)
  }

  public fun setNoDelay(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setNoDelayPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    STATUS_NONE(0),
    STATUS_CONNECTING(1),
    STATUS_CONNECTED(2),
    STATUS_ERROR(3),
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
    public val bindPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "bind")

    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "connect_to_host")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "poll")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "get_status")

    public val getConnectedHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_host")

    public val getConnectedPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_port")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_local_port")

    public val disconnectFromHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "disconnect_from_host")

    public val setNoDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "set_no_delay")
  }
}
