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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class Slider internal constructor() : Range() {
  public val dragStarted: Signal0 by signal()

  public val dragEnded: Signal1<Boolean> by signal("valueChanged")

  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  public var scrollable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollablePtr, NIL)
    }

  public var tickCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTicksPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTicksPtr, NIL)
    }

  public var ticksOnBorders: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTicksOnBordersPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTicksOnBordersPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SLIDER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTicksPtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "set_ticks")

    public val getTicksPtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "get_ticks")

    public val getTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks_on_borders")

    public val setTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks_on_borders")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "is_editable")

    public val setScrollablePtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "set_scrollable")

    public val isScrollablePtr: VoidPtr = TypeManager.getMethodBindPtr("Slider", "is_scrollable")
  }
}
