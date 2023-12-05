// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class RandomNumberGenerator : RefCounted() {
  public var seed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeedPtr, NIL)
    }

  public var state: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStatePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStatePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RANDOMNUMBERGENERATOR, scriptIndex)
    return true
  }

  public fun randi(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randiPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun randf(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randfPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f): Float {
    TransferContext.writeArguments(DOUBLE to mean.toDouble(), DOUBLE to deviation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.randfnPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun randfRange(from: Float, to: Float): Float {
    TransferContext.writeArguments(DOUBLE to from.toDouble(), DOUBLE to to.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.randfRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun randiRange(from: Int, to: Int): Int {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.randiRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun randomize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randomizePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "set_seed")

    public val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "get_seed")

    public val setStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "set_state")

    public val getStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "get_state")

    public val randiPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randi")

    public val randfPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randf")

    public val randfnPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randfn")

    public val randfRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randf_range")

    public val randiRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randi_range")

    public val randomizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randomize")
  }
}
