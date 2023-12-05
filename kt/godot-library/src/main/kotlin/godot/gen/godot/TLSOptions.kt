// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TLSOptions internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TLSOPTIONS, scriptIndex)
    return true
  }

  public companion object {
    @JvmOverloads
    public fun client(trustedChain: X509Certificate? = null, commonNameOverride: String = ""):
        TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain, STRING to commonNameOverride)
      TransferContext.callMethod(0, MethodBindings.clientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }

    @JvmOverloads
    public fun clientUnsafe(trustedChain: X509Certificate? = null): TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain)
      TransferContext.callMethod(0, MethodBindings.clientUnsafePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }

    public fun server(key: CryptoKey, certificate: X509Certificate): TLSOptions? {
      TransferContext.writeArguments(OBJECT to key, OBJECT to certificate)
      TransferContext.callMethod(0, MethodBindings.serverPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }
  }

  internal object MethodBindings {
    public val clientPtr: VoidPtr = TypeManager.getMethodBindPtr("TLSOptions", "client")

    public val clientUnsafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "client_unsafe")

    public val serverPtr: VoidPtr = TypeManager.getMethodBindPtr("TLSOptions", "server")
  }
}
