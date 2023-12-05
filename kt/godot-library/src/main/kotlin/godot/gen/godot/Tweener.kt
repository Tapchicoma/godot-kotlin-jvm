// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class Tweener internal constructor() : RefCounted() {
  public val finished: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TWEENER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
