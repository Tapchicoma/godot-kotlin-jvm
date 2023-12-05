// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Node2D : CanvasItem() {
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

  public var rotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  public var rotationDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  public var skew: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkewPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkewPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var transform: Transform2D
    @JvmName("getTransform_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
    }

  public var globalRotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationPtr, NIL)
    }

  public var globalRotationDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalScalePtr, NIL)
    }

  public var globalSkew: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalSkewPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalSkewPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalTransform: Transform2D
    @JvmName("getGlobalTransform_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getGlobalTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalTransformPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NODE2D, scriptIndex)
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
   * val myCoreType = node2d.position
   * //Your changes
   * node2d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
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
   * val myCoreType = node2d.scale
   * //Your changes
   * node2d.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
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
   * val myCoreType = node2d.transform
   * //Your changes
   * node2d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
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
   * val myCoreType = node2d.globalPosition
   * //Your changes
   * node2d.globalPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalPositionMutate(block: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      block(this)
      globalPosition = this
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
   * val myCoreType = node2d.globalScale
   * //Your changes
   * node2d.globalScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalScaleMutate(block: Vector2.() -> Unit): Vector2 = globalScale.apply{
      block(this)
      globalScale = this
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
   * val myCoreType = node2d.globalTransform
   * //Your changes
   * node2d.globalTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      globalTransform.apply{
      block(this)
      globalTransform = this
  }


  public fun rotate(radians: Float) {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotatePtr, NIL)
  }

  @JvmOverloads
  public fun moveLocalX(delta: Float, scaled: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(rawPtr, MethodBindings.moveLocalXPtr, NIL)
  }

  @JvmOverloads
  public fun moveLocalY(delta: Float, scaled: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(rawPtr, MethodBindings.moveLocalYPtr, NIL)
  }

  public fun translate(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, NIL)
  }

  public fun globalTranslate(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.globalTranslatePtr, NIL)
  }

  public fun applyScale(ratio: Vector2) {
    TransferContext.writeArguments(VECTOR2 to ratio)
    TransferContext.callMethod(rawPtr, MethodBindings.applyScalePtr, NIL)
  }

  public fun lookAt(point: Vector2) {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtPtr, NIL)
  }

  public fun getAngleTo(point: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getAngleToPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun toLocal(globalPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to globalPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun toGlobal(localPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toGlobalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRelativeTransformToParent(parent: Node): Transform2D {
    TransferContext.writeArguments(OBJECT to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.getRelativeTransformToParentPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public companion object

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_position")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_rotation")

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_rotation_degrees")

    public val setSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_skew")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_scale")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_position")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_rotation")

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_rotation_degrees")

    public val getSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_skew")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_scale")

    public val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "rotate")

    public val moveLocalXPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "move_local_x")

    public val moveLocalYPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "move_local_y")

    public val translatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "translate")

    public val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "global_translate")

    public val applyScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "apply_scale")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_position")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_position")

    public val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation")

    public val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation_degrees")

    public val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation")

    public val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation_degrees")

    public val setGlobalSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_global_skew")

    public val getGlobalSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_global_skew")

    public val setGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_scale")

    public val getGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_scale")

    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_transform")

    public val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_transform")

    public val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "look_at")

    public val getAngleToPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_angle_to")

    public val toLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "to_local")

    public val toGlobalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "to_global")

    public val getRelativeTransformToParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_relative_transform_to_parent")
  }
}
