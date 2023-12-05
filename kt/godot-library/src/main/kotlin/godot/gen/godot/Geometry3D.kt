// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object Geometry3D : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GEOMETRY3D)
    return false
  }

  public fun buildBoxPlanes(extents: Vector3): VariantArray<Plane> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.buildBoxPlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  @JvmOverloads
  public fun buildCylinderPlanes(
    radius: Float,
    height: Float,
    sides: Int,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius.toDouble(), DOUBLE to height.toDouble(), LONG to sides.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.buildCylinderPlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  @JvmOverloads
  public fun buildCapsulePlanes(
    radius: Float,
    height: Float,
    sides: Int,
    lats: Int,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius.toDouble(), DOUBLE to height.toDouble(), LONG to sides.toLong(), LONG to lats.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.buildCapsulePlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  public fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to p1, VECTOR3 to p2, VECTOR3 to q1, VECTOR3 to q2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointsBetweenSegmentsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentUncappedPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to dir, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.rayIntersectsTrianglePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsTrianglePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Float,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to spherePosition, DOUBLE to sphereRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsSpherePtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Float,
    radius: Float,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, DOUBLE to height.toDouble(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsCylinderPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray<Plane>,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to planes)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsConvexPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun clipPolygon(points: PackedVector3Array, plane: Plane): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolygonPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  internal object MethodBindings {
    public val buildBoxPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_box_planes")

    public val buildCylinderPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_cylinder_planes")

    public val buildCapsulePlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_capsule_planes")

    public val getClosestPointsBetweenSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_points_between_segments")

    public val getClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment")

    public val getClosestPointToSegmentUncappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment_uncapped")

    public val rayIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "ray_intersects_triangle")

    public val segmentIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_triangle")

    public val segmentIntersectsSpherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_sphere")

    public val segmentIntersectsCylinderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_cylinder")

    public val segmentIntersectsConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_convex")

    public val clipPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry3D", "clip_polygon")
  }
}
