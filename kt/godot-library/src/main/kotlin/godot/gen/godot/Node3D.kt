// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Node3D : Node() {
  public val visibilityChanged: Signal0 by signal()

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

  @CoreTypeLocalCopy
  public var globalTransform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalTransformPtr, NIL)
    }

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

  @CoreTypeLocalCopy
  public var rotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var rotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var quaternion: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getQuaternionPtr, QUATERNION)
      return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setQuaternionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var basis: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBasisPtr, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBasisPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  public var rotationEditMode: RotationEditMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationEditModePtr, LONG)
      return Node3D.RotationEditMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationEditModePtr, NIL)
    }

  public var rotationOrder: EulerOrder
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationOrderPtr, LONG)
      return EulerOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationOrderPtr, NIL)
    }

  public var topLevel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsTopLevelPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsTopLevelPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationDegreesPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
    }

  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  public var visibilityParent: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityParentPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityParentPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NODE3D, scriptIndex)
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
   * val myCoreType = node3d.transform
   * //Your changes
   * node3d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
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
   * val myCoreType = node3d.globalTransform
   * //Your changes
   * node3d.globalTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalTransformMutate(block: Transform3D.() -> Unit): Transform3D =
      globalTransform.apply{
      block(this)
      globalTransform = this
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
   * val myCoreType = node3d.position
   * //Your changes
   * node3d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
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
   * val myCoreType = node3d.rotation
   * //Your changes
   * node3d.rotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rotationMutate(block: Vector3.() -> Unit): Vector3 = rotation.apply{
      block(this)
      rotation = this
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
   * val myCoreType = node3d.rotationDegrees
   * //Your changes
   * node3d.rotationDegrees = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rotationDegreesMutate(block: Vector3.() -> Unit): Vector3 = rotationDegrees.apply{
      block(this)
      rotationDegrees = this
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
   * val myCoreType = node3d.quaternion
   * //Your changes
   * node3d.quaternion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun quaternionMutate(block: Quaternion.() -> Unit): Quaternion = quaternion.apply{
      block(this)
      quaternion = this
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
   * val myCoreType = node3d.basis
   * //Your changes
   * node3d.basis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun basisMutate(block: Basis.() -> Unit): Basis = basis.apply{
      block(this)
      basis = this
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
   * val myCoreType = node3d.scale
   * //Your changes
   * node3d.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply{
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
   * val myCoreType = node3d.globalPosition
   * //Your changes
   * node3d.globalPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalPositionMutate(block: Vector3.() -> Unit): Vector3 = globalPosition.apply{
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
   * val myCoreType = node3d.globalRotation
   * //Your changes
   * node3d.globalRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalRotationMutate(block: Vector3.() -> Unit): Vector3 = globalRotation.apply{
      block(this)
      globalRotation = this
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
   * val myCoreType = node3d.globalRotationDegrees
   * //Your changes
   * node3d.globalRotationDegrees = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalRotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      globalRotationDegrees.apply{
      block(this)
      globalRotationDegrees = this
  }


  public fun getParentNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentNode3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node3D?)
  }

  public fun setIgnoreTransformNotification(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreTransformNotificationPtr, NIL)
  }

  public fun setDisableScale(disable: Boolean) {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableScalePtr, NIL)
  }

  public fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isScaleDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
  }

  public fun forceUpdateTransform() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  public fun updateGizmos() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateGizmosPtr, NIL)
  }

  public fun addGizmo(gizmo: Node3DGizmo) {
    TransferContext.writeArguments(OBJECT to gizmo)
    TransferContext.callMethod(rawPtr, MethodBindings.addGizmoPtr, NIL)
  }

  public fun getGizmos(): VariantArray<Node3DGizmo> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGizmosPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3DGizmo>)
  }

  public fun clearGizmos() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearGizmosPtr, NIL)
  }

  public fun setSubgizmoSelection(
    gizmo: Node3DGizmo,
    id: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(OBJECT to gizmo, LONG to id.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setSubgizmoSelectionPtr, NIL)
  }

  public fun clearSubgizmoSelection() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSubgizmoSelectionPtr, NIL)
  }

  public fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  public fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  public fun setNotifyLocalTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  public fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setNotifyTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  public fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun rotate(axis: Vector3, angle: Float) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotatePtr, NIL)
  }

  public fun globalRotate(axis: Vector3, angle: Float) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.globalRotatePtr, NIL)
  }

  public fun globalScale(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.globalScalePtr, NIL)
  }

  public fun globalTranslate(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.globalTranslatePtr, NIL)
  }

  public fun rotateObjectLocal(axis: Vector3, angle: Float) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateObjectLocalPtr, NIL)
  }

  public fun scaleObjectLocal(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.scaleObjectLocalPtr, NIL)
  }

  public fun translateObjectLocal(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translateObjectLocalPtr, NIL)
  }

  public fun rotateX(angle: Float) {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateXPtr, NIL)
  }

  public fun rotateY(angle: Float) {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateYPtr, NIL)
  }

  public fun rotateZ(angle: Float) {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateZPtr, NIL)
  }

  public fun translate(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, NIL)
  }

  public fun orthonormalize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.orthonormalizePtr, NIL)
  }

  public fun setIdentity() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setIdentityPtr, NIL)
  }

  @JvmOverloads
  public fun lookAt(
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ) {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtPtr, NIL)
  }

  @JvmOverloads
  public fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ) {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtFromPositionPtr, NIL)
  }

  public fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toGlobalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public enum class RotationEditMode(
    id: Long,
  ) {
    ROTATION_EDIT_MODE_EULER(0),
    ROTATION_EDIT_MODE_QUATERNION(1),
    ROTATION_EDIT_MODE_BASIS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RotationEditMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43

    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 44
  }

  internal object MethodBindings {
    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_transform")

    public val getTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_transform")

    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_position")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_position")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_rotation")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_rotation")

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_degrees")

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_degrees")

    public val setRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_order")

    public val getRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_order")

    public val setRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_edit_mode")

    public val getRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_edit_mode")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_scale")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_scale")

    public val setQuaternionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_quaternion")

    public val getQuaternionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_quaternion")

    public val setBasisPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_basis")

    public val getBasisPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_basis")

    public val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_transform")

    public val getGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_transform")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_position")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_position")

    public val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation")

    public val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation")

    public val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation_degrees")

    public val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation_degrees")

    public val getParentNode3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_parent_node_3d")

    public val setIgnoreTransformNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_ignore_transform_notification")

    public val setAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_as_top_level")

    public val isSetAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_set_as_top_level")

    public val setDisableScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_disable_scale")

    public val isScaleDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_scale_disabled")

    public val getWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_world_3d")

    public val forceUpdateTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "force_update_transform")

    public val setVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_visibility_parent")

    public val getVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_visibility_parent")

    public val updateGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "update_gizmos")

    public val addGizmoPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "add_gizmo")

    public val getGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_gizmos")

    public val clearGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "clear_gizmos")

    public val setSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_subgizmo_selection")

    public val clearSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "clear_subgizmo_selection")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "is_visible")

    public val isVisibleInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_visible_in_tree")

    public val showPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "show")

    public val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "hide")

    public val setNotifyLocalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_local_transform")

    public val isLocalTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_local_transform_notification_enabled")

    public val setNotifyTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_transform")

    public val isTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_transform_notification_enabled")

    public val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate")

    public val globalRotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "global_rotate")

    public val globalScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "global_scale")

    public val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "global_translate")

    public val rotateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "rotate_object_local")

    public val scaleObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "scale_object_local")

    public val translateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "translate_object_local")

    public val rotateXPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_x")

    public val rotateYPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_y")

    public val rotateZPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_z")

    public val translatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "translate")

    public val orthonormalizePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "orthonormalize")

    public val setIdentityPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_identity")

    public val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "look_at")

    public val lookAtFromPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "look_at_from_position")

    public val toLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "to_local")

    public val toGlobalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "to_global")
  }
}
