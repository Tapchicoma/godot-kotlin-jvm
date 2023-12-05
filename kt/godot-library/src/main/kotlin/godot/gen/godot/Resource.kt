// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Resource : RefCounted() {
  public val changed: Signal0 by signal()

  public val setupLocalToSceneRequested: Signal0 by signal()

  public var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLocalToScenePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocalToScenePtr, NIL)
    }

  public var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPtr, NIL)
    }

  public var resourceName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNamePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCE, scriptIndex)
    return true
  }

  public fun takeOverPath(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.takeOverPathPtr, NIL)
  }

  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun setupLocalToScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setupLocalToScenePtr, NIL)
  }

  public fun emitChanged() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.emitChangedPtr, NIL)
  }

  @JvmOverloads
  public fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val setPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "set_path")

    public val takeOverPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "take_over_path")

    public val getPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_path")

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "set_name")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_name")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_rid")

    public val setLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_local_to_scene")

    public val isLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "is_local_to_scene")

    public val getLocalScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_local_scene")

    public val setupLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "setup_local_to_scene")

    public val emitChangedPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "emit_changed")

    public val duplicatePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "duplicate")
  }
}
