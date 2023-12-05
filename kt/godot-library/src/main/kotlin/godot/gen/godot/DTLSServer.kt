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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class DTLSServer : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DTLSSERVER, scriptIndex)
    return true
  }

  public fun setup(serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.setupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun takeConnection(udpPeer: PacketPeerUDP): PacketPeerDTLS? {
    TransferContext.writeArguments(OBJECT to udpPeer)
    TransferContext.callMethod(rawPtr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PacketPeerDTLS?)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr = TypeManager.getMethodBindPtr("DTLSServer", "setup")

    public val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DTLSServer", "take_connection")
  }
}
