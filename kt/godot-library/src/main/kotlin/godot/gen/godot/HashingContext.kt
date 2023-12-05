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
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class HashingContext : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HASHINGCONTEXT, scriptIndex)
    return true
  }

  public fun start(type: HashType): GodotError {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun update(chunk: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to chunk)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public enum class HashType(
    id: Long,
  ) {
    HASH_MD5(0),
    HASH_SHA1(1),
    HASH_SHA256(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HashType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "start")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "update")

    public val finishPtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "finish")
  }
}
