// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SubViewportContainer : Container() {
  public var stretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isStretchEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchPtr, NIL)
    }

  public var stretchShrink: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchShrinkPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchShrinkPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SUBVIEWPORTCONTAINER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch")

    public val isStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "is_stretch_enabled")

    public val setStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch_shrink")

    public val getStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "get_stretch_shrink")
  }
}
