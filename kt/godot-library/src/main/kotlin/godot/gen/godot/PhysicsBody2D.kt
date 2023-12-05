// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PhysicsBody2D internal constructor() : CollisionObject2D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSBODY2D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun moveAndCollide(
    motion: Vector2,
    testOnly: Boolean = false,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): KinematicCollision2D? {
    TransferContext.writeArguments(VECTOR2 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.moveAndCollidePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?)
  }

  @JvmOverloads
  public fun testMove(
    from: Transform2D,
    motion: Vector2,
    collision: KinematicCollision2D? = null,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to from, VECTOR2 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.testMovePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCollisionExceptions(): VariantArray<PhysicsBody2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody2D>)
  }

  public fun addCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  public fun removeCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val moveAndCollidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "move_and_collide")

    public val testMovePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsBody2D", "test_move")

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "get_collision_exceptions")

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "add_collision_exception_with")

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "remove_collision_exception_with")
  }
}
