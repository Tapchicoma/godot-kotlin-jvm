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

@GodotBaseType
public open class VideoStreamPlayer : Control() {
  public val finished: Signal0 by signal()

  public var audioTrack: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioTrackPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioTrackPtr, NIL)
    }

  public var stream: VideoStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as VideoStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
    }

  public var volumeDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
    }

  public var volume: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumePtr, NIL)
    }

  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutoplayPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausedPtr, NIL)
    }

  public var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasExpandPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandPtr, NIL)
    }

  public var bufferingMsec: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferingMsecPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferingMsecPtr, NIL)
    }

  public var streamPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPositionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPositionPtr, NIL)
    }

  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBusPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBusPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIDEOSTREAMPLAYER, scriptIndex)
    return true
  }

  public fun play() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  public fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getStreamName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getVideoTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayer", "play")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayer", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_playing")

    public val setPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_paused")

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_paused")

    public val setVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume")

    public val getVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume_db")

    public val setAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_audio_track")

    public val getAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_audio_track")

    public val getStreamNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_name")

    public val setStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream_position")

    public val getStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_position")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_autoplay")

    public val hasAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_autoplay")

    public val setExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_expand")

    public val hasExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_expand")

    public val setBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_buffering_msec")

    public val getBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_buffering_msec")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_bus")

    public val getVideoTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_video_texture")
  }
}
