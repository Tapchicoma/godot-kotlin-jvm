// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public object TextServerManager : Object() {
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_TEXTSERVERMANAGER)
    return false
  }

  public fun addInterface(_interface: TextServer) {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.addInterfacePtr, NIL)
  }

  public fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun removeInterface(_interface: TextServer) {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInterfacePtr, NIL)
  }

  public fun getInterface(idx: Int): TextServer? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  public fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun findInterface(name: String): TextServer? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  public fun setPrimaryInterface(index: TextServer) {
    TransferContext.writeArguments(OBJECT to index)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  public fun getPrimaryInterface(): TextServer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  internal object MethodBindings {
    public val addInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "add_interface")

    public val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface_count")

    public val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "remove_interface")

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface")

    public val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interfaces")

    public val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "find_interface")

    public val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "set_primary_interface")

    public val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_primary_interface")
  }
}
