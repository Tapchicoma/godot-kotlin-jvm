// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class MeshLibrary : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHLIBRARY, scriptIndex)
    return true
  }

  public fun createItem(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createItemPtr, NIL)
  }

  public fun setItemName(id: Int, name: String) {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemNamePtr, NIL)
  }

  public fun setItemMesh(id: Int, mesh: Mesh) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMeshPtr, NIL)
  }

  public fun setItemMeshTransform(id: Int, meshTransform: Transform3D) {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to meshTransform)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMeshTransformPtr, NIL)
  }

  public fun setItemNavigationMesh(id: Int, navigationMesh: NavigationMesh) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemNavigationMeshPtr, NIL)
  }

  public fun setItemNavigationMeshTransform(id: Int, navigationMesh: Transform3D) {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemNavigationMeshTransformPtr, NIL)
  }

  public fun setItemNavigationLayers(id: Int, navigationLayers: Long) {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemNavigationLayersPtr, NIL)
  }

  public fun setItemShapes(id: Int, shapes: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to id.toLong(), ARRAY to shapes)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemShapesPtr, NIL)
  }

  public fun setItemPreview(id: Int, texture: Texture2D) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemPreviewPtr, NIL)
  }

  public fun getItemName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getItemMesh(id: Int): Mesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
  }

  public fun getItemMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMeshTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getItemNavigationMesh(id: Int): NavigationMesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  public fun getItemNavigationMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemNavigationMeshTransformPtr,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getItemNavigationLayers(id: Int): Long {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getItemShapes(id: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemShapesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getItemPreview(id: Int): Texture2D? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemPreviewPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun removeItem(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  public fun findItemByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findItemByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun getItemList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getItemListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getLastUnusedItemId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastUnusedItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val createItemPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshLibrary", "create_item")

    public val setItemNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_name")

    public val setItemMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_mesh")

    public val setItemMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_mesh_transform")

    public val setItemNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh")

    public val setItemNavigationMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh_transform")

    public val setItemNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_layers")

    public val setItemShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_shapes")

    public val setItemPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_preview")

    public val getItemNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_name")

    public val getItemMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_mesh")

    public val getItemMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_mesh_transform")

    public val getItemNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh")

    public val getItemNavigationMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh_transform")

    public val getItemNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_layers")

    public val getItemShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_shapes")

    public val getItemPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_preview")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshLibrary", "remove_item")

    public val findItemByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "find_item_by_name")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshLibrary", "clear")

    public val getItemListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_list")

    public val getLastUnusedItemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_last_unused_item_id")
  }
}
