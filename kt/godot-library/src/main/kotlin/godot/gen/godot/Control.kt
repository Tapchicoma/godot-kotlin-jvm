// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control.SizeFlags
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Control : CanvasItem() {
  public val resized: Signal0 by signal()

  public val guiInput: Signal1<InputEvent> by signal("event")

  public val mouseEntered: Signal0 by signal()

  public val mouseExited: Signal0 by signal()

  public val focusEntered: Signal0 by signal()

  public val focusExited: Signal0 by signal()

  public val sizeFlagsChanged: Signal0 by signal()

  public val minimumSizeChanged: Signal0 by signal()

  public val themeChanged: Signal0 by signal()

  public var clipContents: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClippingContentsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipContentsPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var customMinimumSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomMinimumSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomMinimumSizePtr, NIL)
    }

  public var layoutDirection: LayoutDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayoutDirectionPtr, LONG)
      return Control.LayoutDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLayoutDirectionPtr, NIL)
    }

  public val anchorLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val anchorTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val anchorRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public val anchorBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }

  public var offsetLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var offsetTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var offsetRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var offsetBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var growHorizontal: GrowDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHGrowDirectionPtr, LONG)
      return Control.GrowDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHGrowDirectionPtr, NIL)
    }

  public var growVertical: GrowDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVGrowDirectionPtr, LONG)
      return Control.GrowDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVGrowDirectionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public val size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  @CoreTypeLocalCopy
  public val position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  @CoreTypeLocalCopy
  public val globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }

  public var rotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  public var rotationDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var pivotOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPivotOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPivotOffsetPtr, NIL)
    }

  public var sizeFlagsHorizontal: SizeFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHSizeFlagsPtr, LONG)
      return godot.Control.SizeFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setHSizeFlagsPtr, NIL)
    }

  public var sizeFlagsVertical: SizeFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVSizeFlagsPtr, LONG)
      return godot.Control.SizeFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setVSizeFlagsPtr, NIL)
    }

  public var sizeFlagsStretchRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchRatioPtr, NIL)
    }

  public var autoTranslate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoTranslatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoTranslatePtr, NIL)
    }

  public var localizeNumeralSystem: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLocalizingNumeralSystemPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocalizeNumeralSystemPtr, NIL)
    }

  public var tooltipText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTooltipTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTooltipTextPtr, NIL)
    }

  public var focusNeighborLeft: NodePath
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusNeighborPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusNeighborPtr, NIL)
    }

  public var focusNeighborTop: NodePath
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusNeighborPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusNeighborPtr, NIL)
    }

  public var focusNeighborRight: NodePath
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusNeighborPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusNeighborPtr, NIL)
    }

  public var focusNeighborBottom: NodePath
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusNeighborPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusNeighborPtr, NIL)
    }

  public var focusNext: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusNextPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusNextPtr, NIL)
    }

  public var focusPrevious: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusPreviousPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusPreviousPtr, NIL)
    }

  public var focusMode: FocusMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFocusModePtr, LONG)
      return Control.FocusMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFocusModePtr, NIL)
    }

  public var mouseFilter: MouseFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMouseFilterPtr, LONG)
      return Control.MouseFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMouseFilterPtr, NIL)
    }

  public var mouseForcePassScrollEvents: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isForcePassScrollEventsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setForcePassScrollEventsPtr, NIL)
    }

  public var mouseDefaultCursorShape: CursorShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCursorShapePtr, LONG)
      return Control.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCursorShapePtr, NIL)
    }

  public var shortcutContext: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShortcutContextPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutContextPtr, NIL)
    }

  public var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThemePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Theme?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThemePtr, NIL)
    }

  public var themeTypeVariation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThemeTypeVariationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThemeTypeVariationPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONTROL, scriptIndex)
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
   * val myCoreType = control.customMinimumSize
   * //Your changes
   * control.customMinimumSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customMinimumSizeMutate(block: Vector2.() -> Unit): Vector2 =
      customMinimumSize.apply{
      block(this)
      customMinimumSize = this
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
   * val myCoreType = control.scale
   * //Your changes
   * control.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
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
   * val myCoreType = control.pivotOffset
   * //Your changes
   * control.pivotOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun pivotOffsetMutate(block: Vector2.() -> Unit): Vector2 = pivotOffset.apply{
      block(this)
      pivotOffset = this
  }


  public open fun _hasPoint(point: Vector2): Boolean {
    throw NotImplementedError("_has_point is not implemented for Control")
  }

  public open fun _structuredTextParser(args: VariantArray<Any?>, text: String):
      VariantArray<Vector3i> {
    throw NotImplementedError("_structured_text_parser is not implemented for Control")
  }

  public open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for Control")
  }

  public open fun _getTooltip(atPosition: Vector2): String {
    throw NotImplementedError("_get_tooltip is not implemented for Control")
  }

  public open fun _getDragData(atPosition: Vector2): Any? {
    throw NotImplementedError("_get_drag_data is not implemented for Control")
  }

  public open fun _canDropData(atPosition: Vector2, `data`: Any?): Boolean {
    throw NotImplementedError("_can_drop_data is not implemented for Control")
  }

  public open fun _dropData(atPosition: Vector2, `data`: Any?) {
  }

  public open fun _makeCustomTooltip(forText: String): Object? {
    throw NotImplementedError("_make_custom_tooltip is not implemented for Control")
  }

  public open fun _guiInput(event: InputEvent) {
  }

  public fun acceptEvent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.acceptEventPtr, NIL)
  }

  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getCombinedMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCombinedMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun setAnchorsPreset(preset: LayoutPreset, keepOffsets: Boolean = false) {
    TransferContext.writeArguments(LONG to preset.id, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorsPresetPtr, NIL)
  }

  @JvmOverloads
  public fun setOffsetsPreset(
    preset: LayoutPreset,
    resizeMode: LayoutPresetMode = Control.LayoutPresetMode.PRESET_MODE_MINSIZE,
    margin: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to preset.id, LONG to resizeMode.id, LONG to margin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetsPresetPtr, NIL)
  }

  @JvmOverloads
  public fun setAnchorsAndOffsetsPreset(
    preset: LayoutPreset,
    resizeMode: LayoutPresetMode = Control.LayoutPresetMode.PRESET_MODE_MINSIZE,
    margin: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to preset.id, LONG to resizeMode.id, LONG to margin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorsAndOffsetsPresetPtr, NIL)
  }

  @JvmOverloads
  public fun setAnchor(
    side: Side,
    anchor: Float,
    keepOffset: Boolean = false,
    pushOppositeAnchor: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to side.id, DOUBLE to anchor.toDouble(), BOOL to keepOffset, BOOL to pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorPtr, NIL)
  }

  @JvmOverloads
  public fun setAnchorAndOffset(
    side: Side,
    anchor: Float,
    offset: Float,
    pushOppositeAnchor: Boolean = false,
  ) {
    TransferContext.writeArguments(LONG to side.id, DOUBLE to anchor.toDouble(), DOUBLE to offset.toDouble(), BOOL to pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorAndOffsetPtr, NIL)
  }

  public fun setBegin(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setBeginPtr, NIL)
  }

  public fun setEnd(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setEndPtr, NIL)
  }

  @JvmOverloads
  public fun setPosition(position: Vector2, keepOffsets: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  @JvmOverloads
  public fun setSize(size: Vector2, keepOffsets: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to size, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  public fun resetSize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetSizePtr, NIL)
  }

  @JvmOverloads
  public fun setGlobalPosition(position: Vector2, keepOffsets: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public fun getBegin(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBeginPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getEnd(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEndPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getParentAreaSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentAreaSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getScreenPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getGlobalRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun grabFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.grabFocusPtr, NIL)
  }

  public fun releaseFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.releaseFocusPtr, NIL)
  }

  public fun findPrevValidFocus(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findPrevValidFocusPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Control)
  }

  public fun findNextValidFocus(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findNextValidFocusPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Control)
  }

  public fun beginBulkThemeOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginBulkThemeOverridePtr, NIL)
  }

  public fun endBulkThemeOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endBulkThemeOverridePtr, NIL)
  }

  public fun addThemeIconOverride(name: StringName, texture: Texture2D) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeIconOverridePtr, NIL)
  }

  public fun addThemeStyleboxOverride(name: StringName, stylebox: StyleBox) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeStyleboxOverridePtr, NIL)
  }

  public fun addThemeFontOverride(name: StringName, font: Font) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontOverridePtr, NIL)
  }

  public fun addThemeFontSizeOverride(name: StringName, fontSize: Int) {
    TransferContext.writeArguments(STRING_NAME to name, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontSizeOverridePtr, NIL)
  }

  public fun addThemeColorOverride(name: StringName, color: Color) {
    TransferContext.writeArguments(STRING_NAME to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeColorOverridePtr, NIL)
  }

  public fun addThemeConstantOverride(name: StringName, constant: Int) {
    TransferContext.writeArguments(STRING_NAME to name, LONG to constant.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeConstantOverridePtr, NIL)
  }

  public fun removeThemeIconOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeIconOverridePtr, NIL)
  }

  public fun removeThemeStyleboxOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeStyleboxOverridePtr, NIL)
  }

  public fun removeThemeFontOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontOverridePtr, NIL)
  }

  public fun removeThemeFontSizeOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontSizeOverridePtr, NIL)
  }

  public fun removeThemeColorOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeColorOverridePtr, NIL)
  }

  public fun removeThemeConstantOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeConstantOverridePtr, NIL)
  }

  @JvmOverloads
  public fun getThemeIcon(name: StringName, themeType: StringName = StringName("")): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  @JvmOverloads
  public fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StyleBox?)
  }

  @JvmOverloads
  public fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  @JvmOverloads
  public fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  @JvmOverloads
  public fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasThemeIconOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeStyleboxOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeFontOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeFontSizeOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizeOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeColorOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeConstantOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getThemeDefaultBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  public fun getThemeDefaultFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getParentControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Control)
  }

  @JvmOverloads
  public fun getTooltip(atPosition: Vector2 = Vector2(0, 0)): String {
    TransferContext.writeArguments(VECTOR2 to atPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getCursorShape(position: Vector2 = Vector2(0, 0)): CursorShape {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getCursorShapePtr, LONG)
    return Control.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun forceDrag(`data`: Any?, preview: Control) {
    TransferContext.writeArguments(ANY to data, OBJECT to preview)
    TransferContext.callMethod(rawPtr, MethodBindings.forceDragPtr, NIL)
  }

  public fun grabClickFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.grabClickFocusPtr, NIL)
  }

  public fun setDragForwarding(
    dragFunc: Callable,
    canDropFunc: Callable,
    dropFunc: Callable,
  ) {
    TransferContext.writeArguments(CALLABLE to dragFunc, CALLABLE to canDropFunc, CALLABLE to dropFunc)
    TransferContext.callMethod(rawPtr, MethodBindings.setDragForwardingPtr, NIL)
  }

  public fun setDragPreview(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.setDragPreviewPtr, NIL)
  }

  public fun isDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDragSuccessfulPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun warpMouse(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  public fun updateMinimumSize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateMinimumSizePtr, NIL)
  }

  public fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLayoutRtlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class FocusMode(
    id: Long,
  ) {
    FOCUS_NONE(0),
    FOCUS_CLICK(1),
    FOCUS_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FocusMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CursorShape(
    id: Long,
  ) {
    CURSOR_ARROW(0),
    CURSOR_IBEAM(1),
    CURSOR_POINTING_HAND(2),
    CURSOR_CROSS(3),
    CURSOR_WAIT(4),
    CURSOR_BUSY(5),
    CURSOR_DRAG(6),
    CURSOR_CAN_DROP(7),
    CURSOR_FORBIDDEN(8),
    CURSOR_VSIZE(9),
    CURSOR_HSIZE(10),
    CURSOR_BDIAGSIZE(11),
    CURSOR_FDIAGSIZE(12),
    CURSOR_MOVE(13),
    CURSOR_VSPLIT(14),
    CURSOR_HSPLIT(15),
    CURSOR_HELP(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CursorShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LayoutPreset(
    id: Long,
  ) {
    PRESET_TOP_LEFT(0),
    PRESET_TOP_RIGHT(1),
    PRESET_BOTTOM_LEFT(2),
    PRESET_BOTTOM_RIGHT(3),
    PRESET_CENTER_LEFT(4),
    PRESET_CENTER_TOP(5),
    PRESET_CENTER_RIGHT(6),
    PRESET_CENTER_BOTTOM(7),
    PRESET_CENTER(8),
    PRESET_LEFT_WIDE(9),
    PRESET_TOP_WIDE(10),
    PRESET_RIGHT_WIDE(11),
    PRESET_BOTTOM_WIDE(12),
    PRESET_VCENTER_WIDE(13),
    PRESET_HCENTER_WIDE(14),
    PRESET_FULL_RECT(15),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutPreset = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LayoutPresetMode(
    id: Long,
  ) {
    PRESET_MODE_MINSIZE(0),
    PRESET_MODE_KEEP_WIDTH(1),
    PRESET_MODE_KEEP_HEIGHT(2),
    PRESET_MODE_KEEP_SIZE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutPresetMode = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface SizeFlags {
    public val flag: Long

    public infix fun or(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.Control.SizeFlags = SizeFlagsValue(flag.or(other))

    public infix fun xor(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.Control.SizeFlags = SizeFlagsValue(flag.xor(other))

    public infix fun and(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.Control.SizeFlags = SizeFlagsValue(flag.and(other))

    public operator fun plus(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.Control.SizeFlags =
        SizeFlagsValue(flag.plus(other))

    public operator fun minus(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.Control.SizeFlags =
        SizeFlagsValue(flag.minus(other))

    public operator fun times(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.Control.SizeFlags =
        SizeFlagsValue(flag.times(other))

    public operator fun div(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.Control.SizeFlags = SizeFlagsValue(flag.div(other))

    public operator fun rem(other: godot.Control.SizeFlags): godot.Control.SizeFlags =
        SizeFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.Control.SizeFlags = SizeFlagsValue(flag.rem(other))

    public fun unaryPlus(): godot.Control.SizeFlags = SizeFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): godot.Control.SizeFlags = SizeFlagsValue(flag.unaryMinus())

    public fun inv(): godot.Control.SizeFlags = SizeFlagsValue(flag.inv())

    public infix fun shl(bits: Int): godot.Control.SizeFlags = SizeFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): godot.Control.SizeFlags = SizeFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.Control.SizeFlags = SizeFlagsValue(flag ushr bits)

    public companion object {
      public val SIZE_SHRINK_BEGIN: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(0)

      public val SIZE_FILL: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(1)

      public val SIZE_EXPAND: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(2)

      public val SIZE_EXPAND_FILL: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(3)

      public val SIZE_SHRINK_CENTER: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(4)

      public val SIZE_SHRINK_END: godot.Control.SizeFlags = godot.Control.SizeFlagsValue(8)
    }
  }

  @JvmInline
  internal value class SizeFlagsValue internal constructor(
    override val flag: Long,
  ) : godot.Control.SizeFlags

  public enum class MouseFilter(
    id: Long,
  ) {
    MOUSE_FILTER_STOP(0),
    MOUSE_FILTER_PASS(1),
    MOUSE_FILTER_IGNORE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MouseFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GrowDirection(
    id: Long,
  ) {
    GROW_DIRECTION_BEGIN(0),
    GROW_DIRECTION_END(1),
    GROW_DIRECTION_BOTH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GrowDirection = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Anchor(
    id: Long,
  ) {
    ANCHOR_BEGIN(0),
    ANCHOR_END(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Anchor = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LayoutDirection(
    id: Long,
  ) {
    LAYOUT_DIRECTION_INHERITED(0),
    LAYOUT_DIRECTION_LOCALE(1),
    LAYOUT_DIRECTION_LTR(2),
    LAYOUT_DIRECTION_RTL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutDirection = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextDirection(
    id: Long,
  ) {
    TEXT_DIRECTION_INHERITED(3),
    TEXT_DIRECTION_AUTO(0),
    TEXT_DIRECTION_LTR(1),
    TEXT_DIRECTION_RTL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextDirection = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_RESIZED: Long = 40

    public final const val NOTIFICATION_MOUSE_ENTER: Long = 41

    public final const val NOTIFICATION_MOUSE_EXIT: Long = 42

    public final const val NOTIFICATION_FOCUS_ENTER: Long = 43

    public final const val NOTIFICATION_FOCUS_EXIT: Long = 44

    public final const val NOTIFICATION_THEME_CHANGED: Long = 45

    public final const val NOTIFICATION_SCROLL_BEGIN: Long = 47

    public final const val NOTIFICATION_SCROLL_END: Long = 48

    public final const val NOTIFICATION_LAYOUT_DIRECTION_CHANGED: Long = 49
  }

  internal object MethodBindings {
    public val _hasPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_has_point")

    public val _structuredTextParserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "_structured_text_parser")

    public val _getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "_get_minimum_size")

    public val _getTooltipPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_get_tooltip")

    public val _getDragDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_get_drag_data")

    public val _canDropDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_can_drop_data")

    public val _dropDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_drop_data")

    public val _makeCustomTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "_make_custom_tooltip")

    public val _guiInputPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "_gui_input")

    public val acceptEventPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "accept_event")

    public val getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_minimum_size")

    public val getCombinedMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_combined_minimum_size")

    public val setAnchorsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchors_preset")

    public val setOffsetsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_offsets_preset")

    public val setAnchorsAndOffsetsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchors_and_offsets_preset")

    public val setAnchorPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_anchor")

    public val getAnchorPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_anchor")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_offset")

    public val setAnchorAndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchor_and_offset")

    public val setBeginPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_begin")

    public val setEndPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_end")

    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_position")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_size")

    public val resetSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "reset_size")

    public val setCustomMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_custom_minimum_size")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_global_position")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_rotation")

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_rotation_degrees")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_scale")

    public val setPivotOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_pivot_offset")

    public val getBeginPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_begin")

    public val getEndPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_end")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_position")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_size")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_rotation")

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_rotation_degrees")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_scale")

    public val getPivotOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_pivot_offset")

    public val getCustomMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_custom_minimum_size")

    public val getParentAreaSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_parent_area_size")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_global_position")

    public val getScreenPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_screen_position")

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_rect")

    public val getGlobalRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_global_rect")

    public val setFocusModePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_focus_mode")

    public val getFocusModePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_focus_mode")

    public val hasFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "has_focus")

    public val grabFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "grab_focus")

    public val releaseFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "release_focus")

    public val findPrevValidFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "find_prev_valid_focus")

    public val findNextValidFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "find_next_valid_focus")

    public val setHSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_h_size_flags")

    public val getHSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_h_size_flags")

    public val setStretchRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_stretch_ratio")

    public val getStretchRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_stretch_ratio")

    public val setVSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_v_size_flags")

    public val getVSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_v_size_flags")

    public val setThemePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_theme")

    public val getThemePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_theme")

    public val setThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_theme_type_variation")

    public val getThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_type_variation")

    public val beginBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "begin_bulk_theme_override")

    public val endBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "end_bulk_theme_override")

    public val addThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_icon_override")

    public val addThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_stylebox_override")

    public val addThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_font_override")

    public val addThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_font_size_override")

    public val addThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_color_override")

    public val addThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_constant_override")

    public val removeThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_icon_override")

    public val removeThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_stylebox_override")

    public val removeThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_font_override")

    public val removeThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_font_size_override")

    public val removeThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_color_override")

    public val removeThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_constant_override")

    public val getThemeIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_theme_icon")

    public val getThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_stylebox")

    public val getThemeFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_theme_font")

    public val getThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_font_size")

    public val getThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_color")

    public val getThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_constant")

    public val hasThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_icon_override")

    public val hasThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_stylebox_override")

    public val hasThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_override")

    public val hasThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_size_override")

    public val hasThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_color_override")

    public val hasThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_constant_override")

    public val hasThemeIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "has_theme_icon")

    public val hasThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_stylebox")

    public val hasThemeFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "has_theme_font")

    public val hasThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_size")

    public val hasThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_color")

    public val hasThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_constant")

    public val getThemeDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_base_scale")

    public val getThemeDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_font")

    public val getThemeDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_font_size")

    public val getParentControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_parent_control")

    public val setHGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_h_grow_direction")

    public val getHGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_h_grow_direction")

    public val setVGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_v_grow_direction")

    public val getVGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_v_grow_direction")

    public val setTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_tooltip_text")

    public val getTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_tooltip_text")

    public val getTooltipPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_tooltip")

    public val setDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_default_cursor_shape")

    public val getDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_default_cursor_shape")

    public val getCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_cursor_shape")

    public val setFocusNeighborPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_neighbor")

    public val getFocusNeighborPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_neighbor")

    public val setFocusNextPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_focus_next")

    public val getFocusNextPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_focus_next")

    public val setFocusPreviousPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_previous")

    public val getFocusPreviousPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_previous")

    public val forceDragPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "force_drag")

    public val setMouseFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_mouse_filter")

    public val getMouseFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_mouse_filter")

    public val setForcePassScrollEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_force_pass_scroll_events")

    public val isForcePassScrollEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_force_pass_scroll_events")

    public val setClipContentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_clip_contents")

    public val isClippingContentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_clipping_contents")

    public val grabClickFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "grab_click_focus")

    public val setDragForwardingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_drag_forwarding")

    public val setDragPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_drag_preview")

    public val isDragSuccessfulPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_drag_successful")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "warp_mouse")

    public val setShortcutContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_shortcut_context")

    public val getShortcutContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_shortcut_context")

    public val updateMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "update_minimum_size")

    public val setLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_layout_direction")

    public val getLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_layout_direction")

    public val isLayoutRtlPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "is_layout_rtl")

    public val setAutoTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_auto_translate")

    public val isAutoTranslatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_auto_translating")

    public val setLocalizeNumeralSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_localize_numeral_system")

    public val isLocalizingNumeralSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_localizing_numeral_system")
  }
}

public infix fun Long.or(other: SizeFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: SizeFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: SizeFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: SizeFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: SizeFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: SizeFlags): Long = this.times(other.flag)

public operator fun Long.div(other: SizeFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: SizeFlags): Long = this.rem(other.flag)
