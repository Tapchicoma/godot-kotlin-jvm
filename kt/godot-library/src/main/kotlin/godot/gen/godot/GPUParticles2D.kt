// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GPUParticles2D : Node2D() {
  public var emitting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmittingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmittingPtr, NIL)
    }

  public var amount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmountPtr, NIL)
    }

  public var subEmitter: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterPtr, NIL)
    }

  public var processMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessMaterialPtr, NIL)
    }

  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var lifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLifetimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLifetimePtr, NIL)
    }

  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
    }

  public var preprocess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreProcessTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreProcessTimePtr, NIL)
    }

  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  public var explosiveness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExplosivenessRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExplosivenessRatioPtr, NIL)
    }

  public var randomness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRandomnessRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRandomnessRatioPtr, NIL)
    }

  public var fixedFps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedFpsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedFpsPtr, NIL)
    }

  public var interpolate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolatePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolatePtr, NIL)
    }

  public var fractDelta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractionalDeltaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFractionalDeltaPtr, NIL)
    }

  public var collisionBaseSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionBaseSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionBaseSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var visibilityRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRectPtr, NIL)
    }

  public var localCoords: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseLocalCoordinatesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseLocalCoordinatesPtr, NIL)
    }

  public var drawOrder: DrawOrder
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawOrderPtr, LONG)
      return GPUParticles2D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
    }

  public var trailEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTrailEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailEnabledPtr, NIL)
    }

  public var trailLifetime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailLifetimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailLifetimePtr, NIL)
    }

  public var trailSections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailSectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailSectionsPtr, NIL)
    }

  public var trailSectionSubdivisions: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrailSectionSubdivisionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTrailSectionSubdivisionsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLES2D, scriptIndex)
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
   * val myCoreType = gpuparticles2d.visibilityRect
   * //Your changes
   * gpuparticles2d.visibilityRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun visibilityRectMutate(block: Rect2.() -> Unit): Rect2 = visibilityRect.apply{
      block(this)
      visibilityRect = this
  }


  public fun captureRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.captureRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun restart() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  public fun emitParticle(
    xform: Transform2D,
    velocity: Vector2,
    color: Color,
    custom: Color,
    flags: Long,
  ) {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to velocity, COLOR to color, COLOR to custom, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.emitParticlePtr, NIL)
  }

  public enum class DrawOrder(
    id: Long,
  ) {
    DRAW_ORDER_INDEX(0),
    DRAW_ORDER_LIFETIME(1),
    DRAW_ORDER_REVERSE_LIFETIME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawOrder = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EmitFlags(
    id: Long,
  ) {
    EMIT_FLAG_POSITION(1),
    EMIT_FLAG_ROTATION_SCALE(2),
    EMIT_FLAG_VELOCITY(4),
    EMIT_FLAG_COLOR(8),
    EMIT_FLAG_CUSTOM(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmitFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_emitting")

    public val setAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "set_amount")

    public val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_lifetime")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_one_shot")

    public val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_pre_process_time")

    public val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_explosiveness_ratio")

    public val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_randomness_ratio")

    public val setVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_visibility_rect")

    public val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_use_local_coordinates")

    public val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fixed_fps")

    public val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_fractional_delta")

    public val setInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_interpolate")

    public val setProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_process_material")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_speed_scale")

    public val setCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_collision_base_size")

    public val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_emitting")

    public val getAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "get_amount")

    public val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_lifetime")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_one_shot")

    public val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_pre_process_time")

    public val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_explosiveness_ratio")

    public val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_randomness_ratio")

    public val getVisibilityRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_visibility_rect")

    public val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_use_local_coordinates")

    public val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fixed_fps")

    public val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_fractional_delta")

    public val getInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_interpolate")

    public val getProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_process_material")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_speed_scale")

    public val getCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_collision_base_size")

    public val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_draw_order")

    public val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_draw_order")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_texture")

    public val captureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "capture_rect")

    public val restartPtr: VoidPtr = TypeManager.getMethodBindPtr("GPUParticles2D", "restart")

    public val setSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_sub_emitter")

    public val getSubEmitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_sub_emitter")

    public val emitParticlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "emit_particle")

    public val setTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_enabled")

    public val setTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_lifetime")

    public val isTrailEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "is_trail_enabled")

    public val getTrailLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_lifetime")

    public val setTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_sections")

    public val getTrailSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_sections")

    public val setTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "set_trail_section_subdivisions")

    public val getTrailSectionSubdivisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticles2D", "get_trail_section_subdivisions")
  }
}
