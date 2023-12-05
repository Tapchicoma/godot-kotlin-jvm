// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class CanvasGroup : Node2D() {
  public var fitMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFitMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFitMarginPtr, NIL)
    }

  public var clearMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClearMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setClearMarginPtr, NIL)
    }

  public var useMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingMipmapsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseMipmapsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASGROUP, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFitMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_fit_margin")

    public val getFitMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "get_fit_margin")

    public val setClearMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_clear_margin")

    public val getClearMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "get_clear_margin")

    public val setUseMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_use_mipmaps")

    public val isUsingMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "is_using_mipmaps")
  }
}
