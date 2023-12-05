// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class PhysicsMaterial : Resource() {
  public var friction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
    }

  public var rough: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRoughPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRoughPtr, NIL)
    }

  public var bounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
    }

  public var absorbent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAbsorbentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAbsorbentPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSMATERIAL, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_friction")

    public val getFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "get_friction")

    public val setRoughPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsMaterial", "set_rough")

    public val isRoughPtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsMaterial", "is_rough")

    public val setBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsMaterial", "set_bounce")

    public val getBouncePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsMaterial", "get_bounce")

    public val setAbsorbentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_absorbent")

    public val isAbsorbentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "is_absorbent")
  }
}
