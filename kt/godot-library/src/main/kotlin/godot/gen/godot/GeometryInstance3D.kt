// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class GeometryInstance3D : VisualInstance3D() {
  public var materialOverride: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialOverridePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialOverridePtr, NIL)
    }

  public var materialOverlay: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialOverlayPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialOverlayPtr, NIL)
    }

  public var transparency: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransparencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTransparencyPtr, NIL)
    }

  public var castShadow: ShadowCastingSetting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCastShadowsSettingPtr, LONG)
      return GeometryInstance3D.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCastShadowsSettingPtr, NIL)
    }

  public var extraCullMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExtraCullMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExtraCullMarginPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var customAabb: CoreAABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomAabbPtr, VariantTypeAABB)
      return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
    }
    set(`value`) {
      TransferContext.writeArguments(VariantTypeAABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
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

  public var ignoreOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIgnoringOcclusionCullingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreOcclusionCullingPtr, NIL)
    }

  public var giMode: GIMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGiModePtr, LONG)
      return GeometryInstance3D.GIMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGiModePtr, NIL)
    }

  public var giLightmapScale: LightmapScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightmapScalePtr, LONG)
      return GeometryInstance3D.LightmapScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightmapScalePtr, NIL)
    }

  public var visibilityRangeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginPtr, NIL)
    }

  public var visibilityRangeBeginMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginMarginPtr, NIL)
    }

  public var visibilityRangeEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndPtr, NIL)
    }

  public var visibilityRangeEndMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndMarginPtr, NIL)
    }

  public var visibilityRangeFadeMode: VisibilityRangeFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeFadeModePtr, LONG)
      return GeometryInstance3D.VisibilityRangeFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeFadeModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GEOMETRYINSTANCE3D, scriptIndex)
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
   * val myCoreType = geometryinstance3d.customAabb
   * //Your changes
   * geometryinstance3d.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabbMutate(block: CoreAABB.() -> Unit): CoreAABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  public fun setInstanceShaderParameter(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setInstanceShaderParameterPtr, NIL)
  }

  public fun getInstanceShaderParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public enum class ShadowCastingSetting(
    id: Long,
  ) {
    SHADOW_CASTING_SETTING_OFF(0),
    SHADOW_CASTING_SETTING_ON(1),
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowCastingSetting = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GIMode(
    id: Long,
  ) {
    GI_MODE_DISABLED(0),
    GI_MODE_STATIC(1),
    GI_MODE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GIMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightmapScale(
    id: Long,
  ) {
    LIGHTMAP_SCALE_1X(0),
    LIGHTMAP_SCALE_2X(1),
    LIGHTMAP_SCALE_4X(2),
    LIGHTMAP_SCALE_8X(3),
    LIGHTMAP_SCALE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightmapScale = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VisibilityRangeFadeMode(
    id: Long,
  ) {
    VISIBILITY_RANGE_FADE_DISABLED(0),
    VISIBILITY_RANGE_FADE_SELF(1),
    VISIBILITY_RANGE_FADE_DEPENDENCIES(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VisibilityRangeFadeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_material_override")

    public val getMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_material_override")

    public val setMaterialOverlayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_material_overlay")

    public val getMaterialOverlayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_material_overlay")

    public val setCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_cast_shadows_setting")

    public val getCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_cast_shadows_setting")

    public val setLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_lod_bias")

    public val getLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_lod_bias")

    public val setTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_transparency")

    public val getTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_transparency")

    public val setVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_visibility_range_end_margin")

    public val getVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_visibility_range_end_margin")

    public val setVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_visibility_range_end")

    public val getVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_visibility_range_end")

    public val setVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_visibility_range_begin_margin")

    public val getVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_visibility_range_begin_margin")

    public val setVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_visibility_range_begin")

    public val getVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_visibility_range_begin")

    public val setVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_visibility_range_fade_mode")

    public val getVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_visibility_range_fade_mode")

    public val setInstanceShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_instance_shader_parameter")

    public val getInstanceShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_instance_shader_parameter")

    public val setExtraCullMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_extra_cull_margin")

    public val getExtraCullMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_extra_cull_margin")

    public val setLightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_lightmap_scale")

    public val getLightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_lightmap_scale")

    public val setGiModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_gi_mode")

    public val getGiModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_gi_mode")

    public val setIgnoreOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_ignore_occlusion_culling")

    public val isIgnoringOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "is_ignoring_occlusion_culling")

    public val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "set_custom_aabb")

    public val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GeometryInstance3D", "get_custom_aabb")
  }
}
