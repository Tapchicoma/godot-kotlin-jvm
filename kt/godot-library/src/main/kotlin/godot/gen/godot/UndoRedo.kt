// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
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
public open class UndoRedo : Object() {
  public val versionChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UNDOREDO, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createAction(
    name: String,
    mergeMode: MergeMode = UndoRedo.MergeMode.MERGE_DISABLE,
    backwardUndoOps: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id, BOOL to backwardUndoOps)
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

  public fun addDoMethod(callable: Callable) {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoMethodPtr, NIL)
  }

  public fun addUndoMethod(callable: Callable) {
    TransferContext.writeArguments(CALLABLE to callable)
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

  public fun startForceKeepInMergeEnds() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.startForceKeepInMergeEndsPtr, NIL)
  }

  public fun endForceKeepInMergeEnds() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endForceKeepInMergeEndsPtr, NIL)
  }

  public fun getHistoryCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHistoryCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCurrentAction(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getActionName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun clearHistory(increaseVersion: Boolean = true) {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, MethodBindings.clearHistoryPtr, NIL)
  }

  public fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.redoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.undoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class MergeMode(
    id: Long,
  ) {
    MERGE_DISABLE(0),
    MERGE_ENDS(1),
    MERGE_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MergeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val createActionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "create_action")

    public val commitActionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "commit_action")

    public val isCommittingActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "is_committing_action")

    public val addDoMethodPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "add_do_method")

    public val addUndoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_method")

    public val addDoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_property")

    public val addUndoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_property")

    public val addDoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_reference")

    public val addUndoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_reference")

    public val startForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "start_force_keep_in_merge_ends")

    public val endForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "end_force_keep_in_merge_ends")

    public val getHistoryCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_history_count")

    public val getCurrentActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action")

    public val getActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_action_name")

    public val clearHistoryPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "clear_history")

    public val getCurrentActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action_name")

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_undo")

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_redo")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "get_version")

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "redo")

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "undo")
  }
}
