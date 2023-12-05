// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
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
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneTree : MainLoop() {
  public val treeChanged: Signal0 by signal()

  public val treeProcessModeChanged: Signal0 by signal()

  public val nodeAdded: Signal1<Node> by signal("node")

  public val nodeRemoved: Signal1<Node> by signal("node")

  public val nodeRenamed: Signal1<Node> by signal("node")

  public val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  public val processFrame: Signal0 by signal()

  public val physicsFrame: Signal0 by signal()

  public var autoAcceptQuit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoAcceptQuitPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoAcceptQuitPtr, NIL)
    }

  public var quitOnGoBack: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isQuitOnGoBackPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setQuitOnGoBackPtr, NIL)
    }

  public var debugCollisionsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingCollisionsHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugCollisionsHintPtr, NIL)
    }

  public var debugPathsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingPathsHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugPathsHintPtr, NIL)
    }

  public var debugNavigationHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingNavigationHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugNavigationHintPtr, NIL)
    }

  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausePtr, NIL)
    }

  public var editedSceneRoot: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditedSceneRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditedSceneRootPtr, NIL)
    }

  public var currentScene: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentScenePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentScenePtr, NIL)
    }

  public val root: Window?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Window?)
    }

  public var multiplayerPoll: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultiplayerPollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPollEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENETREE, scriptIndex)
    return true
  }

  public fun hasGroup(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun createTimer(
    timeSec: Double,
    processAlways: Boolean = true,
    processInPhysics: Boolean = false,
    ignoreTimeScale: Boolean = false,
  ): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to processAlways, BOOL to processInPhysics, BOOL to ignoreTimeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.createTimerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?)
  }

  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTweenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public fun getProcessedTweens(): VariantArray<Tween> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessedTweensPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Tween>)
  }

  public fun getNodeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun quit(exitCode: Int = 0) {
    TransferContext.writeArguments(LONG to exitCode.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.quitPtr, NIL)
  }

  public fun queueDelete(obj: Object) {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, MethodBindings.queueDeletePtr, NIL)
  }

  public fun callGroupFlags(
    flags: Long,
    group: StringName,
    method: StringName,
    vararg __var_args: Any?,
  ) {
    TransferContext.writeArguments(LONG to flags, STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callGroupFlagsPtr, NIL)
  }

  public fun notifyGroupFlags(
    callFlags: Long,
    group: StringName,
    notification: Int,
  ) {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, LONG to notification.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyGroupFlagsPtr, NIL)
  }

  public fun setGroupFlags(
    callFlags: Long,
    group: StringName,
    `property`: String,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupFlagsPtr, NIL)
  }

  public fun callGroup(
    group: StringName,
    method: StringName,
    vararg __var_args: Any?,
  ) {
    TransferContext.writeArguments(STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callGroupPtr, NIL)
  }

  public fun notifyGroup(group: StringName, notification: Int) {
    TransferContext.writeArguments(STRING_NAME to group, LONG to notification.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyGroupPtr, NIL)
  }

  public fun setGroup(
    group: StringName,
    `property`: String,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupPtr, NIL)
  }

  public fun getNodesInGroup(group: StringName): VariantArray<Node> {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodesInGroupPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  public fun getFirstNodeInGroup(group: StringName): Node? {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstNodeInGroupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun changeSceneToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun changeSceneToPacked(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToPackedPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reloadCurrentScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun unloadCurrentScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unloadCurrentScenePtr, NIL)
  }

  @JvmOverloads
  public fun setMultiplayer(multiplayer: MultiplayerAPI, rootPath: NodePath = NodePath("")) {
    TransferContext.writeArguments(OBJECT to multiplayer, NODE_PATH to rootPath)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPtr, NIL)
  }

  @JvmOverloads
  public fun getMultiplayer(forPath: NodePath = NodePath("")): MultiplayerAPI? {
    TransferContext.writeArguments(NODE_PATH to forPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?)
  }

  public enum class GroupCallFlags(
    id: Long,
  ) {
    GROUP_CALL_DEFAULT(0),
    GROUP_CALL_REVERSE(1),
    GROUP_CALL_DEFERRED(2),
    GROUP_CALL_UNIQUE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GroupCallFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "get_root")

    public val hasGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "has_group")

    public val isAutoAcceptQuitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_auto_accept_quit")

    public val setAutoAcceptQuitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_auto_accept_quit")

    public val isQuitOnGoBackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_quit_on_go_back")

    public val setQuitOnGoBackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_quit_on_go_back")

    public val setDebugCollisionsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_collisions_hint")

    public val isDebuggingCollisionsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_collisions_hint")

    public val setDebugPathsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_paths_hint")

    public val isDebuggingPathsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_paths_hint")

    public val setDebugNavigationHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_navigation_hint")

    public val isDebuggingNavigationHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_navigation_hint")

    public val setEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_edited_scene_root")

    public val getEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_edited_scene_root")

    public val setPausePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "set_pause")

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "is_paused")

    public val createTimerPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "create_timer")

    public val createTweenPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "create_tween")

    public val getProcessedTweensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_processed_tweens")

    public val getNodeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_node_count")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "get_frame")

    public val quitPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "quit")

    public val queueDeletePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "queue_delete")

    public val callGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "call_group_flags")

    public val notifyGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "notify_group_flags")

    public val setGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_group_flags")

    public val callGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "call_group")

    public val notifyGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "notify_group")

    public val setGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "set_group")

    public val getNodesInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_nodes_in_group")

    public val getFirstNodeInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_first_node_in_group")

    public val setCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_current_scene")

    public val getCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_current_scene")

    public val changeSceneToFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "change_scene_to_file")

    public val changeSceneToPackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "change_scene_to_packed")

    public val reloadCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "reload_current_scene")

    public val unloadCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "unload_current_scene")

    public val setMultiplayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_multiplayer")

    public val getMultiplayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_multiplayer")

    public val setMultiplayerPollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_multiplayer_poll_enabled")

    public val isMultiplayerPollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_multiplayer_poll_enabled")
  }
}
