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
public open class TextureProgressBar : Range() {
  public var fillMode: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillModePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFillModePtr, NIL)
    }

  public var ninePatchStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNinePatchStretchPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNinePatchStretchPtr, NIL)
    }

  public var stretchMarginLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  public var stretchMarginTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  public var stretchMarginRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  public var stretchMarginBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchMarginPtr, NIL)
    }

  public var textureUnder: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnderTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnderTexturePtr, NIL)
    }

  public var textureOver: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOverTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverTexturePtr, NIL)
    }

  public var textureProgress: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var textureProgressOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureProgressOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureProgressOffsetPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var tintUnder: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintUnderPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintUnderPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var tintOver: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintOverPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintOverPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var tintProgress: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintProgressPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintProgressPtr, NIL)
    }

  public var radialInitialAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialInitialAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialInitialAnglePtr, NIL)
    }

  public var radialFillDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFillDegreesPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var radialCenterOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialCenterOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialCenterOffsetPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTUREPROGRESSBAR, scriptIndex)
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
   * val myCoreType = textureprogressbar.textureProgressOffset
   * //Your changes
   * textureprogressbar.textureProgressOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun textureProgressOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      textureProgressOffset.apply{
      block(this)
      textureProgressOffset = this
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
   * val myCoreType = textureprogressbar.tintUnder
   * //Your changes
   * textureprogressbar.tintUnder = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintUnderMutate(block: Color.() -> Unit): Color = tintUnder.apply{
      block(this)
      tintUnder = this
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
   * val myCoreType = textureprogressbar.tintOver
   * //Your changes
   * textureprogressbar.tintOver = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintOverMutate(block: Color.() -> Unit): Color = tintOver.apply{
      block(this)
      tintOver = this
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
   * val myCoreType = textureprogressbar.tintProgress
   * //Your changes
   * textureprogressbar.tintProgress = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintProgressMutate(block: Color.() -> Unit): Color = tintProgress.apply{
      block(this)
      tintProgress = this
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
   * val myCoreType = textureprogressbar.radialCenterOffset
   * //Your changes
   * textureprogressbar.radialCenterOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun radialCenterOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      radialCenterOffset.apply{
      block(this)
      radialCenterOffset = this
  }


  public enum class FillMode(
    id: Long,
  ) {
    FILL_LEFT_TO_RIGHT(0),
    FILL_RIGHT_TO_LEFT(1),
    FILL_TOP_TO_BOTTOM(2),
    FILL_BOTTOM_TO_TOP(3),
    FILL_CLOCKWISE(4),
    FILL_COUNTER_CLOCKWISE(5),
    FILL_BILINEAR_LEFT_AND_RIGHT(6),
    FILL_BILINEAR_TOP_AND_BOTTOM(7),
    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FillMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setUnderTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_under_texture")

    public val getUnderTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_under_texture")

    public val setProgressTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_progress_texture")

    public val getProgressTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_progress_texture")

    public val setOverTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_over_texture")

    public val getOverTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_over_texture")

    public val setFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_fill_mode")

    public val getFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_fill_mode")

    public val setTintUnderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_under")

    public val getTintUnderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_under")

    public val setTintProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_progress")

    public val getTintProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_progress")

    public val setTintOverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_tint_over")

    public val getTintOverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_tint_over")

    public val setTextureProgressOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_texture_progress_offset")

    public val getTextureProgressOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_texture_progress_offset")

    public val setRadialInitialAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_radial_initial_angle")

    public val getRadialInitialAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_radial_initial_angle")

    public val setRadialCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_radial_center_offset")

    public val getRadialCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_radial_center_offset")

    public val setFillDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_fill_degrees")

    public val getFillDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_fill_degrees")

    public val setStretchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_stretch_margin")

    public val getStretchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_stretch_margin")

    public val setNinePatchStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "set_nine_patch_stretch")

    public val getNinePatchStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureProgressBar", "get_nine_patch_stretch")
  }
}
