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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
public open class ReflectionProbe : VisualInstance3D() {
  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return ReflectionProbe.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  public var intensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setIntensityPtr, NIL)
    }

  public var maxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
    }

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

  @CoreTypeLocalCopy
  public var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginOffsetPtr, NIL)
    }

  public var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBoxProjectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableBoxProjectionPtr, NIL)
    }

  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsInteriorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsInteriorPtr, NIL)
    }

  public var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areShadowsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableShadowsPtr, NIL)
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

  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshLodThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshLodThresholdPtr, NIL)
    }

  public var ambientMode: AmbientMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientModePtr, LONG)
      return ReflectionProbe.AmbientMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientModePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var ambientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientColorPtr, NIL)
    }

  public var ambientColorEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientColorEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientColorEnergyPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REFLECTIONPROBE, scriptIndex)
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
   * val myCoreType = reflectionprobe.size
   * //Your changes
   * reflectionprobe.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
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
   * val myCoreType = reflectionprobe.originOffset
   * //Your changes
   * reflectionprobe.originOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun originOffsetMutate(block: Vector3.() -> Unit): Vector3 = originOffset.apply{
      block(this)
      originOffset = this
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
   * val myCoreType = reflectionprobe.ambientColor
   * //Your changes
   * reflectionprobe.ambientColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun ambientColorMutate(block: Color.() -> Unit): Color = ambientColor.apply{
      block(this)
      ambientColor = this
  }


  public enum class UpdateMode(
    id: Long,
  ) {
    UPDATE_ONCE(0),
    UPDATE_ALWAYS(1),
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

  public enum class AmbientMode(
    id: Long,
  ) {
    AMBIENT_DISABLED(0),
    AMBIENT_ENVIRONMENT(1),
    AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AmbientMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_intensity")

    public val getIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_intensity")

    public val setAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_mode")

    public val getAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_mode")

    public val setAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color")

    public val getAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color")

    public val setAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color_energy")

    public val getAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color_energy")

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_max_distance")

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_max_distance")

    public val setMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_mesh_lod_threshold")

    public val getMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_mesh_lod_threshold")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("ReflectionProbe", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("ReflectionProbe", "get_size")

    public val setOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_origin_offset")

    public val getOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_origin_offset")

    public val setAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_as_interior")

    public val isSetAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_set_as_interior")

    public val setEnableBoxProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_box_projection")

    public val isBoxProjectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_box_projection_enabled")

    public val setEnableShadowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_shadows")

    public val areShadowsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "are_shadows_enabled")

    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_cull_mask")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_update_mode")
  }
}
