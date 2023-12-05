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
public open class CameraAttributesPractical : CameraAttributes() {
  public var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurFarEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarEnabledPtr, NIL)
    }

  public var dofBlurFarDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarDistancePtr, NIL)
    }

  public var dofBlurFarTransition: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarTransitionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarTransitionPtr, NIL)
    }

  public var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurNearEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearEnabledPtr, NIL)
    }

  public var dofBlurNearDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearDistancePtr, NIL)
    }

  public var dofBlurNearTransition: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearTransitionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearTransitionPtr, NIL)
    }

  public var dofBlurAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurAmountPtr, NIL)
    }

  public var autoExposureMinSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMinSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMinSensitivityPtr, NIL)
    }

  public var autoExposureMaxSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMaxSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMaxSensitivityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTESPRACTICAL, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_enabled")

    public val isDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_far_enabled")

    public val setDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_distance")

    public val getDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_distance")

    public val setDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_transition")

    public val getDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_transition")

    public val setDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_enabled")

    public val isDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_near_enabled")

    public val setDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_distance")

    public val getDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_distance")

    public val setDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_transition")

    public val getDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_transition")

    public val setDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_amount")

    public val getDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_amount")

    public val setAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_max_sensitivity")

    public val getAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_max_sensitivity")

    public val setAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_min_sensitivity")

    public val getAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_min_sensitivity")
  }
}
