// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ShapeCast2D : Node2D() {
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeParentBodyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeParentBodyPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
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

  public var maxResults: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxResultsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxResultsPtr, NIL)
    }

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

  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
    }

  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHAPECAST2D, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = shapecast2d.targetPosition
   * //Your changes
   * shapecast2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCollidingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun forceShapecastUpdate() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceShapecastUpdatePtr, NIL)
  }

  public fun getCollider(index: Int): Object? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getColliderRid(index: Int): RID {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getColliderShape(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCollisionPoint(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getCollisionNormal(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getClosestCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestCollisionSafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getClosestCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestCollisionUnsafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun addExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionRidPtr, NIL)
  }

  public fun addException(node: CollisionObject2D) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionPtr, NIL)
  }

  public fun removeExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  public fun removeException(node: CollisionObject2D) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionPtr, NIL)
  }

  public fun clearExceptions() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExceptionsPtr, NIL)
  }

  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "set_enabled")

    public val isEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "is_enabled")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "get_shape")

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_target_position")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_target_position")

    public val setMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "set_margin")

    public val getMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "get_margin")

    public val setMaxResultsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_max_results")

    public val getMaxResultsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_max_results")

    public val isCollidingPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "is_colliding")

    public val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_count")

    public val forceShapecastUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "force_shapecast_update")

    public val getColliderPtr: VoidPtr = TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider")

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider_rid")

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider_shape")

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_point")

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_normal")

    public val getClosestCollisionSafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_closest_collision_safe_fraction")

    public val getClosestCollisionUnsafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_closest_collision_unsafe_fraction")

    public val addExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "add_exception_rid")

    public val addExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "add_exception")

    public val removeExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "remove_exception_rid")

    public val removeExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "remove_exception")

    public val clearExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "clear_exceptions")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_mask_value")

    public val setExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_exclude_parent_body")

    public val getExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_exclude_parent_body")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_collide_with_areas_enabled")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_collide_with_bodies_enabled")
  }
}
