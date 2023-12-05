// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.ImageFormatLoader.LoaderFlags
import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmInline

@GodotBaseType
public open class ImageFormatLoader internal constructor() : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGEFORMATLOADER, scriptIndex)
    return true
  }

  public sealed interface LoaderFlags {
    public val flag: Long

    public infix fun or(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.or(other))

    public infix fun xor(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.xor(other))

    public infix fun and(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.and(other))

    public operator fun plus(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.plus(other))

    public operator fun minus(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.minus(other))

    public operator fun times(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.times(other))

    public operator fun div(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.div(other))

    public operator fun rem(other: godot.ImageFormatLoader.LoaderFlags):
        godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.rem(other))

    public fun unaryPlus(): godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag.unaryMinus())

    public fun inv(): godot.ImageFormatLoader.LoaderFlags = LoaderFlagsValue(flag.inv())

    public infix fun shl(bits: Int): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.ImageFormatLoader.LoaderFlags =
        LoaderFlagsValue(flag ushr bits)

    public companion object {
      public val FLAG_NONE: godot.ImageFormatLoader.LoaderFlags =
          godot.ImageFormatLoader.LoaderFlagsValue(0)

      public val FLAG_FORCE_LINEAR: godot.ImageFormatLoader.LoaderFlags =
          godot.ImageFormatLoader.LoaderFlagsValue(1)

      public val FLAG_CONVERT_COLORS: godot.ImageFormatLoader.LoaderFlags =
          godot.ImageFormatLoader.LoaderFlagsValue(2)
    }
  }

  @JvmInline
  internal value class LoaderFlagsValue internal constructor(
    override val flag: Long,
  ) : godot.ImageFormatLoader.LoaderFlags

  public companion object

  internal object MethodBindings
}

public infix fun Long.or(other: LoaderFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: LoaderFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: LoaderFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: LoaderFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: LoaderFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: LoaderFlags): Long = this.times(other.flag)

public operator fun Long.div(other: LoaderFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: LoaderFlags): Long = this.rem(other.flag)
