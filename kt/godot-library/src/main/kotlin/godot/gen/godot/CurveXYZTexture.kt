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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class CurveXYZTexture : Texture2D() {
  public var width: Int
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var curveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveXPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveXPtr, NIL)
    }

  public var curveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveYPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveYPtr, NIL)
    }

  public var curveZ: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveZPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveZPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVEXYZTEXTURE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("CurveXYZTexture", "set_width")

    public val setCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_x")

    public val getCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_x")

    public val setCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_y")

    public val getCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_y")

    public val setCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_z")

    public val getCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_z")
  }
}
