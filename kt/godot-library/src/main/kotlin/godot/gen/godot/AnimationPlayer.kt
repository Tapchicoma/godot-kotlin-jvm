// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimationPlayer : Node() {
  public val animationFinished: Signal1<StringName> by signal("animName")

  public val animationChanged: Signal2<StringName, StringName> by signal("oldName", "newName")

  public val animationStarted: Signal1<StringName> by signal("animName")

  public val animationListChanged: Signal0 by signal()

  public val animationLibrariesUpdated: Signal0 by signal()

  public val cachesCleared: Signal0 by signal()

  public var rootNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootPtr, NIL)
    }

  public var currentAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentAnimationPtr, NIL)
    }

  public var assignedAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAssignedAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAssignedAnimationPtr, NIL)
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

  public var resetOnSave: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResetOnSaveEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetOnSaveEnabledPtr, NIL)
    }

  public val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  public val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPositionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  public var playbackProcessMode: AnimationProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
      return AnimationPlayer.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
    }

  public var playbackDefaultBlendTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultBlendTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultBlendTimePtr, NIL)
    }

  public var playbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
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

  public var methodCallMode: AnimationMethodCallMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMethodCallModePtr, LONG)
      return AnimationPlayer.AnimationMethodCallMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMethodCallModePtr, NIL)
    }

  public var audioMaxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioMaxPolyphonyPtr, NIL)
    }

  public var movieQuitOnFinish: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMovieQuitOnFinishEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMovieQuitOnFinishEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONPLAYER, scriptIndex)
    return true
  }

  public open fun _postProcessKeyValue(
    animation: Animation,
    track: Int,
    `value`: Any?,
    _object: Object,
    objectIdx: Int,
  ): Any? {
    throw NotImplementedError("_post_process_key_value is not implemented for AnimationPlayer")
  }

  public fun addAnimationLibrary(name: StringName, library: AnimationLibrary): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to library)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationLibraryPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun removeAnimationLibrary(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationLibraryPtr, NIL)
  }

  public fun renameAnimationLibrary(name: StringName, newname: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationLibraryPtr, NIL)
  }

  public fun hasAnimationLibrary(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationLibraryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAnimationLibrary(name: StringName): AnimationLibrary? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationLibrary?)
  }

  public fun getAnimationLibraryList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  public fun getAnimationList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun animationSetNext(animFrom: StringName, animTo: StringName) {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, MethodBindings.animationSetNextPtr, NIL)
  }

  public fun animationGetNext(animFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.animationGetNextPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setBlendTime(
    animFrom: StringName,
    animTo: StringName,
    sec: Double,
  ) {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendTimePtr, NIL)
  }

  public fun getBlendTime(animFrom: StringName, animTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  @JvmOverloads
  public fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0) {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  public fun pause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  @JvmOverloads
  public fun stop(keepState: Boolean = false) {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun queue(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.queuePtr, NIL)
  }

  public fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getQueuePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun clearQueue() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearQueuePtr, NIL)
  }

  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun findAnimation(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun findAnimationLibrary(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationLibraryPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun clearCaches() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachesPtr, NIL)
  }

  @JvmOverloads
  public fun seek(seconds: Double, update: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  public fun advance(delta: Double) {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.advancePtr, NIL)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    ANIMATION_PROCESS_PHYSICS(0),
    ANIMATION_PROCESS_IDLE(1),
    ANIMATION_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationProcessCallback = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AnimationMethodCallMode(
    id: Long,
  ) {
    ANIMATION_METHOD_CALL_DEFERRED(0),
    ANIMATION_METHOD_CALL_IMMEDIATE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationMethodCallMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _postProcessKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "_post_process_key_value")

    public val addAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "add_animation_library")

    public val removeAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "remove_animation_library")

    public val renameAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "rename_animation_library")

    public val hasAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "has_animation_library")

    public val getAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_library")

    public val getAnimationLibraryListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_library_list")

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "has_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation")

    public val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_list")

    public val animationSetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_set_next")

    public val animationGetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_get_next")

    public val setBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_blend_time")

    public val getBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_blend_time")

    public val setDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_default_blend_time")

    public val getDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_default_blend_time")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "play")

    public val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_backwards")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "pause")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "stop")

    public val isPlayingPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "is_playing")

    public val setCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_current_animation")

    public val getCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation")

    public val setAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_assigned_animation")

    public val getAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_assigned_animation")

    public val queuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "queue")

    public val getQueuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_queue")

    public val clearQueuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_queue")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "set_active")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "is_active")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_speed_scale")

    public val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_playing_speed")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_autoplay")

    public val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_autoplay")

    public val setResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_reset_on_save_enabled")

    public val isResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_reset_on_save_enabled")

    public val setRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "set_root")

    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_root")

    public val findAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "find_animation")

    public val findAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "find_animation_library")

    public val clearCachesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_caches")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_process_callback")

    public val setMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_method_call_mode")

    public val getMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_method_call_mode")

    public val setAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_audio_max_polyphony")

    public val getAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_audio_max_polyphony")

    public val setMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_movie_quit_on_finish_enabled")

    public val isMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_movie_quit_on_finish_enabled")

    public val getCurrentAnimationPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_position")

    public val getCurrentAnimationLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_length")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "seek")

    public val advancePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "advance")
  }
}
