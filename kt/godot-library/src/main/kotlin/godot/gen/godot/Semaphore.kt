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
import kotlin.jvm.JvmName

@GodotBaseType
public open class Semaphore : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEMAPHORE, scriptIndex)
    return true
  }

  @JvmName("semaphoreWait")
  public fun wait() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitPtr, NIL)
  }

  public fun tryWait(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tryWaitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun post() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.postPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "wait")

    public val tryWaitPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "try_wait")

    public val postPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "post")
  }
}
