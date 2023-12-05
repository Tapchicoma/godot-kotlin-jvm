// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TileMap : Node2D() {
  public val changed: Signal0 by signal()

  public var tileSet: TileSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTilesetPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TileSet?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTilesetPtr, NIL)
    }

  public var cellQuadrantSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getQuadrantSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setQuadrantSizePtr, NIL)
    }

  public var collisionAnimatable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollisionAnimatablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionAnimatablePtr, NIL)
    }

  public var collisionVisibilityMode: VisibilityMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionVisibilityModePtr, LONG)
      return TileMap.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionVisibilityModePtr, NIL)
    }

  public var navigationVisibilityMode: VisibilityMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationVisibilityModePtr, LONG)
      return TileMap.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationVisibilityModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILEMAP, scriptIndex)
    return true
  }

  public open fun _useTileDataRuntimeUpdate(layer: Int, coords: Vector2i): Boolean {
    throw NotImplementedError("_use_tile_data_runtime_update is not implemented for TileMap")
  }

  public open fun _tileDataRuntimeUpdate(
    layer: Int,
    coords: Vector2i,
    tileData: TileData,
  ) {
  }

  public fun getLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun addLayer(toPosition: Int) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addLayerPtr, NIL)
  }

  public fun moveLayer(layer: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveLayerPtr, NIL)
  }

  public fun removeLayer(layer: Int) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeLayerPtr, NIL)
  }

  public fun setLayerName(layer: Int, name: String) {
    TransferContext.writeArguments(LONG to layer.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerNamePtr, NIL)
  }

  public fun getLayerName(layer: Int): String {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setLayerEnabled(layer: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerEnabledPtr, NIL)
  }

  public fun isLayerEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLayerEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLayerModulate(layer: Int, modulate: Color) {
    TransferContext.writeArguments(LONG to layer.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerModulatePtr, NIL)
  }

  public fun getLayerModulate(layer: Int): Color {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setLayerYSortEnabled(layer: Int, ySortEnabled: Boolean) {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to ySortEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerYSortEnabledPtr, NIL)
  }

  public fun isLayerYSortEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLayerYSortEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLayerYSortOrigin(layer: Int, ySortOrigin: Int) {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to ySortOrigin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerYSortOriginPtr, NIL)
  }

  public fun getLayerYSortOrigin(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerYSortOriginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setLayerZIndex(layer: Int, zIndex: Int) {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to zIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerZIndexPtr, NIL)
  }

  public fun getLayerZIndex(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerZIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setNavigationMap(layer: Int, map: RID) {
    TransferContext.writeArguments(LONG to layer.toLong(), _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  public fun getNavigationMap(layer: Int): RID {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun setCell(
    layer: Int,
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPtr, NIL)
  }

  public fun eraseCell(layer: Int, coords: Vector2i) {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseCellPtr, NIL)
  }

  @JvmOverloads
  public fun getCellSourceId(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getCellAtlasCoords(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Vector2i {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun getCellAlternativeTile(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getCellTileData(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): TileData? {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileData?)
  }

  public fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.getCoordsForBodyRidPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getLayerForBodyRid(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerForBodyRidPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPattern(layer: Int, coordsArray: VariantArray<Vector2i>): TileMapPattern? {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to coordsArray)
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?)
  }

  public fun mapPattern(
    positionInTilemap: Vector2i,
    coordsInPattern: Vector2i,
    pattern: TileMapPattern,
  ): Vector2i {
    TransferContext.writeArguments(VECTOR2I to positionInTilemap, VECTOR2I to coordsInPattern, OBJECT to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.mapPatternPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun setPattern(
    layer: Int,
    position: Vector2i,
    pattern: TileMapPattern,
  ) {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to position, OBJECT to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.setPatternPtr, NIL)
  }

  @JvmOverloads
  public fun setCellsTerrainConnect(
    layer: Int,
    cells: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to cells, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellsTerrainConnectPtr, NIL)
  }

  @JvmOverloads
  public fun setCellsTerrainPath(
    layer: Int,
    path: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ) {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to path, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellsTerrainPathPtr, NIL)
  }

  public fun fixInvalidTiles() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fixInvalidTilesPtr, NIL)
  }

  public fun clearLayer(layer: Int) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearLayerPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  @JvmOverloads
  public fun forceUpdate(layer: Int = -1) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdatePtr, NIL)
  }

  public fun getSurroundingCells(coords: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getSurroundingCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public fun getUsedCells(layer: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  @JvmOverloads
  public fun getUsedCellsById(
    layer: Int,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsByIdPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public fun mapToLocal(mapPosition: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to mapPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.mapToLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun localToMap(localPosition: Vector2): Vector2i {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.localToMapPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getNeighborCellPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public enum class VisibilityMode(
    id: Long,
  ) {
    VISIBILITY_MODE_DEFAULT(0),
    VISIBILITY_MODE_FORCE_HIDE(2),
    VISIBILITY_MODE_FORCE_SHOW(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VisibilityMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _useTileDataRuntimeUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "_use_tile_data_runtime_update")

    public val _tileDataRuntimeUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "_tile_data_runtime_update")

    public val setTilesetPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_tileset")

    public val getTilesetPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_tileset")

    public val setQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_quadrant_size")

    public val getQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_quadrant_size")

    public val getLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layers_count")

    public val addLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "add_layer")

    public val moveLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "move_layer")

    public val removeLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "remove_layer")

    public val setLayerNamePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_layer_name")

    public val getLayerNamePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_layer_name")

    public val setLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_enabled")

    public val isLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_enabled")

    public val setLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_modulate")

    public val getLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_modulate")

    public val setLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_enabled")

    public val isLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_y_sort_enabled")

    public val setLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_origin")

    public val getLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_y_sort_origin")

    public val setLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_z_index")

    public val getLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_z_index")

    public val setCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_animatable")

    public val isCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_collision_animatable")

    public val setCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_visibility_mode")

    public val getCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_collision_visibility_mode")

    public val setNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_visibility_mode")

    public val getNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_visibility_mode")

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_map")

    public val setCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_cell")

    public val eraseCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "erase_cell")

    public val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_source_id")

    public val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_atlas_coords")

    public val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_alternative_tile")

    public val getCellTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_tile_data")

    public val getCoordsForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_coords_for_body_rid")

    public val getLayerForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_for_body_rid")

    public val getPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_pattern")

    public val mapPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "map_pattern")

    public val setPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_pattern")

    public val setCellsTerrainConnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_connect")

    public val setCellsTerrainPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_path")

    public val fixInvalidTilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "fix_invalid_tiles")

    public val clearLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "clear_layer")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "clear")

    public val forceUpdatePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "force_update")

    public val getSurroundingCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_surrounding_cells")

    public val getUsedCellsPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_used_cells")

    public val getUsedCellsByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_used_cells_by_id")

    public val getUsedRectPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_used_rect")

    public val mapToLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "map_to_local")

    public val localToMapPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "local_to_map")

    public val getNeighborCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_neighbor_cell")
  }
}
