// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class PathFollow2D : Node2D() {
  public var progress: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressPtr, NIL)
    }

  public var progressRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressRatioPtr, NIL)
    }

  public var hOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
    }

  public var vOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
    }

  public var rotates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRotatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotatesPtr, NIL)
    }

  public var cubicInterp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCubicInterpolationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCubicInterpolationPtr, NIL)
    }

  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PATHFOLLOW2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress")

    public val getProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress")

    public val setHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_h_offset")

    public val getHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "get_h_offset")

    public val setVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_v_offset")

    public val getVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "get_v_offset")

    public val setProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress_ratio")

    public val getProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress_ratio")

    public val setRotatesPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_rotates")

    public val isRotatingPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "is_rotating")

    public val setCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_cubic_interpolation")

    public val getCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_cubic_interpolation")

    public val setLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_loop")

    public val hasLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "has_loop")
  }
}
