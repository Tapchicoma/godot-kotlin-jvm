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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorUndoRedoManager internal constructor() : Object() {
  public val historyChanged: Signal0 by signal()

  public val versionChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORUNDOREDOMANAGER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createAction(
    name: String,
    mergeMode: UndoRedo.MergeMode = UndoRedo.MergeMode.MERGE_DISABLE,
    customContext: Object? = null,
    backwardUndoOps: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id, OBJECT to customContext, BOOL to backwardUndoOps)
    TransferContext.callMethod(rawPtr, MethodBindings.createActionPtr, NIL)
  }

  @JvmOverloads
  public fun commitAction(execute: Boolean = true) {
    TransferContext.writeArguments(BOOL to execute)
    TransferContext.callMethod(rawPtr, MethodBindings.commitActionPtr, NIL)
  }

  public fun isCommittingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommittingActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun addDoMethod(
    _object: Object,
    method: StringName,
    vararg __var_args: Any?,
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.addDoMethodPtr, NIL)
  }

  public fun addUndoMethod(
    _object: Object,
    method: StringName,
    vararg __var_args: Any?,
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoMethodPtr, NIL)
  }

  public fun addDoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoPropertyPtr, NIL)
  }

  public fun addUndoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoPropertyPtr, NIL)
  }

  public fun addDoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoReferencePtr, NIL)
  }

  public fun addUndoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoReferencePtr, NIL)
  }

  public fun getObjectHistoryId(_object: Object): Int {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectHistoryIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getHistoryUndoRedo(id: Int): UndoRedo? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHistoryUndoRedoPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as UndoRedo?)
  }

  public enum class SpecialHistory(
    id: Long,
  ) {
    GLOBAL_HISTORY(0),
    REMOTE_HISTORY(-9),
    INVALID_HISTORY(-99),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpecialHistory = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val createActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "create_action")

    public val commitActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "commit_action")

    public val isCommittingActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "is_committing_action")

    public val addDoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_method")

    public val addUndoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_method")

    public val addDoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_property")

    public val addUndoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_property")

    public val addDoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_reference")

    public val addUndoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_reference")

    public val getObjectHistoryIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "get_object_history_id")

    public val getHistoryUndoRedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "get_history_undo_redo")
  }
}
