// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class ConcavePolygonShape3D : Shape3D() {
  public var `data`: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFacesPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFacesPtr, NIL)
    }

  public var backfaceCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBackfaceCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackfaceCollisionEnabledPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "set_faces")

    public val getFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "get_faces")

    public val setBackfaceCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "set_backface_collision_enabled")

    public val isBackfaceCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "is_backface_collision_enabled")
  }
}
