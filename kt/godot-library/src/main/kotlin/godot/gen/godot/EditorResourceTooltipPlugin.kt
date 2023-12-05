// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorResourceTooltipPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCETOOLTIPPLUGIN, scriptIndex)
    return true
  }

  public open fun _handles(type: String): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourceTooltipPlugin")
  }

  public open fun _makeTooltipForPath(
    path: String,
    metadata: Dictionary<Any?, Any?>,
    base: Control,
  ): Control? {
    throw NotImplementedError("_make_tooltip_for_path is not implemented for EditorResourceTooltipPlugin")
  }

  public fun requestThumbnail(path: String, control: TextureRect) {
    TransferContext.writeArguments(STRING to path, OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.requestThumbnailPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _handlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "_handles")

    public val _makeTooltipForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "_make_tooltip_for_path")

    public val requestThumbnailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "request_thumbnail")
  }
}
