// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AnimationNodeStateMachinePlayback : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun travel(toNode: StringName, resetOnTeleport: Boolean = true) {
    TransferContext.writeArguments(STRING_NAME to toNode, BOOL to resetOnTeleport)
    TransferContext.callMethod(rawPtr, MethodBindings.travelPtr, NIL)
  }

  @JvmOverloads
  public fun start(node: StringName, reset: Boolean = true) {
    TransferContext.writeArguments(STRING_NAME to node, BOOL to reset)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  public fun next() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.nextPtr, NIL)
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

  public fun getCurrentNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getCurrentPlayPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPlayPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getCurrentLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getFadingFromNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadingFromNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getTravelPath(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public companion object

  internal object MethodBindings {
    public val travelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "travel")

    public val startPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "start")

    public val nextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "next")

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "is_playing")

    public val getCurrentNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_node")

    public val getCurrentPlayPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_play_position")

    public val getCurrentLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_length")

    public val getFadingFromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_fading_from_node")

    public val getTravelPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_travel_path")
  }
}
