// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class DirectionalLight3D : Light3D() {
  public var directionalShadowMode: ShadowMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowModePtr, LONG)
      return DirectionalLight3D.ShadowMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowModePtr, NIL)
    }

  public var directionalShadowBlendSplits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBlendSplitsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendSplitsPtr, NIL)
    }

  public var skyMode: SkyMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyModePtr, LONG)
      return DirectionalLight3D.SkyMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyModePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DIRECTIONALLIGHT3D, scriptIndex)
    return true
  }

  public enum class ShadowMode(
    id: Long,
  ) {
    SHADOW_ORTHOGONAL(0),
    SHADOW_PARALLEL_2_SPLITS(1),
    SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SkyMode(
    id: Long,
  ) {
    SKY_MODE_LIGHT_AND_SKY(0),
    SKY_MODE_LIGHT_ONLY(1),
    SKY_MODE_SKY_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SkyMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_shadow_mode")

    public val getShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "get_shadow_mode")

    public val setBlendSplitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_blend_splits")

    public val isBlendSplitsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "is_blend_splits_enabled")

    public val setSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_sky_mode")

    public val getSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "get_sky_mode")
  }
}
