// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
public object IP : Object() {
  public final const val RESOLVER_MAX_QUERIES: Long = 256

  public final const val RESOLVER_INVALID_ID: Long = -1

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_IP)
    return false
  }

  @JvmOverloads
  public fun resolveHostname(host: String, ipType: Type = IP.Type.TYPE_ANY): String {
    TransferContext.writeArguments(STRING to host, LONG to ipType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resolveHostnamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun resolveHostnameAddresses(host: String, ipType: Type = IP.Type.TYPE_ANY):
      PackedStringArray {
    TransferContext.writeArguments(STRING to host, LONG to ipType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resolveHostnameAddressesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun resolveHostnameQueueItem(host: String, ipType: Type = IP.Type.TYPE_ANY): Int {
    TransferContext.writeArguments(STRING to host, LONG to ipType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.resolveHostnameQueueItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getResolveItemStatus(id: Int): ResolverStatus {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getResolveItemStatusPtr, LONG)
    return IP.ResolverStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getResolveItemAddress(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getResolveItemAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getResolveItemAddresses(id: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getResolveItemAddressesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun eraseResolveItem(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.eraseResolveItemPtr, NIL)
  }

  public fun getLocalAddresses(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalAddressesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getLocalInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  @JvmOverloads
  public fun clearCache(hostname: String = "") {
    TransferContext.writeArguments(STRING to hostname)
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachePtr, NIL)
  }

  public enum class ResolverStatus(
    id: Long,
  ) {
    RESOLVER_STATUS_NONE(0),
    RESOLVER_STATUS_WAITING(1),
    RESOLVER_STATUS_DONE(2),
    RESOLVER_STATUS_ERROR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ResolverStatus = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Type(
    id: Long,
  ) {
    TYPE_NONE(0),
    TYPE_IPV4(1),
    TYPE_IPV6(2),
    TYPE_ANY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Type = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val resolveHostnamePtr: VoidPtr = TypeManager.getMethodBindPtr("IP", "resolve_hostname")

    public val resolveHostnameAddressesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "resolve_hostname_addresses")

    public val resolveHostnameQueueItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "resolve_hostname_queue_item")

    public val getResolveItemStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "get_resolve_item_status")

    public val getResolveItemAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "get_resolve_item_address")

    public val getResolveItemAddressesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "get_resolve_item_addresses")

    public val eraseResolveItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "erase_resolve_item")

    public val getLocalAddressesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "get_local_addresses")

    public val getLocalInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IP", "get_local_interfaces")

    public val clearCachePtr: VoidPtr = TypeManager.getMethodBindPtr("IP", "clear_cache")
  }
}
