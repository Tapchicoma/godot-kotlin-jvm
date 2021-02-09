// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorResourceConversionPlugin : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN)

  open fun _convert(resource: Resource): Resource? {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  open fun _converts_to(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }
}