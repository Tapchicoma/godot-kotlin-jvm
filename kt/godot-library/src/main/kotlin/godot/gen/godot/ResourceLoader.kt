// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
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
public object ResourceLoader : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RESOURCELOADER)
    return false
  }

  @JvmOverloads
  public fun loadThreadedRequest(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to useSubThreads, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedRequestPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun loadThreadedGetStatus(path: String, progress: VariantArray<Any?> =
      godot.core.variantArrayOf()): ThreadLoadStatus {
    TransferContext.writeArguments(STRING to path, ARRAY to progress)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedGetStatusPtr, LONG)
    return ResourceLoader.ThreadLoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun loadThreadedGet(path: String): Resource? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  @JvmOverloads
  public fun load(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public fun getRecognizedExtensionsForType(type: String): PackedStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, MethodBindings.getRecognizedExtensionsForTypePtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun addResourceFormatLoader(formatLoader: ResourceFormatLoader, atFront: Boolean = false) {
    TransferContext.writeArguments(OBJECT to formatLoader, BOOL to atFront)
    TransferContext.callMethod(rawPtr, MethodBindings.addResourceFormatLoaderPtr, NIL)
  }

  public fun removeResourceFormatLoader(formatLoader: ResourceFormatLoader) {
    TransferContext.writeArguments(OBJECT to formatLoader)
    TransferContext.callMethod(rawPtr, MethodBindings.removeResourceFormatLoaderPtr, NIL)
  }

  public fun setAbortOnMissingResources(abort: Boolean) {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(rawPtr, MethodBindings.setAbortOnMissingResourcesPtr, NIL)
  }

  public fun getDependencies(path: String): PackedStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getDependenciesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, MethodBindings.existsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getResourceUid(path: String): Long {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getResourceUidPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class ThreadLoadStatus(
    id: Long,
  ) {
    THREAD_LOAD_INVALID_RESOURCE(0),
    THREAD_LOAD_IN_PROGRESS(1),
    THREAD_LOAD_FAILED(2),
    THREAD_LOAD_LOADED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ThreadLoadStatus = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CacheMode(
    id: Long,
  ) {
    CACHE_MODE_IGNORE(0),
    CACHE_MODE_REUSE(1),
    CACHE_MODE_REPLACE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CacheMode = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val loadThreadedRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_request")

    public val loadThreadedGetStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get_status")

    public val loadThreadedGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "load")

    public val getRecognizedExtensionsForTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_recognized_extensions_for_type")

    public val addResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "add_resource_format_loader")

    public val removeResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "remove_resource_format_loader")

    public val setAbortOnMissingResourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "set_abort_on_missing_resources")

    public val getDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_dependencies")

    public val hasCachedPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "has_cached")

    public val existsPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "exists")

    public val getResourceUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_resource_uid")
  }
}
