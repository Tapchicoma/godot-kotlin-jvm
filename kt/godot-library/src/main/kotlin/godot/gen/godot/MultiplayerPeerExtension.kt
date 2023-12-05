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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class MultiplayerPeerExtension : MultiplayerPeer() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEEREXTENSION, scriptIndex)
    return true
  }

  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for MultiplayerPeerExtension")
  }

  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for MultiplayerPeerExtension")
  }

  public open fun _getPacketScript(): PackedByteArray {
    throw NotImplementedError("_get_packet_script is not implemented for MultiplayerPeerExtension")
  }

  public open fun _putPacketScript(pBuffer: PackedByteArray): GodotError {
    throw NotImplementedError("_put_packet_script is not implemented for MultiplayerPeerExtension")
  }

  public open fun _getPacketChannel(): Int {
    throw NotImplementedError("_get_packet_channel is not implemented for MultiplayerPeerExtension")
  }

  public open fun _getPacketMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_packet_mode is not implemented for MultiplayerPeerExtension")
  }

  public open fun _setTransferChannel(pChannel: Int) {
  }

  public open fun _getTransferChannel(): Int {
    throw NotImplementedError("_get_transfer_channel is not implemented for MultiplayerPeerExtension")
  }

  public open fun _setTransferMode(pMode: MultiplayerPeer.TransferMode) {
  }

  public open fun _getTransferMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_transfer_mode is not implemented for MultiplayerPeerExtension")
  }

  public open fun _setTargetPeer(pPeer: Int) {
  }

  public open fun _getPacketPeer(): Int {
    throw NotImplementedError("_get_packet_peer is not implemented for MultiplayerPeerExtension")
  }

  public open fun _isServer(): Boolean {
    throw NotImplementedError("_is_server is not implemented for MultiplayerPeerExtension")
  }

  public open fun _poll() {
  }

  public open fun _close() {
  }

  public open fun _disconnectPeer(pPeer: Int, pForce: Boolean) {
  }

  public open fun _getUniqueId(): Int {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerPeerExtension")
  }

  public open fun _setRefuseNewConnections(pEnable: Boolean) {
  }

  public open fun _isRefusingNewConnections(): Boolean {
    throw NotImplementedError("_is_refusing_new_connections is not implemented for MultiplayerPeerExtension")
  }

  public open fun _isServerRelaySupported(): Boolean {
    throw NotImplementedError("_is_server_relay_supported is not implemented for MultiplayerPeerExtension")
  }

  public open fun _getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    throw NotImplementedError("_get_connection_status is not implemented for MultiplayerPeerExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet")

    public val _putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_put_packet")

    public val _getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_available_packet_count")

    public val _getMaxPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_max_packet_size")

    public val _getPacketScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_script")

    public val _putPacketScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_put_packet_script")

    public val _getPacketChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_channel")

    public val _getPacketModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_mode")

    public val _setTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_transfer_channel")

    public val _getTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_transfer_channel")

    public val _setTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_transfer_mode")

    public val _getTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_transfer_mode")

    public val _setTargetPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_target_peer")

    public val _getPacketPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_peer")

    public val _isServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_server")

    public val _pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_poll")

    public val _closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_close")

    public val _disconnectPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_disconnect_peer")

    public val _getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_unique_id")

    public val _setRefuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_refuse_new_connections")

    public val _isRefusingNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_refusing_new_connections")

    public val _isServerRelaySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_server_relay_supported")

    public val _getConnectionStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_connection_status")
  }
}
