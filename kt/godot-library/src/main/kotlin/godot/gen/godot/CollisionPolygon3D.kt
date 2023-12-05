// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class CollisionPolygon3D : Node3D() {
  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
    }

  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_depth")

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_depth")

    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_polygon")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_polygon")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "is_disabled")

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_margin")

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_margin")
  }
}
