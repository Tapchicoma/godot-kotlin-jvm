// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
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

/**
 * 3D Obstacle used in navigation to constrain avoidance controlled agents outside or inside an area.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationobstacles.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationobstacles.html)
 *
 * 3D Obstacle used in navigation to constrain avoidance controlled agents outside or inside an area. The obstacle needs a navigation map and outline vertices defined to work correctly.
 *
 * If the obstacle's vertices are winded in clockwise order, avoidance agents will be pushed in by the obstacle, otherwise, avoidance agents will be pushed out. Outlines must not cross or overlap.
 *
 * Obstacles are **not** a replacement for a (re)baked navigation mesh. Obstacles **don't** change the resulting path from the pathfinding, obstacles only affect the navigation avoidance agent movement by altering the suggested velocity of the avoidance agent.
 *
 * Obstacles using vertices can warp to a new position but should not moved every frame as each move requires a rebuild of the avoidance map.
 */
@GodotBaseType
public open class NavigationObstacle3D : Node3D() {
  /**
   * If `true` the obstacle affects avoidance using agents.
   */
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

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
   */
  @CoreTypeLocalCopy
  public var velocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  /**
   * Sets the avoidance radius for the obstacle.
   */
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

  /**
   * Sets the obstacle height used in 2D avoidance. 2D avoidance using agent's ignore obstacles that are below or above them.
   */
  public var height: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * The outline vertices of the obstacle. If the vertices are winded in clockwise order agents will be pushed in by the obstacle, else they will be pushed out. Outlines can not be crossed or overlap. Should the vertices using obstacle be warped to a new position agent's can not predict this movement and may get trapped inside the obstacle.
   */
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

  /**
   * A bitfield determining the avoidance layers for this obstacle. Agent's with a matching bit on the their avoidance mask will avoid this obstacle.
   */
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

  /**
   * If `true` the obstacle affects 3D avoidance using agent's with obstacle [radius].
   *
   * If `false` the obstacle affects 2D avoidance using agent's with both obstacle [vertices] as well as obstacle [radius].
   */
  public var use3dAvoidance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUse3dAvoidancePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUse3dAvoidancePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONOBSTACLE3D, scriptIndex)
    return true
  }

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = navigationobstacle3d.velocity
   * //Your changes
   * navigationobstacle3d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector3.() -> Unit): Vector3 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * Returns the [RID] of this obstacle on the [godot.NavigationServer3D].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationObstacle node should use and also updates the `obstacle` on the NavigationServer.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationObstacle node. This function returns always the map set on the NavigationObstacle node and not the map of the abstract obstacle on the NavigationServer. If the obstacle map is changed directly with the NavigationServer API the NavigationObstacle node will not be aware of the map change. Use [setNavigationMap] to change the navigation map for the NavigationObstacle and also update the obstacle on the NavigationServer.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_rid")

    public val setAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_enabled")

    public val getAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_enabled")

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_navigation_map")

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_radius")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_radius")

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_height")

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_height")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_velocity")

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_vertices")

    public val setAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_layers")

    public val getAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_layers")

    public val setAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_layer_value")

    public val getAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_layer_value")

    public val setUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_use_3d_avoidance")

    public val getUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_use_3d_avoidance")
  }
}
