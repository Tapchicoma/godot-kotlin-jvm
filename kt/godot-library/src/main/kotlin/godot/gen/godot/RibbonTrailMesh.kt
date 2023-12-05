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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class RibbonTrailMesh : PrimitiveMesh() {
  public var shape: Shape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, LONG)
      return RibbonTrailMesh.Shape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public var sections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionsPtr, NIL)
    }

  public var sectionLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionLengthPtr, NIL)
    }

  public var sectionSegments: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionSegmentsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionSegmentsPtr, NIL)
    }

  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RIBBONTRAILMESH, scriptIndex)
    return true
  }

  public enum class Shape(
    id: Long,
  ) {
    SHAPE_FLAT(0),
    SHAPE_CROSS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Shape = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_size")

    public val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_sections")

    public val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_sections")

    public val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_length")

    public val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_length")

    public val setSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_segments")

    public val getSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_segments")

    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_curve")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_shape")
  }
}
