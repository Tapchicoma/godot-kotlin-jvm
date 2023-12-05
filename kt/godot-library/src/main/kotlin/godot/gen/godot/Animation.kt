// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
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

@GodotBaseType
public open class Animation : Resource() {
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  public var loopMode: LoopMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopModePtr, LONG)
      return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopModePtr, NIL)
    }

  public var step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun addTrack(type: TrackType, atPosition: Int = -1): Int {
    TransferContext.writeArguments(LONG to type.id, LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTrackPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeTrack(trackIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTrackPtr, NIL)
  }

  public fun getTrackCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun trackGetType(trackIdx: Int): TrackType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetTypePtr, LONG)
    return Animation.TrackType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun trackGetPath(trackIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun trackSetPath(trackIdx: Int, path: NodePath) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetPathPtr, NIL)
  }

  public fun findTrack(path: NodePath, type: TrackType): Int {
    TransferContext.writeArguments(NODE_PATH to path, LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.findTrackPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun trackMoveUp(trackIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveUpPtr, NIL)
  }

  public fun trackMoveDown(trackIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveDownPtr, NIL)
  }

  public fun trackMoveTo(trackIdx: Int, toIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveToPtr, NIL)
  }

  public fun trackSwap(trackIdx: Int, withIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to withIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackSwapPtr, NIL)
  }

  public fun trackSetImported(trackIdx: Int, imported: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to imported)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetImportedPtr, NIL)
  }

  public fun trackIsImported(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsImportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun trackSetEnabled(trackIdx: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetEnabledPtr, NIL)
  }

  public fun trackIsEnabled(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun positionTrackInsertKey(
    trackIdx: Int,
    time: Double,
    position: Vector3,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.positionTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun rotationTrackInsertKey(
    trackIdx: Int,
    time: Double,
    rotation: Quaternion,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, MethodBindings.rotationTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun scaleTrackInsertKey(
    trackIdx: Int,
    time: Double,
    scale: Vector3,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.scaleTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun blendShapeTrackInsertKey(
    trackIdx: Int,
    time: Double,
    amount: Float,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.blendShapeTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun positionTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.positionTrackInterpolatePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun rotationTrackInterpolate(trackIdx: Int, timeSec: Double): Quaternion {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.rotationTrackInterpolatePtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun scaleTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.scaleTrackInterpolatePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun blendShapeTrackInterpolate(trackIdx: Int, timeSec: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.blendShapeTrackInterpolatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun trackInsertKey(
    trackIdx: Int,
    time: Double,
    key: Any?,
    transition: Float = 1.0f,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, ANY to key, DOUBLE to transition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.trackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun trackRemoveKey(trackIdx: Int, keyIdx: Int) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackRemoveKeyPtr, NIL)
  }

  public fun trackRemoveKeyAtTime(trackIdx: Int, time: Double) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.trackRemoveKeyAtTimePtr, NIL)
  }

  public fun trackSetKeyValue(
    trackIdx: Int,
    key: Int,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to key.toLong(), ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyValuePtr, NIL)
  }

  public fun trackSetKeyTransition(
    trackIdx: Int,
    keyIdx: Int,
    transition: Float,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to transition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyTransitionPtr, NIL)
  }

  public fun trackSetKeyTime(
    trackIdx: Int,
    keyIdx: Int,
    time: Double,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyTimePtr, NIL)
  }

  public fun trackGetKeyTransition(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyTransitionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun trackGetKeyCount(trackIdx: Int): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun trackGetKeyValue(trackIdx: Int, keyIdx: Int): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun trackGetKeyTime(trackIdx: Int, keyIdx: Int): Double {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun trackFindKey(
    trackIdx: Int,
    time: Double,
    findMode: FindMode = Animation.FindMode.FIND_MODE_NEAREST,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, LONG to findMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.trackFindKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun trackSetInterpolationType(trackIdx: Int, interpolation: InterpolationType) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetInterpolationTypePtr, NIL)
  }

  public fun trackGetInterpolationType(trackIdx: Int): InterpolationType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetInterpolationTypePtr, LONG)
    return Animation.InterpolationType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun trackSetInterpolationLoopWrap(trackIdx: Int, interpolation: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to interpolation)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetInterpolationLoopWrapPtr, NIL)
  }

  public fun trackGetInterpolationLoopWrap(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetInterpolationLoopWrapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun trackIsCompressed(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsCompressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun valueTrackSetUpdateMode(trackIdx: Int, mode: UpdateMode) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackSetUpdateModePtr, NIL)
  }

  public fun valueTrackGetUpdateMode(trackIdx: Int): UpdateMode {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackGetUpdateModePtr, LONG)
    return Animation.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun valueTrackInterpolate(trackIdx: Int, timeSec: Double): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackInterpolatePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun methodTrackGetName(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.methodTrackGetNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun methodTrackGetParams(trackIdx: Int, keyIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.methodTrackGetParamsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  @JvmOverloads
  public fun bezierTrackInsertKey(
    trackIdx: Int,
    time: Double,
    `value`: Float,
    inHandle: Vector2 = Vector2(0, 0),
    outHandle: Vector2 = Vector2(0, 0),
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, DOUBLE to value.toDouble(), VECTOR2 to inHandle, VECTOR2 to outHandle)
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun bezierTrackSetKeyValue(
    trackIdx: Int,
    keyIdx: Int,
    `value`: Float,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyValuePtr, NIL)
  }

  @JvmOverloads
  public fun bezierTrackSetKeyInHandle(
    trackIdx: Int,
    keyIdx: Int,
    inHandle: Vector2,
    balancedValueTimeRatio: Float = 1.0f,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), VECTOR2 to inHandle, DOUBLE to balancedValueTimeRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyInHandlePtr, NIL)
  }

  @JvmOverloads
  public fun bezierTrackSetKeyOutHandle(
    trackIdx: Int,
    keyIdx: Int,
    outHandle: Vector2,
    balancedValueTimeRatio: Float = 1.0f,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), VECTOR2 to outHandle, DOUBLE to balancedValueTimeRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyOutHandlePtr, NIL)
  }

  public fun bezierTrackGetKeyValue(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun bezierTrackGetKeyInHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyInHandlePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun bezierTrackGetKeyOutHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyOutHandlePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun bezierTrackInterpolate(trackIdx: Int, time: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackInterpolatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  @JvmOverloads
  public fun audioTrackInsertKey(
    trackIdx: Int,
    time: Double,
    stream: Resource,
    startOffset: Float = 0.0f,
    endOffset: Float = 0.0f,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, OBJECT to stream, DOUBLE to startOffset.toDouble(), DOUBLE to endOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun audioTrackSetKeyStream(
    trackIdx: Int,
    keyIdx: Int,
    stream: Resource,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyStreamPtr, NIL)
  }

  public fun audioTrackSetKeyStartOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyStartOffsetPtr, NIL)
  }

  public fun audioTrackSetKeyEndOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyEndOffsetPtr, NIL)
  }

  public fun audioTrackGetKeyStream(trackIdx: Int, keyIdx: Int): Resource? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public fun audioTrackGetKeyStartOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyStartOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun audioTrackGetKeyEndOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyEndOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun audioTrackSetUseBlend(trackIdx: Int, enable: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetUseBlendPtr, NIL)
  }

  public fun audioTrackIsUseBlend(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackIsUseBlendPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun animationTrackInsertKey(
    trackIdx: Int,
    time: Double,
    animation: StringName,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, STRING_NAME to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun animationTrackSetKeyAnimation(
    trackIdx: Int,
    keyIdx: Int,
    animation: StringName,
  ) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), STRING_NAME to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackSetKeyAnimationPtr, NIL)
  }

  public fun animationTrackGetKeyAnimation(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackGetKeyAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun copyTrack(trackIdx: Int, toAnimation: Animation) {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), OBJECT to toAnimation)
    TransferContext.callMethod(rawPtr, MethodBindings.copyTrackPtr, NIL)
  }

  @JvmOverloads
  public fun compress(
    pageSize: Long = 8192,
    fps: Long = 120,
    splitTolerance: Float = 4.0f,
  ) {
    TransferContext.writeArguments(LONG to pageSize, LONG to fps, DOUBLE to splitTolerance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.compressPtr, NIL)
  }

  public enum class TrackType(
    id: Long,
  ) {
    TYPE_VALUE(0),
    TYPE_POSITION_3D(1),
    TYPE_ROTATION_3D(2),
    TYPE_SCALE_3D(3),
    TYPE_BLEND_SHAPE(4),
    TYPE_METHOD(5),
    TYPE_BEZIER(6),
    TYPE_AUDIO(7),
    TYPE_ANIMATION(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class InterpolationType(
    id: Long,
  ) {
    INTERPOLATION_NEAREST(0),
    INTERPOLATION_LINEAR(1),
    INTERPOLATION_CUBIC(2),
    INTERPOLATION_LINEAR_ANGLE(3),
    INTERPOLATION_CUBIC_ANGLE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InterpolationType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    UPDATE_CONTINUOUS(0),
    UPDATE_DISCRETE(1),
    UPDATE_CAPTURE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UpdateMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LoopMode(
    id: Long,
  ) {
    LOOP_NONE(0),
    LOOP_LINEAR(1),
    LOOP_PINGPONG(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LoopMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LoopedFlag(
    id: Long,
  ) {
    LOOPED_FLAG_NONE(0),
    LOOPED_FLAG_END(1),
    LOOPED_FLAG_START(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LoopedFlag = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class FindMode(
    id: Long,
  ) {
    FIND_MODE_NEAREST(0),
    FIND_MODE_APPROX(1),
    FIND_MODE_EXACT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FindMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "add_track")

    public val removeTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "remove_track")

    public val getTrackCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "get_track_count")

    public val trackGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_type")

    public val trackGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_path")

    public val trackSetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_path")

    public val findTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "find_track")

    public val trackMoveUpPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_move_up")

    public val trackMoveDownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_move_down")

    public val trackMoveToPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_move_to")

    public val trackSwapPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_swap")

    public val trackSetImportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_imported")

    public val trackIsImportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_imported")

    public val trackSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_enabled")

    public val trackIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_enabled")

    public val positionTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "position_track_insert_key")

    public val rotationTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "rotation_track_insert_key")

    public val scaleTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "scale_track_insert_key")

    public val blendShapeTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "blend_shape_track_insert_key")

    public val positionTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "position_track_interpolate")

    public val rotationTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "rotation_track_interpolate")

    public val scaleTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "scale_track_interpolate")

    public val blendShapeTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "blend_shape_track_interpolate")

    public val trackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_insert_key")

    public val trackRemoveKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_remove_key")

    public val trackRemoveKeyAtTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_remove_key_at_time")

    public val trackSetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_value")

    public val trackSetKeyTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_transition")

    public val trackSetKeyTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_time")

    public val trackGetKeyTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_transition")

    public val trackGetKeyCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_count")

    public val trackGetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_value")

    public val trackGetKeyTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_time")

    public val trackFindKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_find_key")

    public val trackSetInterpolationTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_interpolation_type")

    public val trackGetInterpolationTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_interpolation_type")

    public val trackSetInterpolationLoopWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_interpolation_loop_wrap")

    public val trackGetInterpolationLoopWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_interpolation_loop_wrap")

    public val trackIsCompressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_compressed")

    public val valueTrackSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_set_update_mode")

    public val valueTrackGetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_get_update_mode")

    public val valueTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_interpolate")

    public val methodTrackGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "method_track_get_name")

    public val methodTrackGetParamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "method_track_get_params")

    public val bezierTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_insert_key")

    public val bezierTrackSetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_value")

    public val bezierTrackSetKeyInHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_in_handle")

    public val bezierTrackSetKeyOutHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_out_handle")

    public val bezierTrackGetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_value")

    public val bezierTrackGetKeyInHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_in_handle")

    public val bezierTrackGetKeyOutHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_out_handle")

    public val bezierTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_interpolate")

    public val audioTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_insert_key")

    public val audioTrackSetKeyStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_stream")

    public val audioTrackSetKeyStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_start_offset")

    public val audioTrackSetKeyEndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_end_offset")

    public val audioTrackGetKeyStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_stream")

    public val audioTrackGetKeyStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_start_offset")

    public val audioTrackGetKeyEndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_end_offset")

    public val audioTrackSetUseBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_use_blend")

    public val audioTrackIsUseBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_is_use_blend")

    public val animationTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_insert_key")

    public val animationTrackSetKeyAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_set_key_animation")

    public val animationTrackGetKeyAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_get_key_animation")

    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_length")

    public val setLoopModePtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_loop_mode")

    public val getLoopModePtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_loop_mode")

    public val setStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_step")

    public val getStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_step")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "clear")

    public val copyTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "copy_track")

    public val compressPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "compress")
  }
}
