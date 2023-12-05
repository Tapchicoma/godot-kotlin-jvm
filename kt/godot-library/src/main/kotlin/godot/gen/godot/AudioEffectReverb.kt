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
public open class AudioEffectReverb : AudioEffect() {
  public var predelayMsec: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPredelayMsecPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPredelayMsecPtr, NIL)
    }

  public var predelayFeedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPredelayFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPredelayFeedbackPtr, NIL)
    }

  public var roomSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRoomSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRoomSizePtr, NIL)
    }

  public var damping: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
    }

  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
    }

  public var hipass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHpfPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHpfPtr, NIL)
    }

  public var dry: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
    }

  public var wet: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTREVERB, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_msec")

    public val getPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_msec")

    public val setPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_feedback")

    public val getPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_feedback")

    public val setRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_room_size")

    public val getRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_room_size")

    public val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_damping")

    public val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_damping")

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_spread")

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_spread")

    public val setDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "set_dry")

    public val getDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "get_dry")

    public val setWetPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "set_wet")

    public val getWetPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "get_wet")

    public val setHpfPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "set_hpf")

    public val getHpfPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectReverb", "get_hpf")
  }
}
