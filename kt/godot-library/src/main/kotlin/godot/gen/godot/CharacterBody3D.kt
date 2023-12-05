// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class CharacterBody3D : PhysicsBody3D() {
  public var motionMode: MotionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionModePtr, LONG)
      return CharacterBody3D.MotionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionModePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var upDirection: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpDirectionPtr, NIL)
    }

  public var slideOnCeiling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSlideOnCeilingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSlideOnCeilingEnabledPtr, NIL)
    }

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

  public var maxSlides: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSlidesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSlidesPtr, NIL)
    }

  public var wallMinSlideAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWallMinSlideAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWallMinSlideAnglePtr, NIL)
    }

  public var floorStopOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorStopOnSlopeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorStopOnSlopeEnabledPtr, NIL)
    }

  public var floorConstantSpeed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorConstantSpeedEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorConstantSpeedEnabledPtr, NIL)
    }

  public var floorBlockOnWall: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFloorBlockOnWallEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorBlockOnWallEnabledPtr, NIL)
    }

  public var floorMaxAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFloorMaxAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorMaxAnglePtr, NIL)
    }

  public var floorSnapLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFloorSnapLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFloorSnapLengthPtr, NIL)
    }

  public var platformOnLeave: PlatformOnLeave
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformOnLeavePtr, LONG)
      return CharacterBody3D.PlatformOnLeave.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformOnLeavePtr, NIL)
    }

  public var platformFloorLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformFloorLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformFloorLayersPtr, NIL)
    }

  public var platformWallLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlatformWallLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlatformWallLayersPtr, NIL)
    }

  public var safeMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSafeMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSafeMarginPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARACTERBODY3D, scriptIndex)
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
   * val myCoreType = characterbody3d.upDirection
   * //Your changes
   * characterbody3d.upDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun upDirectionMutate(block: Vector3.() -> Unit): Vector3 = upDirection.apply{
      block(this)
      upDirection = this
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
   * val myCoreType = characterbody3d.velocity
   * //Your changes
   * characterbody3d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector3.() -> Unit): Vector3 = velocity.apply{
      block(this)
      velocity = this
  }


  public fun moveAndSlide(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveAndSlidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun applyFloorSnap() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyFloorSnapPtr, NIL)
  }

  public fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnFloorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isOnFloorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnFloorOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnCeilingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isOnCeilingOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnCeilingOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnWallPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isOnWallOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnWallOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getFloorNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFloorNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getWallNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWallNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getLastMotion(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastMotionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getPositionDelta(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionDeltaPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getRealVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRealVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun getFloorAngle(upDirection: Vector3 = Vector3(0, 1, 0)): Float {
    TransferContext.writeArguments(VECTOR3 to upDirection)
    TransferContext.callMethod(rawPtr, MethodBindings.getFloorAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getPlatformVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlatformVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getPlatformAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlatformAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getSlideCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSlideCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSlideCollision(slideIdx: Int): KinematicCollision3D? {
    TransferContext.writeArguments(LONG to slideIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlideCollisionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?)
  }

  public fun getLastSlideCollision(): KinematicCollision3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastSlideCollisionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?)
  }

  public enum class MotionMode(
    id: Long,
  ) {
    MOTION_MODE_GROUNDED(0),
    MOTION_MODE_FLOATING(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MotionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PlatformOnLeave(
    id: Long,
  ) {
    PLATFORM_ON_LEAVE_ADD_VELOCITY(0),
    PLATFORM_ON_LEAVE_ADD_UPWARD_VELOCITY(1),
    PLATFORM_ON_LEAVE_DO_NOTHING(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlatformOnLeave = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val moveAndSlidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "move_and_slide")

    public val applyFloorSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "apply_floor_snap")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_velocity")

    public val setSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_safe_margin")

    public val getSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_safe_margin")

    public val isFloorStopOnSlopeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_floor_stop_on_slope_enabled")

    public val setFloorStopOnSlopeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_floor_stop_on_slope_enabled")

    public val setFloorConstantSpeedEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_floor_constant_speed_enabled")

    public val isFloorConstantSpeedEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_floor_constant_speed_enabled")

    public val setFloorBlockOnWallEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_floor_block_on_wall_enabled")

    public val isFloorBlockOnWallEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_floor_block_on_wall_enabled")

    public val setSlideOnCeilingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_slide_on_ceiling_enabled")

    public val isSlideOnCeilingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_slide_on_ceiling_enabled")

    public val setPlatformFloorLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_platform_floor_layers")

    public val getPlatformFloorLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_platform_floor_layers")

    public val setPlatformWallLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_platform_wall_layers")

    public val getPlatformWallLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_platform_wall_layers")

    public val getMaxSlidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_max_slides")

    public val setMaxSlidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_max_slides")

    public val getFloorMaxAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_floor_max_angle")

    public val setFloorMaxAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_floor_max_angle")

    public val getFloorSnapLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_floor_snap_length")

    public val setFloorSnapLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_floor_snap_length")

    public val getWallMinSlideAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_wall_min_slide_angle")

    public val setWallMinSlideAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_wall_min_slide_angle")

    public val getUpDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_up_direction")

    public val setUpDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_up_direction")

    public val setMotionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_motion_mode")

    public val getMotionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_motion_mode")

    public val setPlatformOnLeavePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "set_platform_on_leave")

    public val getPlatformOnLeavePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_platform_on_leave")

    public val isOnFloorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_floor")

    public val isOnFloorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_floor_only")

    public val isOnCeilingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_ceiling")

    public val isOnCeilingOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_ceiling_only")

    public val isOnWallPtr: VoidPtr = TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_wall")

    public val isOnWallOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "is_on_wall_only")

    public val getFloorNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_floor_normal")

    public val getWallNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_wall_normal")

    public val getLastMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_last_motion")

    public val getPositionDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_position_delta")

    public val getRealVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_real_velocity")

    public val getFloorAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_floor_angle")

    public val getPlatformVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_platform_velocity")

    public val getPlatformAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_platform_angular_velocity")

    public val getSlideCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_slide_collision_count")

    public val getSlideCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_slide_collision")

    public val getLastSlideCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharacterBody3D", "get_last_slide_collision")
  }
}
