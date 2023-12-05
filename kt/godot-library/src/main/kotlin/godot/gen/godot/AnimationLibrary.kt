// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class AnimationLibrary : Resource() {
  public val animationAdded: Signal1<StringName> by signal("name")

  public val animationRemoved: Signal1<StringName> by signal("name")

  public val animationRenamed: Signal2<StringName, StringName> by signal("name", "toName")

  public val animationChanged: Signal1<StringName> by signal("name")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONLIBRARY, scriptIndex)
    return true
  }

  public fun addAnimation(name: StringName, animation: Animation): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun removeAnimation(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationPtr, NIL)
  }

  public fun renameAnimation(name: StringName, newname: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationPtr, NIL)
  }

  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  public fun getAnimationList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public companion object

  internal object MethodBindings {
    public val addAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "add_animation")

    public val removeAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "remove_animation")

    public val renameAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "rename_animation")

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "has_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation")

    public val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation_list")
  }
}
