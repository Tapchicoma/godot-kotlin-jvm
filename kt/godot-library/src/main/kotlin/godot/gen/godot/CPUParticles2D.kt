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
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
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
public open class CPUParticles2D : Node2D() {
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
      return CPUParticles2D.DrawOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawOrderPtr, NIL)
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

  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
      return CPUParticles2D.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
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
  public var emissionRectExtents: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRectExtentsPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRectExtentsPtr, NIL)
    }

  public var emissionPoints: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointsPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointsPtr, NIL)
    }

  public var emissionNormals: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalsPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalsPtr, NIL)
    }

  public var emissionColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorsPtr, PACKED_COLOR_ARRAY)
      return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorsPtr, NIL)
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

  @CoreTypeLocalCopy
  public var direction: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
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

  @CoreTypeLocalCopy
  public var gravity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
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

  public var angularVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var orbitVelocityCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var linearAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var radialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var tangentialAccelCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var dampingCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var angleCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  public var scaleAmountMin: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  public var scaleAmountMax: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  public var scaleAmountCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  public var splitScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSplitScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSplitScalePtr, NIL)
    }

  public var scaleCurveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveXPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveXPtr, NIL)
    }

  public var scaleCurveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleCurveYPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleCurveYPtr, NIL)
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

  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  public var colorInitialRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
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

  public var hueVariationCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var animSpeedCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
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

  public var animOffsetCurve: Curve?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamCurvePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CPUPARTICLES2D, scriptIndex)
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
   * val myCoreType = cpuparticles2d.emissionRectExtents
   * //Your changes
   * cpuparticles2d.emissionRectExtents = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionRectExtentsMutate(block: Vector2.() -> Unit): Vector2 =
      emissionRectExtents.apply{
      block(this)
      emissionRectExtents = this
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
   * val myCoreType = cpuparticles2d.direction
   * //Your changes
   * cpuparticles2d.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun directionMutate(block: Vector2.() -> Unit): Vector2 = direction.apply{
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
   * val myCoreType = cpuparticles2d.gravity
   * //Your changes
   * cpuparticles2d.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityMutate(block: Vector2.() -> Unit): Vector2 = gravity.apply{
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
   * val myCoreType = cpuparticles2d.color
   * //Your changes
   * cpuparticles2d.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public fun restart() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.restartPtr, NIL)
  }

  public fun convertFromParticles(particles: Node) {
    TransferContext.writeArguments(OBJECT to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.convertFromParticlesPtr, NIL)
  }

  public enum class DrawOrder(
    id: Long,
  ) {
    DRAW_ORDER_INDEX(0),
    DRAW_ORDER_LIFETIME(1),
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
    PARAM_MAX(12),
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
    EMISSION_SHAPE_RECTANGLE(3),
    EMISSION_SHAPE_POINTS(4),
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    EMISSION_SHAPE_MAX(6),
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

  public companion object

  internal object MethodBindings {
    public val setEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emitting")

    public val setAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "set_amount")

    public val setLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_one_shot")

    public val setPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_pre_process_time")

    public val setExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_explosiveness_ratio")

    public val setRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_randomness_ratio")

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_lifetime_randomness")

    public val setUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_use_local_coordinates")

    public val setFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fixed_fps")

    public val setFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_fractional_delta")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_speed_scale")

    public val isEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "is_emitting")

    public val getAmountPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "get_amount")

    public val getLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_one_shot")

    public val getPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_pre_process_time")

    public val getExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_explosiveness_ratio")

    public val getRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_randomness_ratio")

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_lifetime_randomness")

    public val getUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_use_local_coordinates")

    public val getFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fixed_fps")

    public val getFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_fractional_delta")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_speed_scale")

    public val setDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_draw_order")

    public val getDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_draw_order")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_texture")

    public val restartPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "restart")

    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_direction")

    public val setSpreadPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "set_spread")

    public val getSpreadPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "get_spread")

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_min")

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_min")

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_max")

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_max")

    public val setParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_param_curve")

    public val getParamCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_param_curve")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CPUParticles2D", "get_color")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_ramp")

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_color_initial_ramp")

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_color_initial_ramp")

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_particle_flag")

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_particle_flag")

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_shape")

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_shape")

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_sphere_radius")

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_sphere_radius")

    public val setEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_rect_extents")

    public val getEmissionRectExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_rect_extents")

    public val setEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_points")

    public val getEmissionPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_points")

    public val setEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_normals")

    public val getEmissionNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_normals")

    public val setEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_emission_colors")

    public val getEmissionColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_emission_colors")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_gravity")

    public val getSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_split_scale")

    public val setSplitScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_split_scale")

    public val getScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_x")

    public val setScaleCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_x")

    public val getScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "get_scale_curve_y")

    public val setScaleCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "set_scale_curve_y")

    public val convertFromParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CPUParticles2D", "convert_from_particles")
  }
}
