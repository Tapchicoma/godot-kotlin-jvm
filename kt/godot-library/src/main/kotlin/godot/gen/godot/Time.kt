// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object Time : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_TIME)
    return false
  }

  public fun getDatetimeDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getDateDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getTimeDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun getDatetimeStringFromUnixTime(unixTimeVal: Long, useSpace: Boolean = false): String {
    TransferContext.writeArguments(LONG to unixTimeVal, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDateStringFromUnixTime(unixTimeVal: Long): String {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getTimeStringFromUnixTime(unixTimeVal: Long): String {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDatetimeDictFromDatetimeString(datetime: String, weekday: Boolean):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to datetime, BOOL to weekday)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromDatetimeStringPtr,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getDatetimeStringFromDatetimeDict(datetime: Dictionary<Any?, Any?>, useSpace: Boolean):
      String {
    TransferContext.writeArguments(DICTIONARY to datetime, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromDatetimeDictPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getUnixTimeFromDatetimeDict(datetime: Dictionary<Any?, Any?>): Long {
    TransferContext.writeArguments(DICTIONARY to datetime)
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromDatetimeDictPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getUnixTimeFromDatetimeString(datetime: String): Long {
    TransferContext.writeArguments(STRING to datetime)
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromDatetimeStringPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getOffsetStringFromOffsetMinutes(offsetMinutes: Long): String {
    TransferContext.writeArguments(LONG to offsetMinutes)
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetStringFromOffsetMinutesPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getDatetimeDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun getDateDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun getTimeDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  @JvmOverloads
  public fun getDatetimeStringFromSystem(utc: Boolean = false, useSpace: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getDateStringFromSystem(utc: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getTimeStringFromSystem(utc: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getTimeZoneFromSystem(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeZoneFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getUnixTimeFromSystem(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromSystemPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getTicksMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksMsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getTicksUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksUsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class Month(
    id: Long,
  ) {
    MONTH_JANUARY(1),
    MONTH_FEBRUARY(2),
    MONTH_MARCH(3),
    MONTH_APRIL(4),
    MONTH_MAY(5),
    MONTH_JUNE(6),
    MONTH_JULY(7),
    MONTH_AUGUST(8),
    MONTH_SEPTEMBER(9),
    MONTH_OCTOBER(10),
    MONTH_NOVEMBER(11),
    MONTH_DECEMBER(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Month = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Weekday(
    id: Long,
  ) {
    WEEKDAY_SUNDAY(0),
    WEEKDAY_MONDAY(1),
    WEEKDAY_TUESDAY(2),
    WEEKDAY_WEDNESDAY(3),
    WEEKDAY_THURSDAY(4),
    WEEKDAY_FRIDAY(5),
    WEEKDAY_SATURDAY(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Weekday = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getDatetimeDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_unix_time")

    public val getDateDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_dict_from_unix_time")

    public val getTimeDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_dict_from_unix_time")

    public val getDatetimeStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_unix_time")

    public val getDateStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_string_from_unix_time")

    public val getTimeStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_string_from_unix_time")

    public val getDatetimeDictFromDatetimeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_datetime_string")

    public val getDatetimeStringFromDatetimeDictPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_datetime_dict")

    public val getUnixTimeFromDatetimeDictPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_datetime_dict")

    public val getUnixTimeFromDatetimeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_datetime_string")

    public val getOffsetStringFromOffsetMinutesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_offset_string_from_offset_minutes")

    public val getDatetimeDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_system")

    public val getDateDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_dict_from_system")

    public val getTimeDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_dict_from_system")

    public val getDatetimeStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_system")

    public val getDateStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_string_from_system")

    public val getTimeStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_string_from_system")

    public val getTimeZoneFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_zone_from_system")

    public val getUnixTimeFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_system")

    public val getTicksMsecPtr: VoidPtr = TypeManager.getMethodBindPtr("Time", "get_ticks_msec")

    public val getTicksUsecPtr: VoidPtr = TypeManager.getMethodBindPtr("Time", "get_ticks_usec")
  }
}
