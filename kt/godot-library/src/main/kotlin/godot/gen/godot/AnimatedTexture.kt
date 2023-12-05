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
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AnimatedTexture : Texture2D() {
  public var frames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramesPtr, NIL)
    }

  public var currentFrame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentFramePtr, NIL)
    }

  public var pause: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPausePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausePtr, NIL)
    }

  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
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
    callConstructor(ENGINECLASS_ANIMATEDTEXTURE, scriptIndex)
    return true
  }

  public fun setFrameTexture(frame: Int, texture: Texture2D) {
    TransferContext.writeArguments(LONG to frame.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameTexturePtr, NIL)
  }

  public fun getFrameTexture(frame: Int): Texture2D? {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setFrameDuration(frame: Int, duration: Float) {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameDurationPtr, NIL)
  }

  public fun getFrameDuration(frame: Int): Float {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object {
    public final const val MAX_FRAMES: Long = 256
  }

  internal object MethodBindings {
    public val setFramesPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "set_frames")

    public val getFramesPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "get_frames")

    public val setCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_current_frame")

    public val getCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_current_frame")

    public val setPausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "set_pause")

    public val getPausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "get_pause")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_one_shot")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_one_shot")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_speed_scale")

    public val setFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_texture")

    public val getFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_texture")

    public val setFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_duration")

    public val getFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_duration")
  }
}
