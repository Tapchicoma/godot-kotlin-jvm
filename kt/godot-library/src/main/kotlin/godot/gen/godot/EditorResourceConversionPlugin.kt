// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorResourceConversionPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN, scriptIndex)
    return true
  }

  public open fun _convertsTo(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }

  public open fun _handles(resource: Resource): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourceConversionPlugin")
  }

  public open fun _convert(resource: Resource): Resource? {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  public companion object

  internal object MethodBindings {
    public val _convertsToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceConversionPlugin", "_converts_to")

    public val _handlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceConversionPlugin", "_handles")

    public val _convertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceConversionPlugin", "_convert")
  }
}
