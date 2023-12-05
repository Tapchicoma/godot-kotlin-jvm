// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ScriptCreateDialog internal constructor() : ConfirmationDialog() {
  public val scriptCreated: Signal1<Script> by signal("script")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTCREATEDIALOG, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true,
  ) {
    TransferContext.writeArguments(STRING to inherits, STRING to path, BOOL to builtInEnabled, BOOL to loadEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.configPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val configPtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptCreateDialog", "config")
  }
}
