// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.Projection
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PROJECTION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
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
public open class Camera3D : Node3D() {
  public var keepAspect: KeepAspect
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeepAspectModePtr, LONG)
      return Camera3D.KeepAspect.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepAspectModePtr, NIL)
    }

  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
    }

  public var attributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttributesPtr, NIL)
    }

  public var hOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
    }

  public var vOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
    }

  public var dopplerTracking: DopplerTracking
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDopplerTrackingPtr, LONG)
      return Camera3D.DopplerTracking.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDopplerTrackingPtr, NIL)
    }

  public var projection: ProjectionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectionPtr, LONG)
      return Camera3D.ProjectionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectionPtr, NIL)
    }

  public var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentPtr, NIL)
    }

  public var fov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFovPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFovPtr, NIL)
    }

  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var frustumOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrustumOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrustumOffsetPtr, NIL)
    }

  public var near: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNearPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNearPtr, NIL)
    }

  public var far: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFarPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFarPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERA3D, scriptIndex)
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
   * val myCoreType = camera3d.frustumOffset
   * //Your changes
   * camera3d.frustumOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun frustumOffsetMutate(block: Vector2.() -> Unit): Vector2 = frustumOffset.apply{
      block(this)
      frustumOffset = this
  }


  public fun projectRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectRayNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectLocalRayNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectRayOriginPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun unprojectPosition(worldPoint: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.unprojectPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun isPositionBehind(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.isPositionBehindPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint, DOUBLE to zDepth.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.projectPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(DOUBLE to fov.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPerspectivePtr, NIL)
  }

  public fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOrthogonalPtr, NIL)
  }

  public fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrustumPtr, NIL)
  }

  public fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  @JvmOverloads
  public fun clearCurrent(enableNext: Boolean = true) {
    TransferContext.writeArguments(BOOL to enableNext)
    TransferContext.callMethod(rawPtr, MethodBindings.clearCurrentPtr, NIL)
  }

  public fun getCameraTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getCameraProjection(): Projection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraProjectionPtr, PROJECTION)
    return (TransferContext.readReturnValue(PROJECTION, false) as Projection)
  }

  public fun getFrustum(): VariantArray<Plane> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrustumPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  public fun isPositionInFrustum(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.isPositionInFrustumPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCameraRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getPyramidShapeRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPyramidShapeRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun setCullMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskValuePtr, NIL)
  }

  public fun getCullMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class ProjectionType(
    id: Long,
  ) {
    PROJECTION_PERSPECTIVE(0),
    PROJECTION_ORTHOGONAL(1),
    PROJECTION_FRUSTUM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProjectionType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class KeepAspect(
    id: Long,
  ) {
    KEEP_WIDTH(0),
    KEEP_HEIGHT(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): KeepAspect = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DopplerTracking(
    id: Long,
  ) {
    DOPPLER_TRACKING_DISABLED(0),
    DOPPLER_TRACKING_IDLE_STEP(1),
    DOPPLER_TRACKING_PHYSICS_STEP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DopplerTracking = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val projectRayNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_ray_normal")

    public val projectLocalRayNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_local_ray_normal")

    public val projectRayOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_ray_origin")

    public val unprojectPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "unproject_position")

    public val isPositionBehindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "is_position_behind")

    public val projectPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_position")

    public val setPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_perspective")

    public val setOrthogonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_orthogonal")

    public val setFrustumPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_frustum")

    public val makeCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "make_current")

    public val clearCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "clear_current")

    public val setCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "is_current")

    public val getCameraTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_camera_transform")

    public val getCameraProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_camera_projection")

    public val getFovPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_fov")

    public val getFrustumOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_frustum_offset")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_size")

    public val getFarPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_far")

    public val getNearPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_near")

    public val setFovPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_fov")

    public val setFrustumOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_frustum_offset")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_size")

    public val setFarPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_far")

    public val setNearPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_near")

    public val getProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_projection")

    public val setProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_projection")

    public val setHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_h_offset")

    public val getHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_h_offset")

    public val setVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_v_offset")

    public val getVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_v_offset")

    public val setCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_cull_mask")

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_environment")

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_environment")

    public val setAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_attributes")

    public val getAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_attributes")

    public val setKeepAspectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_keep_aspect_mode")

    public val getKeepAspectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_keep_aspect_mode")

    public val setDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_doppler_tracking")

    public val getDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_doppler_tracking")

    public val getFrustumPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_frustum")

    public val isPositionInFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "is_position_in_frustum")

    public val getCameraRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_camera_rid")

    public val getPyramidShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_pyramid_shape_rid")

    public val setCullMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_cull_mask_value")

    public val getCullMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_cull_mask_value")
  }
}
