// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
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
import kotlin.Unit

@GodotBaseType
public open class NavigationAgent2D : Node() {
  public val pathChanged: Signal0 by signal()

  public val targetReached: Signal0 by signal()

  public val waypointReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  public val linkReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  public val navigationFinished: Signal0 by signal()

  public val velocityComputed: Signal1<Vector2> by signal("safeVelocity")

  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
    }

  public var pathDesiredDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathDesiredDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPathDesiredDistancePtr, NIL)
    }

  public var targetDesiredDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetDesiredDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetDesiredDistancePtr, NIL)
    }

  public var pathMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPathMaxDistancePtr, NIL)
    }

  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
    }

  public var pathfindingAlgorithm: NavigationPathQueryParameters2D.PathfindingAlgorithm
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
      return NavigationPathQueryParameters2D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
    }

  public var pathPostprocessing: NavigationPathQueryParameters2D.PathPostProcessing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPostprocessingPtr, LONG)
      return NavigationPathQueryParameters2D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPostprocessingPtr, NIL)
    }

  public var pathMetadataFlags: NavigationPathQueryParameters2D.PathMetadataFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathMetadataFlagsPtr, LONG)
      return PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathMetadataFlagsPtr, NIL)
    }

  public var avoidanceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  public var neighborDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNeighborDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNeighborDistancePtr, NIL)
    }

  public var maxNeighbors: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxNeighborsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxNeighborsPtr, NIL)
    }

  public var timeHorizonAgents: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeHorizonAgentsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTimeHorizonAgentsPtr, NIL)
    }

  public var timeHorizonObstacles: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeHorizonObstaclesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTimeHorizonObstaclesPtr, NIL)
    }

  public var maxSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSpeedPtr, NIL)
    }

  public var avoidanceLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceLayersPtr, NIL)
    }

  public var avoidanceMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceMaskPtr, NIL)
    }

  public var avoidancePriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidancePriorityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidancePriorityPtr, NIL)
    }

  public var debugEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
    }

  public var debugUseCustom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugUseCustomPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugUseCustomPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var debugPathCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugPathCustomColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugPathCustomColorPtr, NIL)
    }

  public var debugPathCustomPointSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugPathCustomPointSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugPathCustomPointSizePtr, NIL)
    }

  public var debugPathCustomLineWidth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugPathCustomLineWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugPathCustomLineWidthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONAGENT2D, scriptIndex)
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
   * val myCoreType = navigationagent2d.targetPosition
   * //Your changes
   * navigationagent2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
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
   * val myCoreType = navigationagent2d.velocity
   * //Your changes
   * navigationagent2d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
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
   * val myCoreType = navigationagent2d.debugPathCustomColor
   * //Your changes
   * navigationagent2d.debugPathCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugPathCustomColorMutate(block: Color.() -> Unit): Color =
      debugPathCustomColor.apply{
      block(this)
      debugPathCustomColor = this
  }


  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  public fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setNavigationMap(navigationMap: RID) {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getNextPathPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextPathPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setVelocityForced(velocity: Vector2) {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setVelocityForcedPtr, NIL)
  }

  public fun distanceToTarget(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.distanceToTargetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getCurrentNavigationResult(): NavigationPathQueryResult2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNavigationResultPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationPathQueryResult2D?)
  }

  public fun getCurrentNavigationPath(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNavigationPathPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getCurrentNavigationPathIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNavigationPathIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTargetReachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTargetReachablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNavigationFinishedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getFinalPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFinalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  public fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setAvoidanceMaskValue(maskNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to maskNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceMaskValuePtr, NIL)
  }

  public fun getAvoidanceMaskValue(maskNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to maskNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationAgent2D", "get_rid")

    public val setAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_enabled")

    public val getAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_enabled")

    public val setPathDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_path_desired_distance")

    public val getPathDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_path_desired_distance")

    public val setTargetDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_target_desired_distance")

    public val getTargetDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_target_desired_distance")

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_radius")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_radius")

    public val setNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_neighbor_distance")

    public val getNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_neighbor_distance")

    public val setMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_max_neighbors")

    public val getMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_max_neighbors")

    public val setTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_time_horizon_agents")

    public val getTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_time_horizon_agents")

    public val setTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_time_horizon_obstacles")

    public val getTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_time_horizon_obstacles")

    public val setMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_max_speed")

    public val getMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_max_speed")

    public val setPathMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_path_max_distance")

    public val getPathMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_path_max_distance")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_navigation_layers")

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_navigation_layer_value")

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_navigation_layer_value")

    public val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_pathfinding_algorithm")

    public val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_pathfinding_algorithm")

    public val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_path_postprocessing")

    public val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_path_postprocessing")

    public val setPathMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_path_metadata_flags")

    public val getPathMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_path_metadata_flags")

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_navigation_map")

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_target_position")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_target_position")

    public val getNextPathPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_next_path_position")

    public val setVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_velocity_forced")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_velocity")

    public val distanceToTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "distance_to_target")

    public val getCurrentNavigationResultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_result")

    public val getCurrentNavigationPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_path")

    public val getCurrentNavigationPathIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_path_index")

    public val isTargetReachedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "is_target_reached")

    public val isTargetReachablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "is_target_reachable")

    public val isNavigationFinishedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "is_navigation_finished")

    public val getFinalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_final_position")

    public val setAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_layers")

    public val getAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_layers")

    public val setAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_mask")

    public val getAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_mask")

    public val setAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_layer_value")

    public val getAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_layer_value")

    public val setAvoidanceMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_mask_value")

    public val getAvoidanceMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_mask_value")

    public val setAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_avoidance_priority")

    public val getAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_avoidance_priority")

    public val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_debug_enabled")

    public val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_debug_enabled")

    public val setDebugUseCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_debug_use_custom")

    public val getDebugUseCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_debug_use_custom")

    public val setDebugPathCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_color")

    public val getDebugPathCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_color")

    public val setDebugPathCustomPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_point_size")

    public val getDebugPathCustomPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_point_size")

    public val setDebugPathCustomLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_line_width")

    public val getDebugPathCustomLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_line_width")
  }
}
