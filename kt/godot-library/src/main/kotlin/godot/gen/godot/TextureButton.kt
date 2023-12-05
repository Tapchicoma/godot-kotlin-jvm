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
public open class TextureButton : BaseButton() {
  public var textureNormal: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
    }

  public var texturePressed: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
    }

  public var textureHover: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureHoverPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureHoverPtr, NIL)
    }

  public var textureDisabled: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureDisabledPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureDisabledPtr, NIL)
    }

  public var textureFocused: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFocusedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFocusedPtr, NIL)
    }

  public var textureClickMask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClickMaskPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as BitMap?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClickMaskPtr, NIL)
    }

  public var ignoreTextureSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgnoreTextureSizePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreTextureSizePtr, NIL)
    }

  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return TextureButton.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
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
    callConstructor(ENGINECLASS_TEXTUREBUTTON, scriptIndex)
    return true
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
    public val setTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_normal")

    public val setTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_pressed")

    public val setTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_hover")

    public val setTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_disabled")

    public val setTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_focused")

    public val setClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_click_mask")

    public val setIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_ignore_texture_size")

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_stretch_mode")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureButton", "set_flip_h")

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureButton", "set_flip_v")

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_v")

    public val getTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_normal")

    public val getTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_pressed")

    public val getTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_hover")

    public val getTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_disabled")

    public val getTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_focused")

    public val getClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_click_mask")

    public val getIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_ignore_texture_size")

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_stretch_mode")
  }
}
