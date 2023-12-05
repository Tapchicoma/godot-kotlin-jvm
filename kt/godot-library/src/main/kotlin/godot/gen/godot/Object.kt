// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.KtObject
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
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
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Object : KtObject() {
  public val scriptChanged: Signal0 by signal()

  public val propertyListChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OBJECT, scriptIndex)
    return true
  }

  @JvmName("getGodotClass")
  public fun getClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClassPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isClass(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun `set`(`property`: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setPtr, NIL)
  }

  public fun `get`(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.getPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setIndexed(propertyPath: NodePath, `value`: Any?) {
    TransferContext.writeArguments(NODE_PATH to propertyPath, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setIndexedPtr, NIL)
  }

  public fun getIndexed(propertyPath: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to propertyPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexedPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun propertyCanRevert(`property`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyCanRevertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun propertyGetRevert(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetRevertPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  @JvmOverloads
  public fun notification(what: Int, reversed: Boolean = false) {
    TransferContext.writeArguments(LONG to what.toLong(), BOOL to reversed)
    TransferContext.callMethod(rawPtr, MethodBindings.notificationPtr, NIL)
  }

  override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setScript(script: Any?) {
    TransferContext.writeArguments(ANY to script)
    TransferContext.callMethod(rawPtr, MethodBindings.setScriptPtr, NIL)
  }

  public fun getScript(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setMeta(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setMetaPtr, NIL)
  }

  public fun removeMeta(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeMetaPtr, NIL)
  }

  @JvmOverloads
  public fun getMeta(name: StringName, default: Any? = null): Any? {
    TransferContext.writeArguments(STRING_NAME to name, ANY to default)
    TransferContext.callMethod(rawPtr, MethodBindings.getMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun hasMeta(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasMetaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getMetaList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMetaListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  @JvmOverloads
  public fun addUserSignal(signal: String, arguments: VariantArray<Any?> =
      godot.core.variantArrayOf()) {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.addUserSignalPtr, NIL)
  }

  public fun hasUserSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.hasUserSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun emitSignal(signal: StringName, vararg __var_args: Any?): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.emitSignalPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun call(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun callDeferred(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callDeferredPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setDeferred(`property`: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setDeferredPtr, NIL)
  }

  public fun callv(method: StringName, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to argArray)
    TransferContext.callMethod(rawPtr, MethodBindings.callvPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun hasMethod(method: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(rawPtr, MethodBindings.hasMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getSignalConnectionList(signal: StringName): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.getSignalConnectionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getIncomingConnections(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIncomingConnectionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  @JvmOverloads
  public fun connect(
    signal: StringName,
    callable: Callable,
    flags: Long = 0,
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.connectPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun disconnect(signal: StringName, callable: Callable) {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPtr, NIL)
  }

  public fun isConnected(signal: StringName, callable: Callable): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.isConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setBlockSignals(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlockSignalsPtr, NIL)
  }

  public fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBlockingSignalsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun notifyPropertyListChanged() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.notifyPropertyListChangedPtr, NIL)
  }

  public fun setMessageTranslation(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setMessageTranslationPtr, NIL)
  }

  public fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canTranslateMessagesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun tr(message: StringName, context: StringName = StringName("")): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.trPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun trN(
    message: StringName,
    pluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.trNPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isQueuedForDeletionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun cancelFree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cancelFreePtr, NIL)
  }

  public enum class ConnectFlags(
    id: Long,
  ) {
    CONNECT_DEFERRED(1),
    CONNECT_PERSIST(2),
    CONNECT_ONE_SHOT(4),
    CONNECT_REFERENCE_COUNTED(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ConnectFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    public final const val NOTIFICATION_PREDELETE: Long = 1
  }

  internal object MethodBindings {
    public val getClassPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_class")

    public val isClassPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "is_class")

    public val setPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set")

    public val getPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get")

    public val setIndexedPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set_indexed")

    public val getIndexedPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_indexed")

    public val getPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_property_list")

    public val getMethodListPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_method_list")

    public val propertyCanRevertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "property_can_revert")

    public val propertyGetRevertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "property_get_revert")

    public val notificationPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "notification")

    public val toStringPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "to_string")

    public val getInstanceIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_instance_id")

    public val setScriptPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set_script")

    public val getScriptPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_script")

    public val setMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set_meta")

    public val removeMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "remove_meta")

    public val getMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_meta")

    public val hasMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "has_meta")

    public val getMetaListPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_meta_list")

    public val addUserSignalPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "add_user_signal")

    public val hasUserSignalPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "has_user_signal")

    public val emitSignalPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "emit_signal")

    public val callPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "call")

    public val callDeferredPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "call_deferred")

    public val setDeferredPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set_deferred")

    public val callvPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "callv")

    public val hasMethodPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "has_method")

    public val hasSignalPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "has_signal")

    public val getSignalListPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get_signal_list")

    public val getSignalConnectionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_signal_connection_list")

    public val getIncomingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_incoming_connections")

    public val connectPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "connect")

    public val disconnectPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "disconnect")

    public val isConnectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "is_connected")

    public val setBlockSignalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_block_signals")

    public val isBlockingSignalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_blocking_signals")

    public val notifyPropertyListChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "notify_property_list_changed")

    public val setMessageTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_message_translation")

    public val canTranslateMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "can_translate_messages")

    public val trPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "tr")

    public val trNPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "tr_n")

    public val isQueuedForDeletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_queued_for_deletion")

    public val cancelFreePtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "cancel_free")
  }
}
