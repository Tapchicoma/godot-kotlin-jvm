// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class RemoteTransform2D : Node2D() {
  public var remotePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRemoteNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRemoteNodePtr, NIL)
    }

  public var useGlobalCoordinates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseGlobalCoordinatesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseGlobalCoordinatesPtr, NIL)
    }

  public var updatePosition: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdatePositionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdatePositionPtr, NIL)
    }

  public var updateRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateRotationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateRotationPtr, NIL)
    }

  public var updateScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateScalePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REMOTETRANSFORM2D, scriptIndex)
    return true
  }

  public fun forceUpdateCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateCachePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_remote_node")

    public val getRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_remote_node")

    public val forceUpdateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "force_update_cache")

    public val setUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_use_global_coordinates")

    public val getUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_use_global_coordinates")

    public val setUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_position")

    public val getUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_position")

    public val setUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_rotation")

    public val getUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_rotation")

    public val setUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_scale")

    public val getUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_scale")
  }
}
