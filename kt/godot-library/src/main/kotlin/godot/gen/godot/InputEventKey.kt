// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class InputEventKey : InputEventWithModifiers() {
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  public var keycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeycodePtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeycodePtr, NIL)
    }

  public var physicalKeycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalKeycodePtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicalKeycodePtr, NIL)
    }

  public var keyLabel: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeyLabelPtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeyLabelPtr, NIL)
    }

  public var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnicodePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnicodePtr, NIL)
    }

  public var echo: Boolean
    @JvmName("isEcho_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isEcho()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEchoPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTKEY, scriptIndex)
    return true
  }

  public fun getKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeycodeWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getPhysicalKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalKeycodeWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getKeyLabelWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeyLabelWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun asTextKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextKeycodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun asTextPhysicalKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextPhysicalKeycodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun asTextKeyLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextKeyLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "set_pressed")

    public val setKeycodePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "set_keycode")

    public val getKeycodePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "get_keycode")

    public val setPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_physical_keycode")

    public val getPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_physical_keycode")

    public val setKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_key_label")

    public val getKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_key_label")

    public val setUnicodePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "set_unicode")

    public val getUnicodePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "get_unicode")

    public val setEchoPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventKey", "set_echo")

    public val getKeycodeWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_keycode_with_modifiers")

    public val getPhysicalKeycodeWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_physical_keycode_with_modifiers")

    public val getKeyLabelWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_key_label_with_modifiers")

    public val asTextKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_keycode")

    public val asTextPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_physical_keycode")

    public val asTextKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_key_label")
  }
}
