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
public open class SkeletonModification2DStackHolder : SkeletonModification2D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DSTACKHOLDER, scriptIndex)
    return true
  }

  public fun setHeldModificationStack(heldModificationStack: SkeletonModificationStack2D) {
    TransferContext.writeArguments(OBJECT to heldModificationStack)
    TransferContext.callMethod(rawPtr, MethodBindings.setHeldModificationStackPtr, NIL)
  }

  public fun getHeldModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeldModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setHeldModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DStackHolder", "set_held_modification_stack")

    public val getHeldModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DStackHolder", "get_held_modification_stack")
  }
}
