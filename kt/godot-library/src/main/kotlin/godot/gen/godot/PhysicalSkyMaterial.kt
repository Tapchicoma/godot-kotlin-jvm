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
public open class PhysicalSkyMaterial : Material() {
  public var rayleighCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRayleighCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRayleighCoefficientPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var rayleighColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRayleighColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRayleighColorPtr, NIL)
    }

  public var mieCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMieCoefficientPtr, NIL)
    }

  public var mieEccentricity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieEccentricityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMieEccentricityPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var mieColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMieColorPtr, NIL)
    }

  public var turbidity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbidityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbidityPtr, NIL)
    }

  public var sunDiskScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSunDiskScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSunDiskScalePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var groundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundColorPtr, NIL)
    }

  public var energyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnergyMultiplierPtr, NIL)
    }

  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseDebandingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDebandingPtr, NIL)
    }

  public var nightSky: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNightSkyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNightSkyPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICALSKYMATERIAL, scriptIndex)
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
   * val myCoreType = physicalskymaterial.rayleighColor
   * //Your changes
   * physicalskymaterial.rayleighColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rayleighColorMutate(block: Color.() -> Unit): Color = rayleighColor.apply{
      block(this)
      rayleighColor = this
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
   * val myCoreType = physicalskymaterial.mieColor
   * //Your changes
   * physicalskymaterial.mieColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun mieColorMutate(block: Color.() -> Unit): Color = mieColor.apply{
      block(this)
      mieColor = this
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
   * val myCoreType = physicalskymaterial.groundColor
   * //Your changes
   * physicalskymaterial.groundColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun groundColorMutate(block: Color.() -> Unit): Color = groundColor.apply{
      block(this)
      groundColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setRayleighCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_rayleigh_coefficient")

    public val getRayleighCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_rayleigh_coefficient")

    public val setRayleighColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_rayleigh_color")

    public val getRayleighColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_rayleigh_color")

    public val setMieCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_coefficient")

    public val getMieCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_coefficient")

    public val setMieEccentricityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_eccentricity")

    public val getMieEccentricityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_eccentricity")

    public val setMieColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_color")

    public val getMieColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_color")

    public val setTurbidityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_turbidity")

    public val getTurbidityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_turbidity")

    public val setSunDiskScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_sun_disk_scale")

    public val getSunDiskScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_sun_disk_scale")

    public val setGroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_ground_color")

    public val getGroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_ground_color")

    public val setEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_energy_multiplier")

    public val getEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_energy_multiplier")

    public val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_use_debanding")

    public val getUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_use_debanding")

    public val setNightSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_night_sky")

    public val getNightSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_night_sky")
  }
}
