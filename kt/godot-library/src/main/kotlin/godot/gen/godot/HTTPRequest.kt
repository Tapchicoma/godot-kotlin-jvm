// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class HTTPRequest : Node() {
  public val requestCompleted: Signal4<Long, Long, PackedStringArray, PackedByteArray> by
      signal("result", "responseCode", "headers", "body")

  public var downloadFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDownloadFilePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDownloadFilePtr, NIL)
    }

  public var downloadChunkSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDownloadChunkSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDownloadChunkSizePtr, NIL)
    }

  public var useThreads: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingThreadsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseThreadsPtr, NIL)
    }

  public var acceptGzip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAcceptingGzipPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAcceptGzipPtr, NIL)
    }

  public var bodySizeLimit: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodySizeLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBodySizeLimitPtr, NIL)
    }

  public var maxRedirects: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxRedirectsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxRedirectsPtr, NIL)
    }

  public var timeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeoutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTimeoutPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HTTPREQUEST, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun request(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestData: String = "",
  ): GodotError {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, STRING to requestData)
    TransferContext.callMethod(rawPtr, MethodBindings.requestPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun requestRaw(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestDataRaw: PackedByteArray = PackedByteArray(),
  ): GodotError {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, PACKED_BYTE_ARRAY to requestDataRaw)
    TransferContext.callMethod(rawPtr, MethodBindings.requestRawPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun cancelRequest() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cancelRequestPtr, NIL)
  }

  public fun setTlsOptions(clientOptions: TLSOptions) {
    TransferContext.writeArguments(OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.setTlsOptionsPtr, NIL)
  }

  public fun getHttpClientStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHttpClientStatusPtr, LONG)
    return HTTPClient.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getDownloadedBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDownloadedBytesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBodySize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBodySizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setHttpProxy(host: String, port: Int) {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setHttpProxyPtr, NIL)
  }

  public fun setHttpsProxy(host: String, port: Int) {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setHttpsProxyPtr, NIL)
  }

  public enum class Result(
    id: Long,
  ) {
    RESULT_SUCCESS(0),
    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),
    RESULT_CANT_CONNECT(2),
    RESULT_CANT_RESOLVE(3),
    RESULT_CONNECTION_ERROR(4),
    RESULT_TLS_HANDSHAKE_ERROR(5),
    RESULT_NO_RESPONSE(6),
    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),
    RESULT_BODY_DECOMPRESS_FAILED(8),
    RESULT_REQUEST_FAILED(9),
    RESULT_DOWNLOAD_FILE_CANT_OPEN(10),
    RESULT_DOWNLOAD_FILE_WRITE_ERROR(11),
    RESULT_REDIRECT_LIMIT_REACHED(12),
    RESULT_TIMEOUT(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Result = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val requestPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPRequest", "request")

    public val requestRawPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPRequest", "request_raw")

    public val cancelRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "cancel_request")

    public val setTlsOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_tls_options")

    public val getHttpClientStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_http_client_status")

    public val setUseThreadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_use_threads")

    public val isUsingThreadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "is_using_threads")

    public val setAcceptGzipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_accept_gzip")

    public val isAcceptingGzipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "is_accepting_gzip")

    public val setBodySizeLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_body_size_limit")

    public val getBodySizeLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_body_size_limit")

    public val setMaxRedirectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_max_redirects")

    public val getMaxRedirectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_max_redirects")

    public val setDownloadFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_download_file")

    public val getDownloadFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_download_file")

    public val getDownloadedBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_downloaded_bytes")

    public val getBodySizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_body_size")

    public val setTimeoutPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPRequest", "set_timeout")

    public val getTimeoutPtr: VoidPtr = TypeManager.getMethodBindPtr("HTTPRequest", "get_timeout")

    public val setDownloadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_download_chunk_size")

    public val getDownloadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_download_chunk_size")

    public val setHttpProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_http_proxy")

    public val setHttpsProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_https_proxy")
  }
}
