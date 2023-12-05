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
public open class CollisionShape3D : Node3D() {
  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONSHAPE3D, scriptIndex)
    return true
  }

  public fun resourceChanged(resource: Resource) {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.resourceChangedPtr, NIL)
  }

  public fun makeConvexFromSiblings() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeConvexFromSiblingsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val resourceChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "resource_changed")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape3D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape3D", "get_shape")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "is_disabled")

    public val makeConvexFromSiblingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "make_convex_from_siblings")
  }
}
