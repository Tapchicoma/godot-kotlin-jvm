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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class GraphNode : Container() {
  public val positionOffsetChanged: Signal0 by signal()

  public val nodeSelected: Signal0 by signal()

  public val nodeDeselected: Signal0 by signal()

  public val slotUpdated: Signal1<Long> by signal("idx")

  public val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  public val raiseRequest: Signal0 by signal()

  public val closeRequest: Signal0 by signal()

  public val resizeRequest: Signal1<Vector2> by signal("newMinsize")

  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var positionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionOffsetPtr, NIL)
    }

  public var showClose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCloseButtonVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowCloseButtonPtr, NIL)
    }

  public var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResizablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResizablePtr, NIL)
    }

  public var draggable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDraggablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDraggablePtr, NIL)
    }

  public var selectable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectablePtr, NIL)
    }

  public var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
    }

  public var comment: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCommentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommentPtr, NIL)
    }

  public var overlay: Overlay
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOverlayPtr, LONG)
      return GraphNode.Overlay.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverlayPtr, NIL)
    }

  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHNODE, scriptIndex)
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
   * val myCoreType = graphnode.positionOffset
   * //Your changes
   * graphnode.positionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionOffsetMutate(block: Vector2.() -> Unit): Vector2 = positionOffset.apply{
      block(this)
      positionOffset = this
  }


  @JvmOverloads
  public fun setSlot(
    slotIndex: Int,
    enableLeftPort: Boolean,
    typeLeft: Int,
    colorLeft: Color,
    enableRightPort: Boolean,
    typeRight: Int,
    colorRight: Color,
    customIconLeft: Texture2D? = null,
    customIconRight: Texture2D? = null,
    drawStylebox: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enableLeftPort, LONG to typeLeft.toLong(), COLOR to colorLeft, BOOL to enableRightPort, LONG to typeRight.toLong(), COLOR to colorRight, OBJECT to customIconLeft, OBJECT to customIconRight, BOOL to drawStylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotPtr, NIL)
  }

  public fun clearSlot(slotIndex: Int) {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSlotPtr, NIL)
  }

  public fun clearAllSlots() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearAllSlotsPtr, NIL)
  }

  public fun setSlotEnabledLeft(slotIndex: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledLeftPtr, NIL)
  }

  public fun isSlotEnabledLeft(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSlotTypeLeft(slotIndex: Int, type: Int) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeLeftPtr, NIL)
  }

  public fun getSlotTypeLeft(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSlotColorLeft(slotIndex: Int, color: Color) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorLeftPtr, NIL)
  }

  public fun getSlotColorLeft(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorLeftPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setSlotEnabledRight(slotIndex: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledRightPtr, NIL)
  }

  public fun isSlotEnabledRight(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSlotTypeRight(slotIndex: Int, type: Int) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeRightPtr, NIL)
  }

  public fun getSlotTypeRight(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeRightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSlotColorRight(slotIndex: Int, color: Color) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorRightPtr, NIL)
  }

  public fun getSlotColorRight(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorRightPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun isSlotDrawStylebox(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotDrawStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSlotDrawStylebox(slotIndex: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotDrawStyleboxPtr, NIL)
  }

  public fun getConnectionInputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionInputHeight(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionInputPosition(port: Int): Vector2 {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getConnectionInputType(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionInputColor(port: Int): Color {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getConnectionInputSlot(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionOutputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionOutputHeight(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionOutputPosition(port: Int): Vector2 {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getConnectionOutputType(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getConnectionOutputColor(port: Int): Color {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getConnectionOutputSlot(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class Overlay(
    id: Long,
  ) {
    OVERLAY_DISABLED(0),
    OVERLAY_BREAKPOINT(1),
    OVERLAY_POSITION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Overlay = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_title")

    public val getTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_title")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_language")

    public val setSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_slot")

    public val clearSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "clear_slot")

    public val clearAllSlotsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "clear_all_slots")

    public val setSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_left")

    public val isSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_left")

    public val setSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_left")

    public val getSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_left")

    public val setSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_left")

    public val getSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_left")

    public val setSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_right")

    public val isSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_right")

    public val setSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_right")

    public val getSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_right")

    public val setSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_right")

    public val getSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_right")

    public val isSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_draw_stylebox")

    public val setSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_draw_stylebox")

    public val setPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_position_offset")

    public val getPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_position_offset")

    public val setCommentPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_comment")

    public val isCommentPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_comment")

    public val setResizablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_resizable")

    public val isResizablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_resizable")

    public val setDraggablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_draggable")

    public val isDraggablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_draggable")

    public val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_selectable")

    public val isSelectablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_selectable")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_selected")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_selected")

    public val getConnectionInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_count")

    public val getConnectionInputHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_height")

    public val getConnectionInputPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_position")

    public val getConnectionInputTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_type")

    public val getConnectionInputColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_color")

    public val getConnectionInputSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_slot")

    public val getConnectionOutputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_count")

    public val getConnectionOutputHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_height")

    public val getConnectionOutputPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_position")

    public val getConnectionOutputTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_type")

    public val getConnectionOutputColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_color")

    public val getConnectionOutputSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_slot")

    public val setShowCloseButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_show_close_button")

    public val isCloseButtonVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_close_button_visible")

    public val setOverlayPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_overlay")

    public val getOverlayPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_overlay")
  }
}
