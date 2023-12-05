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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class OccluderPolygon2D : Resource() {
  public var closed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClosedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClosedPtr, NIL)
    }

  public var cullMode: CullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
      return OccluderPolygon2D.CullMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OCCLUDERPOLYGON2D, scriptIndex)
    return true
  }

  public enum class CullMode(
    id: Long,
  ) {
    CULL_DISABLED(0),
    CULL_CLOCKWISE(1),
    CULL_COUNTER_CLOCKWISE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CullMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setClosedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_closed")

    public val isClosedPtr: VoidPtr = TypeManager.getMethodBindPtr("OccluderPolygon2D", "is_closed")

    public val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_cull_mode")

    public val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_cull_mode")

    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_polygon")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_polygon")
  }
}
