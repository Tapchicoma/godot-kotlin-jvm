// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class RDPipelineSpecializationConstant : RefCounted() {
  public var `value`: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getValuePtr, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
    set(`value`) {
      TransferContext.writeArguments(ANY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
    }

  public var constantId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantIdPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_value")

    public val getValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_value")

    public val setConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_constant_id")

    public val getConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_constant_id")
  }
}
