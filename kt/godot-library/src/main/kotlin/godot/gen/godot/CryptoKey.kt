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
public open class CryptoKey : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CRYPTOKEY, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun save(path: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun load(path: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isPublicOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPublicOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun saveToString(publicOnly: Boolean = false): String {
    TransferContext.writeArguments(BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.saveToStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun loadFromString(stringKey: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to stringKey, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromStringPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val savePtr: VoidPtr = TypeManager.getMethodBindPtr("CryptoKey", "save")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("CryptoKey", "load")

    public val isPublicOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "is_public_only")

    public val saveToStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "save_to_string")

    public val loadFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "load_from_string")
  }
}
