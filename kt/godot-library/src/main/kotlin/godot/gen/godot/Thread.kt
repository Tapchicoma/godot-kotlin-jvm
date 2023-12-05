// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
public open class Thread : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_THREAD, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun start(callable: Callable, priority: Priority = Thread.Priority.PRIORITY_NORMAL):
      GodotError {
    TransferContext.writeArguments(CALLABLE to callable, LONG to priority.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isStarted(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStartedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isAlive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAlivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitToFinishPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public enum class Priority(
    id: Long,
  ) {
    PRIORITY_LOW(0),
    PRIORITY_NORMAL(1),
    PRIORITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Priority = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public fun setThreadSafetyChecksEnabled(enabled: Boolean) {
      TransferContext.writeArguments(BOOL to enabled)
      TransferContext.callMethod(0, MethodBindings.setThreadSafetyChecksEnabledPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "start")

    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "get_id")

    public val isStartedPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "is_started")

    public val isAlivePtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "is_alive")

    public val waitToFinishPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "wait_to_finish")

    public val setThreadSafetyChecksEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Thread", "set_thread_safety_checks_enabled")
  }
}
