// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class Crypto : RefCounted() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CRYPTO, scriptIndex)
    return true
  }

  public fun generateRandomBytes(size: Int): PackedByteArray {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.generateRandomBytesPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun generateRsa(size: Int): CryptoKey? {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.generateRsaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CryptoKey?)
  }

  @JvmOverloads
  public fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000",
  ): X509Certificate? {
    TransferContext.writeArguments(OBJECT to key, STRING to issuerName, STRING to notBefore, STRING to notAfter)
    TransferContext.callMethod(rawPtr, MethodBindings.generateSelfSignedCertificatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as X509Certificate?)
  }

  public fun sign(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    key: CryptoKey,
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, OBJECT to key)
    TransferContext.callMethod(rawPtr, MethodBindings.signPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun verify(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    signature: PackedByteArray,
    key: CryptoKey,
  ): Boolean {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, PACKED_BYTE_ARRAY to signature, OBJECT to key)
    TransferContext.callMethod(rawPtr, MethodBindings.verifyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun encrypt(key: CryptoKey, plaintext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to plaintext)
    TransferContext.callMethod(rawPtr, MethodBindings.encryptPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun decrypt(key: CryptoKey, ciphertext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to ciphertext)
    TransferContext.callMethod(rawPtr, MethodBindings.decryptPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun hmacDigest(
    hashType: HashingContext.HashType,
    key: PackedByteArray,
    msg: PackedByteArray,
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key, PACKED_BYTE_ARRAY to msg)
    TransferContext.callMethod(rawPtr, MethodBindings.hmacDigestPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun constantTimeCompare(trusted: PackedByteArray, received: PackedByteArray): Boolean {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to trusted, PACKED_BYTE_ARRAY to received)
    TransferContext.callMethod(rawPtr, MethodBindings.constantTimeComparePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val generateRandomBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "generate_random_bytes")

    public val generateRsaPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "generate_rsa")

    public val generateSelfSignedCertificatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "generate_self_signed_certificate")

    public val signPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "sign")

    public val verifyPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "verify")

    public val encryptPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "encrypt")

    public val decryptPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "decrypt")

    public val hmacDigestPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "hmac_digest")

    public val constantTimeComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "constant_time_compare")
  }
}
