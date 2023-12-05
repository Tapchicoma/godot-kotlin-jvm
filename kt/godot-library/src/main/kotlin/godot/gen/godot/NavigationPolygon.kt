// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class NavigationPolygon : Resource() {
  public var vertices: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON, scriptIndex)
    return true
  }

  public fun addPolygon(polygon: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun clearPolygons() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  public fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  public fun addOutline(outline: PackedVector2Array) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlinePtr, NIL)
  }

  public fun addOutlineAtIndex(outline: PackedVector2Array, index: Int) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlineAtIndexPtr, NIL)
  }

  public fun getOutlineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setOutline(idx: Int, outline: PackedVector2Array) {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutlinePtr, NIL)
  }

  public fun getOutline(idx: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun removeOutline(idx: Int) {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOutlinePtr, NIL)
  }

  public fun clearOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearOutlinesPtr, NIL)
  }

  public fun makePolygonsFromOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makePolygonsFromOutlinesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_vertices")

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_polygon")

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon_count")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon")

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_polygons")

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_navigation_mesh")

    public val addOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline")

    public val addOutlineAtIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline_at_index")

    public val getOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline_count")

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_outline")

    public val getOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline")

    public val removeOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "remove_outline")

    public val clearOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_outlines")

    public val makePolygonsFromOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "make_polygons_from_outlines")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_cell_size")
  }
}
