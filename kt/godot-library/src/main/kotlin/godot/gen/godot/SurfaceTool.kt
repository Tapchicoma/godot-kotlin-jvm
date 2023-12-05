// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class SurfaceTool : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SURFACETOOL, scriptIndex)
    return true
  }

  public fun setSkinWeightCount(count: SkinWeightCount) {
    TransferContext.writeArguments(LONG to count.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSkinWeightCountPtr, NIL)
  }

  public fun getSkinWeightCount(): SkinWeightCount {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkinWeightCountPtr, LONG)
    return SurfaceTool.SkinWeightCount.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setCustomFormat(channelIndex: Int, format: CustomFormat) {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFormatPtr, NIL)
  }

  public fun getCustomFormat(channelIndex: Int): CustomFormat {
    TransferContext.writeArguments(LONG to channelIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFormatPtr, LONG)
    return SurfaceTool.CustomFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun begin(primitive: Mesh.PrimitiveType) {
    TransferContext.writeArguments(LONG to primitive.id)
    TransferContext.callMethod(rawPtr, MethodBindings.beginPtr, NIL)
  }

  public fun addVertex(vertex: Vector3) {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.addVertexPtr, NIL)
  }

  public fun setColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public fun setNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.setNormalPtr, NIL)
  }

  public fun setTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.setTangentPtr, NIL)
  }

  public fun setUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.setUvPtr, NIL)
  }

  public fun setUv2(uv2: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.setUv2Ptr, NIL)
  }

  public fun setBones(bones: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonesPtr, NIL)
  }

  public fun setWeights(weights: PackedFloat32Array) {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.setWeightsPtr, NIL)
  }

  public fun setCustom(channelIndex: Int, customColor: Color) {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), COLOR to customColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomPtr, NIL)
  }

  public fun setSmoothGroup(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.setSmoothGroupPtr, NIL)
  }

  @JvmOverloads
  public fun addTriangleFan(
    vertices: PackedVector3Array,
    uvs: PackedVector2Array = PackedVector2Array(),
    colors: PackedColorArray = PackedColorArray(),
    uv2s: PackedVector2Array = PackedVector2Array(),
    normals: PackedVector3Array = PackedVector3Array(),
    tangents: VariantArray<Plane> = godot.core.variantArrayOf(),
  ) {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_VECTOR2_ARRAY to uvs, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uv2s, PACKED_VECTOR3_ARRAY to normals, ARRAY to tangents)
    TransferContext.callMethod(rawPtr, MethodBindings.addTriangleFanPtr, NIL)
  }

  public fun addIndex(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIndexPtr, NIL)
  }

  public fun index() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.indexPtr, NIL)
  }

  public fun deindex() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deindexPtr, NIL)
  }

  @JvmOverloads
  public fun generateNormals(flip: Boolean = false) {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(rawPtr, MethodBindings.generateNormalsPtr, NIL)
  }

  public fun generateTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTangentsPtr, NIL)
  }

  public fun optimizeIndicesForCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.optimizeIndicesForCachePtr, NIL)
  }

  public fun getAabb(): CoreAABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  @JvmOverloads
  public fun generateLod(ndThreshold: Float, targetIndexCount: Int = 3): PackedInt32Array {
    TransferContext.writeArguments(DOUBLE to ndThreshold.toDouble(), LONG to targetIndexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.generateLodPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setMaterial(material: Material) {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public fun getPrimitiveType(): Mesh.PrimitiveType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun createFrom(existing: Mesh, surface: Int) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromPtr, NIL)
  }

  public fun createFromBlendShape(
    existing: Mesh,
    surface: Int,
    blendShape: String,
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), STRING to blendShape)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromBlendShapePtr, NIL)
  }

  public fun appendFrom(
    existing: Mesh,
    surface: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromPtr, NIL)
  }

  @JvmOverloads
  public fun commit(existing: ArrayMesh? = null, flags: Long = 0): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.commitPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
  }

  public fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.commitToArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class CustomFormat(
    id: Long,
  ) {
    CUSTOM_RGBA8_UNORM(0),
    CUSTOM_RGBA8_SNORM(1),
    CUSTOM_RG_HALF(2),
    CUSTOM_RGBA_HALF(3),
    CUSTOM_R_FLOAT(4),
    CUSTOM_RG_FLOAT(5),
    CUSTOM_RGB_FLOAT(6),
    CUSTOM_RGBA_FLOAT(7),
    CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CustomFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SkinWeightCount(
    id: Long,
  ) {
    SKIN_4_WEIGHTS(0),
    SKIN_8_WEIGHTS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SkinWeightCount = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_skin_weight_count")

    public val getSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_skin_weight_count")

    public val setCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_custom_format")

    public val getCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_custom_format")

    public val beginPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "begin")

    public val addVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "add_vertex")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_color")

    public val setNormalPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_normal")

    public val setTangentPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_tangent")

    public val setUvPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_uv")

    public val setUv2Ptr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_uv2")

    public val setBonesPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_bones")

    public val setWeightsPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_weights")

    public val setCustomPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_custom")

    public val setSmoothGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_smooth_group")

    public val addTriangleFanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "add_triangle_fan")

    public val addIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "add_index")

    public val indexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "index")

    public val deindexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "deindex")

    public val generateNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_normals")

    public val generateTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_tangents")

    public val optimizeIndicesForCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "optimize_indices_for_cache")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "get_aabb")

    public val generateLodPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "generate_lod")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_material")

    public val getPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_primitive_type")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "clear")

    public val createFromPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "create_from")

    public val createFromBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from_blend_shape")

    public val appendFromPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "append_from")

    public val commitPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "commit")

    public val commitToArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "commit_to_arrays")
  }
}
