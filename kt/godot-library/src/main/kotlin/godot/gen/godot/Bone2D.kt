// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class Bone2D : Node2D() {
  @CoreTypeLocalCopy
  public var rest: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRestPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRestPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONE2D, scriptIndex)
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
   * val myCoreType = bone2d.rest
   * //Your changes
   * bone2d.rest = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun restMutate(block: Transform2D.() -> Unit): Transform2D = rest.apply{
      block(this)
      rest = this
  }


  public fun applyRest() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyRestPtr, NIL)
  }

  public fun getSkeletonRest(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonRestPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getIndexInSkeleton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexInSkeletonPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setAutocalculateLengthAndAngle(autoCalculate: Boolean) {
    TransferContext.writeArguments(BOOL to autoCalculate)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutocalculateLengthAndAnglePtr, NIL)
  }

  public fun getAutocalculateLengthAndAngle(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutocalculateLengthAndAnglePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLength(length: Float) {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  public fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBoneAngle(angle: Float) {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneAnglePtr, NIL)
  }

  public fun getBoneAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "set_rest")

    public val getRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "get_rest")

    public val applyRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "apply_rest")

    public val getSkeletonRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Bone2D", "get_skeleton_rest")

    public val getIndexInSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Bone2D", "get_index_in_skeleton")

    public val setAutocalculateLengthAndAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Bone2D", "set_autocalculate_length_and_angle")

    public val getAutocalculateLengthAndAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Bone2D", "get_autocalculate_length_and_angle")

    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "get_length")

    public val setBoneAnglePtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "set_bone_angle")

    public val getBoneAnglePtr: VoidPtr = TypeManager.getMethodBindPtr("Bone2D", "get_bone_angle")
  }
}
