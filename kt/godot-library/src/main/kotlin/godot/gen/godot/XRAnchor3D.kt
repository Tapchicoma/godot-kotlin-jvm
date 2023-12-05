// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class XRAnchor3D : XRNode3D() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRANCHOR3D, scriptIndex)
    return true
  }

  public fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getPlane(): Plane {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlanePtr, PLANE)
    return (TransferContext.readReturnValue(PLANE, false) as Plane)
  }

  public companion object

  internal object MethodBindings {
    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("XRAnchor3D", "get_size")

    public val getPlanePtr: VoidPtr = TypeManager.getMethodBindPtr("XRAnchor3D", "get_plane")
  }
}
