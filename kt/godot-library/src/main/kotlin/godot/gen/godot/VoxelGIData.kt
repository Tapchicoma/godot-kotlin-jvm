// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class VoxelGIData : Resource() {
  public var dynamicRange: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDynamicRangePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDynamicRangePtr, NIL)
    }

  public var energy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnergyPtr, NIL)
    }

  public var bias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
    }

  public var normalBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalBiasPtr, NIL)
    }

  public var propagation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPropagationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPropagationPtr, NIL)
    }

  public var useTwoBounces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingTwoBouncesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTwoBouncesPtr, NIL)
    }

  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isInteriorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInteriorPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VOXELGIDATA, scriptIndex)
    return true
  }

  public fun allocate(
    toCellXform: Transform3D,
    aabb: CoreAABB,
    octreeSize: Vector3,
    octreeCells: PackedByteArray,
    dataCells: PackedByteArray,
    distanceField: PackedByteArray,
    levelCounts: PackedInt32Array,
  ) {
    TransferContext.writeArguments(TRANSFORM3D to toCellXform, VariantTypeAABB to aabb, VECTOR3 to octreeSize, PACKED_BYTE_ARRAY to octreeCells, PACKED_BYTE_ARRAY to dataCells, PACKED_BYTE_ARRAY to distanceField, PACKED_INT_32_ARRAY to levelCounts)
    TransferContext.callMethod(rawPtr, MethodBindings.allocatePtr, NIL)
  }

  public fun getBounds(): CoreAABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoundsPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun getOctreeSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOctreeSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getToCellXform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getToCellXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getOctreeCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOctreeCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun getDataCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun getLevelCounts(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLevelCountsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public companion object

  internal object MethodBindings {
    public val allocatePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "allocate")

    public val getBoundsPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_bounds")

    public val getOctreeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_size")

    public val getToCellXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_to_cell_xform")

    public val getOctreeCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_cells")

    public val getDataCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_data_cells")

    public val getLevelCountsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_level_counts")

    public val setDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_dynamic_range")

    public val getDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_dynamic_range")

    public val setEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_energy")

    public val getEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_energy")

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_bias")

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_bias")

    public val setNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_normal_bias")

    public val getNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_normal_bias")

    public val setPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_propagation")

    public val getPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_propagation")

    public val setInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_interior")

    public val isInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "is_interior")

    public val setUseTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_use_two_bounces")

    public val isUsingTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "is_using_two_bounces")
  }
}
