// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorDebuggerSession internal constructor() : RefCounted() {
  public val started: Signal0 by signal()

  public val stopped: Signal0 by signal()

  public val breaked: Signal1<Boolean> by signal("canDebug")

  public val continued: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORDEBUGGERSESSION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun sendMessage(message: String, `data`: VariantArray<Any?> =
      godot.core.variantArrayOf()) {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
  }

  @JvmOverloads
  public fun toggleProfiler(
    profiler: String,
    enable: Boolean,
    `data`: VariantArray<Any?> = godot.core.variantArrayOf(),
  ) {
    TransferContext.writeArguments(STRING to profiler, BOOL to enable, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.toggleProfilerPtr, NIL)
  }

  public fun isBreaked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBreakedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isDebuggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDebuggablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addSessionTab(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addSessionTabPtr, NIL)
  }

  public fun removeSessionTab(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSessionTabPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "send_message")

    public val toggleProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "toggle_profiler")

    public val isBreakedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_breaked")

    public val isDebuggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_debuggable")

    public val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_active")

    public val addSessionTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "add_session_tab")

    public val removeSessionTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "remove_session_tab")
  }
}
