// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object Input : Object() {
  public val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_INPUT)
    return false
  }

  public fun isAnythingPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAnythingPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeyPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isPhysicalKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPhysicalKeyPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isKeyLabelPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeyLabelPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isMouseButtonPressed(button: MouseButton): Boolean {
    TransferContext.writeArguments(LONG to button.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isMouseButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isJoyButtonPressed(device: Int, button: JoyButton): Boolean {
    TransferContext.writeArguments(LONG to device.toLong(), LONG to button.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isJoyButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isActionPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isActionJustPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionJustPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isActionJustReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionJustReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getActionRawStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionRawStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getAxis(negativeAction: StringName, positiveAction: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to negativeAction, STRING_NAME to positiveAction)
    TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getVector(
    negativeX: StringName,
    positiveX: StringName,
    negativeY: StringName,
    positiveY: StringName,
    deadzone: Float = -1.0f,
  ): Vector2 {
    TransferContext.writeArguments(STRING_NAME to negativeX, STRING_NAME to positiveX, STRING_NAME to negativeY, STRING_NAME to positiveY, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getVectorPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    TransferContext.writeArguments(STRING to mapping, BOOL to updateExisting)
    TransferContext.callMethod(rawPtr, MethodBindings.addJoyMappingPtr, NIL)
  }

  public fun removeJoyMapping(guid: String) {
    TransferContext.writeArguments(STRING to guid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeJoyMappingPtr, NIL)
  }

  public fun isJoyKnown(device: Int): Boolean {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isJoyKnownPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getJoyAxis(device: Int, axis: JoyAxis): Float {
    TransferContext.writeArguments(LONG to device.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyAxisPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getJoyName(device: Int): String {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getJoyGuid(device: Int): String {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyGuidPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConnectedJoypads(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedJoypadsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
  }

  public fun getJoyVibrationStrength(device: Int): Vector2 {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyVibrationStrengthPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getJoyVibrationDuration(device: Int): Float {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyVibrationDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun startJoyVibration(
    device: Int,
    weakMagnitude: Float,
    strongMagnitude: Float,
    duration: Float = 0.0f,
  ) {
    TransferContext.writeArguments(LONG to device.toLong(), DOUBLE to weakMagnitude.toDouble(), DOUBLE to strongMagnitude.toDouble(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.startJoyVibrationPtr, NIL)
  }

  public fun stopJoyVibration(device: Int) {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.stopJoyVibrationPtr, NIL)
  }

  @JvmOverloads
  public fun vibrateHandheld(durationMs: Int = 500) {
    TransferContext.writeArguments(LONG to durationMs.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.vibrateHandheldPtr, NIL)
  }

  public fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getAccelerometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAccelerometerPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getMagnetometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMagnetometerPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getGyroscope(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGyroscopePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setGravity(`value`: Vector3) {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
  }

  public fun setAccelerometer(`value`: Vector3) {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAccelerometerPtr, NIL)
  }

  public fun setMagnetometer(`value`: Vector3) {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setMagnetometerPtr, NIL)
  }

  public fun setGyroscope(`value`: Vector3) {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGyroscopePtr, NIL)
  }

  public fun getLastMouseVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastMouseVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getMouseButtonMask(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMouseButtonMaskPtr, LONG)
    return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setMouseMode(mode: MouseMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMouseModePtr, NIL)
  }

  public fun getMouseMode(): MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMouseModePtr, LONG)
    return Input.MouseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun warpMouse(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  @JvmOverloads
  public fun actionPress(action: StringName, strength: Float = 1.0f) {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.actionPressPtr, NIL)
  }

  public fun actionRelease(action: StringName) {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionReleasePtr, NIL)
  }

  @JvmOverloads
  public fun setDefaultCursorShape(shape: CursorShape = Input.CursorShape.CURSOR_ARROW) {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCursorShapePtr, NIL)
  }

  public fun getCurrentCursorShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentCursorShapePtr, LONG)
    return Input.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun setCustomMouseCursor(
    image: Resource,
    shape: CursorShape = Input.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomMouseCursorPtr, NIL)
  }

  public fun parseInputEvent(event: InputEvent) {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.parseInputEventPtr, NIL)
  }

  public fun setUseAccumulatedInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseAccumulatedInputPtr, NIL)
  }

  public fun isUsingAccumulatedInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUsingAccumulatedInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun flushBufferedEvents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flushBufferedEventsPtr, NIL)
  }

  public enum class MouseMode(
    id: Long,
  ) {
    MOUSE_MODE_VISIBLE(0),
    MOUSE_MODE_HIDDEN(1),
    MOUSE_MODE_CAPTURED(2),
    MOUSE_MODE_CONFINED(3),
    MOUSE_MODE_CONFINED_HIDDEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MouseMode = entries.single {
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

  internal object MethodBindings {
    public val isAnythingPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_anything_pressed")

    public val isKeyPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "is_key_pressed")

    public val isPhysicalKeyPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_physical_key_pressed")

    public val isKeyLabelPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_key_label_pressed")

    public val isMouseButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_mouse_button_pressed")

    public val isJoyButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_joy_button_pressed")

    public val isActionPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_pressed")

    public val isActionJustPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_just_pressed")

    public val isActionJustReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_just_released")

    public val getActionStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_action_strength")

    public val getActionRawStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_action_raw_strength")

    public val getAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_axis")

    public val getVectorPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_vector")

    public val addJoyMappingPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "add_joy_mapping")

    public val removeJoyMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "remove_joy_mapping")

    public val isJoyKnownPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "is_joy_known")

    public val getJoyAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_axis")

    public val getJoyNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_name")

    public val getJoyGuidPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_guid")

    public val getConnectedJoypadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_connected_joypads")

    public val getJoyVibrationStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_joy_vibration_strength")

    public val getJoyVibrationDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_joy_vibration_duration")

    public val startJoyVibrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "start_joy_vibration")

    public val stopJoyVibrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "stop_joy_vibration")

    public val vibrateHandheldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "vibrate_handheld")

    public val getGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_gravity")

    public val getAccelerometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_accelerometer")

    public val getMagnetometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_magnetometer")

    public val getGyroscopePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_gyroscope")

    public val setGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_gravity")

    public val setAccelerometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_accelerometer")

    public val setMagnetometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_magnetometer")

    public val setGyroscopePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_gyroscope")

    public val getLastMouseVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_last_mouse_velocity")

    public val getMouseButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_mouse_button_mask")

    public val setMouseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_mouse_mode")

    public val getMouseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_mouse_mode")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "warp_mouse")

    public val actionPressPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "action_press")

    public val actionReleasePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "action_release")

    public val setDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_default_cursor_shape")

    public val getCurrentCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_current_cursor_shape")

    public val setCustomMouseCursorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_custom_mouse_cursor")

    public val parseInputEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "parse_input_event")

    public val setUseAccumulatedInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_use_accumulated_input")

    public val isUsingAccumulatedInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_using_accumulated_input")

    public val flushBufferedEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "flush_buffered_events")
  }
}
