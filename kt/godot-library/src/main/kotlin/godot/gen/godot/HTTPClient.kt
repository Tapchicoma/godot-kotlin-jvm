// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
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
public open class HTTPClient : RefCounted() {
  public var blockingModeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBlockingModeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlockingModePtr, NIL)
    }

  public var connection: StreamPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConnectionPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as StreamPeer?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionPtr, NIL)
    }

  public var readChunkSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReadChunkSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setReadChunkSizePtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HTTPCLIENT, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun connectToHost(
    host: String,
    port: Int = -1,
    tlsOptions: TLSOptions? = null,
  ): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong(), OBJECT to tlsOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun requestRaw(
    method: Method,
    url: String,
    headers: PackedStringArray,
    body: PackedByteArray,
  ): GodotError {
    TransferContext.writeArguments(LONG to method.id, STRING to url, PACKED_STRING_ARRAY to headers, PACKED_BYTE_ARRAY to body)
    TransferContext.callMethod(rawPtr, MethodBindings.requestRawPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun request(
    method: Method,
    url: String,
    headers: PackedStringArray,
    body: String = "",
  ): GodotError {
    TransferContext.writeArguments(LONG to method.id, STRING to url, PACKED_STRING_ARRAY to headers, STRING to body)
    TransferContext.callMethod(rawPtr, MethodBindings.requestPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public fun hasResponse(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasResponsePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isResponseChunked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isResponseChunkedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getResponseCode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResponseCodePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getResponseHeaders(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResponseHeadersPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getResponseHeadersAsDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResponseHeadersAsDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getResponseBodyLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResponseBodyLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun readResponseBodyChunk(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readResponseBodyChunkPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return HTTPClient.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setHttpProxy(host: String, port: Int) {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setHttpProxyPtr, NIL)
  }

  public fun setHttpsProxy(host: String, port: Int) {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setHttpsProxyPtr, NIL)
  }

  public fun queryStringFromDict(fields: Dictionary<Any?, Any?>): String {
    TransferContext.writeArguments(DICTIONARY to fields)
    TransferContext.callMethod(rawPtr, MethodBindings.queryStringFromDictPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public enum class Method(
    id: Long,
  ) {
    METHOD_GET(0),
    METHOD_HEAD(1),
    METHOD_POST(2),
    METHOD_PUT(3),
    METHOD_DELETE(4),
    METHOD_OPTIONS(5),
    METHOD_TRACE(6),
    METHOD_CONNECT(7),
    METHOD_PATCH(8),
    METHOD_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Method = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Status(
    id: Long,
  ) {
    STATUS_DISCONNECTED(0),
    STATUS_RESOLVING(1),
    STATUS_CANT_RESOLVE(2),
    STATUS_CONNECTING(3),
    STATUS_CANT_CONNECT(4),
    STATUS_CONNECTED(5),
    STATUS_REQUESTING(6),
    STATUS_BODY(7),
    STATUS_CONNECTION_ERROR(8),
    STATUS_TLS_HANDSHAKE_ERROR(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Status = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ResponseCode(
    id: Long,
  ) {
    RESPONSE_CONTINUE(100),
    RESPONSE_SWITCHING_PROTOCOLS(101),
    RESPONSE_PROCESSING(102),
    RESPONSE_OK(200),
    RESPONSE_CREATED(201),
    RESPONSE_ACCEPTED(202),
    RESPONSE_NON_AUTHORITATIVE_INFORMATION(203),
    RESPONSE_NO_CONTENT(204),
    RESPONSE_RESET_CONTENT(205),
    RESPONSE_PARTIAL_CONTENT(206),
    RESPONSE_MULTI_STATUS(207),
    RESPONSE_ALREADY_REPORTED(208),
    RESPONSE_IM_USED(226),
    RESPONSE_MULTIPLE_CHOICES(300),
    RESPONSE_MOVED_PERMANENTLY(301),
    RESPONSE_FOUND(302),
    RESPONSE_SEE_OTHER(303),
    RESPONSE_NOT_MODIFIED(304),
    RESPONSE_USE_PROXY(305),
    RESPONSE_SWITCH_PROXY(306),
    RESPONSE_TEMPORARY_REDIRECT(307),
    RESPONSE_PERMANENT_REDIRECT(308),
    RESPONSE_BAD_REQUEST(400),
    RESPONSE_UNAUTHORIZED(401),
    RESPONSE_PAYMENT_REQUIRED(402),
    RESPONSE_FORBIDDEN(403),
    RESPONSE_NOT_FOUND(404),
    RESPONSE_METHOD_NOT_ALLOWED(405),
    RESPONSE_NOT_ACCEPTABLE(406),
    RESPONSE_PROXY_AUTHENTICATION_REQUIRED(407),
    RESPONSE_REQUEST_TIMEOUT(408),
    RESPONSE_CONFLICT(409),
    RESPONSE_GONE(410),
    RESPONSE_LENGTH_REQUIRED(411),
    RESPONSE_PRECONDITION_FAILED(412),
    RESPONSE_REQUEST_ENTITY_TOO_LARGE(413),
    RESPONSE_REQUEST_URI_TOO_LONG(414),
    RESPONSE_UNSUPPORTED_MEDIA_TYPE(415),
    RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE(416),
    RESPONSE_EXPECTATION_FAILED(417),
    RESPONSE_IM_A_TEAPOT(418),
    RESPONSE_MISDIRECTED_REQUEST(421),
    RESPONSE_UNPROCESSABLE_ENTITY(422),
    RESPONSE_LOCKED(423),
    RESPONSE_FAILED_DEPENDENCY(424),
    RESPONSE_UPGRADE_REQUIRED(426),
    RESPONSE_PRECONDITION_REQUIRED(428),
    RESPONSE_TOO_MANY_REQUESTS(429),
    RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE(431),
    RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS(451),
    RESPONSE_INTERNAL_SERVER_ERROR(500),
    RESPONSE_NOT_IMPLEMENTED(501),
    RESPONSE_BAD_GATEWAY(502),
    RESPONSE_SERVICE_UNAVAILABLE(503),
    RESPONSE_GATEWAY_TIMEOUT(504),
    RESPONSE_HTTP_VERSION_NOT_SUPPORTED(505),
    RESPONSE_VARIANT_ALSO_NEGOTIATES(506),
    RESPONSE_INSUFFICIENT_STORAGE(507),
    RESPONSE_LOOP_DETECTED(508),
    RESPONSE_NOT_EXTENDED(510),
    RESPONSE_NETWORK_AUTH_REQUIRED(511),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ResponseCode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "connect_to_host")

    public val setConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "set_connection")

    public val getConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_connection")

    public val requestRawPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "request_raw")

    public val requestPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "request")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "close")

    public val hasResponsePtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "has_response")

    public val isResponseChunkedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "is_response_chunked")

    public val getResponseCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_response_code")

    public val getResponseHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_response_headers")

    public val getResponseHeadersAsDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_response_headers_as_dictionary")

    public val getResponseBodyLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_response_body_length")

    public val readResponseBodyChunkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "read_response_body_chunk")

    public val setReadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "set_read_chunk_size")

    public val getReadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "get_read_chunk_size")

    public val setBlockingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "set_blocking_mode")

    public val isBlockingModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "is_blocking_mode_enabled")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "get_status")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPClient", "poll")

    public val setHttpProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "set_http_proxy")

    public val setHttpsProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "set_https_proxy")

    public val queryStringFromDictPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPClient", "query_string_from_dict")
  }
}
