// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SoftBody3D : MeshInstance3D() {
  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
    }

  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  public var parentCollisionIgnore: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParentCollisionIgnorePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParentCollisionIgnorePtr, NIL)
    }

  public var simulationPrecision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSimulationPrecisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSimulationPrecisionPtr, NIL)
    }

  public var totalMass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTotalMassPtr, NIL)
    }

  public var linearStiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearStiffnessPtr, NIL)
    }

  public var pressureCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressureCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressureCoefficientPtr, NIL)
    }

  public var dampingCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingCoefficientPtr, NIL)
    }

  public var dragCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragCoefficientPtr, NIL)
    }

  public var rayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRayPickablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRayPickablePtr, NIL)
    }

  public var disableMode: DisableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
      return SoftBody3D.DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SOFTBODY3D, scriptIndex)
    return true
  }

  public fun getPhysicsRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody3D>)
  }

  public fun addCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  public fun removeCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public fun getPointTransform(pointIndex: Int): Vector3 {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointTransformPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  @JvmOverloads
  public fun setPointPinned(
    pointIndex: Int,
    pinned: Boolean,
    attachmentPath: NodePath = NodePath(""),
  ) {
    TransferContext.writeArguments(LONG to pointIndex.toLong(), BOOL to pinned, NODE_PATH to attachmentPath)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPinnedPtr, NIL)
  }

  public fun isPointPinned(pointIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isPointPinnedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class DisableMode(
    id: Long,
  ) {
    DISABLE_MODE_REMOVE(0),
    DISABLE_MODE_KEEP_ACTIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DisableMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPhysicsRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_physics_rid")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask")

    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask_value")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer_value")

    public val setParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_parent_collision_ignore")

    public val getParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_parent_collision_ignore")

    public val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_disable_mode")

    public val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_disable_mode")

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_exceptions")

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "add_collision_exception_with")

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "remove_collision_exception_with")

    public val setSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_simulation_precision")

    public val getSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_simulation_precision")

    public val setTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_total_mass")

    public val getTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_total_mass")

    public val setLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_linear_stiffness")

    public val getLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_linear_stiffness")

    public val setPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_pressure_coefficient")

    public val getPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_pressure_coefficient")

    public val setDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_damping_coefficient")

    public val getDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_damping_coefficient")

    public val setDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_drag_coefficient")

    public val getDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_drag_coefficient")

    public val getPointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_point_transform")

    public val setPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_point_pinned")

    public val isPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_point_pinned")

    public val setRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_ray_pickable")

    public val isRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_ray_pickable")
  }
}
