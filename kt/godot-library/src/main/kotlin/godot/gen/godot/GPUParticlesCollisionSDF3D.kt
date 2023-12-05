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

@GodotBaseType
public open class GPUParticlesCollisionSDF3D : GPUParticlesCollision3D() {
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public var resolution: Resolution
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getResolutionPtr, LONG)
      return GPUParticlesCollisionSDF3D.Resolution.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setResolutionPtr, NIL)
    }

  public var thickness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThicknessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setThicknessPtr, NIL)
    }

  public var bakeMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeMaskPtr, NIL)
    }

  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D, scriptIndex)
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
   * val myCoreType = gpuparticlescollisionsdf3d.size
   * //Your changes
   * gpuparticlescollisionsdf3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public fun setBakeMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setBakeMaskValuePtr, NIL)
  }

  public fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBakeMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Resolution(
    id: Long,
  ) {
    RESOLUTION_16(0),
    RESOLUTION_32(1),
    RESOLUTION_64(2),
    RESOLUTION_128(3),
    RESOLUTION_256(4),
    RESOLUTION_512(5),
    RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Resolution = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_size")

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_size")

    public val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_resolution")

    public val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_resolution")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_texture")

    public val setThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_thickness")

    public val getThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_thickness")

    public val setBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_bake_mask")

    public val getBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_bake_mask")

    public val setBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_bake_mask_value")

    public val getBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_bake_mask_value")
  }
}
