// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TileSet : Resource() {
  public var tileShape: TileShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileShapePtr, LONG)
      return TileSet.TileShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileShapePtr, NIL)
    }

  public var tileLayout: TileLayout
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileLayoutPtr, LONG)
      return TileSet.TileLayout.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileLayoutPtr, NIL)
    }

  public var tileOffsetAxis: TileOffsetAxis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileOffsetAxisPtr, LONG)
      return TileSet.TileOffsetAxis.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileOffsetAxisPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var tileSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileSizePtr, NIL)
    }

  public var uvClipping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUvClippingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUvClippingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESET, scriptIndex)
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
   * val myCoreType = tileset.tileSize
   * //Your changes
   * tileset.tileSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tileSizeMutate(block: Vector2i.() -> Unit): Vector2i = tileSize.apply{
      block(this)
      tileSize = this
  }


  public fun getNextSourceId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addSource(source: TileSetSource, atlasSourceIdOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to source, LONG to atlasSourceIdOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSourcePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeSource(sourceId: Int) {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSourcePtr, NIL)
  }

  public fun setSourceId(sourceId: Int, newSourceId: Int) {
    TransferContext.writeArguments(LONG to sourceId.toLong(), LONG to newSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceIdPtr, NIL)
  }

  public fun getSourceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSourceId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasSource(sourceId: Int): Boolean {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSource(sourceId: Int): TileSetSource? {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileSetSource?)
  }

  public fun getOcclusionLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addOcclusionLayer(toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOcclusionLayerPtr, NIL)
  }

  public fun moveOcclusionLayer(layerIndex: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveOcclusionLayerPtr, NIL)
  }

  public fun removeOcclusionLayer(layerIndex: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOcclusionLayerPtr, NIL)
  }

  public fun setOcclusionLayerLightMask(layerIndex: Int, lightMask: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to lightMask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOcclusionLayerLightMaskPtr, NIL)
  }

  public fun getOcclusionLayerLightMask(layerIndex: Int): Int {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayerLightMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setOcclusionLayerSdfCollision(layerIndex: Int, sdfCollision: Boolean) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), BOOL to sdfCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.setOcclusionLayerSdfCollisionPtr, NIL)
  }

  public fun getOcclusionLayerSdfCollision(layerIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayerSdfCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPhysicsLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addPhysicsLayer(toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPhysicsLayerPtr, NIL)
  }

  public fun movePhysicsLayer(layerIndex: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.movePhysicsLayerPtr, NIL)
  }

  public fun removePhysicsLayer(layerIndex: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePhysicsLayerPtr, NIL)
  }

  public fun setPhysicsLayerCollisionLayer(layerIndex: Int, layer: Long) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerCollisionLayerPtr, NIL)
  }

  public fun getPhysicsLayerCollisionLayer(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setPhysicsLayerCollisionMask(layerIndex: Int, mask: Long) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerCollisionMaskPtr, NIL)
  }

  public fun getPhysicsLayerCollisionMask(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setPhysicsLayerPhysicsMaterial(layerIndex: Int, physicsMaterial: PhysicsMaterial) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), OBJECT to physicsMaterial)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerPhysicsMaterialPtr, NIL)
  }

  public fun getPhysicsLayerPhysicsMaterial(layerIndex: Int): PhysicsMaterial? {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerPhysicsMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
  }

  public fun getTerrainSetsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainSetsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addTerrainSet(toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTerrainSetPtr, NIL)
  }

  public fun moveTerrainSet(terrainSet: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveTerrainSetPtr, NIL)
  }

  public fun removeTerrainSet(terrainSet: Int) {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTerrainSetPtr, NIL)
  }

  public fun setTerrainSetMode(terrainSet: Int, mode: TerrainMode) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainSetModePtr, NIL)
  }

  public fun getTerrainSetMode(terrainSet: Int): TerrainMode {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainSetModePtr, LONG)
    return TileSet.TerrainMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getTerrainsCount(terrainSet: Int): Int {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addTerrain(terrainSet: Int, toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTerrainPtr, NIL)
  }

  public fun moveTerrain(
    terrainSet: Int,
    terrainIndex: Int,
    toPosition: Int,
  ) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveTerrainPtr, NIL)
  }

  public fun removeTerrain(terrainSet: Int, terrainIndex: Int) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTerrainPtr, NIL)
  }

  public fun setTerrainName(
    terrainSet: Int,
    terrainIndex: Int,
    name: String,
  ) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainNamePtr, NIL)
  }

  public fun getTerrainName(terrainSet: Int, terrainIndex: Int): String {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setTerrainColor(
    terrainSet: Int,
    terrainIndex: Int,
    color: Color,
  ) {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainColorPtr, NIL)
  }

  public fun getTerrainColor(terrainSet: Int, terrainIndex: Int): Color {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getNavigationLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addNavigationLayer(toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addNavigationLayerPtr, NIL)
  }

  public fun moveNavigationLayer(layerIndex: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveNavigationLayerPtr, NIL)
  }

  public fun removeNavigationLayer(layerIndex: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeNavigationLayerPtr, NIL)
  }

  public fun setNavigationLayerLayers(layerIndex: Int, layers: Long) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerLayersPtr, NIL)
  }

  public fun getNavigationLayerLayers(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setNavigationLayerLayerValue(
    layerIndex: Int,
    layerNumber: Int,
    `value`: Boolean,
  ) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerLayerValuePtr, NIL)
  }

  public fun getNavigationLayerLayerValue(layerIndex: Int, layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCustomDataLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun addCustomDataLayer(toPosition: Int = -1) {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomDataLayerPtr, NIL)
  }

  public fun moveCustomDataLayer(layerIndex: Int, toPosition: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveCustomDataLayerPtr, NIL)
  }

  public fun removeCustomDataLayer(layerIndex: Int) {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCustomDataLayerPtr, NIL)
  }

  public fun getCustomDataLayerByName(layerName: String): Int {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setCustomDataLayerName(layerIndex: Int, layerName: String) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), STRING to layerName)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataLayerNamePtr, NIL)
  }

  public fun getCustomDataLayerName(layerIndex: Int): String {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setCustomDataLayerType(layerIndex: Int, layerType: VariantType) {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataLayerTypePtr, NIL)
  }

  public fun getCustomDataLayerType(layerIndex: Int): VariantType {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerTypePtr, LONG)
    return VariantType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setSourceLevelTileProxy(sourceFrom: Int, sourceTo: Int) {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), LONG to sourceTo.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceLevelTileProxyPtr, NIL)
  }

  public fun getSourceLevelTileProxy(sourceFrom: Int): Int {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceLevelTileProxyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasSourceLevelTileProxy(sourceFrom: Int): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSourceLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeSourceLevelTileProxy(sourceFrom: Int) {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSourceLevelTileProxyPtr, NIL)
  }

  public fun setCoordsLevelTileProxy(
    pSourceFrom: Int,
    coordsFrom: Vector2i,
    sourceTo: Int,
    coordsTo: Vector2i,
  ) {
    TransferContext.writeArguments(LONG to pSourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to sourceTo.toLong(), VECTOR2I to coordsTo)
    TransferContext.callMethod(rawPtr, MethodBindings.setCoordsLevelTileProxyPtr, NIL)
  }

  public fun getCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.getCoordsLevelTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun hasCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCoordsLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i) {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCoordsLevelTileProxyPtr, NIL)
  }

  public fun setAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
    sourceTo: Int,
    coordsTo: Vector2i,
    alternativeTo: Int,
  ) {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong(), LONG to sourceTo.toLong(), VECTOR2I to coordsTo, LONG to alternativeTo.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAlternativeLevelTileProxyPtr, NIL)
  }

  public fun getAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeLevelTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun hasAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlternativeLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ) {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeAlternativeLevelTileProxyPtr, NIL)
  }

  public fun mapTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.mapTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun cleanupInvalidTileProxies() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cleanupInvalidTileProxiesPtr, NIL)
  }

  public fun clearTileProxies() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearTileProxiesPtr, NIL)
  }

  @JvmOverloads
  public fun addPattern(pattern: TileMapPattern, index: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to pattern, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPatternPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getPattern(index: Int = -1): TileMapPattern? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?)
  }

  public fun removePattern(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePatternPtr, NIL)
  }

  public fun getPatternsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class TileShape(
    id: Long,
  ) {
    TILE_SHAPE_SQUARE(0),
    TILE_SHAPE_ISOMETRIC(1),
    TILE_SHAPE_HALF_OFFSET_SQUARE(2),
    TILE_SHAPE_HEXAGON(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TileShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TileLayout(
    id: Long,
  ) {
    TILE_LAYOUT_STACKED(0),
    TILE_LAYOUT_STACKED_OFFSET(1),
    TILE_LAYOUT_STAIRS_RIGHT(2),
    TILE_LAYOUT_STAIRS_DOWN(3),
    TILE_LAYOUT_DIAMOND_RIGHT(4),
    TILE_LAYOUT_DIAMOND_DOWN(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TileLayout = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TileOffsetAxis(
    id: Long,
  ) {
    TILE_OFFSET_AXIS_HORIZONTAL(0),
    TILE_OFFSET_AXIS_VERTICAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TileOffsetAxis = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CellNeighbor(
    id: Long,
  ) {
    CELL_NEIGHBOR_RIGHT_SIDE(0),
    CELL_NEIGHBOR_RIGHT_CORNER(1),
    CELL_NEIGHBOR_BOTTOM_RIGHT_SIDE(2),
    CELL_NEIGHBOR_BOTTOM_RIGHT_CORNER(3),
    CELL_NEIGHBOR_BOTTOM_SIDE(4),
    CELL_NEIGHBOR_BOTTOM_CORNER(5),
    CELL_NEIGHBOR_BOTTOM_LEFT_SIDE(6),
    CELL_NEIGHBOR_BOTTOM_LEFT_CORNER(7),
    CELL_NEIGHBOR_LEFT_SIDE(8),
    CELL_NEIGHBOR_LEFT_CORNER(9),
    CELL_NEIGHBOR_TOP_LEFT_SIDE(10),
    CELL_NEIGHBOR_TOP_LEFT_CORNER(11),
    CELL_NEIGHBOR_TOP_SIDE(12),
    CELL_NEIGHBOR_TOP_CORNER(13),
    CELL_NEIGHBOR_TOP_RIGHT_SIDE(14),
    CELL_NEIGHBOR_TOP_RIGHT_CORNER(15),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CellNeighbor = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TerrainMode(
    id: Long,
  ) {
    TERRAIN_MODE_MATCH_CORNERS_AND_SIDES(0),
    TERRAIN_MODE_MATCH_CORNERS(1),
    TERRAIN_MODE_MATCH_SIDES(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TerrainMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNextSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_next_source_id")

    public val addSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_source")

    public val removeSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_source")

    public val setSourceIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_source_id")

    public val getSourceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_source_count")

    public val getSourceIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_source_id")

    public val hasSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "has_source")

    public val getSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_source")

    public val setTileShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_tile_shape")

    public val getTileShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_tile_shape")

    public val setTileLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_tile_layout")

    public val getTileLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_tile_layout")

    public val setTileOffsetAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_tile_offset_axis")

    public val getTileOffsetAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_tile_offset_axis")

    public val setTileSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_tile_size")

    public val getTileSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_tile_size")

    public val setUvClippingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_uv_clipping")

    public val isUvClippingPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "is_uv_clipping")

    public val getOcclusionLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layers_count")

    public val addOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_occlusion_layer")

    public val moveOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_occlusion_layer")

    public val removeOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_occlusion_layer")

    public val setOcclusionLayerLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_occlusion_layer_light_mask")

    public val getOcclusionLayerLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layer_light_mask")

    public val setOcclusionLayerSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_occlusion_layer_sdf_collision")

    public val getOcclusionLayerSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layer_sdf_collision")

    public val getPhysicsLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layers_count")

    public val addPhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_physics_layer")

    public val movePhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_physics_layer")

    public val removePhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_physics_layer")

    public val setPhysicsLayerCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_collision_layer")

    public val getPhysicsLayerCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_collision_layer")

    public val setPhysicsLayerCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_collision_mask")

    public val getPhysicsLayerCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_collision_mask")

    public val setPhysicsLayerPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_physics_material")

    public val getPhysicsLayerPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_physics_material")

    public val getTerrainSetsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_sets_count")

    public val addTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_terrain_set")

    public val moveTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_terrain_set")

    public val removeTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_terrain_set")

    public val setTerrainSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_set_mode")

    public val getTerrainSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_set_mode")

    public val getTerrainsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrains_count")

    public val addTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_terrain")

    public val moveTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "move_terrain")

    public val removeTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_terrain")

    public val setTerrainNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_name")

    public val getTerrainNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_name")

    public val setTerrainColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_color")

    public val getTerrainColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_color")

    public val getNavigationLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layers_count")

    public val addNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_navigation_layer")

    public val moveNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_navigation_layer")

    public val removeNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_navigation_layer")

    public val setNavigationLayerLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_navigation_layer_layers")

    public val getNavigationLayerLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layer_layers")

    public val setNavigationLayerLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_navigation_layer_layer_value")

    public val getNavigationLayerLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layer_layer_value")

    public val getCustomDataLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layers_count")

    public val addCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_custom_data_layer")

    public val moveCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_custom_data_layer")

    public val removeCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_custom_data_layer")

    public val getCustomDataLayerByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_by_name")

    public val setCustomDataLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_custom_data_layer_name")

    public val getCustomDataLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_name")

    public val setCustomDataLayerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_custom_data_layer_type")

    public val getCustomDataLayerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_type")

    public val setSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_source_level_tile_proxy")

    public val getSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_source_level_tile_proxy")

    public val hasSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_source_level_tile_proxy")

    public val removeSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_source_level_tile_proxy")

    public val setCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_coords_level_tile_proxy")

    public val getCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_coords_level_tile_proxy")

    public val hasCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_coords_level_tile_proxy")

    public val removeCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_coords_level_tile_proxy")

    public val setAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_alternative_level_tile_proxy")

    public val getAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_alternative_level_tile_proxy")

    public val hasAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_alternative_level_tile_proxy")

    public val removeAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_alternative_level_tile_proxy")

    public val mapTileProxyPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "map_tile_proxy")

    public val cleanupInvalidTileProxiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "cleanup_invalid_tile_proxies")

    public val clearTileProxiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "clear_tile_proxies")

    public val addPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_pattern")

    public val getPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_pattern")

    public val removePatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_pattern")

    public val getPatternsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_patterns_count")
  }
}
