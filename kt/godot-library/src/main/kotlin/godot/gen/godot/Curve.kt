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
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Curve : Resource() {
  public val rangeChanged: Signal0 by signal()

  public var minValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinValuePtr, NIL)
    }

  public var maxValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxValuePtr, NIL)
    }

  public var bakeResolution: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeResolutionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeResolutionPtr, NIL)
    }

  public var pointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPointCountPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVE, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addPoint(
    position: Vector2,
    leftTangent: Float = 0.0f,
    rightTangent: Float = 0.0f,
    leftMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
    rightMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
  ): Int {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent.toDouble(), DOUBLE to rightTangent.toDouble(), LONG to leftMode.id, LONG to rightMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removePoint(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  public fun getPointPosition(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setPointValue(index: Int, y: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to y.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointValuePtr, NIL)
  }

  public fun setPointOffset(index: Int, offset: Float): Int {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun sample(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun sampleBaked(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getPointLeftTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointLeftTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getPointRightTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointRightTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getPointLeftMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointLeftModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getPointRightMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointRightModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setPointLeftTangent(index: Int, tangent: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointLeftTangentPtr, NIL)
  }

  public fun setPointRightTangent(index: Int, tangent: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointRightTangentPtr, NIL)
  }

  public fun setPointLeftMode(index: Int, mode: TangentMode) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointLeftModePtr, NIL)
  }

  public fun setPointRightMode(index: Int, mode: TangentMode) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointRightModePtr, NIL)
  }

  public fun cleanDupes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cleanDupesPtr, NIL)
  }

  public fun bake() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  public enum class TangentMode(
    id: Long,
  ) {
    TANGENT_FREE(0),
    TANGENT_LINEAR(1),
    TANGENT_MODE_COUNT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TangentMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "get_point_count")

    public val setPointCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "set_point_count")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "add_point")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "remove_point")

    public val clearPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "clear_points")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_position")

    public val setPointValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "set_point_value")

    public val setPointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_offset")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "sample")

    public val sampleBakedPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "sample_baked")

    public val getPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_tangent")

    public val getPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_tangent")

    public val getPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_mode")

    public val getPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_mode")

    public val setPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_tangent")

    public val setPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_tangent")

    public val setPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_mode")

    public val setPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_mode")

    public val getMinValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "get_min_value")

    public val setMinValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "set_min_value")

    public val getMaxValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "get_max_value")

    public val setMaxValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "set_max_value")

    public val cleanDupesPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "clean_dupes")

    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "bake")

    public val getBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_bake_resolution")

    public val setBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_bake_resolution")
  }
}
