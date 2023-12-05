// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class AudioListener3D : Node3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOLISTENER3D, scriptIndex)
    return true
  }

  public fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  public fun clearCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCurrentPtr, NIL)
  }

  public fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getListenerTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getListenerTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public companion object

  internal object MethodBindings {
    public val makeCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "make_current")

    public val clearCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "clear_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioListener3D", "is_current")

    public val getListenerTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "get_listener_transform")
  }
}
