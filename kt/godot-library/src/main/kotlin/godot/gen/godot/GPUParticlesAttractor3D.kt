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
public open class GPUParticlesAttractor3D internal constructor() : VisualInstance3D() {
  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  public var attenuation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationPtr, NIL)
    }

  public var directionality: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionalityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionalityPtr, NIL)
    }

  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTOR3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_cull_mask")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_strength")

    public val setAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_attenuation")

    public val getAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_attenuation")

    public val setDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_directionality")

    public val getDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_directionality")
  }
}
