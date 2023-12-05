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
public open class TubeTrailMesh : PrimitiveMesh() {
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  public var radialSteps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialStepsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialStepsPtr, NIL)
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

  public var sectionRings: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionRingsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionRingsPtr, NIL)
    }

  public var capTop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCapTopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCapTopPtr, NIL)
    }

  public var capBottom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCapBottomPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCapBottomPtr, NIL)
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
    callConstructor(ENGINECLASS_TUBETRAILMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radius")

    public val setRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radial_steps")

    public val getRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radial_steps")

    public val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_sections")

    public val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_sections")

    public val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_length")

    public val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_length")

    public val setSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_rings")

    public val getSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_rings")

    public val setCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_top")

    public val isCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_top")

    public val setCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_bottom")

    public val isCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_bottom")

    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "get_curve")
  }
}
