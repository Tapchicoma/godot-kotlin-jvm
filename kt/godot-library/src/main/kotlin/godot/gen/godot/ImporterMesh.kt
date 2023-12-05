// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ImporterMesh : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMPORTERMESH, scriptIndex)
    return true
  }

  public fun addBlendShape(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendShapePtr, NIL)
  }

  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBlendShapeName(blendShapeIdx: Int): String {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setBlendShapeMode(mode: Mesh.BlendShapeMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeModePtr, NIL)
  }

  public fun getBlendShapeMode(): Mesh.BlendShapeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeModePtr, LONG)
    return Mesh.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun addSurface(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    material: Material? = null,
    name: String = "",
    flags: Long = 0,
  ) {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, OBJECT to material, STRING to name, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.addSurfacePtr, NIL)
  }

  public fun getSurfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSurfacePrimitiveType(surfaceIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfacePrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getSurfaceName(surfaceIdx: Int): String {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getSurfaceArrays(surfaceIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getSurfaceBlendShapeArrays(surfaceIdx: Int, blendShapeIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceBlendShapeArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getSurfaceLodCount(surfaceIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceLodCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSurfaceLodSize(surfaceIdx: Int, lodIdx: Int): Float {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceLodSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getSurfaceLodIndices(surfaceIdx: Int, lodIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceLodIndicesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getSurfaceMaterial(surfaceIdx: Int): Material? {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public fun getSurfaceFormat(surfaceIdx: Int): Long {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setSurfaceName(surfaceIdx: Int, name: String) {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setSurfaceNamePtr, NIL)
  }

  public fun setSurfaceMaterial(surfaceIdx: Int, material: Material) {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setSurfaceMaterialPtr, NIL)
  }

  public fun generateLods(
    normalMergeAngle: Float,
    normalSplitAngle: Float,
    boneTransformArray: VariantArray<Any?>,
  ) {
    TransferContext.writeArguments(DOUBLE to normalMergeAngle.toDouble(), DOUBLE to normalSplitAngle.toDouble(), ARRAY to boneTransformArray)
    TransferContext.callMethod(rawPtr, MethodBindings.generateLodsPtr, NIL)
  }

  @JvmOverloads
  public fun getMesh(baseMesh: ArrayMesh? = null): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to baseMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun setLightmapSizeHint(size: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setLightmapSizeHintPtr, NIL)
  }

  public fun getLightmapSizeHint(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLightmapSizeHintPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public companion object

  internal object MethodBindings {
    public val addBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "add_blend_shape")

    public val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_blend_shape_count")

    public val getBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_blend_shape_name")

    public val setBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "set_blend_shape_mode")

    public val getBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_blend_shape_mode")

    public val addSurfacePtr: VoidPtr = TypeManager.getMethodBindPtr("ImporterMesh", "add_surface")

    public val getSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_count")

    public val getSurfacePrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_primitive_type")

    public val getSurfaceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_name")

    public val getSurfaceArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_arrays")

    public val getSurfaceBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_blend_shape_arrays")

    public val getSurfaceLodCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_lod_count")

    public val getSurfaceLodSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_lod_size")

    public val getSurfaceLodIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_lod_indices")

    public val getSurfaceMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_material")

    public val getSurfaceFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_surface_format")

    public val setSurfaceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "set_surface_name")

    public val setSurfaceMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "set_surface_material")

    public val generateLodsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "generate_lods")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("ImporterMesh", "get_mesh")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ImporterMesh", "clear")

    public val setLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "set_lightmap_size_hint")

    public val getLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMesh", "get_lightmap_size_hint")
  }
}
