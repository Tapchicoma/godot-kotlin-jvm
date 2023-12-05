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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class OccluderInstance3D : Node3D() {
  public var occluder: Occluder3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOccluderPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Occluder3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOccluderPtr, NIL)
    }

  public var bakeMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeMaskPtr, NIL)
    }

  public var bakeSimplificationDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeSimplificationDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeSimplificationDistancePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OCCLUDERINSTANCE3D, scriptIndex)
    return true
  }

  public fun setBakeMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setBakeMaskValuePtr, NIL)
  }

  public fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBakeMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_mask")

    public val getBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_mask")

    public val setBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_mask_value")

    public val getBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_mask_value")

    public val setBakeSimplificationDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_simplification_distance")

    public val getBakeSimplificationDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_simplification_distance")

    public val setOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_occluder")

    public val getOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_occluder")
  }
}
