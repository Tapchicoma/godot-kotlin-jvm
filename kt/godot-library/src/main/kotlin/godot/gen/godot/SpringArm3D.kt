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
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class SpringArm3D : Node3D() {
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  public var springLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRINGARM3D, scriptIndex)
    return true
  }

  public fun getHitLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHitLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun addExcludedObject(RID: RID) {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.addExcludedObjectPtr, NIL)
  }

  public fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExcludedObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clearExcludedObjects() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExcludedObjectsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getHitLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_hit_length")

    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_length")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_shape")

    public val addExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "add_excluded_object")

    public val removeExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "remove_excluded_object")

    public val clearExcludedObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "clear_excluded_objects")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_collision_mask")

    public val setMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_margin")

    public val getMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_margin")
  }
}
