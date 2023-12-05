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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GPUParticlesCollisionHeightField3D : GPUParticlesCollision3D() {
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
      return GPUParticlesCollisionHeightField3D.Resolution.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setResolutionPtr, NIL)
    }

  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return GPUParticlesCollisionHeightField3D.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  public var followCameraEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFollowCameraEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowCameraEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D, scriptIndex)
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
   * val myCoreType = gpuparticlescollisionheightfield3d.size
   * //Your changes
   * gpuparticlescollisionheightfield3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public enum class Resolution(
    id: Long,
  ) {
    RESOLUTION_256(0),
    RESOLUTION_512(1),
    RESOLUTION_1024(2),
    RESOLUTION_2048(3),
    RESOLUTION_4096(4),
    RESOLUTION_8192(5),
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

  public enum class UpdateMode(
    id: Long,
  ) {
    UPDATE_MODE_WHEN_MOVED(0),
    UPDATE_MODE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UpdateMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_size")

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_size")

    public val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_resolution")

    public val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_resolution")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_update_mode")

    public val setFollowCameraEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_follow_camera_enabled")

    public val isFollowCameraEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "is_follow_camera_enabled")
  }
}
