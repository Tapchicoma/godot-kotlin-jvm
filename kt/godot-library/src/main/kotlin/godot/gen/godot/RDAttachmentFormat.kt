// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class RDAttachmentFormat : RefCounted() {
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
      return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
    }

  public var samples: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSamplesPtr, LONG)
      return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplesPtr, NIL)
    }

  public var usageFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUsageFlagsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUsageFlagsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDATTACHMENTFORMAT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_format")

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_format")

    public val setSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_samples")

    public val getSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_samples")

    public val setUsageFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_usage_flags")

    public val getUsageFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_usage_flags")
  }
}
