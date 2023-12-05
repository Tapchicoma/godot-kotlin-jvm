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
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class X509Certificate : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_X509CERTIFICATE, scriptIndex)
    return true
  }

  public fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun saveToString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.saveToStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun loadFromString(string: String): GodotError {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromStringPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val savePtr: VoidPtr = TypeManager.getMethodBindPtr("X509Certificate", "save")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("X509Certificate", "load")

    public val saveToStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("X509Certificate", "save_to_string")

    public val loadFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("X509Certificate", "load_from_string")
  }
}
