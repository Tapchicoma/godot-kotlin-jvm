// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class MultiMeshInstance3D : GeometryInstance3D() {
  public var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultimeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultimeshPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIMESHINSTANCE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "set_multimesh")

    public val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "get_multimesh")
  }
}
