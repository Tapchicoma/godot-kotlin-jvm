// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class NavigationMeshSourceGeometryData3D : Resource() {
  public var vertices: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  public var indices: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndicesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addMesh(mesh: Mesh, xform: Transform3D) {
    TransferContext.writeArguments(OBJECT to mesh, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshPtr, NIL)
  }

  public fun addMeshArray(meshArray: VariantArray<Any?>, xform: Transform3D) {
    TransferContext.writeArguments(ARRAY to meshArray, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshArrayPtr, NIL)
  }

  public fun addFaces(faces: PackedVector3Array, xform: Transform3D) {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to faces, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addFacesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_vertices")

    public val setIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_indices")

    public val getIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_indices")

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "clear")

    public val hasDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "has_data")

    public val addMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh")

    public val addMeshArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh_array")

    public val addFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_faces")
  }
}
