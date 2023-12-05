// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class XRController3D : XRNode3D() {
  public val buttonPressed: Signal1<String> by signal("name")

  public val buttonReleased: Signal1<String> by signal("name")

  public val inputFloatChanged: Signal2<String, Double> by signal("name", "value")

  public val inputVector2Changed: Signal2<String, Vector2> by signal("name", "value")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRCONTROLLER3D, scriptIndex)
    return true
  }

  public fun isButtonPressed(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.isButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getInput(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getFloat(name: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getFloatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getVector2(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getVector2Ptr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getTrackerHand(): XRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackerHandPtr, LONG)
    return XRPositionalTracker.TrackerHand.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val isButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "is_button_pressed")

    public val getInputPtr: VoidPtr = TypeManager.getMethodBindPtr("XRController3D", "get_input")

    public val getFloatPtr: VoidPtr = TypeManager.getMethodBindPtr("XRController3D", "get_float")

    public val getVector2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_vector2")

    public val getTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_tracker_hand")
  }
}
