// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimatedSprite3D : SpriteBase3D() {
  public val spriteFramesChanged: Signal0 by signal()

  public val animationChanged: Signal0 by signal()

  public val frameChanged: Signal0 by signal()

  public val animationLooped: Signal0 by signal()

  public val animationFinished: Signal0 by signal()

  public var spriteFrames: SpriteFrames?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpriteFramesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SpriteFrames?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpriteFramesPtr, NIL)
    }

  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
    }

  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoplayPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  public var frameProgress: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrameProgressPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrameProgressPtr, NIL)
    }

  public var speedScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATEDSPRITE3D, scriptIndex)
    return true
  }

  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun play(
    name: StringName = StringName(""),
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  @JvmOverloads
  public fun playBackwards(name: StringName = StringName("")) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  public fun pause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun setFrameAndProgress(frame: Int, progress: Float) {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to progress.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameAndProgressPtr, NIL)
  }

  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_sprite_frames")

    public val getSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_sprite_frames")

    public val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_animation")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_autoplay")

    public val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_autoplay")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "is_playing")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite3D", "play")

    public val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "play_backwards")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite3D", "pause")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite3D", "stop")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_frame")

    public val setFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame_progress")

    public val getFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_frame_progress")

    public val setFrameAndProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame_and_progress")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_speed_scale")

    public val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_playing_speed")
  }
}
