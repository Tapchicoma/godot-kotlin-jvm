// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PhysicsBody3D internal constructor() : CollisionObject3D() {
  public var axisLockLinearX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  public var axisLockLinearY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  public var axisLockLinearZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  public var axisLockAngularX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  public var axisLockAngularY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  public var axisLockAngularZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisLockPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisLockPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSBODY3D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun moveAndCollide(
    motion: Vector3,
    testOnly: Boolean = false,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): KinematicCollision3D? {
    TransferContext.writeArguments(VECTOR3 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveAndCollidePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?)
  }

  @JvmOverloads
  public fun testMove(
    from: Transform3D,
    motion: Vector3,
    collision: KinematicCollision3D? = null,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM3D to from, VECTOR3 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.testMovePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody3D>)
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
        TypeManager.getMethodBindPtr("PhysicsBody3D", "move_and_collide")

    public val testMovePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsBody3D", "test_move")

    public val setAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "set_axis_lock")

    public val getAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "get_axis_lock")

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "get_collision_exceptions")

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "add_collision_exception_with")

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "remove_collision_exception_with")
  }
}
