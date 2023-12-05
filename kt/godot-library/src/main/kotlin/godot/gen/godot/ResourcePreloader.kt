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
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class ResourcePreloader : Node() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEPRELOADER, scriptIndex)
    return true
  }

  public fun addResource(name: StringName, resource: Resource) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.addResourcePtr, NIL)
  }

  public fun removeResource(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeResourcePtr, NIL)
  }

  public fun renameResource(name: StringName, newname: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameResourcePtr, NIL)
  }

  public fun hasResource(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasResourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getResource(name: StringName): Resource? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getResourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public fun getResourceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResourceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public companion object

  internal object MethodBindings {
    public val addResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "add_resource")

    public val removeResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "remove_resource")

    public val renameResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "rename_resource")

    public val hasResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "has_resource")

    public val getResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "get_resource")

    public val getResourceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "get_resource_list")
  }
}
