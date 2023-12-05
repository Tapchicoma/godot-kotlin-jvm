// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class InstancePlaceholder internal constructor() : Node() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INSTANCEPLACEHOLDER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun getStoredValues(withOrder: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to withOrder)
    TransferContext.callMethod(rawPtr, MethodBindings.getStoredValuesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun createInstance(replace: Boolean = false, customScene: PackedScene? = null): Node? {
    TransferContext.writeArguments(BOOL to replace, OBJECT to customScene)
    TransferContext.callMethod(rawPtr, MethodBindings.createInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun getInstancePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInstancePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getStoredValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InstancePlaceholder", "get_stored_values")

    public val createInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InstancePlaceholder", "create_instance")

    public val getInstancePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InstancePlaceholder", "get_instance_path")
  }
}
