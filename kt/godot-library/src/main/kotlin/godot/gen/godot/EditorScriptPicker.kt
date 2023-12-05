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
public open class EditorScriptPicker internal constructor() : EditorResourcePicker() {
  public var scriptOwner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScriptOwnerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScriptOwnerPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCRIPTPICKER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setScriptOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScriptPicker", "set_script_owner")

    public val getScriptOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScriptPicker", "get_script_owner")
  }
}
