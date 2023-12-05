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
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TileSetAtlasSource : TileSetSource() {
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var margins: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginsPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginsPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var separation: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeparationPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeparationPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var textureRegionSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRegionSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRegionSizePtr, NIL)
    }

  public var useTexturePadding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseTexturePaddingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTexturePaddingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETATLASSOURCE, scriptIndex)
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
   * val myCoreType = tilesetatlassource.margins
   * //Your changes
   * tilesetatlassource.margins = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun marginsMutate(block: Vector2i.() -> Unit): Vector2i = margins.apply{
      block(this)
      margins = this
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
   * val myCoreType = tilesetatlassource.separation
   * //Your changes
   * tilesetatlassource.separation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun separationMutate(block: Vector2i.() -> Unit): Vector2i = separation.apply{
      block(this)
      separation = this
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
   * val myCoreType = tilesetatlassource.textureRegionSize
   * //Your changes
   * tilesetatlassource.textureRegionSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun textureRegionSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      textureRegionSize.apply{
      block(this)
      textureRegionSize = this
  }


  @JvmOverloads
  public fun createTile(atlasCoords: Vector2i, size: Vector2i = Vector2i(1, 1)) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.createTilePtr, NIL)
  }

  public fun removeTile(atlasCoords: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTilePtr, NIL)
  }

  @JvmOverloads
  public fun moveTileInAtlas(
    atlasCoords: Vector2i,
    newAtlasCoords: Vector2i = Vector2i(-1, -1),
    newSize: Vector2i = Vector2i(-1, -1),
  ) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to newAtlasCoords, VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr, MethodBindings.moveTileInAtlasPtr, NIL)
  }

  public fun getTileSizeInAtlas(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileSizeInAtlasPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun hasRoomForTile(
    atlasCoords: Vector2i,
    size: Vector2i,
    animationColumns: Int,
    animationSeparation: Vector2i,
    framesCount: Int,
    ignoredTile: Vector2i = Vector2i(-1, -1),
  ): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size, LONG to animationColumns.toLong(), VECTOR2I to animationSeparation, LONG to framesCount.toLong(), VECTOR2I to ignoredTile)
    TransferContext.callMethod(rawPtr, MethodBindings.hasRoomForTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getTilesToBeRemovedOnChange(
    texture: Texture2D,
    margins: Vector2i,
    separation: Vector2i,
    textureRegionSize: Vector2i,
  ): PackedVector2Array {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2I to margins, VECTOR2I to separation, VECTOR2I to textureRegionSize)
    TransferContext.callMethod(rawPtr, MethodBindings.getTilesToBeRemovedOnChangePtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun getTileAtCoords(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAtCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun setTileAnimationColumns(atlasCoords: Vector2i, frameColumns: Int) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameColumns.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationColumnsPtr, NIL)
  }

  public fun getTileAnimationColumns(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTileAnimationSeparation(atlasCoords: Vector2i, separation: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to separation)
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationSeparationPtr, NIL)
  }

  public fun getTileAnimationSeparation(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationSeparationPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun setTileAnimationSpeed(atlasCoords: Vector2i, speed: Float) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationSpeedPtr, NIL)
  }

  public fun getTileAnimationSpeed(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setTileAnimationFramesCount(atlasCoords: Vector2i, framesCount: Int) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to framesCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationFramesCountPtr, NIL)
  }

  public fun getTileAnimationFramesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationFramesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTileAnimationFrameDuration(
    atlasCoords: Vector2i,
    frameIndex: Int,
    duration: Float,
  ) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationFrameDurationPtr, NIL)
  }

  public fun getTileAnimationFrameDuration(atlasCoords: Vector2i, frameIndex: Int): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getTileAnimationTotalDuration(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationTotalDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun createAlternativeTile(atlasCoords: Vector2i, alternativeIdOverride: Int = -1): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeIdOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeAlternativeTilePtr, NIL)
  }

  public fun setAlternativeTileId(
    atlasCoords: Vector2i,
    alternativeTile: Int,
    newId: Int,
  ) {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAlternativeTileIdPtr, NIL)
  }

  public fun getNextAlternativeTileId(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextAlternativeTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTileData(atlasCoords: Vector2i, alternativeTile: Int): TileData? {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileData?)
  }

  public fun getAtlasGridSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAtlasGridSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun getTileTextureRegion(atlasCoords: Vector2i, frame: Int = 0): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public fun getRuntimeTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRuntimeTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun getRuntimeTileTextureRegion(atlasCoords: Vector2i, frame: Int): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRuntimeTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture")

    public val setMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_margins")

    public val getMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_margins")

    public val setSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_separation")

    public val getSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_separation")

    public val setTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture_region_size")

    public val getTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture_region_size")

    public val setUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_use_texture_padding")

    public val getUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_use_texture_padding")

    public val createTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_tile")

    public val removeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_tile")

    public val moveTileInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "move_tile_in_atlas")

    public val getTileSizeInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_size_in_atlas")

    public val hasRoomForTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "has_room_for_tile")

    public val getTilesToBeRemovedOnChangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tiles_to_be_removed_on_change")

    public val getTileAtCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_at_coords")

    public val setTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_columns")

    public val getTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_columns")

    public val setTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_separation")

    public val getTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_separation")

    public val setTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_speed")

    public val getTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_speed")

    public val setTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frames_count")

    public val getTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frames_count")

    public val setTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frame_duration")

    public val getTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frame_duration")

    public val getTileAnimationTotalDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_total_duration")

    public val createAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_alternative_tile")

    public val removeAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_alternative_tile")

    public val setAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_alternative_tile_id")

    public val getNextAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_next_alternative_tile_id")

    public val getTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_data")

    public val getAtlasGridSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_atlas_grid_size")

    public val getTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_texture_region")

    public val getRuntimeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_texture")

    public val getRuntimeTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_tile_texture_region")
  }
}
