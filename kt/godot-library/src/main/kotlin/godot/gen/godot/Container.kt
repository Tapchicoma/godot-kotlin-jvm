// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class Container : Control() {
  public val preSortChildren: Signal0 by signal()

  public val sortChildren: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONTAINER, scriptIndex)
    return true
  }

  public open fun _getAllowedSizeFlagsHorizontal(): PackedInt32Array {
    throw NotImplementedError("_get_allowed_size_flags_horizontal is not implemented for Container")
  }

  public open fun _getAllowedSizeFlagsVertical(): PackedInt32Array {
    throw NotImplementedError("_get_allowed_size_flags_vertical is not implemented for Container")
  }

  public fun queueSort() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queueSortPtr, NIL)
  }

  public fun fitChildInRect(child: Control, rect: Rect2) {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.fitChildInRectPtr, NIL)
  }

  public companion object {
    public final const val NOTIFICATION_PRE_SORT_CHILDREN: Long = 50

    public final const val NOTIFICATION_SORT_CHILDREN: Long = 51
  }

  internal object MethodBindings {
    public val _getAllowedSizeFlagsHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "_get_allowed_size_flags_horizontal")

    public val _getAllowedSizeFlagsVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "_get_allowed_size_flags_vertical")

    public val queueSortPtr: VoidPtr = TypeManager.getMethodBindPtr("Container", "queue_sort")

    public val fitChildInRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "fit_child_in_rect")
  }
}
