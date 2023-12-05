// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class NavigationRegion3D : Node3D() {
  public val navigationMeshChanged: Signal0 by signal()

  public val bakeFinished: Signal0 by signal()

  public var navigationMesh: NavigationMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMeshPtr, NIL)
    }

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

  public var useEdgeConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseEdgeConnectionsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseEdgeConnectionsPtr, NIL)
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
    callConstructor(ENGINECLASS_NAVIGATIONREGION3D, scriptIndex)
    return true
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

  public fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun bakeNavigationMesh(onThread: Boolean = true) {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeNavigationMeshPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_mesh")

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_mesh")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_enabled")

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "is_enabled")

    public val setUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_use_edge_connections")

    public val getUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_use_edge_connections")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_layers")

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_layer_value")

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_layer_value")

    public val getRegionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_region_rid")

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_enter_cost")

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_enter_cost")

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_travel_cost")

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_travel_cost")

    public val bakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "bake_navigation_mesh")
  }
}
