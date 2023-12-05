// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object DisplayServer : Object() {
  public final const val SCREEN_WITH_MOUSE_FOCUS: Long = -4

  public final const val SCREEN_WITH_KEYBOARD_FOCUS: Long = -3

  public final const val SCREEN_PRIMARY: Long = -2

  public final const val SCREEN_OF_MAIN_WINDOW: Long = -1

  public final const val MAIN_WINDOW_ID: Long = 0

  public final const val INVALID_WINDOW_ID: Long = -1

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_DISPLAYSERVER)
    return false
  }

  public fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun globalMenuAddSubmenuItem(
    menuRoot: String,
    label: String,
    submenu: String,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, STRING to submenu, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddSubmenuItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddIconItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddIconCheckItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddIconCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddRadioCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddIconRadioCheckItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddIconRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddMultistateItem(
    menuRoot: String,
    label: String,
    maxStates: Int,
    defaultState: Int,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddMultistateItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun globalMenuAddSeparator(menuRoot: String, index: Int = -1): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuAddSeparatorPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuGetItemIndexFromText(menuRoot: String, text: String): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemIndexFromTextPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuGetItemIndexFromTag(menuRoot: String, tag: Any?): Int {
    TransferContext.writeArguments(STRING to menuRoot, ANY to tag)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemIndexFromTagPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuIsItemChecked(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuIsItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun globalMenuIsItemCheckable(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuIsItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun globalMenuIsItemRadioCheckable(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuIsItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun globalMenuGetItemCallback(menuRoot: String, idx: Int): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  public fun globalMenuGetItemKeyCallback(menuRoot: String, idx: Int): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemKeyCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  public fun globalMenuGetItemTag(menuRoot: String, idx: Int): Any? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemTagPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun globalMenuGetItemText(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun globalMenuGetItemSubmenu(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemSubmenuPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun globalMenuGetItemAccelerator(menuRoot: String, idx: Int): Key {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun globalMenuIsItemDisabled(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuIsItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun globalMenuGetItemTooltip(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun globalMenuGetItemState(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemStatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuGetItemMaxStates(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemMaxStatesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuGetItemIcon(menuRoot: String, idx: Int): Texture2D? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun globalMenuGetItemIndentationLevel(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemIndentationLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuSetItemChecked(
    menuRoot: String,
    idx: Int,
    checked: Boolean,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemCheckedPtr, NIL)
  }

  public fun globalMenuSetItemCheckable(
    menuRoot: String,
    idx: Int,
    checkable: Boolean,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemCheckablePtr, NIL)
  }

  public fun globalMenuSetItemRadioCheckable(
    menuRoot: String,
    idx: Int,
    checkable: Boolean,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemRadioCheckablePtr, NIL)
  }

  public fun globalMenuSetItemCallback(
    menuRoot: String,
    idx: Int,
    callback: Callable,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemCallbackPtr, NIL)
  }

  public fun globalMenuSetItemKeyCallback(
    menuRoot: String,
    idx: Int,
    keyCallback: Callable,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), CALLABLE to keyCallback)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemKeyCallbackPtr, NIL)
  }

  public fun globalMenuSetItemTag(
    menuRoot: String,
    idx: Int,
    tag: Any?,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), ANY to tag)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemTagPtr, NIL)
  }

  public fun globalMenuSetItemText(
    menuRoot: String,
    idx: Int,
    text: String,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemTextPtr, NIL)
  }

  public fun globalMenuSetItemSubmenu(
    menuRoot: String,
    idx: Int,
    submenu: String,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to submenu)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemSubmenuPtr, NIL)
  }

  public fun globalMenuSetItemAccelerator(
    menuRoot: String,
    idx: Int,
    keycode: Key,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemAcceleratorPtr, NIL)
  }

  public fun globalMenuSetItemDisabled(
    menuRoot: String,
    idx: Int,
    disabled: Boolean,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemDisabledPtr, NIL)
  }

  public fun globalMenuSetItemTooltip(
    menuRoot: String,
    idx: Int,
    tooltip: String,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemTooltipPtr, NIL)
  }

  public fun globalMenuSetItemState(
    menuRoot: String,
    idx: Int,
    state: Int,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to state.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemStatePtr, NIL)
  }

  public fun globalMenuSetItemMaxStates(
    menuRoot: String,
    idx: Int,
    maxStates: Int,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to maxStates.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemMaxStatesPtr, NIL)
  }

  public fun globalMenuSetItemIcon(
    menuRoot: String,
    idx: Int,
    icon: Texture2D,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemIconPtr, NIL)
  }

  public fun globalMenuSetItemIndentationLevel(
    menuRoot: String,
    idx: Int,
    level: Int,
  ) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to level.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuSetItemIndentationLevelPtr, NIL)
  }

  public fun globalMenuGetItemCount(menuRoot: String): Int {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuGetItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun globalMenuRemoveItem(menuRoot: String, idx: Int) {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuRemoveItemPtr, NIL)
  }

  public fun globalMenuClear(menuRoot: String) {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr, MethodBindings.globalMenuClearPtr, NIL)
  }

  public fun ttsIsSpeaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsIsSpeakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun ttsIsPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsIsPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun ttsGetVoices(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsGetVoicesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun ttsGetVoicesForLanguage(language: String): PackedStringArray {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.ttsGetVoicesForLanguagePtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun ttsSpeak(
    text: String,
    voice: String,
    volume: Int = 50,
    pitch: Float = 1.0f,
    rate: Float = 1.0f,
    utteranceId: Int = 0,
    interrupt: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to text, STRING to voice, LONG to volume.toLong(), DOUBLE to pitch.toDouble(), DOUBLE to rate.toDouble(), LONG to utteranceId.toLong(), BOOL to interrupt)
    TransferContext.callMethod(rawPtr, MethodBindings.ttsSpeakPtr, NIL)
  }

  public fun ttsPause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsPausePtr, NIL)
  }

  public fun ttsResume() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsResumePtr, NIL)
  }

  public fun ttsStop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ttsStopPtr, NIL)
  }

  public fun ttsSetUtteranceCallback(event: TTSUtteranceEvent, callable: Callable) {
    TransferContext.writeArguments(LONG to event.id, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.ttsSetUtteranceCallbackPtr, NIL)
  }

  public fun isDarkModeSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDarkModeSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isDarkMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDarkModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAccentColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAccentColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun mouseSetMode(mouseMode: MouseMode) {
    TransferContext.writeArguments(LONG to mouseMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.mouseSetModePtr, NIL)
  }

  public fun mouseGetMode(): MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mouseGetModePtr, LONG)
    return DisplayServer.MouseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun warpMouse(position: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  public fun mouseGetPosition(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mouseGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun mouseGetButtonState(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mouseGetButtonStatePtr, LONG)
    return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun clipboardSet(clipboard: String) {
    TransferContext.writeArguments(STRING to clipboard)
    TransferContext.callMethod(rawPtr, MethodBindings.clipboardSetPtr, NIL)
  }

  public fun clipboardGet(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clipboardGetPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun clipboardHas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clipboardHasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clipboardSetPrimary(clipboardPrimary: String) {
    TransferContext.writeArguments(STRING to clipboardPrimary)
    TransferContext.callMethod(rawPtr, MethodBindings.clipboardSetPrimaryPtr, NIL)
  }

  public fun clipboardGetPrimary(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clipboardGetPrimaryPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDisplayCutouts(): VariantArray<Rect2> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDisplayCutoutsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Rect2>)
  }

  public fun getDisplaySafeArea(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDisplaySafeAreaPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public fun getScreenCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPrimaryScreen(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimaryScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getKeyboardFocusScreen(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeyboardFocusScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getScreenFromRect(rect: Rect2): Int {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenFromRectPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun screenGetPosition(screen: Int = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun screenGetSize(screen: Int = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun screenGetUsableRect(screen: Int = -1): Rect2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetUsableRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  @JvmOverloads
  public fun screenGetDpi(screen: Int = -1): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetDpiPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun screenGetScale(screen: Int = -1): Float {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun isTouchscreenAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTouchscreenAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun screenGetMaxScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetMaxScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun screenGetRefreshRate(screen: Int = -1): Float {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetRefreshRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun screenGetPixel(position: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetPixelPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  @JvmOverloads
  public fun screenGetImage(screen: Int = -1): Image? {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  @JvmOverloads
  public fun screenSetOrientation(orientation: ScreenOrientation, screen: Int = -1) {
    TransferContext.writeArguments(LONG to orientation.id, LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenSetOrientationPtr, NIL)
  }

  @JvmOverloads
  public fun screenGetOrientation(screen: Int = -1): ScreenOrientation {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetOrientationPtr, LONG)
    return DisplayServer.ScreenOrientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun screenSetKeepOn(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.screenSetKeepOnPtr, NIL)
  }

  public fun screenIsKeptOn(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.screenIsKeptOnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getWindowList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWindowListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun getWindowAtScreenPosition(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getWindowAtScreenPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun windowGetNativeHandle(handleType: HandleType, windowId: Int = 0): Long {
    TransferContext.writeArguments(LONG to handleType.id, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun windowGetActivePopup(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetActivePopupPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun windowSetPopupSafeRect(window: Int, rect: Rect2i) {
    TransferContext.writeArguments(LONG to window.toLong(), RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetPopupSafeRectPtr, NIL)
  }

  public fun windowGetPopupSafeRect(window: Int): Rect2i {
    TransferContext.writeArguments(LONG to window.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetPopupSafeRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  @JvmOverloads
  public fun windowSetTitle(title: String, windowId: Int = 0) {
    TransferContext.writeArguments(STRING to title, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetTitlePtr, NIL)
  }

  @JvmOverloads
  public fun windowSetMousePassthrough(region: PackedVector2Array, windowId: Int = 0) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to region, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetMousePassthroughPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetCurrentScreen(windowId: Int = 0): Int {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetCurrentScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun windowSetCurrentScreen(screen: Int, windowId: Int = 0) {
    TransferContext.writeArguments(LONG to screen.toLong(), LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetCurrentScreenPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetPosition(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowGetPositionWithDecorations(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetPositionWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowSetPosition(position: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetPositionPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowSetSize(size: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to size, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetSizePtr, NIL)
  }

  @JvmOverloads
  public fun windowSetRectChangedCallback(callback: Callable, windowId: Int = 0) {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetRectChangedCallbackPtr, NIL)
  }

  @JvmOverloads
  public fun windowSetWindowEventCallback(callback: Callable, windowId: Int = 0) {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetWindowEventCallbackPtr, NIL)
  }

  @JvmOverloads
  public fun windowSetInputEventCallback(callback: Callable, windowId: Int = 0) {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetInputEventCallbackPtr, NIL)
  }

  @JvmOverloads
  public fun windowSetInputTextCallback(callback: Callable, windowId: Int = 0) {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetInputTextCallbackPtr, NIL)
  }

  @JvmOverloads
  public fun windowSetDropFilesCallback(callback: Callable, windowId: Int = 0) {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetDropFilesCallbackPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetAttachedInstanceId(windowId: Int = 0): Long {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetAttachedInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun windowGetMaxSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetMaxSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowSetMaxSize(maxSize: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to maxSize, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetMaxSizePtr, NIL)
  }

  @JvmOverloads
  public fun windowGetMinSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetMinSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowSetMinSize(minSize: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to minSize, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetMinSizePtr, NIL)
  }

  @JvmOverloads
  public fun windowGetSizeWithDecorations(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetSizeWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  @JvmOverloads
  public fun windowGetMode(windowId: Int = 0): WindowMode {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetModePtr, LONG)
    return DisplayServer.WindowMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun windowSetMode(mode: WindowMode, windowId: Int = 0) {
    TransferContext.writeArguments(LONG to mode.id, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetModePtr, NIL)
  }

  @JvmOverloads
  public fun windowSetFlag(
    flag: WindowFlags,
    enabled: Boolean,
    windowId: Int = 0,
  ) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetFlagPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetFlag(flag: WindowFlags, windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to flag.id, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun windowSetWindowButtonsOffset(offset: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to offset, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetWindowButtonsOffsetPtr, NIL)
  }

  @JvmOverloads
  public fun windowGetSafeTitleMargins(windowId: Int = 0): Vector3i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetSafeTitleMarginsPtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
  }

  @JvmOverloads
  public fun windowRequestAttention(windowId: Int = 0) {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowRequestAttentionPtr, NIL)
  }

  @JvmOverloads
  public fun windowMoveToForeground(windowId: Int = 0) {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowMoveToForegroundPtr, NIL)
  }

  @JvmOverloads
  public fun windowIsFocused(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowIsFocusedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun windowCanDraw(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowCanDrawPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun windowSetTransient(windowId: Int, parentWindowId: Int) {
    TransferContext.writeArguments(LONG to windowId.toLong(), LONG to parentWindowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetTransientPtr, NIL)
  }

  public fun windowSetExclusive(windowId: Int, exclusive: Boolean) {
    TransferContext.writeArguments(LONG to windowId.toLong(), BOOL to exclusive)
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetExclusivePtr, NIL)
  }

  @JvmOverloads
  public fun windowSetImeActive(active: Boolean, windowId: Int = 0) {
    TransferContext.writeArguments(BOOL to active, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetImeActivePtr, NIL)
  }

  @JvmOverloads
  public fun windowSetImePosition(position: Vector2i, windowId: Int = 0) {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetImePositionPtr, NIL)
  }

  @JvmOverloads
  public fun windowSetVsyncMode(vsyncMode: VSyncMode, windowId: Int = 0) {
    TransferContext.writeArguments(LONG to vsyncMode.id, LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowSetVsyncModePtr, NIL)
  }

  @JvmOverloads
  public fun windowGetVsyncMode(windowId: Int = 0): VSyncMode {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowGetVsyncModePtr, LONG)
    return DisplayServer.VSyncMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun windowIsMaximizeAllowed(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.windowIsMaximizeAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun windowMaximizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.windowMaximizeOnTitleDblClickPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun windowMinimizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.windowMinimizeOnTitleDblClickPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun imeGetSelection(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.imeGetSelectionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun imeGetText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.imeGetTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun virtualKeyboardShow(
    existingText: String,
    position: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    type: VirtualKeyboardType = DisplayServer.VirtualKeyboardType.KEYBOARD_TYPE_DEFAULT,
    maxLength: Int = -1,
    cursorStart: Int = -1,
    cursorEnd: Int = -1,
  ) {
    TransferContext.writeArguments(STRING to existingText, RECT2 to position, LONG to type.id, LONG to maxLength.toLong(), LONG to cursorStart.toLong(), LONG to cursorEnd.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.virtualKeyboardShowPtr, NIL)
  }

  public fun virtualKeyboardHide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.virtualKeyboardHidePtr, NIL)
  }

  public fun virtualKeyboardGetHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.virtualKeyboardGetHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun cursorSetShape(shape: CursorShape) {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.cursorSetShapePtr, NIL)
  }

  public fun cursorGetShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cursorGetShapePtr, LONG)
    return DisplayServer.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun cursorSetCustomImage(
    cursor: Resource,
    shape: CursorShape = DisplayServer.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(OBJECT to cursor, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, MethodBindings.cursorSetCustomImagePtr, NIL)
  }

  public fun getSwapCancelOk(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSwapCancelOkPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun enableForStealingFocus(processId: Long) {
    TransferContext.writeArguments(LONG to processId)
    TransferContext.callMethod(rawPtr, MethodBindings.enableForStealingFocusPtr, NIL)
  }

  public fun dialogShow(
    title: String,
    description: String,
    buttons: PackedStringArray,
    callback: Callable,
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, PACKED_STRING_ARRAY to buttons, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.dialogShowPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun dialogInputText(
    title: String,
    description: String,
    existingText: String,
    callback: Callable,
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, STRING to existingText, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.dialogInputTextPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun keyboardGetLayoutCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardGetLayoutCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun keyboardGetCurrentLayout(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardGetCurrentLayoutPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun keyboardSetCurrentLayout(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardSetCurrentLayoutPtr, NIL)
  }

  public fun keyboardGetLayoutLanguage(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardGetLayoutLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun keyboardGetLayoutName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardGetLayoutNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun keyboardGetKeycodeFromPhysical(keycode: Key): Key {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.keyboardGetKeycodeFromPhysicalPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun processEvents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.processEventsPtr, NIL)
  }

  public fun forceProcessAndDropEvents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceProcessAndDropEventsPtr, NIL)
  }

  public fun setNativeIcon(filename: String) {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, MethodBindings.setNativeIconPtr, NIL)
  }

  public fun setIcon(image: Image) {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  public fun tabletGetDriverCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tabletGetDriverCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun tabletGetDriverName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.tabletGetDriverNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun tabletGetCurrentDriver(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tabletGetCurrentDriverPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun tabletSetCurrentDriver(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.tabletSetCurrentDriverPtr, NIL)
  }

  public enum class Feature(
    id: Long,
  ) {
    FEATURE_GLOBAL_MENU(0),
    FEATURE_SUBWINDOWS(1),
    FEATURE_TOUCHSCREEN(2),
    FEATURE_MOUSE(3),
    FEATURE_MOUSE_WARP(4),
    FEATURE_CLIPBOARD(5),
    FEATURE_VIRTUAL_KEYBOARD(6),
    FEATURE_CURSOR_SHAPE(7),
    FEATURE_CUSTOM_CURSOR_SHAPE(8),
    FEATURE_NATIVE_DIALOG(9),
    FEATURE_IME(10),
    FEATURE_WINDOW_TRANSPARENCY(11),
    FEATURE_HIDPI(12),
    FEATURE_ICON(13),
    FEATURE_NATIVE_ICON(14),
    FEATURE_ORIENTATION(15),
    FEATURE_SWAP_BUFFERS(16),
    FEATURE_CLIPBOARD_PRIMARY(18),
    FEATURE_TEXT_TO_SPEECH(19),
    FEATURE_EXTEND_TO_TITLE(20),
    FEATURE_SCREEN_CAPTURE(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MouseMode(
    id: Long,
  ) {
    MOUSE_MODE_VISIBLE(0),
    MOUSE_MODE_HIDDEN(1),
    MOUSE_MODE_CAPTURED(2),
    MOUSE_MODE_CONFINED(3),
    MOUSE_MODE_CONFINED_HIDDEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MouseMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ScreenOrientation(
    id: Long,
  ) {
    SCREEN_LANDSCAPE(0),
    SCREEN_PORTRAIT(1),
    SCREEN_REVERSE_LANDSCAPE(2),
    SCREEN_REVERSE_PORTRAIT(3),
    SCREEN_SENSOR_LANDSCAPE(4),
    SCREEN_SENSOR_PORTRAIT(5),
    SCREEN_SENSOR(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScreenOrientation = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VirtualKeyboardType(
    id: Long,
  ) {
    KEYBOARD_TYPE_DEFAULT(0),
    KEYBOARD_TYPE_MULTILINE(1),
    KEYBOARD_TYPE_NUMBER(2),
    KEYBOARD_TYPE_NUMBER_DECIMAL(3),
    KEYBOARD_TYPE_PHONE(4),
    KEYBOARD_TYPE_EMAIL_ADDRESS(5),
    KEYBOARD_TYPE_PASSWORD(6),
    KEYBOARD_TYPE_URL(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VirtualKeyboardType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CursorShape(
    id: Long,
  ) {
    CURSOR_ARROW(0),
    CURSOR_IBEAM(1),
    CURSOR_POINTING_HAND(2),
    CURSOR_CROSS(3),
    CURSOR_WAIT(4),
    CURSOR_BUSY(5),
    CURSOR_DRAG(6),
    CURSOR_CAN_DROP(7),
    CURSOR_FORBIDDEN(8),
    CURSOR_VSIZE(9),
    CURSOR_HSIZE(10),
    CURSOR_BDIAGSIZE(11),
    CURSOR_FDIAGSIZE(12),
    CURSOR_MOVE(13),
    CURSOR_VSPLIT(14),
    CURSOR_HSPLIT(15),
    CURSOR_HELP(16),
    CURSOR_MAX(17),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CursorShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class WindowMode(
    id: Long,
  ) {
    WINDOW_MODE_WINDOWED(0),
    WINDOW_MODE_MINIMIZED(1),
    WINDOW_MODE_MAXIMIZED(2),
    WINDOW_MODE_FULLSCREEN(3),
    WINDOW_MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class WindowFlags(
    id: Long,
  ) {
    WINDOW_FLAG_RESIZE_DISABLED(0),
    WINDOW_FLAG_BORDERLESS(1),
    WINDOW_FLAG_ALWAYS_ON_TOP(2),
    WINDOW_FLAG_TRANSPARENT(3),
    WINDOW_FLAG_NO_FOCUS(4),
    WINDOW_FLAG_POPUP(5),
    WINDOW_FLAG_EXTEND_TO_TITLE(6),
    WINDOW_FLAG_MOUSE_PASSTHROUGH(7),
    WINDOW_FLAG_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class WindowEvent(
    id: Long,
  ) {
    WINDOW_EVENT_MOUSE_ENTER(0),
    WINDOW_EVENT_MOUSE_EXIT(1),
    WINDOW_EVENT_FOCUS_IN(2),
    WINDOW_EVENT_FOCUS_OUT(3),
    WINDOW_EVENT_CLOSE_REQUEST(4),
    WINDOW_EVENT_GO_BACK_REQUEST(5),
    WINDOW_EVENT_DPI_CHANGE(6),
    WINDOW_EVENT_TITLEBAR_CHANGE(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowEvent = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VSyncMode(
    id: Long,
  ) {
    VSYNC_DISABLED(0),
    VSYNC_ENABLED(1),
    VSYNC_ADAPTIVE(2),
    VSYNC_MAILBOX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VSyncMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class HandleType(
    id: Long,
  ) {
    DISPLAY_HANDLE(0),
    WINDOW_HANDLE(1),
    WINDOW_VIEW(2),
    OPENGL_CONTEXT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandleType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TTSUtteranceEvent(
    id: Long,
  ) {
    TTS_UTTERANCE_STARTED(0),
    TTS_UTTERANCE_ENDED(1),
    TTS_UTTERANCE_CANCELED(2),
    TTS_UTTERANCE_BOUNDARY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TTSUtteranceEvent = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val hasFeaturePtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "has_feature")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "get_name")

    public val globalMenuAddSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_submenu_item")

    public val globalMenuAddItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_item")

    public val globalMenuAddCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_check_item")

    public val globalMenuAddIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_item")

    public val globalMenuAddIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_check_item")

    public val globalMenuAddRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_radio_check_item")

    public val globalMenuAddIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_radio_check_item")

    public val globalMenuAddMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_multistate_item")

    public val globalMenuAddSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_separator")

    public val globalMenuGetItemIndexFromTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_index_from_text")

    public val globalMenuGetItemIndexFromTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_index_from_tag")

    public val globalMenuIsItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_checked")

    public val globalMenuIsItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_checkable")

    public val globalMenuIsItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_radio_checkable")

    public val globalMenuGetItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_callback")

    public val globalMenuGetItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_key_callback")

    public val globalMenuGetItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_tag")

    public val globalMenuGetItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_text")

    public val globalMenuGetItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_submenu")

    public val globalMenuGetItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_accelerator")

    public val globalMenuIsItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_disabled")

    public val globalMenuGetItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_tooltip")

    public val globalMenuGetItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_state")

    public val globalMenuGetItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_max_states")

    public val globalMenuGetItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_icon")

    public val globalMenuGetItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_indentation_level")

    public val globalMenuSetItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_checked")

    public val globalMenuSetItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_checkable")

    public val globalMenuSetItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_radio_checkable")

    public val globalMenuSetItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_callback")

    public val globalMenuSetItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_key_callback")

    public val globalMenuSetItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_tag")

    public val globalMenuSetItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_text")

    public val globalMenuSetItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_submenu")

    public val globalMenuSetItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_accelerator")

    public val globalMenuSetItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_disabled")

    public val globalMenuSetItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_tooltip")

    public val globalMenuSetItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_state")

    public val globalMenuSetItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_max_states")

    public val globalMenuSetItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_icon")

    public val globalMenuSetItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_indentation_level")

    public val globalMenuGetItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_count")

    public val globalMenuRemoveItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_remove_item")

    public val globalMenuClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_clear")

    public val ttsIsSpeakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_is_speaking")

    public val ttsIsPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_is_paused")

    public val ttsGetVoicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_get_voices")

    public val ttsGetVoicesForLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_get_voices_for_language")

    public val ttsSpeakPtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "tts_speak")

    public val ttsPausePtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "tts_pause")

    public val ttsResumePtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "tts_resume")

    public val ttsStopPtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "tts_stop")

    public val ttsSetUtteranceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_set_utterance_callback")

    public val isDarkModeSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_dark_mode_supported")

    public val isDarkModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_dark_mode")

    public val getAccentColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_accent_color")

    public val mouseSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_set_mode")

    public val mouseGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_mode")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "warp_mouse")

    public val mouseGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_position")

    public val mouseGetButtonStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_button_state")

    public val clipboardSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_set")

    public val clipboardGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_get")

    public val clipboardHasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_has")

    public val clipboardSetPrimaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_set_primary")

    public val clipboardGetPrimaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_get_primary")

    public val getDisplayCutoutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_display_cutouts")

    public val getDisplaySafeAreaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_display_safe_area")

    public val getScreenCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_screen_count")

    public val getPrimaryScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_primary_screen")

    public val getKeyboardFocusScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_keyboard_focus_screen")

    public val getScreenFromRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_screen_from_rect")

    public val screenGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_position")

    public val screenGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_size")

    public val screenGetUsableRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_usable_rect")

    public val screenGetDpiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_dpi")

    public val screenGetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_scale")

    public val isTouchscreenAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_touchscreen_available")

    public val screenGetMaxScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_max_scale")

    public val screenGetRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_refresh_rate")

    public val screenGetPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_pixel")

    public val screenGetImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_image")

    public val screenSetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_set_orientation")

    public val screenGetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_orientation")

    public val screenSetKeepOnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_set_keep_on")

    public val screenIsKeptOnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_is_kept_on")

    public val getWindowListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_window_list")

    public val getWindowAtScreenPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_window_at_screen_position")

    public val windowGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_native_handle")

    public val windowGetActivePopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_active_popup")

    public val windowSetPopupSafeRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_popup_safe_rect")

    public val windowGetPopupSafeRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_popup_safe_rect")

    public val windowSetTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_title")

    public val windowSetMousePassthroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_mouse_passthrough")

    public val windowGetCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_current_screen")

    public val windowSetCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_current_screen")

    public val windowGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_position")

    public val windowGetPositionWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_position_with_decorations")

    public val windowSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_position")

    public val windowGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_size")

    public val windowSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_size")

    public val windowSetRectChangedCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_rect_changed_callback")

    public val windowSetWindowEventCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_window_event_callback")

    public val windowSetInputEventCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_input_event_callback")

    public val windowSetInputTextCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_input_text_callback")

    public val windowSetDropFilesCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_drop_files_callback")

    public val windowGetAttachedInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_attached_instance_id")

    public val windowGetMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_max_size")

    public val windowSetMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_max_size")

    public val windowGetMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_min_size")

    public val windowSetMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_min_size")

    public val windowGetSizeWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_size_with_decorations")

    public val windowGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_mode")

    public val windowSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_mode")

    public val windowSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_flag")

    public val windowGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_flag")

    public val windowSetWindowButtonsOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_window_buttons_offset")

    public val windowGetSafeTitleMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_safe_title_margins")

    public val windowRequestAttentionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_request_attention")

    public val windowMoveToForegroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_move_to_foreground")

    public val windowIsFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_is_focused")

    public val windowCanDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_can_draw")

    public val windowSetTransientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_transient")

    public val windowSetExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_exclusive")

    public val windowSetImeActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_ime_active")

    public val windowSetImePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_ime_position")

    public val windowSetVsyncModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_vsync_mode")

    public val windowGetVsyncModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_vsync_mode")

    public val windowIsMaximizeAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_is_maximize_allowed")

    public val windowMaximizeOnTitleDblClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_maximize_on_title_dbl_click")

    public val windowMinimizeOnTitleDblClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_minimize_on_title_dbl_click")

    public val imeGetSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "ime_get_selection")

    public val imeGetTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "ime_get_text")

    public val virtualKeyboardShowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_show")

    public val virtualKeyboardHidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_hide")

    public val virtualKeyboardGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_get_height")

    public val cursorSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_set_shape")

    public val cursorGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_get_shape")

    public val cursorSetCustomImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_set_custom_image")

    public val getSwapCancelOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_swap_cancel_ok")

    public val enableForStealingFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "enable_for_stealing_focus")

    public val dialogShowPtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "dialog_show")

    public val dialogInputTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "dialog_input_text")

    public val keyboardGetLayoutCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_count")

    public val keyboardGetCurrentLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_current_layout")

    public val keyboardSetCurrentLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_set_current_layout")

    public val keyboardGetLayoutLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_language")

    public val keyboardGetLayoutNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_name")

    public val keyboardGetKeycodeFromPhysicalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_keycode_from_physical")

    public val processEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "process_events")

    public val forceProcessAndDropEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "force_process_and_drop_events")

    public val setNativeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "set_native_icon")

    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("DisplayServer", "set_icon")

    public val tabletGetDriverCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_driver_count")

    public val tabletGetDriverNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_driver_name")

    public val tabletGetCurrentDriverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_current_driver")

    public val tabletSetCurrentDriverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_set_current_driver")
  }
}
