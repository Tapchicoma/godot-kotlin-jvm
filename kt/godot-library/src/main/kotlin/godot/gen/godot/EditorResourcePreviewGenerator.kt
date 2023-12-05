// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.Vector2i
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorResourcePreviewGenerator internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEWGENERATOR, scriptIndex)
    return true
  }

  public open fun _handles(type: String): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourcePreviewGenerator")
  }

  public open fun _generate(
    resource: Resource,
    size: Vector2i,
    metadata: Dictionary<Any?, Any?>,
  ): Texture2D? {
    throw NotImplementedError("_generate is not implemented for EditorResourcePreviewGenerator")
  }

  public open fun _generateFromPath(
    path: String,
    size: Vector2i,
    metadata: Dictionary<Any?, Any?>,
  ): Texture2D? {
    throw NotImplementedError("_generate_from_path is not implemented for EditorResourcePreviewGenerator")
  }

  public open fun _generateSmallPreviewAutomatically(): Boolean {
    throw NotImplementedError("_generate_small_preview_automatically is not implemented for EditorResourcePreviewGenerator")
  }

  public open fun _canGenerateSmallPreview(): Boolean {
    throw NotImplementedError("_can_generate_small_preview is not implemented for EditorResourcePreviewGenerator")
  }

  public companion object

  internal object MethodBindings {
    public val _handlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreviewGenerator", "_handles")

    public val _generatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreviewGenerator", "_generate")

    public val _generateFromPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreviewGenerator", "_generate_from_path")

    public val _generateSmallPreviewAutomaticallyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreviewGenerator", "_generate_small_preview_automatically")

    public val _canGenerateSmallPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePreviewGenerator", "_can_generate_small_preview")
  }
}
