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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ColorPicker : VBoxContainer() {
  public val colorChanged: Signal1<Color> by signal("color")

  public val presetAdded: Signal1<Color> by signal("color")

  public val presetRemoved: Signal1<Color> by signal("color")

  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPickColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickColorPtr, NIL)
    }

  public var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditingAlphaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditAlphaPtr, NIL)
    }

  public var colorMode: ColorModeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorModePtr, LONG)
      return ColorPicker.ColorModeType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorModePtr, NIL)
    }

  public var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeferredModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeferredModePtr, NIL)
    }

  public var pickerShape: PickerShapeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPickerShapePtr, LONG)
      return ColorPicker.PickerShapeType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickerShapePtr, NIL)
    }

  public var canAddSwatches: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areSwatchesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanAddSwatchesPtr, NIL)
    }

  public var samplerVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSamplerVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplerVisiblePtr, NIL)
    }

  public var colorModesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areModesVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModesVisiblePtr, NIL)
    }

  public var slidersVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areSlidersVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSlidersVisiblePtr, NIL)
    }

  public var hexVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHexVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHexVisiblePtr, NIL)
    }

  public var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.arePresetsVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPresetsVisiblePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLORPICKER, scriptIndex)
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
   * val myCoreType = colorpicker.color
   * //Your changes
   * colorpicker.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public fun addPreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addPresetPtr, NIL)
  }

  public fun erasePreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.erasePresetPtr, NIL)
  }

  public fun getPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  public fun addRecentPreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addRecentPresetPtr, NIL)
  }

  public fun eraseRecentPreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseRecentPresetPtr, NIL)
  }

  public fun getRecentPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRecentPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  public enum class ColorModeType(
    id: Long,
  ) {
    MODE_RGB(0),
    MODE_HSV(1),
    MODE_RAW(2),
    MODE_OKHSL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorModeType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PickerShapeType(
    id: Long,
  ) {
    SHAPE_HSV_RECTANGLE(0),
    SHAPE_HSV_WHEEL(1),
    SHAPE_VHS_CIRCLE(2),
    SHAPE_OKHSL_CIRCLE(3),
    SHAPE_NONE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PickerShapeType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_pick_color")

    public val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_pick_color")

    public val setDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_deferred_mode")

    public val isDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_deferred_mode")

    public val setColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_color_mode")

    public val getColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_color_mode")

    public val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_edit_alpha")

    public val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_editing_alpha")

    public val setCanAddSwatchesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_can_add_swatches")

    public val areSwatchesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_swatches_enabled")

    public val setPresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_presets_visible")

    public val arePresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_presets_visible")

    public val setModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_modes_visible")

    public val areModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_modes_visible")

    public val setSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sampler_visible")

    public val isSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_sampler_visible")

    public val setSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sliders_visible")

    public val areSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_sliders_visible")

    public val setHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_hex_visible")

    public val isHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_hex_visible")

    public val addPresetPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "add_preset")

    public val erasePresetPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "erase_preset")

    public val getPresetsPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "get_presets")

    public val addRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "add_recent_preset")

    public val eraseRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "erase_recent_preset")

    public val getRecentPresetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_recent_presets")

    public val setPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_picker_shape")

    public val getPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_picker_shape")
  }
}
