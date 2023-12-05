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
public open class RDShaderSource : RefCounted() {
  public var sourceVertex: String
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  public var sourceFragment: String
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  public var sourceTesselationControl: String
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  public var sourceTesselationEvaluation: String
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  public var sourceCompute: String
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  public var language: RenderingDevice.ShaderLanguage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, LONG)
      return RenderingDevice.ShaderLanguage.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERSOURCE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_stage_source")

    public val getStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_stage_source")

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_language")

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_language")
  }
}
