// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object InputMap : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_INPUTMAP)
    return false
  }

  public fun hasAction(action: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.hasActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getActions(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  @JvmOverloads
  public fun addAction(action: StringName, deadzone: Float = 0.5f) {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  public fun eraseAction(action: StringName) {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseActionPtr, NIL)
  }

  public fun actionSetDeadzone(action: StringName, deadzone: Float) {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.actionSetDeadzonePtr, NIL)
  }

  public fun actionGetDeadzone(action: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionGetDeadzonePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun actionAddEvent(action: StringName, event: InputEvent) {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionAddEventPtr, NIL)
  }

  public fun actionHasEvent(action: StringName, event: InputEvent): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionHasEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun actionEraseEvent(action: StringName, event: InputEvent) {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionEraseEventPtr, NIL)
  }

  public fun actionEraseEvents(action: StringName) {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionEraseEventsPtr, NIL)
  }

  public fun actionGetEvents(action: StringName): VariantArray<InputEvent> {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionGetEventsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<InputEvent>)
  }

  @JvmOverloads
  public fun eventIsAction(
    event: InputEvent,
    action: StringName,
    exactMatch: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(OBJECT to event, STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.eventIsActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun loadFromProjectSettings() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromProjectSettingsPtr, NIL)
  }

  internal object MethodBindings {
    public val hasActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "has_action")

    public val getActionsPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "get_actions")

    public val addActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "add_action")

    public val eraseActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "erase_action")

    public val actionSetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_set_deadzone")

    public val actionGetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_deadzone")

    public val actionAddEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_add_event")

    public val actionHasEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_has_event")

    public val actionEraseEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_event")

    public val actionEraseEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_events")

    public val actionGetEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_events")

    public val eventIsActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "event_is_action")

    public val loadFromProjectSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "load_from_project_settings")
  }
}
