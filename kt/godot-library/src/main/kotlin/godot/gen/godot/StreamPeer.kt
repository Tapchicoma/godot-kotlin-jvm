// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class StreamPeer internal constructor() : RefCounted() {
  public var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBigEndianEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBigEndianPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEER, scriptIndex)
    return true
  }

  public fun putData(`data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.putDataPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun putPartialData(`data`: PackedByteArray): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.putPartialDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getPartialData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPartialDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getAvailableBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailableBytesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun put8(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.put8Ptr, NIL)
  }

  public fun putU8(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.putU8Ptr, NIL)
  }

  public fun put16(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.put16Ptr, NIL)
  }

  public fun putU16(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.putU16Ptr, NIL)
  }

  public fun put32(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.put32Ptr, NIL)
  }

  public fun putU32(`value`: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.putU32Ptr, NIL)
  }

  public fun put64(`value`: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.put64Ptr, NIL)
  }

  public fun putU64(`value`: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.putU64Ptr, NIL)
  }

  public fun putFloat(`value`: Float) {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.putFloatPtr, NIL)
  }

  public fun putDouble(`value`: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.putDoublePtr, NIL)
  }

  public fun putString(`value`: String) {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, MethodBindings.putStringPtr, NIL)
  }

  public fun putUtf8String(`value`: String) {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, MethodBindings.putUtf8StringPtr, NIL)
  }

  @JvmOverloads
  public fun putVar(`value`: Any?, fullObjects: Boolean = false) {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.putVarPtr, NIL)
  }

  public fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getU8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getU8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getU16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getU16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun get32(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getU32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getU32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get64Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getU64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getU64Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getFloat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFloatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDoublePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun getString(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getUtf8String(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUtf8StringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.getVarPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val putDataPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_data")

    public val putPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_partial_data")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_data")

    public val getPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_partial_data")

    public val getAvailableBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_available_bytes")

    public val setBigEndianPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "set_big_endian")

    public val isBigEndianEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "is_big_endian_enabled")

    public val put8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_8")

    public val putU8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_u8")

    public val put16Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_16")

    public val putU16Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_u16")

    public val put32Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_32")

    public val putU32Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_u32")

    public val put64Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_64")

    public val putU64Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_u64")

    public val putFloatPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_float")

    public val putDoublePtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_double")

    public val putStringPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_string")

    public val putUtf8StringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_utf8_string")

    public val putVarPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_var")

    public val get8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_8")

    public val getU8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_u8")

    public val get16Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_16")

    public val getU16Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_u16")

    public val get32Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_32")

    public val getU32Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_u32")

    public val get64Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_64")

    public val getU64Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_u64")

    public val getFloatPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_float")

    public val getDoublePtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_double")

    public val getStringPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_string")

    public val getUtf8StringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_utf8_string")

    public val getVarPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_var")
  }
}
