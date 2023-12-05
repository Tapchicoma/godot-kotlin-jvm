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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class KinematicCollision2D : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION2D, scriptIndex)
    return true
  }

  public fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getTravel(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRemainder(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemainderPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  @JvmOverloads
  public fun getAngle(upDirection: Vector2 = Vector2(0, -1)): Float {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getLocalShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getColliderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getColliderShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun getColliderShapeIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getColliderVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_position")

    public val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_normal")

    public val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_travel")

    public val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_remainder")

    public val getAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_angle")

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_depth")

    public val getLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_local_shape")

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider")

    public val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider_id")

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider_rid")

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider_shape")

    public val getColliderShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider_shape_index")

    public val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision2D", "get_collider_velocity")
  }
}
