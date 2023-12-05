// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
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
public open class Viewport internal constructor() : Node() {
  public val sizeChanged: Signal0 by signal()

  public val guiFocusChanged: Signal1<Control> by signal("node")

  public var disable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.is3dDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisable3dPtr, NIL)
    }

  public var useXr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingXrPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseXrPtr, NIL)
    }

  public var ownWorld3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingOwnWorld3dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseOwnWorld3dPtr, NIL)
    }

  public var world3d: World3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWorld3dPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWorld3dPtr, NIL)
    }

  public var world2d: World2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWorld2dPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWorld2dPtr, NIL)
    }

  public var transparentBg: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasTransparentBackgroundPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransparentBackgroundPtr, NIL)
    }

  public var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHandlingInputLocallyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandleInputLocallyPtr, NIL)
    }

  public var snap2dTransformsToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnap2dTransformsToPixelEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnap2dTransformsToPixelPtr, NIL)
    }

  public var snap2dVerticesToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnap2dVerticesToPixelEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnap2dVerticesToPixelPtr, NIL)
    }

  public var msaa2d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsaa2dPtr, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMsaa2dPtr, NIL)
    }

  public var msaa3d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsaa3dPtr, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMsaa3dPtr, NIL)
    }

  public var screenSpaceAa: ScreenSpaceAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScreenSpaceAaPtr, LONG)
      return Viewport.ScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenSpaceAaPtr, NIL)
    }

  public var useTaa: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingTaaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTaaPtr, NIL)
    }

  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingDebandingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDebandingPtr, NIL)
    }

  public var useOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingOcclusionCullingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseOcclusionCullingPtr, NIL)
    }

  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshLodThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshLodThresholdPtr, NIL)
    }

  public var debugDraw: DebugDraw
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugDrawPtr, LONG)
      return Viewport.DebugDraw.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugDrawPtr, NIL)
    }

  public var scaling3dMode: Scaling3DMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dModePtr, LONG)
      return Viewport.Scaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dModePtr, NIL)
    }

  public var scaling3dScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dScalePtr, NIL)
    }

  public var textureMipmapBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMipmapBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMipmapBiasPtr, NIL)
    }

  public var fsrSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFsrSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFsrSharpnessPtr, NIL)
    }

  public var vrsMode: VRSMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsModePtr, LONG)
      return Viewport.VRSMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsModePtr, NIL)
    }

  public var vrsTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsTexturePtr, NIL)
    }

  public var canvasItemDefaultTextureFilter: DefaultCanvasItemTextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCanvasItemTextureFilterPtr, LONG)
      return Viewport.DefaultCanvasItemTextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCanvasItemTextureFilterPtr, NIL)
    }

  public var canvasItemDefaultTextureRepeat: DefaultCanvasItemTextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCanvasItemTextureRepeatPtr, LONG)
      return Viewport.DefaultCanvasItemTextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCanvasItemTextureRepeatPtr, NIL)
    }

  public var audioListenerEnable2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAudioListener2dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsAudioListener2dPtr, NIL)
    }

  public var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAudioListener3dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsAudioListener3dPtr, NIL)
    }

  public var physicsObjectPicking: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsObjectPickingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsObjectPickingPtr, NIL)
    }

  public var physicsObjectPickingSort: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsObjectPickingSortPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsObjectPickingSortPtr, NIL)
    }

  public var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isInputDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableInputPtr, NIL)
    }

  public var guiSnapControlsToPixels: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnapControlsToPixelsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapControlsToPixelsPtr, NIL)
    }

  public var guiEmbedSubwindows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmbeddingSubwindowsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmbeddingSubwindowsPtr, NIL)
    }

  public var sdfOversize: SDFOversize
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfOversizePtr, LONG)
      return Viewport.SDFOversize.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfOversizePtr, NIL)
    }

  public var sdfScale: SDFScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfScalePtr, LONG)
      return Viewport.SDFScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfScalePtr, NIL)
    }

  public var positionalShadowAtlasSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasSizePtr, NIL)
    }

  public var positionalShadowAtlas16Bits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlas16BitsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlas16BitsPtr, NIL)
    }

  public var positionalShadowAtlasQuad0: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  public var positionalShadowAtlasQuad1: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  public var positionalShadowAtlasQuad2: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  public var positionalShadowAtlasQuad3: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  @CoreTypeLocalCopy
  public var canvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasTransformPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var globalCanvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalCanvasTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalCanvasTransformPtr, NIL)
    }

  public var canvasCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasCullMaskPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIEWPORT, scriptIndex)
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
   * val myCoreType = viewport.canvasTransform
   * //Your changes
   * viewport.canvasTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun canvasTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      canvasTransform.apply{
      block(this)
      canvasTransform = this
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
   * val myCoreType = viewport.globalCanvasTransform
   * //Your changes
   * viewport.globalCanvasTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalCanvasTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      globalCanvasTransform.apply{
      block(this)
      globalCanvasTransform = this
  }


  public fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findWorld2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
  }

  public fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFinalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun getRenderInfo(type: RenderInfoType, info: RenderInfo): Int {
    TransferContext.writeArguments(LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?)
  }

  public fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewportRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun pushTextInput(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.pushTextInputPtr, NIL)
  }

  @JvmOverloads
  public fun pushInput(event: InputEvent, inLocalCoords: Boolean = false) {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.pushInputPtr, NIL)
  }

  @JvmOverloads
  public fun pushUnhandledInput(event: InputEvent, inLocalCoords: Boolean = false) {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.pushUnhandledInputPtr, NIL)
  }

  public fun getCamera2d(): Camera2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamera2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera2D?)
  }

  public fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun warpMouse(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  public fun updateMouseCursorState() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateMouseCursorStatePtr, NIL)
  }

  public fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiGetDragDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiIsDraggingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun guiIsDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiIsDragSuccessfulPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun guiReleaseFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiReleaseFocusPtr, NIL)
  }

  public fun guiGetFocusOwner(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiGetFocusOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun setInputAsHandled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setInputAsHandledPtr, NIL)
  }

  public fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInputHandledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setCanvasCullMaskBit(layer: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to layer, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCanvasCullMaskBitPtr, NIL)
  }

  public fun getCanvasCullMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasCullMaskBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun findWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
  }

  public fun getCamera3d(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamera3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera3D?)
  }

  public enum class PositionalShadowAtlasQuadrantSubdiv(
    id: Long,
  ) {
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),
    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),
    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),
    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),
    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),
    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),
    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),
    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PositionalShadowAtlasQuadrantSubdiv = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Scaling3DMode(
    id: Long,
  ) {
    SCALING_3D_MODE_BILINEAR(0),
    SCALING_3D_MODE_FSR(1),
    SCALING_3D_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Scaling3DMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MSAA(
    id: Long,
  ) {
    MSAA_DISABLED(0),
    MSAA_2X(1),
    MSAA_4X(2),
    MSAA_8X(3),
    MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MSAA = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ScreenSpaceAA(
    id: Long,
  ) {
    SCREEN_SPACE_AA_DISABLED(0),
    SCREEN_SPACE_AA_FXAA(1),
    SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScreenSpaceAA = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class RenderInfo(
    id: Long,
  ) {
    RENDER_INFO_OBJECTS_IN_FRAME(0),
    RENDER_INFO_PRIMITIVES_IN_FRAME(1),
    RENDER_INFO_DRAW_CALLS_IN_FRAME(2),
    RENDER_INFO_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderInfo = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class RenderInfoType(
    id: Long,
  ) {
    RENDER_INFO_TYPE_VISIBLE(0),
    RENDER_INFO_TYPE_SHADOW(1),
    RENDER_INFO_TYPE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderInfoType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DebugDraw(
    id: Long,
  ) {
    DEBUG_DRAW_DISABLED(0),
    DEBUG_DRAW_UNSHADED(1),
    DEBUG_DRAW_LIGHTING(2),
    DEBUG_DRAW_OVERDRAW(3),
    DEBUG_DRAW_WIREFRAME(4),
    DEBUG_DRAW_NORMAL_BUFFER(5),
    DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    DEBUG_DRAW_SHADOW_ATLAS(9),
    DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    DEBUG_DRAW_SCENE_LUMINANCE(11),
    DEBUG_DRAW_SSAO(12),
    DEBUG_DRAW_SSIL(13),
    DEBUG_DRAW_PSSM_SPLITS(14),
    DEBUG_DRAW_DECAL_ATLAS(15),
    DEBUG_DRAW_SDFGI(16),
    DEBUG_DRAW_SDFGI_PROBES(17),
    DEBUG_DRAW_GI_BUFFER(18),
    DEBUG_DRAW_DISABLE_LOD(19),
    DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    DEBUG_DRAW_CLUSTER_DECALS(22),
    DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    DEBUG_DRAW_OCCLUDERS(24),
    DEBUG_DRAW_MOTION_VECTORS(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DebugDraw = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DefaultCanvasItemTextureFilter(
    id: Long,
  ) {
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST(0),
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR(1),
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(2),
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DefaultCanvasItemTextureFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DefaultCanvasItemTextureRepeat(
    id: Long,
  ) {
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(0),
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(1),
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(2),
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DefaultCanvasItemTextureRepeat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SDFOversize(
    id: Long,
  ) {
    SDF_OVERSIZE_100_PERCENT(0),
    SDF_OVERSIZE_120_PERCENT(1),
    SDF_OVERSIZE_150_PERCENT(2),
    SDF_OVERSIZE_200_PERCENT(3),
    SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFOversize = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SDFScale(
    id: Long,
  ) {
    SDF_SCALE_100_PERCENT(0),
    SDF_SCALE_50_PERCENT(1),
    SDF_SCALE_25_PERCENT(2),
    SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFScale = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VRSMode(
    id: Long,
  ) {
    VRS_DISABLED(0),
    VRS_TEXTURE(1),
    VRS_XR(2),
    VRS_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VRSMode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_world_2d")

    public val getWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_world_2d")

    public val findWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "find_world_2d")

    public val setCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_transform")

    public val getCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_transform")

    public val setGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_global_canvas_transform")

    public val getGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_global_canvas_transform")

    public val getFinalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_final_transform")

    public val getScreenTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_screen_transform")

    public val getVisibleRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_visible_rect")

    public val setTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_transparent_background")

    public val hasTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "has_transparent_background")

    public val setMsaa2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_msaa_2d")

    public val getMsaa2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_msaa_2d")

    public val setMsaa3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_msaa_3d")

    public val getMsaa3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_msaa_3d")

    public val setScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_screen_space_aa")

    public val getScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_screen_space_aa")

    public val setUseTaaPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_use_taa")

    public val isUsingTaaPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_using_taa")

    public val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_debanding")

    public val isUsingDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_debanding")

    public val setUseOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_occlusion_culling")

    public val isUsingOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_occlusion_culling")

    public val setDebugDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_debug_draw")

    public val getDebugDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_debug_draw")

    public val getRenderInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_render_info")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_texture")

    public val setPhysicsObjectPickingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_physics_object_picking")

    public val getPhysicsObjectPickingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_physics_object_picking")

    public val setPhysicsObjectPickingSortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_physics_object_picking_sort")

    public val getPhysicsObjectPickingSortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_physics_object_picking_sort")

    public val getViewportRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_viewport_rid")

    public val pushTextInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "push_text_input")

    public val pushInputPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "push_input")

    public val pushUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "push_unhandled_input")

    public val getCamera2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_camera_2d")

    public val setAsAudioListener2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_as_audio_listener_2d")

    public val isAudioListener2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_audio_listener_2d")

    public val getMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_mouse_position")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "warp_mouse")

    public val updateMouseCursorStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "update_mouse_cursor_state")

    public val guiGetDragDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_get_drag_data")

    public val guiIsDraggingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_is_dragging")

    public val guiIsDragSuccessfulPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_is_drag_successful")

    public val guiReleaseFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_release_focus")

    public val guiGetFocusOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_get_focus_owner")

    public val setDisableInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_disable_input")

    public val isInputDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_input_disabled")

    public val setPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_size")

    public val getPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_size")

    public val setPositionalShadowAtlas16BitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_16_bits")

    public val getPositionalShadowAtlas16BitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_16_bits")

    public val setSnapControlsToPixelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_controls_to_pixels")

    public val isSnapControlsToPixelsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_controls_to_pixels_enabled")

    public val setSnap2dTransformsToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_2d_transforms_to_pixel")

    public val isSnap2dTransformsToPixelEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_2d_transforms_to_pixel_enabled")

    public val setSnap2dVerticesToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_2d_vertices_to_pixel")

    public val isSnap2dVerticesToPixelEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_2d_vertices_to_pixel_enabled")

    public val setPositionalShadowAtlasQuadrantSubdivPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_quadrant_subdiv")

    public val getPositionalShadowAtlasQuadrantSubdivPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_quadrant_subdiv")

    public val setInputAsHandledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_input_as_handled")

    public val isInputHandledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_input_handled")

    public val setHandleInputLocallyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_handle_input_locally")

    public val isHandlingInputLocallyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_handling_input_locally")

    public val setDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_default_canvas_item_texture_filter")

    public val getDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_default_canvas_item_texture_filter")

    public val setEmbeddingSubwindowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_embedding_subwindows")

    public val isEmbeddingSubwindowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_embedding_subwindows")

    public val setCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_cull_mask")

    public val getCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_cull_mask")

    public val setCanvasCullMaskBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_cull_mask_bit")

    public val getCanvasCullMaskBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_cull_mask_bit")

    public val setDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_default_canvas_item_texture_repeat")

    public val getDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_default_canvas_item_texture_repeat")

    public val setSdfOversizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_sdf_oversize")

    public val getSdfOversizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_sdf_oversize")

    public val setSdfScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_sdf_scale")

    public val getSdfScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_sdf_scale")

    public val setMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_mesh_lod_threshold")

    public val getMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_mesh_lod_threshold")

    public val setWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_world_3d")

    public val getWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_world_3d")

    public val findWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "find_world_3d")

    public val setUseOwnWorld3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_own_world_3d")

    public val isUsingOwnWorld3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_own_world_3d")

    public val getCamera3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_camera_3d")

    public val setAsAudioListener3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_as_audio_listener_3d")

    public val isAudioListener3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_audio_listener_3d")

    public val setDisable3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_disable_3d")

    public val is3dDisabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_3d_disabled")

    public val setUseXrPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_use_xr")

    public val isUsingXrPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_using_xr")

    public val setScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_scaling_3d_mode")

    public val getScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_scaling_3d_mode")

    public val setScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_scaling_3d_scale")

    public val getScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_scaling_3d_scale")

    public val setFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_fsr_sharpness")

    public val getFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_fsr_sharpness")

    public val setTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_texture_mipmap_bias")

    public val getTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_texture_mipmap_bias")

    public val setVrsModePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_vrs_mode")

    public val getVrsModePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_vrs_mode")

    public val setVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_vrs_texture")

    public val getVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_vrs_texture")
  }
}
