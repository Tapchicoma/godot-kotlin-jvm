// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Mesh.ArrayFormat
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class Mesh : Resource() {
  @CoreTypeLocalCopy
  public var lightmapSizeHint: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightmapSizeHintPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightmapSizeHintPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESH, scriptIndex)
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
   * val myCoreType = mesh.lightmapSizeHint
   * //Your changes
   * mesh.lightmapSizeHint = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun lightmapSizeHintMutate(block: Vector2i.() -> Unit): Vector2i =
      lightmapSizeHint.apply{
      block(this)
      lightmapSizeHint = this
  }


  public open fun _getSurfaceCount(): Int {
    throw NotImplementedError("_get_surface_count is not implemented for Mesh")
  }

  public open fun _surfaceGetArrayLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_len is not implemented for Mesh")
  }

  public open fun _surfaceGetArrayIndexLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_index_len is not implemented for Mesh")
  }

  public open fun _surfaceGetArrays(index: Int): VariantArray<Any?> {
    throw NotImplementedError("_surface_get_arrays is not implemented for Mesh")
  }

  public open fun _surfaceGetBlendShapeArrays(index: Int): VariantArray<VariantArray<Any?>> {
    throw NotImplementedError("_surface_get_blend_shape_arrays is not implemented for Mesh")
  }

  public open fun _surfaceGetLods(index: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_surface_get_lods is not implemented for Mesh")
  }

  public open fun _surfaceGetFormat(index: Int): Long {
    throw NotImplementedError("_surface_get_format is not implemented for Mesh")
  }

  public open fun _surfaceGetPrimitiveType(index: Int): Long {
    throw NotImplementedError("_surface_get_primitive_type is not implemented for Mesh")
  }

  public open fun _surfaceSetMaterial(index: Int, material: Material) {
  }

  public open fun _surfaceGetMaterial(index: Int): Material? {
    throw NotImplementedError("_surface_get_material is not implemented for Mesh")
  }

  public open fun _getBlendShapeCount(): Int {
    throw NotImplementedError("_get_blend_shape_count is not implemented for Mesh")
  }

  public open fun _getBlendShapeName(index: Int): StringName {
    throw NotImplementedError("_get_blend_shape_name is not implemented for Mesh")
  }

  public open fun _setBlendShapeName(index: Int, name: StringName) {
  }

  public open fun _getAabb(): CoreAABB {
    throw NotImplementedError("_get_aabb is not implemented for Mesh")
  }

  public fun getAabb(): CoreAABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFacesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun getSurfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun surfaceGetArrays(surfIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetBlendShapeArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  public fun surfaceSetMaterial(surfIdx: Int, material: Material) {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetMaterialPtr, NIL)
  }

  public fun surfaceGetMaterial(surfIdx: Int): Material? {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceGetMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public fun createTrimeshShape(): ConcavePolygonShape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTrimeshShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ConcavePolygonShape3D?)
  }

  @JvmOverloads
  public fun createConvexShape(clean: Boolean = true, simplify: Boolean = false):
      ConvexPolygonShape3D? {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr, MethodBindings.createConvexShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ConvexPolygonShape3D?)
  }

  public fun createOutline(margin: Float): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.createOutlinePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?Mesh)
  }

  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?)
  }

  public enum class PrimitiveType(
    id: Long,
  ) {
    PRIMITIVE_POINTS(0),
    PRIMITIVE_LINES(1),
    PRIMITIVE_LINE_STRIP(2),
    PRIMITIVE_TRIANGLES(3),
    PRIMITIVE_TRIANGLE_STRIP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PrimitiveType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ArrayType(
    id: Long,
  ) {
    ARRAY_VERTEX(0),
    ARRAY_NORMAL(1),
    ARRAY_TANGENT(2),
    ARRAY_COLOR(3),
    ARRAY_TEX_UV(4),
    ARRAY_TEX_UV2(5),
    ARRAY_CUSTOM0(6),
    ARRAY_CUSTOM1(7),
    ARRAY_CUSTOM2(8),
    ARRAY_CUSTOM3(9),
    ARRAY_BONES(10),
    ARRAY_WEIGHTS(11),
    ARRAY_INDEX(12),
    ARRAY_MAX(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long,
  ) {
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    ARRAY_CUSTOM_RG_HALF(2),
    ARRAY_CUSTOM_RGBA_HALF(3),
    ARRAY_CUSTOM_R_FLOAT(4),
    ARRAY_CUSTOM_RG_FLOAT(5),
    ARRAY_CUSTOM_RGB_FLOAT(6),
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayCustomFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface ArrayFormat {
    public val flag: Long

    public infix fun or(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.or(other))

    public infix fun xor(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.xor(other))

    public infix fun and(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.and(other))

    public operator fun plus(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.plus(other))

    public operator fun minus(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.minus(other))

    public operator fun times(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.times(other))

    public operator fun div(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.div(other))

    public operator fun rem(other: godot.Mesh.ArrayFormat): godot.Mesh.ArrayFormat =
        ArrayFormatValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.rem(other))

    public fun unaryPlus(): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.unaryPlus())

    public fun unaryMinus(): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.unaryMinus())

    public fun inv(): godot.Mesh.ArrayFormat = ArrayFormatValue(flag.inv())

    public infix fun shl(bits: Int): godot.Mesh.ArrayFormat = ArrayFormatValue(flag shl bits)

    public infix fun shr(bits: Int): godot.Mesh.ArrayFormat = ArrayFormatValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.Mesh.ArrayFormat = ArrayFormatValue(flag ushr bits)

    public companion object {
      public val ARRAY_FORMAT_VERTEX: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(1)

      public val ARRAY_FORMAT_NORMAL: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(2)

      public val ARRAY_FORMAT_TANGENT: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(4)

      public val ARRAY_FORMAT_COLOR: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(8)

      public val ARRAY_FORMAT_TEX_UV: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(16)

      public val ARRAY_FORMAT_TEX_UV2: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(32)

      public val ARRAY_FORMAT_CUSTOM0: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(64)

      public val ARRAY_FORMAT_CUSTOM1: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(128)

      public val ARRAY_FORMAT_CUSTOM2: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(256)

      public val ARRAY_FORMAT_CUSTOM3: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(512)

      public val ARRAY_FORMAT_BONES: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(1_024)

      public val ARRAY_FORMAT_WEIGHTS: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(2_048)

      public val ARRAY_FORMAT_INDEX: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(4_096)

      public val ARRAY_FORMAT_BLEND_SHAPE_MASK: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(7)

      public val ARRAY_FORMAT_CUSTOM_BASE: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM_BITS: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(3)

      public val ARRAY_FORMAT_CUSTOM0_SHIFT: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM1_SHIFT: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(16)

      public val ARRAY_FORMAT_CUSTOM2_SHIFT: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(19)

      public val ARRAY_FORMAT_CUSTOM3_SHIFT: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(22)

      public val ARRAY_FORMAT_CUSTOM_MASK: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(7)

      public val ARRAY_COMPRESS_FLAGS_BASE: godot.Mesh.ArrayFormat = godot.Mesh.ArrayFormatValue(25)

      public val ARRAY_FLAG_USE_2D_VERTICES: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(33_554_432)

      public val ARRAY_FLAG_USE_DYNAMIC_UPDATE: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(67_108_864)

      public val ARRAY_FLAG_USE_8_BONE_WEIGHTS: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(134_217_728)

      public val ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY: godot.Mesh.ArrayFormat =
          godot.Mesh.ArrayFormatValue(268_435_456)
    }
  }

  @JvmInline
  internal value class ArrayFormatValue internal constructor(
    override val flag: Long,
  ) : godot.Mesh.ArrayFormat

  public enum class BlendShapeMode(
    id: Long,
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendShapeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_get_surface_count")

    public val _surfaceGetArrayLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_array_len")

    public val _surfaceGetArrayIndexLenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_array_index_len")

    public val _surfaceGetArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_arrays")

    public val _surfaceGetBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_blend_shape_arrays")

    public val _surfaceGetLodsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_lods")

    public val _surfaceGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_format")

    public val _surfaceGetPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_primitive_type")

    public val _surfaceSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_set_material")

    public val _surfaceGetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_surface_get_material")

    public val _getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_get_blend_shape_count")

    public val _getBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_get_blend_shape_name")

    public val _setBlendShapeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "_set_blend_shape_name")

    public val _getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "_get_aabb")

    public val setLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "set_lightmap_size_hint")

    public val getLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "get_lightmap_size_hint")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "get_aabb")

    public val getFacesPtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "get_faces")

    public val getSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "get_surface_count")

    public val surfaceGetArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_arrays")

    public val surfaceGetBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_blend_shape_arrays")

    public val surfaceSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_set_material")

    public val surfaceGetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_material")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_placeholder")

    public val createTrimeshShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_trimesh_shape")

    public val createConvexShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_convex_shape")

    public val createOutlinePtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "create_outline")

    public val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "generate_triangle_mesh")
  }
}

public infix fun Long.or(other: ArrayFormat): Long = this.or(other.flag)

public infix fun Long.xor(other: ArrayFormat): Long = this.xor(other.flag)

public infix fun Long.and(other: ArrayFormat): Long = this.and(other.flag)

public operator fun Long.plus(other: ArrayFormat): Long = this.plus(other.flag)

public operator fun Long.minus(other: ArrayFormat): Long = this.minus(other.flag)

public operator fun Long.times(other: ArrayFormat): Long = this.times(other.flag)

public operator fun Long.div(other: ArrayFormat): Long = this.div(other.flag)

public operator fun Long.rem(other: ArrayFormat): Long = this.rem(other.flag)
