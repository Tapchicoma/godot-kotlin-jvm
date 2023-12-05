// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class ShaderMaterial : Material() {
  public var shader: Shader?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShaderPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shader?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShaderPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADERMATERIAL, scriptIndex)
    return true
  }

  public fun setShaderParameter(`param`: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to param, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setShaderParameterPtr, NIL)
  }

  public fun getShaderParameter(`param`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to param)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val setShaderPtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader")

    public val getShaderPtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader")

    public val setShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader_parameter")

    public val getShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader_parameter")
  }
}
