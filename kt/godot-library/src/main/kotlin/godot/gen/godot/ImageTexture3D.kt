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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class ImageTexture3D : Texture3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURE3D, scriptIndex)
    return true
  }

  public fun create(
    format: Image.Format,
    width: Int,
    height: Int,
    depth: Int,
    useMipmaps: Boolean,
    `data`: VariantArray<Image>,
  ): GodotError {
    TransferContext.writeArguments(LONG to format.id, LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to useMipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.createPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun update(`data`: VariantArray<Image>) {
    TransferContext.writeArguments(ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val createPtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture3D", "create")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture3D", "update")
  }
}
