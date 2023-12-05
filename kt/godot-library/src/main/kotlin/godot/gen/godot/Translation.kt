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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Translation : Resource() {
  public var locale: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocalePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TRANSLATION, scriptIndex)
    return true
  }

  public open fun _getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Int,
    context: StringName,
  ): StringName {
    throw NotImplementedError("_get_plural_message is not implemented for Translation")
  }

  public open fun _getMessage(srcMessage: StringName, context: StringName): StringName {
    throw NotImplementedError("_get_message is not implemented for Translation")
  }

  @JvmOverloads
  public fun addMessage(
    srcMessage: StringName,
    xlatedMessage: StringName,
    context: StringName = StringName(""),
  ) {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to xlatedMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.addMessagePtr, NIL)
  }

  @JvmOverloads
  public fun addPluralMessage(
    srcMessage: StringName,
    xlatedMessages: PackedStringArray,
    context: StringName = StringName(""),
  ) {
    TransferContext.writeArguments(STRING_NAME to srcMessage, PACKED_STRING_ARRAY to xlatedMessages, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.addPluralMessagePtr, NIL)
  }

  @JvmOverloads
  public fun getMessage(srcMessage: StringName, context: StringName = StringName("")): StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.getMessagePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  @JvmOverloads
  public fun getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to srcPluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.getPluralMessagePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  @JvmOverloads
  public fun eraseMessage(srcMessage: StringName, context: StringName = StringName("")) {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseMessagePtr, NIL)
  }

  public fun getMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMessageListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getTranslatedMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTranslatedMessageListPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getMessageCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMessageCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val _getPluralMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "_get_plural_message")

    public val _getMessagePtr: VoidPtr = TypeManager.getMethodBindPtr("Translation", "_get_message")

    public val setLocalePtr: VoidPtr = TypeManager.getMethodBindPtr("Translation", "set_locale")

    public val getLocalePtr: VoidPtr = TypeManager.getMethodBindPtr("Translation", "get_locale")

    public val addMessagePtr: VoidPtr = TypeManager.getMethodBindPtr("Translation", "add_message")

    public val addPluralMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "add_plural_message")

    public val getMessagePtr: VoidPtr = TypeManager.getMethodBindPtr("Translation", "get_message")

    public val getPluralMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_plural_message")

    public val eraseMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "erase_message")

    public val getMessageListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_message_list")

    public val getTranslatedMessageListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_translated_message_list")

    public val getMessageCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_message_count")
  }
}
