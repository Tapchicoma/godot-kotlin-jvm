// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class World2D : Resource() {
  public val canvas: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  public val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpacePtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  public val navigationMap: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  public val directSpaceState: PhysicsDirectSpaceState2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLD2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getCanvasPtr: VoidPtr = TypeManager.getMethodBindPtr("World2D", "get_canvas")

    public val getSpacePtr: VoidPtr = TypeManager.getMethodBindPtr("World2D", "get_space")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_navigation_map")

    public val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_direct_space_state")
  }
}
