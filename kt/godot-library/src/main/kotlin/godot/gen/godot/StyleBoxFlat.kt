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
public open class StyleBoxFlat : StyleBox() {
  @CoreTypeLocalCopy
  public var bgColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBgColorPtr, NIL)
    }

  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawCenterEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawCenterPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var skew: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkewPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkewPtr, NIL)
    }

  public var borderWidthLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  public var borderWidthTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  public var borderWidthRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  public var borderWidthBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
    }

  public var borderBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderBlendPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderBlendPtr, NIL)
    }

  public var cornerRadiusTopLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  public var cornerRadiusTopRight: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  public var cornerRadiusBottomRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  public var cornerRadiusBottomLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerRadiusPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusPtr, NIL)
    }

  public var cornerDetail: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCornerDetailPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCornerDetailPtr, NIL)
    }

  public var expandMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  public var expandMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  public var expandMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  public var expandMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowColorPtr, NIL)
    }

  public var shadowSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowOffsetPtr, NIL)
    }

  public var antiAliasing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAntiAliasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntiAliasedPtr, NIL)
    }

  public var antiAliasingSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAaSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAaSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXFLAT, scriptIndex)
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
   * val myCoreType = styleboxflat.bgColor
   * //Your changes
   * styleboxflat.bgColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bgColorMutate(block: Color.() -> Unit): Color = bgColor.apply{
      block(this)
      bgColor = this
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
   * val myCoreType = styleboxflat.skew
   * //Your changes
   * styleboxflat.skew = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun skewMutate(block: Vector2.() -> Unit): Vector2 = skew.apply{
      block(this)
      skew = this
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
   * val myCoreType = styleboxflat.borderColor
   * //Your changes
   * styleboxflat.borderColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun borderColorMutate(block: Color.() -> Unit): Color = borderColor.apply{
      block(this)
      borderColor = this
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
   * val myCoreType = styleboxflat.shadowColor
   * //Your changes
   * styleboxflat.shadowColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
      block(this)
      shadowColor = this
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
   * val myCoreType = styleboxflat.shadowOffset
   * //Your changes
   * styleboxflat.shadowOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun shadowOffsetMutate(block: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      block(this)
      shadowOffset = this
  }


  public fun setBorderWidthAll(width: Int) {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthAllPtr, NIL)
  }

  public fun getBorderWidthMin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthMinPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setCornerRadiusAll(radius: Int) {
    TransferContext.writeArguments(LONG to radius.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCornerRadiusAllPtr, NIL)
  }

  public fun setExpandMarginAll(size: Float) {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginAllPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_bg_color")

    public val getBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_bg_color")

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_color")

    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_color")

    public val setBorderWidthAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_width_all")

    public val getBorderWidthMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_width_min")

    public val setBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_width")

    public val getBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_width")

    public val setBorderBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_border_blend")

    public val getBorderBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_border_blend")

    public val setCornerRadiusAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_radius_all")

    public val setCornerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_radius")

    public val getCornerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_corner_radius")

    public val setExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_expand_margin")

    public val setExpandMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_expand_margin_all")

    public val getExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_expand_margin")

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_draw_center")

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "is_draw_center_enabled")

    public val setSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_skew")

    public val getSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_skew")

    public val setShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_color")

    public val getShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_color")

    public val setShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_size")

    public val getShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_size")

    public val setShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_shadow_offset")

    public val getShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_shadow_offset")

    public val setAntiAliasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_anti_aliased")

    public val isAntiAliasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "is_anti_aliased")

    public val setAaSizePtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "set_aa_size")

    public val getAaSizePtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxFlat", "get_aa_size")

    public val setCornerDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "set_corner_detail")

    public val getCornerDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxFlat", "get_corner_detail")
  }
}
