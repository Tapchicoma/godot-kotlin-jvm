// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
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
public open class InputEvent internal constructor() : Resource() {
  public var device: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDevicePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDevicePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENT, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun isAction(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isActionPressed(
    action: StringName,
    allowEcho: Boolean = false,
    exactMatch: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to allowEcho, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun isActionReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun isCanceled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCanceledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isReleased(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isEcho(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEchoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun asText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun isMatch(event: InputEvent, exactMatch: Boolean = true): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isMatchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isActionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun accumulate(withEvent: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to withEvent)
    TransferContext.callMethod(rawPtr, MethodBindings.accumulatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent? {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to localOfs)
    TransferContext.callMethod(rawPtr, MethodBindings.xformedByPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as InputEvent?)
  }

  public companion object

  internal object MethodBindings {
    public val setDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "set_device")

    public val getDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "get_device")

    public val isActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_action")

    public val isActionPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_pressed")

    public val isActionReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_released")

    public val getActionStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "get_action_strength")

    public val isCanceledPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_canceled")

    public val isPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_pressed")

    public val isReleasedPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_released")

    public val isEchoPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_echo")

    public val asTextPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "as_text")

    public val isMatchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_match")

    public val isActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_type")

    public val accumulatePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "accumulate")

    public val xformedByPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "xformed_by")
  }
}
