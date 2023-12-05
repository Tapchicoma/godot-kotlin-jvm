// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Mesh.ArrayFormatValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class ArrayMesh : Mesh() {
  public var blendShapeMode: Mesh.BlendShapeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeModePtr, LONG)
      return Mesh.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeModePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var customAabb: CoreAABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomAabbPtr, VariantTypeAABB)
      return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
    }
    set(`value`) {
      TransferContext.writeArguments(VariantTypeAABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
    }

  public var shadowMesh: ArrayMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowMeshPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ARRAYMESH, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = arraymesh.customAabb
   * //Your changes
   * arraymesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabbMutate(block: CoreAABB.() -> Unit): CoreAABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  public fun addBlendShape(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendShapePtr, NIL)
  }

  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBlendShapeName(index: Int): StringName {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendShapeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBlendShapeName(index: Int, name: StringName) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendShapeNamePtr, NIL)
  }

  public fun clearBlendShapes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBlendShapesPtr, NIL)
  }

  @JvmOverloads
  public fun addSurfaceFromArrays(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    flags: Mesh.ArrayFormat = Mesh.ArrayFormatValue(0),
  ) {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.addSurfaceFromArraysPtr, NIL)
  }

  public fun clearSurfaces() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSurfacesPtr, NIL)
  }

  public fun surfaceUpdateVertexRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateVertexRegionPtr, NIL)
  }

  public fun surfaceUpdateAttributeRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateAttributeRegionPtr, NIL)
  }

  public fun surfaceUpdateSkinRegion(
    surfIdx: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceUpdateSkinRegionPtr, NIL)
  }

  public fun surfaceGetArrayLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetArrayLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetArrayIndexLenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun surfaceGetFormat(surfIdx: Int): Mesh.ArrayFormat {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetFormatPtr, LONG)
    return ArrayFormatValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun surfaceFindByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceFindByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun surfaceSetName(surfIdx: Int, name: String) {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetNamePtr, NIL)
  }

  public fun surfaceGetName(surfIdx: Int): String {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun regenNormalMaps() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.regenNormalMapsPtr, NIL)
  }

  public fun lightmapUnwrap(transform: Transform3D, texelSize: Float): GodotError {
    TransferContext.writeArguments(TRANSFORM3D to transform, DOUBLE to texelSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapUnwrapPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val addBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_blend_shape")

    public val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_count")

    public val getBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_name")

    public val setBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_name")

    public val clearBlendShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_blend_shapes")

    public val setBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_blend_shape_mode")

    public val getBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_blend_shape_mode")

    public val addSurfaceFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "add_surface_from_arrays")

    public val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "clear_surfaces")

    public val surfaceUpdateVertexRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_vertex_region")

    public val surfaceUpdateAttributeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_attribute_region")

    public val surfaceUpdateSkinRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_update_skin_region")

    public val surfaceGetArrayLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_len")

    public val surfaceGetArrayIndexLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_array_index_len")

    public val surfaceGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_format")

    public val surfaceGetPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_primitive_type")

    public val surfaceFindByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_find_by_name")

    public val surfaceSetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_set_name")

    public val surfaceGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "surface_get_name")

    public val regenNormalMapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "regen_normal_maps")

    public val lightmapUnwrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "lightmap_unwrap")

    public val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_custom_aabb")

    public val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_custom_aabb")

    public val setShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "set_shadow_mesh")

    public val getShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayMesh", "get_shadow_mesh")
  }
}
