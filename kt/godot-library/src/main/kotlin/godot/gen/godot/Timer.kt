// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Timer : Node() {
  public val timeout: Signal0 by signal()

  public var processCallback: TimerProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimerProcessCallbackPtr, LONG)
      return Timer.TimerProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTimerProcessCallbackPtr, NIL)
    }

  public var waitTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWaitTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWaitTimePtr, NIL)
    }

  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
    }

  public var autostart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutostartPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutostartPtr, NIL)
    }

  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausedPtr, NIL)
    }

  public val timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeLeftPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TIMER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun start(timeSec: Double = -1.0) {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStoppedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class TimerProcessCallback(
    id: Long,
  ) {
    TIMER_PROCESS_PHYSICS(0),
    TIMER_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TimerProcessCallback = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setWaitTimePtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_wait_time")

    public val getWaitTimePtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "get_wait_time")

    public val setOneShotPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_one_shot")

    public val isOneShotPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_one_shot")

    public val setAutostartPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_autostart")

    public val hasAutostartPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "has_autostart")

    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "start")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "stop")

    public val setPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_paused")

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_paused")

    public val isStoppedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_stopped")

    public val getTimeLeftPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "get_time_left")

    public val setTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_timer_process_callback")

    public val getTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "get_timer_process_callback")
  }
}
