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
public open class Light3D internal constructor() : VisualInstance3D() {
  public var lightIntensityLumens: Float
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightIntensityLux: Float
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightTemperature: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTemperaturePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTemperaturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var lightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  public var lightEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightIndirectEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightVolumetricFogEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightProjector: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectorPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectorPtr, NIL)
    }

  public var lightSize: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightAngularDistance: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightNegative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isNegativePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNegativePtr, NIL)
    }

  public var lightSpecular: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var lightBakeMode: BakeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeModePtr, LONG)
      return Light3D.BakeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeModePtr, NIL)
    }

  public var lightCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  public var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasShadowPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowPtr, NIL)
    }

  public var shadowBias: Float
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var shadowNormalBias: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var shadowReverseCullFace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowReverseCullFacePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowReverseCullFacePtr, NIL)
    }

  public var shadowTransmittanceBias: Float
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var shadowOpacity: Float
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var shadowBlur: Float
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public var distanceFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDistanceFadeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDistanceFadePtr, NIL)
    }

  public var distanceFadeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeBeginPtr, NIL)
    }

  public var distanceFadeShadow: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeShadowPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeShadowPtr, NIL)
    }

  public var distanceFadeLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeLengthPtr, NIL)
    }

  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditorOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditorOnlyPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHT3D, scriptIndex)
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
   * val myCoreType = light3d.lightColor
   * //Your changes
   * light3d.lightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun lightColorMutate(block: Color.() -> Unit): Color = lightColor.apply{
      block(this)
      lightColor = this
  }


  public fun getCorrelatedColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCorrelatedColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public enum class Param(
    id: Long,
  ) {
    PARAM_ENERGY(0),
    PARAM_INDIRECT_ENERGY(1),
    PARAM_VOLUMETRIC_FOG_ENERGY(2),
    PARAM_SPECULAR(3),
    PARAM_RANGE(4),
    PARAM_SIZE(5),
    PARAM_ATTENUATION(6),
    PARAM_SPOT_ANGLE(7),
    PARAM_SPOT_ATTENUATION(8),
    PARAM_SHADOW_MAX_DISTANCE(9),
    PARAM_SHADOW_SPLIT_1_OFFSET(10),
    PARAM_SHADOW_SPLIT_2_OFFSET(11),
    PARAM_SHADOW_SPLIT_3_OFFSET(12),
    PARAM_SHADOW_FADE_START(13),
    PARAM_SHADOW_NORMAL_BIAS(14),
    PARAM_SHADOW_BIAS(15),
    PARAM_SHADOW_PANCAKE_SIZE(16),
    PARAM_SHADOW_OPACITY(17),
    PARAM_SHADOW_BLUR(18),
    PARAM_TRANSMITTANCE_BIAS(19),
    PARAM_INTENSITY(20),
    PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Param = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BakeMode(
    id: Long,
  ) {
    BAKE_DISABLED(0),
    BAKE_STATIC(1),
    BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_editor_only")

    public val isEditorOnlyPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "is_editor_only")

    public val setParamPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_param")

    public val getParamPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "get_param")

    public val setShadowPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_shadow")

    public val hasShadowPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "has_shadow")

    public val setNegativePtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_negative")

    public val isNegativePtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "is_negative")

    public val setCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "get_cull_mask")

    public val setEnableDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_enable_distance_fade")

    public val isDistanceFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "is_distance_fade_enabled")

    public val setDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_begin")

    public val getDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_begin")

    public val setDistanceFadeShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_shadow")

    public val getDistanceFadeShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_shadow")

    public val setDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_length")

    public val getDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_length")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "get_color")

    public val setShadowReverseCullFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_shadow_reverse_cull_face")

    public val getShadowReverseCullFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_shadow_reverse_cull_face")

    public val setBakeModePtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_bake_mode")

    public val getBakeModePtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "get_bake_mode")

    public val setProjectorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "set_projector")

    public val getProjectorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light3D", "get_projector")

    public val setTemperaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_temperature")

    public val getTemperaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_temperature")

    public val getCorrelatedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_correlated_color")
  }
}
