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
import kotlin.Unit

/**
 * Base script that can be used to add extension functions to the editor.
 *
 * Scripts extending this class and implementing its [_run] method can be executed from the Script Editor's **File > Run** menu option (or by pressing [kbd]Ctrl + Shift + X[/kbd]) while the editor is running. This is useful for adding custom in-editor functionality to Godot. For more complex additions, consider using [godot.EditorPlugin]s instead.
 *
 * **Note:** Extending scripts need to have `tool` mode enabled.
 *
 * **Example script:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * @tool
 *
 * extends EditorScript
 *
 *
 *
 * func _run():
 *
 *     print("Hello from the Godot Editor!")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 *
 *
 * [godot.Tool]
 *
 * public partial class HelloEditor : EditorScript
 *
 * {
 *
 *     public override void _Run()
 *
 *     {
 *
 *         GD.Print("Hello from the Godot Editor!");
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** The script is run in the Editor context, which means the output is visible in the console window started with the Editor (stdout) instead of the usual Godot **Output** dock.
 *
 * **Note:** EditorScript is [godot.RefCounted], meaning it is destroyed when nothing references it. This can cause errors during asynchronous operations if there are no references to the script.
 */
@GodotBaseType
public open class EditorScript internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCRIPT, scriptIndex)
    return true
  }

  /**
   * This method is executed by the Editor when **File > Run** is used.
   */
  public open fun _run(): Unit {
  }

  /**
   * Adds [node] as a child of the root node in the editor context.
   *
   * **Warning:** The implementation of this method is currently disabled.
   */
  public fun addRootNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addRootNodePtr, NIL)
  }

  /**
   * Returns the Editor's currently active scene.
   */
  public fun getScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Returns the [godot.EditorInterface] singleton instance.
   */
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
