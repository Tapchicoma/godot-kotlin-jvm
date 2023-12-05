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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class PackedScene : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKEDSCENE, scriptIndex)
    return true
  }

  public fun pack(path: Node): GodotError {
    TransferContext.writeArguments(OBJECT to path)
    TransferContext.callMethod(rawPtr, MethodBindings.packPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun instantiate(editState: GenEditState =
      PackedScene.GenEditState.GEN_EDIT_STATE_DISABLED): Node? {
    TransferContext.writeArguments(LONG to editState.id)
    TransferContext.callMethod(rawPtr, MethodBindings.instantiatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun canInstantiate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getState(): SceneState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SceneState?)
  }

  public enum class GenEditState(
    id: Long,
  ) {
    GEN_EDIT_STATE_DISABLED(0),
    GEN_EDIT_STATE_INSTANCE(1),
    GEN_EDIT_STATE_MAIN(2),
    GEN_EDIT_STATE_MAIN_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GenEditState = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val packPtr: VoidPtr = TypeManager.getMethodBindPtr("PackedScene", "pack")

    public val instantiatePtr: VoidPtr = TypeManager.getMethodBindPtr("PackedScene", "instantiate")

    public val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PackedScene", "can_instantiate")

    public val getStatePtr: VoidPtr = TypeManager.getMethodBindPtr("PackedScene", "get_state")
  }
}
