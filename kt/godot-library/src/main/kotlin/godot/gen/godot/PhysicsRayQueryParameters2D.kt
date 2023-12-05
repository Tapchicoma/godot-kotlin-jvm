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
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PhysicsRayQueryParameters2D : RefCounted() {
  @CoreTypeLocalCopy
  public var from: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFromPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFromPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var to: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getToPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setToPtr, NIL)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSRAYQUERYPARAMETERS2D, scriptIndex)
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
   * val myCoreType = physicsrayqueryparameters2d.from
   * //Your changes
   * physicsrayqueryparameters2d.from = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fromMutate(block: Vector2.() -> Unit): Vector2 = from.apply{
      block(this)
      from = this
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
   * val myCoreType = physicsrayqueryparameters2d.to
   * //Your changes
   * physicsrayqueryparameters2d.to = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun toMutate(block: Vector2.() -> Unit): Vector2 = to.apply{
      block(this)
      to = this
  }


  public companion object {
    @JvmOverloads
    public fun create(
      from: Vector2,
      to: Vector2,
      collisionMask: Long = 4294967295,
      exclude: VariantArray<RID> = godot.core.variantArrayOf(),
    ): PhysicsRayQueryParameters2D? {
      TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, LONG to collisionMask, ARRAY to exclude)
      TransferContext.callMethod(0, MethodBindings.createPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsRayQueryParameters2D?)
    }
  }

  internal object MethodBindings {
    public val createPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "create")

    public val setFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_from")

    public val getFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_from")

    public val setToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_to")

    public val getToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_to")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_collision_mask")

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_exclude")

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_exclude")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_collide_with_bodies_enabled")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_collide_with_areas_enabled")

    public val setHitFromInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_hit_from_inside")

    public val isHitFromInsideEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_hit_from_inside_enabled")
  }
}
