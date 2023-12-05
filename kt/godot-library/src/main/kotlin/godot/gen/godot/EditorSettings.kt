// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
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
public open class EditorSettings internal constructor() : Resource() {
  public val settingsChanged: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSETTINGS, scriptIndex)
    return true
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

  public fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSettingPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun erase(`property`: String) {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, MethodBindings.erasePtr, NIL)
  }

  public fun setInitialValue(
    name: StringName,
    `value`: Any?,
    updateCurrent: Boolean,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value, BOOL to updateCurrent)
    TransferContext.callMethod(rawPtr, MethodBindings.setInitialValuePtr, NIL)
  }

  public fun addPropertyInfo(info: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to info)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyInfoPtr, NIL)
  }

  public fun setProjectMetadata(
    section: String,
    key: String,
    `data`: Any?,
  ) {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setProjectMetadataPtr, NIL)
  }

  @JvmOverloads
  public fun getProjectMetadata(
    section: String,
    key: String,
    default: Any? = null,
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setFavorites(dirs: PackedStringArray) {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, MethodBindings.setFavoritesPtr, NIL)
  }

  public fun getFavorites(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFavoritesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setRecentDirs(dirs: PackedStringArray) {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, MethodBindings.setRecentDirsPtr, NIL)
  }

  public fun getRecentDirs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRecentDirsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setBuiltinActionOverride(name: String, actionsList: VariantArray<InputEvent>) {
    TransferContext.writeArguments(STRING to name, ARRAY to actionsList)
    TransferContext.callMethod(rawPtr, MethodBindings.setBuiltinActionOverridePtr, NIL)
  }

  public fun checkChangedSettingsInGroup(settingPrefix: String): Boolean {
    TransferContext.writeArguments(STRING to settingPrefix)
    TransferContext.callMethod(rawPtr, MethodBindings.checkChangedSettingsInGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getChangedSettings(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChangedSettingsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun markSettingChanged(setting: String) {
    TransferContext.writeArguments(STRING to setting)
    TransferContext.callMethod(rawPtr, MethodBindings.markSettingChangedPtr, NIL)
  }

  public companion object {
    public final const val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Long = 10000
  }

  internal object MethodBindings {
    public val hasSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "has_setting")

    public val setSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_setting")

    public val getSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_setting")

    public val erasePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSettings", "erase")

    public val setInitialValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_initial_value")

    public val addPropertyInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "add_property_info")

    public val setProjectMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_project_metadata")

    public val getProjectMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_project_metadata")

    public val setFavoritesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_favorites")

    public val getFavoritesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_favorites")

    public val setRecentDirsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_recent_dirs")

    public val getRecentDirsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_recent_dirs")

    public val setBuiltinActionOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_builtin_action_override")

    public val checkChangedSettingsInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "check_changed_settings_in_group")

    public val getChangedSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_changed_settings")

    public val markSettingChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "mark_setting_changed")
  }
}
