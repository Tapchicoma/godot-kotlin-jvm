// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedVector2Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GraphEdit : Control() {
  public val connectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

  public val disconnectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

  public val popupRequest: Signal1<Vector2> by signal("position")

  public val duplicateNodesRequest: Signal0 by signal()

  public val copyNodesRequest: Signal0 by signal()

  public val pasteNodesRequest: Signal0 by signal()

  public val nodeSelected: Signal1<Node> by signal("node")

  public val nodeDeselected: Signal1<Node> by signal("node")

  public val connectionToEmpty: Signal3<StringName, Long, Vector2> by signal("fromNode", "fromPort",
      "releasePosition")

  public val connectionFromEmpty: Signal3<StringName, Long, Vector2> by signal("toNode", "toPort",
      "releasePosition")

  public val deleteNodesRequest: Signal1<VariantArray<StringName>> by signal("nodes")

  public val beginNodeMove: Signal0 by signal()

  public val endNodeMove: Signal0 by signal()

  public val scrollOffsetChanged: Signal1<Vector2> by signal("offset")

  public val connectionDragStarted: Signal3<StringName, Long, Boolean> by signal("fromNode",
      "fromPort", "isOutput")

  public val connectionDragEnded: Signal0 by signal()

  public var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRightDisconnectsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRightDisconnectsPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollOfsPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollOfsPtr, NIL)
    }

  public var snapDistance: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnapPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
    }

  public var useSnap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingSnapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseSnapPtr, NIL)
    }

  public var panningScheme: PanningScheme
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanningSchemePtr, LONG)
      return GraphEdit.PanningScheme.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPanningSchemePtr, NIL)
    }

  public var connectionLinesCurvature: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinesCurvaturePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesCurvaturePtr, NIL)
    }

  public var connectionLinesThickness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinesThicknessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesThicknessPtr, NIL)
    }

  public var connectionLinesAntialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isConnectionLinesAntialiasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesAntialiasedPtr, NIL)
    }

  public var zoom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomPtr, NIL)
    }

  public var zoomMin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomMinPtr, NIL)
    }

  public var zoomMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomMaxPtr, NIL)
    }

  public var zoomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomStepPtr, NIL)
    }

  public var showZoomLabel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingZoomLabelPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowZoomLabelPtr, NIL)
    }

  public var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMinimapEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapSizePtr, NIL)
    }

  public var minimapOpacity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapOpacityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapOpacityPtr, NIL)
    }

  public var arrangeNodesButtonHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isArrangeNodesButtonHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setArrangeNodesButtonHiddenPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHEDIT, scriptIndex)
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
   * val myCoreType = graphedit.scrollOffset
   * //Your changes
   * graphedit.scrollOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      block(this)
      scrollOffset = this
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
   * val myCoreType = graphedit.minimapSize
   * //Your changes
   * graphedit.minimapSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun minimapSizeMutate(block: Vector2.() -> Unit): Vector2 = minimapSize.apply{
      block(this)
      minimapSize = this
  }


  public open fun _isInInputHotzone(
    inNode: Object,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_is_in_input_hotzone is not implemented for GraphEdit")
  }

  public open fun _isInOutputHotzone(
    inNode: Object,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_is_in_output_hotzone is not implemented for GraphEdit")
  }

  public open fun _getConnectionLine(fromPosition: Vector2, toPosition: Vector2):
      PackedVector2Array {
    throw NotImplementedError("_get_connection_line is not implemented for GraphEdit")
  }

  public open fun _isNodeHoverValid(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    throw NotImplementedError("_is_node_hover_valid is not implemented for GraphEdit")
  }

  public fun connectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectNodePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isNodeConnected(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun disconnectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ) {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectNodePtr, NIL)
  }

  public fun setConnectionActivity(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
    amount: Float,
  ) {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConnectionActivityPtr, NIL)
  }

  public fun getConnectionList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun clearConnections() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearConnectionsPtr, NIL)
  }

  public fun forceConnectionDragEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceConnectionDragEndPtr, NIL)
  }

  public fun addValidRightDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidRightDisconnectTypePtr, NIL)
  }

  public fun removeValidRightDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidRightDisconnectTypePtr, NIL)
  }

  public fun addValidLeftDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidLeftDisconnectTypePtr, NIL)
  }

  public fun removeValidLeftDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidLeftDisconnectTypePtr, NIL)
  }

  public fun addValidConnectionType(fromType: Int, toType: Int) {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidConnectionTypePtr, NIL)
  }

  public fun removeValidConnectionType(fromType: Int, toType: Int) {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidConnectionTypePtr, NIL)
  }

  public fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isValidConnectionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getConnectionLine(fromNode: Vector2, toNode: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to fromNode, VECTOR2 to toNode)
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getZoomHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?)
  }

  public fun arrangeNodes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.arrangeNodesPtr, NIL)
  }

  public fun setSelected(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
  }

  public enum class PanningScheme(
    id: Long,
  ) {
    SCROLL_ZOOMS(0),
    SCROLL_PANS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PanningScheme = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _isInInputHotzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_in_input_hotzone")

    public val _isInOutputHotzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_in_output_hotzone")

    public val _getConnectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_get_connection_line")

    public val _isNodeHoverValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_node_hover_valid")

    public val connectNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "connect_node")

    public val isNodeConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_node_connected")

    public val disconnectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "disconnect_node")

    public val setConnectionActivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_activity")

    public val getConnectionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_list")

    public val clearConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "clear_connections")

    public val forceConnectionDragEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "force_connection_drag_end")

    public val getScrollOfsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_scroll_ofs")

    public val setScrollOfsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_scroll_ofs")

    public val addValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_right_disconnect_type")

    public val removeValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_right_disconnect_type")

    public val addValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_left_disconnect_type")

    public val removeValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_left_disconnect_type")

    public val addValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_connection_type")

    public val removeValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_connection_type")

    public val isValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_valid_connection_type")

    public val getConnectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_line")

    public val setPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_panning_scheme")

    public val getPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_panning_scheme")

    public val setZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom")

    public val getZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom")

    public val setZoomMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_min")

    public val getZoomMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_min")

    public val setZoomMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_max")

    public val getZoomMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_max")

    public val setZoomStepPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_step")

    public val getZoomStepPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_step")

    public val setShowZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_zoom_label")

    public val isShowingZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_zoom_label")

    public val setSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_snap")

    public val getSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_snap")

    public val setUseSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_use_snap")

    public val isUsingSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "is_using_snap")

    public val setConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_curvature")

    public val getConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_curvature")

    public val setConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_thickness")

    public val getConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_thickness")

    public val setConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_antialiased")

    public val isConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_connection_lines_antialiased")

    public val setMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_size")

    public val getMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_size")

    public val setMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_opacity")

    public val getMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_opacity")

    public val setMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_enabled")

    public val isMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_minimap_enabled")

    public val setArrangeNodesButtonHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_arrange_nodes_button_hidden")

    public val isArrangeNodesButtonHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_arrange_nodes_button_hidden")

    public val setRightDisconnectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_right_disconnects")

    public val isRightDisconnectsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_right_disconnects_enabled")

    public val getZoomHboxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_hbox")

    public val arrangeNodesPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "arrange_nodes")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_selected")
  }
}
