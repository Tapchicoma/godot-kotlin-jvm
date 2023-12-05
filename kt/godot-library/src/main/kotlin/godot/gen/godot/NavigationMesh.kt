// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.STRING_NAME
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
import kotlin.Unit
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class NavigationMesh : Resource() {
  public var vertices: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  public var samplePartitionType: SamplePartitionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSamplePartitionTypePtr, LONG)
      return NavigationMesh.SamplePartitionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplePartitionTypePtr, NIL)
    }

  public var geometryParsedGeometryType: ParsedGeometryType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
      return NavigationMesh.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
    }

  public var geometryCollisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  public var geometrySourceGeometryMode: SourceGeometryMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
      return NavigationMesh.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
    }

  public var geometrySourceGroupName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGroupNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGroupNamePtr, NIL)
    }

  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  public var cellHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellHeightPtr, NIL)
    }

  public var agentHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentHeightPtr, NIL)
    }

  public var agentRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
    }

  public var agentMaxClimb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxClimbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxClimbPtr, NIL)
    }

  public var agentMaxSlope: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxSlopePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxSlopePtr, NIL)
    }

  public var regionMinSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionMinSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionMinSizePtr, NIL)
    }

  public var regionMergeSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionMergeSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionMergeSizePtr, NIL)
    }

  public var edgeMaxLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxLengthPtr, NIL)
    }

  public var edgeMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxErrorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxErrorPtr, NIL)
    }

  public var verticesPerPolygon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPerPolygonPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPerPolygonPtr, NIL)
    }

  public var detailSampleDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleDistancePtr, NIL)
    }

  public var detailSampleMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleMaxErrorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleMaxErrorPtr, NIL)
    }

  public var filterLowHangingObstacles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterLowHangingObstaclesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterLowHangingObstaclesPtr, NIL)
    }

  public var filterLedgeSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterLedgeSpansPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterLedgeSpansPtr, NIL)
    }

  public var filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterWalkableLowHeightSpansPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterWalkableLowHeightSpansPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var filterBakingAabb: CoreAABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbPtr, VariantTypeAABB)
      return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
    }
    set(`value`) {
      TransferContext.writeArguments(VariantTypeAABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var filterBakingAabbOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbOffsetPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESH, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = navigationmesh.filterBakingAabb
   * //Your changes
   * navigationmesh.filterBakingAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun filterBakingAabbMutate(block: CoreAABB.() -> Unit): CoreAABB =
      filterBakingAabb.apply{
      block(this)
      filterBakingAabb = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = navigationmesh.filterBakingAabbOffset
   * //Your changes
   * navigationmesh.filterBakingAabbOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun filterBakingAabbOffsetMutate(block: Vector3.() -> Unit): Vector3 =
      filterBakingAabbOffset.apply{
      block(this)
      filterBakingAabbOffset = this
  }


  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addPolygon(polygon: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun clearPolygons() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  public fun createFromMesh(mesh: Mesh) {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromMeshPtr, NIL)
  }

  public enum class SamplePartitionType(
    id: Long,
  ) {
    SAMPLE_PARTITION_WATERSHED(0),
    SAMPLE_PARTITION_MONOTONE(1),
    SAMPLE_PARTITION_LAYERS(2),
    SAMPLE_PARTITION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SamplePartitionType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParsedGeometryType(
    id: Long,
  ) {
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    PARSED_GEOMETRY_STATIC_COLLIDERS(1),
    PARSED_GEOMETRY_BOTH(2),
    PARSED_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParsedGeometryType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SourceGeometryMode(
    id: Long,
  ) {
    SOURCE_GEOMETRY_ROOT_NODE_CHILDREN(0),
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    SOURCE_GEOMETRY_GROUPS_EXPLICIT(2),
    SOURCE_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SourceGeometryMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSamplePartitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_sample_partition_type")

    public val getSamplePartitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_sample_partition_type")

    public val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_parsed_geometry_type")

    public val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_parsed_geometry_type")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask_value")

    public val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_geometry_mode")

    public val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_geometry_mode")

    public val setSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_group_name")

    public val getSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_group_name")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_size")

    public val setCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_height")

    public val getCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_height")

    public val setAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_height")

    public val getAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_height")

    public val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_radius")

    public val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_radius")

    public val setAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_climb")

    public val getAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_climb")

    public val setAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_slope")

    public val getAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_slope")

    public val setRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_min_size")

    public val getRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_min_size")

    public val setRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_merge_size")

    public val getRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_merge_size")

    public val setEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_length")

    public val getEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_length")

    public val setEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_error")

    public val getEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_error")

    public val setVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices_per_polygon")

    public val getVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices_per_polygon")

    public val setDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_distance")

    public val getDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_distance")

    public val setDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_max_error")

    public val getDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_max_error")

    public val setFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_low_hanging_obstacles")

    public val getFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_low_hanging_obstacles")

    public val setFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_ledge_spans")

    public val getFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_ledge_spans")

    public val setFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_walkable_low_height_spans")

    public val getFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_walkable_low_height_spans")

    public val setFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb")

    public val getFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb")

    public val setFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb_offset")

    public val getFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb_offset")

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices")

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "add_polygon")

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon_count")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon")

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "clear_polygons")

    public val createFromMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "create_from_mesh")
  }
}
