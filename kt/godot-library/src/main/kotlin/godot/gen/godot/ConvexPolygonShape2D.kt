// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class ConvexPolygonShape2D : Shape2D() {
  public var points: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointsPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPointsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE2D, scriptIndex)
    return true
  }

  public fun setPointCloud(pointCloud: PackedVector2Array) {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to pointCloud)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointCloudPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setPointCloudPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape2D", "set_point_cloud")

    public val setPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape2D", "set_points")

    public val getPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape2D", "get_points")
  }
}
