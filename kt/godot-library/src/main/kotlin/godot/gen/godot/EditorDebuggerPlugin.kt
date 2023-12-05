// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorDebuggerPlugin internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORDEBUGGERPLUGIN, scriptIndex)
    return true
  }

  public open fun _setupSession(sessionId: Int) {
  }

  public open fun _hasCapture(capture: String): Boolean {
    throw NotImplementedError("_has_capture is not implemented for EditorDebuggerPlugin")
  }

  public open fun _capture(
    message: String,
    `data`: VariantArray<Any?>,
    sessionId: Int,
  ): Boolean {
    throw NotImplementedError("_capture is not implemented for EditorDebuggerPlugin")
  }

  public fun getSession(id: Int): EditorDebuggerSession? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSessionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorDebuggerSession?)
  }

  public fun getSessions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSessionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val _setupSessionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerPlugin", "_setup_session")

    public val _hasCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerPlugin", "_has_capture")

    public val _capturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerPlugin", "_capture")

    public val getSessionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerPlugin", "get_session")

    public val getSessionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerPlugin", "get_sessions")
  }
}
