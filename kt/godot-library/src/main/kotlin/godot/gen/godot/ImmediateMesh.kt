// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ImmediateMesh : Mesh() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMMEDIATEMESH, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun surfaceBegin(primitive: Mesh.PrimitiveType, material: Material? = null) {
    TransferContext.writeArguments(LONG to primitive.id, OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceBeginPtr, NIL)
  }

  public fun surfaceSetColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetColorPtr, NIL)
  }

  public fun surfaceSetNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetNormalPtr, NIL)
  }

  public fun surfaceSetTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetTangentPtr, NIL)
  }

  public fun surfaceSetUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetUvPtr, NIL)
  }

  public fun surfaceSetUv2(uv2: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetUv2Ptr, NIL)
  }

  public fun surfaceAddVertex(vertex: Vector3) {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceAddVertexPtr, NIL)
  }

  public fun surfaceAddVertex2d(vertex: Vector2) {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceAddVertex2dPtr, NIL)
  }

  public fun surfaceEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceEndPtr, NIL)
  }

  public fun clearSurfaces() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSurfacesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val surfaceBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_begin")

    public val surfaceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_color")

    public val surfaceSetNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_normal")

    public val surfaceSetTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_tangent")

    public val surfaceSetUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv")

    public val surfaceSetUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv2")

    public val surfaceAddVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex")

    public val surfaceAddVertex2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex_2d")

    public val surfaceEndPtr: VoidPtr = TypeManager.getMethodBindPtr("ImmediateMesh", "surface_end")

    public val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "clear_surfaces")
  }
}
