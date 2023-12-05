// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorResourcePicker internal constructor() : HBoxContainer() {
  public val resourceSelected: Signal2<Resource, Boolean> by signal("resource", "inspect")

  public val resourceChanged: Signal1<Resource> by signal("resource")

  public var baseType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBaseTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBaseTypePtr, NIL)
    }

  public var editedResource: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditedResourcePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditedResourcePtr, NIL)
    }

  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  public var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isToggleModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setToggleModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCEPICKER, scriptIndex)
    return true
  }

  public open fun _setCreateOptions(menuNode: Object) {
  }

  public open fun _handleMenuSelected(id: Int): Boolean {
    throw NotImplementedError("_handle_menu_selected is not implemented for EditorResourcePicker")
  }

  public fun getAllowedTypes(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowedTypesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setTogglePressed(pressed: Boolean) {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setTogglePressedPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _setCreateOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "_set_create_options")

    public val _handleMenuSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "_handle_menu_selected")

    public val setBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_base_type")

    public val getBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_base_type")

    public val getAllowedTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_allowed_types")

    public val setEditedResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_edited_resource")

    public val getEditedResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_edited_resource")

    public val setToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_toggle_mode")

    public val isToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "is_toggle_mode")

    public val setTogglePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_toggle_pressed")

    public val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_editable")

    public val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "is_editable")
  }
}
