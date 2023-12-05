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
import godot.core.VariantType.VECTOR3I
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PlaceholderTexture3D : Texture3D() {
  @CoreTypeLocalCopy
  public var size: Vector3i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3I)
      return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PLACEHOLDERTEXTURE3D, scriptIndex)
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
   * val myCoreType = placeholdertexture3d.size
   * //Your changes
   * placeholdertexture3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3i.() -> Unit): Vector3i = size.apply{
      block(this)
      size = this
  }


  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTexture3D", "set_size")

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTexture3D", "get_size")
  }
}
