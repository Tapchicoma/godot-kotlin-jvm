// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
public open class JSON : Resource() {
  public var `data`: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
    set(`value`) {
      TransferContext.writeArguments(ANY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_JSON, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun parse(jsonText: String, keepText: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to jsonText, BOOL to keepText)
    TransferContext.callMethod(rawPtr, MethodBindings.parsePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getErrorLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getErrorMessage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorMessagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object {
    @JvmOverloads
    public fun stringify(
      `data`: Any?,
      indent: String = "",
      sortKeys: Boolean = true,
      fullPrecision: Boolean = false,
    ): String {
      TransferContext.writeArguments(ANY to data, STRING to indent, BOOL to sortKeys, BOOL to fullPrecision)
      TransferContext.callMethod(0, MethodBindings.stringifyPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    public fun parseString(jsonString: String): Any? {
      TransferContext.writeArguments(STRING to jsonString)
      TransferContext.callMethod(0, MethodBindings.parseStringPtr, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
  }

  internal object MethodBindings {
    public val stringifyPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "stringify")

    public val parseStringPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "parse_string")

    public val parsePtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "parse")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "get_data")

    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "set_data")

    public val getParsedTextPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "get_parsed_text")

    public val getErrorLinePtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "get_error_line")

    public val getErrorMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "get_error_message")
  }
}
