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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class RDSamplerState : RefCounted() {
  public var magFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMagFilterPtr, NIL)
    }

  public var minFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinFilterPtr, NIL)
    }

  public var mipFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMipFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMipFilterPtr, NIL)
    }

  public var repeatU: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatUPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatUPtr, NIL)
    }

  public var repeatV: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatVPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatVPtr, NIL)
    }

  public var repeatW: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatWPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatWPtr, NIL)
    }

  public var lodBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLodBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLodBiasPtr, NIL)
    }

  public var useAnisotropy: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseAnisotropyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAnisotropyPtr, NIL)
    }

  public var anisotropyMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnisotropyMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAnisotropyMaxPtr, NIL)
    }

  public var enableCompare: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableComparePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableComparePtr, NIL)
    }

  public var compareOp: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCompareOpPtr, LONG)
      return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCompareOpPtr, NIL)
    }

  public var minLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinLodPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinLodPtr, NIL)
    }

  public var maxLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLodPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLodPtr, NIL)
    }

  public var borderColor: RenderingDevice.SamplerBorderColor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, LONG)
      return RenderingDevice.SamplerBorderColor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
    }

  public var unnormalizedUvw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnnormalizedUvwPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnnormalizedUvwPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSAMPLERSTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mag_filter")

    public val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mag_filter")

    public val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_min_filter")

    public val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_min_filter")

    public val setMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mip_filter")

    public val getMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mip_filter")

    public val setRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_u")

    public val getRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_u")

    public val setRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_v")

    public val getRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_v")

    public val setRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_w")

    public val getRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_w")

    public val setLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_lod_bias")

    public val getLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_lod_bias")

    public val setUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_use_anisotropy")

    public val getUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_use_anisotropy")

    public val setAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_anisotropy_max")

    public val getAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_anisotropy_max")

    public val setEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_enable_compare")

    public val getEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_enable_compare")

    public val setCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_compare_op")

    public val getCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_compare_op")

    public val setMinLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "set_min_lod")

    public val getMinLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "get_min_lod")

    public val setMaxLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "set_max_lod")

    public val getMaxLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "get_max_lod")

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_border_color")

    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_border_color")

    public val setUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_unnormalized_uvw")

    public val getUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_unnormalized_uvw")
  }
}
