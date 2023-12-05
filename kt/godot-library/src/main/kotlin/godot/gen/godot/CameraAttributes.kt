// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
public open class CameraAttributes : Resource() {
  public var exposureSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExposureSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExposureSensitivityPtr, NIL)
    }

  public var exposureMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExposureMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExposureMultiplierPtr, NIL)
    }

  public var autoExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoExposureEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureEnabledPtr, NIL)
    }

  public var autoExposureScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureScalePtr, NIL)
    }

  public var autoExposureSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureSpeedPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTES, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_multiplier")

    public val getExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_multiplier")

    public val setExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_sensitivity")

    public val getExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_sensitivity")

    public val setAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_enabled")

    public val isAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "is_auto_exposure_enabled")

    public val setAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_speed")

    public val getAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_speed")

    public val setAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_scale")

    public val getAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_scale")
  }
}
