// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorPlugin internal constructor() : Node() {
  public val sceneChanged: Signal1<Node> by signal("sceneRoot")

  public val sceneClosed: Signal1<String> by signal("filepath")

  public val mainScreenChanged: Signal1<String> by signal("screenName")

  public val resourceSaved: Signal1<Resource> by signal("resource")

  public val projectSettingsChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPLUGIN, scriptIndex)
    return true
  }

  public open fun _forwardCanvasGuiInput(event: InputEvent): Boolean {
    throw NotImplementedError("_forward_canvas_gui_input is not implemented for EditorPlugin")
  }

  public open fun _forwardCanvasDrawOverViewport(viewportControl: Control) {
  }

  public open fun _forwardCanvasForceDrawOverViewport(viewportControl: Control) {
  }

  public open fun _forward3dGuiInput(viewportCamera: Camera3D, event: InputEvent): Int {
    throw NotImplementedError("_forward_3d_gui_input is not implemented for EditorPlugin")
  }

  public open fun _forward3dDrawOverViewport(viewportControl: Control) {
  }

  public open fun _forward3dForceDrawOverViewport(viewportControl: Control) {
  }

  public open fun _getPluginName(): String {
    throw NotImplementedError("_get_plugin_name is not implemented for EditorPlugin")
  }

  public open fun _getPluginIcon(): Texture2D? {
    throw NotImplementedError("_get_plugin_icon is not implemented for EditorPlugin")
  }

  public open fun _hasMainScreen(): Boolean {
    throw NotImplementedError("_has_main_screen is not implemented for EditorPlugin")
  }

  public open fun _makeVisible(visible: Boolean) {
  }

  public open fun _edit(_object: Object) {
  }

  public open fun _handles(_object: Object): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorPlugin")
  }

  public open fun _getState(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_state is not implemented for EditorPlugin")
  }

  public open fun _setState(state: Dictionary<Any?, Any?>) {
  }

  public open fun _clear() {
  }

  public open fun _saveExternalData() {
  }

  public open fun _applyChanges() {
  }

  public open fun _getBreakpoints(): PackedStringArray {
    throw NotImplementedError("_get_breakpoints is not implemented for EditorPlugin")
  }

  public open fun _setWindowLayout(configuration: ConfigFile) {
  }

  public open fun _getWindowLayout(configuration: ConfigFile) {
  }

  public open fun _build(): Boolean {
    throw NotImplementedError("_build is not implemented for EditorPlugin")
  }

  public open fun _enablePlugin() {
  }

  public open fun _disablePlugin() {
  }

  public fun addControlToContainer(container: CustomControlContainer, control: Control) {
    TransferContext.writeArguments(LONG to container.id, OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addControlToContainerPtr, NIL)
  }

  public fun addControlToBottomPanel(control: Control, title: String): Button? {
    TransferContext.writeArguments(OBJECT to control, STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.addControlToBottomPanelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public fun addControlToDock(slot: DockSlot, control: Control) {
    TransferContext.writeArguments(LONG to slot.id, OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addControlToDockPtr, NIL)
  }

  public fun removeControlFromDocks(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.removeControlFromDocksPtr, NIL)
  }

  public fun removeControlFromBottomPanel(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.removeControlFromBottomPanelPtr, NIL)
  }

  public fun removeControlFromContainer(container: CustomControlContainer, control: Control) {
    TransferContext.writeArguments(LONG to container.id, OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.removeControlFromContainerPtr, NIL)
  }

  public fun addToolMenuItem(name: String, callable: Callable) {
    TransferContext.writeArguments(STRING to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addToolMenuItemPtr, NIL)
  }

  public fun addToolSubmenuItem(name: String, submenu: PopupMenu) {
    TransferContext.writeArguments(STRING to name, OBJECT to submenu)
    TransferContext.callMethod(rawPtr, MethodBindings.addToolSubmenuItemPtr, NIL)
  }

  public fun removeToolMenuItem(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeToolMenuItemPtr, NIL)
  }

  public fun getExportAsMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExportAsMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  public fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture2D,
  ) {
    TransferContext.writeArguments(STRING to type, STRING to base, OBJECT to script, OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomTypePtr, NIL)
  }

  public fun removeCustomType(type: String) {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCustomTypePtr, NIL)
  }

  public fun addAutoloadSingleton(name: String, path: String) {
    TransferContext.writeArguments(STRING to name, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addAutoloadSingletonPtr, NIL)
  }

  public fun removeAutoloadSingleton(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAutoloadSingletonPtr, NIL)
  }

  public fun updateOverlays(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateOverlaysPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun makeBottomPanelItemVisible(item: Control) {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, MethodBindings.makeBottomPanelItemVisiblePtr, NIL)
  }

  public fun hideBottomPanel() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hideBottomPanelPtr, NIL)
  }

  public fun getUndoRedo(): EditorUndoRedoManager? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUndoRedoPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorUndoRedoManager?)
  }

  public fun addUndoRedoInspectorHookCallback(callable: Callable) {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoRedoInspectorHookCallbackPtr, NIL)
  }

  public fun removeUndoRedoInspectorHookCallback(callable: Callable) {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.removeUndoRedoInspectorHookCallbackPtr, NIL)
  }

  public fun queueSaveLayout() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queueSaveLayoutPtr, NIL)
  }

  public fun addTranslationParserPlugin(parser: EditorTranslationParserPlugin) {
    TransferContext.writeArguments(OBJECT to parser)
    TransferContext.callMethod(rawPtr, MethodBindings.addTranslationParserPluginPtr, NIL)
  }

  public fun removeTranslationParserPlugin(parser: EditorTranslationParserPlugin) {
    TransferContext.writeArguments(OBJECT to parser)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTranslationParserPluginPtr, NIL)
  }

  @JvmOverloads
  public fun addImportPlugin(importer: EditorImportPlugin, firstPriority: Boolean = false) {
    TransferContext.writeArguments(OBJECT to importer, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr, MethodBindings.addImportPluginPtr, NIL)
  }

  public fun removeImportPlugin(importer: EditorImportPlugin) {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, MethodBindings.removeImportPluginPtr, NIL)
  }

  @JvmOverloads
  public fun addSceneFormatImporterPlugin(sceneFormatImporter: EditorSceneFormatImporter,
      firstPriority: Boolean = false) {
    TransferContext.writeArguments(OBJECT to sceneFormatImporter, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr, MethodBindings.addSceneFormatImporterPluginPtr, NIL)
  }

  public fun removeSceneFormatImporterPlugin(sceneFormatImporter: EditorSceneFormatImporter) {
    TransferContext.writeArguments(OBJECT to sceneFormatImporter)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSceneFormatImporterPluginPtr, NIL)
  }

  @JvmOverloads
  public fun addScenePostImportPlugin(sceneImportPlugin: EditorScenePostImportPlugin,
      firstPriority: Boolean = false) {
    TransferContext.writeArguments(OBJECT to sceneImportPlugin, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr, MethodBindings.addScenePostImportPluginPtr, NIL)
  }

  public fun removeScenePostImportPlugin(sceneImportPlugin: EditorScenePostImportPlugin) {
    TransferContext.writeArguments(OBJECT to sceneImportPlugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeScenePostImportPluginPtr, NIL)
  }

  public fun addExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.addExportPluginPtr, NIL)
  }

  public fun removeExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExportPluginPtr, NIL)
  }

  public fun addNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.addNode3dGizmoPluginPtr, NIL)
  }

  public fun removeNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeNode3dGizmoPluginPtr, NIL)
  }

  public fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.addInspectorPluginPtr, NIL)
  }

  public fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInspectorPluginPtr, NIL)
  }

  public fun addResourceConversionPlugin(plugin: EditorResourceConversionPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.addResourceConversionPluginPtr, NIL)
  }

  public fun removeResourceConversionPlugin(plugin: EditorResourceConversionPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.removeResourceConversionPluginPtr, NIL)
  }

  public fun setInputEventForwardingAlwaysEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setInputEventForwardingAlwaysEnabledPtr, NIL)
  }

  public fun setForceDrawOverForwardingEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setForceDrawOverForwardingEnabledPtr, NIL)
  }

  public fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorInterface?)
  }

  public fun getScriptCreateDialog(): ScriptCreateDialog? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptCreateDialogPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptCreateDialog?)
  }

  public fun addDebuggerPlugin(script: EditorDebuggerPlugin) {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, MethodBindings.addDebuggerPluginPtr, NIL)
  }

  public fun removeDebuggerPlugin(script: EditorDebuggerPlugin) {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, MethodBindings.removeDebuggerPluginPtr, NIL)
  }

  public enum class CustomControlContainer(
    id: Long,
  ) {
    CONTAINER_TOOLBAR(0),
    CONTAINER_SPATIAL_EDITOR_MENU(1),
    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),
    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),
    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),
    CONTAINER_CANVAS_EDITOR_MENU(5),
    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),
    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),
    CONTAINER_CANVAS_EDITOR_BOTTOM(8),
    CONTAINER_INSPECTOR_BOTTOM(9),
    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),
    CONTAINER_PROJECT_SETTING_TAB_RIGHT(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CustomControlContainer = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DockSlot(
    id: Long,
  ) {
    DOCK_SLOT_LEFT_UL(0),
    DOCK_SLOT_LEFT_BL(1),
    DOCK_SLOT_LEFT_UR(2),
    DOCK_SLOT_LEFT_BR(3),
    DOCK_SLOT_RIGHT_UL(4),
    DOCK_SLOT_RIGHT_BL(5),
    DOCK_SLOT_RIGHT_UR(6),
    DOCK_SLOT_RIGHT_BR(7),
    DOCK_SLOT_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DockSlot = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AfterGUIInput(
    id: Long,
  ) {
    AFTER_GUI_INPUT_PASS(0),
    AFTER_GUI_INPUT_STOP(1),
    AFTER_GUI_INPUT_CUSTOM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AfterGUIInput = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _forwardCanvasGuiInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_canvas_gui_input")

    public val _forwardCanvasDrawOverViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_canvas_draw_over_viewport")

    public val _forwardCanvasForceDrawOverViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_canvas_force_draw_over_viewport")

    public val _forward3dGuiInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_3d_gui_input")

    public val _forward3dDrawOverViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_3d_draw_over_viewport")

    public val _forward3dForceDrawOverViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_forward_3d_force_draw_over_viewport")

    public val _getPluginNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_get_plugin_name")

    public val _getPluginIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_get_plugin_icon")

    public val _hasMainScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_has_main_screen")

    public val _makeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_make_visible")

    public val _editPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_edit")

    public val _handlesPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_handles")

    public val _getStatePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_get_state")

    public val _setStatePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_set_state")

    public val _clearPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_clear")

    public val _saveExternalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_save_external_data")

    public val _applyChangesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_apply_changes")

    public val _getBreakpointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_get_breakpoints")

    public val _setWindowLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_set_window_layout")

    public val _getWindowLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_get_window_layout")

    public val _buildPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPlugin", "_build")

    public val _enablePluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_enable_plugin")

    public val _disablePluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "_disable_plugin")

    public val addControlToContainerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_control_to_container")

    public val addControlToBottomPanelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_control_to_bottom_panel")

    public val addControlToDockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_control_to_dock")

    public val removeControlFromDocksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_control_from_docks")

    public val removeControlFromBottomPanelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_control_from_bottom_panel")

    public val removeControlFromContainerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_control_from_container")

    public val addToolMenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_tool_menu_item")

    public val addToolSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_tool_submenu_item")

    public val removeToolMenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_tool_menu_item")

    public val getExportAsMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "get_export_as_menu")

    public val addCustomTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_custom_type")

    public val removeCustomTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_custom_type")

    public val addAutoloadSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_autoload_singleton")

    public val removeAutoloadSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_autoload_singleton")

    public val updateOverlaysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "update_overlays")

    public val makeBottomPanelItemVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "make_bottom_panel_item_visible")

    public val hideBottomPanelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "hide_bottom_panel")

    public val getUndoRedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "get_undo_redo")

    public val addUndoRedoInspectorHookCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_undo_redo_inspector_hook_callback")

    public val removeUndoRedoInspectorHookCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_undo_redo_inspector_hook_callback")

    public val queueSaveLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "queue_save_layout")

    public val addTranslationParserPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_translation_parser_plugin")

    public val removeTranslationParserPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_translation_parser_plugin")

    public val addImportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_import_plugin")

    public val removeImportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_import_plugin")

    public val addSceneFormatImporterPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_scene_format_importer_plugin")

    public val removeSceneFormatImporterPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_scene_format_importer_plugin")

    public val addScenePostImportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_scene_post_import_plugin")

    public val removeScenePostImportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_scene_post_import_plugin")

    public val addExportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_export_plugin")

    public val removeExportPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_export_plugin")

    public val addNode3dGizmoPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_node_3d_gizmo_plugin")

    public val removeNode3dGizmoPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_node_3d_gizmo_plugin")

    public val addInspectorPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_inspector_plugin")

    public val removeInspectorPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_inspector_plugin")

    public val addResourceConversionPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_resource_conversion_plugin")

    public val removeResourceConversionPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_resource_conversion_plugin")

    public val setInputEventForwardingAlwaysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "set_input_event_forwarding_always_enabled")

    public val setForceDrawOverForwardingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "set_force_draw_over_forwarding_enabled")

    public val getEditorInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "get_editor_interface")

    public val getScriptCreateDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "get_script_create_dialog")

    public val addDebuggerPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "add_debugger_plugin")

    public val removeDebuggerPluginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPlugin", "remove_debugger_plugin")
  }
}
