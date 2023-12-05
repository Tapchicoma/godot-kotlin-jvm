// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class GradientTexture1D : Texture2D() {
  public var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
    }

  public var width: Int
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingHdrPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHdrPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE1D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "set_gradient")

    public val getGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "get_gradient")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture1D", "set_width")

    public val setUseHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "set_use_hdr")

    public val isUsingHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture1D", "is_using_hdr")
  }
}
