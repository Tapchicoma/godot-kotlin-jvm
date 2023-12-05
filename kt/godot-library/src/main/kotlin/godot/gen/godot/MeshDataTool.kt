// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class MeshDataTool : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHDATATOOL, scriptIndex)
    return true
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun createFromSurface(mesh: ArrayMesh, surface: Int): GodotError {
    TransferContext.writeArguments(OBJECT to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromSurfacePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun commitToSurface(mesh: ArrayMesh): GodotError {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.commitToSurfacePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getFormat(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVertexCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getEdgeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setVertex(idx: Int, vertex: Vector3) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexPtr, NIL)
  }

  public fun getVertex(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setVertexNormal(idx: Int, normal: Vector3) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexNormalPtr, NIL)
  }

  public fun getVertexNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setVertexTangent(idx: Int, tangent: Plane) {
    TransferContext.writeArguments(LONG to idx.toLong(), PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexTangentPtr, NIL)
  }

  public fun getVertexTangent(idx: Int): Plane {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexTangentPtr, PLANE)
    return (TransferContext.readReturnValue(PLANE, false) as Plane)
  }

  public fun setVertexUv(idx: Int, uv: Vector2) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexUvPtr, NIL)
  }

  public fun getVertexUv(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexUvPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setVertexUv2(idx: Int, uv2: Vector2) {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexUv2Ptr, NIL)
  }

  public fun getVertexUv2(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexUv2Ptr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setVertexColor(idx: Int, color: Color) {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexColorPtr, NIL)
  }

  public fun getVertexColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setVertexBones(idx: Int, bones: PackedInt32Array) {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexBonesPtr, NIL)
  }

  public fun getVertexBones(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexBonesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setVertexWeights(idx: Int, weights: PackedFloat32Array) {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexWeightsPtr, NIL)
  }

  public fun getVertexWeights(idx: Int): PackedFloat32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  public fun setVertexMeta(idx: Int, meta: Any?) {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexMetaPtr, NIL)
  }

  public fun getVertexMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getVertexEdges(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexEdgesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getVertexFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getEdgeVertex(idx: Int, vertex: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getEdgeFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setEdgeMeta(idx: Int, meta: Any?) {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMetaPtr, NIL)
  }

  public fun getEdgeMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getFaceVertex(idx: Int, vertex: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFaceEdge(idx: Int, edge: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to edge.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceEdgePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFaceMeta(idx: Int, meta: Any?) {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setFaceMetaPtr, NIL)
  }

  public fun getFaceMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getFaceNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setMaterial(material: Material) {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "clear")

    public val createFromSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "create_from_surface")

    public val commitToSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "commit_to_surface")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "get_format")

    public val getVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_count")

    public val getEdgeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_count")

    public val getFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_count")

    public val setVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex")

    public val getVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex")

    public val setVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_normal")

    public val getVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_normal")

    public val setVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_tangent")

    public val getVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_tangent")

    public val setVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv")

    public val getVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv")

    public val setVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv2")

    public val getVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv2")

    public val setVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_color")

    public val getVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_color")

    public val setVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_bones")

    public val getVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_bones")

    public val setVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_weights")

    public val getVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_weights")

    public val setVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_meta")

    public val getVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_meta")

    public val getVertexEdgesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_edges")

    public val getVertexFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_faces")

    public val getEdgeVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_vertex")

    public val getEdgeFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_faces")

    public val setEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_edge_meta")

    public val getEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_meta")

    public val getFaceVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_vertex")

    public val getFaceEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_edge")

    public val setFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_face_meta")

    public val getFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_meta")

    public val getFaceNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_normal")

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_material")

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_material")
  }
}
