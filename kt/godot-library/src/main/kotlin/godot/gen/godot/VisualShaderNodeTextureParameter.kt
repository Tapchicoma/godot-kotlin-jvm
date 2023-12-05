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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class VisualShaderNodeTextureParameter internal constructor() :
    VisualShaderNodeParameter() {
  public var textureType: TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureTypePtr, LONG)
      return VisualShaderNodeTextureParameter.TextureType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureTypePtr, NIL)
    }

  public var colorDefault: ColorDefault
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorDefaultPtr, LONG)
      return VisualShaderNodeTextureParameter.ColorDefault.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorDefaultPtr, NIL)
    }

  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return VisualShaderNodeTextureParameter.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  public var textureRepeat: TextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRepeatPtr, LONG)
      return VisualShaderNodeTextureParameter.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRepeatPtr, NIL)
    }

  public var textureSource: TextureSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureSourcePtr, LONG)
      return VisualShaderNodeTextureParameter.TextureSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureSourcePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTUREPARAMETER, scriptIndex)
    return true
  }

  public enum class TextureType(
    id: Long,
  ) {
    TYPE_DATA(0),
    TYPE_COLOR(1),
    TYPE_NORMAL_MAP(2),
    TYPE_ANISOTROPY(3),
    TYPE_MAX(4),
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

  public enum class ColorDefault(
    id: Long,
  ) {
    COLOR_DEFAULT_WHITE(0),
    COLOR_DEFAULT_BLACK(1),
    COLOR_DEFAULT_TRANSPARENT(2),
    COLOR_DEFAULT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorDefault = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    FILTER_DEFAULT(0),
    FILTER_NEAREST(1),
    FILTER_LINEAR(2),
    FILTER_NEAREST_MIPMAP(3),
    FILTER_LINEAR_MIPMAP(4),
    FILTER_NEAREST_MIPMAP_ANISOTROPIC(5),
    FILTER_LINEAR_MIPMAP_ANISOTROPIC(6),
    FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureRepeat(
    id: Long,
  ) {
    REPEAT_DEFAULT(0),
    REPEAT_ENABLED(1),
    REPEAT_DISABLED(2),
    REPEAT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureRepeat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureSource(
    id: Long,
  ) {
    SOURCE_NONE(0),
    SOURCE_SCREEN(1),
    SOURCE_DEPTH(2),
    SOURCE_NORMAL_ROUGHNESS(3),
    SOURCE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureSource = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_type")

    public val getTextureTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_type")

    public val setColorDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_color_default")

    public val getColorDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_color_default")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_filter")

    public val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_repeat")

    public val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_repeat")

    public val setTextureSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "set_texture_source")

    public val getTextureSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTextureParameter", "get_texture_source")
  }
}
