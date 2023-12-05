// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class RichTextEffect : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RICHTEXTEFFECT, scriptIndex)
    return true
  }

  public open fun _processCustomFx(charFx: CharFXTransform): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }

  public companion object

  internal object MethodBindings {
    public val _processCustomFxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextEffect", "_process_custom_fx")
  }
}
