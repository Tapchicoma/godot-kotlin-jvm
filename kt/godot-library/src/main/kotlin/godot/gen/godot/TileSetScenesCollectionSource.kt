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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TileSetScenesCollectionSource : TileSetSource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE, scriptIndex)
    return true
  }

  public fun getSceneTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSceneTileId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasSceneTileId(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSceneTileIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun createSceneTile(packedScene: PackedScene, idOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to packedScene, LONG to idOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createSceneTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSceneTileId(id: Int, newId: Int) {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileIdPtr, NIL)
  }

  public fun setSceneTileScene(id: Int, packedScene: PackedScene) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileScenePtr, NIL)
  }

  public fun getSceneTileScene(id: Int): PackedScene? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PackedScene?)
  }

  public fun setSceneTileDisplayPlaceholder(id: Int, displayPlaceholder: Boolean) {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to displayPlaceholder)
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileDisplayPlaceholderPtr, NIL)
  }

  public fun getSceneTileDisplayPlaceholder(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileDisplayPlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeSceneTile(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSceneTilePtr, NIL)
  }

  public fun getNextSceneTileId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getSceneTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tiles_count")

    public val getSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_id")

    public val hasSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "has_scene_tile_id")

    public val createSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "create_scene_tile")

    public val setSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_id")

    public val setSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_scene")

    public val getSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_scene")

    public val setSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder")

    public val getSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder")

    public val removeSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "remove_scene_tile")

    public val getNextSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_next_scene_tile_id")
  }
}
