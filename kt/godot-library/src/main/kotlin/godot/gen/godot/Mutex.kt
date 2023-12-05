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
public open class Mutex : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MUTEX, scriptIndex)
    return true
  }

  public fun lock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.lockPtr, NIL)
  }

  public fun tryLock(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tryLockPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun unlock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unlockPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val lockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "lock")

    public val tryLockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "try_lock")

    public val unlockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "unlock")
  }
}
