// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Expression : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EXPRESSION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun parse(expression: String, inputNames: PackedStringArray = PackedStringArray()):
      GodotError {
    TransferContext.writeArguments(STRING to expression, PACKED_STRING_ARRAY to inputNames)
    TransferContext.callMethod(rawPtr, MethodBindings.parsePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun execute(
    inputs: VariantArray<Any?> = godot.core.variantArrayOf(),
    baseInstance: Object? = null,
    showError: Boolean = true,
    constCallsOnly: Boolean = false,
  ): Any? {
    TransferContext.writeArguments(ARRAY to inputs, OBJECT to baseInstance, BOOL to showError, BOOL to constCallsOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun hasExecuteFailed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasExecuteFailedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getErrorText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val parsePtr: VoidPtr = TypeManager.getMethodBindPtr("Expression", "parse")

    public val executePtr: VoidPtr = TypeManager.getMethodBindPtr("Expression", "execute")

    public val hasExecuteFailedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Expression", "has_execute_failed")

    public val getErrorTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Expression", "get_error_text")
  }
}
