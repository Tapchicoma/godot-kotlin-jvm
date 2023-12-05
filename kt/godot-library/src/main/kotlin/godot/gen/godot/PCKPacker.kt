// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PCKPacker : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PCKPACKER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun pckStart(
    pckName: String,
    alignment: Int = 32,
    key: String = "0000000000000000000000000000000000000000000000000000000000000000",
    encryptDirectory: Boolean = false,
  ): GodotError {
    TransferContext.writeArguments(STRING to pckName, LONG to alignment.toLong(), STRING to key, BOOL to encryptDirectory)
    TransferContext.callMethod(rawPtr, MethodBindings.pckStartPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun addFile(
    pckPath: String,
    sourcePath: String,
    encrypt: Boolean = false,
  ): GodotError {
    TransferContext.writeArguments(STRING to pckPath, STRING to sourcePath, BOOL to encrypt)
    TransferContext.callMethod(rawPtr, MethodBindings.addFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun flush(verbose: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to verbose)
    TransferContext.callMethod(rawPtr, MethodBindings.flushPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val pckStartPtr: VoidPtr = TypeManager.getMethodBindPtr("PCKPacker", "pck_start")

    public val addFilePtr: VoidPtr = TypeManager.getMethodBindPtr("PCKPacker", "add_file")

    public val flushPtr: VoidPtr = TypeManager.getMethodBindPtr("PCKPacker", "flush")
  }
}
