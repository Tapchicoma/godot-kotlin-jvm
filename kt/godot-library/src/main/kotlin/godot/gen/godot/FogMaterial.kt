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
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class FogMaterial : Material() {
  public var density: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDensityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var albedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlbedoPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlbedoPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPtr, NIL)
    }

  public var heightFalloff: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightFalloffPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightFalloffPtr, NIL)
    }

  public var edgeFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEdgeFadePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEdgeFadePtr, NIL)
    }

  public var densityTexture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDensityTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDensityTexturePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FOGMATERIAL, scriptIndex)
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
   * val myCoreType = fogmaterial.albedo
   * //Your changes
   * fogmaterial.albedo = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun albedoMutate(block: Color.() -> Unit): Color = albedo.apply{
      block(this)
      albedo = this
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
   * val myCoreType = fogmaterial.emission
   * //Your changes
   * fogmaterial.emission = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionMutate(block: Color.() -> Unit): Color = emission.apply{
      block(this)
      emission = this
  }


  public companion object

  internal object MethodBindings {
    public val setDensityPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "set_density")

    public val getDensityPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "get_density")

    public val setAlbedoPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "set_albedo")

    public val getAlbedoPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "get_albedo")

    public val setEmissionPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "set_emission")

    public val getEmissionPtr: VoidPtr = TypeManager.getMethodBindPtr("FogMaterial", "get_emission")

    public val setHeightFalloffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_height_falloff")

    public val getHeightFalloffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_height_falloff")

    public val setEdgeFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_edge_fade")

    public val getEdgeFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_edge_fade")

    public val setDensityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_density_texture")

    public val getDensityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_density_texture")
  }
}
