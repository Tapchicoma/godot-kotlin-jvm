// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioStreamGenerator : AudioStream() {
  public var mixRate: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixRatePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMixRatePtr, NIL)
    }

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
    callConstructor(ENGINECLASS_AUDIOSTREAMGENERATOR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "set_mix_rate")

    public val getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "get_mix_rate")

    public val setBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "set_buffer_length")

    public val getBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "get_buffer_length")
  }
}
