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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class PrimitiveMesh : Mesh() {
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var customAabb: CoreAABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomAabbPtr, VariantTypeAABB)
      return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
    }
    set(`value`) {
      TransferContext.writeArguments(VariantTypeAABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
    }

  public var flipFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlipFacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipFacesPtr, NIL)
    }

  public var addUv2: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAddUv2Ptr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAddUv2Ptr, NIL)
    }

  public var uv2Padding: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUv2PaddingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUv2PaddingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PRIMITIVEMESH, scriptIndex)
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
   * val myCoreType = primitivemesh.customAabb
   * //Your changes
   * primitivemesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabbMutate(block: CoreAABB.() -> Unit): CoreAABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  public open fun _createMeshArray(): VariantArray<Any?> {
    throw NotImplementedError("_create_mesh_array is not implemented for PrimitiveMesh")
  }

  public fun getMeshArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val _createMeshArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "_create_mesh_array")

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_material")

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_material")

    public val getMeshArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_mesh_arrays")

    public val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_custom_aabb")

    public val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_custom_aabb")

    public val setFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_flip_faces")

    public val getFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_flip_faces")

    public val setAddUv2Ptr: VoidPtr = TypeManager.getMethodBindPtr("PrimitiveMesh", "set_add_uv2")

    public val getAddUv2Ptr: VoidPtr = TypeManager.getMethodBindPtr("PrimitiveMesh", "get_add_uv2")

    public val setUv2PaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_uv2_padding")

    public val getUv2PaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_uv2_padding")
  }
}
