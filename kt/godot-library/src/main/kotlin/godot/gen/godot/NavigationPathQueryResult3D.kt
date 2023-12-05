// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class NavigationPathQueryResult3D : RefCounted() {
  public var path: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPtr, NIL)
    }

  public var pathTypes: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathTypesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathTypesPtr, NIL)
    }

  public var pathRids: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathRidsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathRidsPtr, NIL)
    }

  public var pathOwnerIds: PackedInt64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathOwnerIdsPtr, PACKED_INT_64_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathOwnerIdsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYRESULT3D, scriptIndex)
    return true
  }

  public fun reset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetPtr, NIL)
  }

  public enum class PathSegmentType(
    id: Long,
  ) {
    PATH_SEGMENT_TYPE_REGION(0),
    PATH_SEGMENT_TYPE_LINK(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathSegmentType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path")

    public val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path")

    public val setPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_types")

    public val getPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_types")

    public val setPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_rids")

    public val getPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_rids")

    public val setPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_owner_ids")

    public val getPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_owner_ids")

    public val resetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "reset")
  }
}
