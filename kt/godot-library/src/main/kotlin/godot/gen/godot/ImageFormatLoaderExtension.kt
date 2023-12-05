// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class ImageFormatLoaderExtension : ImageFormatLoader() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGEFORMATLOADEREXTENSION, scriptIndex)
    return true
  }

  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ImageFormatLoaderExtension")
  }

  public open fun _loadImage(
    image: Image,
    fileaccess: FileAccess,
    flags: ImageFormatLoader.LoaderFlags,
    scale: Float,
  ): GodotError {
    throw NotImplementedError("_load_image is not implemented for ImageFormatLoaderExtension")
  }

  public fun addFormatLoader() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.addFormatLoaderPtr, NIL)
  }

  public fun removeFormatLoader() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.removeFormatLoaderPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "_get_recognized_extensions")

    public val _loadImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "_load_image")

    public val addFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "add_format_loader")

    public val removeFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "remove_format_loader")
  }
}
