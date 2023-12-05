// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public open class MultiMesh : Resource() {
  public var transformFormat: TransformFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformFormatPtr, LONG)
      return MultiMesh.TransformFormat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformFormatPtr, NIL)
    }

  public var useColors: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingColorsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseColorsPtr, NIL)
    }

  public var useCustomData: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomDataPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomDataPtr, NIL)
    }

  public var instanceCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInstanceCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInstanceCountPtr, NIL)
    }

  public var visibleInstanceCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleInstanceCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleInstanceCountPtr, NIL)
    }

  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  public var buffer: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIMESH, scriptIndex)
    return true
  }

  public fun setInstanceTransform(instance: Int, transform: Transform3D) {
    TransferContext.writeArguments(LONG to instance.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setInstanceTransformPtr, NIL)
  }

  public fun setInstanceTransform2d(instance: Int, transform: Transform2D) {
    TransferContext.writeArguments(LONG to instance.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setInstanceTransform2dPtr, NIL)
  }

  public fun getInstanceTransform(instance: Int): Transform3D {
    TransferContext.writeArguments(LONG to instance.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun getInstanceTransform2d(instance: Int): Transform2D {
    TransferContext.writeArguments(LONG to instance.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceTransform2dPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun setInstanceColor(instance: Int, color: Color) {
    TransferContext.writeArguments(LONG to instance.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setInstanceColorPtr, NIL)
  }

  public fun getInstanceColor(instance: Int): Color {
    TransferContext.writeArguments(LONG to instance.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setInstanceCustomData(instance: Int, customData: Color) {
    TransferContext.writeArguments(LONG to instance.toLong(), COLOR to customData)
    TransferContext.callMethod(rawPtr, MethodBindings.setInstanceCustomDataPtr, NIL)
  }

  public fun getInstanceCustomData(instance: Int): Color {
    TransferContext.writeArguments(LONG to instance.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceCustomDataPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun getAabb(): CoreAABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public enum class TransformFormat(
    id: Long,
  ) {
    TRANSFORM_2D(0),
    TRANSFORM_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransformFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiMesh", "set_mesh")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiMesh", "get_mesh")

    public val setUseColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_use_colors")

    public val isUsingColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "is_using_colors")

    public val setUseCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_use_custom_data")

    public val isUsingCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "is_using_custom_data")

    public val setTransformFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_transform_format")

    public val getTransformFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_transform_format")

    public val setInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_instance_count")

    public val getInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_instance_count")

    public val setVisibleInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_visible_instance_count")

    public val getVisibleInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_visible_instance_count")

    public val setInstanceTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_instance_transform")

    public val setInstanceTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_instance_transform_2d")

    public val getInstanceTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_instance_transform")

    public val getInstanceTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_instance_transform_2d")

    public val setInstanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_instance_color")

    public val getInstanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_instance_color")

    public val setInstanceCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "set_instance_custom_data")

    public val getInstanceCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMesh", "get_instance_custom_data")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiMesh", "get_aabb")

    public val getBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiMesh", "get_buffer")

    public val setBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiMesh", "set_buffer")
  }
}
