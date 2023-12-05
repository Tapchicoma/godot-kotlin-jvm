// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class MeshInstance3D : GeometryInstance3D() {
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  public var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
    }

  public var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPathPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHINSTANCE3D, scriptIndex)
    return true
  }

  public fun getSurfaceOverrideMaterialCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceOverrideMaterialCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSurfaceOverrideMaterial(surface: Int, material: Material) {
    TransferContext.writeArguments(LONG to surface.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setSurfaceOverrideMaterialPtr, NIL)
  }

  public fun getSurfaceOverrideMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceOverrideMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public fun getActiveMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActiveMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public fun createTrimeshCollision() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTrimeshCollisionPtr, NIL)
  }

  @JvmOverloads
  public fun createConvexCollision(clean: Boolean = true, simplify: Boolean = false) {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr, MethodBindings.createConvexCollisionPtr, NIL)
  }

  @JvmOverloads
  public fun createMultipleConvexCollisions(settings: MeshConvexDecompositionSettings? = null) {
    TransferContext.writeArguments(OBJECT to settings)
    TransferContext.callMethod(rawPtr, MethodBindings.createMultipleConvexCollisionsPtr, NIL)
  }

  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findBlendShapeByName(name: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findBlendShapeByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBlendShapeValue(blendShapeIdx: Int): Float {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBlendShapeValue(blendShapeIdx: Int, `value`: Float) {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong(), DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeValuePtr, NIL)
  }

  public fun createDebugTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createDebugTangentsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshInstance3D", "set_mesh")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshInstance3D", "get_mesh")

    public val setSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_skeleton_path")

    public val getSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_skeleton_path")

    public val setSkinPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshInstance3D", "set_skin")

    public val getSkinPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshInstance3D", "get_skin")

    public val getSurfaceOverrideMaterialCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_surface_override_material_count")

    public val setSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_surface_override_material")

    public val getSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_surface_override_material")

    public val getActiveMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_active_material")

    public val createTrimeshCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_trimesh_collision")

    public val createConvexCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_convex_collision")

    public val createMultipleConvexCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_multiple_convex_collisions")

    public val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_blend_shape_count")

    public val findBlendShapeByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "find_blend_shape_by_name")

    public val getBlendShapeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_blend_shape_value")

    public val setBlendShapeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_blend_shape_value")

    public val createDebugTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_debug_tangents")
  }
}
