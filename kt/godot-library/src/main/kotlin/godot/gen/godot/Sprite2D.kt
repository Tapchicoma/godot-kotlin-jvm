// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class Sprite2D : Node2D() {
  public val frameChanged: Signal0 by signal()

  public val textureChanged: Signal0 by signal()

  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  public var hframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHframesPtr, NIL)
    }

  public var vframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVframesPtr, NIL)
    }

  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var frameCoords: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrameCoordsPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrameCoordsPtr, NIL)
    }

  public var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRegionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionEnabledPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionRectPtr, NIL)
    }

  public var regionFilterClipEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRegionFilterClipEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionFilterClipEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITE2D, scriptIndex)
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
   * val myCoreType = sprite2d.offset
   * //Your changes
   * sprite2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
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
   * val myCoreType = sprite2d.frameCoords
   * //Your changes
   * sprite2d.frameCoords = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun frameCoordsMutate(block: Vector2i.() -> Unit): Vector2i = frameCoords.apply{
      block(this)
      frameCoords = this
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
   * val myCoreType = sprite2d.regionRect
   * //Your changes
   * sprite2d.regionRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
  }


  public fun isPixelOpaque(pos: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, MethodBindings.isPixelOpaquePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_texture")

    public val setCenteredPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_centered")

    public val isCenteredPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "is_centered")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_offset")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_flip_h")

    public val isFlippedHPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_flip_v")

    public val isFlippedVPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "is_flipped_v")

    public val setRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_enabled")

    public val isRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_region_enabled")

    public val isPixelOpaquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_pixel_opaque")

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_rect")

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_region_rect")

    public val setRegionFilterClipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_filter_clip_enabled")

    public val isRegionFilterClipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_region_filter_clip_enabled")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_frame")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_frame")

    public val setFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_frame_coords")

    public val getFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_frame_coords")

    public val setVframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_vframes")

    public val getVframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_vframes")

    public val setHframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "set_hframes")

    public val getHframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_hframes")

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite2D", "get_rect")
  }
}
