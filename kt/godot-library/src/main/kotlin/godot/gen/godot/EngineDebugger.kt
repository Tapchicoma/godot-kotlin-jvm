// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object EngineDebugger : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_ENGINEDEBUGGER)
    return false
  }

  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun registerProfiler(name: StringName, profiler: EngineProfiler) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to profiler)
    TransferContext.callMethod(rawPtr, MethodBindings.registerProfilerPtr, NIL)
  }

  public fun unregisterProfiler(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterProfilerPtr, NIL)
  }

  public fun isProfiling(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.isProfilingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasProfiler(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasProfilerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>) {
    TransferContext.writeArguments(STRING_NAME to name, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.profilerAddFrameDataPtr, NIL)
  }

  @JvmOverloads
  public fun profilerEnable(
    name: StringName,
    enable: Boolean,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ) {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.profilerEnablePtr, NIL)
  }

  public fun registerMessageCapture(name: StringName, callable: Callable) {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.registerMessageCapturePtr, NIL)
  }

  public fun unregisterMessageCapture(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterMessageCapturePtr, NIL)
  }

  public fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCapturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun sendMessage(message: String, `data`: VariantArray<Any?>) {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
  }

  internal object MethodBindings {
    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "is_active")

    public val registerProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_profiler")

    public val unregisterProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_profiler")

    public val isProfilingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_profiling")

    public val hasProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_profiler")

    public val profilerAddFrameDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_add_frame_data")

    public val profilerEnablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_enable")

    public val registerMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_message_capture")

    public val unregisterMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_message_capture")

    public val hasCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_capture")

    public val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "send_message")
  }
}
