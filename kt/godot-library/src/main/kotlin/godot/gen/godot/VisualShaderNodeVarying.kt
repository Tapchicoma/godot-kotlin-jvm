// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class VisualShaderNodeVarying internal constructor() : VisualShaderNode() {
  public var varyingName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVaryingNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVaryingNamePtr, NIL)
    }

  public var varyingType: VisualShader.VaryingType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVaryingTypePtr, LONG)
      return VisualShader.VaryingType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVaryingTypePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVARYING, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setVaryingNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_name")

    public val getVaryingNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_name")

    public val setVaryingTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_type")

    public val getVaryingTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_type")
  }
}
