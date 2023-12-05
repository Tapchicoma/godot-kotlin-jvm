// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SpriteFrames : Resource() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITEFRAMES, scriptIndex)
    return true
  }

  public fun addAnimation(anim: StringName) {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationPtr, NIL)
  }

  public fun hasAnimation(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeAnimation(anim: StringName) {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationPtr, NIL)
  }

  public fun renameAnimation(anim: StringName, newname: StringName) {
    TransferContext.writeArguments(STRING_NAME to anim, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationPtr, NIL)
  }

  public fun getAnimationNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun setAnimationSpeed(anim: StringName, fps: Double) {
    TransferContext.writeArguments(STRING_NAME to anim, DOUBLE to fps)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnimationSpeedPtr, NIL)
  }

  public fun getAnimationSpeed(anim: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setAnimationLoop(anim: StringName, loop: Boolean) {
    TransferContext.writeArguments(STRING_NAME to anim, BOOL to loop)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnimationLoopPtr, NIL)
  }

  public fun getAnimationLoop(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun addFrame(
    anim: StringName,
    texture: Texture2D,
    duration: Float = 1.0f,
    atPosition: Int = -1,
  ) {
    TransferContext.writeArguments(STRING_NAME to anim, OBJECT to texture, DOUBLE to duration.toDouble(), LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addFramePtr, NIL)
  }

  @JvmOverloads
  public fun setFrame(
    anim: StringName,
    idx: Int,
    texture: Texture2D,
    duration: Float = 1.0f,
  ) {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong(), OBJECT to texture, DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
  }

  public fun removeFrame(anim: StringName, idx: Int) {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeFramePtr, NIL)
  }

  public fun getFrameCount(anim: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFrameTexture(anim: StringName, idx: Int): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun getFrameDuration(anim: StringName, idx: Int): Float {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun clear(anim: StringName) {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun clearAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearAllPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "add_animation")

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "has_animation")

    public val removeAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "remove_animation")

    public val renameAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "rename_animation")

    public val getAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_names")

    public val setAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "set_animation_speed")

    public val getAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_speed")

    public val setAnimationLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "set_animation_loop")

    public val getAnimationLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_loop")

    public val addFramePtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteFrames", "add_frame")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteFrames", "set_frame")

    public val removeFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "remove_frame")

    public val getFrameCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_count")

    public val getFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_texture")

    public val getFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_duration")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteFrames", "clear")

    public val clearAllPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteFrames", "clear_all")
  }
}
