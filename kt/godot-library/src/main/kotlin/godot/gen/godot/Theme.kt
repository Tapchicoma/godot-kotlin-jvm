// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
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

@GodotBaseType
public open class Theme : Resource() {
  public var defaultBaseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultBaseScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultBaseScalePtr, NIL)
    }

  public var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultFontPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultFontPtr, NIL)
    }

  public var defaultFontSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultFontSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultFontSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_THEME, scriptIndex)
    return true
  }

  public fun setIcon(
    name: StringName,
    themeType: StringName,
    texture: Texture2D,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  public fun getIcon(name: StringName, themeType: StringName): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun hasIcon(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameIcon(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameIconPtr, NIL)
  }

  public fun clearIcon(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearIconPtr, NIL)
  }

  public fun getIconList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getIconListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getIconTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIconTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setStylebox(
    name: StringName,
    themeType: StringName,
    texture: StyleBox,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setStyleboxPtr, NIL)
  }

  public fun getStylebox(name: StringName, themeType: StringName): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StyleBox?)
  }

  public fun hasStylebox(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameStylebox(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameStyleboxPtr, NIL)
  }

  public fun clearStylebox(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearStyleboxPtr, NIL)
  }

  public fun getStyleboxList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getStyleboxTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setFont(
    name: StringName,
    themeType: StringName,
    font: Font,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.setFontPtr, NIL)
  }

  public fun getFont(name: StringName, themeType: StringName): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  public fun hasFont(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameFont(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameFontPtr, NIL)
  }

  public fun clearFont(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearFontPtr, NIL)
  }

  public fun getFontList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getFontTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setFontSize(
    name: StringName,
    themeType: StringName,
    fontSize: Int,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFontSizePtr, NIL)
  }

  public fun getFontSize(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasFontSize(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameFontSize(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameFontSizePtr, NIL)
  }

  public fun clearFontSize(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearFontSizePtr, NIL)
  }

  public fun getFontSizeList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getFontSizeTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizeTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setColor(
    name: StringName,
    themeType: StringName,
    color: Color,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public fun getColor(name: StringName, themeType: StringName): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun hasColor(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameColor(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameColorPtr, NIL)
  }

  public fun clearColor(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearColorPtr, NIL)
  }

  public fun getColorList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getColorTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setConstant(
    name: StringName,
    themeType: StringName,
    constant: Int,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to constant.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  public fun getConstant(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasConstant(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameConstant(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameConstantPtr, NIL)
  }

  public fun clearConstant(name: StringName, themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearConstantPtr, NIL)
  }

  public fun getConstantList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getConstantTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun hasDefaultBaseScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultBaseScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasDefaultFont(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasDefaultFontSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setThemeItemPtr, NIL)
  }

  public fun getThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Any? {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun hasThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Boolean {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeItemPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun renameThemeItem(
    dataType: DataType,
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameThemeItemPtr, NIL)
  }

  public fun clearThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ) {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearThemeItemPtr, NIL)
  }

  public fun getThemeItemList(dataType: DataType, themeType: String): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id, STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getThemeItemTypeList(dataType: DataType): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setTypeVariation(themeType: StringName, baseType: StringName) {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.setTypeVariationPtr, NIL)
  }

  public fun isTypeVariation(themeType: StringName, baseType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.isTypeVariationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearTypeVariation(themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearTypeVariationPtr, NIL)
  }

  public fun getTypeVariationBase(themeType: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeVariationBasePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getTypeVariationList(baseType: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeVariationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun addType(themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.addTypePtr, NIL)
  }

  public fun removeType(themeType: StringName) {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTypePtr, NIL)
  }

  public fun getTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun mergeWith(other: Theme) {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, MethodBindings.mergeWithPtr, NIL)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public enum class DataType(
    id: Long,
  ) {
    DATA_TYPE_COLOR(0),
    DATA_TYPE_CONSTANT(1),
    DATA_TYPE_FONT(2),
    DATA_TYPE_FONT_SIZE(3),
    DATA_TYPE_ICON(4),
    DATA_TYPE_STYLEBOX(5),
    DATA_TYPE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DataType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_icon")

    public val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_icon")

    public val hasIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_icon")

    public val renameIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_icon")

    public val clearIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_icon")

    public val getIconListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_icon_list")

    public val getIconTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_icon_type_list")

    public val setStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_stylebox")

    public val getStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_stylebox")

    public val hasStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_stylebox")

    public val renameStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_stylebox")

    public val clearStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_stylebox")

    public val getStyleboxListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_list")

    public val getStyleboxTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_type_list")

    public val setFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_font")

    public val getFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font")

    public val hasFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_font")

    public val renameFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_font")

    public val clearFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_font")

    public val getFontListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font_list")

    public val getFontTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_type_list")

    public val setFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_font_size")

    public val getFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font_size")

    public val hasFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_font_size")

    public val renameFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_font_size")

    public val clearFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_font_size")

    public val getFontSizeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_list")

    public val getFontSizeTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_type_list")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_color")

    public val hasColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_color")

    public val renameColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_color")

    public val clearColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_color")

    public val getColorListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_color_list")

    public val getColorTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_color_type_list")

    public val setConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_constant")

    public val getConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_constant")

    public val hasConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_constant")

    public val renameConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_constant")

    public val clearConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_constant")

    public val getConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_list")

    public val getConstantTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_type_list")

    public val setDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_base_scale")

    public val getDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_base_scale")

    public val hasDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_base_scale")

    public val setDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font")

    public val getDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font")

    public val hasDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font")

    public val setDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font_size")

    public val getDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font_size")

    public val hasDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font_size")

    public val setThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_theme_item")

    public val getThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_theme_item")

    public val hasThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_theme_item")

    public val renameThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_theme_item")

    public val clearThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_theme_item")

    public val getThemeItemListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_list")

    public val getThemeItemTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_type_list")

    public val setTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_type_variation")

    public val isTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "is_type_variation")

    public val clearTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_type_variation")

    public val getTypeVariationBasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_base")

    public val getTypeVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_list")

    public val addTypePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "add_type")

    public val removeTypePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "remove_type")

    public val getTypeListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_type_list")

    public val mergeWithPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "merge_with")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear")
  }
}
