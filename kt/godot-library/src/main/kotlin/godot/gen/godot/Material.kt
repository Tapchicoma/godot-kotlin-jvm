// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class Material : Resource() {
  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
    }

  public var nextPass: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNextPassPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNextPassPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MATERIAL, scriptIndex)
    return true
  }

  public open fun _getShaderRid(): RID {
    throw NotImplementedError("_get_shader_rid is not implemented for Material")
  }

  public open fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("_get_shader_mode is not implemented for Material")
  }

  public open fun _canDoNextPass(): Boolean {
    throw NotImplementedError("_can_do_next_pass is not implemented for Material")
  }

  public open fun _canUseRenderPriority(): Boolean {
    throw NotImplementedError("_can_use_render_priority is not implemented for Material")
  }

  public fun inspectNativeShaderCode() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.inspectNativeShaderCodePtr, NIL)
  }

  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object {
    public final const val RENDER_PRIORITY_MAX: Long = 127

    public final const val RENDER_PRIORITY_MIN: Long = -128
  }

  internal object MethodBindings {
    public val _getShaderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_get_shader_rid")

    public val _getShaderModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_get_shader_mode")

    public val _canDoNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_can_do_next_pass")

    public val _canUseRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_can_use_render_priority")

    public val setNextPassPtr: VoidPtr = TypeManager.getMethodBindPtr("Material", "set_next_pass")

    public val getNextPassPtr: VoidPtr = TypeManager.getMethodBindPtr("Material", "get_next_pass")

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "set_render_priority")

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "get_render_priority")

    public val inspectNativeShaderCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "inspect_native_shader_code")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "create_placeholder")
  }
}
