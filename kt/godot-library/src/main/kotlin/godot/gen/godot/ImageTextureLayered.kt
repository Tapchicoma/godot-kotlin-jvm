// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
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
public open class ImageTextureLayered internal constructor() : TextureLayered() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURELAYERED, scriptIndex)
    return true
  }

  public fun createFromImages(images: VariantArray<Image>): GodotError {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromImagesPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun updateLayer(image: Image, layer: Int) {
    TransferContext.writeArguments(OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.updateLayerPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val createFromImagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "create_from_images")

    public val updateLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "update_layer")
  }
}
