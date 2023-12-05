// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
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
public open class Curve2D : Resource() {
  public var bakeInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeIntervalPtr, NIL)
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
    callConstructor(ENGINECLASS_CURVE2D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addPoint(
    position: Vector2,
    _in: Vector2 = Vector2(0, 0),
    `out`: Vector2 = Vector2(0, 0),
    index: Int = -1,
  ) {
    TransferContext.writeArguments(VECTOR2 to position, VECTOR2 to _in, VECTOR2 to out, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  public fun setPointPosition(idx: Int, position: Vector2) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  public fun getPointPosition(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setPointIn(idx: Int, position: Vector2) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointInPtr, NIL)
  }

  public fun getPointIn(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointInPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setPointOut(idx: Int, position: Vector2) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOutPtr, NIL)
  }

  public fun getPointOut(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointOutPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun removePoint(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  public fun sample(idx: Int, t: Float): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to t.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun samplef(fofs: Float): Vector2 {
    TransferContext.writeArguments(DOUBLE to fofs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplefPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getBakedLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun sampleBaked(offset: Float = 0.0f, cubic: Boolean = false): Vector2 {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun sampleBakedWithRotation(offset: Float = 0.0f, cubic: Boolean = false): Transform2D {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedWithRotationPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getBakedPoints(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedPointsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getClosestOffset(toPoint: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f): PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceDegrees.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellatePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  @JvmOverloads
  public fun tessellateEvenLength(maxStages: Int = 5, toleranceLength: Float = 20.0f):
      PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceLength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellateEvenLengthPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_count")

    public val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_count")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "add_point")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_position")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_position")

    public val setPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "set_point_in")

    public val getPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "get_point_in")

    public val setPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "set_point_out")

    public val getPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "get_point_out")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "remove_point")

    public val clearPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "clear_points")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "sample")

    public val samplefPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "samplef")

    public val setBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_bake_interval")

    public val getBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_bake_interval")

    public val getBakedLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_length")

    public val sampleBakedPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "sample_baked")

    public val sampleBakedWithRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "sample_baked_with_rotation")

    public val getBakedPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_points")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_point")

    public val getClosestOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_offset")

    public val tessellatePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "tessellate")

    public val tessellateEvenLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "tessellate_even_length")
  }
}
