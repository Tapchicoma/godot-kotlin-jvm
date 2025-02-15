// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Automatically disables another node if not visible on screen.
 *
 * VisibleOnScreenEnabler2D detects when it is visible on screen (just like [godot.VisibleOnScreenNotifier2D]) and automatically enables or disables the target node. The target node is disabled when [godot.VisibleOnScreenEnabler2D] is not visible on screen (including when [godot.CanvasItem.visible] is `false`), and enabled when the enabler is visible. The disabling is achieved by changing [godot.Node.processMode].
 */
@GodotBaseType
public open class VisibleOnScreenEnabler2D : VisibleOnScreenNotifier2D() {
  /**
   * Determines how the node is enabled. Corresponds to [enum Node.ProcessMode]. Disabled node uses [godot.Node.PROCESS_MODE_DISABLED].
   */
  public var enableMode: EnableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableModePtr, LONG)
      return VisibleOnScreenEnabler2D.EnableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableModePtr, NIL)
    }

  /**
   * The path to the target node, relative to the [godot.VisibleOnScreenEnabler2D]. The target node is cached; it's only assigned when setting this property (if the [godot.VisibleOnScreenEnabler2D] is inside scene tree) and every time the [godot.VisibleOnScreenEnabler2D] enters the scene tree. If the path is invalid, nothing will happen.
   */
  public var enableNodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableNodePathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableNodePathPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER2D, scriptIndex)
    return true
  }

  public enum class EnableMode(
    id: Long,
  ) {
    /**
     * Corresponds to [godot.Node.PROCESS_MODE_INHERIT].
     */
    ENABLE_MODE_INHERIT(0),
    /**
     * Corresponds to [godot.Node.PROCESS_MODE_ALWAYS].
     */
    ENABLE_MODE_ALWAYS(1),
    /**
     * Corresponds to [godot.Node.PROCESS_MODE_WHEN_PAUSED].
     */
    ENABLE_MODE_WHEN_PAUSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_mode")

    public val getEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_mode")

    public val setEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_node_path")

    public val getEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_node_path")
  }
}
