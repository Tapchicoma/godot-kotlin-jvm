// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Shader : Resource() {
  public var code: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCodePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADER, scriptIndex)
    return true
  }

  public fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return Shader.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun setDefaultTextureParameter(
    name: StringName,
    texture: Texture2D,
    index: Int = 0,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultTextureParameterPtr, NIL)
  }

  @JvmOverloads
  public fun getDefaultTextureParameter(name: StringName, index: Int = 0): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultTextureParameterPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  @JvmOverloads
  public fun getShaderUniformList(getGroups: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(BOOL to getGroups)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderUniformListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class Mode(
    id: Long,
  ) {
    MODE_SPATIAL(0),
    MODE_CANVAS_ITEM(1),
    MODE_PARTICLES(2),
    MODE_SKY(3),
    MODE_FOG(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getModePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "get_mode")

    public val setCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "set_code")

    public val getCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "get_code")

    public val setDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "set_default_texture_parameter")

    public val getDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_default_texture_parameter")

    public val getShaderUniformListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_shader_uniform_list")
  }
}
