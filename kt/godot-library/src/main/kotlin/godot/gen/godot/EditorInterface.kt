// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorInterface internal constructor() : Object() {
  public var distractionFreeMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDistractionFreeModeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDistractionFreeModePtr, NIL)
    }

  public var movieMakerEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMovieMakerEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMovieMakerEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORINTERFACE, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun restartEditor(save: Boolean = true) {
    TransferContext.writeArguments(BOOL to save)
    TransferContext.callMethod(rawPtr, MethodBindings.restartEditorPtr, NIL)
  }

  public fun getCommandPalette(): EditorCommandPalette? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCommandPalettePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorCommandPalette?)
  }

  public fun getResourceFilesystem(): EditorFileSystem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResourceFilesystemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystem?)
  }

  public fun getEditorPaths(): EditorPaths? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorPathsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorPaths?)
  }

  public fun getResourcePreviewer(): EditorResourcePreview? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResourcePreviewerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorResourcePreview?)
  }

  public fun getSelection(): EditorSelection? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorSelection?)
  }

  public fun getEditorSettings(): EditorSettings? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorSettingsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorSettings?)
  }

  public fun makeMeshPreviews(meshes: VariantArray<Mesh>, previewSize: Int):
      VariantArray<Texture2D> {
    TransferContext.writeArguments(ARRAY to meshes, LONG to previewSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.makeMeshPreviewsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Texture2D>)
  }

  public fun setPluginEnabled(plugin: String, enabled: Boolean) {
    TransferContext.writeArguments(STRING to plugin, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPluginEnabledPtr, NIL)
  }

  public fun isPluginEnabled(plugin: String): Boolean {
    TransferContext.writeArguments(STRING to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.isPluginEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBaseControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBaseControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun getEditorMainScreen(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorMainScreenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  public fun getScriptEditor(): ScriptEditor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptEditorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptEditor?)
  }

  public fun setMainScreenEditor(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setMainScreenEditorPtr, NIL)
  }

  public fun getEditorScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun popupDialog(dialog: Window, rect: Rect2i = Rect2i(0, 0, 0, 0)) {
    TransferContext.writeArguments(OBJECT to dialog, RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogPtr, NIL)
  }

  @JvmOverloads
  public fun popupDialogCentered(dialog: Window, minsize: Vector2i = Vector2i(0, 0)) {
    TransferContext.writeArguments(OBJECT to dialog, VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredPtr, NIL)
  }

  @JvmOverloads
  public fun popupDialogCenteredRatio(dialog: Window, ratio: Float = 0.8f) {
    TransferContext.writeArguments(OBJECT to dialog, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredRatioPtr, NIL)
  }

  @JvmOverloads
  public fun popupDialogCenteredClamped(
    dialog: Window,
    minsize: Vector2i = Vector2i(0, 0),
    fallbackRatio: Float = 0.75f,
  ) {
    TransferContext.writeArguments(OBJECT to dialog, VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredClampedPtr, NIL)
  }

  public fun getFileSystemDock(): FileSystemDock? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFileSystemDockPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as FileSystemDock?)
  }

  public fun selectFile(`file`: String) {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, MethodBindings.selectFilePtr, NIL)
  }

  public fun getSelectedPaths(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPathsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getCurrentPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getCurrentDirectory(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirectoryPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getInspector(): EditorInspector? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInspectorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorInspector?)
  }

  @JvmOverloads
  public fun inspectObject(
    _object: Object,
    forProperty: String = "",
    inspectorOnly: Boolean = false,
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to forProperty, BOOL to inspectorOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.inspectObjectPtr, NIL)
  }

  public fun editResource(resource: Resource) {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.editResourcePtr, NIL)
  }

  public fun editNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.editNodePtr, NIL)
  }

  @JvmOverloads
  public fun editScript(
    script: Script,
    line: Int = -1,
    column: Int = 0,
    grabFocus: Boolean = true,
  ) {
    TransferContext.writeArguments(OBJECT to script, LONG to line.toLong(), LONG to column.toLong(), BOOL to grabFocus)
    TransferContext.callMethod(rawPtr, MethodBindings.editScriptPtr, NIL)
  }

  public fun openSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.openSceneFromPathPtr, NIL)
  }

  public fun reloadSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.reloadSceneFromPathPtr, NIL)
  }

  public fun getOpenScenes(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenScenesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getEditedSceneRoot(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedSceneRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun saveScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.saveScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun saveSceneAs(path: String, withPreview: Boolean = true) {
    TransferContext.writeArguments(STRING to path, BOOL to withPreview)
    TransferContext.callMethod(rawPtr, MethodBindings.saveSceneAsPtr, NIL)
  }

  public fun markSceneAsUnsaved() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.markSceneAsUnsavedPtr, NIL)
  }

  public fun playMainScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playMainScenePtr, NIL)
  }

  public fun playCurrentScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playCurrentScenePtr, NIL)
  }

  public fun playCustomScene(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.playCustomScenePtr, NIL)
  }

  public fun stopPlayingScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPlayingScenePtr, NIL)
  }

  public fun isPlayingScene(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingScenePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPlayingScene(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingScenePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val restartEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "restart_editor")

    public val getCommandPalettePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_command_palette")

    public val getResourceFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_resource_filesystem")

    public val getEditorPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_paths")

    public val getResourcePreviewerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_resource_previewer")

    public val getSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_selection")

    public val getEditorSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_settings")

    public val makeMeshPreviewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "make_mesh_previews")

    public val setPluginEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_plugin_enabled")

    public val isPluginEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_plugin_enabled")

    public val getBaseControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_base_control")

    public val getEditorMainScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_main_screen")

    public val getScriptEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_script_editor")

    public val setMainScreenEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_main_screen_editor")

    public val setDistractionFreeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_distraction_free_mode")

    public val isDistractionFreeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_distraction_free_mode_enabled")

    public val getEditorScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_scale")

    public val popupDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog")

    public val popupDialogCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered")

    public val popupDialogCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered_ratio")

    public val popupDialogCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered_clamped")

    public val getFileSystemDockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_file_system_dock")

    public val selectFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "select_file")

    public val getSelectedPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_selected_paths")

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_current_path")

    public val getCurrentDirectoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_current_directory")

    public val getInspectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_inspector")

    public val inspectObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "inspect_object")

    public val editResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "edit_resource")

    public val editNodePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorInterface", "edit_node")

    public val editScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "edit_script")

    public val openSceneFromPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "open_scene_from_path")

    public val reloadSceneFromPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "reload_scene_from_path")

    public val getOpenScenesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_open_scenes")

    public val getEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_edited_scene_root")

    public val saveScenePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorInterface", "save_scene")

    public val saveSceneAsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "save_scene_as")

    public val markSceneAsUnsavedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "mark_scene_as_unsaved")

    public val playMainScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_main_scene")

    public val playCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_current_scene")

    public val playCustomScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_custom_scene")

    public val stopPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "stop_playing_scene")

    public val isPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_playing_scene")

    public val getPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_playing_scene")

    public val setMovieMakerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_movie_maker_enabled")

    public val isMovieMakerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_movie_maker_enabled")
  }
}
