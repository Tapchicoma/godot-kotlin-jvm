// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object NavigationMeshGenerator : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NAVIGATIONMESHGENERATOR)
    return false
  }

  public fun bake(navigationMesh: NavigationMesh, rootNode: Node) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  public fun clear(navigationMesh: NavigationMesh) {
    TransferContext.writeArguments(OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  @JvmOverloads
  public fun parseSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    rootNode: Node,
    callback: Callable = Callable(),
  ) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  @JvmOverloads
  public fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    callback: Callable = Callable(),
  ) {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  internal object MethodBindings {
    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationMeshGenerator", "bake")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationMeshGenerator", "clear")

    public val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshGenerator", "parse_source_geometry_data")

    public val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshGenerator", "bake_from_source_geometry_data")
  }
}
