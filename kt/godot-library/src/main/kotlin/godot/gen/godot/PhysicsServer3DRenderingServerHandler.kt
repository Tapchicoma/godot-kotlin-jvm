// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class PhysicsServer3DRenderingServerHandler : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER, scriptIndex)
    return true
  }

  public open fun _setAabb(aabb: AABB) {
  }

  public companion object

  internal object MethodBindings {
    public val _setVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_vertex")

    public val _setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_normal")

    public val _setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_aabb")
  }
}
