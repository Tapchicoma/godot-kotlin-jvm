// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class PanoramaSkyMaterial : Material() {
  public var panorama: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanoramaPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPanoramaPtr, NIL)
    }

  public var filter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFilteringEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilteringEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PANORAMASKYMATERIAL, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setPanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "set_panorama")

    public val getPanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "get_panorama")

    public val setFilteringEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "set_filtering_enabled")

    public val isFilteringEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "is_filtering_enabled")
  }
}
