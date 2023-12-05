// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class OptimizedTranslation : Translation() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPTIMIZEDTRANSLATION, scriptIndex)
    return true
  }

  public fun generate(from: Translation) {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, MethodBindings.generatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val generatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptimizedTranslation", "generate")
  }
}
