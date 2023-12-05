// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorNode3DGizmo internal constructor() : Node3DGizmo() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORNODE3DGIZMO, scriptIndex)
    return true
  }

  public open fun _redraw() {
  }

  public open fun _getHandleName(id: Int, secondary: Boolean): String {
    throw NotImplementedError("_get_handle_name is not implemented for EditorNode3DGizmo")
  }

  public open fun _isHandleHighlighted(id: Int, secondary: Boolean): Boolean {
    throw NotImplementedError("_is_handle_highlighted is not implemented for EditorNode3DGizmo")
  }

  public open fun _getHandleValue(id: Int, secondary: Boolean): Any? {
    throw NotImplementedError("_get_handle_value is not implemented for EditorNode3DGizmo")
  }

  public open fun _setHandle(
    id: Int,
    secondary: Boolean,
    camera: Camera3D,
    point: Vector2,
  ) {
  }

  public open fun _commitHandle(
    id: Int,
    secondary: Boolean,
    restore: Any?,
    cancel: Boolean,
  ) {
  }

  public open fun _subgizmosIntersectRay(camera: Camera3D, point: Vector2): Int {
    throw NotImplementedError("_subgizmos_intersect_ray is not implemented for EditorNode3DGizmo")
  }

  public open fun _subgizmosIntersectFrustum(camera: Camera3D, frustum: VariantArray<Plane>):
      PackedInt32Array {
    throw NotImplementedError("_subgizmos_intersect_frustum is not implemented for EditorNode3DGizmo")
  }

  public open fun _setSubgizmoTransform(id: Int, transform: Transform3D) {
  }

  public open fun _getSubgizmoTransform(id: Int): Transform3D {
    throw NotImplementedError("_get_subgizmo_transform is not implemented for EditorNode3DGizmo")
  }

  public open fun _commitSubgizmos(
    ids: PackedInt32Array,
    restores: VariantArray<Transform3D>,
    cancel: Boolean,
  ) {
  }

  @JvmOverloads
  public fun addLines(
    lines: PackedVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to lines, OBJECT to material, BOOL to billboard, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.addLinesPtr, NIL)
  }

  @JvmOverloads
  public fun addMesh(
    mesh: Mesh,
    material: Material? = null,
    transform: Transform3D = Transform3D(),
    skeleton: SkinReference? = null,
  ) {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to material, TRANSFORM3D to transform, OBJECT to skeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshPtr, NIL)
  }

  public fun addCollisionSegments(segments: PackedVector3Array) {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to segments)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionSegmentsPtr, NIL)
  }

  public fun addCollisionTriangles(triangles: TriangleMesh) {
    TransferContext.writeArguments(OBJECT to triangles)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionTrianglesPtr, NIL)
  }

  @JvmOverloads
  public fun addUnscaledBillboard(
    material: Material,
    defaultScale: Float = 1.0f,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(OBJECT to material, DOUBLE to defaultScale.toDouble(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.addUnscaledBillboardPtr, NIL)
  }

  @JvmOverloads
  public fun addHandles(
    handles: PackedVector3Array,
    material: Material,
    ids: PackedInt32Array,
    billboard: Boolean = false,
    secondary: Boolean = false,
  ) {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to handles, OBJECT to material, PACKED_INT_32_ARRAY to ids, BOOL to billboard, BOOL to secondary)
    TransferContext.callMethod(rawPtr, MethodBindings.addHandlesPtr, NIL)
  }

  public fun setNode3d(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setNode3dPtr, NIL)
  }

  public fun getNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNode3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node3D?)
  }

  public fun getPlugin(): EditorNode3DGizmoPlugin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPluginPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorNode3DGizmoPlugin?)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun setHidden(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(rawPtr, MethodBindings.setHiddenPtr, NIL)
  }

  public fun isSubgizmoSelected(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSubgizmoSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSubgizmoSelection(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSubgizmoSelectionPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public companion object

  internal object MethodBindings {
    public val _redrawPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_redraw")

    public val _getHandleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_get_handle_name")

    public val _isHandleHighlightedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_is_handle_highlighted")

    public val _getHandleValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_get_handle_value")

    public val _setHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_set_handle")

    public val _commitHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_commit_handle")

    public val _subgizmosIntersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_subgizmos_intersect_ray")

    public val _subgizmosIntersectFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_subgizmos_intersect_frustum")

    public val _setSubgizmoTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_set_subgizmo_transform")

    public val _getSubgizmoTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_get_subgizmo_transform")

    public val _commitSubgizmosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "_commit_subgizmos")

    public val addLinesPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_lines")

    public val addMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_mesh")

    public val addCollisionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_collision_segments")

    public val addCollisionTrianglesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_collision_triangles")

    public val addUnscaledBillboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_unscaled_billboard")

    public val addHandlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "add_handles")

    public val setNode3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "set_node_3d")

    public val getNode3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "get_node_3d")

    public val getPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "get_plugin")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorNode3DGizmo", "clear")

    public val setHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "set_hidden")

    public val isSubgizmoSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "is_subgizmo_selected")

    public val getSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmo", "get_subgizmo_selection")
  }
}
