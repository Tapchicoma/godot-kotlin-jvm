// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class FontVariation : Font() {
  public var baseFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBaseFontPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBaseFontPtr, NIL)
    }

  public var fallbacks: VariantArray<Font>
    @JvmName("getFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFallbacks()
    @JvmName("setFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    set(`value`) {
      super.setFallbacks(value)
    }

  public var variationOpentype: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationOpentypePtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationOpentypePtr, NIL)
    }

  public var variationFaceIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationFaceIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationFaceIndexPtr, NIL)
    }

  public var variationEmbolden: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationEmboldenPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationEmboldenPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var variationTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationTransformPtr, NIL)
    }

  public var opentypeFeatures: Dictionary<Any?, Any?>
    @JvmName("getOpentypeFeatures_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getOpentypeFeatures()
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpentypeFeaturesPtr, NIL)
    }

  public var spacingGlyph: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingGlyph: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  public var spacingSpace: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingSpace: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  public var spacingTop: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property spacingTop: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  public var spacingBottom: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingBottom: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONTVARIATION, scriptIndex)
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
   * val myCoreType = fontvariation.variationTransform
   * //Your changes
   * fontvariation.variationTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun variationTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      variationTransform.apply{
      block(this)
      variationTransform = this
  }


  public companion object

  internal object MethodBindings {
    public val setBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_base_font")

    public val getBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_base_font")

    public val setVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_opentype")

    public val getVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_opentype")

    public val setVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_embolden")

    public val getVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_embolden")

    public val setVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_face_index")

    public val getVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_face_index")

    public val setVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_transform")

    public val getVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_transform")

    public val setOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_opentype_features")

    public val setSpacingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontVariation", "set_spacing")
  }
}
