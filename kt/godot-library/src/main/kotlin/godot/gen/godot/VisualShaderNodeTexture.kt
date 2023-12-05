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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class VisualShaderNodeTexture : VisualShaderNode() {
  public var source: Source
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourcePtr, LONG)
      return VisualShaderNodeTexture.Source.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourcePtr, NIL)
    }

  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var textureType: TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
      return VisualShaderNodeTexture.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE, scriptIndex)
    return true
  }

  public enum class Source(
    id: Long,
  ) {
    SOURCE_TEXTURE(0),
    SOURCE_SCREEN(1),
    SOURCE_2D_TEXTURE(2),
    SOURCE_2D_NORMAL(3),
    SOURCE_DEPTH(4),
    SOURCE_PORT(5),
    SOURCE_3D_NORMAL(6),
    SOURCE_ROUGHNESS(7),
    SOURCE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Source = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureType(
    id: Long,
  ) {
    TYPE_DATA(0),
    TYPE_COLOR(1),
    TYPE_NORMAL_MAP(2),
    TYPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_source")

    public val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_source")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture")

    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "set_texture_type")

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture", "get_texture_type")
  }
}
