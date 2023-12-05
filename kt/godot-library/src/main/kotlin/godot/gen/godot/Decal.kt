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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
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
public open class Decal : VisualInstance3D() {
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public var textureAlbedo: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var textureNormal: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var textureOrm: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var textureEmission: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public var emissionEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionEnergyPtr, NIL)
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

  public var albedoMix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlbedoMixPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlbedoMixPtr, NIL)
    }

  public var normalFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalFadePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalFadePtr, NIL)
    }

  public var upperFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpperFadePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUpperFadePtr, NIL)
    }

  public var lowerFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLowerFadePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLowerFadePtr, NIL)
    }

  public var distanceFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDistanceFadeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDistanceFadePtr, NIL)
    }

  public var distanceFadeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeBeginPtr, NIL)
    }

  public var distanceFadeLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistanceFadeLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistanceFadeLengthPtr, NIL)
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
    callConstructor(ENGINECLASS_DECAL, scriptIndex)
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
   * val myCoreType = decal.size
   * //Your changes
   * decal.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
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
   * val myCoreType = decal.modulate
   * //Your changes
   * decal.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  public enum class DecalTexture(
    id: Long,
  ) {
    TEXTURE_ALBEDO(0),
    TEXTURE_NORMAL(1),
    TEXTURE_ORM(2),
    TEXTURE_EMISSION(3),
    TEXTURE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DecalTexture = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_size")

    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_texture")

    public val setEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "set_emission_energy")

    public val getEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "get_emission_energy")

    public val setAlbedoMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_albedo_mix")

    public val getAlbedoMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_albedo_mix")

    public val setModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_modulate")

    public val getModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_modulate")

    public val setUpperFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_upper_fade")

    public val getUpperFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_upper_fade")

    public val setLowerFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_lower_fade")

    public val getLowerFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_lower_fade")

    public val setNormalFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_normal_fade")

    public val getNormalFadePtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_normal_fade")

    public val setEnableDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "set_enable_distance_fade")

    public val isDistanceFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "is_distance_fade_enabled")

    public val setDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "set_distance_fade_begin")

    public val getDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "get_distance_fade_begin")

    public val setDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "set_distance_fade_length")

    public val getDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Decal", "get_distance_fade_length")

    public val setCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Decal", "get_cull_mask")
  }
}
