// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AnimationNodeOneShot : AnimationNodeSync() {
  public var mixMode: MixMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixModePtr, LONG)
      return AnimationNodeOneShot.MixMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMixModePtr, NIL)
    }

  public var fadeinTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeinTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeinTimePtr, NIL)
    }

  public var fadeinCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeinCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeinCurvePtr, NIL)
    }

  public var fadeoutTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutTimePtr, NIL)
    }

  public var fadeoutCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutCurvePtr, NIL)
    }

  public var autorestart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutorestartPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartPtr, NIL)
    }

  public var autorestartDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartDelayPtr, NIL)
    }

  public var autorestartRandomDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartRandomDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartRandomDelayPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEONESHOT, scriptIndex)
    return true
  }

  public enum class OneShotRequest(
    id: Long,
  ) {
    ONE_SHOT_REQUEST_NONE(0),
    ONE_SHOT_REQUEST_FIRE(1),
    ONE_SHOT_REQUEST_ABORT(2),
    ONE_SHOT_REQUEST_FADE_OUT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OneShotRequest = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MixMode(
    id: Long,
  ) {
    MIX_MODE_BLEND(0),
    MIX_MODE_ADD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MixMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_time")

    public val getFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_time")

    public val setFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_curve")

    public val getFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_curve")

    public val setFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_time")

    public val getFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_time")

    public val setFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_curve")

    public val getFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_curve")

    public val setAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart")

    public val hasAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "has_autorestart")

    public val setAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_delay")

    public val getAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_delay")

    public val setAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_random_delay")

    public val getAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_random_delay")

    public val setMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_mix_mode")

    public val getMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_mix_mode")
  }
}
