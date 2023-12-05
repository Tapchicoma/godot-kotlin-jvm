// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class VisualShaderNode internal constructor() : Resource() {
  public var outputPortForPreview: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortForPreviewPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutputPortForPreviewPtr, NIL)
    }

  public var defaultInputValues: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultInputValuesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultInputValuesPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODE, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun setInputPortDefaultValue(
    port: Int,
    `value`: Any?,
    prevValue: Any? = null,
  ) {
    TransferContext.writeArguments(LONG to port.toLong(), ANY to value, ANY to prevValue)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputPortDefaultValuePtr, NIL)
  }

  public fun getInputPortDefaultValue(port: Int): Any? {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun removeInputPortDefaultValue(port: Int) {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeInputPortDefaultValuePtr, NIL)
  }

  public fun clearDefaultInputValues() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDefaultInputValuesPtr, NIL)
  }

  public enum class PortType(
    id: Long,
  ) {
    PORT_TYPE_SCALAR(0),
    PORT_TYPE_SCALAR_INT(1),
    PORT_TYPE_SCALAR_UINT(2),
    PORT_TYPE_VECTOR_2D(3),
    PORT_TYPE_VECTOR_3D(4),
    PORT_TYPE_VECTOR_4D(5),
    PORT_TYPE_BOOLEAN(6),
    PORT_TYPE_TRANSFORM(7),
    PORT_TYPE_SAMPLER(8),
    PORT_TYPE_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PortType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_output_port_for_preview")

    public val getOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_output_port_for_preview")

    public val setInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_input_port_default_value")

    public val getInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_input_port_default_value")

    public val removeInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "remove_input_port_default_value")

    public val clearDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "clear_default_input_values")

    public val setDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_default_input_values")

    public val getDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_default_input_values")
  }
}
