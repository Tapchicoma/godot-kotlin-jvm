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
public open class ParticleProcessMaterial : Material() {
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLifetimeRandomnessPtr, NIL)
    }

  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
      return ParticleProcessMaterial.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
    }

  public var emissionSphereRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionBoxExtentsPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionBoxExtentsPtr, NIL)
    }

  public var emissionPointTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointTexturePtr, NIL)
    }

  public var emissionNormalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalTexturePtr, NIL)
    }

  public var emissionColorTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorTexturePtr, NIL)
    }

  public var emissionPointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointCountPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingAxisPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingAxisPtr, NIL)
    }

  public var emissionRingHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingHeightPtr, NIL)
    }

  public var emissionRingRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingRadiusPtr, NIL)
    }

  public var emissionRingInnerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingInnerRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingInnerRadiusPtr, NIL)
    }

  public var particleFlagAlignY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  public var particleFlagRotateY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  public var particleFlagDisableZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
    }

  public var flatness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlatnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatnessPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  public var initialVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var initialVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var angularVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var angularVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var angularVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var orbitVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var orbitVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var orbitVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var linearAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var linearAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var linearAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var radialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var radialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var radialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var tangentialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var tangentialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var tangentialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var dampingMin: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var dampingMax: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var dampingCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var angleMin: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var angleMax: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var angleCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var scaleMin: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var scaleMax: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var scaleCurve: Material?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  public var colorRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  public var colorInitialRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
    }

  public var hueVariationMin: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var hueVariationMax: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var hueVariationCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var turbulenceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceEnabledPtr, NIL)
    }

  public var turbulenceNoiseStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseStrengthPtr, NIL)
    }

  public var turbulenceNoiseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var turbulenceNoiseSpeed: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedPtr, NIL)
    }

  public var turbulenceNoiseSpeedRandom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedRandomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedRandomPtr, NIL)
    }

  public var turbulenceInfluenceMin: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var turbulenceInfluenceMax: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var turbulenceInitialDisplacementMin: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var turbulenceInitialDisplacementMax: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var turbulenceInfluenceOverLife: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var animSpeedMin: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var animSpeedMax: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var animSpeedCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var animOffsetMin: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var animOffsetMax: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var animOffsetCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  public var subEmitterMode: SubEmitterMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterModePtr, LONG)
      return ParticleProcessMaterial.SubEmitterMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterModePtr, NIL)
    }

  public var subEmitterFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterFrequencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterFrequencyPtr, NIL)
    }

  public var subEmitterAmountAtEnd: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtEndPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtEndPtr, NIL)
    }

  public var subEmitterAmountAtCollision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtCollisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtCollisionPtr, NIL)
    }

  public var subEmitterKeepVelocity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterKeepVelocityPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterKeepVelocityPtr, NIL)
    }

  public var attractorInteractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAttractorInteractionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttractorInteractionEnabledPtr, NIL)
    }

  public var collisionMode: CollisionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionModePtr, LONG)
      return ParticleProcessMaterial.CollisionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionModePtr, NIL)
    }

  public var collisionFriction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionFrictionPtr, NIL)
    }

  public var collisionBounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionBouncePtr, NIL)
    }

  public var collisionUseScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollisionUsingScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionUseScalePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARTICLEPROCESSMATERIAL, scriptIndex)
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
   * val myCoreType = particleprocessmaterial.emissionBoxExtents
   * //Your changes
   * particleprocessmaterial.emissionBoxExtents = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionBoxExtentsMutate(block: Vector3.() -> Unit): Vector3 =
      emissionBoxExtents.apply{
      block(this)
      emissionBoxExtents = this
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
   * val myCoreType = particleprocessmaterial.emissionRingAxis
   * //Your changes
   * particleprocessmaterial.emissionRingAxis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
      emissionRingAxis.apply{
      block(this)
      emissionRingAxis = this
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
   * val myCoreType = particleprocessmaterial.direction
   * //Your changes
   * particleprocessmaterial.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
      block(this)
      direction = this
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
   * val myCoreType = particleprocessmaterial.gravity
   * //Your changes
   * particleprocessmaterial.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
      block(this)
      gravity = this
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
   * val myCoreType = particleprocessmaterial.color
   * //Your changes
   * particleprocessmaterial.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
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
   * val myCoreType = particleprocessmaterial.turbulenceNoiseSpeed
   * //Your changes
   * particleprocessmaterial.turbulenceNoiseSpeed = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun turbulenceNoiseSpeedMutate(block: Vector3.() -> Unit): Vector3 =
      turbulenceNoiseSpeed.apply{
      block(this)
      turbulenceNoiseSpeed = this
  }


  public enum class Parameter(
    id: Long,
  ) {
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    PARAM_ANGULAR_VELOCITY(1),
    PARAM_ORBIT_VELOCITY(2),
    PARAM_LINEAR_ACCEL(3),
    PARAM_RADIAL_ACCEL(4),
    PARAM_TANGENTIAL_ACCEL(5),
    PARAM_DAMPING(6),
    PARAM_ANGLE(7),
    PARAM_SCALE(8),
    PARAM_HUE_VARIATION(9),
    PARAM_ANIM_SPEED(10),
    PARAM_ANIM_OFFSET(11),
    PARAM_MAX(15),
    PARAM_TURB_VEL_INFLUENCE(13),
    PARAM_TURB_INIT_DISPLACEMENT(14),
    PARAM_TURB_INFLUENCE_OVER_LIFE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Parameter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticleFlags(
    id: Long,
  ) {
    PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY(0),
    PARTICLE_FLAG_ROTATE_Y(1),
    PARTICLE_FLAG_DISABLE_Z(2),
    PARTICLE_FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticleFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EmissionShape(
    id: Long,
  ) {
    EMISSION_SHAPE_POINT(0),
    EMISSION_SHAPE_SPHERE(1),
    EMISSION_SHAPE_SPHERE_SURFACE(2),
    EMISSION_SHAPE_BOX(3),
    EMISSION_SHAPE_POINTS(4),
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    EMISSION_SHAPE_RING(6),
    EMISSION_SHAPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmissionShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SubEmitterMode(
    id: Long,
  ) {
    SUB_EMITTER_DISABLED(0),
    SUB_EMITTER_CONSTANT(1),
    SUB_EMITTER_AT_END(2),
    SUB_EMITTER_AT_COLLISION(3),
    SUB_EMITTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SubEmitterMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CollisionMode(
    id: Long,
  ) {
    COLLISION_DISABLED(0),
    COLLISION_RIGID(1),
    COLLISION_HIDE_ON_CONTACT(2),
    COLLISION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CollisionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_direction")

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_spread")

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_spread")

    public val setFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_flatness")

    public val getFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_flatness")

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_min")

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_min")

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_max")

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_max")

    public val setParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_texture")

    public val getParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_texture")

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color")

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_ramp")

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_initial_ramp")

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_initial_ramp")

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_particle_flag")

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_particle_flag")

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape")

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape")

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_sphere_radius")

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_sphere_radius")

    public val setEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_box_extents")

    public val getEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_box_extents")

    public val setEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_texture")

    public val getEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_texture")

    public val setEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_normal_texture")

    public val getEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_normal_texture")

    public val setEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_color_texture")

    public val getEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_color_texture")

    public val setEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_count")

    public val getEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_count")

    public val setEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_axis")

    public val getEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_axis")

    public val setEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_height")

    public val getEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_height")

    public val setEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_radius")

    public val getEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_radius")

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_inner_radius")

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_inner_radius")

    public val getTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_enabled")

    public val setTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_enabled")

    public val getTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_strength")

    public val setTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_strength")

    public val getTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_scale")

    public val setTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_scale")

    public val getTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed_random")

    public val setTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed_random")

    public val getTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed")

    public val setTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_gravity")

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_lifetime_randomness")

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_lifetime_randomness")

    public val getSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_mode")

    public val setSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_mode")

    public val getSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_frequency")

    public val setSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_frequency")

    public val getSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_end")

    public val setSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_end")

    public val getSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision")

    public val setSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision")

    public val getSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_keep_velocity")

    public val setSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_keep_velocity")

    public val setAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_attractor_interaction_enabled")

    public val isAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_attractor_interaction_enabled")

    public val setCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_mode")

    public val getCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_mode")

    public val setCollisionUseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_use_scale")

    public val isCollisionUsingScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_collision_using_scale")

    public val setCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_friction")

    public val getCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_friction")

    public val setCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_bounce")

    public val getCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_bounce")
  }
}
