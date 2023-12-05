// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class VisualInstance3D : Node3D() {
  public var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerMaskPtr, NIL)
    }

  public var sortingOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSortingOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSortingOffsetPtr, NIL)
    }

  public var sortingUseAabbCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSortingUseAabbCenterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSortingUseAabbCenterPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALINSTANCE3D, scriptIndex)
    return true
  }

  public open fun _getAabb(): CoreAABB {
    throw NotImplementedError("_get_aabb is not implemented for VisualInstance3D")
  }

  public fun setBase(base: RID) {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.setBasePtr, NIL)
  }

  public fun getBase(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBasePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getInstance(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInstancePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun setLayerMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerMaskValuePtr, NIL)
  }

  public fun getLayerMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAabb(): CoreAABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public companion object

  internal object MethodBindings {
    public val _getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "_get_aabb")

    public val setBasePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "set_base")

    public val getBasePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "get_base")

    public val getInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_instance")

    public val setLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_layer_mask")

    public val getLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_layer_mask")

    public val setLayerMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_layer_mask_value")

    public val getLayerMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_layer_mask_value")

    public val setSortingOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_sorting_offset")

    public val getSortingOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_sorting_offset")

    public val setSortingUseAabbCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_sorting_use_aabb_center")

    public val isSortingUseAabbCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "is_sorting_use_aabb_center")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "get_aabb")
  }
}
