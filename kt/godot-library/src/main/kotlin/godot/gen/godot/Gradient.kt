// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class Gradient : Resource() {
  public var interpolationMode: InterpolationMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationModePtr, LONG)
      return Gradient.InterpolationMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationModePtr, NIL)
    }

  public var interpolationColorSpace: ColorSpace
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationColorSpacePtr, LONG)
      return Gradient.ColorSpace.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationColorSpacePtr, NIL)
    }

  public var offsets: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetsPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetsPtr, NIL)
    }

  public var colors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorsPtr, PACKED_COLOR_ARRAY)
      return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENT, scriptIndex)
    return true
  }

  public fun addPoint(offset: Float, color: Color) {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  public fun removePoint(point: Int) {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun setOffset(point: Int, offset: Float) {
    TransferContext.writeArguments(LONG to point.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public fun getOffset(point: Int): Float {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun reverse() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reversePtr, NIL)
  }

  public fun setColor(point: Int, color: Color) {
    TransferContext.writeArguments(LONG to point.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public fun getColor(point: Int): Color {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun sample(offset: Float): Color {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class InterpolationMode(
    id: Long,
  ) {
    GRADIENT_INTERPOLATE_LINEAR(0),
    GRADIENT_INTERPOLATE_CONSTANT(1),
    GRADIENT_INTERPOLATE_CUBIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InterpolationMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ColorSpace(
    id: Long,
  ) {
    GRADIENT_COLOR_SPACE_SRGB(0),
    GRADIENT_COLOR_SPACE_LINEAR_SRGB(1),
    GRADIENT_COLOR_SPACE_OKLAB(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorSpace = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "add_point")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "remove_point")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_offset")

    public val reversePtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "reverse")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_color")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "sample")

    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_point_count")

    public val setOffsetsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_offsets")

    public val getOffsetsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_offsets")

    public val setColorsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_colors")

    public val getColorsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_colors")

    public val setInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "set_interpolation_mode")

    public val getInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_interpolation_mode")

    public val setInterpolationColorSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "set_interpolation_color_space")

    public val getInterpolationColorSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_interpolation_color_space")
  }
}
