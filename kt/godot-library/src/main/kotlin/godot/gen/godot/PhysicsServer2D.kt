// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
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

@GodotBaseType
public object PhysicsServer2D : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER2D)
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

  public fun segmentShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.segmentShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun circleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.circleShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun rectangleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.rectangleShapeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun capsuleShapeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.capsuleShapeCreatePtr, _RID)
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

  public fun shapeSetData(shape: RID, `data`: Any?) {
    TransferContext.writeArguments(_RID to shape, ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeSetDataPtr, NIL)
  }

  public fun shapeGetType(shape: RID): ShapeType {
    TransferContext.writeArguments(_RID to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeGetTypePtr, LONG)
    return PhysicsServer2D.ShapeType.from(TransferContext.readReturnValue(LONG) as Long)
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

  public fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments(_RID to space)
    TransferContext.callMethod(rawPtr, MethodBindings.spaceGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?)
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
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to area, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
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
    transform: Transform2D,
  ) {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong(), TRANSFORM2D to transform)
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

  public fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform2D {
    TransferContext.writeArguments(_RID to area, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetShapeTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
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

  public fun areaSetTransform(area: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to area, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.areaSetTransformPtr, NIL)
  }

  public fun areaGetParam(area: RID, `param`: AreaParameter): Any? {
    TransferContext.writeArguments(_RID to area, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun areaGetTransform(area: RID): Transform2D {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
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

  public fun areaAttachCanvasInstanceId(area: RID, id: Long) {
    TransferContext.writeArguments(_RID to area, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.areaAttachCanvasInstanceIdPtr, NIL)
  }

  public fun areaGetCanvasInstanceId(area: RID): Long {
    TransferContext.writeArguments(_RID to area)
    TransferContext.callMethod(rawPtr, MethodBindings.areaGetCanvasInstanceIdPtr, LONG)
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
    return PhysicsServer2D.BodyMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to body, _RID to shape, TRANSFORM2D to transform, BOOL to disabled)
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
    transform: Transform2D,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeTransformPtr, NIL)
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

  public fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform2D {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetShapeTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun bodyRemoveShape(body: RID, shapeIdx: Int) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyRemoveShapePtr, NIL)
  }

  public fun bodyClearShapes(body: RID) {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyClearShapesPtr, NIL)
  }

  public fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeDisabledPtr, NIL)
  }

  public fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Int,
    enable: Boolean,
    margin: Float,
  ) {
    TransferContext.writeArguments(_RID to body, LONG to shapeIdx.toLong(), BOOL to enable, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetShapeAsOneWayCollisionPtr, NIL)
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

  public fun bodyAttachCanvasInstanceId(body: RID, id: Long) {
    TransferContext.writeArguments(_RID to body, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAttachCanvasInstanceIdPtr, NIL)
  }

  public fun bodyGetCanvasInstanceId(body: RID): Long {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetCanvasInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun bodySetContinuousCollisionDetectionMode(body: RID, mode: CCDMode) {
    TransferContext.writeArguments(_RID to body, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetContinuousCollisionDetectionModePtr,
        NIL)
  }

  public fun bodyGetContinuousCollisionDetectionMode(body: RID): CCDMode {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetContinuousCollisionDetectionModePtr,
        LONG)
    return PhysicsServer2D.CCDMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralImpulsePtr, NIL)
  }

  public fun bodyApplyTorqueImpulse(body: RID, impulse: Float) {
    TransferContext.writeArguments(_RID to body, DOUBLE to impulse.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorqueImpulsePtr, NIL)
  }

  @JvmOverloads
  public fun bodyApplyImpulse(
    body: RID,
    impulse: Vector2,
    position: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyImpulsePtr, NIL)
  }

  public fun bodyApplyCentralForce(body: RID, force: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun bodyApplyForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyForcePtr, NIL)
  }

  public fun bodyApplyTorque(body: RID, torque: Float) {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyApplyTorquePtr, NIL)
  }

  public fun bodyAddConstantCentralForce(body: RID, force: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantCentralForcePtr, NIL)
  }

  @JvmOverloads
  public fun bodyAddConstantForce(
    body: RID,
    force: Vector2,
    position: Vector2 = Vector2(0, 0),
  ) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantForcePtr, NIL)
  }

  public fun bodyAddConstantTorque(body: RID, torque: Float) {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodyAddConstantTorquePtr, NIL)
  }

  public fun bodySetConstantForce(body: RID, force: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to force)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantForcePtr, NIL)
  }

  public fun bodyGetConstantForce(body: RID): Vector2 {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantForcePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun bodySetConstantTorque(body: RID, torque: Float) {
    TransferContext.writeArguments(_RID to body, DOUBLE to torque.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetConstantTorquePtr, NIL)
  }

  public fun bodyGetConstantTorque(body: RID): Float {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetConstantTorquePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    TransferContext.writeArguments(_RID to body, VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.bodySetAxisVelocityPtr, NIL)
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

  @JvmOverloads
  public fun bodyTestMotion(
    body: RID,
    parameters: PhysicsTestMotionParameters2D,
    result: PhysicsTestMotionResult2D? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to body, OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyTestMotionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun bodyGetDirectState(body: RID): PhysicsDirectBodyState2D? {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.bodyGetDirectStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectBodyState2D?)
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

  public fun jointSetParam(
    joint: RID,
    `param`: JointParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.jointSetParamPtr, NIL)
  }

  public fun jointGetParam(joint: RID, `param`: JointParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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

  @JvmOverloads
  public fun jointMakePin(
    joint: RID,
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchor, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakePinPtr, NIL)
  }

  @JvmOverloads
  public fun jointMakeGroove(
    joint: RID,
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID = RID(),
    bodyB: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to groove1A, VECTOR2 to groove2A, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeGroovePtr, NIL)
  }

  @JvmOverloads
  public fun jointMakeDampedSpring(
    joint: RID,
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to joint, VECTOR2 to anchorA, VECTOR2 to anchorB, _RID to bodyA, _RID to bodyB)
    TransferContext.callMethod(rawPtr, MethodBindings.jointMakeDampedSpringPtr, NIL)
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

  public fun dampedSpringJointSetParam(
    joint: RID,
    `param`: DampedSpringParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to joint, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.dampedSpringJointSetParamPtr, NIL)
  }

  public fun dampedSpringJointGetParam(joint: RID, `param`: DampedSpringParam): Float {
    TransferContext.writeArguments(_RID to joint, LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.dampedSpringJointGetParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun jointGetType(joint: RID): JointType {
    TransferContext.writeArguments(_RID to joint)
    TransferContext.callMethod(rawPtr, MethodBindings.jointGetTypePtr, LONG)
    return PhysicsServer2D.JointType.from(TransferContext.readReturnValue(LONG) as Long)
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
    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),
    SPACE_PARAM_SOLVER_ITERATIONS(8),
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

  public enum class ShapeType(
    id: Long,
  ) {
    SHAPE_WORLD_BOUNDARY(0),
    SHAPE_SEPARATION_RAY(1),
    SHAPE_SEGMENT(2),
    SHAPE_CIRCLE(3),
    SHAPE_RECTANGLE(4),
    SHAPE_CAPSULE(5),
    SHAPE_CONVEX_POLYGON(6),
    SHAPE_CONCAVE_POLYGON(7),
    SHAPE_CUSTOM(8),
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

  public enum class JointType(
    id: Long,
  ) {
    JOINT_TYPE_PIN(0),
    JOINT_TYPE_GROOVE(1),
    JOINT_TYPE_DAMPED_SPRING(2),
    JOINT_TYPE_MAX(3),
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

  public enum class JointParam(
    id: Long,
  ) {
    JOINT_PARAM_BIAS(0),
    JOINT_PARAM_MAX_BIAS(1),
    JOINT_PARAM_MAX_FORCE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): JointParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PinJointParam(
    id: Long,
  ) {
    PIN_JOINT_SOFTNESS(0),
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

  public enum class DampedSpringParam(
    id: Long,
  ) {
    DAMPED_SPRING_REST_LENGTH(0),
    DAMPED_SPRING_STIFFNESS(1),
    DAMPED_SPRING_DAMPING(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DampedSpringParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CCDMode(
    id: Long,
  ) {
    CCD_MODE_DISABLED(0),
    CCD_MODE_CAST_RAY(1),
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CCDMode = entries.single {
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

  internal object MethodBindings {
    public val worldBoundaryShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "world_boundary_shape_create")

    public val separationRayShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "separation_ray_shape_create")

    public val segmentShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "segment_shape_create")

    public val circleShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "circle_shape_create")

    public val rectangleShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "rectangle_shape_create")

    public val capsuleShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "capsule_shape_create")

    public val convexPolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "convex_polygon_shape_create")

    public val concavePolygonShapeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "concave_polygon_shape_create")

    public val shapeSetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "shape_set_data")

    public val shapeGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "shape_get_type")

    public val shapeGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "shape_get_data")

    public val spaceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_create")

    public val spaceSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_set_active")

    public val spaceIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_is_active")

    public val spaceSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_set_param")

    public val spaceGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_get_param")

    public val spaceGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "space_get_direct_state")

    public val areaCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_create")

    public val areaSetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_space")

    public val areaGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_space")

    public val areaAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_add_shape")

    public val areaSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_shape")

    public val areaSetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_shape_transform")

    public val areaSetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_shape_disabled")

    public val areaGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_shape_count")

    public val areaGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_shape")

    public val areaGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_shape_transform")

    public val areaRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_remove_shape")

    public val areaClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_clear_shapes")

    public val areaSetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_collision_layer")

    public val areaGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_collision_layer")

    public val areaSetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_collision_mask")

    public val areaGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_collision_mask")

    public val areaSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_param")

    public val areaSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_transform")

    public val areaGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_param")

    public val areaGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_transform")

    public val areaAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_attach_object_instance_id")

    public val areaGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_object_instance_id")

    public val areaAttachCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_attach_canvas_instance_id")

    public val areaGetCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_get_canvas_instance_id")

    public val areaSetMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_monitor_callback")

    public val areaSetAreaMonitorCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_area_monitor_callback")

    public val areaSetMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "area_set_monitorable")

    public val bodyCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_create")

    public val bodySetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_space")

    public val bodyGetSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_space")

    public val bodySetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_mode")

    public val bodyGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_mode")

    public val bodyAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_add_shape")

    public val bodySetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_shape")

    public val bodySetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_shape_transform")

    public val bodyGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_shape_count")

    public val bodyGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_shape")

    public val bodyGetShapeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_shape_transform")

    public val bodyRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_remove_shape")

    public val bodyClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_clear_shapes")

    public val bodySetShapeDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_shape_disabled")

    public val bodySetShapeAsOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_shape_as_one_way_collision")

    public val bodyAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_attach_object_instance_id")

    public val bodyGetObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_object_instance_id")

    public val bodyAttachCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_attach_canvas_instance_id")

    public val bodyGetCanvasInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_canvas_instance_id")

    public val bodySetContinuousCollisionDetectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_continuous_collision_detection_mode")

    public val bodyGetContinuousCollisionDetectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_continuous_collision_detection_mode")

    public val bodySetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_collision_layer")

    public val bodyGetCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_collision_layer")

    public val bodySetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_collision_mask")

    public val bodyGetCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_collision_mask")

    public val bodySetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_collision_priority")

    public val bodyGetCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_collision_priority")

    public val bodySetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_param")

    public val bodyGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_param")

    public val bodyResetMassPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_reset_mass_properties")

    public val bodySetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_state")

    public val bodyGetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_state")

    public val bodyApplyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_central_impulse")

    public val bodyApplyTorqueImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_torque_impulse")

    public val bodyApplyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_impulse")

    public val bodyApplyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_central_force")

    public val bodyApplyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_force")

    public val bodyApplyTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_apply_torque")

    public val bodyAddConstantCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_add_constant_central_force")

    public val bodyAddConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_add_constant_force")

    public val bodyAddConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_add_constant_torque")

    public val bodySetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_constant_force")

    public val bodyGetConstantForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_constant_force")

    public val bodySetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_constant_torque")

    public val bodyGetConstantTorquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_constant_torque")

    public val bodySetAxisVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_axis_velocity")

    public val bodyAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_add_collision_exception")

    public val bodyRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_remove_collision_exception")

    public val bodySetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_max_contacts_reported")

    public val bodyGetMaxContactsReportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_max_contacts_reported")

    public val bodySetOmitForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_omit_force_integration")

    public val bodyIsOmittingForceIntegrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_is_omitting_force_integration")

    public val bodySetForceIntegrationCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_set_force_integration_callback")

    public val bodyTestMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_test_motion")

    public val bodyGetDirectStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "body_get_direct_state")

    public val jointCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_create")

    public val jointClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_clear")

    public val jointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_set_param")

    public val jointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_get_param")

    public val jointDisableCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_disable_collisions_between_bodies")

    public val jointIsDisabledCollisionsBetweenBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_is_disabled_collisions_between_bodies")

    public val jointMakePinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_make_pin")

    public val jointMakeGroovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_make_groove")

    public val jointMakeDampedSpringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_make_damped_spring")

    public val pinJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "pin_joint_set_param")

    public val pinJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "pin_joint_get_param")

    public val dampedSpringJointSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "damped_spring_joint_set_param")

    public val dampedSpringJointGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "damped_spring_joint_get_param")

    public val jointGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "joint_get_type")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer2D", "free_rid")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsServer2D", "set_active")

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2D", "get_process_info")
  }
}
