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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ConfigFile : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONFIGFILE, scriptIndex)
    return true
  }

  public fun setValue(
    section: String,
    key: String,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
  }

  @JvmOverloads
  public fun getValue(
    section: String,
    key: String,
    default: Any? = null,
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, MethodBindings.getValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun hasSection(section: String): Boolean {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasSectionKey(section: String, key: String): Boolean {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSectionKeyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSections(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSectionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getSectionKeys(section: String): PackedStringArray {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, MethodBindings.getSectionKeysPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun eraseSection(section: String) {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseSectionPtr, NIL)
  }

  public fun eraseSectionKey(section: String, key: String) {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseSectionKeyPtr, NIL)
  }

  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun parse(`data`: String): GodotError {
    TransferContext.writeArguments(STRING to data)
    TransferContext.callMethod(rawPtr, MethodBindings.parsePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun encodeToText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.encodeToTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun loadEncrypted(path: String, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.loadEncryptedPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, MethodBindings.loadEncryptedPassPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun saveEncrypted(path: String, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.saveEncryptedPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun saveEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, MethodBindings.saveEncryptedPassPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setValuePtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "set_value")

    public val getValuePtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "get_value")

    public val hasSectionPtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "has_section")

    public val hasSectionKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "has_section_key")

    public val getSectionsPtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "get_sections")

    public val getSectionKeysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "get_section_keys")

    public val eraseSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "erase_section")

    public val eraseSectionKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "erase_section_key")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "load")

    public val parsePtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "parse")

    public val savePtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "save")

    public val encodeToTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "encode_to_text")

    public val loadEncryptedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "load_encrypted")

    public val loadEncryptedPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "load_encrypted_pass")

    public val saveEncryptedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "save_encrypted")

    public val saveEncryptedPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfigFile", "save_encrypted_pass")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ConfigFile", "clear")
  }
}
