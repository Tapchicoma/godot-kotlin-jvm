// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class CameraAttributesPhysical : CameraAttributes() {
  public var frustumFocusDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusDistancePtr, NIL)
    }

  public var frustumFocalLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFocalLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFocalLengthPtr, NIL)
    }

  public var frustumNear: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNearPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNearPtr, NIL)
    }

  public var frustumFar: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFarPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFarPtr, NIL)
    }

  public var exposureAperture: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAperturePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAperturePtr, NIL)
    }

  public var exposureShutterSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShutterSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setShutterSpeedPtr, NIL)
    }

  public var autoExposureMinExposureValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMinExposureValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMinExposureValuePtr, NIL)
    }

  public var autoExposureMaxExposureValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMaxExposureValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMaxExposureValuePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTESPHYSICAL, scriptIndex)
    return true
  }

  public fun getFov(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFovPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setAperturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_aperture")

    public val getAperturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_aperture")

    public val setShutterSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_shutter_speed")

    public val getShutterSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_shutter_speed")

    public val setFocalLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_focal_length")

    public val getFocalLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_focal_length")

    public val setFocusDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_focus_distance")

    public val getFocusDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_focus_distance")

    public val setNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_near")

    public val getNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_near")

    public val setFarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_far")

    public val getFarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_far")

    public val getFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_fov")

    public val setAutoExposureMaxExposureValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_auto_exposure_max_exposure_value")

    public val getAutoExposureMaxExposureValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_auto_exposure_max_exposure_value")

    public val setAutoExposureMinExposureValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "set_auto_exposure_min_exposure_value")

    public val getAutoExposureMinExposureValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPhysical", "get_auto_exposure_min_exposure_value")
  }
}
