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
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class CanvasItem internal constructor() : Node() {
  public val draw: Signal0 by signal()

  public val visibilityChanged: Signal0 by signal()

  public val hidden: Signal0 by signal()

  public val itemRectChanged: Signal0 by signal()

  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var selfModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelfModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelfModulatePtr, NIL)
    }

  public var showBehindParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawBehindParentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawBehindParentPtr, NIL)
    }

  public var topLevel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsTopLevelPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsTopLevelPtr, NIL)
    }

  public var clipChildren: ClipChildrenMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClipChildrenModePtr, LONG)
      return CanvasItem.ClipChildrenMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipChildrenModePtr, NIL)
    }

  public var lightMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLightMaskPtr, NIL)
    }

  public var visibilityLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityLayerPtr, NIL)
    }

  public var zIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setZIndexPtr, NIL)
    }

  public var zAsRelative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isZRelativePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setZAsRelativePtr, NIL)
    }

  public var ySortEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isYSortEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setYSortEnabledPtr, NIL)
    }

  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return CanvasItem.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  public var textureRepeat: TextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRepeatPtr, LONG)
      return CanvasItem.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRepeatPtr, NIL)
    }

  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  public var useParentMaterial: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseParentMaterialPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseParentMaterialPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASITEM, scriptIndex)
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
   * val myCoreType = canvasitem.modulate
   * //Your changes
   * canvasitem.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
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
   * val myCoreType = canvasitem.selfModulate
   * //Your changes
   * canvasitem.selfModulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun selfModulateMutate(block: Color.() -> Unit): Color = selfModulate.apply{
      block(this)
      selfModulate = this
  }


  public open fun _draw() {
  }

  public fun getCanvasItem(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasItemPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  public fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  public fun queueRedraw() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queueRedrawPtr, NIL)
  }

  public fun moveToFront() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveToFrontPtr, NIL)
  }

  @JvmOverloads
  public fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLinePtr, NIL)
  }

  @JvmOverloads
  public fun drawDashedLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    dash: Float = 2.0f,
    aligned: Boolean = true,
  ) {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), DOUBLE to dash.toDouble(), BOOL to aligned)
    TransferContext.callMethod(rawPtr, MethodBindings.drawDashedLinePtr, NIL)
  }

  @JvmOverloads
  public fun drawPolyline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPolylinePtr, NIL)
  }

  @JvmOverloads
  public fun drawPolylineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPolylineColorsPtr, NIL)
  }

  @JvmOverloads
  public fun drawArc(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    pointCount: Int,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(VECTOR2 to center, DOUBLE to radius.toDouble(), DOUBLE to startAngle.toDouble(), DOUBLE to endAngle.toDouble(), LONG to pointCount.toLong(), COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.drawArcPtr, NIL)
  }

  @JvmOverloads
  public fun drawMultiline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilinePtr, NIL)
  }

  @JvmOverloads
  public fun drawMultilineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineColorsPtr, NIL)
  }

  @JvmOverloads
  public fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Float = -1.0f,
  ) {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color, BOOL to filled, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.drawRectPtr, NIL)
  }

  public fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color,
  ) {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to radius.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCirclePtr, NIL)
  }

  @JvmOverloads
  public fun drawTexture(
    texture: Texture2D,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2 to position, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawTexturePtr, NIL)
  }

  @JvmOverloads
  public fun drawTextureRect(
    texture: Texture2D,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.drawTextureRectPtr, NIL)
  }

  @JvmOverloads
  public fun drawTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, MethodBindings.drawTextureRectRegionPtr, NIL)
  }

  @JvmOverloads
  public fun drawMsdfTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outline: Double = 0.0,
    pixelRange: Double = 4.0,
    scale: Double = 1.0,
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, DOUBLE to outline, DOUBLE to pixelRange, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMsdfTextureRectRegionPtr, NIL)
  }

  @JvmOverloads
  public fun drawLcdTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawLcdTextureRectRegionPtr, NIL)
  }

  public fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    TransferContext.writeArguments(OBJECT to styleBox, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStyleBoxPtr, NIL)
  }

  @JvmOverloads
  public fun drawPrimitive(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: Texture2D? = null,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPrimitivePtr, NIL)
  }

  @JvmOverloads
  public fun drawPolygon(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPolygonPtr, NIL)
  }

  @JvmOverloads
  public fun drawColoredPolygon(
    points: PackedVector2Array,
    color: Color,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.drawColoredPolygonPtr, NIL)
  }

  @JvmOverloads
  public fun drawString(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringPtr, NIL)
  }

  @JvmOverloads
  public fun drawMultilineString(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringPtr, NIL)
  }

  @JvmOverloads
  public fun drawStringOutline(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawStringOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawMultilineStringOutline(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlagValue(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(3),
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultilineStringOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawChar(
    font: Font,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharPtr, NIL)
  }

  @JvmOverloads
  public fun drawCharOutline(
    font: Font,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCharOutlinePtr, NIL)
  }

  @JvmOverloads
  public fun drawMesh(
    mesh: Mesh,
    texture: Texture2D,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to texture, TRANSFORM2D to transform, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMeshPtr, NIL)
  }

  public fun drawMultimesh(multimesh: MultiMesh, texture: Texture2D) {
    TransferContext.writeArguments(OBJECT to multimesh, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.drawMultimeshPtr, NIL)
  }

  @JvmOverloads
  public fun drawSetTransform(
    position: Vector2,
    rotation: Float = 0.0f,
    scale: Vector2 = Vector2(1, 1),
  ) {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to rotation.toDouble(), VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.drawSetTransformPtr, NIL)
  }

  public fun drawSetTransformMatrix(xform: Transform2D) {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.drawSetTransformMatrixPtr, NIL)
  }

  @JvmOverloads
  public fun drawAnimationSlice(
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0,
  ) {
    TransferContext.writeArguments(DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.drawAnimationSlicePtr, NIL)
  }

  public fun drawEndAnimation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.drawEndAnimationPtr, NIL)
  }

  public fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getGlobalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getGlobalTransformWithCanvas(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalTransformWithCanvasPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getViewportTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewportTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getViewportRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewportRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getCanvasTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getLocalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getGlobalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorld2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
  }

  public fun setNotifyLocalTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  public fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setNotifyTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  public fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun forceUpdateTransform() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  public fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.makeCanvasPositionLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun makeInputLocal(event: InputEvent): InputEvent? {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.makeInputLocalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as InputEvent?)
  }

  public fun setVisibilityLayerBit(layer: Long, enabled: Boolean) {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityLayerBitPtr, NIL)
  }

  public fun getVisibilityLayerBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityLayerBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    TEXTURE_FILTER_PARENT_NODE(0),
    TEXTURE_FILTER_NEAREST(1),
    TEXTURE_FILTER_LINEAR(2),
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(4),
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    TEXTURE_FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureRepeat(
    id: Long,
  ) {
    TEXTURE_REPEAT_PARENT_NODE(0),
    TEXTURE_REPEAT_DISABLED(1),
    TEXTURE_REPEAT_ENABLED(2),
    TEXTURE_REPEAT_MIRROR(3),
    TEXTURE_REPEAT_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureRepeat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ClipChildrenMode(
    id: Long,
  ) {
    CLIP_CHILDREN_DISABLED(0),
    CLIP_CHILDREN_ONLY(1),
    CLIP_CHILDREN_AND_DRAW(2),
    CLIP_CHILDREN_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ClipChildrenMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 35

    public final const val NOTIFICATION_DRAW: Long = 30

    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31

    public final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    public final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    public final const val NOTIFICATION_WORLD_2D_CHANGED: Long = 36
  }

  internal object MethodBindings {
    public val _drawPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "_draw")

    public val getCanvasItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas_item")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "is_visible")

    public val isVisibleInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_visible_in_tree")

    public val showPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "show")

    public val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "hide")

    public val queueRedrawPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "queue_redraw")

    public val moveToFrontPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "move_to_front")

    public val setAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_as_top_level")

    public val isSetAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_set_as_top_level")

    public val setLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_light_mask")

    public val getLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_light_mask")

    public val setModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "set_modulate")

    public val getModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "get_modulate")

    public val setSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_self_modulate")

    public val getSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_self_modulate")

    public val setZIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "set_z_index")

    public val getZIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "get_z_index")

    public val setZAsRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_z_as_relative")

    public val isZRelativePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "is_z_relative")

    public val setYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_y_sort_enabled")

    public val isYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_y_sort_enabled")

    public val setDrawBehindParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_draw_behind_parent")

    public val isDrawBehindParentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_draw_behind_parent_enabled")

    public val drawLinePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_line")

    public val drawDashedLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_dashed_line")

    public val drawPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_polyline")

    public val drawPolylineColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_polyline_colors")

    public val drawArcPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_arc")

    public val drawMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline")

    public val drawMultilineColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_colors")

    public val drawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_rect")

    public val drawCirclePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_circle")

    public val drawTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_texture")

    public val drawTextureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_texture_rect")

    public val drawTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_texture_rect_region")

    public val drawMsdfTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_msdf_texture_rect_region")

    public val drawLcdTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_lcd_texture_rect_region")

    public val drawStyleBoxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_style_box")

    public val drawPrimitivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_primitive")

    public val drawPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_polygon")

    public val drawColoredPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_colored_polygon")

    public val drawStringPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_string")

    public val drawMultilineStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_string")

    public val drawStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_string_outline")

    public val drawMultilineStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_string_outline")

    public val drawCharPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_char")

    public val drawCharOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_char_outline")

    public val drawMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "draw_mesh")

    public val drawMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multimesh")

    public val drawSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_set_transform")

    public val drawSetTransformMatrixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_set_transform_matrix")

    public val drawAnimationSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_animation_slice")

    public val drawEndAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_end_animation")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_transform")

    public val getGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_transform")

    public val getGlobalTransformWithCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_transform_with_canvas")

    public val getViewportTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_viewport_transform")

    public val getViewportRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_viewport_rect")

    public val getCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas_transform")

    public val getScreenTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_screen_transform")

    public val getLocalMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_local_mouse_position")

    public val getGlobalMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_mouse_position")

    public val getCanvasPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "get_canvas")

    public val getWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "get_world_2d")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "set_material")

    public val getMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "get_material")

    public val setUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_use_parent_material")

    public val getUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_use_parent_material")

    public val setNotifyLocalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_notify_local_transform")

    public val isLocalTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_local_transform_notification_enabled")

    public val setNotifyTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_notify_transform")

    public val isTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_transform_notification_enabled")

    public val forceUpdateTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "force_update_transform")

    public val makeCanvasPositionLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "make_canvas_position_local")

    public val makeInputLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "make_input_local")

    public val setVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_visibility_layer")

    public val getVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_visibility_layer")

    public val setVisibilityLayerBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_visibility_layer_bit")

    public val getVisibilityLayerBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_visibility_layer_bit")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_texture_filter")

    public val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_texture_repeat")

    public val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_texture_repeat")

    public val setClipChildrenModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_clip_children_mode")

    public val getClipChildrenModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_clip_children_mode")
  }
}
