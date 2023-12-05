// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class CanvasItemMaterial : Material() {
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return CanvasItemMaterial.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  public var lightMode: LightMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightModePtr, LONG)
      return CanvasItemMaterial.LightMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightModePtr, NIL)
    }

  public var particlesAnimation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimationPtr, NIL)
    }

  public var particlesAnimHFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimHFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimHFramesPtr, NIL)
    }

  public var particlesAnimVFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimVFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimVFramesPtr, NIL)
    }

  public var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParticlesAnimLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticlesAnimLoopPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASITEMMATERIAL, scriptIndex)
    return true
  }

  public enum class BlendMode(
    id: Long,
  ) {
    BLEND_MODE_MIX(0),
    BLEND_MODE_ADD(1),
    BLEND_MODE_SUB(2),
    BLEND_MODE_MUL(3),
    BLEND_MODE_PREMULT_ALPHA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightMode(
    id: Long,
  ) {
    LIGHT_MODE_NORMAL(0),
    LIGHT_MODE_UNSHADED(1),
    LIGHT_MODE_LIGHT_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_blend_mode")

    public val setLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_light_mode")

    public val getLightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_light_mode")

    public val setParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_animation")

    public val getParticlesAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_animation")

    public val setParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_h_frames")

    public val getParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_h_frames")

    public val setParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_v_frames")

    public val getParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_v_frames")

    public val setParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "set_particles_anim_loop")

    public val getParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItemMaterial", "get_particles_anim_loop")
  }
}
