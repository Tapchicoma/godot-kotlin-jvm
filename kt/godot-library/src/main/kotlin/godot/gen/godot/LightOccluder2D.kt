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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class LightOccluder2D : Node2D() {
  public var occluder: OccluderPolygon2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOccluderPolygonPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOccluderPolygonPtr, NIL)
    }

  public var sdfCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsSdfCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsSdfCollisionPtr, NIL)
    }

  public var occluderLightMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOccluderLightMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOccluderLightMaskPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTOCCLUDER2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_polygon")

    public val getOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_polygon")

    public val setOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_light_mask")

    public val getOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_light_mask")

    public val setAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_as_sdf_collision")

    public val isSetAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "is_set_as_sdf_collision")
  }
}
