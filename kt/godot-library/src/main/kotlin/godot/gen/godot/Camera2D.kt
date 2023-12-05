// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
public open class Camera2D : Node2D() {
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var anchorMode: AnchorMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorModePtr, LONG)
      return Camera2D.AnchorMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnchorModePtr, NIL)
    }

  public var ignoreRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIgnoringRotationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreRotationPtr, NIL)
    }

  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var zoom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomPtr, NIL)
    }

  public var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomViewportPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomViewportPtr, NIL)
    }

  public var processCallback: Camera2DProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
      return Camera2D.Camera2DProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
    }

  public var limitLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  public var limitTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  public var limitRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  public var limitBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  public var limitSmoothed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLimitSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitSmoothingEnabledPtr, NIL)
    }

  public var positionSmoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPositionSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionSmoothingEnabledPtr, NIL)
    }

  public var positionSmoothingSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionSmoothingSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionSmoothingSpeedPtr, NIL)
    }

  public var rotationSmoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRotationSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationSmoothingEnabledPtr, NIL)
    }

  public var rotationSmoothingSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationSmoothingSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationSmoothingSpeedPtr, NIL)
    }

  public var dragHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragHorizontalEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragHorizontalEnabledPtr, NIL)
    }

  public var dragVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragVerticalEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragVerticalEnabledPtr, NIL)
    }

  public var dragHorizontalOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragHorizontalOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragHorizontalOffsetPtr, NIL)
    }

  public var dragVerticalOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragVerticalOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragVerticalOffsetPtr, NIL)
    }

  public var dragLeftMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  public var dragTopMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  public var dragRightMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  public var dragBottomMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  public var editorDrawScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScreenDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenDrawingEnabledPtr, NIL)
    }

  public var editorDrawLimits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLimitDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitDrawingEnabledPtr, NIL)
    }

  public var editorDrawDragMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMarginDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginDrawingEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERA2D, scriptIndex)
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
   * val myCoreType = camera2d.offset
   * //Your changes
   * camera2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
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
   * val myCoreType = camera2d.zoom
   * //Your changes
   * camera2d.zoom = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun zoomMutate(block: Vector2.() -> Unit): Vector2 = zoom.apply{
      block(this)
      zoom = this
  }


  public fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  public fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getTargetPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getScreenCenterPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenCenterPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun forceUpdateScroll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateScrollPtr, NIL)
  }

  public fun resetSmoothing() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetSmoothingPtr, NIL)
  }

  public fun align() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.alignPtr, NIL)
  }

  public enum class AnchorMode(
    id: Long,
  ) {
    ANCHOR_MODE_FIXED_TOP_LEFT(0),
    ANCHOR_MODE_DRAG_CENTER(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnchorMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Camera2DProcessCallback(
    id: Long,
  ) {
    CAMERA2D_PROCESS_PHYSICS(0),
    CAMERA2D_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Camera2DProcessCallback = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "get_offset")

    public val setAnchorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_anchor_mode")

    public val getAnchorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_anchor_mode")

    public val setIgnoreRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_ignore_rotation")

    public val isIgnoringRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_ignoring_rotation")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_process_callback")

    public val setEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "set_enabled")

    public val isEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "is_enabled")

    public val makeCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "make_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "is_current")

    public val setLimitPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "set_limit")

    public val getLimitPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "get_limit")

    public val setLimitSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_limit_smoothing_enabled")

    public val isLimitSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_limit_smoothing_enabled")

    public val setDragVerticalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_vertical_enabled")

    public val isDragVerticalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_drag_vertical_enabled")

    public val setDragHorizontalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_horizontal_enabled")

    public val isDragHorizontalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_drag_horizontal_enabled")

    public val setDragVerticalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_vertical_offset")

    public val getDragVerticalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_vertical_offset")

    public val setDragHorizontalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_horizontal_offset")

    public val getDragHorizontalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_horizontal_offset")

    public val setDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_margin")

    public val getDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_margin")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_target_position")

    public val getScreenCenterPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_screen_center_position")

    public val setZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "set_zoom")

    public val getZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "get_zoom")

    public val setCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_custom_viewport")

    public val getCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_custom_viewport")

    public val setPositionSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_position_smoothing_speed")

    public val getPositionSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_position_smoothing_speed")

    public val setPositionSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_position_smoothing_enabled")

    public val isPositionSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_position_smoothing_enabled")

    public val setRotationSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_rotation_smoothing_enabled")

    public val isRotationSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_rotation_smoothing_enabled")

    public val setRotationSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_rotation_smoothing_speed")

    public val getRotationSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_rotation_smoothing_speed")

    public val forceUpdateScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "force_update_scroll")

    public val resetSmoothingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "reset_smoothing")

    public val alignPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "align")

    public val setScreenDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_screen_drawing_enabled")

    public val isScreenDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_screen_drawing_enabled")

    public val setLimitDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_limit_drawing_enabled")

    public val isLimitDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_limit_drawing_enabled")

    public val setMarginDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_margin_drawing_enabled")

    public val isMarginDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_margin_drawing_enabled")
  }
}
