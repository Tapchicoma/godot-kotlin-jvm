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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class CollisionPolygon2D : Node2D() {
  public var buildMode: BuildMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBuildModePtr, LONG)
      return CollisionPolygon2D.BuildMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBuildModePtr, NIL)
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

  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
    }

  public var oneWayCollisionMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON2D, scriptIndex)
    return true
  }

  public enum class BuildMode(
    id: Long,
  ) {
    BUILD_SOLIDS(0),
    BUILD_SEGMENTS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BuildMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_polygon")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_polygon")

    public val setBuildModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_build_mode")

    public val getBuildModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_build_mode")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "is_disabled")

    public val setOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision")

    public val isOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "is_one_way_collision_enabled")

    public val setOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision_margin")

    public val getOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_one_way_collision_margin")
  }
}
