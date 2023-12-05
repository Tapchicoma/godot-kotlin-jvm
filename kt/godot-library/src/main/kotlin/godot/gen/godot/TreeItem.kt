// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class TreeItem internal constructor() : Object() {
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
    }

  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  public var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFoldingDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableFoldingPtr, NIL)
    }

  public var customMinimumHeight: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomMinimumHeightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomMinimumHeightPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TREEITEM, scriptIndex)
    return true
  }

  public fun setCellMode(column: Int, mode: TreeCellMode) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellModePtr, NIL)
  }

  public fun getCellMode(column: Int): TreeCellMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCellModePtr, LONG)
    return TreeItem.TreeCellMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setEditMultiline(column: Int, multiline: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to multiline)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditMultilinePtr, NIL)
  }

  public fun isEditMultiline(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isEditMultilinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setChecked(column: Int, checked: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.setCheckedPtr, NIL)
  }

  public fun setIndeterminate(column: Int, indeterminate: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to indeterminate)
    TransferContext.callMethod(rawPtr, MethodBindings.setIndeterminatePtr, NIL)
  }

  public fun isChecked(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isIndeterminate(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isIndeterminatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun propagateCheck(column: Int, emitSignal: Boolean = true) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to emitSignal)
    TransferContext.callMethod(rawPtr, MethodBindings.propagateCheckPtr, NIL)
  }

  public fun setText(column: Int, text: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public fun getText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setTextDirection(column: Int, direction: Control.TextDirection) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public fun getTextDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setAutowrapMode(column: Int, autowrapMode: TextServer.AutowrapMode) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to autowrapMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public fun getAutowrapMode(column: Int): TextServer.AutowrapMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setStructuredTextBidiOverride(column: Int, parser: TextServer.StructuredTextParser) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to parser.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public fun getStructuredTextBidiOverride(column: Int): TextServer.StructuredTextParser {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setStructuredTextBidiOverrideOptions(column: Int, args: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to column.toLong(), ARRAY to args)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public fun getStructuredTextBidiOverrideOptions(column: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun setLanguage(column: Int, language: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public fun getLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setSuffix(column: Int, text: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setSuffixPtr, NIL)
  }

  public fun getSuffix(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSuffixPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setIcon(column: Int, texture: Texture2D) {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  public fun getIcon(column: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setIconRegion(column: Int, region: Rect2) {
    TransferContext.writeArguments(LONG to column.toLong(), RECT2 to region)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconRegionPtr, NIL)
  }

  public fun getIconRegion(column: Int): Rect2 {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setIconMaxWidth(column: Int, width: Int) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setIconMaxWidthPtr, NIL)
  }

  public fun getIconMaxWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setIconModulate(column: Int, modulate: Color) {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconModulatePtr, NIL)
  }

  public fun getIconModulate(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setRange(column: Int, `value`: Double) {
    TransferContext.writeArguments(LONG to column.toLong(), DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setRangePtr, NIL)
  }

  public fun getRange(column: Int): Double {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun setRangeConfig(
    column: Int,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), DOUBLE to min, DOUBLE to max, DOUBLE to step, BOOL to expr)
    TransferContext.callMethod(rawPtr, MethodBindings.setRangeConfigPtr, NIL)
  }

  public fun getRangeConfig(column: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRangeConfigPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun setMetadata(column: Int, meta: Any?) {
    TransferContext.writeArguments(LONG to column.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setMetadataPtr, NIL)
  }

  public fun getMetadata(column: Int): Any? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setCustomDraw(
    column: Int,
    _object: Object,
    callback: StringName,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to _object, STRING_NAME to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDrawPtr, NIL)
  }

  public fun setCollapsedRecursive(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedRecursivePtr, NIL)
  }

  @JvmOverloads
  public fun isAnyCollapsed(onlyVisible: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to onlyVisible)
    TransferContext.callMethod(rawPtr, MethodBindings.isAnyCollapsedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun uncollapseTree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.uncollapseTreePtr, NIL)
  }

  public fun setSelectable(column: Int, selectable: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectablePtr, NIL)
  }

  public fun isSelectable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isSelected(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun select(column: Int) {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  public fun deselect(column: Int) {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  public fun setEditable(column: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
  }

  public fun isEditable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCustomColor(column: Int, color: Color) {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomColorPtr, NIL)
  }

  public fun getCustomColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun clearCustomColor(column: Int) {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearCustomColorPtr, NIL)
  }

  public fun setCustomFont(column: Int, font: Font) {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFontPtr, NIL)
  }

  public fun getCustomFont(column: Int): Font? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  public fun setCustomFontSize(column: Int, fontSize: Int) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFontSizePtr, NIL)
  }

  public fun getCustomFontSize(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean = false,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to color, BOOL to justOutline)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomBgColorPtr, NIL)
  }

  public fun clearCustomBgColor(column: Int) {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearCustomBgColorPtr, NIL)
  }

  public fun getCustomBgColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setCustomAsButton(column: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomAsButtonPtr, NIL)
  }

  public fun isCustomSetAsButton(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCustomSetAsButtonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addButton(
    column: Int,
    button: Texture2D,
    id: Int = -1,
    disabled: Boolean = false,
    tooltipText: String = "",
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to button, LONG to id.toLong(), BOOL to disabled, STRING to tooltipText)
    TransferContext.callMethod(rawPtr, MethodBindings.addButtonPtr, NIL)
  }

  public fun getButtonCount(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getButtonTooltipText(column: Int, buttonIndex: Int): String {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonTooltipTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getButtonId(column: Int, buttonIndex: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getButtonById(column: Int, id: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonByIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getButton(column: Int, buttonIndex: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setButton(
    column: Int,
    buttonIndex: Int,
    button: Texture2D,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), OBJECT to button)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonPtr, NIL)
  }

  public fun eraseButton(column: Int, buttonIndex: Int) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.eraseButtonPtr, NIL)
  }

  public fun setButtonDisabled(
    column: Int,
    buttonIndex: Int,
    disabled: Boolean,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonDisabledPtr, NIL)
  }

  public fun setButtonColor(
    column: Int,
    buttonIndex: Int,
    color: Color,
  ) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonColorPtr, NIL)
  }

  public fun isButtonDisabled(column: Int, buttonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isButtonDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setTooltipText(column: Int, tooltip: String) {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipTextPtr, NIL)
  }

  public fun getTooltipText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setTextAlignment(column: Int, textAlignment: HorizontalAlignment) {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to textAlignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextAlignmentPtr, NIL)
  }

  public fun getTextAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setExpandRight(column: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandRightPtr, NIL)
  }

  public fun getExpandRight(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getExpandRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun createChild(index: Int = -1): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun addChild(child: TreeItem) {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, MethodBindings.addChildPtr, NIL)
  }

  public fun removeChild(child: TreeItem) {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, MethodBindings.removeChildPtr, NIL)
  }

  public fun getTree(): Tree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tree?)
  }

  public fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getFirstChild(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  @JvmOverloads
  public fun getNextInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextInTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  @JvmOverloads
  public fun getPrevInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevInTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  @JvmOverloads
  public fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisiblePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  @JvmOverloads
  public fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevVisiblePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getChild(index: Int): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  public fun getChildCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChildCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getChildren(): VariantArray<TreeItem> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<TreeItem>)
  }

  public fun getIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun moveBefore(item: TreeItem) {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, MethodBindings.moveBeforePtr, NIL)
  }

  public fun moveAfter(item: TreeItem) {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, MethodBindings.moveAfterPtr, NIL)
  }

  public fun callRecursive(method: StringName, vararg __var_args: Any?) {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callRecursivePtr, NIL)
  }

  public enum class TreeCellMode(
    id: Long,
  ) {
    CELL_MODE_STRING(0),
    CELL_MODE_CHECK(1),
    CELL_MODE_RANGE(2),
    CELL_MODE_ICON(3),
    CELL_MODE_CUSTOM(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TreeCellMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCellModePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_cell_mode")

    public val getCellModePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_cell_mode")

    public val setEditMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_edit_multiline")

    public val isEditMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_edit_multiline")

    public val setCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_checked")

    public val setIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_indeterminate")

    public val isCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_checked")

    public val isIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_indeterminate")

    public val propagateCheckPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "propagate_check")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_text")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_text_direction")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_autowrap_mode")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_structured_text_bidi_override_options")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_language")

    public val setSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_suffix")

    public val getSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_suffix")

    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_icon")

    public val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_icon")

    public val setIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_region")

    public val getIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_region")

    public val setIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_max_width")

    public val getIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_max_width")

    public val setIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_modulate")

    public val getIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_modulate")

    public val setRangePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_range")

    public val getRangePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_range")

    public val setRangeConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_range_config")

    public val getRangeConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_range_config")

    public val setMetadataPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_metadata")

    public val getMetadataPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_metadata")

    public val setCustomDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_draw")

    public val setCollapsedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_collapsed")

    public val isCollapsedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_collapsed")

    public val setCollapsedRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_collapsed_recursive")

    public val isAnyCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_any_collapsed")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_visible")

    public val uncollapseTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "uncollapse_tree")

    public val setCustomMinimumHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_minimum_height")

    public val getCustomMinimumHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_minimum_height")

    public val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_selectable")

    public val isSelectablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_selectable")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_selected")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "select")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "deselect")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_editable")

    public val setCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_color")

    public val getCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_color")

    public val clearCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "clear_custom_color")

    public val setCustomFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_font")

    public val getCustomFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_font")

    public val setCustomFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_font_size")

    public val getCustomFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_font_size")

    public val setCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_bg_color")

    public val clearCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "clear_custom_bg_color")

    public val getCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_bg_color")

    public val setCustomAsButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_as_button")

    public val isCustomSetAsButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_custom_set_as_button")

    public val addButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "add_button")

    public val getButtonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_count")

    public val getButtonTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_tooltip_text")

    public val getButtonIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_button_id")

    public val getButtonByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_by_id")

    public val getButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_button")

    public val setButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_button")

    public val eraseButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "erase_button")

    public val setButtonDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_button_disabled")

    public val setButtonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_button_color")

    public val isButtonDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_button_disabled")

    public val setTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_tooltip_text")

    public val getTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_tooltip_text")

    public val setTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_text_alignment")

    public val getTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_text_alignment")

    public val setExpandRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_expand_right")

    public val getExpandRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_expand_right")

    public val setDisableFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_disable_folding")

    public val isFoldingDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_folding_disabled")

    public val createChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "create_child")

    public val addChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "add_child")

    public val removeChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "remove_child")

    public val getTreePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_tree")

    public val getNextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_next")

    public val getPrevPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_prev")

    public val getParentPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_parent")

    public val getFirstChildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_first_child")

    public val getNextInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_next_in_tree")

    public val getPrevInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_prev_in_tree")

    public val getNextVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_next_visible")

    public val getPrevVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_prev_visible")

    public val getChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_child")

    public val getChildCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_child_count")

    public val getChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_children")

    public val getIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_index")

    public val moveBeforePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "move_before")

    public val moveAfterPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "move_after")

    public val callRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "call_recursive")
  }
}
