// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class Button : BaseButton() {
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

  public var icon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonIconPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonIconPtr, NIL)
    }

  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextAlignmentPtr, NIL)
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

  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClipTextPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipTextPtr, NIL)
    }

  public var iconAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setIconAlignmentPtr, NIL)
    }

  public var verticalIconAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalIconAlignmentPtr, LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalIconAlignmentPtr, NIL)
    }

  public var expandIcon: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isExpandIconPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandIconPtr, NIL)
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

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BUTTON, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_text")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_overrun_behavior")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_language")

    public val setButtonIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_button_icon")

    public val getButtonIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_button_icon")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "is_flat")

    public val setClipTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_clip_text")

    public val getClipTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_clip_text")

    public val setTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_alignment")

    public val getTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_alignment")

    public val setIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_icon_alignment")

    public val getIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_icon_alignment")

    public val setVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_vertical_icon_alignment")

    public val getVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_vertical_icon_alignment")

    public val setExpandIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_expand_icon")

    public val isExpandIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "is_expand_icon")
  }
}
