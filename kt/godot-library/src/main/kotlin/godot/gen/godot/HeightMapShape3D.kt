// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class HeightMapShape3D : Shape3D() {
  public var mapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMapWidthPtr, NIL)
    }

  public var mapDepth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapDepthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMapDepthPtr, NIL)
    }

  public var mapData: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapDataPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMapDataPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_width")

    public val getMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_width")

    public val setMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_depth")

    public val getMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_depth")

    public val setMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_data")

    public val getMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_data")
  }
}
