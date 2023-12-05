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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class CameraTexture : Texture2D() {
  public var cameraFeedId: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraFeedIdPtr, NIL)
    }

  public var whichFeed: CameraServer.FeedImage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWhichFeedPtr, LONG)
      return CameraServer.FeedImage.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setWhichFeedPtr, NIL)
    }

  public var cameraIsActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraActivePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERATEXTURE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_camera_feed_id")

    public val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_camera_feed_id")

    public val setWhichFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_which_feed")

    public val getWhichFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_which_feed")

    public val setCameraActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_camera_active")

    public val getCameraActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_camera_active")
  }
}
