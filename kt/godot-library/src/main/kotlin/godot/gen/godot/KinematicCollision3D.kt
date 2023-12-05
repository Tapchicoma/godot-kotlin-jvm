// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class KinematicCollision3D : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION3D, scriptIndex)
    return true
  }

  public fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemainderPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getPosition(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun getNormal(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun getAngle(collisionIndex: Int = 0, upDirection: Vector3 = Vector3(0, 1, 0)): Float {
    TransferContext.writeArguments(LONG to collisionIndex.toLong(), VECTOR3 to upDirection)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun getLocalShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  @JvmOverloads
  public fun getCollider(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  @JvmOverloads
  public fun getColliderId(collisionIndex: Int = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun getColliderRid(collisionIndex: Int = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun getColliderShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  @JvmOverloads
  public fun getColliderShapeIndex(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_travel")

    public val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_remainder")

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_depth")

    public val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collision_count")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_position")

    public val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_normal")

    public val getAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_angle")

    public val getLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_local_shape")

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider")

    public val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_id")

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_rid")

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape")

    public val getColliderShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape_index")

    public val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_velocity")
  }
}
