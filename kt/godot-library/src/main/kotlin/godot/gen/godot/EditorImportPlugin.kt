// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorImportPlugin internal constructor() : ResourceImporter() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORIMPORTPLUGIN, scriptIndex)
    return true
  }

  public open fun _getImporterName(): String {
    throw NotImplementedError("_get_importer_name is not implemented for EditorImportPlugin")
  }

  public open fun _getVisibleName(): String {
    throw NotImplementedError("_get_visible_name is not implemented for EditorImportPlugin")
  }

  public open fun _getPresetCount(): Int {
    throw NotImplementedError("_get_preset_count is not implemented for EditorImportPlugin")
  }

  public open fun _getPresetName(presetIndex: Int): String {
    throw NotImplementedError("_get_preset_name is not implemented for EditorImportPlugin")
  }

  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  public open fun _getImportOptions(path: String, presetIndex: Int):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_import_options is not implemented for EditorImportPlugin")
  }

  public open fun _getSaveExtension(): String {
    throw NotImplementedError("_get_save_extension is not implemented for EditorImportPlugin")
  }

  public open fun _getResourceType(): String {
    throw NotImplementedError("_get_resource_type is not implemented for EditorImportPlugin")
  }

  public open fun _getPriority(): Float {
    throw NotImplementedError("_get_priority is not implemented for EditorImportPlugin")
  }

  public open fun _getImportOrder(): Int {
    throw NotImplementedError("_get_import_order is not implemented for EditorImportPlugin")
  }

  public open fun _getOptionVisibility(
    path: String,
    optionName: StringName,
    options: Dictionary<Any?, Any?>,
  ): Boolean {
    throw NotImplementedError("_get_option_visibility is not implemented for EditorImportPlugin")
  }

  public open fun _import(
    sourceFile: String,
    savePath: String,
    options: Dictionary<Any?, Any?>,
    platformVariants: VariantArray<String>,
    genFiles: VariantArray<String>,
  ): GodotError {
    throw NotImplementedError("_import is not implemented for EditorImportPlugin")
  }

  @JvmOverloads
  public fun appendImportExternalResource(
    path: String,
    customOptions: Dictionary<Any?, Any?> = Dictionary(),
    customImporter: String = "",
    generatorParameters: Any? = null,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, DICTIONARY to customOptions, STRING to customImporter, ANY to generatorParameters)
    TransferContext.callMethod(rawPtr, MethodBindings.appendImportExternalResourcePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val _getImporterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_importer_name")

    public val _getVisibleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_visible_name")

    public val _getPresetCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_preset_count")

    public val _getPresetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_preset_name")

    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_recognized_extensions")

    public val _getImportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_import_options")

    public val _getSaveExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_save_extension")

    public val _getResourceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_resource_type")

    public val _getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_priority")

    public val _getImportOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_import_order")

    public val _getOptionVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_option_visibility")

    public val _importPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorImportPlugin", "_import")

    public val appendImportExternalResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "append_import_external_resource")
  }
}
