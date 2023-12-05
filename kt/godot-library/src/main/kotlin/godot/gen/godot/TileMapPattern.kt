// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TileMapPattern : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILEMAPPATTERN, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun setCell(
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ) {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPtr, NIL)
  }

  public fun hasCell(coords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCellPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeCell(coords: Vector2i, updateSize: Boolean) {
    TransferContext.writeArguments(VECTOR2I to coords, BOOL to updateSize)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCellPtr, NIL)
  }

  public fun getCellSourceId(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getCellAlternativeTile(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getUsedCells(): VariantArray<Vector2i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun setSize(size: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapPattern", "set_cell")

    public val hasCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapPattern", "has_cell")

    public val removeCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "remove_cell")

    public val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_source_id")

    public val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_atlas_coords")

    public val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_alternative_tile")

    public val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_used_cells")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapPattern", "get_size")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapPattern", "set_size")

    public val isEmptyPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapPattern", "is_empty")
  }
}
