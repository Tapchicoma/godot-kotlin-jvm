// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorCommandPalette internal constructor() : ConfirmationDialog() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORCOMMANDPALETTE, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addCommand(
    commandName: String,
    keyName: String,
    bindedCallable: Callable,
    shortcutText: String = "None",
  ) {
    TransferContext.writeArguments(STRING to commandName, STRING to keyName, CALLABLE to bindedCallable, STRING to shortcutText)
    TransferContext.callMethod(rawPtr, MethodBindings.addCommandPtr, NIL)
  }

  public fun removeCommand(keyName: String) {
    TransferContext.writeArguments(STRING to keyName)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCommandPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addCommandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorCommandPalette", "add_command")

    public val removeCommandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorCommandPalette", "remove_command")
  }
}
