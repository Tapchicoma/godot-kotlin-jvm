// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public object ResourceUID : Object() {
  public final const val INVALID_ID: Long = -1

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RESOURCEUID)
    return false
  }

  public fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.idToTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(rawPtr, MethodBindings.textToIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addId(id: Long, path: String) {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  public fun setId(id: Long, path: String) {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setIdPtr, NIL)
  }

  public fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun removeId(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeIdPtr, NIL)
  }

  internal object MethodBindings {
    public val idToTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "id_to_text")

    public val textToIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "text_to_id")

    public val createIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "create_id")

    public val hasIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "has_id")

    public val addIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "add_id")

    public val setIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "set_id")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "get_id_path")

    public val removeIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "remove_id")
  }
}
