// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class MultiplayerAPIExtension : MultiplayerAPI() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERAPIEXTENSION, scriptIndex)
    return true
  }

  public open fun _poll(): GodotError {
    throw NotImplementedError("_poll is not implemented for MultiplayerAPIExtension")
  }

  public open fun _setMultiplayerPeer(multiplayerPeer: MultiplayerPeer) {
  }

  public open fun _getMultiplayerPeer(): MultiplayerPeer? {
    throw NotImplementedError("_get_multiplayer_peer is not implemented for MultiplayerAPIExtension")
  }

  public open fun _getUniqueId(): Int {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerAPIExtension")
  }

  public open fun _getPeerIds(): PackedInt32Array {
    throw NotImplementedError("_get_peer_ids is not implemented for MultiplayerAPIExtension")
  }

  public open fun _rpc(
    peer: Int,
    _object: Object,
    method: StringName,
    args: VariantArray<Any?>,
  ): GodotError {
    throw NotImplementedError("_rpc is not implemented for MultiplayerAPIExtension")
  }

  public open fun _getRemoteSenderId(): Int {
    throw NotImplementedError("_get_remote_sender_id is not implemented for MultiplayerAPIExtension")
  }

  public open fun _objectConfigurationAdd(_object: Object, configuration: Any?): GodotError {
    throw NotImplementedError("_object_configuration_add is not implemented for MultiplayerAPIExtension")
  }

  public open fun _objectConfigurationRemove(_object: Object, configuration: Any?): GodotError {
    throw NotImplementedError("_object_configuration_remove is not implemented for MultiplayerAPIExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_poll")

    public val _setMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_set_multiplayer_peer")

    public val _getMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_get_multiplayer_peer")

    public val _getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_get_unique_id")

    public val _getPeerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_get_peer_ids")

    public val _rpcPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_rpc")

    public val _getRemoteSenderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_get_remote_sender_id")

    public val _objectConfigurationAddPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_object_configuration_add")

    public val _objectConfigurationRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPIExtension", "_object_configuration_remove")
  }
}
