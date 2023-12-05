// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
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
public open class FileAccess internal constructor() : RefCounted() {
  public var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBigEndianPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBigEndianPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILEACCESS, scriptIndex)
    return true
  }

  public fun flush() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flushPtr, NIL)
  }

  public fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathAbsolutePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOpenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun seek(position: Long) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  @JvmOverloads
  public fun seekEnd(position: Long = 0) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekEndPtr, NIL)
  }

  public fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.eofReachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get64Ptr, LONG)
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

  public fun getReal(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRealPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getBuffer(length: Long): PackedByteArray {
    TransferContext.writeArguments(LONG to length)
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getCsvLine(delim: String = ","): PackedStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, MethodBindings.getCsvLinePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun getAsText(skipCr: Boolean = false): String {
    TransferContext.writeArguments(BOOL to skipCr)
    TransferContext.callMethod(rawPtr, MethodBindings.getAsTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.getVarPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun store8(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.store8Ptr, NIL)
  }

  public fun store16(`value`: Int) {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.store16Ptr, NIL)
  }

  public fun store32(`value`: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.store32Ptr, NIL)
  }

  public fun store64(`value`: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.store64Ptr, NIL)
  }

  public fun storeFloat(`value`: Float) {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.storeFloatPtr, NIL)
  }

  public fun storeDouble(`value`: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.storeDoublePtr, NIL)
  }

  public fun storeReal(`value`: Float) {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.storeRealPtr, NIL)
  }

  public fun storeBuffer(buffer: PackedByteArray) {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.storeBufferPtr, NIL)
  }

  public fun storeLine(line: String) {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, MethodBindings.storeLinePtr, NIL)
  }

  @JvmOverloads
  public fun storeCsvLine(values: PackedStringArray, delim: String = ",") {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, MethodBindings.storeCsvLinePtr, NIL)
  }

  public fun storeString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.storeStringPtr, NIL)
  }

  @JvmOverloads
  public fun storeVar(`value`: Any?, fullObjects: Boolean = false) {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.storeVarPtr, NIL)
  }

  public fun storePascalString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.storePascalStringPtr, NIL)
  }

  public fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPascalStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public enum class ModeFlags(
    id: Long,
  ) {
    READ(1),
    WRITE(2),
    READ_WRITE(3),
    WRITE_READ(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ModeFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    COMPRESSION_FASTLZ(0),
    COMPRESSION_DEFLATE(1),
    COMPRESSION_ZSTD(2),
    COMPRESSION_GZIP(3),
    COMPRESSION_BROTLI(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressionMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public fun `open`(path: String, flags: ModeFlags): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to flags.id)
      TransferContext.callMethod(0, MethodBindings.openPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    public fun openEncrypted(
      path: String,
      modeFlags: ModeFlags,
      key: PackedByteArray,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, PACKED_BYTE_ARRAY to key)
      TransferContext.callMethod(0, MethodBindings.openEncryptedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    public fun openEncryptedWithPass(
      path: String,
      modeFlags: ModeFlags,
      pass: String,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, STRING to pass)
      TransferContext.callMethod(0, MethodBindings.openEncryptedWithPassPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    @JvmOverloads
    public fun openCompressed(
      path: String,
      modeFlags: ModeFlags,
      compressionMode: CompressionMode = FileAccess.CompressionMode.COMPRESSION_FASTLZ,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, LONG to compressionMode.id)
      TransferContext.callMethod(0, MethodBindings.openCompressedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    public fun getOpenError(): GodotError {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getOpenErrorPtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    public fun getFileAsBytes(path: String): PackedByteArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFileAsBytesPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }

    public fun getFileAsString(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFileAsStringPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    public fun getMd5(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getMd5Ptr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    public fun getSha256(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getSha256Ptr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    public fun fileExists(path: String): Boolean {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.fileExistsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

    public fun getModifiedTime(`file`: String): Long {
      TransferContext.writeArguments(STRING to file)
      TransferContext.callMethod(0, MethodBindings.getModifiedTimePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
  }

  internal object MethodBindings {
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "open")

    public val openEncryptedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_encrypted")

    public val openEncryptedWithPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_encrypted_with_pass")

    public val openCompressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_compressed")

    public val getOpenErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_open_error")

    public val getFileAsBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_file_as_bytes")

    public val getFileAsStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_file_as_string")

    public val flushPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "flush")

    public val getPathPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_path")

    public val getPathAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_path_absolute")

    public val isOpenPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "is_open")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "seek")

    public val seekEndPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "seek_end")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_position")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_length")

    public val eofReachedPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "eof_reached")

    public val get8Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_8")

    public val get16Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_16")

    public val get32Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_32")

    public val get64Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_64")

    public val getFloatPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_float")

    public val getDoublePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_double")

    public val getRealPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_real")

    public val getBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_buffer")

    public val getLinePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_line")

    public val getCsvLinePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_csv_line")

    public val getAsTextPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_as_text")

    public val getMd5Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_md5")

    public val getSha256Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_sha256")

    public val isBigEndianPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "is_big_endian")

    public val setBigEndianPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "set_big_endian")

    public val getErrorPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_error")

    public val getVarPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_var")

    public val store8Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_8")

    public val store16Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_16")

    public val store32Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_32")

    public val store64Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_64")

    public val storeFloatPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_float")

    public val storeDoublePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_double")

    public val storeRealPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_real")

    public val storeBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_buffer")

    public val storeLinePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_line")

    public val storeCsvLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_csv_line")

    public val storeStringPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_string")

    public val storeVarPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "store_var")

    public val storePascalStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_pascal_string")

    public val getPascalStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_pascal_string")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "close")

    public val fileExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "file_exists")

    public val getModifiedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_modified_time")
  }
}
