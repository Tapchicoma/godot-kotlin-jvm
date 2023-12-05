// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public object PhysicsServer3D : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER3D)
    return false
  }

  public fun worldBoundaryShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.worldBoundaryShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun separationRayShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.separationRayShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun sphereShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sphereShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun boxShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.boxShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.capsuleShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun cylinderShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cylinderShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun convexPolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.convexPolygonShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun concavePolygonShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.concavePolygonShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun heightmapShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.heightmapShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun customShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.customShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun shapeSetData(shape: RID, `data`: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeSetDataPtr, NIL)
  }

  public fun shapeGetType(shape: RID): ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeGetTypePtr, LONG)
    return PhysicsServer3D.ShapeType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun shapeGetData(shape: RID): Any? {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeGetDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun spaceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.spaceCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun spaceSetActive(space: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to space, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceSetActivePtr, NIL)
  }

  public fun spaceIsActive(space: RID): Boolean {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun spaceSetParam(
    space: RID,
    `param`: SpaceParameter,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to space, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.spaceSetParamPtr, NIL)
  }

  public fun spaceGetParam(space: RID, `param`: SpaceParameter): Float {
    TransferContext.writeArguments(_RID to space, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
  }

  public fun areaCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.areaCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun areaSetSpace(area: RID, space: RID) {
    TransferContext.writeArguments(_RID to area, _RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetSpacePtr, NIL)
  }

  public fun areaGetSpace(area: RID): RID {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.areaAddShapePtr, NIL)
  }

  public fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID,
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapePtr, NIL)
  }

  public fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapeTransformPtr, NIL)
  }

  public fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetShapeDisabledPtr, NIL)
  }

  public fun areaGetShapeCount(area: RID): Int {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun areaGetShape(area: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform3D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapeTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun areaRemoveShape(area: RID, shapeIdx: Int) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaRemoveShapePtr, NIL)
  }

  public fun areaClearShapes(area: RID) {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaClearShapesPtr, NIL)
  }

  public fun areaSetCollisionLayer(area: RID, layer: Long) {
    TransferContext.writeArguments(_RID to area, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetCollisionLayerPtr, NIL)
  }

  public fun areaGetCollisionLayer(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun areaSetCollisionMask(area: RID, mask: Long) {
    TransferContext.writeArguments(_RID to area, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetCollisionMaskPtr, NIL)
  }

  public fun areaGetCollisionMask(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun areaSetParam(
    area: RID,
    `param`: AreaParameter,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(_RID to area, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetParamPtr, NIL)
  }

  public fun areaSetTransform(area: RID, transform: Transform3D) {
    TransferContext.writeArguments(_RID to area, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetTransformPtr, NIL)
  }

  public fun areaGetParam(area: RID, `param`: AreaParameter): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun areaGetTransform(area: RID): Transform3D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun areaAttachObjectInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaAttachObjectInstanceIdPtr, NIL)
  }

  public fun areaGetObjectInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetObjectInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun areaSetMonitorCallback(area: RID, callback: Callable) {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetMonitorCallbackPtr, NIL)
  }

  public fun areaSetAreaMonitorCallback(area: RID, callback: Callable) {
    TransferContext.writeArguments(_RID to area, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetAreaMonitorCallbackPtr, NIL)
  }

  public fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to monitorable)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetMonitorablePtr, NIL)
  }

  public fun areaSetRayPickable(area: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to area, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetRayPickablePtr, NIL)
  }

  public fun bodyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.bodyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun bodySetSpace(body: RID, space: RID) {
    TransferContext.writeArguments(_RID to body, _RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetSpacePtr, NIL)
  }

  public fun bodyGetSpace(body: RID): RID {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun bodySetMode(body: RID, mode: BodyMode) {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetModePtr, NIL)
  }

  public fun bodyGetMode(body: RID): BodyMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetModePtr, LONG)
    return PhysicsServer3D.BodyMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun bodySetCollisionLayer(body: RID, layer: Long) {
    TransferContext.writeArguments(_RID to body, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionLayerPtr, NIL)
  }

  public fun bodyGetCollisionLayer(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun bodySetCollisionMask(body: RID, mask: Long) {
    TransferContext.writeArguments(_RID to body, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionMaskPtr, NIL)
  }

  public fun bodyGetCollisionMask(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun bodySetCollisionPriority(body: RID, priority: Float) {
    TransferContext.writeArguments(_RID to body, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetCollisionPriorityPtr, NIL)
  }

  public fun bodyGetCollisionPriority(body: RID): Float {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCollisionPriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform3D = Transform3D(),
    disabled: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM3D to transform, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddShapePtr, NIL)
  }

  public fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), _RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapePtr, NIL)
  }

  public fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeTransformPtr, NIL)
  }

  public fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeDisabledPtr, NIL)
  }

  public fun bodyGetShapeCount(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform3D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapeTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun bodyRemoveShape(body: RID, shapeIdx: Int) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyRemoveShapePtr, NIL)
  }

  public fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyClearShapesPtr, NIL)
  }

  public fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAttachObjectInstanceIdPtr, NIL)
  }

  public fun bodyGetObjectInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetObjectInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetEnableContinuousCollisionDetectionPtr,
        NIL)
  }

  public fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsContinuousCollisionDetectionEnabledPtr,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun bodySetParam(
    body: RID,
    `param`: BodyParameter,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to param.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetParamPtr, NIL)
  }

  public fun bodyGetParam(body: RID, `param`: BodyParameter): Any? {
    TransferContext.writeArguments(_RID to body, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun bodyResetMassProperties(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyResetMassPropertiesPtr, NIL)
  }

  public fun bodySetState(
    body: RID,
    state: BodyState,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to state.id, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetStatePtr, NIL)
  }

  public fun bodyGetState(body: RID, state: BodyState): Any? {
    TransferContext.writeArguments(_RID to body, LONG to state.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetStatePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun bodyApplyImpulse(
    body: RID,
    impulse: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyImpulsePtr, NIL)
  }

  public fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorqueImpulsePtr, NIL)
  }

  public fun bodyApplyCentralForce(body: RID, force: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun bodyApplyForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyForcePtr, NIL)
  }

  public fun bodyApplyTorque(body: RID, torque: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorquePtr, NIL)
  }

  public fun bodyAddConstantCentralForce(body: RID, force: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun bodyAddConstantForce(
    body: RID,
    force: Vector3,
    position: Vector3 = Vector3(0, 0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantForcePtr, NIL)
  }

  public fun bodyAddConstantTorque(body: RID, torque: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantTorquePtr, NIL)
  }

  public fun bodySetConstantForce(body: RID, force: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantForcePtr, NIL)
  }

  public fun bodyGetConstantForce(body: RID): Vector3 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantForcePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun bodySetConstantTorque(body: RID, torque: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantTorquePtr, NIL)
  }

  public fun bodyGetConstantTorque(body: RID): Vector3 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantTorquePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
    TransferContext.writeArguments(_RID to body, VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetAxisVelocityPtr, NIL)
  }

  public fun bodySetAxisLock(
    body: RID,
    axis: BodyAxis,
    lock: Boolean,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to axis.id, BOOL to lock)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetAxisLockPtr, NIL)
  }

  public fun bodyIsAxisLocked(body: RID, axis: BodyAxis): Boolean {
    TransferContext.writeArguments(_RID to body, LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsAxisLockedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddCollisionExceptionPtr, NIL)
  }

  public fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    TransferContext.writeArguments(_RID to body, _RID to exceptedBody)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyRemoveCollisionExceptionPtr, NIL)
  }

  public fun bodySetMaxContactsReported(body: RID, amount: Int) {
    TransferContext.writeArguments(_RID to body, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetMaxContactsReportedPtr, NIL)
  }

  public fun bodyGetMaxContactsReported(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetMaxContactsReportedPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetOmitForceIntegrationPtr, NIL)
  }

  public fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyIsOmittingForceIntegrationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun bodySetForceIntegrationCallback(
    body: RID,
    callable: Callable,
    userdata: Any? = null,
  ) {
    TransferContext.writeArguments(_RID to body, CALLABLE to callable, ANY to userdata)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetForceIntegrationCallbackPtr, NIL)
  }

  public fun bodySetRayPickable(body: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to body, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetRayPickablePtr, NIL)
  }

  @JvmOverloads
  public fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters3D,
    result: PhysicsTestMotionResult3D? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyTestMotionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun bodyGetDirectState(body: RID): PhysicsDirectBodyState3D? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState3D?)
  }

  public fun softBodyGetBounds(body: RID): CoreAABB {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.softBodyGetBoundsPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun jointCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.jointCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun jointClear(joint: RID) {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointClearPtr, NIL)
  }

  public fun jointMakePin(
    joint: RID,
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3,
  ) {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, VECTOR3 to localA, _RID to bodyB, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakePinPtr, NIL)
  }

  public fun pinJointSetParam(
    joint: RID,
    `param`: PinJointParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetParamPtr, NIL)
  }

  public fun pinJointGetParam(joint: RID, `param`: PinJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localA)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetLocalAPtr, NIL)
  }

  public fun pinJointGetLocalA(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetLocalAPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    TransferContext.writeArguments(_RID to joint, VECTOR3 to localB)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointSetLocalBPtr, NIL)
  }

  public fun pinJointGetLocalB(joint: RID): Vector3 {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.pinJointGetLocalBPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun jointMakeHinge(
    joint: RID,
    bodyA: RID,
    hingeA: Transform3D,
    bodyB: RID,
    hingeB: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to hingeA, _RID to bodyB, TRANSFORM3D to hingeB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeHingePtr, NIL)
  }

  public fun hingeJointSetParam(
    joint: RID,
    `param`: HingeJointParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointSetParamPtr, NIL)
  }

  public fun hingeJointGetParam(joint: RID, `param`: HingeJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun hingeJointSetFlag(
    joint: RID,
    flag: HingeJointFlag,
    enabled: Boolean,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointSetFlagPtr, NIL)
  }

  public fun hingeJointGetFlag(joint: RID, flag: HingeJointFlag): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hingeJointGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun jointMakeSlider(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeSliderPtr, NIL)
  }

  public fun sliderJointSetParam(
    joint: RID,
    `param`: SliderJointParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.sliderJointSetParamPtr, NIL)
  }

  public fun sliderJointGetParam(joint: RID, `param`: SliderJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.sliderJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun jointMakeConeTwist(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeConeTwistPtr, NIL)
  }

  public fun coneTwistJointSetParam(
    joint: RID,
    `param`: ConeTwistJointParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.coneTwistJointSetParamPtr, NIL)
  }

  public fun coneTwistJointGetParam(joint: RID, `param`: ConeTwistJointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.coneTwistJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun jointGetType(joint: RID): JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetTypePtr, LONG)
    return PhysicsServer3D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun jointSetSolverPriority(joint: RID, priority: Int) {
    TransferContext.writeArguments(_RID to joint, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.jointSetSolverPriorityPtr, NIL)
  }

  public fun jointGetSolverPriority(joint: RID): Int {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetSolverPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun jointDisableCollisionsBetweenBodies(joint: RID, disable: Boolean) {
    TransferContext.writeArguments(_RID to joint, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.jointDisableCollisionsBetweenBodiesPtr, NIL)
  }

  public fun jointIsDisabledCollisionsBetweenBodies(joint: RID): Boolean {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointIsDisabledCollisionsBetweenBodiesPtr,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun jointMakeGeneric6dof(
    joint: RID,
    bodyA: RID,
    localRefA: Transform3D,
    bodyB: RID,
    localRefB: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to joint, _RID to bodyA, TRANSFORM3D to localRefA, _RID to bodyB, TRANSFORM3D to localRefB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeGeneric6dofPtr, NIL)
  }

  public fun generic6dofJointSetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointSetParamPtr, NIL)
  }

  public fun generic6dofJointGetParam(
    joint: RID,
    axis: Vector3.Axis,
    `param`: G6DOFJointAxisParam,
  ): Float {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun generic6dofJointSetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
    enable: Boolean,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointSetFlagPtr, NIL)
  }

  public fun generic6dofJointGetFlag(
    joint: RID,
    axis: Vector3.Axis,
    flag: G6DOFJointAxisFlag,
  ): Boolean {
    TransferContext.writeArguments(_RID to joint, LONG to axis.id, LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.generic6dofJointGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  public fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  public fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class JointType(
    id: Long,
  ) {
    JOINT_TYPE_PIN(0),
    JOINT_TYPE_HINGE(1),
    JOINT_TYPE_SLIDER(2),
    JOINT_TYPE_CONE_TWIST(3),
    JOINT_TYPE_6DOF(4),
    JOINT_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): JointType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PinJointParam(
    id: Long,
  ) {
    PIN_JOINT_BIAS(0),
    PIN_JOINT_DAMPING(1),
    PIN_JOINT_IMPULSE_CLAMP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PinJointParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class HingeJointParam(
    id: Long,
  ) {
    HINGE_JOINT_BIAS(0),
    HINGE_JOINT_LIMIT_UPPER(1),
    HINGE_JOINT_LIMIT_LOWER(2),
    HINGE_JOINT_LIMIT_BIAS(3),
    HINGE_JOINT_LIMIT_SOFTNESS(4),
    HINGE_JOINT_LIMIT_RELAXATION(5),
    HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),
    HINGE_JOINT_MOTOR_MAX_IMPULSE(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HingeJointParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class HingeJointFlag(
    id: Long,
  ) {
    HINGE_JOINT_FLAG_USE_LIMIT(0),
    HINGE_JOINT_FLAG_ENABLE_MOTOR(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HingeJointFlag = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SliderJointParam(
    id: Long,
  ) {
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),
    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),
    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),
    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),
    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),
    SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),
    SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),
    SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),
    SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),
    SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),
    SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),
    SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),
    SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),
    SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),
    SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),
    SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),
    SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),
    SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),
    SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),
    SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),
    SLIDER_JOINT_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SliderJointParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ConeTwistJointParam(
    id: Long,
  ) {
    CONE_TWIST_JOINT_SWING_SPAN(0),
    CONE_TWIST_JOINT_TWIST_SPAN(1),
    CONE_TWIST_JOINT_BIAS(2),
    CONE_TWIST_JOINT_SOFTNESS(3),
    CONE_TWIST_JOINT_RELAXATION(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ConeTwistJointParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class G6DOFJointAxisParam(
    id: Long,
  ) {
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),
    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),
    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),
    G6DOF_JOINT_LINEAR_RESTITUTION(3),
    G6DOF_JOINT_LINEAR_DAMPING(4),
    G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),
    G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),
    G6DOF_JOINT_ANGULAR_LOWER_LIMIT(10),
    G6DOF_JOINT_ANGULAR_UPPER_LIMIT(11),
    G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(12),
    G6DOF_JOINT_ANGULAR_DAMPING(13),
    G6DOF_JOINT_ANGULAR_RESTITUTION(14),
    G6DOF_JOINT_ANGULAR_FORCE_LIMIT(15),
    G6DOF_JOINT_ANGULAR_ERP(16),
    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),
    G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(18),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): G6DOFJointAxisParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class G6DOFJointAxisFlag(
    id: Long,
  ) {
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),
    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),
    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): G6DOFJointAxisFlag = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShapeType(
    id: Long,
  ) {
    SHAPE_WORLD_BOUNDARY(0),
    SHAPE_SEPARATION_RAY(1),
    SHAPE_SPHERE(2),
    SHAPE_BOX(3),
    SHAPE_CAPSULE(4),
    SHAPE_CYLINDER(5),
    SHAPE_CONVEX_POLYGON(6),
    SHAPE_CONCAVE_POLYGON(7),
    SHAPE_HEIGHTMAP(8),
    SHAPE_SOFT_BODY(9),
    SHAPE_CUSTOM(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShapeType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AreaParameter(
    id: Long,
  ) {
    AREA_PARAM_GRAVITY_OVERRIDE_MODE(0),
    AREA_PARAM_GRAVITY(1),
    AREA_PARAM_GRAVITY_VECTOR(2),
    AREA_PARAM_GRAVITY_IS_POINT(3),
    AREA_PARAM_GRAVITY_POINT_UNIT_DISTANCE(4),
    AREA_PARAM_LINEAR_DAMP_OVERRIDE_MODE(5),
    AREA_PARAM_LINEAR_DAMP(6),
    AREA_PARAM_ANGULAR_DAMP_OVERRIDE_MODE(7),
    AREA_PARAM_ANGULAR_DAMP(8),
    AREA_PARAM_PRIORITY(9),
    AREA_PARAM_WIND_FORCE_MAGNITUDE(10),
    AREA_PARAM_WIND_SOURCE(11),
    AREA_PARAM_WIND_DIRECTION(12),
    AREA_PARAM_WIND_ATTENUATION_FACTOR(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AreaParameter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AreaSpaceOverrideMode(
    id: Long,
  ) {
    AREA_SPACE_OVERRIDE_DISABLED(0),
    AREA_SPACE_OVERRIDE_COMBINE(1),
    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
    AREA_SPACE_OVERRIDE_REPLACE(3),
    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AreaSpaceOverrideMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BodyMode(
    id: Long,
  ) {
    BODY_MODE_STATIC(0),
    BODY_MODE_KINEMATIC(1),
    BODY_MODE_RIGID(2),
    BODY_MODE_RIGID_LINEAR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BodyParameter(
    id: Long,
  ) {
    BODY_PARAM_BOUNCE(0),
    BODY_PARAM_FRICTION(1),
    BODY_PARAM_MASS(2),
    BODY_PARAM_INERTIA(3),
    BODY_PARAM_CENTER_OF_MASS(4),
    BODY_PARAM_GRAVITY_SCALE(5),
    BODY_PARAM_LINEAR_DAMP_MODE(6),
    BODY_PARAM_ANGULAR_DAMP_MODE(7),
    BODY_PARAM_LINEAR_DAMP(8),
    BODY_PARAM_ANGULAR_DAMP(9),
    BODY_PARAM_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyParameter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BodyDampMode(
    id: Long,
  ) {
    BODY_DAMP_MODE_COMBINE(0),
    BODY_DAMP_MODE_REPLACE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyDampMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BodyState(
    id: Long,
  ) {
    BODY_STATE_TRANSFORM(0),
    BODY_STATE_LINEAR_VELOCITY(1),
    BODY_STATE_ANGULAR_VELOCITY(2),
    BODY_STATE_SLEEPING(3),
    BODY_STATE_CAN_SLEEP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyState = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AreaBodyStatus(
    id: Long,
  ) {
    AREA_BODY_ADDED(0),
    AREA_BODY_REMOVED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AreaBodyStatus = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ProcessInfo(
    id: Long,
  ) {
    INFO_ACTIVE_OBJECTS(0),
    INFO_COLLISION_PAIRS(1),
    INFO_ISLAND_COUNT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessInfo = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SpaceParameter(
    id: Long,
  ) {
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
    SPACE_PARAM_CONTACT_MAX_ALLOWED_PENETRATION(2),
    SPACE_PARAM_CONTACT_DEFAULT_BIAS(3),
    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(4),
    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(5),
    SPACE_PARAM_BODY_TIME_TO_SLEEP(6),
    SPACE_PARAM_SOLVER_ITERATIONS(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpaceParameter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BodyAxis(
    id: Long,
  ) {
    BODY_AXIS_LINEAR_X(1),
    BODY_AXIS_LINEAR_Y(2),
    BODY_AXIS_LINEAR_Z(4),
    BODY_AXIS_ANGULAR_X(8),
    BODY_AXIS_ANGULAR_Y(16),
    BODY_AXIS_ANGULAR_Z(32),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BodyAxis = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val worldBoundaryShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "world_boundary_shape_create")

    public val separationRayShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "separation_ray_shape_create")

    public val sphereShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "sphere_shape_create")

    public val boxShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "box_shape_create")

    public val capsuleShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "capsule_shape_create")

    public val cylinderShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cylinder_shape_create")

    public val convexPolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "convex_polygon_shape_create")

    public val concavePolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "concave_polygon_shape_create")

    public val heightmapShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "heightmap_shape_create")

    public val customShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "custom_shape_create")

    public val shapeSetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_set_data")

    public val shapeGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_get_type")

    public val shapeGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "shape_get_data")

    public val spaceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_create")

    public val spaceSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_set_active")

    public val spaceIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_is_active")

    public val spaceSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_set_param")

    public val spaceGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_get_param")

    public val spaceGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "space_get_direct_state")

    public val areaCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_create")

    public val areaSetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_space")

    public val areaGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_space")

    public val areaAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_add_shape")

    public val areaSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape")

    public val areaSetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape_transform")

    public val areaSetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_shape_disabled")

    public val areaGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape_count")

    public val areaGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape")

    public val areaGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_shape_transform")

    public val areaRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_remove_shape")

    public val areaClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_clear_shapes")

    public val areaSetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_collision_layer")

    public val areaGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_collision_layer")

    public val areaSetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_collision_mask")

    public val areaGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_collision_mask")

    public val areaSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_param")

    public val areaSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_transform")

    public val areaGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_param")

    public val areaGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_transform")

    public val areaAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_attach_object_instance_id")

    public val areaGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_get_object_instance_id")

    public val areaSetMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_monitor_callback")

    public val areaSetAreaMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_area_monitor_callback")

    public val areaSetMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_monitorable")

    public val areaSetRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "area_set_ray_pickable")

    public val bodyCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_create")

    public val bodySetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_space")

    public val bodyGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_space")

    public val bodySetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_mode")

    public val bodyGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_mode")

    public val bodySetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_layer")

    public val bodyGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_layer")

    public val bodySetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_mask")

    public val bodyGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_mask")

    public val bodySetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_collision_priority")

    public val bodyGetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_collision_priority")

    public val bodyAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_shape")

    public val bodySetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape")

    public val bodySetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape_transform")

    public val bodySetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_shape_disabled")

    public val bodyGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape_count")

    public val bodyGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape")

    public val bodyGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_shape_transform")

    public val bodyRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_remove_shape")

    public val bodyClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_clear_shapes")

    public val bodyAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_attach_object_instance_id")

    public val bodyGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_object_instance_id")

    public val bodySetEnableContinuousCollisionDetectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_enable_continuous_collision_detection")

    public val bodyIsContinuousCollisionDetectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_continuous_collision_detection_enabled")

    public val bodySetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_param")

    public val bodyGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_param")

    public val bodyResetMassPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_reset_mass_properties")

    public val bodySetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_state")

    public val bodyGetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_state")

    public val bodyApplyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_central_impulse")

    public val bodyApplyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_impulse")

    public val bodyApplyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_torque_impulse")

    public val bodyApplyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_central_force")

    public val bodyApplyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_force")

    public val bodyApplyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_apply_torque")

    public val bodyAddConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_central_force")

    public val bodyAddConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_force")

    public val bodyAddConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_constant_torque")

    public val bodySetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_constant_force")

    public val bodyGetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_constant_force")

    public val bodySetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_constant_torque")

    public val bodyGetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_constant_torque")

    public val bodySetAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_axis_velocity")

    public val bodySetAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_axis_lock")

    public val bodyIsAxisLockedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_axis_locked")

    public val bodyAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_add_collision_exception")

    public val bodyRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_remove_collision_exception")

    public val bodySetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_max_contacts_reported")

    public val bodyGetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_max_contacts_reported")

    public val bodySetOmitForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_omit_force_integration")

    public val bodyIsOmittingForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_is_omitting_force_integration")

    public val bodySetForceIntegrationCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_force_integration_callback")

    public val bodySetRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_set_ray_pickable")

    public val bodyTestMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_test_motion")

    public val bodyGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "body_get_direct_state")

    public val softBodyGetBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "soft_body_get_bounds")

    public val jointCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_create")

    public val jointClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_clear")

    public val jointMakePinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_pin")

    public val pinJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_param")

    public val pinJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_param")

    public val pinJointSetLocalAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_a")

    public val pinJointGetLocalAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_a")

    public val pinJointSetLocalBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_set_local_b")

    public val pinJointGetLocalBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "pin_joint_get_local_b")

    public val jointMakeHingePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_hinge")

    public val hingeJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_param")

    public val hingeJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_param")

    public val hingeJointSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_set_flag")

    public val hingeJointGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "hinge_joint_get_flag")

    public val jointMakeSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_slider")

    public val sliderJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "slider_joint_set_param")

    public val sliderJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "slider_joint_get_param")

    public val jointMakeConeTwistPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_cone_twist")

    public val coneTwistJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_set_param")

    public val coneTwistJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "cone_twist_joint_get_param")

    public val jointGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_get_type")

    public val jointSetSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_set_solver_priority")

    public val jointGetSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_get_solver_priority")

    public val jointDisableCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_disable_collisions_between_bodies")

    public val jointIsDisabledCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_is_disabled_collisions_between_bodies")

    public val jointMakeGeneric6dofPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "joint_make_generic_6dof")

    public val generic6dofJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_param")

    public val generic6dofJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_param")

    public val generic6dofJointSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_set_flag")

    public val generic6dofJointGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "generic_6dof_joint_get_flag")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer3D", "free_rid")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer3D", "set_active")

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3D", "get_process_info")
  }
}
