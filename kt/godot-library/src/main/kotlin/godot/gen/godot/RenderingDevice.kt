// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.RenderingDevice.BarrierMask
import godot.RenderingDevice.PipelineDynamicStateFlags
import godot.RenderingDevice.StorageBufferUsage
import godot.RenderingDevice.TextureUsageBits
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedInt64Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class RenderingDevice internal constructor() : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERINGDEVICE, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun textureCreate(
    format: RDTextureFormat,
    view: RDTextureView,
    `data`: VariantArray<PackedByteArray> = godot.core.variantArrayOf(),
  ): RID {
    TransferContext.writeArguments(OBJECT to format, OBJECT to view, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun textureCreateShared(view: RDTextureView, withTexture: RID): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreateSharedPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun textureCreateSharedFromSlice(
    view: RDTextureView,
    withTexture: RID,
    layer: Long,
    mipmap: Long,
    mipmaps: Long = 1,
    sliceType: TextureSliceType = RenderingDevice.TextureSliceType.TEXTURE_SLICE_2D,
  ): RID {
    TransferContext.writeArguments(OBJECT to view, _RID to withTexture, LONG to layer, LONG to mipmap, LONG to mipmaps, LONG to sliceType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCreateSharedFromSlicePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun textureUpdate(
    texture: RID,
    layer: Long,
    `data`: PackedByteArray,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, LONG to layer, PACKED_BYTE_ARRAY to data, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun textureGetData(texture: RID, layer: Long): PackedByteArray {
    TransferContext.writeArguments(_RID to texture, LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun textureIsFormatSupportedForUsage(format: DataFormat, usageFlags: TextureUsageBits):
      Boolean {
    TransferContext.writeArguments(LONG to format.id, LONG to usageFlags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsFormatSupportedForUsagePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun textureIsShared(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsSharedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun textureIsValid(texture: RID): Boolean {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun textureCopy(
    fromTexture: RID,
    toTexture: RID,
    fromPos: Vector3,
    toPos: Vector3,
    size: Vector3,
    srcMipmap: Long,
    dstMipmap: Long,
    srcLayer: Long,
    dstLayer: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, VECTOR3 to fromPos, VECTOR3 to toPos, VECTOR3 to size, LONG to srcMipmap, LONG to dstMipmap, LONG to srcLayer, LONG to dstLayer, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureCopyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun textureClear(
    texture: RID,
    color: Color,
    baseMipmap: Long,
    mipmapCount: Long,
    baseLayer: Long,
    layerCount: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to texture, COLOR to color, LONG to baseMipmap, LONG to mipmapCount, LONG to baseLayer, LONG to layerCount, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureClearPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun textureResolveMultisample(
    fromTexture: RID,
    toTexture: RID,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to fromTexture, _RID to toTexture, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.textureResolveMultisamplePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun textureGetNativeHandle(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun framebufferFormatCreate(attachments: VariantArray<RDAttachmentFormat>, viewCount: Long
      = 1): Long {
    TransferContext.writeArguments(ARRAY to attachments, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun framebufferFormatCreateMultipass(
    attachments: VariantArray<RDAttachmentFormat>,
    passes: VariantArray<RDFramebufferPass>,
    viewCount: Long = 1,
  ): Long {
    TransferContext.writeArguments(ARRAY to attachments, ARRAY to passes, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreateMultipassPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun framebufferFormatCreateEmpty(samples: TextureSamples =
      RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1): Long {
    TransferContext.writeArguments(LONG to samples.id)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatCreateEmptyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun framebufferFormatGetTextureSamples(format: Long, renderPass: Long = 0):
      TextureSamples {
    TransferContext.writeArguments(LONG to format, LONG to renderPass)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferFormatGetTextureSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun framebufferCreate(
    textures: VariantArray<RID>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1,
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun framebufferCreateMultipass(
    textures: VariantArray<RID>,
    passes: VariantArray<RDFramebufferPass>,
    validateWithFormat: Long = -1,
    viewCount: Long = 1,
  ): RID {
    TransferContext.writeArguments(ARRAY to textures, ARRAY to passes, LONG to validateWithFormat, LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreateMultipassPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun framebufferCreateEmpty(
    size: Vector2i,
    samples: TextureSamples = RenderingDevice.TextureSamples.TEXTURE_SAMPLES_1,
    validateWithFormat: Long = -1,
  ): RID {
    TransferContext.writeArguments(VECTOR2I to size, LONG to samples.id, LONG to validateWithFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferCreateEmptyPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun framebufferGetFormat(framebuffer: RID): Long {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferGetFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun framebufferIsValid(framebuffer: RID): Boolean {
    TransferContext.writeArguments(_RID to framebuffer)
    TransferContext.callMethod(rawPtr, MethodBindings.framebufferIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun samplerCreate(state: RDSamplerState): RID {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, MethodBindings.samplerCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun samplerIsFormatSupportedForFilter(format: DataFormat, samplerFilter: SamplerFilter):
      Boolean {
    TransferContext.writeArguments(LONG to format.id, LONG to samplerFilter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.samplerIsFormatSupportedForFilterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun vertexBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    useAsStorage: Boolean = false,
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, BOOL to useAsStorage)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun vertexFormatCreate(vertexDescriptions: VariantArray<RDVertexAttribute>): Long {
    TransferContext.writeArguments(ARRAY to vertexDescriptions)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexFormatCreatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun vertexArrayCreate(
    vertexCount: Long,
    vertexFormat: Long,
    srcBuffers: VariantArray<RID>,
    offsets: PackedInt64Array = PackedInt64Array(),
  ): RID {
    TransferContext.writeArguments(LONG to vertexCount, LONG to vertexFormat, ARRAY to srcBuffers, PACKED_INT_64_ARRAY to offsets)
    TransferContext.callMethod(rawPtr, MethodBindings.vertexArrayCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun indexBufferCreate(
    sizeIndices: Long,
    format: IndexBufferFormat,
    `data`: PackedByteArray = PackedByteArray(),
    useRestartIndices: Boolean = false,
  ): RID {
    TransferContext.writeArguments(LONG to sizeIndices, LONG to format.id, PACKED_BYTE_ARRAY to data, BOOL to useRestartIndices)
    TransferContext.callMethod(rawPtr, MethodBindings.indexBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun indexArrayCreate(
    indexBuffer: RID,
    indexOffset: Long,
    indexCount: Long,
  ): RID {
    TransferContext.writeArguments(_RID to indexBuffer, LONG to indexOffset, LONG to indexCount)
    TransferContext.callMethod(rawPtr, MethodBindings.indexArrayCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun shaderCompileSpirvFromSource(shaderSource: RDShaderSource, allowCache: Boolean = true):
      RDShaderSPIRV? {
    TransferContext.writeArguments(OBJECT to shaderSource, BOOL to allowCache)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCompileSpirvFromSourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RDShaderSPIRV?)
  }

  @JvmOverloads
  public fun shaderCompileBinaryFromSpirv(spirvData: RDShaderSPIRV, name: String = ""):
      PackedByteArray {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCompileBinaryFromSpirvPtr,
        PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  @JvmOverloads
  public fun shaderCreateFromSpirv(spirvData: RDShaderSPIRV, name: String = ""): RID {
    TransferContext.writeArguments(OBJECT to spirvData, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreateFromSpirvPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun shaderCreateFromBytecode(binaryData: PackedByteArray): RID {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to binaryData)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreateFromBytecodePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun shaderGetVertexInputAttributeMask(shader: RID): Long {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetVertexInputAttributeMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun uniformBufferCreate(sizeBytes: Long, `data`: PackedByteArray = PackedByteArray()):
      RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun storageBufferCreate(
    sizeBytes: Long,
    `data`: PackedByteArray = PackedByteArray(),
    usage: StorageBufferUsage = RenderingDevice.StorageBufferUsageValue(0),
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, PACKED_BYTE_ARRAY to data, LONG to usage.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.storageBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun textureBufferCreate(
    sizeBytes: Long,
    format: DataFormat,
    `data`: PackedByteArray = PackedByteArray(),
  ): RID {
    TransferContext.writeArguments(LONG to sizeBytes, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.textureBufferCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun uniformSetCreate(
    uniforms: VariantArray<RDUniform>,
    shader: RID,
    shaderSet: Long,
  ): RID {
    TransferContext.writeArguments(ARRAY to uniforms, _RID to shader, LONG to shaderSet)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformSetCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun uniformSetIsValid(uniformSet: RID): Boolean {
    TransferContext.writeArguments(_RID to uniformSet)
    TransferContext.callMethod(rawPtr, MethodBindings.uniformSetIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun bufferUpdate(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    `data`: PackedByteArray,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, PACKED_BYTE_ARRAY to data, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun bufferClear(
    buffer: RID,
    offset: Long,
    sizeBytes: Long,
    postBarrier: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
  ): GodotError {
    TransferContext.writeArguments(_RID to buffer, LONG to offset, LONG to sizeBytes, LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferClearPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun bufferGetData(
    buffer: RID,
    offsetBytes: Long = 0,
    sizeBytes: Long = 0,
  ): PackedByteArray {
    TransferContext.writeArguments(_RID to buffer, LONG to offsetBytes, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.bufferGetDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  @JvmOverloads
  public fun renderPipelineCreate(
    shader: RID,
    framebufferFormat: Long,
    vertexFormat: Long,
    primitive: RenderPrimitive,
    rasterizationState: RDPipelineRasterizationState,
    multisampleState: RDPipelineMultisampleState,
    stencilState: RDPipelineDepthStencilState,
    colorBlendState: RDPipelineColorBlendState,
    dynamicStateFlags: PipelineDynamicStateFlags =
        RenderingDevice.PipelineDynamicStateFlagsValue(0),
    forRenderPass: Long = 0,
    specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
        godot.core.variantArrayOf(),
  ): RID {
    TransferContext.writeArguments(_RID to shader, LONG to framebufferFormat, LONG to vertexFormat, LONG to primitive.id, OBJECT to rasterizationState, OBJECT to multisampleState, OBJECT to stencilState, OBJECT to colorBlendState, LONG to dynamicStateFlags.flag, LONG to forRenderPass, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr, MethodBindings.renderPipelineCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun renderPipelineIsValid(renderPipeline: RID): Boolean {
    TransferContext.writeArguments(_RID to renderPipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.renderPipelineIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun computePipelineCreate(shader: RID,
      specializationConstants: VariantArray<RDPipelineSpecializationConstant> =
      godot.core.variantArrayOf()): RID {
    TransferContext.writeArguments(_RID to shader, ARRAY to specializationConstants)
    TransferContext.callMethod(rawPtr, MethodBindings.computePipelineCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun computePipelineIsValid(computePipeline: RID): Boolean {
    TransferContext.writeArguments(_RID to computePipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.computePipelineIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  @JvmOverloads
  public fun screenGetWidth(screen: Int = 0): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun screenGetHeight(screen: Int = 0): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun screenGetFramebufferFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.screenGetFramebufferFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun drawListBeginForScreen(screen: Int = 0, clearColor: Color = Color(Color(0, 0, 0, 1))):
      Long {
    TransferContext.writeArguments(LONG to screen.toLong(), COLOR to clearColor)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginForScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun drawListBegin(
    framebuffer: RID,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Float = 1.0f,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<RID> = godot.core.variantArrayOf(),
  ): Long {
    TransferContext.writeArguments(_RID to framebuffer, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth.toDouble(), LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  @JvmOverloads
  public fun drawListBeginSplit(
    framebuffer: RID,
    splits: Long,
    initialColorAction: InitialAction,
    finalColorAction: FinalAction,
    initialDepthAction: InitialAction,
    finalDepthAction: FinalAction,
    clearColorValues: PackedColorArray = PackedColorArray(),
    clearDepth: Float = 1.0f,
    clearStencil: Long = 0,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    storageTextures: VariantArray<RID> = godot.core.variantArrayOf(),
  ): PackedInt64Array {
    TransferContext.writeArguments(_RID to framebuffer, LONG to splits, LONG to initialColorAction.id, LONG to finalColorAction.id, LONG to initialDepthAction.id, LONG to finalDepthAction.id, PACKED_COLOR_ARRAY to clearColorValues, DOUBLE to clearDepth.toDouble(), LONG to clearStencil, RECT2 to region, ARRAY to storageTextures)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBeginSplitPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public fun drawListSetBlendConstants(drawList: Long, color: Color) {
    TransferContext.writeArguments(LONG to drawList, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSetBlendConstantsPtr, NIL)
  }

  public fun drawListBindRenderPipeline(drawList: Long, renderPipeline: RID) {
    TransferContext.writeArguments(LONG to drawList, _RID to renderPipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindRenderPipelinePtr, NIL)
  }

  public fun drawListBindUniformSet(
    drawList: Long,
    uniformSet: RID,
    setIndex: Long,
  ) {
    TransferContext.writeArguments(LONG to drawList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindUniformSetPtr, NIL)
  }

  public fun drawListBindVertexArray(drawList: Long, vertexArray: RID) {
    TransferContext.writeArguments(LONG to drawList, _RID to vertexArray)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindVertexArrayPtr, NIL)
  }

  public fun drawListBindIndexArray(drawList: Long, indexArray: RID) {
    TransferContext.writeArguments(LONG to drawList, _RID to indexArray)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListBindIndexArrayPtr, NIL)
  }

  public fun drawListSetPushConstant(
    drawList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long,
  ) {
    TransferContext.writeArguments(LONG to drawList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSetPushConstantPtr, NIL)
  }

  @JvmOverloads
  public fun drawListDraw(
    drawList: Long,
    useIndices: Boolean,
    instances: Long,
    proceduralVertexCount: Long = 0,
  ) {
    TransferContext.writeArguments(LONG to drawList, BOOL to useIndices, LONG to instances, LONG to proceduralVertexCount)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListDrawPtr, NIL)
  }

  @JvmOverloads
  public fun drawListEnableScissor(drawList: Long, rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)) {
    TransferContext.writeArguments(LONG to drawList, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListEnableScissorPtr, NIL)
  }

  public fun drawListDisableScissor(drawList: Long) {
    TransferContext.writeArguments(LONG to drawList)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListDisableScissorPtr, NIL)
  }

  public fun drawListSwitchToNextPass(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSwitchToNextPassPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun drawListSwitchToNextPassSplit(splits: Long): PackedInt64Array {
    TransferContext.writeArguments(LONG to splits)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListSwitchToNextPassSplitPtr,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  @JvmOverloads
  public fun drawListEnd(postBarrier: BarrierMask =
      RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS) {
    TransferContext.writeArguments(LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.drawListEndPtr, NIL)
  }

  @JvmOverloads
  public fun computeListBegin(allowDrawOverlap: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to allowDrawOverlap)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun computeListBindComputePipeline(computeList: Long, computePipeline: RID) {
    TransferContext.writeArguments(LONG to computeList, _RID to computePipeline)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBindComputePipelinePtr, NIL)
  }

  public fun computeListSetPushConstant(
    computeList: Long,
    buffer: PackedByteArray,
    sizeBytes: Long,
  ) {
    TransferContext.writeArguments(LONG to computeList, PACKED_BYTE_ARRAY to buffer, LONG to sizeBytes)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListSetPushConstantPtr, NIL)
  }

  public fun computeListBindUniformSet(
    computeList: Long,
    uniformSet: RID,
    setIndex: Long,
  ) {
    TransferContext.writeArguments(LONG to computeList, _RID to uniformSet, LONG to setIndex)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListBindUniformSetPtr, NIL)
  }

  public fun computeListDispatch(
    computeList: Long,
    xGroups: Long,
    yGroups: Long,
    zGroups: Long,
  ) {
    TransferContext.writeArguments(LONG to computeList, LONG to xGroups, LONG to yGroups, LONG to zGroups)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListDispatchPtr, NIL)
  }

  public fun computeListAddBarrier(computeList: Long) {
    TransferContext.writeArguments(LONG to computeList)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListAddBarrierPtr, NIL)
  }

  @JvmOverloads
  public fun computeListEnd(postBarrier: BarrierMask =
      RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS) {
    TransferContext.writeArguments(LONG to postBarrier.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.computeListEndPtr, NIL)
  }

  public fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  public fun captureTimestamp(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.captureTimestampPtr, NIL)
  }

  public fun getCapturedTimestampsCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getCapturedTimestampsFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampsFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getCapturedTimestampGpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampGpuTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getCapturedTimestampCpuTime(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampCpuTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getCapturedTimestampName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getCapturedTimestampNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun limitGet(limit: Limit): Long {
    TransferContext.writeArguments(LONG to limit.id)
    TransferContext.callMethod(rawPtr, MethodBindings.limitGetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getFrameDelay(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameDelayPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun submit() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.submitPtr, NIL)
  }

  public fun sync() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.syncPtr, NIL)
  }

  @JvmOverloads
  public fun barrier(from: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS,
      to: BarrierMask = RenderingDevice.BarrierMask.BARRIER_MASK_ALL_BARRIERS) {
    TransferContext.writeArguments(LONG to from.flag, LONG to to.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.barrierPtr, NIL)
  }

  public fun fullBarrier() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fullBarrierPtr, NIL)
  }

  public fun createLocalDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createLocalDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ?RenderingDevice)
  }

  public fun setResourceName(id: RID, name: String) {
    TransferContext.writeArguments(_RID to id, STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setResourceNamePtr, NIL)
  }

  public fun drawCommandBeginLabel(name: String, color: Color) {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandBeginLabelPtr, NIL)
  }

  public fun drawCommandInsertLabel(name: String, color: Color) {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandInsertLabelPtr, NIL)
  }

  public fun drawCommandEndLabel() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.drawCommandEndLabelPtr, NIL)
  }

  public fun getDeviceVendorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceVendorNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDeviceName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDevicePipelineCacheUuid(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDevicePipelineCacheUuidPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getMemoryUsage(type: MemoryType): Long {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMemoryUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getDriverResource(
    resource: DriverResource,
    rid: RID,
    index: Long,
  ): Long {
    TransferContext.writeArguments(LONG to resource.id, _RID to rid, LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.getDriverResourcePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class DeviceType(
    id: Long,
  ) {
    DEVICE_TYPE_OTHER(0),
    DEVICE_TYPE_INTEGRATED_GPU(1),
    DEVICE_TYPE_DISCRETE_GPU(2),
    DEVICE_TYPE_VIRTUAL_GPU(3),
    DEVICE_TYPE_CPU(4),
    DEVICE_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DeviceType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DriverResource(
    id: Long,
  ) {
    DRIVER_RESOURCE_VULKAN_DEVICE(0),
    DRIVER_RESOURCE_VULKAN_PHYSICAL_DEVICE(1),
    DRIVER_RESOURCE_VULKAN_INSTANCE(2),
    DRIVER_RESOURCE_VULKAN_QUEUE(3),
    DRIVER_RESOURCE_VULKAN_QUEUE_FAMILY_INDEX(4),
    DRIVER_RESOURCE_VULKAN_IMAGE(5),
    DRIVER_RESOURCE_VULKAN_IMAGE_VIEW(6),
    DRIVER_RESOURCE_VULKAN_IMAGE_NATIVE_TEXTURE_FORMAT(7),
    DRIVER_RESOURCE_VULKAN_SAMPLER(8),
    DRIVER_RESOURCE_VULKAN_DESCRIPTOR_SET(9),
    DRIVER_RESOURCE_VULKAN_BUFFER(10),
    DRIVER_RESOURCE_VULKAN_COMPUTE_PIPELINE(11),
    DRIVER_RESOURCE_VULKAN_RENDER_PIPELINE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DriverResource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DataFormat(
    id: Long,
  ) {
    DATA_FORMAT_R4G4_UNORM_PACK8(0),
    DATA_FORMAT_R4G4B4A4_UNORM_PACK16(1),
    DATA_FORMAT_B4G4R4A4_UNORM_PACK16(2),
    DATA_FORMAT_R5G6B5_UNORM_PACK16(3),
    DATA_FORMAT_B5G6R5_UNORM_PACK16(4),
    DATA_FORMAT_R5G5B5A1_UNORM_PACK16(5),
    DATA_FORMAT_B5G5R5A1_UNORM_PACK16(6),
    DATA_FORMAT_A1R5G5B5_UNORM_PACK16(7),
    DATA_FORMAT_R8_UNORM(8),
    DATA_FORMAT_R8_SNORM(9),
    DATA_FORMAT_R8_USCALED(10),
    DATA_FORMAT_R8_SSCALED(11),
    DATA_FORMAT_R8_UINT(12),
    DATA_FORMAT_R8_SINT(13),
    DATA_FORMAT_R8_SRGB(14),
    DATA_FORMAT_R8G8_UNORM(15),
    DATA_FORMAT_R8G8_SNORM(16),
    DATA_FORMAT_R8G8_USCALED(17),
    DATA_FORMAT_R8G8_SSCALED(18),
    DATA_FORMAT_R8G8_UINT(19),
    DATA_FORMAT_R8G8_SINT(20),
    DATA_FORMAT_R8G8_SRGB(21),
    DATA_FORMAT_R8G8B8_UNORM(22),
    DATA_FORMAT_R8G8B8_SNORM(23),
    DATA_FORMAT_R8G8B8_USCALED(24),
    DATA_FORMAT_R8G8B8_SSCALED(25),
    DATA_FORMAT_R8G8B8_UINT(26),
    DATA_FORMAT_R8G8B8_SINT(27),
    DATA_FORMAT_R8G8B8_SRGB(28),
    DATA_FORMAT_B8G8R8_UNORM(29),
    DATA_FORMAT_B8G8R8_SNORM(30),
    DATA_FORMAT_B8G8R8_USCALED(31),
    DATA_FORMAT_B8G8R8_SSCALED(32),
    DATA_FORMAT_B8G8R8_UINT(33),
    DATA_FORMAT_B8G8R8_SINT(34),
    DATA_FORMAT_B8G8R8_SRGB(35),
    DATA_FORMAT_R8G8B8A8_UNORM(36),
    DATA_FORMAT_R8G8B8A8_SNORM(37),
    DATA_FORMAT_R8G8B8A8_USCALED(38),
    DATA_FORMAT_R8G8B8A8_SSCALED(39),
    DATA_FORMAT_R8G8B8A8_UINT(40),
    DATA_FORMAT_R8G8B8A8_SINT(41),
    DATA_FORMAT_R8G8B8A8_SRGB(42),
    DATA_FORMAT_B8G8R8A8_UNORM(43),
    DATA_FORMAT_B8G8R8A8_SNORM(44),
    DATA_FORMAT_B8G8R8A8_USCALED(45),
    DATA_FORMAT_B8G8R8A8_SSCALED(46),
    DATA_FORMAT_B8G8R8A8_UINT(47),
    DATA_FORMAT_B8G8R8A8_SINT(48),
    DATA_FORMAT_B8G8R8A8_SRGB(49),
    DATA_FORMAT_A8B8G8R8_UNORM_PACK32(50),
    DATA_FORMAT_A8B8G8R8_SNORM_PACK32(51),
    DATA_FORMAT_A8B8G8R8_USCALED_PACK32(52),
    DATA_FORMAT_A8B8G8R8_SSCALED_PACK32(53),
    DATA_FORMAT_A8B8G8R8_UINT_PACK32(54),
    DATA_FORMAT_A8B8G8R8_SINT_PACK32(55),
    DATA_FORMAT_A8B8G8R8_SRGB_PACK32(56),
    DATA_FORMAT_A2R10G10B10_UNORM_PACK32(57),
    DATA_FORMAT_A2R10G10B10_SNORM_PACK32(58),
    DATA_FORMAT_A2R10G10B10_USCALED_PACK32(59),
    DATA_FORMAT_A2R10G10B10_SSCALED_PACK32(60),
    DATA_FORMAT_A2R10G10B10_UINT_PACK32(61),
    DATA_FORMAT_A2R10G10B10_SINT_PACK32(62),
    DATA_FORMAT_A2B10G10R10_UNORM_PACK32(63),
    DATA_FORMAT_A2B10G10R10_SNORM_PACK32(64),
    DATA_FORMAT_A2B10G10R10_USCALED_PACK32(65),
    DATA_FORMAT_A2B10G10R10_SSCALED_PACK32(66),
    DATA_FORMAT_A2B10G10R10_UINT_PACK32(67),
    DATA_FORMAT_A2B10G10R10_SINT_PACK32(68),
    DATA_FORMAT_R16_UNORM(69),
    DATA_FORMAT_R16_SNORM(70),
    DATA_FORMAT_R16_USCALED(71),
    DATA_FORMAT_R16_SSCALED(72),
    DATA_FORMAT_R16_UINT(73),
    DATA_FORMAT_R16_SINT(74),
    DATA_FORMAT_R16_SFLOAT(75),
    DATA_FORMAT_R16G16_UNORM(76),
    DATA_FORMAT_R16G16_SNORM(77),
    DATA_FORMAT_R16G16_USCALED(78),
    DATA_FORMAT_R16G16_SSCALED(79),
    DATA_FORMAT_R16G16_UINT(80),
    DATA_FORMAT_R16G16_SINT(81),
    DATA_FORMAT_R16G16_SFLOAT(82),
    DATA_FORMAT_R16G16B16_UNORM(83),
    DATA_FORMAT_R16G16B16_SNORM(84),
    DATA_FORMAT_R16G16B16_USCALED(85),
    DATA_FORMAT_R16G16B16_SSCALED(86),
    DATA_FORMAT_R16G16B16_UINT(87),
    DATA_FORMAT_R16G16B16_SINT(88),
    DATA_FORMAT_R16G16B16_SFLOAT(89),
    DATA_FORMAT_R16G16B16A16_UNORM(90),
    DATA_FORMAT_R16G16B16A16_SNORM(91),
    DATA_FORMAT_R16G16B16A16_USCALED(92),
    DATA_FORMAT_R16G16B16A16_SSCALED(93),
    DATA_FORMAT_R16G16B16A16_UINT(94),
    DATA_FORMAT_R16G16B16A16_SINT(95),
    DATA_FORMAT_R16G16B16A16_SFLOAT(96),
    DATA_FORMAT_R32_UINT(97),
    DATA_FORMAT_R32_SINT(98),
    DATA_FORMAT_R32_SFLOAT(99),
    DATA_FORMAT_R32G32_UINT(100),
    DATA_FORMAT_R32G32_SINT(101),
    DATA_FORMAT_R32G32_SFLOAT(102),
    DATA_FORMAT_R32G32B32_UINT(103),
    DATA_FORMAT_R32G32B32_SINT(104),
    DATA_FORMAT_R32G32B32_SFLOAT(105),
    DATA_FORMAT_R32G32B32A32_UINT(106),
    DATA_FORMAT_R32G32B32A32_SINT(107),
    DATA_FORMAT_R32G32B32A32_SFLOAT(108),
    DATA_FORMAT_R64_UINT(109),
    DATA_FORMAT_R64_SINT(110),
    DATA_FORMAT_R64_SFLOAT(111),
    DATA_FORMAT_R64G64_UINT(112),
    DATA_FORMAT_R64G64_SINT(113),
    DATA_FORMAT_R64G64_SFLOAT(114),
    DATA_FORMAT_R64G64B64_UINT(115),
    DATA_FORMAT_R64G64B64_SINT(116),
    DATA_FORMAT_R64G64B64_SFLOAT(117),
    DATA_FORMAT_R64G64B64A64_UINT(118),
    DATA_FORMAT_R64G64B64A64_SINT(119),
    DATA_FORMAT_R64G64B64A64_SFLOAT(120),
    DATA_FORMAT_B10G11R11_UFLOAT_PACK32(121),
    DATA_FORMAT_E5B9G9R9_UFLOAT_PACK32(122),
    DATA_FORMAT_D16_UNORM(123),
    DATA_FORMAT_X8_D24_UNORM_PACK32(124),
    DATA_FORMAT_D32_SFLOAT(125),
    DATA_FORMAT_S8_UINT(126),
    DATA_FORMAT_D16_UNORM_S8_UINT(127),
    DATA_FORMAT_D24_UNORM_S8_UINT(128),
    DATA_FORMAT_D32_SFLOAT_S8_UINT(129),
    DATA_FORMAT_BC1_RGB_UNORM_BLOCK(130),
    DATA_FORMAT_BC1_RGB_SRGB_BLOCK(131),
    DATA_FORMAT_BC1_RGBA_UNORM_BLOCK(132),
    DATA_FORMAT_BC1_RGBA_SRGB_BLOCK(133),
    DATA_FORMAT_BC2_UNORM_BLOCK(134),
    DATA_FORMAT_BC2_SRGB_BLOCK(135),
    DATA_FORMAT_BC3_UNORM_BLOCK(136),
    DATA_FORMAT_BC3_SRGB_BLOCK(137),
    DATA_FORMAT_BC4_UNORM_BLOCK(138),
    DATA_FORMAT_BC4_SNORM_BLOCK(139),
    DATA_FORMAT_BC5_UNORM_BLOCK(140),
    DATA_FORMAT_BC5_SNORM_BLOCK(141),
    DATA_FORMAT_BC6H_UFLOAT_BLOCK(142),
    DATA_FORMAT_BC6H_SFLOAT_BLOCK(143),
    DATA_FORMAT_BC7_UNORM_BLOCK(144),
    DATA_FORMAT_BC7_SRGB_BLOCK(145),
    DATA_FORMAT_ETC2_R8G8B8_UNORM_BLOCK(146),
    DATA_FORMAT_ETC2_R8G8B8_SRGB_BLOCK(147),
    DATA_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK(148),
    DATA_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK(149),
    DATA_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK(150),
    DATA_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK(151),
    DATA_FORMAT_EAC_R11_UNORM_BLOCK(152),
    DATA_FORMAT_EAC_R11_SNORM_BLOCK(153),
    DATA_FORMAT_EAC_R11G11_UNORM_BLOCK(154),
    DATA_FORMAT_EAC_R11G11_SNORM_BLOCK(155),
    DATA_FORMAT_ASTC_4x4_UNORM_BLOCK(156),
    DATA_FORMAT_ASTC_4x4_SRGB_BLOCK(157),
    DATA_FORMAT_ASTC_5x4_UNORM_BLOCK(158),
    DATA_FORMAT_ASTC_5x4_SRGB_BLOCK(159),
    DATA_FORMAT_ASTC_5x5_UNORM_BLOCK(160),
    DATA_FORMAT_ASTC_5x5_SRGB_BLOCK(161),
    DATA_FORMAT_ASTC_6x5_UNORM_BLOCK(162),
    DATA_FORMAT_ASTC_6x5_SRGB_BLOCK(163),
    DATA_FORMAT_ASTC_6x6_UNORM_BLOCK(164),
    DATA_FORMAT_ASTC_6x6_SRGB_BLOCK(165),
    DATA_FORMAT_ASTC_8x5_UNORM_BLOCK(166),
    DATA_FORMAT_ASTC_8x5_SRGB_BLOCK(167),
    DATA_FORMAT_ASTC_8x6_UNORM_BLOCK(168),
    DATA_FORMAT_ASTC_8x6_SRGB_BLOCK(169),
    DATA_FORMAT_ASTC_8x8_UNORM_BLOCK(170),
    DATA_FORMAT_ASTC_8x8_SRGB_BLOCK(171),
    DATA_FORMAT_ASTC_10x5_UNORM_BLOCK(172),
    DATA_FORMAT_ASTC_10x5_SRGB_BLOCK(173),
    DATA_FORMAT_ASTC_10x6_UNORM_BLOCK(174),
    DATA_FORMAT_ASTC_10x6_SRGB_BLOCK(175),
    DATA_FORMAT_ASTC_10x8_UNORM_BLOCK(176),
    DATA_FORMAT_ASTC_10x8_SRGB_BLOCK(177),
    DATA_FORMAT_ASTC_10x10_UNORM_BLOCK(178),
    DATA_FORMAT_ASTC_10x10_SRGB_BLOCK(179),
    DATA_FORMAT_ASTC_12x10_UNORM_BLOCK(180),
    DATA_FORMAT_ASTC_12x10_SRGB_BLOCK(181),
    DATA_FORMAT_ASTC_12x12_UNORM_BLOCK(182),
    DATA_FORMAT_ASTC_12x12_SRGB_BLOCK(183),
    DATA_FORMAT_G8B8G8R8_422_UNORM(184),
    DATA_FORMAT_B8G8R8G8_422_UNORM(185),
    DATA_FORMAT_G8_B8_R8_3PLANE_420_UNORM(186),
    DATA_FORMAT_G8_B8R8_2PLANE_420_UNORM(187),
    DATA_FORMAT_G8_B8_R8_3PLANE_422_UNORM(188),
    DATA_FORMAT_G8_B8R8_2PLANE_422_UNORM(189),
    DATA_FORMAT_G8_B8_R8_3PLANE_444_UNORM(190),
    DATA_FORMAT_R10X6_UNORM_PACK16(191),
    DATA_FORMAT_R10X6G10X6_UNORM_2PACK16(192),
    DATA_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16(193),
    DATA_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16(194),
    DATA_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16(195),
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16(196),
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16(197),
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16(198),
    DATA_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16(199),
    DATA_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16(200),
    DATA_FORMAT_R12X4_UNORM_PACK16(201),
    DATA_FORMAT_R12X4G12X4_UNORM_2PACK16(202),
    DATA_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16(203),
    DATA_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16(204),
    DATA_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16(205),
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16(206),
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16(207),
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16(208),
    DATA_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16(209),
    DATA_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16(210),
    DATA_FORMAT_G16B16G16R16_422_UNORM(211),
    DATA_FORMAT_B16G16R16G16_422_UNORM(212),
    DATA_FORMAT_G16_B16_R16_3PLANE_420_UNORM(213),
    DATA_FORMAT_G16_B16R16_2PLANE_420_UNORM(214),
    DATA_FORMAT_G16_B16_R16_3PLANE_422_UNORM(215),
    DATA_FORMAT_G16_B16R16_2PLANE_422_UNORM(216),
    DATA_FORMAT_G16_B16_R16_3PLANE_444_UNORM(217),
    DATA_FORMAT_MAX(218),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DataFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface BarrierMask {
    public val flag: Long

    public infix fun or(other: godot.RenderingDevice.BarrierMask): godot.RenderingDevice.BarrierMask
        = BarrierMaskValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.or(other))

    public infix fun xor(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.xor(other))

    public infix fun and(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.and(other))

    public operator fun plus(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.plus(other))

    public operator fun minus(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.minus(other))

    public operator fun times(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.times(other))

    public operator fun div(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.div(other))

    public operator fun rem(other: godot.RenderingDevice.BarrierMask):
        godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag.rem(other))

    public fun unaryPlus(): godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.unaryPlus())

    public fun unaryMinus(): godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.unaryMinus())

    public fun inv(): godot.RenderingDevice.BarrierMask = BarrierMaskValue(flag.inv())

    public infix fun shl(bits: Int): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag shl bits)

    public infix fun shr(bits: Int): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.RenderingDevice.BarrierMask =
        BarrierMaskValue(flag ushr bits)

    public companion object {
      public val BARRIER_MASK_RASTER: godot.RenderingDevice.BarrierMask =
          godot.RenderingDevice.BarrierMaskValue(1)

      public val BARRIER_MASK_COMPUTE: godot.RenderingDevice.BarrierMask =
          godot.RenderingDevice.BarrierMaskValue(2)

      public val BARRIER_MASK_TRANSFER: godot.RenderingDevice.BarrierMask =
          godot.RenderingDevice.BarrierMaskValue(4)

      public val BARRIER_MASK_ALL_BARRIERS: godot.RenderingDevice.BarrierMask =
          godot.RenderingDevice.BarrierMaskValue(7)

      public val BARRIER_MASK_NO_BARRIER: godot.RenderingDevice.BarrierMask =
          godot.RenderingDevice.BarrierMaskValue(8)
    }
  }

  @JvmInline
  internal value class BarrierMaskValue internal constructor(
    override val flag: Long,
  ) : godot.RenderingDevice.BarrierMask

  public enum class TextureType(
    id: Long,
  ) {
    TEXTURE_TYPE_1D(0),
    TEXTURE_TYPE_2D(1),
    TEXTURE_TYPE_3D(2),
    TEXTURE_TYPE_CUBE(3),
    TEXTURE_TYPE_1D_ARRAY(4),
    TEXTURE_TYPE_2D_ARRAY(5),
    TEXTURE_TYPE_CUBE_ARRAY(6),
    TEXTURE_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureSamples(
    id: Long,
  ) {
    TEXTURE_SAMPLES_1(0),
    TEXTURE_SAMPLES_2(1),
    TEXTURE_SAMPLES_4(2),
    TEXTURE_SAMPLES_8(3),
    TEXTURE_SAMPLES_16(4),
    TEXTURE_SAMPLES_32(5),
    TEXTURE_SAMPLES_64(6),
    TEXTURE_SAMPLES_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureSamples = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface TextureUsageBits {
    public val flag: Long

    public infix fun or(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.or(other))

    public infix fun xor(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.xor(other))

    public infix fun and(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.and(other))

    public operator fun plus(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.plus(other))

    public operator fun minus(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.minus(other))

    public operator fun times(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.times(other))

    public operator fun div(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.div(other))

    public operator fun rem(other: godot.RenderingDevice.TextureUsageBits):
        godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.rem(other))

    public fun unaryPlus(): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.unaryPlus())

    public fun unaryMinus(): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag.unaryMinus())

    public fun inv(): godot.RenderingDevice.TextureUsageBits = TextureUsageBitsValue(flag.inv())

    public infix fun shl(bits: Int): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag shl bits)

    public infix fun shr(bits: Int): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.RenderingDevice.TextureUsageBits =
        TextureUsageBitsValue(flag ushr bits)

    public companion object {
      public val TEXTURE_USAGE_SAMPLING_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(1)

      public val TEXTURE_USAGE_COLOR_ATTACHMENT_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(2)

      public val TEXTURE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT: godot.RenderingDevice.TextureUsageBits
          = godot.RenderingDevice.TextureUsageBitsValue(4)

      public val TEXTURE_USAGE_STORAGE_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(8)

      public val TEXTURE_USAGE_STORAGE_ATOMIC_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(16)

      public val TEXTURE_USAGE_CPU_READ_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(32)

      public val TEXTURE_USAGE_CAN_UPDATE_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(64)

      public val TEXTURE_USAGE_CAN_COPY_FROM_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(128)

      public val TEXTURE_USAGE_CAN_COPY_TO_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(256)

      public val TEXTURE_USAGE_INPUT_ATTACHMENT_BIT: godot.RenderingDevice.TextureUsageBits =
          godot.RenderingDevice.TextureUsageBitsValue(512)
    }
  }

  @JvmInline
  internal value class TextureUsageBitsValue internal constructor(
    override val flag: Long,
  ) : godot.RenderingDevice.TextureUsageBits

  public enum class TextureSwizzle(
    id: Long,
  ) {
    TEXTURE_SWIZZLE_IDENTITY(0),
    TEXTURE_SWIZZLE_ZERO(1),
    TEXTURE_SWIZZLE_ONE(2),
    TEXTURE_SWIZZLE_R(3),
    TEXTURE_SWIZZLE_G(4),
    TEXTURE_SWIZZLE_B(5),
    TEXTURE_SWIZZLE_A(6),
    TEXTURE_SWIZZLE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureSwizzle = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TextureSliceType(
    id: Long,
  ) {
    TEXTURE_SLICE_2D(0),
    TEXTURE_SLICE_CUBEMAP(1),
    TEXTURE_SLICE_3D(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureSliceType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SamplerFilter(
    id: Long,
  ) {
    SAMPLER_FILTER_NEAREST(0),
    SAMPLER_FILTER_LINEAR(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SamplerFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SamplerRepeatMode(
    id: Long,
  ) {
    SAMPLER_REPEAT_MODE_REPEAT(0),
    SAMPLER_REPEAT_MODE_MIRRORED_REPEAT(1),
    SAMPLER_REPEAT_MODE_CLAMP_TO_EDGE(2),
    SAMPLER_REPEAT_MODE_CLAMP_TO_BORDER(3),
    SAMPLER_REPEAT_MODE_MIRROR_CLAMP_TO_EDGE(4),
    SAMPLER_REPEAT_MODE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SamplerRepeatMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SamplerBorderColor(
    id: Long,
  ) {
    SAMPLER_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK(0),
    SAMPLER_BORDER_COLOR_INT_TRANSPARENT_BLACK(1),
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_BLACK(2),
    SAMPLER_BORDER_COLOR_INT_OPAQUE_BLACK(3),
    SAMPLER_BORDER_COLOR_FLOAT_OPAQUE_WHITE(4),
    SAMPLER_BORDER_COLOR_INT_OPAQUE_WHITE(5),
    SAMPLER_BORDER_COLOR_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SamplerBorderColor = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VertexFrequency(
    id: Long,
  ) {
    VERTEX_FREQUENCY_VERTEX(0),
    VERTEX_FREQUENCY_INSTANCE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VertexFrequency = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class IndexBufferFormat(
    id: Long,
  ) {
    INDEX_BUFFER_FORMAT_UINT16(0),
    INDEX_BUFFER_FORMAT_UINT32(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): IndexBufferFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface StorageBufferUsage {
    public val flag: Long

    public infix fun or(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.or(other))

    public infix fun xor(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.xor(other))

    public infix fun and(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.and(other))

    public operator fun plus(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.plus(other))

    public operator fun minus(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.minus(other))

    public operator fun times(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.times(other))

    public operator fun div(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.div(other))

    public operator fun rem(other: godot.RenderingDevice.StorageBufferUsage):
        godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.rem(other))

    public fun unaryPlus(): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.unaryPlus())

    public fun unaryMinus(): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag.unaryMinus())

    public fun inv(): godot.RenderingDevice.StorageBufferUsage = StorageBufferUsageValue(flag.inv())

    public infix fun shl(bits: Int): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag shl bits)

    public infix fun shr(bits: Int): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.RenderingDevice.StorageBufferUsage =
        StorageBufferUsageValue(flag ushr bits)

    public companion object {
      public val STORAGE_BUFFER_USAGE_DISPATCH_INDIRECT: godot.RenderingDevice.StorageBufferUsage =
          godot.RenderingDevice.StorageBufferUsageValue(1)
    }
  }

  @JvmInline
  internal value class StorageBufferUsageValue internal constructor(
    override val flag: Long,
  ) : godot.RenderingDevice.StorageBufferUsage

  public enum class UniformType(
    id: Long,
  ) {
    UNIFORM_TYPE_SAMPLER(0),
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE(1),
    UNIFORM_TYPE_TEXTURE(2),
    UNIFORM_TYPE_IMAGE(3),
    UNIFORM_TYPE_TEXTURE_BUFFER(4),
    UNIFORM_TYPE_SAMPLER_WITH_TEXTURE_BUFFER(5),
    UNIFORM_TYPE_IMAGE_BUFFER(6),
    UNIFORM_TYPE_UNIFORM_BUFFER(7),
    UNIFORM_TYPE_STORAGE_BUFFER(8),
    UNIFORM_TYPE_INPUT_ATTACHMENT(9),
    UNIFORM_TYPE_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UniformType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class RenderPrimitive(
    id: Long,
  ) {
    RENDER_PRIMITIVE_POINTS(0),
    RENDER_PRIMITIVE_LINES(1),
    RENDER_PRIMITIVE_LINES_WITH_ADJACENCY(2),
    RENDER_PRIMITIVE_LINESTRIPS(3),
    RENDER_PRIMITIVE_LINESTRIPS_WITH_ADJACENCY(4),
    RENDER_PRIMITIVE_TRIANGLES(5),
    RENDER_PRIMITIVE_TRIANGLES_WITH_ADJACENCY(6),
    RENDER_PRIMITIVE_TRIANGLE_STRIPS(7),
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_AJACENCY(8),
    RENDER_PRIMITIVE_TRIANGLE_STRIPS_WITH_RESTART_INDEX(9),
    RENDER_PRIMITIVE_TESSELATION_PATCH(10),
    RENDER_PRIMITIVE_MAX(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderPrimitive = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PolygonCullMode(
    id: Long,
  ) {
    POLYGON_CULL_DISABLED(0),
    POLYGON_CULL_FRONT(1),
    POLYGON_CULL_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PolygonCullMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PolygonFrontFace(
    id: Long,
  ) {
    POLYGON_FRONT_FACE_CLOCKWISE(0),
    POLYGON_FRONT_FACE_COUNTER_CLOCKWISE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PolygonFrontFace = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class StencilOperation(
    id: Long,
  ) {
    STENCIL_OP_KEEP(0),
    STENCIL_OP_ZERO(1),
    STENCIL_OP_REPLACE(2),
    STENCIL_OP_INCREMENT_AND_CLAMP(3),
    STENCIL_OP_DECREMENT_AND_CLAMP(4),
    STENCIL_OP_INVERT(5),
    STENCIL_OP_INCREMENT_AND_WRAP(6),
    STENCIL_OP_DECREMENT_AND_WRAP(7),
    STENCIL_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StencilOperation = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CompareOperator(
    id: Long,
  ) {
    COMPARE_OP_NEVER(0),
    COMPARE_OP_LESS(1),
    COMPARE_OP_EQUAL(2),
    COMPARE_OP_LESS_OR_EQUAL(3),
    COMPARE_OP_GREATER(4),
    COMPARE_OP_NOT_EQUAL(5),
    COMPARE_OP_GREATER_OR_EQUAL(6),
    COMPARE_OP_ALWAYS(7),
    COMPARE_OP_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompareOperator = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LogicOperation(
    id: Long,
  ) {
    LOGIC_OP_CLEAR(0),
    LOGIC_OP_AND(1),
    LOGIC_OP_AND_REVERSE(2),
    LOGIC_OP_COPY(3),
    LOGIC_OP_AND_INVERTED(4),
    LOGIC_OP_NO_OP(5),
    LOGIC_OP_XOR(6),
    LOGIC_OP_OR(7),
    LOGIC_OP_NOR(8),
    LOGIC_OP_EQUIVALENT(9),
    LOGIC_OP_INVERT(10),
    LOGIC_OP_OR_REVERSE(11),
    LOGIC_OP_COPY_INVERTED(12),
    LOGIC_OP_OR_INVERTED(13),
    LOGIC_OP_NAND(14),
    LOGIC_OP_SET(15),
    LOGIC_OP_MAX(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LogicOperation = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BlendFactor(
    id: Long,
  ) {
    BLEND_FACTOR_ZERO(0),
    BLEND_FACTOR_ONE(1),
    BLEND_FACTOR_SRC_COLOR(2),
    BLEND_FACTOR_ONE_MINUS_SRC_COLOR(3),
    BLEND_FACTOR_DST_COLOR(4),
    BLEND_FACTOR_ONE_MINUS_DST_COLOR(5),
    BLEND_FACTOR_SRC_ALPHA(6),
    BLEND_FACTOR_ONE_MINUS_SRC_ALPHA(7),
    BLEND_FACTOR_DST_ALPHA(8),
    BLEND_FACTOR_ONE_MINUS_DST_ALPHA(9),
    BLEND_FACTOR_CONSTANT_COLOR(10),
    BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR(11),
    BLEND_FACTOR_CONSTANT_ALPHA(12),
    BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA(13),
    BLEND_FACTOR_SRC_ALPHA_SATURATE(14),
    BLEND_FACTOR_SRC1_COLOR(15),
    BLEND_FACTOR_ONE_MINUS_SRC1_COLOR(16),
    BLEND_FACTOR_SRC1_ALPHA(17),
    BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA(18),
    BLEND_FACTOR_MAX(19),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendFactor = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BlendOperation(
    id: Long,
  ) {
    BLEND_OP_ADD(0),
    BLEND_OP_SUBTRACT(1),
    BLEND_OP_REVERSE_SUBTRACT(2),
    BLEND_OP_MINIMUM(3),
    BLEND_OP_MAXIMUM(4),
    BLEND_OP_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendOperation = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface PipelineDynamicStateFlags {
    public val flag: Long

    public infix fun or(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.or(other))

    public infix fun xor(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.xor(other))

    public infix fun and(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.and(other))

    public operator fun plus(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.plus(other))

    public operator fun minus(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.minus(other))

    public operator fun times(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.times(other))

    public operator fun div(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.div(other))

    public operator fun rem(other: godot.RenderingDevice.PipelineDynamicStateFlags):
        godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.rem(other))

    public fun unaryPlus(): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.unaryMinus())

    public fun inv(): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag.inv())

    public infix fun shl(bits: Int): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.RenderingDevice.PipelineDynamicStateFlags =
        PipelineDynamicStateFlagsValue(flag ushr bits)

    public companion object {
      public val DYNAMIC_STATE_LINE_WIDTH: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(1)

      public val DYNAMIC_STATE_DEPTH_BIAS: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(2)

      public val DYNAMIC_STATE_BLEND_CONSTANTS: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(4)

      public val DYNAMIC_STATE_DEPTH_BOUNDS: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(8)

      public val DYNAMIC_STATE_STENCIL_COMPARE_MASK: godot.RenderingDevice.PipelineDynamicStateFlags
          = godot.RenderingDevice.PipelineDynamicStateFlagsValue(16)

      public val DYNAMIC_STATE_STENCIL_WRITE_MASK: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(32)

      public val DYNAMIC_STATE_STENCIL_REFERENCE: godot.RenderingDevice.PipelineDynamicStateFlags =
          godot.RenderingDevice.PipelineDynamicStateFlagsValue(64)
    }
  }

  @JvmInline
  internal value class PipelineDynamicStateFlagsValue internal constructor(
    override val flag: Long,
  ) : godot.RenderingDevice.PipelineDynamicStateFlags

  public enum class InitialAction(
    id: Long,
  ) {
    INITIAL_ACTION_CLEAR(0),
    INITIAL_ACTION_CLEAR_REGION(1),
    INITIAL_ACTION_CLEAR_REGION_CONTINUE(2),
    INITIAL_ACTION_KEEP(3),
    INITIAL_ACTION_DROP(4),
    INITIAL_ACTION_CONTINUE(5),
    INITIAL_ACTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InitialAction = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class FinalAction(
    id: Long,
  ) {
    FINAL_ACTION_READ(0),
    FINAL_ACTION_DISCARD(1),
    FINAL_ACTION_CONTINUE(2),
    FINAL_ACTION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FinalAction = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShaderStage(
    id: Long,
  ) {
    SHADER_STAGE_VERTEX(0),
    SHADER_STAGE_FRAGMENT(1),
    SHADER_STAGE_TESSELATION_CONTROL(2),
    SHADER_STAGE_TESSELATION_EVALUATION(3),
    SHADER_STAGE_COMPUTE(4),
    SHADER_STAGE_MAX(5),
    SHADER_STAGE_VERTEX_BIT(1),
    SHADER_STAGE_FRAGMENT_BIT(2),
    SHADER_STAGE_TESSELATION_CONTROL_BIT(4),
    SHADER_STAGE_TESSELATION_EVALUATION_BIT(8),
    SHADER_STAGE_COMPUTE_BIT(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShaderStage = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShaderLanguage(
    id: Long,
  ) {
    SHADER_LANGUAGE_GLSL(0),
    SHADER_LANGUAGE_HLSL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShaderLanguage = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class PipelineSpecializationConstantType(
    id: Long,
  ) {
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_BOOL(0),
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_INT(1),
    PIPELINE_SPECIALIZATION_CONSTANT_TYPE_FLOAT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PipelineSpecializationConstantType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Limit(
    id: Long,
  ) {
    LIMIT_MAX_BOUND_UNIFORM_SETS(0),
    LIMIT_MAX_FRAMEBUFFER_COLOR_ATTACHMENTS(1),
    LIMIT_MAX_TEXTURES_PER_UNIFORM_SET(2),
    LIMIT_MAX_SAMPLERS_PER_UNIFORM_SET(3),
    LIMIT_MAX_STORAGE_BUFFERS_PER_UNIFORM_SET(4),
    LIMIT_MAX_STORAGE_IMAGES_PER_UNIFORM_SET(5),
    LIMIT_MAX_UNIFORM_BUFFERS_PER_UNIFORM_SET(6),
    LIMIT_MAX_DRAW_INDEXED_INDEX(7),
    LIMIT_MAX_FRAMEBUFFER_HEIGHT(8),
    LIMIT_MAX_FRAMEBUFFER_WIDTH(9),
    LIMIT_MAX_TEXTURE_ARRAY_LAYERS(10),
    LIMIT_MAX_TEXTURE_SIZE_1D(11),
    LIMIT_MAX_TEXTURE_SIZE_2D(12),
    LIMIT_MAX_TEXTURE_SIZE_3D(13),
    LIMIT_MAX_TEXTURE_SIZE_CUBE(14),
    LIMIT_MAX_TEXTURES_PER_SHADER_STAGE(15),
    LIMIT_MAX_SAMPLERS_PER_SHADER_STAGE(16),
    LIMIT_MAX_STORAGE_BUFFERS_PER_SHADER_STAGE(17),
    LIMIT_MAX_STORAGE_IMAGES_PER_SHADER_STAGE(18),
    LIMIT_MAX_UNIFORM_BUFFERS_PER_SHADER_STAGE(19),
    LIMIT_MAX_PUSH_CONSTANT_SIZE(20),
    LIMIT_MAX_UNIFORM_BUFFER_SIZE(21),
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET(22),
    LIMIT_MAX_VERTEX_INPUT_ATTRIBUTES(23),
    LIMIT_MAX_VERTEX_INPUT_BINDINGS(24),
    LIMIT_MAX_VERTEX_INPUT_BINDING_STRIDE(25),
    LIMIT_MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT(26),
    LIMIT_MAX_COMPUTE_SHARED_MEMORY_SIZE(27),
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_X(28),
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Y(29),
    LIMIT_MAX_COMPUTE_WORKGROUP_COUNT_Z(30),
    LIMIT_MAX_COMPUTE_WORKGROUP_INVOCATIONS(31),
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_X(32),
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Y(33),
    LIMIT_MAX_COMPUTE_WORKGROUP_SIZE_Z(34),
    LIMIT_MAX_VIEWPORT_DIMENSIONS_X(35),
    LIMIT_MAX_VIEWPORT_DIMENSIONS_Y(36),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Limit = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MemoryType(
    id: Long,
  ) {
    MEMORY_TEXTURES(0),
    MEMORY_BUFFERS(1),
    MEMORY_TOTAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MemoryType = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object {
    public final const val INVALID_ID: Long = -1

    public final const val INVALID_FORMAT_ID: Long = -1
  }

  internal object MethodBindings {
    public val textureCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create")

    public val textureCreateSharedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create_shared")

    public val textureCreateSharedFromSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_create_shared_from_slice")

    public val textureUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_update")

    public val textureGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_get_data")

    public val textureIsFormatSupportedForUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_format_supported_for_usage")

    public val textureIsSharedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_shared")

    public val textureIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_is_valid")

    public val textureCopyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_copy")

    public val textureClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_clear")

    public val textureResolveMultisamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_resolve_multisample")

    public val textureGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_get_native_handle")

    public val framebufferFormatCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create")

    public val framebufferFormatCreateMultipassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create_multipass")

    public val framebufferFormatCreateEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_create_empty")

    public val framebufferFormatGetTextureSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_format_get_texture_samples")

    public val framebufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create")

    public val framebufferCreateMultipassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create_multipass")

    public val framebufferCreateEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_create_empty")

    public val framebufferGetFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_get_format")

    public val framebufferIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "framebuffer_is_valid")

    public val samplerCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "sampler_create")

    public val samplerIsFormatSupportedForFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "sampler_is_format_supported_for_filter")

    public val vertexBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_buffer_create")

    public val vertexFormatCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_format_create")

    public val vertexArrayCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "vertex_array_create")

    public val indexBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "index_buffer_create")

    public val indexArrayCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "index_array_create")

    public val shaderCompileSpirvFromSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_compile_spirv_from_source")

    public val shaderCompileBinaryFromSpirvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_compile_binary_from_spirv")

    public val shaderCreateFromSpirvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_create_from_spirv")

    public val shaderCreateFromBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_create_from_bytecode")

    public val shaderGetVertexInputAttributeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "shader_get_vertex_input_attribute_mask")

    public val uniformBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_buffer_create")

    public val storageBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "storage_buffer_create")

    public val textureBufferCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "texture_buffer_create")

    public val uniformSetCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_set_create")

    public val uniformSetIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "uniform_set_is_valid")

    public val bufferUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_update")

    public val bufferClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_clear")

    public val bufferGetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "buffer_get_data")

    public val renderPipelineCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "render_pipeline_create")

    public val renderPipelineIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "render_pipeline_is_valid")

    public val computePipelineCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_pipeline_create")

    public val computePipelineIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_pipeline_is_valid")

    public val screenGetWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_width")

    public val screenGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_height")

    public val screenGetFramebufferFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "screen_get_framebuffer_format")

    public val drawListBeginForScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin_for_screen")

    public val drawListBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin")

    public val drawListBeginSplitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_begin_split")

    public val drawListSetBlendConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_set_blend_constants")

    public val drawListBindRenderPipelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_render_pipeline")

    public val drawListBindUniformSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_uniform_set")

    public val drawListBindVertexArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_vertex_array")

    public val drawListBindIndexArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_bind_index_array")

    public val drawListSetPushConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_set_push_constant")

    public val drawListDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_draw")

    public val drawListEnableScissorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_enable_scissor")

    public val drawListDisableScissorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_disable_scissor")

    public val drawListSwitchToNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_switch_to_next_pass")

    public val drawListSwitchToNextPassSplitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_switch_to_next_pass_split")

    public val drawListEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_list_end")

    public val computeListBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_begin")

    public val computeListBindComputePipelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_bind_compute_pipeline")

    public val computeListSetPushConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_set_push_constant")

    public val computeListBindUniformSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_bind_uniform_set")

    public val computeListDispatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_dispatch")

    public val computeListAddBarrierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_add_barrier")

    public val computeListEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "compute_list_end")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "free_rid")

    public val captureTimestampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "capture_timestamp")

    public val getCapturedTimestampsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamps_count")

    public val getCapturedTimestampsFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamps_frame")

    public val getCapturedTimestampGpuTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_gpu_time")

    public val getCapturedTimestampCpuTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_cpu_time")

    public val getCapturedTimestampNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_captured_timestamp_name")

    public val limitGetPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "limit_get")

    public val getFrameDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_frame_delay")

    public val submitPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "submit")

    public val syncPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "sync")

    public val barrierPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingDevice", "barrier")

    public val fullBarrierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "full_barrier")

    public val createLocalDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "create_local_device")

    public val setResourceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "set_resource_name")

    public val drawCommandBeginLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_begin_label")

    public val drawCommandInsertLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_insert_label")

    public val drawCommandEndLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "draw_command_end_label")

    public val getDeviceVendorNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_vendor_name")

    public val getDeviceNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_name")

    public val getDevicePipelineCacheUuidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_device_pipeline_cache_uuid")

    public val getMemoryUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_memory_usage")

    public val getDriverResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingDevice", "get_driver_resource")
  }
}

public infix fun Long.or(other: BarrierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: BarrierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: BarrierMask): Long = this.and(other.flag)

public operator fun Long.plus(other: BarrierMask): Long = this.plus(other.flag)

public operator fun Long.minus(other: BarrierMask): Long = this.minus(other.flag)

public operator fun Long.times(other: BarrierMask): Long = this.times(other.flag)

public operator fun Long.div(other: BarrierMask): Long = this.div(other.flag)

public operator fun Long.rem(other: BarrierMask): Long = this.rem(other.flag)

public infix fun Long.or(other: TextureUsageBits): Long = this.or(other.flag)

public infix fun Long.xor(other: TextureUsageBits): Long = this.xor(other.flag)

public infix fun Long.and(other: TextureUsageBits): Long = this.and(other.flag)

public operator fun Long.plus(other: TextureUsageBits): Long = this.plus(other.flag)

public operator fun Long.minus(other: TextureUsageBits): Long = this.minus(other.flag)

public operator fun Long.times(other: TextureUsageBits): Long = this.times(other.flag)

public operator fun Long.div(other: TextureUsageBits): Long = this.div(other.flag)

public operator fun Long.rem(other: TextureUsageBits): Long = this.rem(other.flag)

public infix fun Long.or(other: StorageBufferUsage): Long = this.or(other.flag)

public infix fun Long.xor(other: StorageBufferUsage): Long = this.xor(other.flag)

public infix fun Long.and(other: StorageBufferUsage): Long = this.and(other.flag)

public operator fun Long.plus(other: StorageBufferUsage): Long = this.plus(other.flag)

public operator fun Long.minus(other: StorageBufferUsage): Long = this.minus(other.flag)

public operator fun Long.times(other: StorageBufferUsage): Long = this.times(other.flag)

public operator fun Long.div(other: StorageBufferUsage): Long = this.div(other.flag)

public operator fun Long.rem(other: StorageBufferUsage): Long = this.rem(other.flag)

public infix fun Long.or(other: PipelineDynamicStateFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: PipelineDynamicStateFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: PipelineDynamicStateFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: PipelineDynamicStateFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: PipelineDynamicStateFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: PipelineDynamicStateFlags): Long = this.times(other.flag)

public operator fun Long.div(other: PipelineDynamicStateFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: PipelineDynamicStateFlags): Long = this.rem(other.flag)
