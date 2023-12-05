// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
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
public open class JSONRPC : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_JSONRPC, scriptIndex)
    return true
  }

  public fun setScope(scope: String, target: Object) {
    TransferContext.writeArguments(STRING to scope, OBJECT to target)
    TransferContext.callMethod(rawPtr, MethodBindings.setScopePtr, NIL)
  }

  @JvmOverloads
  public fun processAction(action: Any?, recurse: Boolean = false): Any? {
    TransferContext.writeArguments(ANY to action, BOOL to recurse)
    TransferContext.callMethod(rawPtr, MethodBindings.processActionPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun processString(action: String): String {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.processStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun makeRequest(
    method: String,
    params: Any?,
    id: Any?,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeRequestPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun makeResponse(result: Any?, id: Any?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(ANY to result, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeResponsePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun makeNotification(method: String, params: Any?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params)
    TransferContext.callMethod(rawPtr, MethodBindings.makeNotificationPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun makeResponseError(
    code: Int,
    message: String,
    id: Any? = null,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to code.toLong(), STRING to message, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeResponseErrorPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public enum class ErrorCode(
    id: Long,
  ) {
    PARSE_ERROR(-32_700),
    INVALID_REQUEST(-32_600),
    METHOD_NOT_FOUND(-32_601),
    INVALID_PARAMS(-32_602),
    INTERNAL_ERROR(-32_603),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ErrorCode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setScopePtr: VoidPtr = TypeManager.getMethodBindPtr("JSONRPC", "set_scope")

    public val processActionPtr: VoidPtr = TypeManager.getMethodBindPtr("JSONRPC", "process_action")

    public val processStringPtr: VoidPtr = TypeManager.getMethodBindPtr("JSONRPC", "process_string")

    public val makeRequestPtr: VoidPtr = TypeManager.getMethodBindPtr("JSONRPC", "make_request")

    public val makeResponsePtr: VoidPtr = TypeManager.getMethodBindPtr("JSONRPC", "make_response")

    public val makeNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_notification")

    public val makeResponseErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_response_error")
  }
}
