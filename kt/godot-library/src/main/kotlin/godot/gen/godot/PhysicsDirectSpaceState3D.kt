// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PhysicsDirectSpaceState3D internal constructor() : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE3D, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun intersectPoint(parameters: PhysicsPointQueryParameters3D, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.intersectPointPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun intersectRay(parameters: PhysicsRayQueryParameters3D): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectRayPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun intersectShape(parameters: PhysicsShapeQueryParameters3D, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.intersectShapePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun castMotion(parameters: PhysicsShapeQueryParameters3D): PackedFloat32Array {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(rawPtr, MethodBindings.castMotionPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  @JvmOverloads
  public fun collideShape(parameters: PhysicsShapeQueryParameters3D, maxResults: Int = 32):
      VariantArray<Vector3> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.collideShapePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3>)
  }

  public fun getRestInfo(parameters: PhysicsShapeQueryParameters3D): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(rawPtr, MethodBindings.getRestInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val intersectPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_point")

    public val intersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_ray")

    public val intersectShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_shape")

    public val castMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "cast_motion")

    public val collideShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "collide_shape")

    public val getRestInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "get_rest_info")
  }
}
