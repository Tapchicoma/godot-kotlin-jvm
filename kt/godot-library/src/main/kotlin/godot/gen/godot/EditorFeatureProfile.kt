// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorFeatureProfile internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFEATUREPROFILE, scriptIndex)
    return true
  }

  public fun setDisableClass(className: StringName, disable: Boolean) {
    TransferContext.writeArguments(STRING_NAME to className, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassPtr, NIL)
  }

  public fun isClassDisabled(className: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDisableClassEditor(className: StringName, disable: Boolean) {
    TransferContext.writeArguments(STRING_NAME to className, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassEditorPtr, NIL)
  }

  public fun isClassEditorDisabled(className: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassEditorDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDisableClassProperty(
    className: StringName,
    `property`: StringName,
    disable: Boolean,
  ) {
    TransferContext.writeArguments(STRING_NAME to className, STRING_NAME to property, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassPropertyPtr, NIL)
  }

  public fun isClassPropertyDisabled(className: StringName, `property`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassPropertyDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDisableFeature(feature: Feature, disable: Boolean) {
    TransferContext.writeArguments(LONG to feature.id, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableFeaturePtr, NIL)
  }

  public fun isFeatureDisabled(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isFeatureDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getFeatureName(feature: Feature): String {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFeatureNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun saveToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.saveToFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadFromFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Feature(
    id: Long,
  ) {
    FEATURE_3D(0),
    FEATURE_SCRIPT(1),
    FEATURE_ASSET_LIB(2),
    FEATURE_SCENE_TREE(3),
    FEATURE_NODE_DOCK(4),
    FEATURE_FILESYSTEM_DOCK(5),
    FEATURE_IMPORT_DOCK(6),
    FEATURE_HISTORY_DOCK(7),
    FEATURE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDisableClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class")

    public val isClassDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_disabled")

    public val setDisableClassEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class_editor")

    public val isClassEditorDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_editor_disabled")

    public val setDisableClassPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class_property")

    public val isClassPropertyDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_property_disabled")

    public val setDisableFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_feature")

    public val isFeatureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_feature_disabled")

    public val getFeatureNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "get_feature_name")

    public val saveToFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "save_to_file")

    public val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "load_from_file")
  }
}
