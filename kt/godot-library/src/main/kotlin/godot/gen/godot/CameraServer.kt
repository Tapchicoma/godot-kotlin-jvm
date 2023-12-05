// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public object CameraServer : Object() {
  public val cameraFeedAdded: Signal1<Long> by signal("id")

  public val cameraFeedRemoved: Signal1<Long> by signal("id")

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_CAMERASERVER)
    return false
  }

  public fun getFeed(index: Int): CameraFeed? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFeedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CameraFeed?)
  }

  public fun getFeedCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFeedCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun feeds(): VariantArray<CameraFeed> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.feedsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<CameraFeed>)
  }

  public fun addFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, MethodBindings.addFeedPtr, NIL)
  }

  public fun removeFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, MethodBindings.removeFeedPtr, NIL)
  }

  public enum class FeedImage(
    id: Long,
  ) {
    FEED_RGBA_IMAGE(0),
    FEED_YCBCR_IMAGE(0),
    FEED_Y_IMAGE(0),
    FEED_CBCR_IMAGE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FeedImage = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "get_feed")

    public val getFeedCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "get_feed_count")

    public val feedsPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "feeds")

    public val addFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "add_feed")

    public val removeFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "remove_feed")
  }
}
