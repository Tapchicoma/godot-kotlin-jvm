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
public open class BaseMaterial3D internal constructor() : Material() {
  public var transparency: Transparency
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransparencyPtr, LONG)
      return BaseMaterial3D.Transparency.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransparencyPtr, NIL)
    }

  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
    }

  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
    }

  public var alphaAntialiasingMode: AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
    }

  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
    }

  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return BaseMaterial3D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  public var cullMode: CullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
      return BaseMaterial3D.CullMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
    }

  public var depthDrawMode: DepthDrawMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthDrawModePtr, LONG)
      return BaseMaterial3D.DepthDrawMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthDrawModePtr, NIL)
    }

  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var shadingMode: ShadingMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadingModePtr, LONG)
      return BaseMaterial3D.ShadingMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadingModePtr, NIL)
    }

  public var diffuseMode: DiffuseMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiffuseModePtr, LONG)
      return BaseMaterial3D.DiffuseMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiffuseModePtr, NIL)
    }

  public var specularMode: SpecularMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularModePtr, LONG)
      return BaseMaterial3D.SpecularMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularModePtr, NIL)
    }

  public var disableAmbientLight: Boolean
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var vertexColorUseAsAlbedo: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var vertexColorIsSrgb: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var albedoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlbedoPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlbedoPtr, NIL)
    }

  public var albedoTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var albedoTextureForceSrgb: Boolean
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var albedoTextureMsdf: Boolean
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var ormTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var metallic: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMetallicPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMetallicPtr, NIL)
    }

  public var metallicSpecular: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularPtr, NIL)
    }

  public var metallicTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var metallicTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMetallicTextureChannelPtr, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetallicTextureChannelPtr, NIL)
    }

  public var roughness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRoughnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRoughnessPtr, NIL)
    }

  public var roughnessTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var roughnessTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRoughnessTextureChannelPtr, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRoughnessTextureChannelPtr, NIL)
    }

  public var emissionEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPtr, NIL)
    }

  public var emissionEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionEnergyMultiplierPtr, NIL)
    }

  public var emissionIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionIntensityPtr, NIL)
    }

  public var emissionOperator: EmissionOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionOperatorPtr, LONG)
      return BaseMaterial3D.EmissionOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionOperatorPtr, NIL)
    }

  public var emissionOnUv2: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var emissionTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var normalEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var normalScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalScalePtr, NIL)
    }

  public var normalTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var rimEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var rim: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRimPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRimPtr, NIL)
    }

  public var rimTint: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRimTintPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRimTintPtr, NIL)
    }

  public var rimTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var clearcoatEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var clearcoat: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClearcoatPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setClearcoatPtr, NIL)
    }

  public var clearcoatRoughness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClearcoatRoughnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setClearcoatRoughnessPtr, NIL)
    }

  public var clearcoatTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var anisotropyEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var anisotropy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnisotropyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAnisotropyPtr, NIL)
    }

  public var anisotropyFlowmap: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var aoEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var aoLightAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAoLightAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAoLightAffectPtr, NIL)
    }

  public var aoTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var aoOnUv2: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var aoTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAoTextureChannelPtr, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAoTextureChannelPtr, NIL)
    }

  public var heightmapEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var heightmapScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightmapScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapScalePtr, NIL)
    }

  public var heightmapDeepParallax: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHeightmapDeepParallaxEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxPtr, NIL)
    }

  public var heightmapMinLayers: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxMinLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxMinLayersPtr, NIL)
    }

  public var heightmapMaxLayers: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxMaxLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxMaxLayersPtr, NIL)
    }

  public var heightmapFlipTangent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxFlipTangentPtr,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxFlipTangentPtr, NIL)
    }

  public var heightmapFlipBinormal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxFlipBinormalPtr,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxFlipBinormalPtr,
          NIL)
    }

  public var heightmapTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var heightmapFlipTexture: Boolean
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var subsurfScatterEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var subsurfScatterStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubsurfaceScatteringStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubsurfaceScatteringStrengthPtr, NIL)
    }

  public var subsurfScatterSkinMode: Boolean
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var subsurfScatterTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var subsurfScatterTransmittanceEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var subsurfScatterTransmittanceColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransmittanceColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransmittanceColorPtr, NIL)
    }

  public var subsurfScatterTransmittanceTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var subsurfScatterTransmittanceDepth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransmittanceDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTransmittanceDepthPtr, NIL)
    }

  public var subsurfScatterTransmittanceBoost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransmittanceBoostPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTransmittanceBoostPtr, NIL)
    }

  public var backlightEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var backlight: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBacklightPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBacklightPtr, NIL)
    }

  public var backlightTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var refractionEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var refractionScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRefractionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRefractionPtr, NIL)
    }

  public var refractionTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var refractionTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRefractionTextureChannelPtr, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRefractionTextureChannelPtr, NIL)
    }

  public var detailEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
    }

  public var detailMask: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var detailBlendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailBlendModePtr, LONG)
      return BaseMaterial3D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailBlendModePtr, NIL)
    }

  public var detailUvLayer: DetailUV
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailUvPtr, LONG)
      return BaseMaterial3D.DetailUV.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailUvPtr, NIL)
    }

  public var detailAlbedo: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var detailNormal: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var uv1Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv1ScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUv1ScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var uv1Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv1OffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUv1OffsetPtr, NIL)
    }

  public var uv1Triplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var uv1TriplanarSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv1TriplanarBlendSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUv1TriplanarBlendSharpnessPtr, NIL)
    }

  public var uv1WorldTriplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var uv2Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv2ScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUv2ScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var uv2Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv2OffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUv2OffsetPtr, NIL)
    }

  public var uv2Triplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var uv2TriplanarSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv2TriplanarBlendSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUv2TriplanarBlendSharpnessPtr, NIL)
    }

  public var uv2WorldTriplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  public var textureRepeat: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var disableReceiveShadows: Boolean
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var shadowToOpacity: Boolean
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var billboardMode: BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
    }

  public var billboardKeepScale: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
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

  public var grow: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGrowEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGrowEnabledPtr, NIL)
    }

  public var growAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGrowPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGrowPtr, NIL)
    }

  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var usePointSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var pointSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPointSizePtr, NIL)
    }

  public var useParticleTrails: Boolean
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var proximityFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isProximityFadeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProximityFadeEnabledPtr, NIL)
    }

  public var proximityFadeDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProximityFadeDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProximityFadeDistancePtr, NIL)
    }

  public var msdfPixelRange: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfPixelRangePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfPixelRangePtr, NIL)
    }

  public var msdfOutlineSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsdfOutlineSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMsdfOutlineSizePtr, NIL)
    }

  public var distanceFadeMode: DistanceFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadePtr, LONG)
      return BaseMaterial3D.DistanceFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadePtr, NIL)
    }

  public var distanceFadeMinDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeMinDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeMinDistancePtr, NIL)
    }

  public var distanceFadeMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeMaxDistancePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BASEMATERIAL3D, scriptIndex)
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
   * val myCoreType = basematerial3d.albedoColor
   * //Your changes
   * basematerial3d.albedoColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun albedoColorMutate(block: Color.() -> Unit): Color = albedoColor.apply{
      block(this)
      albedoColor = this
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
   * val myCoreType = basematerial3d.emission
   * //Your changes
   * basematerial3d.emission = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionMutate(block: Color.() -> Unit): Color = emission.apply{
      block(this)
      emission = this
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
   * val myCoreType = basematerial3d.subsurfScatterTransmittanceColor
   * //Your changes
   * basematerial3d.subsurfScatterTransmittanceColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun subsurfScatterTransmittanceColorMutate(block: Color.() -> Unit): Color =
      subsurfScatterTransmittanceColor.apply{
      block(this)
      subsurfScatterTransmittanceColor = this
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
   * val myCoreType = basematerial3d.backlight
   * //Your changes
   * basematerial3d.backlight = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun backlightMutate(block: Color.() -> Unit): Color = backlight.apply{
      block(this)
      backlight = this
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
   * val myCoreType = basematerial3d.uv1Scale
   * //Your changes
   * basematerial3d.uv1Scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun uv1ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      block(this)
      uv1Scale = this
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
   * val myCoreType = basematerial3d.uv1Offset
   * //Your changes
   * basematerial3d.uv1Offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun uv1OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      block(this)
      uv1Offset = this
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
   * val myCoreType = basematerial3d.uv2Scale
   * //Your changes
   * basematerial3d.uv2Scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun uv2ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      block(this)
      uv2Scale = this
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
   * val myCoreType = basematerial3d.uv2Offset
   * //Your changes
   * basematerial3d.uv2Offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun uv2OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      block(this)
      uv2Offset = this
  }


  public enum class TextureParam(
    id: Long,
  ) {
    TEXTURE_ALBEDO(0),
    TEXTURE_METALLIC(1),
    TEXTURE_ROUGHNESS(2),
    TEXTURE_EMISSION(3),
    TEXTURE_NORMAL(4),
    TEXTURE_RIM(5),
    TEXTURE_CLEARCOAT(6),
    TEXTURE_FLOWMAP(7),
    TEXTURE_AMBIENT_OCCLUSION(8),
    TEXTURE_HEIGHTMAP(9),
    TEXTURE_SUBSURFACE_SCATTERING(10),
    TEXTURE_SUBSURFACE_TRANSMITTANCE(11),
    TEXTURE_BACKLIGHT(12),
    TEXTURE_REFRACTION(13),
    TEXTURE_DETAIL_MASK(14),
    TEXTURE_DETAIL_ALBEDO(15),
    TEXTURE_DETAIL_NORMAL(16),
    TEXTURE_ORM(17),
    TEXTURE_MAX(18),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    TEXTURE_FILTER_NEAREST(0),
    TEXTURE_FILTER_LINEAR(1),
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(2),
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(3),
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(4),
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(5),
    TEXTURE_FILTER_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DetailUV(
    id: Long,
  ) {
    DETAIL_UV_1(0),
    DETAIL_UV_2(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DetailUV = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Transparency(
    id: Long,
  ) {
    TRANSPARENCY_DISABLED(0),
    TRANSPARENCY_ALPHA(1),
    TRANSPARENCY_ALPHA_SCISSOR(2),
    TRANSPARENCY_ALPHA_HASH(3),
    TRANSPARENCY_ALPHA_DEPTH_PRE_PASS(4),
    TRANSPARENCY_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Transparency = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShadingMode(
    id: Long,
  ) {
    SHADING_MODE_UNSHADED(0),
    SHADING_MODE_PER_PIXEL(1),
    SHADING_MODE_PER_VERTEX(2),
    SHADING_MODE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadingMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Feature(
    id: Long,
  ) {
    FEATURE_EMISSION(0),
    FEATURE_NORMAL_MAPPING(1),
    FEATURE_RIM(2),
    FEATURE_CLEARCOAT(3),
    FEATURE_ANISOTROPY(4),
    FEATURE_AMBIENT_OCCLUSION(5),
    FEATURE_HEIGHT_MAPPING(6),
    FEATURE_SUBSURFACE_SCATTERING(7),
    FEATURE_SUBSURFACE_TRANSMITTANCE(8),
    FEATURE_BACKLIGHT(9),
    FEATURE_REFRACTION(10),
    FEATURE_DETAIL(11),
    FEATURE_MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BlendMode(
    id: Long,
  ) {
    BLEND_MODE_MIX(0),
    BLEND_MODE_ADD(1),
    BLEND_MODE_SUB(2),
    BLEND_MODE_MUL(3),
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

  public enum class AlphaAntiAliasing(
    id: Long,
  ) {
    ALPHA_ANTIALIASING_OFF(0),
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE(1),
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE_AND_TO_ONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaAntiAliasing = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DepthDrawMode(
    id: Long,
  ) {
    DEPTH_DRAW_OPAQUE_ONLY(0),
    DEPTH_DRAW_ALWAYS(1),
    DEPTH_DRAW_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DepthDrawMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CullMode(
    id: Long,
  ) {
    CULL_BACK(0),
    CULL_FRONT(1),
    CULL_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CullMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Flags(
    id: Long,
  ) {
    FLAG_DISABLE_DEPTH_TEST(0),
    FLAG_ALBEDO_FROM_VERTEX_COLOR(1),
    FLAG_SRGB_VERTEX_COLOR(2),
    FLAG_USE_POINT_SIZE(3),
    FLAG_FIXED_SIZE(4),
    FLAG_BILLBOARD_KEEP_SCALE(5),
    FLAG_UV1_USE_TRIPLANAR(6),
    FLAG_UV2_USE_TRIPLANAR(7),
    FLAG_UV1_USE_WORLD_TRIPLANAR(8),
    FLAG_UV2_USE_WORLD_TRIPLANAR(9),
    FLAG_AO_ON_UV2(10),
    FLAG_EMISSION_ON_UV2(11),
    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(12),
    FLAG_DONT_RECEIVE_SHADOWS(13),
    FLAG_DISABLE_AMBIENT_LIGHT(14),
    FLAG_USE_SHADOW_TO_OPACITY(15),
    FLAG_USE_TEXTURE_REPEAT(16),
    FLAG_INVERT_HEIGHTMAP(17),
    FLAG_SUBSURFACE_MODE_SKIN(18),
    FLAG_PARTICLE_TRAILS_MODE(19),
    FLAG_ALBEDO_TEXTURE_MSDF(20),
    FLAG_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DiffuseMode(
    id: Long,
  ) {
    DIFFUSE_BURLEY(0),
    DIFFUSE_LAMBERT(1),
    DIFFUSE_LAMBERT_WRAP(2),
    DIFFUSE_TOON(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DiffuseMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SpecularMode(
    id: Long,
  ) {
    SPECULAR_SCHLICK_GGX(0),
    SPECULAR_TOON(1),
    SPECULAR_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpecularMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BillboardMode(
    id: Long,
  ) {
    BILLBOARD_DISABLED(0),
    BILLBOARD_ENABLED(1),
    BILLBOARD_FIXED_Y(2),
    BILLBOARD_PARTICLES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BillboardMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureChannel(
    id: Long,
  ) {
    TEXTURE_CHANNEL_RED(0),
    TEXTURE_CHANNEL_GREEN(1),
    TEXTURE_CHANNEL_BLUE(2),
    TEXTURE_CHANNEL_ALPHA(3),
    TEXTURE_CHANNEL_GRAYSCALE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureChannel = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EmissionOperator(
    id: Long,
  ) {
    EMISSION_OP_ADD(0),
    EMISSION_OP_MULTIPLY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmissionOperator = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DistanceFadeMode(
    id: Long,
  ) {
    DISTANCE_FADE_DISABLED(0),
    DISTANCE_FADE_PIXEL_ALPHA(1),
    DISTANCE_FADE_PIXEL_DITHER(2),
    DISTANCE_FADE_OBJECT_DITHER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DistanceFadeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setAlbedoPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "set_albedo")

    public val getAlbedoPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "get_albedo")

    public val setTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transparency")

    public val getTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transparency")

    public val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing")

    public val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing")

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing_edge")

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing_edge")

    public val setShadingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_shading_mode")

    public val getShadingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_shading_mode")

    public val setSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_specular")

    public val getSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_specular")

    public val setMetallicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_metallic")

    public val getMetallicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_metallic")

    public val setRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_roughness")

    public val getRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_roughness")

    public val setEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission")

    public val getEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission")

    public val setEmissionEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_energy_multiplier")

    public val getEmissionEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_energy_multiplier")

    public val setEmissionIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_intensity")

    public val getEmissionIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_intensity")

    public val setNormalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_normal_scale")

    public val getNormalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_normal_scale")

    public val setRimPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "set_rim")

    public val getRimPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "get_rim")

    public val setRimTintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_rim_tint")

    public val getRimTintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_rim_tint")

    public val setClearcoatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_clearcoat")

    public val getClearcoatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_clearcoat")

    public val setClearcoatRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_clearcoat_roughness")

    public val getClearcoatRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_clearcoat_roughness")

    public val setAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_anisotropy")

    public val getAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_anisotropy")

    public val setHeightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_scale")

    public val getHeightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_scale")

    public val setSubsurfaceScatteringStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_subsurface_scattering_strength")

    public val getSubsurfaceScatteringStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_subsurface_scattering_strength")

    public val setTransmittanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_color")

    public val getTransmittanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_color")

    public val setTransmittanceDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_depth")

    public val getTransmittanceDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_depth")

    public val setTransmittanceBoostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_boost")

    public val getTransmittanceBoostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_boost")

    public val setBacklightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_backlight")

    public val getBacklightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_backlight")

    public val setRefractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_refraction")

    public val getRefractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_refraction")

    public val setPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_point_size")

    public val getPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_point_size")

    public val setDetailUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_detail_uv")

    public val getDetailUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_detail_uv")

    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_blend_mode")

    public val setDepthDrawModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_depth_draw_mode")

    public val getDepthDrawModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_depth_draw_mode")

    public val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_cull_mode")

    public val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_cull_mode")

    public val setDiffuseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_diffuse_mode")

    public val getDiffuseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_diffuse_mode")

    public val setSpecularModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_specular_mode")

    public val getSpecularModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_specular_mode")

    public val setFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "set_flag")

    public val getFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "get_flag")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_texture_filter")

    public val setFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_feature")

    public val getFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_feature")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_texture")

    public val setDetailBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_detail_blend_mode")

    public val getDetailBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_detail_blend_mode")

    public val setUv1ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_scale")

    public val getUv1ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_scale")

    public val setUv1OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_offset")

    public val getUv1OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_offset")

    public val setUv1TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_triplanar_blend_sharpness")

    public val getUv1TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_triplanar_blend_sharpness")

    public val setUv2ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_scale")

    public val getUv2ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_scale")

    public val setUv2OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_offset")

    public val getUv2OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_offset")

    public val setUv2TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_triplanar_blend_sharpness")

    public val getUv2TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_triplanar_blend_sharpness")

    public val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_billboard_mode")

    public val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_billboard_mode")

    public val setParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_h_frames")

    public val getParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_h_frames")

    public val setParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_v_frames")

    public val getParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_v_frames")

    public val setParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_loop")

    public val getParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_loop")

    public val setHeightmapDeepParallaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax")

    public val isHeightmapDeepParallaxEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_heightmap_deep_parallax_enabled")

    public val setHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_min_layers")

    public val getHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_min_layers")

    public val setHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_max_layers")

    public val getHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_max_layers")

    public val setHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_tangent")

    public val getHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_tangent")

    public val setHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_binormal")

    public val getHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_binormal")

    public val setGrowPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "set_grow")

    public val getGrowPtr: VoidPtr = TypeManager.getMethodBindPtr("BaseMaterial3D", "get_grow")

    public val setEmissionOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_operator")

    public val getEmissionOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_operator")

    public val setAoLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_ao_light_affect")

    public val getAoLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_ao_light_affect")

    public val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_scissor_threshold")

    public val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_scissor_threshold")

    public val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_hash_scale")

    public val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_hash_scale")

    public val setGrowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_grow_enabled")

    public val isGrowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_grow_enabled")

    public val setMetallicTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_metallic_texture_channel")

    public val getMetallicTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_metallic_texture_channel")

    public val setRoughnessTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_roughness_texture_channel")

    public val getRoughnessTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_roughness_texture_channel")

    public val setAoTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_ao_texture_channel")

    public val getAoTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_ao_texture_channel")

    public val setRefractionTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_refraction_texture_channel")

    public val getRefractionTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_refraction_texture_channel")

    public val setProximityFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_enabled")

    public val isProximityFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_proximity_fade_enabled")

    public val setProximityFadeDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_distance")

    public val getProximityFadeDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_proximity_fade_distance")

    public val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_msdf_pixel_range")

    public val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_msdf_pixel_range")

    public val setMsdfOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_msdf_outline_size")

    public val getMsdfOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_msdf_outline_size")

    public val setDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade")

    public val getDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade")

    public val setDistanceFadeMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_max_distance")

    public val getDistanceFadeMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_max_distance")

    public val setDistanceFadeMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_min_distance")

    public val getDistanceFadeMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_min_distance")
  }
}
