// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SkeletonModificationStack2D : Resource() {
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  public var modificationCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModificationCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setModificationCountPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATIONSTACK2D, scriptIndex)
    return true
  }

  public fun setup() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setupPtr, NIL)
  }

  public fun execute(delta: Float, executionMode: Int) {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), LONG to executionMode.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, NIL)
  }

  public fun enableAllModifications(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.enableAllModificationsPtr, NIL)
  }

  public fun getModification(modIdx: Int): SkeletonModification2D? {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getModificationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkeletonModification2D?)
  }

  public fun addModification(modification: SkeletonModification2D) {
    TransferContext.writeArguments(OBJECT to modification)
    TransferContext.callMethod(rawPtr, MethodBindings.addModificationPtr, NIL)
  }

  public fun deleteModification(modIdx: Int) {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteModificationPtr, NIL)
  }

  public fun setModification(modIdx: Int, modification: SkeletonModification2D) {
    TransferContext.writeArguments(LONG to modIdx.toLong(), OBJECT to modification)
    TransferContext.callMethod(rawPtr, MethodBindings.setModificationPtr, NIL)
  }

  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSkeleton(): Skeleton2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "setup")

    public val executePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "execute")

    public val enableAllModificationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "enable_all_modifications")

    public val getModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification")

    public val addModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "add_modification")

    public val deleteModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "delete_modification")

    public val setModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification")

    public val setModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification_count")

    public val getModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification_count")

    public val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_is_setup")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_enabled")

    public val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_enabled")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_strength")

    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_skeleton")
  }
}
