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
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class ImageTexture : Texture2D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURE, scriptIndex)
    return true
  }

  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setImage(image: Image) {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.setImagePtr, NIL)
  }

  public fun update(image: Image) {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  public fun setSizeOverride(size: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizeOverridePtr, NIL)
  }

  public companion object {
    public fun createFromImage(image: Image): ImageTexture? {
      TransferContext.writeArguments(OBJECT to image)
      TransferContext.callMethod(0, MethodBindings.createFromImagePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ImageTexture?)
    }
  }

  internal object MethodBindings {
    public val createFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "create_from_image")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture", "get_format")

    public val setImagePtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture", "set_image")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture", "update")

    public val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "set_size_override")
  }
}
