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
public open class UDPServer : RefCounted() {
  public var maxPendingConnections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPendingConnectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPendingConnectionsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UDPSERVER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun listen(port: Int, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(rawPtr, MethodBindings.listenPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isListeningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun takeConnection(): PacketPeerUDP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PacketPeerUDP?)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val listenPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "listen")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "poll")

    public val isConnectionAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "is_connection_available")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "get_local_port")

    public val isListeningPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "is_listening")

    public val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "take_connection")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "stop")

    public val setMaxPendingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "set_max_pending_connections")

    public val getMaxPendingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "get_max_pending_connections")
  }
}
