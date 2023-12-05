// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class ConvexPolygonShape3D : Shape3D() {
  public var points: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointsPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPointsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape3D", "set_points")

    public val getPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape3D", "get_points")
  }
}
