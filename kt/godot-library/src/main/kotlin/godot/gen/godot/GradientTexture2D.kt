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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class GradientTexture2D : Texture2D() {
  public var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
    }

  public var width: Int
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var height: Int
    @JvmName("getHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  public var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingHdrPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHdrPtr, NIL)
    }

  public var fill: Fill
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillPtr, LONG)
      return GradientTexture2D.Fill.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var fillFrom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillFromPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillFromPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var fillTo: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillToPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFillToPtr, NIL)
    }

  public var repeat: Repeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatPtr, LONG)
      return GradientTexture2D.Repeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE2D, scriptIndex)
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
   * val myCoreType = gradienttexture2d.fillFrom
   * //Your changes
   * gradienttexture2d.fillFrom = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fillFromMutate(block: Vector2.() -> Unit): Vector2 = fillFrom.apply{
      block(this)
      fillFrom = this
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
   * val myCoreType = gradienttexture2d.fillTo
   * //Your changes
   * gradienttexture2d.fillTo = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fillToMutate(block: Vector2.() -> Unit): Vector2 = fillTo.apply{
      block(this)
      fillTo = this
  }


  public enum class Fill(
    id: Long,
  ) {
    FILL_LINEAR(0),
    FILL_RADIAL(1),
    FILL_SQUARE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Fill = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Repeat(
    id: Long,
  ) {
    REPEAT_NONE(0),
    REPEAT(1),
    REPEAT_MIRROR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Repeat = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_gradient")

    public val getGradientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_gradient")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "set_width")

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_height")

    public val setUseHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_use_hdr")

    public val isUsingHdrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "is_using_hdr")

    public val setFillPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill")

    public val getFillPtr: VoidPtr = TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill")

    public val setFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_from")

    public val getFillFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_from")

    public val setFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_fill_to")

    public val getFillToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_fill_to")

    public val setRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "set_repeat")

    public val getRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GradientTexture2D", "get_repeat")
  }
}
