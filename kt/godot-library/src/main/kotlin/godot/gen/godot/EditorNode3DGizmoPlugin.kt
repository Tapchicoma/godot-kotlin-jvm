// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorNode3DGizmoPlugin internal constructor() : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORNODE3DGIZMOPLUGIN, scriptIndex)
    return true
  }

  public open fun _hasGizmo(forNode3d: Node3D): Boolean {
    throw NotImplementedError("_has_gizmo is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _createGizmo(forNode3d: Node3D): EditorNode3DGizmo? {
    throw NotImplementedError("_create_gizmo is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _getGizmoName(): String {
    throw NotImplementedError("_get_gizmo_name is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _getPriority(): Int {
    throw NotImplementedError("_get_priority is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _canBeHidden(): Boolean {
    throw NotImplementedError("_can_be_hidden is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _isSelectableWhenHidden(): Boolean {
    throw NotImplementedError("_is_selectable_when_hidden is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _redraw(gizmo: EditorNode3DGizmo) {
  }

  public open fun _getHandleName(
    gizmo: EditorNode3DGizmo,
    handleId: Int,
    secondary: Boolean,
  ): String {
    throw NotImplementedError("_get_handle_name is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _isHandleHighlighted(
    gizmo: EditorNode3DGizmo,
    handleId: Int,
    secondary: Boolean,
  ): Boolean {
    throw NotImplementedError("_is_handle_highlighted is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _getHandleValue(
    gizmo: EditorNode3DGizmo,
    handleId: Int,
    secondary: Boolean,
  ): Any? {
    throw NotImplementedError("_get_handle_value is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _setHandle(
    gizmo: EditorNode3DGizmo,
    handleId: Int,
    secondary: Boolean,
    camera: Camera3D,
    screenPos: Vector2,
  ) {
  }

  public open fun _commitHandle(
    gizmo: EditorNode3DGizmo,
    handleId: Int,
    secondary: Boolean,
    restore: Any?,
    cancel: Boolean,
  ) {
  }

  public open fun _subgizmosIntersectRay(
    gizmo: EditorNode3DGizmo,
    camera: Camera3D,
    screenPos: Vector2,
  ): Int {
    throw NotImplementedError("_subgizmos_intersect_ray is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _subgizmosIntersectFrustum(
    gizmo: EditorNode3DGizmo,
    camera: Camera3D,
    frustumPlanes: VariantArray<Plane>,
  ): PackedInt32Array {
    throw NotImplementedError("_subgizmos_intersect_frustum is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _getSubgizmoTransform(gizmo: EditorNode3DGizmo, subgizmoId: Int): Transform3D {
    throw NotImplementedError("_get_subgizmo_transform is not implemented for EditorNode3DGizmoPlugin")
  }

  public open fun _setSubgizmoTransform(
    gizmo: EditorNode3DGizmo,
    subgizmoId: Int,
    transform: Transform3D,
  ) {
  }

  public open fun _commitSubgizmos(
    gizmo: EditorNode3DGizmo,
    ids: PackedInt32Array,
    restores: VariantArray<Transform3D>,
    cancel: Boolean,
  ) {
  }

  @JvmOverloads
  public fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to name, COLOR to color, BOOL to billboard, BOOL to onTop, BOOL to useVertexColor)
    TransferContext.callMethod(rawPtr, MethodBindings.createMaterialPtr, NIL)
  }

  @JvmOverloads
  public fun createIconMaterial(
    name: String,
    texture: Texture2D,
    onTop: Boolean = false,
    color: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to texture, BOOL to onTop, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.createIconMaterialPtr, NIL)
  }

  @JvmOverloads
  public fun createHandleMaterial(
    name: String,
    billboard: Boolean = false,
    texture: Texture2D? = null,
  ) {
    TransferContext.writeArguments(STRING to name, BOOL to billboard, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.createHandleMaterialPtr, NIL)
  }

  public fun addMaterial(name: String, material: StandardMaterial3D) {
    TransferContext.writeArguments(STRING to name, OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.addMaterialPtr, NIL)
  }

  @JvmOverloads
  public fun getMaterial(name: String, gizmo: EditorNode3DGizmo? = null): StandardMaterial3D? {
    TransferContext.writeArguments(STRING to name, OBJECT to gizmo)
    TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StandardMaterial3D?)
  }

  public companion object

  internal object MethodBindings {
    public val _hasGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_has_gizmo")

    public val _createGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_create_gizmo")

    public val _getGizmoNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_get_gizmo_name")

    public val _getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_get_priority")

    public val _canBeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_can_be_hidden")

    public val _isSelectableWhenHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_is_selectable_when_hidden")

    public val _redrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_redraw")

    public val _getHandleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_get_handle_name")

    public val _isHandleHighlightedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_is_handle_highlighted")

    public val _getHandleValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_get_handle_value")

    public val _setHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_set_handle")

    public val _commitHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_commit_handle")

    public val _subgizmosIntersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_subgizmos_intersect_ray")

    public val _subgizmosIntersectFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_subgizmos_intersect_frustum")

    public val _getSubgizmoTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_get_subgizmo_transform")

    public val _setSubgizmoTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_set_subgizmo_transform")

    public val _commitSubgizmosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "_commit_subgizmos")

    public val createMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "create_material")

    public val createIconMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "create_icon_material")

    public val createHandleMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "create_handle_material")

    public val addMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "add_material")

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorNode3DGizmoPlugin", "get_material")
  }
}
