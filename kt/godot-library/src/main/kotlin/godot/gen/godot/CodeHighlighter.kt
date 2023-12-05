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
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class CodeHighlighter : SyntaxHighlighter() {
  @CoreTypeLocalCopy
  public var numberColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNumberColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNumberColorPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var symbolColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSymbolColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSymbolColorPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var functionColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionColorPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var memberVariableColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMemberVariableColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMemberVariableColorPtr, NIL)
    }

  public var keywordColors: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeywordColorsPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeywordColorsPtr, NIL)
    }

  public var memberKeywordColors: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMemberKeywordColorsPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMemberKeywordColorsPtr, NIL)
    }

  public var colorRegions: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRegionsPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRegionsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CODEHIGHLIGHTER, scriptIndex)
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
   * val myCoreType = codehighlighter.numberColor
   * //Your changes
   * codehighlighter.numberColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun numberColorMutate(block: Color.() -> Unit): Color = numberColor.apply{
      block(this)
      numberColor = this
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
   * val myCoreType = codehighlighter.symbolColor
   * //Your changes
   * codehighlighter.symbolColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun symbolColorMutate(block: Color.() -> Unit): Color = symbolColor.apply{
      block(this)
      symbolColor = this
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
   * val myCoreType = codehighlighter.functionColor
   * //Your changes
   * codehighlighter.functionColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun functionColorMutate(block: Color.() -> Unit): Color = functionColor.apply{
      block(this)
      functionColor = this
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
   * val myCoreType = codehighlighter.memberVariableColor
   * //Your changes
   * codehighlighter.memberVariableColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun memberVariableColorMutate(block: Color.() -> Unit): Color =
      memberVariableColor.apply{
      block(this)
      memberVariableColor = this
  }


  public fun addKeywordColor(keyword: String, color: Color) {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addKeywordColorPtr, NIL)
  }

  public fun removeKeywordColor(keyword: String) {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.removeKeywordColorPtr, NIL)
  }

  public fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.hasKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.getKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun clearKeywordColors() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearKeywordColorsPtr, NIL)
  }

  public fun addMemberKeywordColor(memberKeyword: String, color: Color) {
    TransferContext.writeArguments(STRING to memberKeyword, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addMemberKeywordColorPtr, NIL)
  }

  public fun removeMemberKeywordColor(memberKeyword: String) {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.removeMemberKeywordColorPtr, NIL)
  }

  public fun hasMemberKeywordColor(memberKeyword: String): Boolean {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.hasMemberKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getMemberKeywordColor(memberKeyword: String): Color {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.getMemberKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun clearMemberKeywordColors() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearMemberKeywordColorsPtr, NIL)
  }

  @JvmOverloads
  public fun addColorRegion(
    startKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, COLOR to color, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.addColorRegionPtr, NIL)
  }

  public fun removeColorRegion(startKey: String) {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeColorRegionPtr, NIL)
  }

  public fun hasColorRegion(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasColorRegionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearColorRegions() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearColorRegionsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_keyword_color")

    public val removeKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_keyword_color")

    public val hasKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_keyword_color")

    public val getKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_color")

    public val setKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_keyword_colors")

    public val clearKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_keyword_colors")

    public val getKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_colors")

    public val addMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_member_keyword_color")

    public val removeMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_member_keyword_color")

    public val hasMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_member_keyword_color")

    public val getMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_color")

    public val setMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_keyword_colors")

    public val clearMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_member_keyword_colors")

    public val getMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_colors")

    public val addColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_color_region")

    public val removeColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_color_region")

    public val hasColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_color_region")

    public val setColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_color_regions")

    public val clearColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_color_regions")

    public val getColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_color_regions")

    public val setFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_function_color")

    public val getFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_function_color")

    public val setNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_number_color")

    public val getNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_number_color")

    public val setSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_symbol_color")

    public val getSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_symbol_color")

    public val setMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_variable_color")

    public val getMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_variable_color")
  }
}
