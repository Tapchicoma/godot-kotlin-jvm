// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object JavaScriptBridge : Object() {
  public val pwaUpdateAvailable: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_JAVASCRIPTBRIDGE)
    return false
  }

  @JvmOverloads
  public fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(rawPtr, MethodBindings.evalPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getInterface(_interface: String): JavaScriptObject? {
    TransferContext.writeArguments(STRING to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?)
  }

  public fun createCallback(callable: Callable): JavaScriptObject? {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.createCallbackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?)
  }

  public fun createObject(_object: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to _object,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.createObjectPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  @JvmOverloads
  public fun downloadBuffer(
    buffer: PackedByteArray,
    name: String,
    mime: String = "application/octet-stream",
  ) {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer, STRING to name, STRING to mime)
    TransferContext.callMethod(rawPtr, MethodBindings.downloadBufferPtr, NIL)
  }

  public fun pwaNeedsUpdate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pwaNeedsUpdatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun pwaUpdate(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pwaUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun forceFsSync() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceFsSyncPtr, NIL)
  }

  internal object MethodBindings {
    public val evalPtr: VoidPtr = TypeManager.getMethodBindPtr("JavaScriptBridge", "eval")

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "get_interface")

    public val createCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_callback")

    public val createObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_object")

    public val downloadBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "download_buffer")

    public val pwaNeedsUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_needs_update")

    public val pwaUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_update")

    public val forceFsSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "force_fs_sync")
  }
}
