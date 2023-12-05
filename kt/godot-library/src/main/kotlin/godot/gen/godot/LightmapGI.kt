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
import godot.core.VariantType.OBJECT
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
public open class LightmapGI : VisualInstance3D() {
  public var quality: BakeQuality
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeQualityPtr, LONG)
      return LightmapGI.BakeQuality.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeQualityPtr, NIL)
    }

  public var bounces: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBouncesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBouncesPtr, NIL)
    }

  public var directional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDirectionalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionalPtr, NIL)
    }

  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isInteriorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInteriorPtr, NIL)
    }

  public var useDenoiser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingDenoiserPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDenoiserPtr, NIL)
    }

  public var bias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
    }

  public var maxTextureSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxTextureSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxTextureSizePtr, NIL)
    }

  public var environmentMode: EnvironmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentModePtr, LONG)
      return LightmapGI.EnvironmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentModePtr, NIL)
    }

  public var environmentCustomSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentCustomSkyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Sky?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentCustomSkyPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var environmentCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentCustomColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentCustomColorPtr, NIL)
    }

  public var environmentCustomEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentCustomEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentCustomEnergyPtr, NIL)
    }

  public var cameraAttributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
    }

  public var generateProbesSubdiv: GenerateProbes
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGenerateProbesPtr, LONG)
      return LightmapGI.GenerateProbes.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGenerateProbesPtr, NIL)
    }

  public var lightData: LightmapGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightDataPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as LightmapGIData?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightDataPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPGI, scriptIndex)
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
   * val myCoreType = lightmapgi.environmentCustomColor
   * //Your changes
   * lightmapgi.environmentCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun environmentCustomColorMutate(block: Color.() -> Unit): Color =
      environmentCustomColor.apply{
      block(this)
      environmentCustomColor = this
  }


  public enum class BakeQuality(
    id: Long,
  ) {
    BAKE_QUALITY_LOW(0),
    BAKE_QUALITY_MEDIUM(1),
    BAKE_QUALITY_HIGH(2),
    BAKE_QUALITY_ULTRA(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GenerateProbes(
    id: Long,
  ) {
    GENERATE_PROBES_DISABLED(0),
    GENERATE_PROBES_SUBDIV_4(1),
    GENERATE_PROBES_SUBDIV_8(2),
    GENERATE_PROBES_SUBDIV_16(3),
    GENERATE_PROBES_SUBDIV_32(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GenerateProbes = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BakeError(
    id: Long,
  ) {
    BAKE_ERROR_OK(0),
    BAKE_ERROR_NO_SCENE_ROOT(1),
    BAKE_ERROR_FOREIGN_DATA(2),
    BAKE_ERROR_NO_LIGHTMAPPER(3),
    BAKE_ERROR_NO_SAVE_PATH(4),
    BAKE_ERROR_NO_MESHES(5),
    BAKE_ERROR_MESHES_INVALID(6),
    BAKE_ERROR_CANT_CREATE_IMAGE(7),
    BAKE_ERROR_USER_ABORTED(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeError = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentMode(
    id: Long,
  ) {
    ENVIRONMENT_MODE_DISABLED(0),
    ENVIRONMENT_MODE_SCENE(1),
    ENVIRONMENT_MODE_CUSTOM_SKY(2),
    ENVIRONMENT_MODE_CUSTOM_COLOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setLightDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_light_data")

    public val getLightDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_light_data")

    public val setBakeQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_bake_quality")

    public val getBakeQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_bake_quality")

    public val setBouncesPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "set_bounces")

    public val getBouncesPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "get_bounces")

    public val setGenerateProbesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_generate_probes")

    public val getGenerateProbesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_generate_probes")

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "set_bias")

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "get_bias")

    public val setEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_mode")

    public val getEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_mode")

    public val setEnvironmentCustomSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_sky")

    public val getEnvironmentCustomSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_sky")

    public val setEnvironmentCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_color")

    public val getEnvironmentCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_color")

    public val setEnvironmentCustomEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_energy")

    public val getEnvironmentCustomEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_energy")

    public val setMaxTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_max_texture_size")

    public val getMaxTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_max_texture_size")

    public val setUseDenoiserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_use_denoiser")

    public val isUsingDenoiserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_using_denoiser")

    public val setInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "set_interior")

    public val isInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGI", "is_interior")

    public val setDirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_directional")

    public val isDirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_directional")

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_camera_attributes")

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_camera_attributes")
  }
}
