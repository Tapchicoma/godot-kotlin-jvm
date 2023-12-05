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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioListener2D : Node2D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOLISTENER2D, scriptIndex)
    return true
  }

  public fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  public fun clearCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCurrentPtr, NIL)
  }

  public fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val makeCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener2D", "make_current")

    public val clearCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener2D", "clear_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioListener2D", "is_current")
  }
}
