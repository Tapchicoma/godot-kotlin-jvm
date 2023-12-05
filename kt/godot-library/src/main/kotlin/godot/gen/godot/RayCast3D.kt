// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class RayCast3D : Node3D() {
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
  public var targetPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
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

  public var hitFromInside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHitFromInsideEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHitFromInsidePtr, NIL)
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

  @CoreTypeLocalCopy
  public var debugShapeCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugShapeCustomColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugShapeCustomColorPtr, NIL)
    }

  public var debugShapeThickness: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugShapeThicknessPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugShapeThicknessPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RAYCAST3D, scriptIndex)
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
   * val myCoreType = raycast3d.targetPosition
   * //Your changes
   * raycast3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
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
   * val myCoreType = raycast3d.debugShapeCustomColor
   * //Your changes
   * raycast3d.debugShapeCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugShapeCustomColorMutate(block: Color.() -> Unit): Color =
      debugShapeCustomColor.apply{
      block(this)
      debugShapeCustomColor = this
  }


  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCollidingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun forceRaycastUpdate() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceRaycastUpdatePtr, NIL)
  }

  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getColliderShape(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCollisionPoint(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getCollisionNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun addExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionRidPtr, NIL)
  }

  public fun addException(node: CollisionObject3D) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionPtr, NIL)
  }

  public fun removeExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  public fun removeException(node: CollisionObject3D) {
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
    public val setEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("RayCast3D", "set_enabled")

    public val isEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("RayCast3D", "is_enabled")

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_target_position")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_target_position")

    public val isCollidingPtr: VoidPtr = TypeManager.getMethodBindPtr("RayCast3D", "is_colliding")

    public val forceRaycastUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "force_raycast_update")

    public val getColliderPtr: VoidPtr = TypeManager.getMethodBindPtr("RayCast3D", "get_collider")

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collider_rid")

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collider_shape")

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_point")

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_normal")

    public val addExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "add_exception_rid")

    public val addExceptionPtr: VoidPtr = TypeManager.getMethodBindPtr("RayCast3D", "add_exception")

    public val removeExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "remove_exception_rid")

    public val removeExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "remove_exception")

    public val clearExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "clear_exceptions")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_mask_value")

    public val setExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_exclude_parent_body")

    public val getExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_exclude_parent_body")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_collide_with_areas_enabled")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_collide_with_bodies_enabled")

    public val setHitFromInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_hit_from_inside")

    public val isHitFromInsideEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_hit_from_inside_enabled")

    public val setDebugShapeCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_debug_shape_custom_color")

    public val getDebugShapeCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_debug_shape_custom_color")

    public val setDebugShapeThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_debug_shape_thickness")

    public val getDebugShapeThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_debug_shape_thickness")
  }
}
