// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class InputEventMIDI : InputEvent() {
  public var channel: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getChannelPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setChannelPtr, NIL)
    }

  public var message: MIDIMessage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMessagePtr, LONG)
      return MIDIMessage.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMessagePtr, NIL)
    }

  public var pitch: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPitchPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPitchPtr, NIL)
    }

  public var velocity: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  public var instrument: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInstrumentPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInstrumentPtr, NIL)
    }

  public var pressure: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressurePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
    }

  public var controllerNumber: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getControllerNumberPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setControllerNumberPtr, NIL)
    }

  public var controllerValue: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getControllerValuePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setControllerValuePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMIDI, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_channel")

    public val getChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_channel")

    public val setMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_message")

    public val getMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_message")

    public val setPitchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventMIDI", "set_pitch")

    public val getPitchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventMIDI", "get_pitch")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_velocity")

    public val setInstrumentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_instrument")

    public val getInstrumentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_instrument")

    public val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_pressure")

    public val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_pressure")

    public val setControllerNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_controller_number")

    public val getControllerNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_controller_number")

    public val setControllerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_controller_value")

    public val getControllerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_controller_value")
  }
}
