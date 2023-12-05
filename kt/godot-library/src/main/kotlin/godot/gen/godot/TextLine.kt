// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TextLine : RefCounted() {
  public var direction: TextServer.Direction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  public var orientation: TextServer.Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
      return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
    }

  public var preserveInvalid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveInvalidPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveInvalidPtr, NIL)
    }

  public var preserveControl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveControlPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveControlPtr, NIL)
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

  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  public var flags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagsPtr, NIL)
    }

  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTLINE, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun setBidiOverride(`override`: VariantArray<Any?>) {
    TransferContext.writeArguments(ARRAY to override)
    TransferContext.callMethod(rawPtr, MethodBindings.setBidiOverridePtr, NIL)
  }

  @JvmOverloads
  public fun addString(
    text: String,
    font: Font,
    fontSize: Int,
    language: String = "",
    meta: Any? = null,
  ): Boolean {
    TransferContext.writeArguments(STRING to text, OBJECT to font, LONG to fontSize.toLong(), STRING to language, ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.addStringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Int = 1,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length.toLong(), DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun resizeObject(
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Float = 0.0f,
  ): Boolean {
    TransferContext.writeArguments(ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.resizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun tabAlign(tabStops: PackedFloat32Array) {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.tabAlignPtr, NIL)
  }

  public fun getObjects(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getObjectRect(key: Any?): Rect2 {
    TransferContext.writeArguments(ANY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getLineAscent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineDescent(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineUnderlinePosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLineUnderlineThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun draw(
    canvas: RID,
    pos: Vector2,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  @JvmOverloads
  public fun drawOutline(
    canvas: RID,
    pos: Vector2,
    outlineSize: Int = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to canvas, VECTOR2 to pos, LONG to outlineSize.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawOutlinePtr, NIL)
  }

  public fun hitTest(coords: Float): Int {
    TransferContext.writeArguments(DOUBLE to coords.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.hitTestPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "clear")

    public val setDirectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_direction")

    public val getDirectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_direction")

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_orientation")

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_orientation")

    public val setPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_invalid")

    public val getPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_invalid")

    public val setPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_preserve_control")

    public val getPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_preserve_control")

    public val setBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_bidi_override")

    public val addStringPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "add_string")

    public val addObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "add_object")

    public val resizeObjectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "resize_object")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_width")

    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_horizontal_alignment")

    public val tabAlignPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "tab_align")

    public val setFlagsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "set_flags")

    public val getFlagsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_flags")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_text_overrun_behavior")

    public val getObjectsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_objects")

    public val getObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_object_rect")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_size")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_rid")

    public val getLineAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_ascent")

    public val getLineDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_descent")

    public val getLineWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "get_line_width")

    public val getLineUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_position")

    public val getLineUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextLine", "get_line_underline_thickness")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "draw")

    public val drawOutlinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "draw_outline")

    public val hitTestPtr: VoidPtr = TypeManager.getMethodBindPtr("TextLine", "hit_test")
  }
}
