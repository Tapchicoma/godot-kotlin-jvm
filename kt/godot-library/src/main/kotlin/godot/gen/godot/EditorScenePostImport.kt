// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorScenePostImport internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORT, scriptIndex)
    return true
  }

  public open fun _postImport(scene: Node): Object? {
    throw NotImplementedError("_post_import is not implemented for EditorScenePostImport")
  }

  public fun getSourceFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val _postImportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImport", "_post_import")

    public val getSourceFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImport", "get_source_file")
  }
}
