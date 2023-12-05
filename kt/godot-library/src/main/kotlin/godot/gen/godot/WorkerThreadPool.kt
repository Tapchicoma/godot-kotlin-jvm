// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object WorkerThreadPool : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_WORKERTHREADPOOL)
    return false
  }

  @JvmOverloads
  public fun addTask(
    action: Callable,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.addTaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun isTaskCompleted(taskId: Long): Boolean {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr, MethodBindings.isTaskCompletedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun waitForTaskCompletion(taskId: Long): GodotError {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr, MethodBindings.waitForTaskCompletionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun addGroupTask(
    action: Callable,
    elements: Int,
    tasksNeeded: Int = -1,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, LONG to elements.toLong(), LONG to tasksNeeded.toLong(), BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.addGroupTaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun isGroupTaskCompleted(groupId: Long): Boolean {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr, MethodBindings.isGroupTaskCompletedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getGroupProcessedElementCount(groupId: Long): Long {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupProcessedElementCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun waitForGroupTaskCompletion(groupId: Long) {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr, MethodBindings.waitForGroupTaskCompletionPtr, NIL)
  }

  internal object MethodBindings {
    public val addTaskPtr: VoidPtr = TypeManager.getMethodBindPtr("WorkerThreadPool", "add_task")

    public val isTaskCompletedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "is_task_completed")

    public val waitForTaskCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "wait_for_task_completion")

    public val addGroupTaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "add_group_task")

    public val isGroupTaskCompletedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "is_group_task_completed")

    public val getGroupProcessedElementCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "get_group_processed_element_count")

    public val waitForGroupTaskCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "wait_for_group_task_completion")
  }
}
