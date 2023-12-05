// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class PropertyTweener : Tweener() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PROPERTYTWEENER, scriptIndex)
    return true
  }

  public fun from(`value`: Any?): PropertyTweener? {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.fromPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun fromCurrent(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fromCurrentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun asRelative(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asRelativePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun setTrans(trans: Tween.TransitionType): PropertyTweener? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun setEase(ease: Tween.EaseType): PropertyTweener? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public fun setDelay(delay: Double): PropertyTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val fromPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "from")

    public val fromCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "from_current")

    public val asRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "as_relative")

    public val setTransPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_trans")

    public val setEasePtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_ease")

    public val setDelayPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_delay")
  }
}
