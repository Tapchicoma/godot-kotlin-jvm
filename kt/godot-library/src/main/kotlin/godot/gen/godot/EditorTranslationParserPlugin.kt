// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorTranslationParserPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORTRANSLATIONPARSERPLUGIN, scriptIndex)
    return true
  }

  public open fun _parseFile(
    path: String,
    msgids: VariantArray<String>,
    msgidsContextPlural: VariantArray<VariantArray<Any?>>,
  ) {
  }

  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for EditorTranslationParserPlugin")
  }

  public companion object

  internal object MethodBindings {
    public val _parseFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorTranslationParserPlugin", "_parse_file")

    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorTranslationParserPlugin", "_get_recognized_extensions")
  }
}
