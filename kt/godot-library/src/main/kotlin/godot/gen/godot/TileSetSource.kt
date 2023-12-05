// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class TileSetSource internal constructor() : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETSOURCE, scriptIndex)
    return true
  }

  public fun getTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTileId(index: Int): Vector2i {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileIdPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun hasTile(atlasCoords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.hasTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAlternativeTilesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getAlternativeTileId(atlasCoords: Vector2i, index: Int): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlternativeTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_tiles_count")

    public val getTileIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSetSource", "get_tile_id")

    public val hasTilePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSetSource", "has_tile")

    public val getAlternativeTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_alternative_tiles_count")

    public val getAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_alternative_tile_id")

    public val hasAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "has_alternative_tile")
  }
}
