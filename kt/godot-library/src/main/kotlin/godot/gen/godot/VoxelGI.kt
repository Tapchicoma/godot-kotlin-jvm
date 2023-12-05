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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class VoxelGI : VisualInstance3D() {
  public var subdiv: Subdiv
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubdivPtr, LONG)
      return VoxelGI.Subdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubdivPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public var cameraAttributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
    }

  public var `data`: VoxelGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProbeDataPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as VoxelGIData?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProbeDataPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VOXELGI, scriptIndex)
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
   * val myCoreType = voxelgi.size
   * //Your changes
   * voxelgi.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  @JvmOverloads
  public fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false) {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  public fun debugBake() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.debugBakePtr, NIL)
  }

  public enum class Subdiv(
    id: Long,
  ) {
    SUBDIV_64(0),
    SUBDIV_128(1),
    SUBDIV_256(2),
    SUBDIV_512(3),
    SUBDIV_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Subdiv = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setProbeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_probe_data")

    public val getProbeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_probe_data")

    public val setSubdivPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_subdiv")

    public val getSubdivPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_subdiv")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_size")

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGI", "set_camera_attributes")

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGI", "get_camera_attributes")

    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "bake")

    public val debugBakePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "debug_bake")
  }
}
