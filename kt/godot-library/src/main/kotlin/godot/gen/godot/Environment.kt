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
public open class Environment : Resource() {
  public var backgroundMode: BGMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackgroundPtr, LONG)
      return Environment.BGMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackgroundPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBgColorPtr, NIL)
    }

  public var backgroundEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBgEnergyMultiplierPtr, NIL)
    }

  public var backgroundIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBgIntensityPtr, NIL)
    }

  public var backgroundCanvasMaxLayer: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasMaxLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasMaxLayerPtr, NIL)
    }

  public var backgroundCameraFeedId: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraFeedIdPtr, NIL)
    }

  public var sky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Sky?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyPtr, NIL)
    }

  public var skyCustomFov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyCustomFovPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyCustomFovPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var skyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyRotationPtr, NIL)
    }

  public var ambientLightSource: AmbientSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientSourcePtr, LONG)
      return Environment.AmbientSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientSourcePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var ambientLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightColorPtr, NIL)
    }

  public var ambientLightSkyContribution: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightSkyContributionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightSkyContributionPtr, NIL)
    }

  public var ambientLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightEnergyPtr, NIL)
    }

  public var reflectedLightSource: ReflectionSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReflectionSourcePtr, LONG)
      return Environment.ReflectionSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setReflectionSourcePtr, NIL)
    }

  public var tonemapMode: ToneMapper
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapperPtr, LONG)
      return Environment.ToneMapper.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapperPtr, NIL)
    }

  public var tonemapExposure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapExposurePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapExposurePtr, NIL)
    }

  public var tonemapWhite: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapWhitePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapWhitePtr, NIL)
    }

  public var ssrEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsrEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrEnabledPtr, NIL)
    }

  public var ssrMaxSteps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrMaxStepsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrMaxStepsPtr, NIL)
    }

  public var ssrFadeIn: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrFadeInPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrFadeInPtr, NIL)
    }

  public var ssrFadeOut: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrFadeOutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrFadeOutPtr, NIL)
    }

  public var ssrDepthTolerance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrDepthTolerancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrDepthTolerancePtr, NIL)
    }

  public var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsaoEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoEnabledPtr, NIL)
    }

  public var ssaoRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoRadiusPtr, NIL)
    }

  public var ssaoIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoIntensityPtr, NIL)
    }

  public var ssaoPower: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoPowerPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoPowerPtr, NIL)
    }

  public var ssaoDetail: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoDetailPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoDetailPtr, NIL)
    }

  public var ssaoHorizon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoHorizonPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoHorizonPtr, NIL)
    }

  public var ssaoSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoSharpnessPtr, NIL)
    }

  public var ssaoLightAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoDirectLightAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoDirectLightAffectPtr, NIL)
    }

  public var ssaoAoChannelAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoAoChannelAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoAoChannelAffectPtr, NIL)
    }

  public var ssilEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsilEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilEnabledPtr, NIL)
    }

  public var ssilRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilRadiusPtr, NIL)
    }

  public var ssilIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilIntensityPtr, NIL)
    }

  public var ssilSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilSharpnessPtr, NIL)
    }

  public var ssilNormalRejection: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilNormalRejectionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilNormalRejectionPtr, NIL)
    }

  public var sdfgiEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiEnabledPtr, NIL)
    }

  public var sdfgiUseOcclusion: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiUsingOcclusionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiUseOcclusionPtr, NIL)
    }

  public var sdfgiReadSkyLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiReadingSkyLightPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiReadSkyLightPtr, NIL)
    }

  public var sdfgiBounceFeedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiBounceFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiBounceFeedbackPtr, NIL)
    }

  public var sdfgiCascades: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiCascadesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiCascadesPtr, NIL)
    }

  public var sdfgiMinCellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiMinCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiMinCellSizePtr, NIL)
    }

  public var sdfgiCascade0Distance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiCascade0DistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiCascade0DistancePtr, NIL)
    }

  public var sdfgiMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiMaxDistancePtr, NIL)
    }

  public var sdfgiYScale: SDFGIYScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiYScalePtr, LONG)
      return Environment.SDFGIYScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiYScalePtr, NIL)
    }

  public var sdfgiEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiEnergyPtr, NIL)
    }

  public var sdfgiNormalBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiNormalBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiNormalBiasPtr, NIL)
    }

  public var sdfgiProbeBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiProbeBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiProbeBiasPtr, NIL)
    }

  public var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGlowEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowEnabledPtr, NIL)
    }

  public var glowNormalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGlowNormalizedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowNormalizedPtr, NIL)
    }

  public var glowIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowIntensityPtr, NIL)
    }

  public var glowStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowStrengthPtr, NIL)
    }

  public var glowMix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMixPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMixPtr, NIL)
    }

  public var glowBloom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowBloomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowBloomPtr, NIL)
    }

  public var glowBlendMode: GlowBlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowBlendModePtr, LONG)
      return Environment.GlowBlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowBlendModePtr, NIL)
    }

  public var glowHdrThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrBleedThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrBleedThresholdPtr, NIL)
    }

  public var glowHdrScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrBleedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrBleedScalePtr, NIL)
    }

  public var glowHdrLuminanceCap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrLuminanceCapPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrLuminanceCapPtr, NIL)
    }

  public var glowMapStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMapStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMapStrengthPtr, NIL)
    }

  public var glowMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMapPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMapPtr, NIL)
    }

  public var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFogEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFogEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var fogLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogLightColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFogLightColorPtr, NIL)
    }

  public var fogLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogLightEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogLightEnergyPtr, NIL)
    }

  public var fogSunScatter: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogSunScatterPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogSunScatterPtr, NIL)
    }

  public var fogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogDensityPtr, NIL)
    }

  public var fogAerialPerspective: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogAerialPerspectivePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogAerialPerspectivePtr, NIL)
    }

  public var fogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogSkyAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogSkyAffectPtr, NIL)
    }

  public var fogHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogHeightPtr, NIL)
    }

  public var fogHeightDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogHeightDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogHeightDensityPtr, NIL)
    }

  public var volumetricFogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVolumetricFogEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEnabledPtr, NIL)
    }

  public var volumetricFogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogDensityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var volumetricFogAlbedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAlbedoPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAlbedoPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var volumetricFogEmission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogEmissionPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEmissionPtr, NIL)
    }

  public var volumetricFogEmissionEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogEmissionEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEmissionEnergyPtr, NIL)
    }

  public var volumetricFogGiInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogGiInjectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogGiInjectPtr, NIL)
    }

  public var volumetricFogAnisotropy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAnisotropyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAnisotropyPtr, NIL)
    }

  public var volumetricFogLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogLengthPtr, NIL)
    }

  public var volumetricFogDetailSpread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogDetailSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogDetailSpreadPtr, NIL)
    }

  public var volumetricFogAmbientInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAmbientInjectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAmbientInjectPtr, NIL)
    }

  public var volumetricFogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogSkyAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogSkyAffectPtr, NIL)
    }

  public var volumetricFogTemporalReprojectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          MethodBindings.isVolumetricFogTemporalReprojectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          MethodBindings.setVolumetricFogTemporalReprojectionEnabledPtr, NIL)
    }

  public var volumetricFogTemporalReprojectionAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          MethodBindings.getVolumetricFogTemporalReprojectionAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          MethodBindings.setVolumetricFogTemporalReprojectionAmountPtr, NIL)
    }

  public var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAdjustmentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentEnabledPtr, NIL)
    }

  public var adjustmentBrightness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentBrightnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentBrightnessPtr, NIL)
    }

  public var adjustmentContrast: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentContrastPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentContrastPtr, NIL)
    }

  public var adjustmentSaturation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentSaturationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentSaturationPtr, NIL)
    }

  public var adjustmentColorCorrection: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentColorCorrectionPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentColorCorrectionPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENVIRONMENT, scriptIndex)
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
   * val myCoreType = environment.backgroundColor
   * //Your changes
   * environment.backgroundColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun backgroundColorMutate(block: Color.() -> Unit): Color = backgroundColor.apply{
      block(this)
      backgroundColor = this
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
   * val myCoreType = environment.skyRotation
   * //Your changes
   * environment.skyRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun skyRotationMutate(block: Vector3.() -> Unit): Vector3 = skyRotation.apply{
      block(this)
      skyRotation = this
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
   * val myCoreType = environment.ambientLightColor
   * //Your changes
   * environment.ambientLightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun ambientLightColorMutate(block: Color.() -> Unit): Color = ambientLightColor.apply{
      block(this)
      ambientLightColor = this
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
   * val myCoreType = environment.fogLightColor
   * //Your changes
   * environment.fogLightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fogLightColorMutate(block: Color.() -> Unit): Color = fogLightColor.apply{
      block(this)
      fogLightColor = this
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
   * val myCoreType = environment.volumetricFogAlbedo
   * //Your changes
   * environment.volumetricFogAlbedo = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun volumetricFogAlbedoMutate(block: Color.() -> Unit): Color =
      volumetricFogAlbedo.apply{
      block(this)
      volumetricFogAlbedo = this
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
   * val myCoreType = environment.volumetricFogEmission
   * //Your changes
   * environment.volumetricFogEmission = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun volumetricFogEmissionMutate(block: Color.() -> Unit): Color =
      volumetricFogEmission.apply{
      block(this)
      volumetricFogEmission = this
  }


  public fun setGlowLevel(idx: Int, intensity: Float) {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGlowLevelPtr, NIL)
  }

  public fun getGlowLevel(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlowLevelPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class BGMode(
    id: Long,
  ) {
    BG_CLEAR_COLOR(0),
    BG_COLOR(1),
    BG_SKY(2),
    BG_CANVAS(3),
    BG_KEEP(4),
    BG_CAMERA_FEED(5),
    BG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BGMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AmbientSource(
    id: Long,
  ) {
    AMBIENT_SOURCE_BG(0),
    AMBIENT_SOURCE_DISABLED(1),
    AMBIENT_SOURCE_COLOR(2),
    AMBIENT_SOURCE_SKY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AmbientSource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ReflectionSource(
    id: Long,
  ) {
    REFLECTION_SOURCE_BG(0),
    REFLECTION_SOURCE_DISABLED(1),
    REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ReflectionSource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ToneMapper(
    id: Long,
  ) {
    TONE_MAPPER_LINEAR(0),
    TONE_MAPPER_REINHARDT(1),
    TONE_MAPPER_FILMIC(2),
    TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ToneMapper = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GlowBlendMode(
    id: Long,
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),
    GLOW_BLEND_MODE_SCREEN(1),
    GLOW_BLEND_MODE_SOFTLIGHT(2),
    GLOW_BLEND_MODE_REPLACE(3),
    GLOW_BLEND_MODE_MIX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GlowBlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SDFGIYScale(
    id: Long,
  ) {
    SDFGI_Y_SCALE_50_PERCENT(0),
    SDFGI_Y_SCALE_75_PERCENT(1),
    SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFGIYScale = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_background")

    public val getBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_background")

    public val setSkyPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_sky")

    public val getSkyPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_sky")

    public val setSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_custom_fov")

    public val getSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_custom_fov")

    public val setSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_rotation")

    public val getSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_rotation")

    public val setBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_bg_color")

    public val getBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_bg_color")

    public val setBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_energy_multiplier")

    public val getBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_energy_multiplier")

    public val setBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_intensity")

    public val getBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_intensity")

    public val setCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_canvas_max_layer")

    public val getCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_canvas_max_layer")

    public val setCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_camera_feed_id")

    public val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_camera_feed_id")

    public val setAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_color")

    public val getAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_color")

    public val setAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_source")

    public val getAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_source")

    public val setAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_energy")

    public val getAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_energy")

    public val setAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_sky_contribution")

    public val getAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_sky_contribution")

    public val setReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_reflection_source")

    public val getReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_reflection_source")

    public val setTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemapper")

    public val getTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemapper")

    public val setTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_exposure")

    public val getTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_exposure")

    public val setTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_white")

    public val getTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_white")

    public val setSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_enabled")

    public val isSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssr_enabled")

    public val setSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_max_steps")

    public val getSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_max_steps")

    public val setSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_in")

    public val getSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_in")

    public val setSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_out")

    public val getSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_out")

    public val setSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_depth_tolerance")

    public val getSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_depth_tolerance")

    public val setSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_enabled")

    public val isSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssao_enabled")

    public val setSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_radius")

    public val getSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_radius")

    public val setSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_intensity")

    public val getSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_intensity")

    public val setSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_power")

    public val getSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_power")

    public val setSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_detail")

    public val getSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_detail")

    public val setSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_horizon")

    public val getSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_horizon")

    public val setSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_sharpness")

    public val getSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_sharpness")

    public val setSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_direct_light_affect")

    public val getSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_direct_light_affect")

    public val setSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_ao_channel_affect")

    public val getSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_ao_channel_affect")

    public val setSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_enabled")

    public val isSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssil_enabled")

    public val setSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_radius")

    public val getSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_radius")

    public val setSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_intensity")

    public val getSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_intensity")

    public val setSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_sharpness")

    public val getSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_sharpness")

    public val setSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_normal_rejection")

    public val getSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_normal_rejection")

    public val setSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_enabled")

    public val isSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_enabled")

    public val setSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascades")

    public val getSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascades")

    public val setSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_min_cell_size")

    public val getSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_min_cell_size")

    public val setSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_max_distance")

    public val getSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_max_distance")

    public val setSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascade0_distance")

    public val getSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascade0_distance")

    public val setSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_y_scale")

    public val getSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_y_scale")

    public val setSdfgiUseOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_use_occlusion")

    public val isSdfgiUsingOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_using_occlusion")

    public val setSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_bounce_feedback")

    public val getSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_bounce_feedback")

    public val setSdfgiReadSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_read_sky_light")

    public val isSdfgiReadingSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_reading_sky_light")

    public val setSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_energy")

    public val getSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_energy")

    public val setSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_normal_bias")

    public val getSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_normal_bias")

    public val setSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_probe_bias")

    public val getSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_probe_bias")

    public val setGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_enabled")

    public val isGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_enabled")

    public val setGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_level")

    public val getGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_level")

    public val setGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_normalized")

    public val isGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_normalized")

    public val setGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_intensity")

    public val getGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_intensity")

    public val setGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_strength")

    public val getGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_strength")

    public val setGlowMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_glow_mix")

    public val getGlowMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_glow_mix")

    public val setGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_bloom")

    public val getGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_bloom")

    public val setGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_blend_mode")

    public val getGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_blend_mode")

    public val setGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_threshold")

    public val getGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_threshold")

    public val setGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_scale")

    public val getGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_scale")

    public val setGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_luminance_cap")

    public val getGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_luminance_cap")

    public val setGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_map_strength")

    public val getGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_map_strength")

    public val setGlowMapPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_glow_map")

    public val getGlowMapPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_glow_map")

    public val setFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_enabled")

    public val isFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_fog_enabled")

    public val setFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_color")

    public val getFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_color")

    public val setFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_energy")

    public val getFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_energy")

    public val setFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sun_scatter")

    public val getFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sun_scatter")

    public val setFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_density")

    public val getFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_density")

    public val setFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height")

    public val getFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height")

    public val setFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height_density")

    public val getFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height_density")

    public val setFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_aerial_perspective")

    public val getFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_aerial_perspective")

    public val setFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sky_affect")

    public val getFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sky_affect")

    public val setVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_enabled")

    public val isVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_enabled")

    public val setVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission")

    public val getVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission")

    public val setVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_albedo")

    public val getVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_albedo")

    public val setVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_density")

    public val getVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_density")

    public val setVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission_energy")

    public val getVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission_energy")

    public val setVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_anisotropy")

    public val getVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_anisotropy")

    public val setVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_length")

    public val getVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_length")

    public val setVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_detail_spread")

    public val getVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_detail_spread")

    public val setVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_gi_inject")

    public val getVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_gi_inject")

    public val setVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_ambient_inject")

    public val getVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_ambient_inject")

    public val setVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_sky_affect")

    public val getVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_sky_affect")

    public val setVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_enabled")

    public val isVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_temporal_reprojection_enabled")

    public val setVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_amount")

    public val getVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_temporal_reprojection_amount")

    public val setAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_enabled")

    public val isAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_adjustment_enabled")

    public val setAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_brightness")

    public val getAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_brightness")

    public val setAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_contrast")

    public val getAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_contrast")

    public val setAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_saturation")

    public val getAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_saturation")

    public val setAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_color_correction")

    public val getAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_color_correction")
  }
}
