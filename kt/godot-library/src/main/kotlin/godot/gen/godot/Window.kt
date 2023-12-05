// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Window : Viewport() {
  public val windowInput: Signal1<InputEvent> by signal("event")

  public val filesDropped: Signal1<PackedStringArray> by signal("files")

  public val mouseEntered: Signal0 by signal()

  public val mouseExited: Signal0 by signal()

  public val focusEntered: Signal0 by signal()

  public val focusExited: Signal0 by signal()

  public val closeRequested: Signal0 by signal()

  public val goBackRequested: Signal0 by signal()

  public val visibilityChanged: Signal0 by signal()

  public val aboutToPopup: Signal0 by signal()

  public val themeChanged: Signal0 by signal()

  public val dpiChanged: Signal0 by signal()

  public val titlebarChanged: Signal0 by signal()

  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return Window.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
    }

  public var initialPosition: WindowInitialPosition
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInitialPositionPtr, LONG)
      return Window.WindowInitialPosition.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setInitialPositionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var position: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public var currentScreen: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentScreenPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentScreenPtr, NIL)
    }

  public var mousePassthroughPolygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMousePassthroughPolygonPtr,
          PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMousePassthroughPolygonPtr, NIL)
    }

  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  public var wrapControls: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isWrappingControlsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWrapControlsPtr, NIL)
    }

  public var transient: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTransientPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransientPtr, NIL)
    }

  public var exclusive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isExclusivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExclusivePtr, NIL)
    }

  public var unresizable: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var borderless: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var alwaysOnTop: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var transparent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var unfocusable: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var popupWindow: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var extendToTitle: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  public var mousePassthrough: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var minSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var maxSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSizePtr, NIL)
    }

  @CoreTypeLocalCopy
  public var contentScaleSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getContentScaleSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContentScaleSizePtr, NIL)
    }

  public var contentScaleMode: ContentScaleMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getContentScaleModePtr, LONG)
      return Window.ContentScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setContentScaleModePtr, NIL)
    }

  public var contentScaleAspect: ContentScaleAspect
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getContentScaleAspectPtr, LONG)
      return Window.ContentScaleAspect.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setContentScaleAspectPtr, NIL)
    }

  public var contentScaleFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getContentScaleFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setContentScaleFactorPtr, NIL)
    }

  public var autoTranslate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoTranslatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoTranslatePtr, NIL)
    }

  public var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThemePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Theme?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThemePtr, NIL)
    }

  public var themeTypeVariation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThemeTypeVariationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThemeTypeVariationPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WINDOW, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.position
   * //Your changes
   * window.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2i.() -> Unit): Vector2i = position.apply{
      block(this)
      position = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.size
   * //Your changes
   * window.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.minSize
   * //Your changes
   * window.minSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun minSizeMutate(block: Vector2i.() -> Unit): Vector2i = minSize.apply{
      block(this)
      minSize = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.maxSize
   * //Your changes
   * window.maxSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun maxSizeMutate(block: Vector2i.() -> Unit): Vector2i = maxSize.apply{
      block(this)
      maxSize = this
  }


  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.contentScaleSize
   * //Your changes
   * window.contentScaleSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun contentScaleSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      contentScaleSize.apply{
      block(this)
      contentScaleSize = this
  }


  public fun getWindowId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWindowIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun resetSize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetSizePtr, NIL)
  }

  public fun getPositionWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun getSizeWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizeWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public fun isMaximizeAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMaximizeAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun requestAttention() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.requestAttentionPtr, NIL)
  }

  public fun moveToForeground() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveToForegroundPtr, NIL)
  }

  public fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  public fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  public fun setUnparentWhenInvisible(unparent: Boolean) {
    TransferContext.writeArguments(BOOL to unparent)
    TransferContext.callMethod(rawPtr, MethodBindings.setUnparentWhenInvisiblePtr, NIL)
  }

  public fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canDrawPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun grabFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.grabFocusPtr, NIL)
  }

  public fun setImeActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setImeActivePtr, NIL)
  }

  public fun setImePosition(position: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setImePositionPtr, NIL)
  }

  public fun isEmbedded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmbeddedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getContentsMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContentsMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun setUseFontOversampling(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseFontOversamplingPtr, NIL)
  }

  public fun isUsingFontOversampling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUsingFontOversamplingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun childControlsChanged() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.childControlsChangedPtr, NIL)
  }

  public fun beginBulkThemeOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginBulkThemeOverridePtr, NIL)
  }

  public fun endBulkThemeOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endBulkThemeOverridePtr, NIL)
  }

  public fun addThemeIconOverride(name: StringName, texture: Texture2D) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeIconOverridePtr, NIL)
  }

  public fun addThemeStyleboxOverride(name: StringName, stylebox: StyleBox) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeStyleboxOverridePtr, NIL)
  }

  public fun addThemeFontOverride(name: StringName, font: Font) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontOverridePtr, NIL)
  }

  public fun addThemeFontSizeOverride(name: StringName, fontSize: Int) {
    TransferContext.writeArguments(STRING_NAME to name, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontSizeOverridePtr, NIL)
  }

  public fun addThemeColorOverride(name: StringName, color: Color) {
    TransferContext.writeArguments(STRING_NAME to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeColorOverridePtr, NIL)
  }

  public fun addThemeConstantOverride(name: StringName, constant: Int) {
    TransferContext.writeArguments(STRING_NAME to name, LONG to constant.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeConstantOverridePtr, NIL)
  }

  public fun removeThemeIconOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeIconOverridePtr, NIL)
  }

  public fun removeThemeStyleboxOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeStyleboxOverridePtr, NIL)
  }

  public fun removeThemeFontOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontOverridePtr, NIL)
  }

  public fun removeThemeFontSizeOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontSizeOverridePtr, NIL)
  }

  public fun removeThemeColorOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeColorOverridePtr, NIL)
  }

  public fun removeThemeConstantOverride(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeConstantOverridePtr, NIL)
  }

  @JvmOverloads
  public fun getThemeIcon(name: StringName, themeType: StringName = StringName("")): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  @JvmOverloads
  public fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StyleBox?)
  }

  @JvmOverloads
  public fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  @JvmOverloads
  public fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  @JvmOverloads
  public fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasThemeIconOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeStyleboxOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeFontOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeFontSizeOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizeOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeColorOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasThemeConstantOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getThemeDefaultBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  public fun getThemeDefaultFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setLayoutDirection(direction: LayoutDirection) {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayoutDirectionPtr, NIL)
  }

  public fun getLayoutDirection(): LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayoutDirectionPtr, LONG)
    return Window.LayoutDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLayoutRtlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun popup(rect: Rect2i = Rect2i(0, 0, 0, 0)) {
    TransferContext.writeArguments(RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupPtr, NIL)
  }

  public fun popupOnParent(parentRect: Rect2i) {
    TransferContext.writeArguments(RECT2I to parentRect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupOnParentPtr, NIL)
  }

  @JvmOverloads
  public fun popupCentered(minsize: Vector2i = Vector2i(0, 0)) {
    TransferContext.writeArguments(VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, MethodBindings.popupCenteredPtr, NIL)
  }

  @JvmOverloads
  public fun popupCenteredRatio(ratio: Float = 0.8f) {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupCenteredRatioPtr, NIL)
  }

  @JvmOverloads
  public fun popupCenteredClamped(minsize: Vector2i = Vector2i(0, 0), fallbackRatio: Float =
      0.75f) {
    TransferContext.writeArguments(VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupCenteredClampedPtr, NIL)
  }

  @JvmOverloads
  public fun popupExclusive(fromNode: Node, rect: Rect2i = Rect2i(0, 0, 0, 0)) {
    TransferContext.writeArguments(OBJECT to fromNode, RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupExclusivePtr, NIL)
  }

  public fun popupExclusiveOnParent(fromNode: Node, parentRect: Rect2i) {
    TransferContext.writeArguments(OBJECT to fromNode, RECT2I to parentRect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupExclusiveOnParentPtr, NIL)
  }

  @JvmOverloads
  public fun popupExclusiveCentered(fromNode: Node, minsize: Vector2i = Vector2i(0, 0)) {
    TransferContext.writeArguments(OBJECT to fromNode, VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, MethodBindings.popupExclusiveCenteredPtr, NIL)
  }

  @JvmOverloads
  public fun popupExclusiveCenteredRatio(fromNode: Node, ratio: Float = 0.8f) {
    TransferContext.writeArguments(OBJECT to fromNode, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupExclusiveCenteredRatioPtr, NIL)
  }

  @JvmOverloads
  public fun popupExclusiveCenteredClamped(
    fromNode: Node,
    minsize: Vector2i = Vector2i(0, 0),
    fallbackRatio: Float = 0.75f,
  ) {
    TransferContext.writeArguments(OBJECT to fromNode, VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupExclusiveCenteredClampedPtr, NIL)
  }

  public enum class Mode(
    id: Long,
  ) {
    MODE_WINDOWED(0),
    MODE_MINIMIZED(1),
    MODE_MAXIMIZED(2),
    MODE_FULLSCREEN(3),
    MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Flags(
    id: Long,
  ) {
    FLAG_RESIZE_DISABLED(0),
    FLAG_BORDERLESS(1),
    FLAG_ALWAYS_ON_TOP(2),
    FLAG_TRANSPARENT(3),
    FLAG_NO_FOCUS(4),
    FLAG_POPUP(5),
    FLAG_EXTEND_TO_TITLE(6),
    FLAG_MOUSE_PASSTHROUGH(7),
    FLAG_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ContentScaleMode(
    id: Long,
  ) {
    CONTENT_SCALE_MODE_DISABLED(0),
    CONTENT_SCALE_MODE_CANVAS_ITEMS(1),
    CONTENT_SCALE_MODE_VIEWPORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ContentScaleMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ContentScaleAspect(
    id: Long,
  ) {
    CONTENT_SCALE_ASPECT_IGNORE(0),
    CONTENT_SCALE_ASPECT_KEEP(1),
    CONTENT_SCALE_ASPECT_KEEP_WIDTH(2),
    CONTENT_SCALE_ASPECT_KEEP_HEIGHT(3),
    CONTENT_SCALE_ASPECT_EXPAND(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ContentScaleAspect = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LayoutDirection(
    id: Long,
  ) {
    LAYOUT_DIRECTION_INHERITED(0),
    LAYOUT_DIRECTION_LOCALE(1),
    LAYOUT_DIRECTION_LTR(2),
    LAYOUT_DIRECTION_RTL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutDirection = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class WindowInitialPosition(
    id: Long,
  ) {
    WINDOW_INITIAL_POSITION_ABSOLUTE(0),
    WINDOW_INITIAL_POSITION_CENTER_PRIMARY_SCREEN(1),
    WINDOW_INITIAL_POSITION_CENTER_MAIN_WINDOW_SCREEN(2),
    WINDOW_INITIAL_POSITION_CENTER_OTHER_SCREEN(3),
    WINDOW_INITIAL_POSITION_CENTER_SCREEN_WITH_MOUSE_FOCUS(4),
    WINDOW_INITIAL_POSITION_CENTER_SCREEN_WITH_KEYBOARD_FOCUS(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowInitialPosition = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 30

    public final const val NOTIFICATION_THEME_CHANGED: Long = 32
  }

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_title")

    public val getTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_title")

    public val getWindowIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_window_id")

    public val setInitialPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_initial_position")

    public val getInitialPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_initial_position")

    public val setCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_current_screen")

    public val getCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_current_screen")

    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_position")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_position")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_size")

    public val resetSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "reset_size")

    public val getPositionWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_position_with_decorations")

    public val getSizeWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_size_with_decorations")

    public val setMaxSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_max_size")

    public val getMaxSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_max_size")

    public val setMinSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_min_size")

    public val getMinSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_min_size")

    public val setModePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_mode")

    public val getModePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_mode")

    public val setFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_flag")

    public val getFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_flag")

    public val isMaximizeAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_maximize_allowed")

    public val requestAttentionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "request_attention")

    public val moveToForegroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "move_to_foreground")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "is_visible")

    public val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "hide")

    public val showPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "show")

    public val setTransientPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_transient")

    public val isTransientPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "is_transient")

    public val setExclusivePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_exclusive")

    public val isExclusivePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "is_exclusive")

    public val setUnparentWhenInvisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_unparent_when_invisible")

    public val canDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "can_draw")

    public val hasFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "has_focus")

    public val grabFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "grab_focus")

    public val setImeActivePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_ime_active")

    public val setImePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_ime_position")

    public val isEmbeddedPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "is_embedded")

    public val getContentsMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_contents_minimum_size")

    public val setContentScaleSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_size")

    public val getContentScaleSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_size")

    public val setContentScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_mode")

    public val getContentScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_mode")

    public val setContentScaleAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_aspect")

    public val getContentScaleAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_aspect")

    public val setContentScaleFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_factor")

    public val getContentScaleFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_factor")

    public val setUseFontOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_use_font_oversampling")

    public val isUsingFontOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_using_font_oversampling")

    public val setMousePassthroughPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_mouse_passthrough_polygon")

    public val getMousePassthroughPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_mouse_passthrough_polygon")

    public val setWrapControlsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_wrap_controls")

    public val isWrappingControlsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_wrapping_controls")

    public val childControlsChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "child_controls_changed")

    public val setThemePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "set_theme")

    public val getThemePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_theme")

    public val setThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_theme_type_variation")

    public val getThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_type_variation")

    public val beginBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "begin_bulk_theme_override")

    public val endBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "end_bulk_theme_override")

    public val addThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_icon_override")

    public val addThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_stylebox_override")

    public val addThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_font_override")

    public val addThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_font_size_override")

    public val addThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_color_override")

    public val addThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_constant_override")

    public val removeThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_icon_override")

    public val removeThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_stylebox_override")

    public val removeThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_font_override")

    public val removeThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_font_size_override")

    public val removeThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_color_override")

    public val removeThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_constant_override")

    public val getThemeIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_theme_icon")

    public val getThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_stylebox")

    public val getThemeFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_theme_font")

    public val getThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_font_size")

    public val getThemeColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "get_theme_color")

    public val getThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_constant")

    public val hasThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_icon_override")

    public val hasThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_stylebox_override")

    public val hasThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_override")

    public val hasThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_size_override")

    public val hasThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_color_override")

    public val hasThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_constant_override")

    public val hasThemeIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "has_theme_icon")

    public val hasThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_stylebox")

    public val hasThemeFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "has_theme_font")

    public val hasThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_size")

    public val hasThemeColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "has_theme_color")

    public val hasThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_constant")

    public val getThemeDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_base_scale")

    public val getThemeDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_font")

    public val getThemeDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_font_size")

    public val setLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_layout_direction")

    public val getLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_layout_direction")

    public val isLayoutRtlPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "is_layout_rtl")

    public val setAutoTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_auto_translate")

    public val isAutoTranslatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_auto_translating")

    public val popupPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "popup")

    public val popupOnParentPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "popup_on_parent")

    public val popupCenteredPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "popup_centered")

    public val popupCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_centered_ratio")

    public val popupCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_centered_clamped")

    public val popupExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive")

    public val popupExclusiveOnParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_on_parent")

    public val popupExclusiveCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered")

    public val popupExclusiveCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered_ratio")

    public val popupExclusiveCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered_clamped")
  }
}
