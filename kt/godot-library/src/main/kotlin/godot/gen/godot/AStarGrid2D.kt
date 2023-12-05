// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AStarGrid2D : RefCounted() {
  @CoreTypeLocalCopy
  public var region: Rect2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionPtr, RECT2I)
      return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var cellSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  public var jumpingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isJumpingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJumpingEnabledPtr, NIL)
    }

  public var defaultComputeHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultComputeHeuristicPtr, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultComputeHeuristicPtr, NIL)
    }

  public var defaultEstimateHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultEstimateHeuristicPtr, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultEstimateHeuristicPtr, NIL)
    }

  public var diagonalMode: DiagonalMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiagonalModePtr, LONG)
      return AStarGrid2D.DiagonalMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiagonalModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASTARGRID2D, scriptIndex)
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
   * val myCoreType = astargrid2d.region
   * //Your changes
   * astargrid2d.region = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun regionMutate(block: Rect2i.() -> Unit): Rect2i = region.apply{
      block(this)
      region = this
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
   * val myCoreType = astargrid2d.size
   * //Your changes
   * astargrid2d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
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
   * val myCoreType = astargrid2d.offset
   * //Your changes
   * astargrid2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
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
   * val myCoreType = astargrid2d.cellSize
   * //Your changes
   * astargrid2d.cellSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun cellSizeMutate(block: Vector2.() -> Unit): Vector2 = cellSize.apply{
      block(this)
      cellSize = this
  }


  public open fun _estimateCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStarGrid2D")
  }

  public open fun _computeCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStarGrid2D")
  }

  public fun isInBounds(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInBoundsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isInBoundsv(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isInBoundsvPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isDirty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDirtyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun update() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  @JvmOverloads
  public fun setPointSolid(id: Vector2i, solid: Boolean = true) {
    TransferContext.writeArguments(VECTOR2I to id, BOOL to solid)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointSolidPtr, NIL)
  }

  public fun isPointSolid(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointSolidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setPointWeightScale(id: Vector2i, weightScale: Float) {
    TransferContext.writeArguments(VECTOR2I to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointWeightScalePtr, NIL)
  }

  public fun getPointWeightScale(id: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointWeightScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun getPointPosition(id: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getPointPath(fromId: Vector2i, toId: Vector2i): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getIdPath(fromId: Vector2i, toId: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public enum class Heuristic(
    id: Long,
  ) {
    HEURISTIC_EUCLIDEAN(0),
    HEURISTIC_MANHATTAN(1),
    HEURISTIC_OCTILE(2),
    HEURISTIC_CHEBYSHEV(3),
    HEURISTIC_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Heuristic = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DiagonalMode(
    id: Long,
  ) {
    DIAGONAL_MODE_ALWAYS(0),
    DIAGONAL_MODE_NEVER(1),
    DIAGONAL_MODE_AT_LEAST_ONE_WALKABLE(2),
    DIAGONAL_MODE_ONLY_IF_NO_OBSTACLES(3),
    DIAGONAL_MODE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DiagonalMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _estimateCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "_estimate_cost")

    public val _computeCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "_compute_cost")

    public val setRegionPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_region")

    public val getRegionPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_region")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_size")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_offset")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_cell_size")

    public val isInBoundsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_bounds")

    public val isInBoundsvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_boundsv")

    public val isDirtyPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "is_dirty")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "update")

    public val setJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_jumping_enabled")

    public val isJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_jumping_enabled")

    public val setDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_diagonal_mode")

    public val getDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_diagonal_mode")

    public val setDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_compute_heuristic")

    public val getDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_compute_heuristic")

    public val setDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_estimate_heuristic")

    public val getDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_estimate_heuristic")

    public val setPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_solid")

    public val isPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_point_solid")

    public val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_weight_scale")

    public val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_weight_scale")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "clear")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_position")

    public val getPointPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_path")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_id_path")
  }
}
