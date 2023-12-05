// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class Area3D : CollisionObject3D() {
  public val bodyShapeEntered: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public val bodyShapeExited: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public val bodyEntered: Signal1<Node3D> by signal("body")

  public val bodyExited: Signal1<Node3D> by signal("body")

  public val areaShapeEntered: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  public val areaShapeExited: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  public val areaEntered: Signal1<Area3D> by signal("area")

  public val areaExited: Signal1<Area3D> by signal("area")

  public var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitoringPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitoringPtr, NIL)
    }

  public var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitorablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitorablePtr, NIL)
    }

  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  public var gravitySpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravitySpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravitySpaceOverrideModePtr, NIL)
    }

  public var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGravityAPointPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityIsPointPtr, NIL)
    }

  public var gravityPointUnitDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointUnitDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointUnitDistancePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var gravityPointCenter: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointCenterPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointCenterPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var gravityDirection: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityDirectionPtr, NIL)
    }

  public var gravity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  public var linearDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampSpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampSpaceOverrideModePtr, NIL)
    }

  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
    }

  public var angularDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampSpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampSpaceOverrideModePtr, NIL)
    }

  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  public var windForceMagnitude: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindForceMagnitudePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWindForceMagnitudePtr, NIL)
    }

  public var windAttenuationFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindAttenuationFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWindAttenuationFactorPtr, NIL)
    }

  public var windSourcePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindSourcePathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWindSourcePathPtr, NIL)
    }

  public var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverridingAudioBusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusOverridePtr, NIL)
    }

  public var audioBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioBusNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusNamePtr, NIL)
    }

  public var reverbBusEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingReverbBusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseReverbBusPtr, NIL)
    }

  public var reverbBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbBusNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbBusNamePtr, NIL)
    }

  public var reverbBusAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbAmountPtr, NIL)
    }

  public var reverbBusUniformity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbUniformityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbUniformityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AREA3D, scriptIndex)
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
   * val myCoreType = area3d.gravityPointCenter
   * //Your changes
   * area3d.gravityPointCenter = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityPointCenterMutate(block: Vector3.() -> Unit): Vector3 =
      gravityPointCenter.apply{
      block(this)
      gravityPointCenter = this
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
   * val myCoreType = area3d.gravityDirection
   * //Your changes
   * area3d.gravityDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityDirectionMutate(block: Vector3.() -> Unit): Vector3 =
      gravityDirection.apply{
      block(this)
      gravityDirection = this
  }


  public fun getOverlappingBodies(): VariantArray<Node3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3D>)
  }

  public fun getOverlappingAreas(): VariantArray<Area3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingAreasPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Area3D>)
  }

  public fun hasOverlappingBodies(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingBodiesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasOverlappingAreas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingAreasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsBodyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsAreaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class SpaceOverride(
    id: Long,
  ) {
    SPACE_OVERRIDE_DISABLED(0),
    SPACE_OVERRIDE_COMBINE(1),
    SPACE_OVERRIDE_COMBINE_REPLACE(2),
    SPACE_OVERRIDE_REPLACE(3),
    SPACE_OVERRIDE_REPLACE_COMBINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpaceOverride = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_space_override_mode")

    public val getGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_space_override_mode")

    public val setGravityIsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_is_point")

    public val isGravityAPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_gravity_a_point")

    public val setGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_point_unit_distance")

    public val getGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_point_unit_distance")

    public val setGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_point_center")

    public val getGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_point_center")

    public val setGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_direction")

    public val getGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_direction")

    public val setGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "set_gravity")

    public val getGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "get_gravity")

    public val setLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_linear_damp_space_override_mode")

    public val getLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_linear_damp_space_override_mode")

    public val setAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_angular_damp_space_override_mode")

    public val getAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_angular_damp_space_override_mode")

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_angular_damp")

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_angular_damp")

    public val setLinearDampPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "set_linear_damp")

    public val getLinearDampPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "get_linear_damp")

    public val setPriorityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "set_priority")

    public val getPriorityPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "get_priority")

    public val setWindForceMagnitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_force_magnitude")

    public val getWindForceMagnitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_force_magnitude")

    public val setWindAttenuationFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_attenuation_factor")

    public val getWindAttenuationFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_attenuation_factor")

    public val setWindSourcePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_source_path")

    public val getWindSourcePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_source_path")

    public val setMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_monitorable")

    public val isMonitorablePtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "is_monitorable")

    public val setMonitoringPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "set_monitoring")

    public val isMonitoringPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "is_monitoring")

    public val getOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_overlapping_bodies")

    public val getOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_overlapping_areas")

    public val hasOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "has_overlapping_bodies")

    public val hasOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "has_overlapping_areas")

    public val overlapsBodyPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "overlaps_body")

    public val overlapsAreaPtr: VoidPtr = TypeManager.getMethodBindPtr("Area3D", "overlaps_area")

    public val setAudioBusOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_audio_bus_override")

    public val isOverridingAudioBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_overriding_audio_bus")

    public val setAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_audio_bus_name")

    public val getAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_audio_bus_name")

    public val setUseReverbBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_use_reverb_bus")

    public val isUsingReverbBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_using_reverb_bus")

    public val setReverbBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_bus_name")

    public val getReverbBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_bus_name")

    public val setReverbAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_amount")

    public val getReverbAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_amount")

    public val setReverbUniformityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_uniformity")

    public val getReverbUniformityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_uniformity")
  }
}
