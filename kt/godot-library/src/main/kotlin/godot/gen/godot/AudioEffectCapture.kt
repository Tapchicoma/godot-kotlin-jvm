// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AudioEffectCapture : AudioEffect() {
  public var bufferLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferLengthPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTCAPTURE, scriptIndex)
    return true
  }

  public fun canGetBuffer(frames: Int): Boolean {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canGetBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBuffer(frames: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public fun clearBuffer() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBufferPtr, NIL)
  }

  public fun getFramesAvailable(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesAvailablePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getDiscardedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDiscardedFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getBufferLengthFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferLengthFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPushedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPushedFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val canGetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "can_get_buffer")

    public val getBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer")

    public val clearBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "clear_buffer")

    public val setBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "set_buffer_length")

    public val getBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer_length")

    public val getFramesAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_frames_available")

    public val getDiscardedFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_discarded_frames")

    public val getBufferLengthFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer_length_frames")

    public val getPushedFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_pushed_frames")
  }
}
