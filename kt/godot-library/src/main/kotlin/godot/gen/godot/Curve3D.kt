// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.PackedVector3Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
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
public open class Curve3D : Resource() {
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

  public var upVectorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUpVectorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpVectorEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVE3D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addPoint(
    position: Vector3,
    _in: Vector3 = Vector3(0, 0, 0),
    `out`: Vector3 = Vector3(0, 0, 0),
    index: Int = -1,
  ) {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to _in, VECTOR3 to out, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  public fun setPointPosition(idx: Int, position: Vector3) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  public fun getPointPosition(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setPointTilt(idx: Int, tilt: Float) {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to tilt.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointTiltPtr, NIL)
  }

  public fun getPointTilt(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointTiltPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPointIn(idx: Int, position: Vector3) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointInPtr, NIL)
  }

  public fun getPointIn(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointInPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setPointOut(idx: Int, position: Vector3) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOutPtr, NIL)
  }

  public fun getPointOut(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointOutPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun removePoint(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  public fun sample(idx: Int, t: Float): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to t.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun samplef(fofs: Float): Vector3 {
    TransferContext.writeArguments(DOUBLE to fofs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplefPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getBakedLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun sampleBaked(offset: Float = 0.0f, cubic: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun sampleBakedWithRotation(
    offset: Float = 0.0f,
    cubic: Boolean = false,
    applyTilt: Boolean = false,
  ): Transform3D {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic, BOOL to applyTilt)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedWithRotationPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  @JvmOverloads
  public fun sampleBakedUpVector(offset: Float, applyTilt: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to applyTilt)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedUpVectorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getBakedPoints(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedPointsPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getBakedTilts(): PackedFloat32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedTiltsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  public fun getBakedUpVectors(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedUpVectorsPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getClosestPoint(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getClosestOffset(toPoint: Vector3): Float {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f): PackedVector3Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceDegrees.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellatePtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  @JvmOverloads
  public fun tessellateEvenLength(maxStages: Int = 5, toleranceLength: Float = 0.2f):
      PackedVector3Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceLength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellateEvenLengthPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_point_count")

    public val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "set_point_count")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "add_point")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "set_point_position")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_point_position")

    public val setPointTiltPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "set_point_tilt")

    public val getPointTiltPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "get_point_tilt")

    public val setPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "set_point_in")

    public val getPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "get_point_in")

    public val setPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "set_point_out")

    public val getPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "get_point_out")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "remove_point")

    public val clearPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "clear_points")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "sample")

    public val samplefPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "samplef")

    public val setBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "set_bake_interval")

    public val getBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_bake_interval")

    public val setUpVectorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "set_up_vector_enabled")

    public val isUpVectorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "is_up_vector_enabled")

    public val getBakedLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_baked_length")

    public val sampleBakedPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "sample_baked")

    public val sampleBakedWithRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "sample_baked_with_rotation")

    public val sampleBakedUpVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "sample_baked_up_vector")

    public val getBakedPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_baked_points")

    public val getBakedTiltsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_baked_tilts")

    public val getBakedUpVectorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_baked_up_vectors")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_closest_point")

    public val getClosestOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "get_closest_offset")

    public val tessellatePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve3D", "tessellate")

    public val tessellateEvenLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve3D", "tessellate_even_length")
  }
}
