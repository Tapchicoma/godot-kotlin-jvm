// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ParallaxLayer : Node2D() {
  @CoreTypeLocalCopy
  public var motionScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var motionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionOffsetPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var motionMirroring: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMirroringPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMirroringPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARALLAXLAYER, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionScale
   * //Your changes
   * parallaxlayer.motionScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionScaleMutate(block: Vector2.() -> Unit): Vector2 = motionScale.apply{
      block(this)
      motionScale = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionOffset
   * //Your changes
   * parallaxlayer.motionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionOffsetMutate(block: Vector2.() -> Unit): Vector2 = motionOffset.apply{
      block(this)
      motionOffset = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionMirroring
   * //Your changes
   * parallaxlayer.motionMirroring = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMirroringMutate(block: Vector2.() -> Unit): Vector2 = motionMirroring.apply{
      block(this)
      motionMirroring = this
  }


  public companion object

  internal object MethodBindings {
    public val setMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_motion_scale")

    public val getMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_motion_scale")

    public val setMotionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_motion_offset")

    public val getMotionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_motion_offset")

    public val setMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_mirroring")

    public val getMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_mirroring")
  }
}
