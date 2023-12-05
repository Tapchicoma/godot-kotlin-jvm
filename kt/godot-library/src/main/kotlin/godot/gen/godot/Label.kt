// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
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
public open class Label : Control() {
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  public var labelSettings: LabelSettings?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLabelSettingsPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as LabelSettings?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLabelSettingsPtr, NIL)
    }

  public var horizontalAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  public var verticalAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalAlignmentPtr, LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalAlignmentPtr, NIL)
    }

  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
    }

  public var justificationFlags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
    }

  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClippingTextPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipTextPtr, NIL)
    }

  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  public var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUppercasePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUppercasePtr, NIL)
    }

  public var tabStops: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabStopsPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabStopsPtr, NIL)
    }

  public var linesSkipped: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinesSkippedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinesSkippedPtr, NIL)
    }

  public var maxLinesVisible: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
    }

  public var visibleCharacters: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersPtr, NIL)
    }

  public var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersBehaviorPtr, LONG)
      return TextServer.VisibleCharactersBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersBehaviorPtr, NIL)
    }

  public var visibleRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleRatioPtr, NIL)
    }

  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LABEL, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun getLineHeight(line: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_horizontal_alignment")

    public val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_vertical_alignment")

    public val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_vertical_alignment")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_text")

    public val setLabelSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_label_settings")

    public val getLabelSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_label_settings")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_language")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_autowrap_mode")

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_justification_flags")

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_justification_flags")

    public val setClipTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_clip_text")

    public val isClippingTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "is_clipping_text")

    public val setTabStopsPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_tab_stops")

    public val getTabStopsPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_tab_stops")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_text_overrun_behavior")

    public val setUppercasePtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_uppercase")

    public val isUppercasePtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "is_uppercase")

    public val getLineHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_line_height")

    public val getLineCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_line_count")

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_line_count")

    public val getTotalCharacterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_total_character_count")

    public val setVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_characters")

    public val getVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_characters")

    public val getVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_characters_behavior")

    public val setVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_characters_behavior")

    public val setVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_ratio")

    public val getVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_ratio")

    public val setLinesSkippedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_lines_skipped")

    public val getLinesSkippedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_lines_skipped")

    public val setMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_max_lines_visible")

    public val getMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_max_lines_visible")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_structured_text_bidi_override_options")
  }
}
