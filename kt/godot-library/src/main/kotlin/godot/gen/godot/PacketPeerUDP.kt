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
public open class PacketPeerUDP : PacketPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKETPEERUDP, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun bind(
    port: Int,
    bindAddress: String = "*",
    recvBufSize: Int = 65536,
  ): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress, LONG to recvBufSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bindPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isBound(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBoundPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun connectToHost(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isSocketConnected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSocketConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketIpPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getPacketPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setDestAddress(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDestAddressPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setBroadcastEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBroadcastEnabledPtr, NIL)
  }

  public fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, MethodBindings.joinMulticastGroupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, MethodBindings.leaveMulticastGroupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val bindPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "bind")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "close")

    public val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "wait")

    public val isBoundPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "is_bound")

    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "connect_to_host")

    public val isSocketConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "is_socket_connected")

    public val getPacketIpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_ip")

    public val getPacketPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_port")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_local_port")

    public val setDestAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_dest_address")

    public val setBroadcastEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_broadcast_enabled")

    public val joinMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "join_multicast_group")

    public val leaveMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "leave_multicast_group")
  }
}
