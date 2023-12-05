// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class SyntaxHighlighter : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SYNTAXHIGHLIGHTER, scriptIndex)
    return true
  }

  public open fun _getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_line_syntax_highlighting is not implemented for SyntaxHighlighter")
  }

  public open fun _clearHighlightingCache() {
  }

  public open fun _updateCache() {
  }

  public fun getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineSyntaxHighlightingPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun updateCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateCachePtr, NIL)
  }

  public fun clearHighlightingCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearHighlightingCachePtr, NIL)
  }

  public fun getTextEdit(): TextEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val _getLineSyntaxHighlightingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_get_line_syntax_highlighting")

    public val _clearHighlightingCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_clear_highlighting_cache")

    public val _updateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_update_cache")

    public val getLineSyntaxHighlightingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_line_syntax_highlighting")

    public val updateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "update_cache")

    public val clearHighlightingCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "clear_highlighting_cache")

    public val getTextEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_text_edit")
  }
}
