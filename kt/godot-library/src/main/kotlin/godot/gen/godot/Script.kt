// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Script internal constructor() : Resource() {
  public var sourceCode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceCodePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceCodePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPT, scriptIndex)
    return true
  }

  public fun canInstantiate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun instanceHas(baseObject: Object): Boolean {
    TransferContext.writeArguments(OBJECT to baseObject)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceHasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasSourceCode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasSourceCodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun reload(keepState: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, MethodBindings.reloadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getBaseScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBaseScriptPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Script?)
  }

  public fun getInstanceBaseType(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceBaseTypePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun hasScriptSignal(signalName: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signalName)
    TransferContext.callMethod(rawPtr, MethodBindings.hasScriptSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getScriptConstantMap(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptConstantMapPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getPropertyDefaultValue(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.getPropertyDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun isTool(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isToolPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "can_instantiate")

    public val instanceHasPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "instance_has")

    public val hasSourceCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "has_source_code")

    public val getSourceCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "get_source_code")

    public val setSourceCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "set_source_code")

    public val reloadPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "reload")

    public val getBaseScriptPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "get_base_script")

    public val getInstanceBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_instance_base_type")

    public val hasScriptSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "has_script_signal")

    public val getScriptPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_property_list")

    public val getScriptMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_method_list")

    public val getScriptSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_signal_list")

    public val getScriptConstantMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_constant_map")

    public val getPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_property_default_value")

    public val isToolPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "is_tool")
  }
}
