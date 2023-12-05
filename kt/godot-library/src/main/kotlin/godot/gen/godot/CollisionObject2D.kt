// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class CollisionObject2D internal constructor() : Node2D() {
  public val inputEvent: Signal3<Node, InputEvent, Long> by signal("viewport", "event", "shapeIdx")

  public val mouseEntered: Signal0 by signal()

  public val mouseExited: Signal0 by signal()

  public val mouseShapeEntered: Signal1<Long> by signal("shapeIdx")

  public val mouseShapeExited: Signal1<Long> by signal("shapeIdx")

  public var disableMode: DisableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
      return CollisionObject2D.DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
    }

  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
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

  public var collisionPriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
    }

  public var inputPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPickablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickablePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONOBJECT2D, scriptIndex)
    return true
  }

  public open fun _inputEvent(
    viewport: Viewport,
    event: InputEvent,
    shapeIdx: Int,
  ) {
  }

  public open fun _mouseEnter() {
  }

  public open fun _mouseExit() {
  }

  public open fun _mouseShapeEnter(shapeIdx: Int) {
  }

  public open fun _mouseShapeExit(shapeIdx: Int) {
  }

  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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

  public fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr, MethodBindings.createShapeOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun removeShapeOwner(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.removeShapeOwnerPtr, NIL)
  }

  public fun getShapeOwners(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShapeOwnersPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D) {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetTransformPtr, NIL)
  }

  public fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetDisabledPtr, NIL)
  }

  public fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.isShapeOwnerDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetOneWayCollisionPtr, NIL)
  }

  public fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.isShapeOwnerOneWayCollisionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Float) {
    TransferContext.writeArguments(LONG to ownerId, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetOneWayCollisionMarginPtr, NIL)
  }

  public fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Float {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.getShapeOwnerOneWayCollisionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D) {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerAddShapePtr, NIL)
  }

  public fun shapeOwnerGetShapeCount(ownerId: Long): Int {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun shapeOwnerGetShape(ownerId: Long, shapeId: Int): Shape2D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
  }

  public fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Int): Int {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Int) {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerRemoveShapePtr, NIL)
  }

  public fun shapeOwnerClearShapes(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerClearShapesPtr, NIL)
  }

  public fun shapeFindOwner(shapeIndex: Int): Long {
    TransferContext.writeArguments(LONG to shapeIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeFindOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class DisableMode(
    id: Long,
  ) {
    DISABLE_MODE_REMOVE(0),
    DISABLE_MODE_MAKE_STATIC(1),
    DISABLE_MODE_KEEP_ACTIVE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DisableMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _inputEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "_input_event")

    public val _mouseEnterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "_mouse_enter")

    public val _mouseExitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "_mouse_exit")

    public val _mouseShapeEnterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "_mouse_shape_enter")

    public val _mouseShapeExitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "_mouse_shape_exit")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionObject2D", "get_rid")

    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_layer")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_mask")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_layer_value")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_mask_value")

    public val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_priority")

    public val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_priority")

    public val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_disable_mode")

    public val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_disable_mode")

    public val setPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_pickable")

    public val isPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_pickable")

    public val createShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "create_shape_owner")

    public val removeShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "remove_shape_owner")

    public val getShapeOwnersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_shape_owners")

    public val shapeOwnerSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_transform")

    public val shapeOwnerGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_transform")

    public val shapeOwnerGetOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_owner")

    public val shapeOwnerSetDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_disabled")

    public val isShapeOwnerDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_shape_owner_disabled")

    public val shapeOwnerSetOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_one_way_collision")

    public val isShapeOwnerOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_shape_owner_one_way_collision_enabled")

    public val shapeOwnerSetOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_one_way_collision_margin")

    public val getShapeOwnerOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_shape_owner_one_way_collision_margin")

    public val shapeOwnerAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_add_shape")

    public val shapeOwnerGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape_count")

    public val shapeOwnerGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape")

    public val shapeOwnerGetShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape_index")

    public val shapeOwnerRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_remove_shape")

    public val shapeOwnerClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_clear_shapes")

    public val shapeFindOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_find_owner")
  }
}
