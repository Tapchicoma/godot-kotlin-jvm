// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt64Array
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AStar3D : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASTAR3D, scriptIndex)
    return true
  }

  public open fun _estimateCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStar3D")
  }

  public open fun _computeCost(fromId: Long, toId: Long): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStar3D")
  }

  public fun getAvailablePointId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailablePointIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun addPoint(
    id: Long,
    position: Vector3,
    weightScale: Float = 1.0f,
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  public fun getPointPosition(id: Long): Vector3 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setPointPosition(id: Long, position: Vector3) {
    TransferContext.writeArguments(LONG to id, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  public fun getPointWeightScale(id: Long): Float {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointWeightScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPointWeightScale(id: Long, weightScale: Float) {
    TransferContext.writeArguments(LONG to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointWeightScalePtr, NIL)
  }

  public fun removePoint(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun hasPoint(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPointConnections(id: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointConnectionsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public fun getPointIds(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointIdsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  @JvmOverloads
  public fun setPointDisabled(id: Long, disabled: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointDisabledPtr, NIL)
  }

  public fun isPointDisabled(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.connectPointsPtr, NIL)
  }

  @JvmOverloads
  public fun disconnectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPointsPtr, NIL)
  }

  @JvmOverloads
  public fun arePointsConnected(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true,
  ): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to toId, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.arePointsConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getPointCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCapacityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun reserveSpace(numNodes: Long) {
    TransferContext.writeArguments(LONG to numNodes)
    TransferContext.callMethod(rawPtr, MethodBindings.reserveSpacePtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  @JvmOverloads
  public fun getClosestPoint(toPosition: Vector3, includeDisabled: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR3 to toPosition, BOOL to includeDisabled)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPositionInSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getPointPath(fromId: Long, toId: Long): PackedVector3Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getIdPath(fromId: Long, toId: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to fromId, LONG to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public companion object

  internal object MethodBindings {
    public val _estimateCostPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "_estimate_cost")

    public val _computeCostPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "_compute_cost")

    public val getAvailablePointIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_available_point_id")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "add_point")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_position")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_position")

    public val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_weight_scale")

    public val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_weight_scale")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "remove_point")

    public val hasPointPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "has_point")

    public val getPointConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_connections")

    public val getPointIdsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "get_point_ids")

    public val setPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "set_point_disabled")

    public val isPointDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "is_point_disabled")

    public val connectPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "connect_points")

    public val disconnectPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "disconnect_points")

    public val arePointsConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "are_points_connected")

    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_count")

    public val getPointCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_point_capacity")

    public val reserveSpacePtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "reserve_space")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "clear")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_closest_point")

    public val getClosestPositionInSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStar3D", "get_closest_position_in_segment")

    public val getPointPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "get_point_path")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStar3D", "get_id_path")
  }
}
