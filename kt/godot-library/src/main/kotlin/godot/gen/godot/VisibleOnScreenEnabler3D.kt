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

@GodotBaseType
public open class VisibleOnScreenEnabler3D : VisibleOnScreenNotifier3D() {
  public var enableMode: EnableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableModePtr, LONG)
      return VisibleOnScreenEnabler3D.EnableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableModePtr, NIL)
    }

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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER3D, scriptIndex)
    return true
  }

  public enum class EnableMode(
    id: Long,
  ) {
    ENABLE_MODE_INHERIT(0),
    ENABLE_MODE_ALWAYS(1),
    ENABLE_MODE_WHEN_PAUSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnableMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_mode")

    public val getEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_mode")

    public val setEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_node_path")

    public val getEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_node_path")
  }
}
