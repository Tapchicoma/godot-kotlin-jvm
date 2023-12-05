// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
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
public object Geometry2D : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GEOMETRY2D)
    return false
  }

  public fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Float,
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to circlePosition, DOUBLE to circleRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.isPointInCirclePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Float,
  ): Float {
    TransferContext.writeArguments(VECTOR2 to segmentFrom, VECTOR2 to segmentTo, VECTOR2 to circlePosition, DOUBLE to circleRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsCirclePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun segmentIntersectsSegment(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2,
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to toA, VECTOR2 to fromB, VECTOR2 to toB)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsSegmentPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun lineIntersectsLine(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2,
  ): Any? {
    TransferContext.writeArguments(VECTOR2 to fromA, VECTOR2 to dirA, VECTOR2 to fromB, VECTOR2 to dirB)
    TransferContext.callMethod(rawPtr, MethodBindings.lineIntersectsLinePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getClosestPointsBetweenSegments(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2,
  ): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to p1, VECTOR2 to q1, VECTOR2 to p2, VECTOR2 to q2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointsBetweenSegmentsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getClosestPointToSegment(
    point: Vector2,
    s1: Vector2,
    s2: Vector2,
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getClosestPointToSegmentUncapped(
    point: Vector2,
    s1: Vector2,
    s2: Vector2,
  ): Vector2 {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to s1, VECTOR2 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentUncappedPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2,
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, VECTOR2 to a, VECTOR2 to b, VECTOR2 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.pointIsInsideTrianglePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isPolygonClockwise(polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.isPolygonClockwisePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isPointInPolygon(point: Vector2, polygon: PackedVector2Array): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointInPolygonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun triangulatePolygon(polygon: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.triangulatePolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun triangulateDelaunay(points: PackedVector2Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, MethodBindings.triangulateDelaunayPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun convexHull(points: PackedVector2Array): PackedVector2Array {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points)
    TransferContext.callMethod(rawPtr, MethodBindings.convexHullPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun decomposePolygonInConvex(polygon: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.decomposePolygonInConvexPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun mergePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.mergePolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun clipPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun intersectPolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun excludePolygons(polygonA: PackedVector2Array, polygonB: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygonA, PACKED_VECTOR2_ARRAY to polygonB)
    TransferContext.callMethod(rawPtr, MethodBindings.excludePolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun clipPolylineWithPolygon(polyline: PackedVector2Array, polygon: PackedVector2Array):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolylineWithPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun intersectPolylineWithPolygon(polyline: PackedVector2Array,
      polygon: PackedVector2Array): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectPolylineWithPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  @JvmOverloads
  public fun offsetPolygon(
    polygon: PackedVector2Array,
    delta: Float,
    joinType: PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE,
  ): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon, DOUBLE to delta.toDouble(), LONG to joinType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.offsetPolygonPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  @JvmOverloads
  public fun offsetPolyline(
    polyline: PackedVector2Array,
    delta: Float,
    joinType: PolyJoinType = Geometry2D.PolyJoinType.JOIN_SQUARE,
    endType: PolyEndType = Geometry2D.PolyEndType.END_SQUARE,
  ): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polyline, DOUBLE to delta.toDouble(), LONG to joinType.id, LONG to endType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.offsetPolylinePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public fun makeAtlas(sizes: PackedVector2Array): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to sizes)
    TransferContext.callMethod(rawPtr, MethodBindings.makeAtlasPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public enum class PolyBooleanOperation(
    id: Long,
  ) {
    OPERATION_UNION(0),
    OPERATION_DIFFERENCE(1),
    OPERATION_INTERSECTION(2),
    OPERATION_XOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PolyBooleanOperation = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PolyJoinType(
    id: Long,
  ) {
    JOIN_SQUARE(0),
    JOIN_ROUND(1),
    JOIN_MITER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PolyJoinType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PolyEndType(
    id: Long,
  ) {
    END_POLYGON(0),
    END_JOINED(1),
    END_BUTT(2),
    END_SQUARE(3),
    END_ROUND(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PolyEndType = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val isPointInCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_point_in_circle")

    public val segmentIntersectsCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "segment_intersects_circle")

    public val segmentIntersectsSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "segment_intersects_segment")

    public val lineIntersectsLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "line_intersects_line")

    public val getClosestPointsBetweenSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_points_between_segments")

    public val getClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_point_to_segment")

    public val getClosestPointToSegmentUncappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "get_closest_point_to_segment_uncapped")

    public val pointIsInsideTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "point_is_inside_triangle")

    public val isPolygonClockwisePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_polygon_clockwise")

    public val isPointInPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "is_point_in_polygon")

    public val triangulatePolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "triangulate_polygon")

    public val triangulateDelaunayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "triangulate_delaunay")

    public val convexHullPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry2D", "convex_hull")

    public val decomposePolygonInConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "decompose_polygon_in_convex")

    public val mergePolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "merge_polygons")

    public val clipPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "clip_polygons")

    public val intersectPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "intersect_polygons")

    public val excludePolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "exclude_polygons")

    public val clipPolylineWithPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "clip_polyline_with_polygon")

    public val intersectPolylineWithPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "intersect_polyline_with_polygon")

    public val offsetPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "offset_polygon")

    public val offsetPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry2D", "offset_polyline")

    public val makeAtlasPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry2D", "make_atlas")
  }
}
