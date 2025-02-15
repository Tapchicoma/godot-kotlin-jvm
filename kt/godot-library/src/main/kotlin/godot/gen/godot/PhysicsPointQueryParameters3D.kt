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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides parameters for [godot.PhysicsDirectSpaceState3D.intersectPoint].
 *
 * By changing various properties of this object, such as the point position, you can configure the parameters for [godot.PhysicsDirectSpaceState3D.intersectPoint].
 */
@GodotBaseType
public open class PhysicsPointQueryParameters3D : RefCounted() {
  /**
   * The position being queried for, in global coordinates.
   */
  @CoreTypeLocalCopy
  public var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
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

  /**
   * The list of object [RID]s that will be excluded from collisions. Use [godot.CollisionObject3D.getRid] to get the [RID] associated with a [godot.CollisionObject3D]-derived node.
   */
  public var exclude: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludePtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludePtr, NIL)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody3D]s into account.
   */
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

  /**
   * If `true`, the query will take [godot.Area3D]s into account.
   */
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D, scriptIndex)
    return true
  }

  /**
   * The position being queried for, in global coordinates.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicspointqueryparameters3d.position
   * //Your changes
   * physicspointqueryparameters3d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
      block(this)
      position = this
  }


  public companion object

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_position")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_position")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_collision_mask")

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_exclude")

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_exclude")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "is_collide_with_bodies_enabled")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "is_collide_with_areas_enabled")
  }
}
