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
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class MultiplayerAPI internal constructor() : RefCounted() {
  public val peerConnected: Signal1<Long> by signal("id")

  public val peerDisconnected: Signal1<Long> by signal("id")

  public val connectedToServer: Signal0 by signal()

  public val connectionFailed: Signal0 by signal()

  public val serverDisconnected: Signal0 by signal()

  public var multiplayerPeer: MultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerPeerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerPeer?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPeerPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERAPI, scriptIndex)
    return true
  }

  public fun hasMultiplayerPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMultiplayerPeerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getUniqueId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isServerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getRemoteSenderId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemoteSenderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun rpc(
    peer: Int,
    _object: Object,
    method: StringName,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): GodotError {
    TransferContext.writeArguments(LONG to peer.toLong(), OBJECT to _object, STRING_NAME to method, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.rpcPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun objectConfigurationAdd(_object: Object, configuration: Any?): GodotError {
    TransferContext.writeArguments(OBJECT to _object, ANY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.objectConfigurationAddPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun objectConfigurationRemove(_object: Object, configuration: Any?): GodotError {
    TransferContext.writeArguments(OBJECT to _object, ANY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.objectConfigurationRemovePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPeersPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public enum class RPCMode(
    id: Long,
  ) {
    RPC_MODE_DISABLED(0),
    RPC_MODE_ANY_PEER(1),
    RPC_MODE_AUTHORITY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RPCMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public fun setDefaultInterface(interfaceName: StringName) {
      TransferContext.writeArguments(STRING_NAME to interfaceName)
      TransferContext.callMethod(0, MethodBindings.setDefaultInterfacePtr, NIL)
    }

    public fun getDefaultInterface(): StringName {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getDefaultInterfacePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }

    public fun createDefaultInterface(): MultiplayerAPI? {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.createDefaultInterfacePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?)
    }
  }

  internal object MethodBindings {
    public val hasMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "has_multiplayer_peer")

    public val getMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_multiplayer_peer")

    public val setMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "set_multiplayer_peer")

    public val getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_unique_id")

    public val isServerPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "is_server")

    public val getRemoteSenderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_remote_sender_id")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "poll")

    public val rpcPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "rpc")

    public val objectConfigurationAddPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "object_configuration_add")

    public val objectConfigurationRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "object_configuration_remove")

    public val getPeersPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "get_peers")

    public val setDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "set_default_interface")

    public val getDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_default_interface")

    public val createDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "create_default_interface")
  }
}
