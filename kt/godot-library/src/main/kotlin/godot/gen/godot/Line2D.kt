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
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Line2D : Node2D() {
  public var points: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointsPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPointsPtr, NIL)
    }

  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var widthCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var defaultColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultColorPtr, NIL)
    }

  public var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
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

  public var textureMode: LineTextureMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureModePtr, LONG)
      return Line2D.LineTextureMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureModePtr, NIL)
    }

  public var jointMode: LineJointMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointModePtr, LONG)
      return Line2D.LineJointMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointModePtr, NIL)
    }

  public var beginCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBeginCapModePtr, LONG)
      return Line2D.LineCapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBeginCapModePtr, NIL)
    }

  public var endCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEndCapModePtr, LONG)
      return Line2D.LineCapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEndCapModePtr, NIL)
    }

  public var sharpLimit: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSharpLimitPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSharpLimitPtr, NIL)
    }

  public var roundPrecision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRoundPrecisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRoundPrecisionPtr, NIL)
    }

  public var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAntialiasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntialiasedPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LINE2D, scriptIndex)
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
   * val myCoreType = line2d.defaultColor
   * //Your changes
   * line2d.defaultColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun defaultColorMutate(block: Color.() -> Unit): Color = defaultColor.apply{
      block(this)
      defaultColor = this
  }


  public fun setPointPosition(index: Int, position: Vector2) {
    TransferContext.writeArguments(LONG to index.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  public fun getPointPosition(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addPoint(position: Vector2, index: Int = -1) {
    TransferContext.writeArguments(VECTOR2 to position, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  public fun removePoint(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  public fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  public enum class LineJointMode(
    id: Long,
  ) {
    LINE_JOINT_SHARP(0),
    LINE_JOINT_BEVEL(1),
    LINE_JOINT_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineJointMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LineCapMode(
    id: Long,
  ) {
    LINE_CAP_NONE(0),
    LINE_CAP_BOX(1),
    LINE_CAP_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineCapMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LineTextureMode(
    id: Long,
  ) {
    LINE_TEXTURE_NONE(0),
    LINE_TEXTURE_TILE(1),
    LINE_TEXTURE_STRETCH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineTextureMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_points")

    public val getPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_points")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_point_position")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_point_position")

    public val getPointCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_point_count")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "add_point")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "remove_point")

    public val clearPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "clear_points")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_width")

    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_curve")

    public val setDefaultColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_default_color")

    public val getDefaultColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_default_color")

    public val setGradientPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_gradient")

    public val getGradientPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_gradient")

    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_texture")

    public val setTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_texture_mode")

    public val getTextureModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_texture_mode")

    public val setJointModePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_joint_mode")

    public val getJointModePtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_joint_mode")

    public val setBeginCapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_begin_cap_mode")

    public val getBeginCapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_begin_cap_mode")

    public val setEndCapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_end_cap_mode")

    public val getEndCapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_end_cap_mode")

    public val setSharpLimitPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "set_sharp_limit")

    public val getSharpLimitPtr: VoidPtr = TypeManager.getMethodBindPtr("Line2D", "get_sharp_limit")

    public val setRoundPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_round_precision")

    public val getRoundPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_round_precision")

    public val setAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "set_antialiased")

    public val getAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Line2D", "get_antialiased")
  }
}
