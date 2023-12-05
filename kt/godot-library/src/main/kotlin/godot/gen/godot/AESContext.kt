// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class AESContext : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AESCONTEXT, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun start(
    mode: Mode,
    key: PackedByteArray,
    iv: PackedByteArray = PackedByteArray(),
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, PACKED_BYTE_ARRAY to key, PACKED_BYTE_ARRAY to iv)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun update(src: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to src)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun getIvState(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIvStatePtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun finish() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, NIL)
  }

  public enum class Mode(
    id: Long,
  ) {
    MODE_ECB_ENCRYPT(0),
    MODE_ECB_DECRYPT(1),
    MODE_CBC_ENCRYPT(2),
    MODE_CBC_DECRYPT(3),
    MODE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("AESContext", "start")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("AESContext", "update")

    public val getIvStatePtr: VoidPtr = TypeManager.getMethodBindPtr("AESContext", "get_iv_state")

    public val finishPtr: VoidPtr = TypeManager.getMethodBindPtr("AESContext", "finish")
  }
}
