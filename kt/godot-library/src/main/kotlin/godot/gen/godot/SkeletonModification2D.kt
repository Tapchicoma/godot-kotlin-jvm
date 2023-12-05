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
public open class SkeletonModification2D : Resource() {
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  public var executionMode: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExecutionModePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setExecutionModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2D, scriptIndex)
    return true
  }

  public open fun _execute(delta: Double) {
  }

  public open fun _setupModification(modificationStack: SkeletonModificationStack2D) {
  }

  public open fun _drawEditorGizmo() {
  }

  public fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?)
  }

  public fun setIsSetup(isSetup: Boolean) {
    TransferContext.writeArguments(BOOL to isSetup)
    TransferContext.callMethod(rawPtr, MethodBindings.setIsSetupPtr, NIL)
  }

  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun clampAngle(
    angle: Float,
    min: Float,
    max: Float,
    invert: Boolean,
  ): Float {
    TransferContext.writeArguments(DOUBLE to angle.toDouble(), DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.clampAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setEditorDrawGizmo(drawGizmo: Boolean) {
    TransferContext.writeArguments(BOOL to drawGizmo)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditorDrawGizmoPtr, NIL)
  }

  public fun getEditorDrawGizmo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorDrawGizmoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val _executePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_execute")

    public val _setupModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_setup_modification")

    public val _drawEditorGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_draw_editor_gizmo")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_enabled")

    public val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_enabled")

    public val getModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_modification_stack")

    public val setIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_is_setup")

    public val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_is_setup")

    public val setExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_execution_mode")

    public val getExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_execution_mode")

    public val clampAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "clamp_angle")

    public val setEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_editor_draw_gizmo")

    public val getEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_editor_draw_gizmo")
  }
}
