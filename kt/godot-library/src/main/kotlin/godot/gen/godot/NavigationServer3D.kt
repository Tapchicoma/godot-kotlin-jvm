// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
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
public object NavigationServer3D : Object() {
  public val mapChanged: Signal1<RID> by signal("map")

  public val navigationDebugChanged: Signal0 by signal()

  public val avoidanceDebugChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NAVIGATIONSERVER3D)
    return false
  }

  public fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMapsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun mapSetActive(map: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetActivePtr, NIL)
  }

  public fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun mapSetUp(map: RID, up: Vector3) {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUpPtr, NIL)
  }

  public fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUpPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun mapSetCellSize(map: RID, cellSize: Float) {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellSizePtr, NIL)
  }

  public fun mapGetCellSize(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun mapSetCellHeight(map: RID, cellHeight: Float) {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellHeight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellHeightPtr, NIL)
  }

  public fun mapGetCellHeight(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun mapSetUseEdgeConnections(map: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUseEdgeConnectionsPtr, NIL)
  }

  public fun mapGetUseEdgeConnections(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun mapSetEdgeConnectionMargin(map: RID, margin: Float) {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetEdgeConnectionMarginPtr, NIL)
  }

  public fun mapGetEdgeConnectionMargin(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetEdgeConnectionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun mapSetLinkConnectionRadius(map: RID, radius: Float) {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetLinkConnectionRadiusPtr, NIL)
  }

  public fun mapGetLinkConnectionRadius(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinkConnectionRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  @JvmOverloads
  public fun mapGetClosestPointToSegment(
    map: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointOwnerPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetRegionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetAgentsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public fun mapGetObstacles(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetObstaclesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public fun mapForceUpdate(map: RID) {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapForceUpdatePtr, NIL)
  }

  public fun queryPath(parameters: NavigationPathQueryParameters3D,
      result: NavigationPathQueryResult3D) {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.queryPathPtr, NIL)
  }

  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.regionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun regionSetUseEdgeConnections(region: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetUseEdgeConnectionsPtr, NIL)
  }

  public fun regionGetUseEdgeConnections(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun regionSetEnterCost(region: RID, enterCost: Float) {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetEnterCostPtr, NIL)
  }

  public fun regionGetEnterCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun regionSetTravelCost(region: RID, travelCost: Float) {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTravelCostPtr, NIL)
  }

  public fun regionGetTravelCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun regionSetOwnerId(region: RID, ownerId: Long) {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetOwnerIdPtr, NIL)
  }

  public fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.regionOwnsPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun regionSetMap(region: RID, map: RID) {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetMapPtr, NIL)
  }

  public fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun regionSetNavigationLayers(region: RID, navigationLayers: Long) {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationLayersPtr, NIL)
  }

  public fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun regionSetTransform(region: RID, transform: Transform3D) {
    TransferContext.writeArguments(_RID to region, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTransformPtr, NIL)
  }

  public fun regionSetNavigationMesh(region: RID, navigationMesh: NavigationMesh) {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationMeshPtr, NIL)
  }

  public fun regionBakeNavigationMesh(navigationMesh: NavigationMesh, rootNode: Node) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, MethodBindings.regionBakeNavigationMeshPtr, NIL)
  }

  public fun regionGetConnectionsCount(region: RID): Int {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayStartPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayEndPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.linkCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun linkSetMap(link: RID, map: RID) {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetMapPtr, NIL)
  }

  public fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun linkSetBidirectional(link: RID, bidirectional: Boolean) {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetBidirectionalPtr, NIL)
  }

  public fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkIsBidirectionalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun linkSetNavigationLayers(link: RID, navigationLayers: Long) {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetNavigationLayersPtr, NIL)
  }

  public fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun linkSetStartPosition(link: RID, position: Vector3) {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetStartPositionPtr, NIL)
  }

  public fun linkGetStartPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun linkSetEndPosition(link: RID, position: Vector3) {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEndPositionPtr, NIL)
  }

  public fun linkGetEndPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun linkSetEnterCost(link: RID, enterCost: Float) {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEnterCostPtr, NIL)
  }

  public fun linkGetEnterCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun linkSetTravelCost(link: RID, travelCost: Float) {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetTravelCostPtr, NIL)
  }

  public fun linkGetTravelCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun linkSetOwnerId(link: RID, ownerId: Long) {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetOwnerIdPtr, NIL)
  }

  public fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.agentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceEnabledPtr, NIL)
  }

  public fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun agentSetUse3dAvoidance(agent: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetUse3dAvoidancePtr, NIL)
  }

  public fun agentGetUse3dAvoidance(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun agentSetMap(agent: RID, map: RID) {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMapPtr, NIL)
  }

  public fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun agentSetPaused(agent: RID, paused: Boolean) {
    TransferContext.writeArguments(_RID to agent, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPausedPtr, NIL)
  }

  public fun agentGetPaused(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun agentSetNeighborDistance(agent: RID, distance: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetNeighborDistancePtr, NIL)
  }

  public fun agentSetMaxNeighbors(agent: RID, count: Int) {
    TransferContext.writeArguments(_RID to agent, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxNeighborsPtr, NIL)
  }

  public fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonAgentsPtr, NIL)
  }

  public fun agentSetTimeHorizonObstacles(agent: RID, timeHorizon: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonObstaclesPtr, NIL)
  }

  public fun agentSetRadius(agent: RID, radius: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetRadiusPtr, NIL)
  }

  public fun agentSetHeight(agent: RID, height: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetHeightPtr, NIL)
  }

  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxSpeedPtr, NIL)
  }

  public fun agentSetVelocityForced(agent: RID, velocity: Vector3) {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityForcedPtr, NIL)
  }

  public fun agentSetVelocity(agent: RID, velocity: Vector3) {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityPtr, NIL)
  }

  public fun agentSetPosition(agent: RID, position: Vector3) {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPositionPtr, NIL)
  }

  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentIsMapChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun agentSetAvoidanceCallback(agent: RID, callback: Callable) {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceCallbackPtr, NIL)
  }

  public fun agentSetAvoidanceLayers(agent: RID, layers: Long) {
    TransferContext.writeArguments(_RID to agent, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceLayersPtr, NIL)
  }

  public fun agentSetAvoidanceMask(agent: RID, mask: Long) {
    TransferContext.writeArguments(_RID to agent, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceMaskPtr, NIL)
  }

  public fun agentSetAvoidancePriority(agent: RID, priority: Float) {
    TransferContext.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidancePriorityPtr, NIL)
  }

  public fun obstacleCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceEnabledPtr, NIL)
  }

  public fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun obstacleSetUse3dAvoidance(obstacle: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetUse3dAvoidancePtr, NIL)
  }

  public fun obstacleGetUse3dAvoidance(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun obstacleSetMap(obstacle: RID, map: RID) {
    TransferContext.writeArguments(_RID to obstacle, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetMapPtr, NIL)
  }

  public fun obstacleGetMap(obstacle: RID): RID {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun obstacleSetPaused(obstacle: RID, paused: Boolean) {
    TransferContext.writeArguments(_RID to obstacle, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPausedPtr, NIL)
  }

  public fun obstacleGetPaused(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun obstacleSetRadius(obstacle: RID, radius: Float) {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetRadiusPtr, NIL)
  }

  public fun obstacleSetHeight(obstacle: RID, height: Float) {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetHeightPtr, NIL)
  }

  public fun obstacleSetVelocity(obstacle: RID, velocity: Vector3) {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVelocityPtr, NIL)
  }

  public fun obstacleSetPosition(obstacle: RID, position: Vector3) {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPositionPtr, NIL)
  }

  public fun obstacleSetVertices(obstacle: RID, vertices: PackedVector3Array) {
    TransferContext.writeArguments(_RID to obstacle, PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVerticesPtr, NIL)
  }

  public fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long) {
    TransferContext.writeArguments(_RID to obstacle, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceLayersPtr, NIL)
  }

  @JvmOverloads
  public fun parseSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    rootNode: Node,
    callback: Callable = Callable(),
  ) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  @JvmOverloads
  public fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    callback: Callable = Callable(),
  ) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  public fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  public fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  public fun setDebugEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  public fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class ProcessInfo(
    id: Long,
  ) {
    INFO_ACTIVE_MAPS(0),
    INFO_REGION_COUNT(1),
    INFO_AGENT_COUNT(2),
    INFO_LINK_COUNT(3),
    INFO_POLYGON_COUNT(4),
    INFO_EDGE_COUNT(5),
    INFO_EDGE_MERGE_COUNT(6),
    INFO_EDGE_CONNECTION_COUNT(7),
    INFO_EDGE_FREE_COUNT(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessInfo = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getMapsPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationServer3D", "get_maps")

    public val mapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_create")

    public val mapSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_active")

    public val mapIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_is_active")

    public val mapSetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_up")

    public val mapGetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_up")

    public val mapSetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_size")

    public val mapGetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_size")

    public val mapSetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_height")

    public val mapGetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_height")

    public val mapSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_use_edge_connections")

    public val mapGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_use_edge_connections")

    public val mapSetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_edge_connection_margin")

    public val mapGetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_edge_connection_margin")

    public val mapSetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_link_connection_radius")

    public val mapGetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_link_connection_radius")

    public val mapGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_path")

    public val mapGetClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_to_segment")

    public val mapGetClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point")

    public val mapGetClosestPointNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_normal")

    public val mapGetClosestPointOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_owner")

    public val mapGetLinksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_links")

    public val mapGetRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_regions")

    public val mapGetAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_agents")

    public val mapGetObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_obstacles")

    public val mapForceUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_force_update")

    public val queryPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "query_path")

    public val regionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_create")

    public val regionSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_use_edge_connections")

    public val regionGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_use_edge_connections")

    public val regionSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enter_cost")

    public val regionGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enter_cost")

    public val regionSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_travel_cost")

    public val regionGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_travel_cost")

    public val regionSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_owner_id")

    public val regionGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_owner_id")

    public val regionOwnsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_owns_point")

    public val regionSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_map")

    public val regionGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_map")

    public val regionSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_layers")

    public val regionGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_navigation_layers")

    public val regionSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_transform")

    public val regionSetNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_mesh")

    public val regionBakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_bake_navigation_mesh")

    public val regionGetConnectionsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connections_count")

    public val regionGetConnectionPathwayStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_start")

    public val regionGetConnectionPathwayEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_end")

    public val linkCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_create")

    public val linkSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_map")

    public val linkGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_map")

    public val linkSetBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_bidirectional")

    public val linkIsBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_is_bidirectional")

    public val linkSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_navigation_layers")

    public val linkGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_navigation_layers")

    public val linkSetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_start_position")

    public val linkGetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_start_position")

    public val linkSetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_end_position")

    public val linkGetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_end_position")

    public val linkSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enter_cost")

    public val linkGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enter_cost")

    public val linkSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_travel_cost")

    public val linkGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_travel_cost")

    public val linkSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_owner_id")

    public val linkGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_owner_id")

    public val agentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_create")

    public val agentSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_enabled")

    public val agentGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_enabled")

    public val agentSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_use_3d_avoidance")

    public val agentGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_use_3d_avoidance")

    public val agentSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_map")

    public val agentGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_map")

    public val agentSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_paused")

    public val agentGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_paused")

    public val agentSetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_neighbor_distance")

    public val agentSetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_neighbors")

    public val agentSetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_agents")

    public val agentSetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_obstacles")

    public val agentSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_radius")

    public val agentSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_height")

    public val agentSetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_speed")

    public val agentSetVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity_forced")

    public val agentSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity")

    public val agentSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_position")

    public val agentIsMapChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_is_map_changed")

    public val agentSetAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_callback")

    public val agentSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_layers")

    public val agentSetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_mask")

    public val agentSetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_priority")

    public val obstacleCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_create")

    public val obstacleSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_enabled")

    public val obstacleGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_enabled")

    public val obstacleSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_use_3d_avoidance")

    public val obstacleGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_use_3d_avoidance")

    public val obstacleSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_map")

    public val obstacleGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_map")

    public val obstacleSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_paused")

    public val obstacleGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_paused")

    public val obstacleSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_radius")

    public val obstacleSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_height")

    public val obstacleSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_velocity")

    public val obstacleSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_position")

    public val obstacleSetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_vertices")

    public val obstacleSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_layers")

    public val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "parse_source_geometry_data")

    public val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationServer3D", "free_rid")

    public val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_active")

    public val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_debug_enabled")

    public val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_debug_enabled")

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_process_info")
  }
}
