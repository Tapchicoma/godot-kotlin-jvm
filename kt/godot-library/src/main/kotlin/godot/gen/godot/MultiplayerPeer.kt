// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class MultiplayerPeer internal constructor() : PacketPeer() {
  public val peerConnected: Signal1<Long> by signal("id")

  public val peerDisconnected: Signal1<Long> by signal("id")

  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRefusingNewConnectionsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRefuseNewConnectionsPtr, NIL)
    }

  public var transferMode: TransferMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransferModePtr, LONG)
      return MultiplayerPeer.TransferMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransferModePtr, NIL)
    }

  public var transferChannel: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransferChannelPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTransferChannelPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEER, scriptIndex)
    return true
  }

  public fun setTargetPeer(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetPeerPtr, NIL)
  }

  public fun getPacketPeer(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketPeerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPacketChannel(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketChannelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPacketMode(): TransferMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketModePtr, LONG)
    return MultiplayerPeer.TransferMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  public fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  @JvmOverloads
  public fun disconnectPeer(peer: Int, force: Boolean = false) {
    TransferContext.writeArguments(LONG to peer.toLong(), BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPeerPtr, NIL)
  }

  public fun getConnectionStatus(): ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionStatusPtr, LONG)
    return MultiplayerPeer.ConnectionStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getUniqueId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun generateUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun isServerRelaySupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isServerRelaySupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class ConnectionStatus(
    id: Long,
  ) {
    CONNECTION_DISCONNECTED(0),
    CONNECTION_CONNECTING(1),
    CONNECTION_CONNECTED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ConnectionStatus = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TransferMode(
    id: Long,
  ) {
    TRANSFER_MODE_UNRELIABLE(0),
    TRANSFER_MODE_UNRELIABLE_ORDERED(1),
    TRANSFER_MODE_RELIABLE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransferMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val TARGET_PEER_BROADCAST: Long = 0

    public final const val TARGET_PEER_SERVER: Long = 1
  }

  internal object MethodBindings {
    public val setTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_transfer_channel")

    public val getTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_transfer_channel")

    public val setTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_transfer_mode")

    public val getTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_transfer_mode")

    public val setTargetPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_target_peer")

    public val getPacketPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_peer")

    public val getPacketChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_channel")

    public val getPacketModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_mode")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeer", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeer", "close")

    public val disconnectPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "disconnect_peer")

    public val getConnectionStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_connection_status")

    public val getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_unique_id")

    public val generateUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "generate_unique_id")

    public val setRefuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_refuse_new_connections")

    public val isRefusingNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "is_refusing_new_connections")

    public val isServerRelaySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "is_server_relay_supported")
  }
}
