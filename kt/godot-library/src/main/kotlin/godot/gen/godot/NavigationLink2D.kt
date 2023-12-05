// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class NavigationLink2D : Node2D() {
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  public var bidirectional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBidirectionalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBidirectionalPtr, NIL)
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
  public var endPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEndPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEndPositionPtr, NIL)
    }

  public var enterCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnterCostPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnterCostPtr, NIL)
    }

  public var travelCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTravelCostPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTravelCostPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONLINK2D, scriptIndex)
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
   * val myCoreType = navigationlink2d.startPosition
   * //Your changes
   * navigationlink2d.startPosition = myCoreType
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
   * val myCoreType = navigationlink2d.endPosition
   * //Your changes
   * navigationlink2d.endPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun endPositionMutate(block: Vector2.() -> Unit): Vector2 = endPosition.apply{
      block(this)
      endPosition = this
  }


  public fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  public fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setGlobalStartPosition(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlobalStartPositionPtr, NIL)
  }

  public fun getGlobalStartPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalStartPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setGlobalEndPosition(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlobalEndPositionPtr, NIL)
  }

  public fun getGlobalEndPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalEndPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_enabled")

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "is_enabled")

    public val setBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_bidirectional")

    public val isBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "is_bidirectional")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_navigation_layers")

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_navigation_layer_value")

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_navigation_layer_value")

    public val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_start_position")

    public val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_start_position")

    public val setEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_end_position")

    public val getEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_end_position")

    public val setGlobalStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_global_start_position")

    public val getGlobalStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_global_start_position")

    public val setGlobalEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_global_end_position")

    public val getGlobalEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_global_end_position")

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_enter_cost")

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_enter_cost")

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "set_travel_cost")

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink2D", "get_travel_cost")
  }
}
