// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class EditorScript internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCRIPT, scriptIndex)
    return true
  }

  public open fun _run() {
  }

  public fun addRootNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addRootNodePtr, NIL)
  }

  public fun getScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorInterface?)
  }

  public companion object

  internal object MethodBindings {
    public val _runPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorScript", "_run")

    public val addRootNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScript", "add_root_node")

    public val getScenePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorScript", "get_scene")

    public val getEditorInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScript", "get_editor_interface")
  }
}
