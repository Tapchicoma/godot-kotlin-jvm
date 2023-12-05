// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class VisualShaderNodeCustom : VisualShaderNode() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUSTOM, scriptIndex)
    return true
  }

  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getDescription(): String {
    throw NotImplementedError("_get_description is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getCategory(): String {
    throw NotImplementedError("_get_category is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getReturnIconType(): VisualShaderNode.PortType {
    throw NotImplementedError("_get_return_icon_type is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getInputPortCount(): Int {
    throw NotImplementedError("_get_input_port_count is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getInputPortType(port: Int): VisualShaderNode.PortType {
    throw NotImplementedError("_get_input_port_type is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getInputPortName(port: Int): String {
    throw NotImplementedError("_get_input_port_name is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getOutputPortCount(): Int {
    throw NotImplementedError("_get_output_port_count is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getOutputPortType(port: Int): VisualShaderNode.PortType {
    throw NotImplementedError("_get_output_port_type is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getOutputPortName(port: Int): String {
    throw NotImplementedError("_get_output_port_name is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getCode(
    inputVars: VariantArray<String>,
    outputVars: VariantArray<String>,
    mode: Shader.Mode,
    type: VisualShader.Type,
  ): String {
    throw NotImplementedError("_get_code is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getFuncCode(mode: Shader.Mode, type: VisualShader.Type): String {
    throw NotImplementedError("_get_func_code is not implemented for VisualShaderNodeCustom")
  }

  public open fun _getGlobalCode(mode: Shader.Mode): String {
    throw NotImplementedError("_get_global_code is not implemented for VisualShaderNodeCustom")
  }

  public open fun _isHighend(): Boolean {
    throw NotImplementedError("_is_highend is not implemented for VisualShaderNodeCustom")
  }

  public open fun _isAvailable(mode: Shader.Mode, type: VisualShader.Type): Boolean {
    throw NotImplementedError("_is_available is not implemented for VisualShaderNodeCustom")
  }

  public companion object

  internal object MethodBindings {
    public val _getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_name")

    public val _getDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_description")

    public val _getCategoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_category")

    public val _getReturnIconTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_return_icon_type")

    public val _getInputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_input_port_count")

    public val _getInputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_input_port_type")

    public val _getInputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_input_port_name")

    public val _getOutputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_output_port_count")

    public val _getOutputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_output_port_type")

    public val _getOutputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_output_port_name")

    public val _getCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_code")

    public val _getFuncCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_func_code")

    public val _getGlobalCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_get_global_code")

    public val _isHighendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_is_highend")

    public val _isAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCustom", "_is_available")
  }
}
