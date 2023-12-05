// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class EditorInspectorPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORINSPECTORPLUGIN, scriptIndex)
    return true
  }

  public open fun _canHandle(_object: Object): Boolean {
    throw NotImplementedError("_can_handle is not implemented for EditorInspectorPlugin")
  }

  public open fun _parseBegin(_object: Object) {
  }

  public open fun _parseCategory(_object: Object, category: String) {
  }

  public open fun _parseGroup(_object: Object, group: String) {
  }

  public open fun _parseProperty(
    _object: Object,
    type: VariantType,
    name: String,
    hintType: PropertyHint,
    hintString: String,
    usageFlags: PropertyUsageFlags,
    wide: Boolean,
  ): Boolean {
    throw NotImplementedError("_parse_property is not implemented for EditorInspectorPlugin")
  }

  public open fun _parseEnd(_object: Object) {
  }

  public fun addCustomControl(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomControlPtr, NIL)
  }

  @JvmOverloads
  public fun addPropertyEditor(
    `property`: String,
    editor: Control,
    addToEnd: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING to property, OBJECT to editor, BOOL to addToEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyEditorPtr, NIL)
  }

  public fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PackedStringArray,
    editor: Control,
  ) {
    TransferContext.writeArguments(STRING to label, PACKED_STRING_ARRAY to properties, OBJECT to editor)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyEditorForMultiplePropertiesPtr,
        NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _canHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_can_handle")

    public val _parseBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_begin")

    public val _parseCategoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_category")

    public val _parseGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_group")

    public val _parsePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_property")

    public val _parseEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_end")

    public val addCustomControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_custom_control")

    public val addPropertyEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_property_editor")

    public val addPropertyEditorForMultiplePropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_property_editor_for_multiple_properties")
  }
}
