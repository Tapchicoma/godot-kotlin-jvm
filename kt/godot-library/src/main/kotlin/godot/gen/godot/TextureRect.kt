// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
public open class TextureRect : Control() {
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

  public var expandMode: ExpandMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandModePtr, LONG)
      return TextureRect.ExpandMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandModePtr, NIL)
    }

  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return TextureRect.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
    }

  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURERECT, scriptIndex)
    return true
  }

  public enum class ExpandMode(
    id: Long,
  ) {
    EXPAND_KEEP_SIZE(0),
    EXPAND_IGNORE_SIZE(1),
    EXPAND_FIT_WIDTH(2),
    EXPAND_FIT_WIDTH_PROPORTIONAL(3),
    EXPAND_FIT_HEIGHT(4),
    EXPAND_FIT_HEIGHT_PROPORTIONAL(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ExpandMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class StretchMode(
    id: Long,
  ) {
    STRETCH_SCALE(0),
    STRETCH_TILE(1),
    STRETCH_KEEP(2),
    STRETCH_KEEP_CENTERED(3),
    STRETCH_KEEP_ASPECT(4),
    STRETCH_KEEP_ASPECT_CENTERED(5),
    STRETCH_KEEP_ASPECT_COVERED(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StretchMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "get_texture")

    public val setExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_expand_mode")

    public val getExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_expand_mode")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "set_flip_h")

    public val isFlippedHPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "set_flip_v")

    public val isFlippedVPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureRect", "is_flipped_v")

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_stretch_mode")

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_stretch_mode")
  }
}
