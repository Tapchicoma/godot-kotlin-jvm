// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
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
public open class GrooveJoint2D : Joint2D() {
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  public var initialOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInitialOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInitialOffsetPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GROOVEJOINT2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("GrooveJoint2D", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("GrooveJoint2D", "get_length")

    public val setInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "set_initial_offset")

    public val getInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "get_initial_offset")
  }
}
