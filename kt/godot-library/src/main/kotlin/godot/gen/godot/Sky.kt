// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class Sky : Resource() {
  public var skyMaterial: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  public var processMode: ProcessMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessModePtr, LONG)
      return Sky.ProcessMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessModePtr, NIL)
    }

  public var radianceSize: RadianceSize
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadianceSizePtr, LONG)
      return Sky.RadianceSize.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRadianceSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKY, scriptIndex)
    return true
  }

  public enum class RadianceSize(
    id: Long,
  ) {
    RADIANCE_SIZE_32(0),
    RADIANCE_SIZE_64(1),
    RADIANCE_SIZE_128(2),
    RADIANCE_SIZE_256(3),
    RADIANCE_SIZE_512(4),
    RADIANCE_SIZE_1024(5),
    RADIANCE_SIZE_2048(6),
    RADIANCE_SIZE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RadianceSize = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ProcessMode(
    id: Long,
  ) {
    PROCESS_MODE_AUTOMATIC(0),
    PROCESS_MODE_QUALITY(1),
    PROCESS_MODE_INCREMENTAL(2),
    PROCESS_MODE_REALTIME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "set_radiance_size")

    public val getRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "get_radiance_size")

    public val setProcessModePtr: VoidPtr = TypeManager.getMethodBindPtr("Sky", "set_process_mode")

    public val getProcessModePtr: VoidPtr = TypeManager.getMethodBindPtr("Sky", "get_process_mode")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("Sky", "set_material")

    public val getMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("Sky", "get_material")
  }
}
