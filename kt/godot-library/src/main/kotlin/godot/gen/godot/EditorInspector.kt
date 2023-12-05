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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorInspector internal constructor() : ScrollContainer() {
  public val propertySelected: Signal1<String> by signal("property")

  public val propertyKeyed: Signal3<String, Any?, Boolean> by signal("property", "value", "advance")

  public val propertyDeleted: Signal1<String> by signal("property")

  public val resourceSelected: Signal2<Resource, String> by signal("resource", "path")

  public val objectIdSelected: Signal1<Long> by signal("id")

  public val propertyEdited: Signal1<String> by signal("property")

  public val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  public val editedObjectChanged: Signal0 by signal()

  public val restartRequested: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORINSPECTOR, scriptIndex)
    return true
  }

  public fun getSelectedPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getSelectedPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspector", "get_selected_path")
  }
}
