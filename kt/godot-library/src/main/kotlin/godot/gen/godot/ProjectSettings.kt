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
public object ProjectSettings : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PROJECTSETTINGS)
    return false
  }

  public fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSettingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSetting(name: String, `value`: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setSettingPtr, NIL)
  }

  @JvmOverloads
  public fun getSetting(name: String, defaultValue: Any? = null): Any? {
    TransferContext.writeArguments(STRING to name, ANY to defaultValue)
    TransferContext.callMethod(rawPtr, MethodBindings.getSettingPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getSettingWithOverride(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSettingWithOverridePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getGlobalClassList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalClassListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun setOrder(name: String, position: Int) {
    TransferContext.writeArguments(STRING to name, LONG to position.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOrderPtr, NIL)
  }

  public fun getOrder(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getOrderPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setInitialValue(name: String, `value`: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setInitialValuePtr, NIL)
  }

  public fun setAsBasic(name: String, basic: Boolean) {
    TransferContext.writeArguments(STRING to name, BOOL to basic)
    TransferContext.callMethod(rawPtr, MethodBindings.setAsBasicPtr, NIL)
  }

  public fun setAsInternal(name: String, `internal`: Boolean) {
    TransferContext.writeArguments(STRING to name, BOOL to internal)
    TransferContext.callMethod(rawPtr, MethodBindings.setAsInternalPtr, NIL)
  }

  public fun addPropertyInfo(hint: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to hint)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyInfoPtr, NIL)
  }

  public fun setRestartIfChanged(name: String, restart: Boolean) {
    TransferContext.writeArguments(STRING to name, BOOL to restart)
    TransferContext.callMethod(rawPtr, MethodBindings.setRestartIfChangedPtr, NIL)
  }

  public fun clear(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun localizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.localizePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun globalizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.globalizePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun save(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun loadResourcePack(
    pack: String,
    replaceFiles: Boolean = true,
    offset: Int = 0,
  ): Boolean {
    TransferContext.writeArguments(STRING to pack, BOOL to replaceFiles, LONG to offset.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.loadResourcePackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun saveCustom(`file`: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, MethodBindings.saveCustomPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  internal object MethodBindings {
    public val hasSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "has_setting")

    public val setSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_setting")

    public val getSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_setting")

    public val getSettingWithOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_setting_with_override")

    public val getGlobalClassListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_global_class_list")

    public val setOrderPtr: VoidPtr = TypeManager.getMethodBindPtr("ProjectSettings", "set_order")

    public val getOrderPtr: VoidPtr = TypeManager.getMethodBindPtr("ProjectSettings", "get_order")

    public val setInitialValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_initial_value")

    public val setAsBasicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_as_basic")

    public val setAsInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_as_internal")

    public val addPropertyInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "add_property_info")

    public val setRestartIfChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_restart_if_changed")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ProjectSettings", "clear")

    public val localizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "localize_path")

    public val globalizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "globalize_path")

    public val savePtr: VoidPtr = TypeManager.getMethodBindPtr("ProjectSettings", "save")

    public val loadResourcePackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "load_resource_pack")

    public val saveCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "save_custom")
  }
}
