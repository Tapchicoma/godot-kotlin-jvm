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
public open class PacketPeerDTLS : PacketPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKETPEERDTLS, scriptIndex)
    return true
  }

  public fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  @JvmOverloads
  public fun connectToPeer(
    packetPeer: PacketPeerUDP,
    hostname: String,
    clientOptions: TLSOptions? = null,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to packetPeer, STRING to hostname, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToPeerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return PacketPeerDTLS.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun disconnectFromPeer() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromPeerPtr, NIL)
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
    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerDTLS", "poll")

    public val connectToPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerDTLS", "connect_to_peer")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerDTLS", "get_status")

    public val disconnectFromPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerDTLS", "disconnect_from_peer")
  }
}
