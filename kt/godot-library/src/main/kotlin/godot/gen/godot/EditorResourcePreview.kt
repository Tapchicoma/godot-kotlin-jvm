// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorResourcePreview internal constructor() : Node() {
  public val previewInvalidated: Signal1<String> by signal("path")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEW, scriptIndex)
    return true
  }

  public fun queueResourcePreview(
    path: String,
    `receiver`: Object,
    receiverFunc: StringName,
    userdata: Any?,
  ) {
    TransferContext.writeArguments(STRING to path, OBJECT to receiver, STRING_NAME to receiverFunc, ANY to userdata)
    TransferContext.callMethod(rawPtr, MethodBindings.queueResourcePreviewPtr, NIL)
  }

  public fun queueEditedResourcePreview(
    resource: Resource,
    `receiver`: Object,
    receiverFunc: StringName,
    userdata: Any?,
  ) {
    TransferContext.writeArguments(OBJECT to resource, OBJECT to receiver, STRING_NAME to receiverFunc, ANY to userdata)
    TransferContext.callMethod(rawPtr, MethodBindings.queueEditedResourcePreviewPtr, NIL)
  }

  public fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr, MethodBindings.addPreviewGeneratorPtr, NIL)
  }

  public fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr, MethodBindings.removePreviewGeneratorPtr, NIL)
  }

  public fun checkForInvalidation(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.checkForInvalidationPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val queueResourcePreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreview", "queue_resource_preview")

    public val queueEditedResourcePreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreview", "queue_edited_resource_preview")

    public val addPreviewGeneratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreview", "add_preview_generator")

    public val removePreviewGeneratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreview", "remove_preview_generator")

    public val checkForInvalidationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreview", "check_for_invalidation")
  }
}
