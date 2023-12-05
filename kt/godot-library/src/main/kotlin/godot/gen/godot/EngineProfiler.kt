// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class EngineProfiler : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENGINEPROFILER, scriptIndex)
    return true
  }

  public open fun _toggle(enable: Boolean, options: VariantArray<Any?>) {
  }

  public open fun _addFrame(`data`: VariantArray<Any?>) {
  }

  public open fun _tick(
    frameTime: Double,
    processTime: Double,
    physicsTime: Double,
    physicsFrameTime: Double,
  ) {
  }

  public companion object

  internal object MethodBindings {
    public val _togglePtr: VoidPtr = TypeManager.getMethodBindPtr("EngineProfiler", "_toggle")

    public val _addFramePtr: VoidPtr = TypeManager.getMethodBindPtr("EngineProfiler", "_add_frame")

    public val _tickPtr: VoidPtr = TypeManager.getMethodBindPtr("EngineProfiler", "_tick")
  }
}
