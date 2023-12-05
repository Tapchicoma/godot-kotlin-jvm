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
public open class VisualShaderNodeParameter internal constructor() : VisualShaderNode() {
  public var parameterName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParameterNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParameterNamePtr, NIL)
    }

  public var qualifier: Qualifier
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getQualifierPtr, LONG)
      return VisualShaderNodeParameter.Qualifier.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setQualifierPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARAMETER, scriptIndex)
    return true
  }

  public enum class Qualifier(
    id: Long,
  ) {
    QUAL_NONE(0),
    QUAL_GLOBAL(1),
    QUAL_INSTANCE(2),
    QUAL_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Qualifier = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_parameter_name")

    public val getParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_parameter_name")

    public val setQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_qualifier")

    public val getQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_qualifier")
  }
}
