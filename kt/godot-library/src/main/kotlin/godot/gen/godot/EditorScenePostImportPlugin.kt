// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType
import godot.core.VariantType.ANY
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
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorScenePostImportPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORTPLUGIN, scriptIndex)
    return true
  }

  public open fun _getInternalImportOptions(category: Int) {
  }

  public open fun _getInternalOptionVisibility(
    category: Int,
    forAnimation: Boolean,
    option: String,
  ): Any? {
    throw NotImplementedError("_get_internal_option_visibility is not implemented for EditorScenePostImportPlugin")
  }

  public open fun _getInternalOptionUpdateViewRequired(category: Int, option: String): Any? {
    throw NotImplementedError("_get_internal_option_update_view_required is not implemented for EditorScenePostImportPlugin")
  }

  public open fun _internalProcess(
    category: Int,
    baseNode: Node,
    node: Node,
    resource: Resource,
  ) {
  }

  public open fun _getImportOptions(path: String) {
  }

  public open fun _getOptionVisibility(
    path: String,
    forAnimation: Boolean,
    option: String,
  ): Any? {
    throw NotImplementedError("_get_option_visibility is not implemented for EditorScenePostImportPlugin")
  }

  public open fun _preProcess(scene: Node) {
  }

  public open fun _postProcess(scene: Node) {
  }

  public fun getOptionValue(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getOptionValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun addImportOption(name: String, `value`: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addImportOptionPtr, NIL)
  }

  @JvmOverloads
  public fun addImportOptionAdvanced(
    type: VariantType,
    name: String,
    defaultValue: Any?,
    hint: PropertyHint = PropertyHint.PROPERTY_HINT_NONE,
    hintString: String = "",
    usageFlags: Int = 6,
  ) {
    TransferContext.writeArguments(LONG to type.id, STRING to name, ANY to defaultValue, LONG to hint.id, STRING to hintString, LONG to usageFlags.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addImportOptionAdvancedPtr, NIL)
  }

  public enum class InternalImportCategory(
    id: Long,
  ) {
    INTERNAL_IMPORT_CATEGORY_NODE(0),
    INTERNAL_IMPORT_CATEGORY_MESH_3D_NODE(1),
    INTERNAL_IMPORT_CATEGORY_MESH(2),
    INTERNAL_IMPORT_CATEGORY_MATERIAL(3),
    INTERNAL_IMPORT_CATEGORY_ANIMATION(4),
    INTERNAL_IMPORT_CATEGORY_ANIMATION_NODE(5),
    INTERNAL_IMPORT_CATEGORY_SKELETON_3D_NODE(6),
    INTERNAL_IMPORT_CATEGORY_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InternalImportCategory = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getInternalImportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_get_internal_import_options")

    public val _getInternalOptionVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_get_internal_option_visibility")

    public val _getInternalOptionUpdateViewRequiredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_get_internal_option_update_view_required")

    public val _internalProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_internal_process")

    public val _getImportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_get_import_options")

    public val _getOptionVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_get_option_visibility")

    public val _preProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_pre_process")

    public val _postProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "_post_process")

    public val getOptionValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "get_option_value")

    public val addImportOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "add_import_option")

    public val addImportOptionAdvancedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorScenePostImportPlugin", "add_import_option_advanced")
  }
}
