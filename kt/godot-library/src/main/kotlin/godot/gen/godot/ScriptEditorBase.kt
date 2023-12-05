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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class ScriptEditorBase internal constructor() : VBoxContainer() {
  public val nameChanged: Signal0 by signal()

  public val editedScriptChanged: Signal0 by signal()

  public val requestHelp: Signal1<String> by signal("topic")

  public val requestOpenScriptAtLine: Signal2<Object, Long> by signal("script", "line")

  public val requestSaveHistory: Signal0 by signal()

  public val goToHelp: Signal1<String> by signal("what")

  public val searchInFilesRequested: Signal1<String> by signal("text")

  public val replaceInFilesRequested: Signal1<String> by signal("text")

  public val goToMethod: Signal2<Object, String> by signal("script", "method")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTEDITORBASE, scriptIndex)
    return true
  }

  public fun getBaseEditor(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBaseEditorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun addSyntaxHighlighter(highlighter: EditorSyntaxHighlighter) {
    TransferContext.writeArguments(OBJECT to highlighter)
    TransferContext.callMethod(rawPtr, MethodBindings.addSyntaxHighlighterPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getBaseEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditorBase", "get_base_editor")

    public val addSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptEditorBase", "add_syntax_highlighter")
  }
}
