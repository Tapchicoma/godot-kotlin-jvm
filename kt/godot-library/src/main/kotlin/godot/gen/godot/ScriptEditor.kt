// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class ScriptEditor internal constructor() : PanelContainer() {
  public val editorScriptChanged: Signal1<Script> by signal("script")

  public val scriptClose: Signal1<Script> by signal("script")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTEDITOR, scriptIndex)
    return true
  }

  public fun getCurrentEditor(): ScriptEditorBase? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentEditorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptEditorBase?)
  }

  public fun getOpenScriptEditors(): VariantArray<ScriptEditorBase> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenScriptEditorsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<ScriptEditorBase>)
  }

  public fun registerSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter) {
    TransferContext.writeArguments(OBJECT to syntaxHighlighter)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSyntaxHighlighterPtr, NIL)
  }

  public fun unregisterSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter) {
    TransferContext.writeArguments(OBJECT to syntaxHighlighter)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterSyntaxHighlighterPtr, NIL)
  }

  public fun gotoLine(lineNumber: Int) {
    TransferContext.writeArguments(LONG to lineNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.gotoLinePtr, NIL)
  }

  public fun getCurrentScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentScriptPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Script?)
  }

  public fun getOpenScripts(): VariantArray<Script> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenScriptsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Script>)
  }

  public fun openScriptCreateDialog(baseName: String, basePath: String) {
    TransferContext.writeArguments(STRING to baseName, STRING to basePath)
    TransferContext.callMethod(rawPtr, MethodBindings.openScriptCreateDialogPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getCurrentEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "get_current_editor")

    public val getOpenScriptEditorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "get_open_script_editors")

    public val registerSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "register_syntax_highlighter")

    public val unregisterSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "unregister_syntax_highlighter")

    public val gotoLinePtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptEditor", "goto_line")

    public val getCurrentScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "get_current_script")

    public val getOpenScriptsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "get_open_scripts")

    public val openScriptCreateDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditor", "open_script_create_dialog")
  }
}
