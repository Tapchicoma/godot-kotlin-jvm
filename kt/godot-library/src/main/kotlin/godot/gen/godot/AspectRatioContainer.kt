// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AspectRatioContainer : Container() {
  public var ratio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
    }

  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return AspectRatioContainer.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
    }

  public var alignmentHorizontal: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentHorizontalPtr, LONG)
      return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentHorizontalPtr, NIL)
    }

  public var alignmentVertical: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentVerticalPtr, LONG)
      return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentVerticalPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASPECTRATIOCONTAINER, scriptIndex)
    return true
  }

  public enum class StretchMode(
    id: Long,
  ) {
    STRETCH_WIDTH_CONTROLS_HEIGHT(0),
    STRETCH_HEIGHT_CONTROLS_WIDTH(1),
    STRETCH_FIT(2),
    STRETCH_COVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StretchMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    ALIGNMENT_BEGIN(0),
    ALIGNMENT_CENTER(1),
    ALIGNMENT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_ratio")

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_ratio")

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_stretch_mode")

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_stretch_mode")

    public val setAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_horizontal")

    public val getAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_horizontal")

    public val setAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_vertical")

    public val getAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_vertical")
  }
}
