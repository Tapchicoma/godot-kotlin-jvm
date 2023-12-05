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
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SplitContainer : Container() {
  public val dragged: Signal1<Long> by signal("offset")

  public var splitOffset: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSplitOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSplitOffsetPtr, NIL)
    }

  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
    }

  public var draggerVisibility: DraggerVisibility
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDraggerVisibilityPtr, LONG)
      return SplitContainer.DraggerVisibility.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDraggerVisibilityPtr, NIL)
    }

  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPLITCONTAINER, scriptIndex)
    return true
  }

  public fun clampSplitOffset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clampSplitOffsetPtr, NIL)
  }

  public enum class DraggerVisibility(
    id: Long,
  ) {
    DRAGGER_VISIBLE(0),
    DRAGGER_HIDDEN(1),
    DRAGGER_HIDDEN_COLLAPSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DraggerVisibility = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_split_offset")

    public val getSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_split_offset")

    public val clampSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "clamp_split_offset")

    public val setCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_collapsed")

    public val isCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_collapsed")

    public val setDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_dragger_visibility")

    public val getDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_dragger_visibility")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_vertical")

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_vertical")
  }
}
