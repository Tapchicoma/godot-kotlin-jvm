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
public open class TCPServer : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TCPSERVER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun listen(port: Int, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(rawPtr, MethodBindings.listenPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isListeningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeerTCP?)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val listenPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "listen")

    public val isConnectionAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "is_connection_available")

    public val isListeningPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "is_listening")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "get_local_port")

    public val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "take_connection")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "stop")
  }
}
