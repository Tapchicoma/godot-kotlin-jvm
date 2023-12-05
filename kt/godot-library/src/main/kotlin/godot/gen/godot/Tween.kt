// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Tween : RefCounted() {
  public val stepFinished: Signal1<Long> by signal("idx")

  public val loopFinished: Signal1<Long> by signal("loopCount")

  public val finished: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TWEEN, scriptIndex)
    return true
  }

  public fun tweenProperty(
    _object: Object,
    `property`: NodePath,
    finalVal: Any?,
    duration: Double,
  ): PropertyTweener? {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to finalVal, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenPropertyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun tweenInterval(time: Double): IntervalTweener? {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenIntervalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as IntervalTweener?)
  }

  public fun tweenCallback(callback: Callable): CallbackTweener? {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenCallbackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?)
  }

  public fun tweenMethod(
    method: Callable,
    from: Any?,
    to: Any?,
    duration: Double,
  ): MethodTweener? {
    TransferContext.writeArguments(CALLABLE to method, ANY to from, ANY to to, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenMethodPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MethodTweener?)
  }

  public fun customStep(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.customStepPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun pause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  public fun play() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  public fun kill() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.killPtr, NIL)
  }

  public fun getTotalElapsedTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalElapsedTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun bindNode(node: Node): Tween? {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.bindNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun setProcessMode(mode: TweenProcessMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessModePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun setPauseMode(mode: TweenPauseMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPauseModePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  @JvmOverloads
  public fun setParallel(parallel: Boolean = true): Tween? {
    TransferContext.writeArguments(BOOL to parallel)
    TransferContext.callMethod(rawPtr, MethodBindings.setParallelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  @JvmOverloads
  public fun setLoops(loops: Int = 0): Tween? {
    TransferContext.writeArguments(LONG to loops.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLoopsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun getLoopsLeft(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoopsLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSpeedScale(speed: Float): Tween? {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun setTrans(trans: TransitionType): Tween? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun setEase(ease: EaseType): Tween? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun parallel(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.parallelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun chain(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.chainPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public enum class TweenProcessMode(
    id: Long,
  ) {
    TWEEN_PROCESS_PHYSICS(0),
    TWEEN_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TweenProcessMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TweenPauseMode(
    id: Long,
  ) {
    TWEEN_PAUSE_BOUND(0),
    TWEEN_PAUSE_STOP(1),
    TWEEN_PAUSE_PROCESS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TweenPauseMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TransitionType(
    id: Long,
  ) {
    TRANS_LINEAR(0),
    TRANS_SINE(1),
    TRANS_QUINT(2),
    TRANS_QUART(3),
    TRANS_QUAD(4),
    TRANS_EXPO(5),
    TRANS_ELASTIC(6),
    TRANS_CUBIC(7),
    TRANS_CIRC(8),
    TRANS_BOUNCE(9),
    TRANS_BACK(10),
    TRANS_SPRING(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransitionType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EaseType(
    id: Long,
  ) {
    EASE_IN(0),
    EASE_OUT(1),
    EASE_IN_OUT(2),
    EASE_OUT_IN(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EaseType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public fun interpolateValue(
      initialValue: Any?,
      deltaValue: Any?,
      elapsedTime: Double,
      duration: Double,
      transType: TransitionType,
      easeType: EaseType,
    ): Any? {
      TransferContext.writeArguments(ANY to initialValue, ANY to deltaValue, DOUBLE to elapsedTime, DOUBLE to duration, LONG to transType.id, LONG to easeType.id)
      TransferContext.callMethod(0, MethodBindings.interpolateValuePtr, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
  }

  internal object MethodBindings {
    public val tweenPropertyPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_property")

    public val tweenIntervalPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_interval")

    public val tweenCallbackPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_callback")

    public val tweenMethodPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_method")

    public val customStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "custom_step")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "stop")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "pause")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "play")

    public val killPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "kill")

    public val getTotalElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "get_total_elapsed_time")

    public val isRunningPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "is_running")

    public val isValidPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "is_valid")

    public val bindNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "bind_node")

    public val setProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "set_process_mode")

    public val setPauseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_pause_mode")

    public val setParallelPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_parallel")

    public val setLoopsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_loops")

    public val getLoopsLeftPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "get_loops_left")

    public val setSpeedScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_speed_scale")

    public val setTransPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_trans")

    public val setEasePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_ease")

    public val parallelPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "parallel")

    public val chainPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "chain")

    public val interpolateValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "interpolate_value")
  }
}
