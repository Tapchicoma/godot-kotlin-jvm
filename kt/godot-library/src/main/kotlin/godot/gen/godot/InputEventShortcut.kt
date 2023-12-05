// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class InputEventShortcut : InputEvent() {
  public var shortcut: Shortcut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShortcutPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTSHORTCUT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "set_shortcut")

    public val getShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "get_shortcut")
  }
}
