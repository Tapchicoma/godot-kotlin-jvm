// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.Vector3
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
public open class SpriteBase3D internal constructor() : GeometryInstance3D() {
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

  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  public var pixelSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPixelSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPixelSizePtr, NIL)
    }

  public var axis: Vector3.Axis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, LONG)
      return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisPtr, NIL)
    }

  public var billboard: BaseMaterial3D.BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
    }

  public var transparent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  public var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  public var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  public var alphaCut: AlphaCutMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaCutModePtr, LONG)
      return SpriteBase3D.AlphaCutMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaCutModePtr, NIL)
    }

  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
    }

  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
    }

  public var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
    }

  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
    }

  public var textureFilter: BaseMaterial3D.TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITEBASE3D, scriptIndex)
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
   * val myCoreType = spritebase3d.offset
   * //Your changes
   * spritebase3d.offset = myCoreType
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
   * val myCoreType = spritebase3d.modulate
   * //Your changes
   * spritebase3d.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  public fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?)
  }

  public enum class DrawFlags(
    id: Long,
  ) {
    FLAG_TRANSPARENT(0),
    FLAG_SHADED(1),
    FLAG_DOUBLE_SIDED(2),
    FLAG_DISABLE_DEPTH_TEST(3),
    FLAG_FIXED_SIZE(4),
    FLAG_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class AlphaCutMode(
    id: Long,
  ) {
    ALPHA_CUT_DISABLED(0),
    ALPHA_CUT_DISCARD(1),
    ALPHA_CUT_OPAQUE_PREPASS(2),
    ALPHA_CUT_HASH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaCutMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_centered")

    public val isCenteredPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_centered")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "get_offset")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_h")

    public val isFlippedHPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_v")

    public val isFlippedVPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_v")

    public val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_modulate")

    public val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_modulate")

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_render_priority")

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_render_priority")

    public val setPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_pixel_size")

    public val getPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_pixel_size")

    public val setAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_axis")

    public val getAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "get_axis")

    public val setDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_draw_flag")

    public val getDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_draw_flag")

    public val setAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_cut_mode")

    public val getAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_cut_mode")

    public val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_scissor_threshold")

    public val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_scissor_threshold")

    public val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_hash_scale")

    public val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_hash_scale")

    public val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing")

    public val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing")

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing_edge")

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing_edge")

    public val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_billboard_mode")

    public val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_billboard_mode")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_texture_filter")

    public val getItemRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_item_rect")

    public val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "generate_triangle_mesh")
  }
}
