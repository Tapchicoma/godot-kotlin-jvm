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
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PhysicsPointQueryParameters2D : RefCounted() {
  @CoreTypeLocalCopy
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  public var canvasInstanceId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasInstanceIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasInstanceIdPtr, NIL)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS2D, scriptIndex)
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
   * val myCoreType = physicspointqueryparameters2d.position
   * //Your changes
   * physicspointqueryparameters2d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public companion object

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_position")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_position")

    public val setCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_canvas_instance_id")

    public val getCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_canvas_instance_id")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_collision_mask")

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_exclude")

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_exclude")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "is_collide_with_bodies_enabled")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters2D", "is_collide_with_areas_enabled")
  }
}
