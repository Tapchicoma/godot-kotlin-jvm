// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal4
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
public open class EditorProperty internal constructor() : Container() {
  public val propertyChanged: Signal4<StringName, Any?, StringName, Boolean> by signal("property",
      "value", "field", "changing")

  public val multiplePropertiesChanged: Signal2<PackedStringArray, VariantArray<Any?>> by
      signal("properties", "value")

  public val propertyKeyed: Signal1<StringName> by signal("property")

  public val propertyDeleted: Signal1<StringName> by signal("property")

  public val propertyKeyedWithValue: Signal2<StringName, Any?> by signal("property", "value")

  public val propertyChecked: Signal2<StringName, Boolean> by signal("property", "checked")

  public val propertyPinned: Signal2<StringName, Boolean> by signal("property", "pinned")

  public val propertyCanRevertChanged: Signal2<StringName, Boolean> by signal("property",
      "canRevert")

  public val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  public val objectIdSelected: Signal2<StringName, Long> by signal("property", "id")

  public val selected: Signal2<String, Long> by signal("path", "focusableIdx")

  public var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLabelPtr, NIL)
    }

  public var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isReadOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReadOnlyPtr, NIL)
    }

  public var checkable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCheckablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCheckablePtr, NIL)
    }

  public var checked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCheckedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCheckedPtr, NIL)
    }

  public var drawWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawWarningPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawWarningPtr, NIL)
    }

  public var keying: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isKeyingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeyingPtr, NIL)
    }

  public var deletable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeletablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeletablePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPROPERTY, scriptIndex)
    return true
  }

  public open fun _updateProperty() {
  }

  public open fun _setReadOnly(readOnly: Boolean) {
  }

  public fun getEditedProperty(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedPropertyPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun getEditedObject(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun updateProperty() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updatePropertyPtr, NIL)
  }

  public fun addFocusable(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addFocusablePtr, NIL)
  }

  public fun setBottomEditor(editor: Control) {
    TransferContext.writeArguments(OBJECT to editor)
    TransferContext.callMethod(rawPtr, MethodBindings.setBottomEditorPtr, NIL)
  }

  @JvmOverloads
  public fun emitChanged(
    `property`: StringName,
    `value`: Any?,
    `field`: StringName = StringName(""),
    changing: Boolean = false,
  ) {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value, STRING_NAME to field, BOOL to changing)
    TransferContext.callMethod(rawPtr, MethodBindings.emitChangedPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _updatePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "_update_property")

    public val _setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "_set_read_only")

    public val setLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "set_label")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "get_label")

    public val setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_read_only")

    public val isReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_read_only")

    public val setCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_checkable")

    public val isCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_checkable")

    public val setCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_checked")

    public val isCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "is_checked")

    public val setDrawWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_draw_warning")

    public val isDrawWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_draw_warning")

    public val setKeyingPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "set_keying")

    public val isKeyingPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "is_keying")

    public val setDeletablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_deletable")

    public val isDeletablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_deletable")

    public val getEditedPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "get_edited_property")

    public val getEditedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "get_edited_object")

    public val updatePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "update_property")

    public val addFocusablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "add_focusable")

    public val setBottomEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_bottom_editor")

    public val emitChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "emit_changed")
  }
}
