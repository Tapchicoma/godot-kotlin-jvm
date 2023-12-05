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
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
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
public open class PhysicsShapeQueryParameters3D : RefCounted() {
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

  @CoreTypeLocalCopy
  public var motion: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
    }

  public var shape: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  public var shapeRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapeRidPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapeRidPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
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
    callConstructor(ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS3D, scriptIndex)
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
   * val myCoreType = physicsshapequeryparameters3d.motion
   * //Your changes
   * physicsshapequeryparameters3d.motion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMutate(block: Vector3.() -> Unit): Vector3 = motion.apply{
      block(this)
      motion = this
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
   * val myCoreType = physicsshapequeryparameters3d.transform
   * //Your changes
   * physicsshapequeryparameters3d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  public companion object

  internal object MethodBindings {
    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_shape")

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_shape")

    public val setShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_shape_rid")

    public val getShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_shape_rid")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_transform")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_transform")

    public val setMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_motion")

    public val getMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_motion")

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_margin")

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_margin")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_collision_mask")

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_exclude")

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "get_exclude")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "is_collide_with_bodies_enabled")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters3D", "is_collide_with_areas_enabled")
  }
}
