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
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class PlaceholderMesh : Mesh() {
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
    callConstructor(ENGINECLASS_PLACEHOLDERMESH, scriptIndex)
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
   * val myCoreType = placeholdermesh.aabb
   * //Your changes
   * placeholdermesh.aabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun aabbMutate(block: CoreAABB.() -> Unit): CoreAABB = aabb.apply{
      block(this)
      aabb = this
  }


  public companion object

  internal object MethodBindings {
    public val setAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("PlaceholderMesh", "set_aabb")
  }
}
