// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorSyntaxHighlighter internal constructor() : SyntaxHighlighter() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSYNTAXHIGHLIGHTER, scriptIndex)
    return true
  }

  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for EditorSyntaxHighlighter")
  }

  public open fun _getSupportedLanguages(): PackedStringArray {
    throw NotImplementedError("_get_supported_languages is not implemented for EditorSyntaxHighlighter")
  }

  public companion object

  internal object MethodBindings {
    public val _getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSyntaxHighlighter", "_get_name")

    public val _getSupportedLanguagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSyntaxHighlighter", "_get_supported_languages")
  }
}
