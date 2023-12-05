// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.NavigationPathQueryParameters2D.PathMetadataFlags
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline

@GodotBaseType
public open class NavigationPathQueryParameters2D : RefCounted() {
  public var map: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMapPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var startPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStartPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStartPositionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
    }

  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
    }

  public var pathfindingAlgorithm: PathfindingAlgorithm
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
      return NavigationPathQueryParameters2D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
    }

  public var pathPostprocessing: PathPostProcessing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPostprocessingPtr, LONG)
      return NavigationPathQueryParameters2D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPostprocessingPtr, NIL)
    }

  public var metadataFlags: PathMetadataFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMetadataFlagsPtr, LONG)
      return godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetadataFlagsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYPARAMETERS2D, scriptIndex)
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
   * val myCoreType = navigationpathqueryparameters2d.startPosition
   * //Your changes
   * navigationpathqueryparameters2d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun startPositionMutate(block: Vector2.() -> Unit): Vector2 = startPosition.apply{
      block(this)
      startPosition = this
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
   * val myCoreType = navigationpathqueryparameters2d.targetPosition
   * //Your changes
   * navigationpathqueryparameters2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public enum class PathfindingAlgorithm(
    id: Long,
  ) {
    PATHFINDING_ALGORITHM_ASTAR(0),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathfindingAlgorithm = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PathPostProcessing(
    id: Long,
  ) {
    PATH_POSTPROCESSING_CORRIDORFUNNEL(0),
    PATH_POSTPROCESSING_EDGECENTERED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathPostProcessing = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface PathMetadataFlags {
    public val flag: Long

    public infix fun or(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.or(other))

    public infix fun xor(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.xor(other))

    public infix fun and(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.and(other))

    public operator fun plus(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other))

    public operator fun minus(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags
        = PathMetadataFlagsValue(flag.minus(other))

    public operator fun times(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags
        = PathMetadataFlagsValue(flag.times(other))

    public operator fun div(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other))

    public operator fun rem(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags):
        godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other))

    public fun unaryPlus(): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.unaryMinus())

    public fun inv(): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag.inv())

    public infix fun shl(bits: Int): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.NavigationPathQueryParameters2D.PathMetadataFlags =
        PathMetadataFlagsValue(flag ushr bits)

    public companion object {
      public val PATH_METADATA_INCLUDE_NONE: godot.NavigationPathQueryParameters2D.PathMetadataFlags
          = godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(0)

      public val PATH_METADATA_INCLUDE_TYPES:
          godot.NavigationPathQueryParameters2D.PathMetadataFlags =
          godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(1)

      public val PATH_METADATA_INCLUDE_RIDS: godot.NavigationPathQueryParameters2D.PathMetadataFlags
          = godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(2)

      public val PATH_METADATA_INCLUDE_OWNERS:
          godot.NavigationPathQueryParameters2D.PathMetadataFlags =
          godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(4)

      public val PATH_METADATA_INCLUDE_ALL: godot.NavigationPathQueryParameters2D.PathMetadataFlags
          = godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue(7)
    }
  }

  @JvmInline
  internal value class PathMetadataFlagsValue internal constructor(
    override val flag: Long,
  ) : godot.NavigationPathQueryParameters2D.PathMetadataFlags

  public companion object

  internal object MethodBindings {
    public val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_pathfinding_algorithm")

    public val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_pathfinding_algorithm")

    public val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_path_postprocessing")

    public val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_path_postprocessing")

    public val setMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_map")

    public val getMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_map")

    public val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_start_position")

    public val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_start_position")

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_target_position")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_target_position")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_navigation_layers")

    public val setMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_metadata_flags")

    public val getMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_metadata_flags")
  }
}

public infix fun Long.or(other: PathMetadataFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: PathMetadataFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: PathMetadataFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: PathMetadataFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: PathMetadataFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: PathMetadataFlags): Long = this.times(other.flag)

public operator fun Long.div(other: PathMetadataFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: PathMetadataFlags): Long = this.rem(other.flag)
