// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class VisibleOnScreenNotifier3D : VisualInstance3D() {
  public val screenEntered: Signal0 by signal()

  public val screenExited: Signal0 by signal()

  @CoreTypeLocalCopy
  public var aabb: CoreAABB
    @JvmName("getAabb_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getAabb()
    set(`value`) {
      TransferContext.writeArguments(VariantTypeAABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAabbPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENNOTIFIER3D, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visibleonscreennotifier3d.aabb
   * //Your changes
   * visibleonscreennotifier3d.aabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun aabbMutate(block: CoreAABB.() -> Unit): CoreAABB = aabb.apply{
      block(this)
      aabb = this
  }


  public fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnScreenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "set_aabb")

    public val isOnScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "is_on_screen")
  }
}
