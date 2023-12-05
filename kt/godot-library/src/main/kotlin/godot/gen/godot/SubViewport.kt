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
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class SubViewport : Viewport() {
  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var size2dOverride: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSize2dOverridePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSize2dOverridePtr, NIL)
    }

  public var size2dOverrideStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSize2dOverrideStretchEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSize2dOverrideStretchPtr, NIL)
    }

  public var renderTargetClearMode: ClearMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClearModePtr, LONG)
      return SubViewport.ClearMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setClearModePtr, NIL)
    }

  public var renderTargetUpdateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return SubViewport.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SUBVIEWPORT, scriptIndex)
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
   * val myCoreType = subviewport.size
   * //Your changes
   * subviewport.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
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
   * val myCoreType = subviewport.size2dOverride
   * //Your changes
   * subviewport.size2dOverride = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun size2dOverrideMutate(block: Vector2i.() -> Unit): Vector2i = size2dOverride.apply{
      block(this)
      size2dOverride = this
  }


  public enum class ClearMode(
    id: Long,
  ) {
    CLEAR_MODE_ALWAYS(0),
    CLEAR_MODE_NEVER(1),
    CLEAR_MODE_ONCE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ClearMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    UPDATE_DISABLED(0),
    UPDATE_ONCE(1),
    UPDATE_WHEN_VISIBLE(2),
    UPDATE_WHEN_PARENT_VISIBLE(3),
    UPDATE_ALWAYS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UpdateMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SubViewport", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SubViewport", "get_size")

    public val setSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override")

    public val getSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_size_2d_override")

    public val setSize2dOverrideStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override_stretch")

    public val isSize2dOverrideStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "is_size_2d_override_stretch_enabled")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_update_mode")

    public val setClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_clear_mode")

    public val getClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_clear_mode")
  }
}
