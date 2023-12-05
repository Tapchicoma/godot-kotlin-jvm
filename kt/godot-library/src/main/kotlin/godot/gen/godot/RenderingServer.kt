// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.RenderingServer.ArrayFormat
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.RID
import godot.core.Rect2
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3
import godot.core.VariantType.VECTOR3I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.signals.Signal0
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
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads
import godot.core.AABB as CoreAABB
import godot.core.VariantType.AABB as VariantTypeAABB

@GodotBaseType
public object RenderingServer : Object() {
  public final const val NO_INDEX_ARRAY: Long = -1

  public final const val ARRAY_WEIGHTS_SIZE: Long = 4

  public final const val CANVAS_ITEM_Z_MIN: Long = -4096

  public final const val CANVAS_ITEM_Z_MAX: Long = 4096

  public final const val MAX_GLOW_LEVELS: Long = 7

  public final const val MAX_CURSORS: Long = 8

  public final const val MAX_2D_DIRECTIONAL_LIGHTS: Long = 8

  public final const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128

  public final const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127

  public final const val ARRAY_CUSTOM_COUNT: Long = 4

  public final const val PARTICLES_EMIT_FLAG_POSITION: Long = 1

  public final const val PARTICLES_EMIT_FLAG_ROTATION_SCALE: Long = 2

  public final const val PARTICLES_EMIT_FLAG_VELOCITY: Long = 4

  public final const val PARTICLES_EMIT_FLAG_COLOR: Long = 8

  public final const val PARTICLES_EMIT_FLAG_CUSTOM: Long = 16

  public val framePreDraw: Signal0 by signal()

  public val framePostDraw: Signal0 by signal()

  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RENDERINGSERVER)
    return false
  }

  public fun texture2dCreate(image: Image): RID {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture2dLayeredCreate(layers: VariantArray<Image>, layeredType: TextureLayeredType):
      RID {
    TransferContext.writeArguments(ARRAY to layers, LONG to layeredType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayeredCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture3dCreate(
    format: Image.Format,
    width: Int,
    height: Int,
    depth: Int,
    mipmaps: Boolean,
    `data`: VariantArray<Image>,
  ): RID {
    TransferContext.writeArguments(LONG to format.id, LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to mipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun textureProxyCreate(base: RID): RID {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.textureProxyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture2dUpdate(
    texture: RID,
    image: Image,
    layer: Int,
  ) {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dUpdatePtr, NIL)
  }

  public fun texture3dUpdate(texture: RID, `data`: VariantArray<Image>) {
    TransferContext.writeArguments(_RID to texture, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dUpdatePtr, NIL)
  }

  public fun textureProxyUpdate(texture: RID, proxyTo: RID) {
    TransferContext.writeArguments(_RID to texture, _RID to proxyTo)
    TransferContext.callMethod(rawPtr, MethodBindings.textureProxyUpdatePtr, NIL)
  }

  public fun texture2dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture2dLayeredPlaceholderCreate(layeredType: TextureLayeredType): RID {
    TransferContext.writeArguments(LONG to layeredType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayeredPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture3dPlaceholderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dPlaceholderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun texture2dGet(texture: RID): Image? {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun texture2dLayerGet(texture: RID, layer: Int): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.texture2dLayerGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun texture3dGet(texture: RID): VariantArray<Image> {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.texture3dGetPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  public fun textureReplace(texture: RID, byTexture: RID) {
    TransferContext.writeArguments(_RID to texture, _RID to byTexture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureReplacePtr, NIL)
  }

  public fun textureSetSizeOverride(
    texture: RID,
    width: Int,
    height: Int,
  ) {
    TransferContext.writeArguments(_RID to texture, LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetSizeOverridePtr, NIL)
  }

  public fun textureSetPath(texture: RID, path: String) {
    TransferContext.writeArguments(_RID to texture, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetPathPtr, NIL)
  }

  public fun textureGetPath(texture: RID): String {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun textureSetForceRedrawIfVisible(texture: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to texture, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.textureSetForceRedrawIfVisiblePtr, NIL)
  }

  @JvmOverloads
  public fun textureGetRdTexture(texture: RID, srgb: Boolean = false): RID {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetRdTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun textureGetNativeHandle(texture: RID, srgb: Boolean = false): Long {
    TransferContext.writeArguments(_RID to texture, BOOL to srgb)
    TransferContext.callMethod(rawPtr, MethodBindings.textureGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.shaderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun shaderSetCode(shader: RID, code: String) {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetCodePtr, NIL)
  }

  public fun shaderSetPathHint(shader: RID, path: String) {
    TransferContext.writeArguments(_RID to shader, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetPathHintPtr, NIL)
  }

  public fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getShaderParameterList(shader: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderParameterListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun shaderGetParameterDefault(shader: RID, name: StringName): Any? {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetParameterDefaultPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  @JvmOverloads
  public fun shaderSetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    texture: RID,
    index: Int = 0,
  ) {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, _RID to texture, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shaderSetDefaultTextureParameterPtr, NIL)
  }

  @JvmOverloads
  public fun shaderGetDefaultTextureParameter(
    shader: RID,
    name: StringName,
    index: Int = 0,
  ): RID {
    TransferContext.writeArguments(_RID to shader, STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shaderGetDefaultTextureParameterPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.materialCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun materialSetShader(shaderMaterial: RID, shader: RID) {
    TransferContext.writeArguments(_RID to shaderMaterial, _RID to shader)
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetShaderPtr, NIL)
  }

  public fun materialSetParam(
    material: RID,
    parameter: StringName,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(_RID to material, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetParamPtr, NIL)
  }

  public fun materialGetParam(material: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to material, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr, MethodBindings.materialGetParamPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun materialSetRenderPriority(material: RID, priority: Int) {
    TransferContext.writeArguments(_RID to material, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetRenderPriorityPtr, NIL)
  }

  public fun materialSetNextPass(material: RID, nextMaterial: RID) {
    TransferContext.writeArguments(_RID to material, _RID to nextMaterial)
    TransferContext.callMethod(rawPtr, MethodBindings.materialSetNextPassPtr, NIL)
  }

  @JvmOverloads
  public fun meshCreateFromSurfaces(surfaces: VariantArray<Dictionary<Any?, Any?>>,
      blendShapeCount: Int = 0): RID {
    TransferContext.writeArguments(ARRAY to surfaces, LONG to blendShapeCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshCreateFromSurfacesPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.meshCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun meshSurfaceGetFormatOffset(
    format: ArrayFormat,
    vertexCount: Int,
    arrayIndex: Int,
  ): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong(), LONG to arrayIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun meshSurfaceGetFormatVertexStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatVertexStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun meshSurfaceGetFormatAttributeStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatAttributeStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun meshSurfaceGetFormatSkinStride(format: ArrayFormat, vertexCount: Int): Long {
    TransferContext.writeArguments(LONG to format.flag, LONG to vertexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetFormatSkinStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun meshAddSurface(mesh: RID, surface: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(_RID to mesh, DICTIONARY to surface)
    TransferContext.callMethod(rawPtr, MethodBindings.meshAddSurfacePtr, NIL)
  }

  @JvmOverloads
  public fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    compressFormat: ArrayFormat = RenderingServer.ArrayFormatValue(0),
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, LONG to compressFormat.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.meshAddSurfaceFromArraysPtr, NIL)
  }

  public fun meshGetBlendShapeCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun meshSetBlendShapeMode(mesh: RID, mode: BlendShapeMode) {
    TransferContext.writeArguments(_RID to mesh, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetBlendShapeModePtr, NIL)
  }

  public fun meshGetBlendShapeMode(mesh: RID): BlendShapeMode {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetBlendShapeModePtr, LONG)
    return RenderingServer.BlendShapeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Int,
    material: RID,
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceSetMaterialPtr, NIL)
  }

  public fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetMaterialPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun meshGetSurface(mesh: RID, surface: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetSurfacePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun meshSurfaceGetArrays(mesh: RID, surface: Int): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int):
      VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceGetBlendShapeArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  public fun meshGetSurfaceCount(mesh: RID): Int {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetSurfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun meshSetCustomAabb(mesh: RID, aabb: CoreAABB) {
    TransferContext.writeArguments(_RID to mesh, VariantTypeAABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetCustomAabbPtr, NIL)
  }

  public fun meshGetCustomAabb(mesh: RID): CoreAABB {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshGetCustomAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun meshClear(mesh: RID) {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshClearPtr, NIL)
  }

  public fun meshSurfaceUpdateVertexRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateVertexRegionPtr, NIL)
  }

  public fun meshSurfaceUpdateAttributeRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateAttributeRegionPtr, NIL)
  }

  public fun meshSurfaceUpdateSkinRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    `data`: PackedByteArray,
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface.toLong(), LONG to offset.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSurfaceUpdateSkinRegionPtr, NIL)
  }

  public fun meshSetShadowMesh(mesh: RID, shadowMesh: RID) {
    TransferContext.writeArguments(_RID to mesh, _RID to shadowMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.meshSetShadowMeshPtr, NIL)
  }

  public fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun multimeshAllocateData(
    multimesh: RID,
    instances: Int,
    transformFormat: MultimeshTransformFormat,
    colorFormat: Boolean = false,
    customDataFormat: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances.toLong(), LONG to transformFormat.id, BOOL to colorFormat, BOOL to customDataFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshAllocateDataPtr, NIL)
  }

  public fun multimeshGetInstanceCount(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetInstanceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun multimeshSetMesh(multimesh: RID, mesh: RID) {
    TransferContext.writeArguments(_RID to multimesh, _RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetMeshPtr, NIL)
  }

  public fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetTransformPtr, NIL)
  }

  public fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Int,
    transform: Transform2D,
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetTransform2dPtr, NIL)
  }

  public fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Int,
    color: Color,
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetColorPtr, NIL)
  }

  public fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Int,
    customData: Color,
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong(), COLOR to customData)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceSetCustomDataPtr, NIL)
  }

  public fun multimeshGetMesh(multimesh: RID): RID {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetMeshPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun multimeshGetAabb(multimesh: RID): CoreAABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform3D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetTransform2dPtr,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshInstanceGetCustomDataPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun multimeshSetVisibleInstances(multimesh: RID, visible: Int) {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetVisibleInstancesPtr, NIL)
  }

  public fun multimeshGetVisibleInstances(multimesh: RID): Int {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetVisibleInstancesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun multimeshSetBuffer(multimesh: RID, buffer: PackedFloat32Array) {
    TransferContext.writeArguments(_RID to multimesh, PACKED_FLOAT_32_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshSetBufferPtr, NIL)
  }

  public fun multimeshGetBuffer(multimesh: RID): PackedFloat32Array {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.multimeshGetBufferPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  public fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun skeletonAllocateData(
    skeleton: RID,
    bones: Int,
    is2dSkeleton: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones.toLong(), BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonAllocateDataPtr, NIL)
  }

  public fun skeletonGetBoneCount(skeleton: RID): Int {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonGetBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Int,
    transform: Transform3D,
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneSetTransformPtr, NIL)
  }

  public fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform3D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Int,
    transform: Transform2D,
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong(), TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneSetTransform2dPtr, NIL)
  }

  public fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonBoneGetTransform2dPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public fun skeletonSetBaseTransform2d(skeleton: RID, baseTransform: Transform2D) {
    TransferContext.writeArguments(_RID to skeleton, TRANSFORM2D to baseTransform)
    TransferContext.callMethod(rawPtr, MethodBindings.skeletonSetBaseTransform2dPtr, NIL)
  }

  public fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.directionalLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.omniLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.spotLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun lightSetColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetColorPtr, NIL)
  }

  public fun lightSetParam(
    light: RID,
    `param`: LightParam,
    `value`: Float,
  ) {
    TransferContext.writeArguments(_RID to light, LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetParamPtr, NIL)
  }

  public fun lightSetShadow(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetShadowPtr, NIL)
  }

  public fun lightSetProjector(light: RID, texture: RID) {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetProjectorPtr, NIL)
  }

  public fun lightSetNegative(light: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetNegativePtr, NIL)
  }

  public fun lightSetCullMask(light: RID, mask: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetCullMaskPtr, NIL)
  }

  public fun lightSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    shadow: Float,
    length: Float,
  ) {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to shadow.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetDistanceFadePtr, NIL)
  }

  public fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetReverseCullFaceModePtr, NIL)
  }

  public fun lightSetBakeMode(light: RID, bakeMode: LightBakeMode) {
    TransferContext.writeArguments(_RID to light, LONG to bakeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetBakeModePtr, NIL)
  }

  public fun lightSetMaxSdfgiCascade(light: RID, cascade: Long) {
    TransferContext.writeArguments(_RID to light, LONG to cascade)
    TransferContext.callMethod(rawPtr, MethodBindings.lightSetMaxSdfgiCascadePtr, NIL)
  }

  public fun lightOmniSetShadowMode(light: RID, mode: LightOmniShadowMode) {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightOmniSetShadowModePtr, NIL)
  }

  public fun lightDirectionalSetShadowMode(light: RID, mode: LightDirectionalShadowMode) {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetShadowModePtr, NIL)
  }

  public fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetBlendSplitsPtr, NIL)
  }

  public fun lightDirectionalSetSkyMode(light: RID, mode: LightDirectionalSkyMode) {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightDirectionalSetSkyModePtr, NIL)
  }

  public fun lightProjectorsSetFilter(filter: LightProjectorFilter) {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.lightProjectorsSetFilterPtr, NIL)
  }

  public fun positionalSoftShadowFilterSetQuality(quality: ShadowQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.positionalSoftShadowFilterSetQualityPtr, NIL)
  }

  public fun directionalSoftShadowFilterSetQuality(quality: ShadowQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.directionalSoftShadowFilterSetQualityPtr, NIL)
  }

  public fun directionalShadowAtlasSetSize(size: Int, is16bits: Boolean) {
    TransferContext.writeArguments(LONG to size.toLong(), BOOL to is16bits)
    TransferContext.callMethod(rawPtr, MethodBindings.directionalShadowAtlasSetSizePtr, NIL)
  }

  public fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun reflectionProbeSetUpdateMode(probe: RID, mode: ReflectionProbeUpdateMode) {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetUpdateModePtr, NIL)
  }

  public fun reflectionProbeSetIntensity(probe: RID, intensity: Float) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetIntensityPtr, NIL)
  }

  public fun reflectionProbeSetAmbientMode(probe: RID, mode: ReflectionProbeAmbientMode) {
    TransferContext.writeArguments(_RID to probe, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientModePtr, NIL)
  }

  public fun reflectionProbeSetAmbientColor(probe: RID, color: Color) {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientColorPtr, NIL)
  }

  public fun reflectionProbeSetAmbientEnergy(probe: RID, energy: Float) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAmbientEnergyPtr, NIL)
  }

  public fun reflectionProbeSetMaxDistance(probe: RID, distance: Float) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetMaxDistancePtr, NIL)
  }

  public fun reflectionProbeSetSize(probe: RID, size: Vector3) {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetSizePtr, NIL)
  }

  public fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetOriginOffsetPtr, NIL)
  }

  public fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetAsInteriorPtr, NIL)
  }

  public fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetEnableBoxProjectionPtr, NIL)
  }

  public fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetEnableShadowsPtr, NIL)
  }

  public fun reflectionProbeSetCullMask(probe: RID, layers: Long) {
    TransferContext.writeArguments(_RID to probe, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetCullMaskPtr, NIL)
  }

  public fun reflectionProbeSetResolution(probe: RID, resolution: Int) {
    TransferContext.writeArguments(_RID to probe, LONG to resolution.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetResolutionPtr, NIL)
  }

  public fun reflectionProbeSetMeshLodThreshold(probe: RID, pixels: Float) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to pixels.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.reflectionProbeSetMeshLodThresholdPtr, NIL)
  }

  public fun decalCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.decalCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun decalSetSize(decal: RID, size: Vector3) {
    TransferContext.writeArguments(_RID to decal, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetSizePtr, NIL)
  }

  public fun decalSetTexture(
    decal: RID,
    type: DecalTexture,
    texture: RID,
  ) {
    TransferContext.writeArguments(_RID to decal, LONG to type.id, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetTexturePtr, NIL)
  }

  public fun decalSetEmissionEnergy(decal: RID, energy: Float) {
    TransferContext.writeArguments(_RID to decal, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetEmissionEnergyPtr, NIL)
  }

  public fun decalSetAlbedoMix(decal: RID, albedoMix: Float) {
    TransferContext.writeArguments(_RID to decal, DOUBLE to albedoMix.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetAlbedoMixPtr, NIL)
  }

  public fun decalSetModulate(decal: RID, color: Color) {
    TransferContext.writeArguments(_RID to decal, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetModulatePtr, NIL)
  }

  public fun decalSetCullMask(decal: RID, mask: Long) {
    TransferContext.writeArguments(_RID to decal, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetCullMaskPtr, NIL)
  }

  public fun decalSetDistanceFade(
    decal: RID,
    enabled: Boolean,
    begin: Float,
    length: Float,
  ) {
    TransferContext.writeArguments(_RID to decal, BOOL to enabled, DOUBLE to begin.toDouble(), DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetDistanceFadePtr, NIL)
  }

  public fun decalSetFade(
    decal: RID,
    above: Float,
    below: Float,
  ) {
    TransferContext.writeArguments(_RID to decal, DOUBLE to above.toDouble(), DOUBLE to below.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetFadePtr, NIL)
  }

  public fun decalSetNormalFade(decal: RID, fade: Float) {
    TransferContext.writeArguments(_RID to decal, DOUBLE to fade.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.decalSetNormalFadePtr, NIL)
  }

  public fun decalsSetFilter(filter: DecalFilter) {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.decalsSetFilterPtr, NIL)
  }

  public fun giSetUseHalfResolution(halfResolution: Boolean) {
    TransferContext.writeArguments(BOOL to halfResolution)
    TransferContext.callMethod(rawPtr, MethodBindings.giSetUseHalfResolutionPtr, NIL)
  }

  public fun voxelGiCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun voxelGiAllocateData(
    voxelGi: RID,
    toCellXform: Transform3D,
    aabb: CoreAABB,
    octreeSize: Vector3i,
    octreeCells: PackedByteArray,
    dataCells: PackedByteArray,
    distanceField: PackedByteArray,
    levelCounts: PackedInt32Array,
  ) {
    TransferContext.writeArguments(_RID to voxelGi, TRANSFORM3D to toCellXform, VariantTypeAABB to aabb, VECTOR3I to octreeSize, PACKED_BYTE_ARRAY to octreeCells, PACKED_BYTE_ARRAY to dataCells, PACKED_BYTE_ARRAY to distanceField, PACKED_INT_32_ARRAY to levelCounts)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiAllocateDataPtr, NIL)
  }

  public fun voxelGiGetOctreeSize(voxelGi: RID): Vector3i {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetOctreeSizePtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
  }

  public fun voxelGiGetOctreeCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetOctreeCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetDataCells(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetDataCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetDistanceField(voxelGi: RID): PackedByteArray {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetDistanceFieldPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun voxelGiGetLevelCounts(voxelGi: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetLevelCountsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun voxelGiGetToCellXform(voxelGi: RID): Transform3D {
    TransferContext.writeArguments(_RID to voxelGi)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiGetToCellXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun voxelGiSetDynamicRange(voxelGi: RID, range: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to range.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetDynamicRangePtr, NIL)
  }

  public fun voxelGiSetPropagation(voxelGi: RID, amount: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetPropagationPtr, NIL)
  }

  public fun voxelGiSetEnergy(voxelGi: RID, energy: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetEnergyPtr, NIL)
  }

  public fun voxelGiSetBakedExposureNormalization(voxelGi: RID, bakedExposure: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetBakedExposureNormalizationPtr, NIL)
  }

  public fun voxelGiSetBias(voxelGi: RID, bias: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetBiasPtr, NIL)
  }

  public fun voxelGiSetNormalBias(voxelGi: RID, bias: Float) {
    TransferContext.writeArguments(_RID to voxelGi, DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetNormalBiasPtr, NIL)
  }

  public fun voxelGiSetInterior(voxelGi: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetInteriorPtr, NIL)
  }

  public fun voxelGiSetUseTwoBounces(voxelGi: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to voxelGi, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetUseTwoBouncesPtr, NIL)
  }

  public fun voxelGiSetQuality(quality: VoxelGIQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.voxelGiSetQualityPtr, NIL)
  }

  public fun lightmapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun lightmapSetTextures(
    lightmap: RID,
    light: RID,
    usesSh: Boolean,
  ) {
    TransferContext.writeArguments(_RID to lightmap, _RID to light, BOOL to usesSh)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetTexturesPtr, NIL)
  }

  public fun lightmapSetProbeBounds(lightmap: RID, bounds: CoreAABB) {
    TransferContext.writeArguments(_RID to lightmap, VariantTypeAABB to bounds)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeBoundsPtr, NIL)
  }

  public fun lightmapSetProbeInterior(lightmap: RID, interior: Boolean) {
    TransferContext.writeArguments(_RID to lightmap, BOOL to interior)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeInteriorPtr, NIL)
  }

  public fun lightmapSetProbeCaptureData(
    lightmap: RID,
    points: PackedVector3Array,
    pointSh: PackedColorArray,
    tetrahedra: PackedInt32Array,
    bspTree: PackedInt32Array,
  ) {
    TransferContext.writeArguments(_RID to lightmap, PACKED_VECTOR3_ARRAY to points, PACKED_COLOR_ARRAY to pointSh, PACKED_INT_32_ARRAY to tetrahedra, PACKED_INT_32_ARRAY to bspTree)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeCaptureDataPtr, NIL)
  }

  public fun lightmapGetProbeCapturePoints(lightmap: RID): PackedVector3Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCapturePointsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun lightmapGetProbeCaptureSh(lightmap: RID): PackedColorArray {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureShPtr,
        PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  public fun lightmapGetProbeCaptureTetrahedra(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureTetrahedraPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun lightmapGetProbeCaptureBspTree(lightmap: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to lightmap)
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapGetProbeCaptureBspTreePtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun lightmapSetBakedExposureNormalization(lightmap: RID, bakedExposure: Float) {
    TransferContext.writeArguments(_RID to lightmap, DOUBLE to bakedExposure.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetBakedExposureNormalizationPtr, NIL)
  }

  public fun lightmapSetProbeCaptureUpdateSpeed(speed: Float) {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.lightmapSetProbeCaptureUpdateSpeedPtr, NIL)
  }

  public fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun particlesSetMode(particles: RID, mode: ParticlesMode) {
    TransferContext.writeArguments(_RID to particles, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetModePtr, NIL)
  }

  public fun particlesSetEmitting(particles: RID, emitting: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to emitting)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetEmittingPtr, NIL)
  }

  public fun particlesGetEmitting(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesGetEmittingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun particlesSetAmount(particles: RID, amount: Int) {
    TransferContext.writeArguments(_RID to particles, LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetAmountPtr, NIL)
  }

  public fun particlesSetLifetime(particles: RID, lifetime: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to lifetime)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetLifetimePtr, NIL)
  }

  public fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to oneShot)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetOneShotPtr, NIL)
  }

  public fun particlesSetPreProcessTime(particles: RID, time: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetPreProcessTimePtr, NIL)
  }

  public fun particlesSetExplosivenessRatio(particles: RID, ratio: Float) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetExplosivenessRatioPtr, NIL)
  }

  public fun particlesSetRandomnessRatio(particles: RID, ratio: Float) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetRandomnessRatioPtr, NIL)
  }

  public fun particlesSetCustomAabb(particles: RID, aabb: CoreAABB) {
    TransferContext.writeArguments(_RID to particles, VariantTypeAABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetCustomAabbPtr, NIL)
  }

  public fun particlesSetSpeedScale(particles: RID, scale: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetSpeedScalePtr, NIL)
  }

  public fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetUseLocalCoordinatesPtr, NIL)
  }

  public fun particlesSetProcessMaterial(particles: RID, material: RID) {
    TransferContext.writeArguments(_RID to particles, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetProcessMaterialPtr, NIL)
  }

  public fun particlesSetFixedFps(particles: RID, fps: Int) {
    TransferContext.writeArguments(_RID to particles, LONG to fps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetFixedFpsPtr, NIL)
  }

  public fun particlesSetInterpolate(particles: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetInterpolatePtr, NIL)
  }

  public fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetFractionalDeltaPtr, NIL)
  }

  public fun particlesSetCollisionBaseSize(particles: RID, size: Float) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetCollisionBaseSizePtr, NIL)
  }

  public fun particlesSetTransformAlign(particles: RID, align: ParticlesTransformAlign) {
    TransferContext.writeArguments(_RID to particles, LONG to align.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTransformAlignPtr, NIL)
  }

  public fun particlesSetTrails(
    particles: RID,
    enable: Boolean,
    lengthSec: Float,
  ) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable, DOUBLE to lengthSec.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTrailsPtr, NIL)
  }

  public fun particlesSetTrailBindPoses(particles: RID, bindPoses: VariantArray<Transform3D>) {
    TransferContext.writeArguments(_RID to particles, ARRAY to bindPoses)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetTrailBindPosesPtr, NIL)
  }

  public fun particlesIsInactive(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesIsInactivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun particlesRequestProcess(particles: RID) {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesRequestProcessPtr, NIL)
  }

  public fun particlesRestart(particles: RID) {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesRestartPtr, NIL)
  }

  public fun particlesSetSubemitter(particles: RID, subemitterParticles: RID) {
    TransferContext.writeArguments(_RID to particles, _RID to subemitterParticles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetSubemitterPtr, NIL)
  }

  public fun particlesEmit(
    particles: RID,
    transform: Transform3D,
    velocity: Vector3,
    color: Color,
    custom: Color,
    emitFlags: Long,
  ) {
    TransferContext.writeArguments(_RID to particles, TRANSFORM3D to transform, VECTOR3 to velocity, COLOR to color, COLOR to custom, LONG to emitFlags)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesEmitPtr, NIL)
  }

  public fun particlesSetDrawOrder(particles: RID, order: ParticlesDrawOrder) {
    TransferContext.writeArguments(_RID to particles, LONG to order.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawOrderPtr, NIL)
  }

  public fun particlesSetDrawPasses(particles: RID, count: Int) {
    TransferContext.writeArguments(_RID to particles, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawPassesPtr, NIL)
  }

  public fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Int,
    mesh: RID,
  ) {
    TransferContext.writeArguments(_RID to particles, LONG to pass.toLong(), _RID to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetDrawPassMeshPtr, NIL)
  }

  public fun particlesGetCurrentAabb(particles: RID): CoreAABB {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesGetCurrentAabbPtr, VariantTypeAABB)
    return (TransferContext.readReturnValue(VariantTypeAABB, false) as CoreAABB)
  }

  public fun particlesSetEmissionTransform(particles: RID, transform: Transform3D) {
    TransferContext.writeArguments(_RID to particles, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesSetEmissionTransformPtr, NIL)
  }

  public fun particlesCollisionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun particlesCollisionSetCollisionType(particlesCollision: RID,
      type: ParticlesCollisionType) {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetCollisionTypePtr, NIL)
  }

  public fun particlesCollisionSetCullMask(particlesCollision: RID, mask: Long) {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetCullMaskPtr, NIL)
  }

  public fun particlesCollisionSetSphereRadius(particlesCollision: RID, radius: Float) {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetSphereRadiusPtr, NIL)
  }

  public fun particlesCollisionSetBoxExtents(particlesCollision: RID, extents: Vector3) {
    TransferContext.writeArguments(_RID to particlesCollision, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetBoxExtentsPtr, NIL)
  }

  public fun particlesCollisionSetAttractorStrength(particlesCollision: RID, strength: Float) {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetAttractorStrengthPtr,
        NIL)
  }

  public fun particlesCollisionSetAttractorDirectionality(particlesCollision: RID, amount: Float) {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        MethodBindings.particlesCollisionSetAttractorDirectionalityPtr, NIL)
  }

  public fun particlesCollisionSetAttractorAttenuation(particlesCollision: RID, curve: Float) {
    TransferContext.writeArguments(_RID to particlesCollision, DOUBLE to curve.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetAttractorAttenuationPtr,
        NIL)
  }

  public fun particlesCollisionSetFieldTexture(particlesCollision: RID, texture: RID) {
    TransferContext.writeArguments(_RID to particlesCollision, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetFieldTexturePtr, NIL)
  }

  public fun particlesCollisionHeightFieldUpdate(particlesCollision: RID) {
    TransferContext.writeArguments(_RID to particlesCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionHeightFieldUpdatePtr, NIL)
  }

  public fun particlesCollisionSetHeightFieldResolution(particlesCollision: RID,
      resolution: ParticlesCollisionHeightfieldResolution) {
    TransferContext.writeArguments(_RID to particlesCollision, LONG to resolution.id)
    TransferContext.callMethod(rawPtr, MethodBindings.particlesCollisionSetHeightFieldResolutionPtr,
        NIL)
  }

  public fun fogVolumeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun fogVolumeSetShape(fogVolume: RID, shape: FogVolumeShape) {
    TransferContext.writeArguments(_RID to fogVolume, LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetShapePtr, NIL)
  }

  public fun fogVolumeSetSize(fogVolume: RID, size: Vector3) {
    TransferContext.writeArguments(_RID to fogVolume, VECTOR3 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetSizePtr, NIL)
  }

  public fun fogVolumeSetMaterial(fogVolume: RID, material: RID) {
    TransferContext.writeArguments(_RID to fogVolume, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.fogVolumeSetMaterialPtr, NIL)
  }

  public fun visibilityNotifierCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun visibilityNotifierSetAabb(notifier: RID, aabb: CoreAABB) {
    TransferContext.writeArguments(_RID to notifier, VariantTypeAABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierSetAabbPtr, NIL)
  }

  public fun visibilityNotifierSetCallbacks(
    notifier: RID,
    enterCallable: Callable,
    exitCallable: Callable,
  ) {
    TransferContext.writeArguments(_RID to notifier, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr, MethodBindings.visibilityNotifierSetCallbacksPtr, NIL)
  }

  public fun occluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.occluderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun occluderSetMesh(
    occluder: RID,
    vertices: PackedVector3Array,
    indices: PackedInt32Array,
  ) {
    TransferContext.writeArguments(_RID to occluder, PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, MethodBindings.occluderSetMeshPtr, NIL)
  }

  public fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cameraCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Float,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetPerspectivePtr, NIL)
  }

  public fun cameraSetOrthogonal(
    camera: RID,
    size: Float,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetOrthogonalPtr, NIL)
  }

  public fun cameraSetFrustum(
    camera: RID,
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetFrustumPtr, NIL)
  }

  public fun cameraSetTransform(camera: RID, transform: Transform3D) {
    TransferContext.writeArguments(_RID to camera, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetTransformPtr, NIL)
  }

  public fun cameraSetCullMask(camera: RID, layers: Long) {
    TransferContext.writeArguments(_RID to camera, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetCullMaskPtr, NIL)
  }

  public fun cameraSetEnvironment(camera: RID, env: RID) {
    TransferContext.writeArguments(_RID to camera, _RID to env)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetEnvironmentPtr, NIL)
  }

  public fun cameraSetCameraAttributes(camera: RID, effects: RID) {
    TransferContext.writeArguments(_RID to camera, _RID to effects)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetCameraAttributesPtr, NIL)
  }

  public fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to camera, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraSetUseVerticalAspectPtr, NIL)
  }

  public fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.viewportCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun viewportSetUseXr(viewport: RID, useXr: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to useXr)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseXrPtr, NIL)
  }

  public fun viewportSetSize(
    viewport: RID,
    width: Int,
    height: Int,
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSizePtr, NIL)
  }

  public fun viewportSetActive(viewport: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetActivePtr, NIL)
  }

  public fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to parentViewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetParentViewportPtr, NIL)
  }

  @JvmOverloads
  public fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Int = 0,
  ) {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachToScreenPtr, NIL)
  }

  public fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetRenderDirectToScreenPtr, NIL)
  }

  public fun viewportSetCanvasCullMask(viewport: RID, canvasCullMask: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to canvasCullMask)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasCullMaskPtr, NIL)
  }

  public fun viewportSetScaling3dMode(viewport: RID, scaling3dMode: ViewportScaling3DMode) {
    TransferContext.writeArguments(_RID to viewport, LONG to scaling3dMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScaling3dModePtr, NIL)
  }

  public fun viewportSetScaling3dScale(viewport: RID, scale: Float) {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScaling3dScalePtr, NIL)
  }

  public fun viewportSetFsrSharpness(viewport: RID, sharpness: Float) {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetFsrSharpnessPtr, NIL)
  }

  public fun viewportSetTextureMipmapBias(viewport: RID, mipmapBias: Float) {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to mipmapBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetTextureMipmapBiasPtr, NIL)
  }

  public fun viewportSetUpdateMode(viewport: RID, updateMode: ViewportUpdateMode) {
    TransferContext.writeArguments(_RID to viewport, LONG to updateMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUpdateModePtr, NIL)
  }

  public fun viewportSetClearMode(viewport: RID, clearMode: ViewportClearMode) {
    TransferContext.writeArguments(_RID to viewport, LONG to clearMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetClearModePtr, NIL)
  }

  public fun viewportGetRenderTarget(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetRenderTargetPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun viewportSetDisable3d(viewport: RID, disable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDisable3dPtr, NIL)
  }

  public fun viewportSetDisable2d(viewport: RID, disable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDisable2dPtr, NIL)
  }

  public fun viewportSetEnvironmentMode(viewport: RID, mode: ViewportEnvironmentMode) {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetEnvironmentModePtr, NIL)
  }

  public fun viewportAttachCamera(viewport: RID, camera: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to camera)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachCameraPtr, NIL)
  }

  public fun viewportSetScenario(viewport: RID, scenario: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScenarioPtr, NIL)
  }

  public fun viewportAttachCanvas(viewport: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportAttachCanvasPtr, NIL)
  }

  public fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportRemoveCanvasPtr, NIL)
  }

  public fun viewportSetSnap2dTransformsToPixel(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSnap2dTransformsToPixelPtr, NIL)
  }

  public fun viewportSetSnap2dVerticesToPixel(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSnap2dVerticesToPixelPtr, NIL)
  }

  public fun viewportSetDefaultCanvasItemTextureFilter(viewport: RID,
      filter: CanvasItemTextureFilter) {
    TransferContext.writeArguments(_RID to viewport, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDefaultCanvasItemTextureFilterPtr,
        NIL)
  }

  public fun viewportSetDefaultCanvasItemTextureRepeat(viewport: RID,
      repeat: CanvasItemTextureRepeat) {
    TransferContext.writeArguments(_RID to viewport, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDefaultCanvasItemTextureRepeatPtr,
        NIL)
  }

  public fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D,
  ) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, TRANSFORM2D to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasTransformPtr, NIL)
  }

  public fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Int,
    sublayer: Int,
  ) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer.toLong(), LONG to sublayer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetCanvasStackingPtr, NIL)
  }

  public fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetTransparentBackgroundPtr, NIL)
  }

  public fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to viewport, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetGlobalCanvasTransformPtr, NIL)
  }

  public fun viewportSetSdfOversizeAndScale(
    viewport: RID,
    oversize: ViewportSDFOversize,
    scale: ViewportSDFScale,
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to oversize.id, LONG to scale.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetSdfOversizeAndScalePtr, NIL)
  }

  @JvmOverloads
  public fun viewportSetPositionalShadowAtlasSize(
    viewport: RID,
    size: Int,
    use16Bits: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to size.toLong(), BOOL to use16Bits)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetPositionalShadowAtlasSizePtr, NIL)
  }

  public fun viewportSetPositionalShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Int,
    subdivision: Int,
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant.toLong(), LONG to subdivision.toLong())
    TransferContext.callMethod(rawPtr,
        MethodBindings.viewportSetPositionalShadowAtlasQuadrantSubdivisionPtr, NIL)
  }

  public fun viewportSetMsaa3d(viewport: RID, msaa: ViewportMSAA) {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMsaa3dPtr, NIL)
  }

  public fun viewportSetMsaa2d(viewport: RID, msaa: ViewportMSAA) {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMsaa2dPtr, NIL)
  }

  public fun viewportSetScreenSpaceAa(viewport: RID, mode: ViewportScreenSpaceAA) {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetScreenSpaceAaPtr, NIL)
  }

  public fun viewportSetUseTaa(viewport: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseTaaPtr, NIL)
  }

  public fun viewportSetUseDebanding(viewport: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseDebandingPtr, NIL)
  }

  public fun viewportSetUseOcclusionCulling(viewport: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetUseOcclusionCullingPtr, NIL)
  }

  public fun viewportSetOcclusionRaysPerThread(raysPerThread: Int) {
    TransferContext.writeArguments(LONG to raysPerThread.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetOcclusionRaysPerThreadPtr, NIL)
  }

  public
      fun viewportSetOcclusionCullingBuildQuality(quality: ViewportOcclusionCullingBuildQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetOcclusionCullingBuildQualityPtr,
        NIL)
  }

  public fun viewportGetRenderInfo(
    viewport: RID,
    type: ViewportRenderInfoType,
    info: ViewportRenderInfo,
  ): Int {
    TransferContext.writeArguments(_RID to viewport, LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetRenderInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun viewportSetDebugDraw(viewport: RID, draw: ViewportDebugDraw) {
    TransferContext.writeArguments(_RID to viewport, LONG to draw.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetDebugDrawPtr, NIL)
  }

  public fun viewportSetMeasureRenderTime(viewport: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetMeasureRenderTimePtr, NIL)
  }

  public fun viewportGetMeasuredRenderTimeCpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetMeasuredRenderTimeCpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun viewportGetMeasuredRenderTimeGpu(viewport: RID): Double {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportGetMeasuredRenderTimeGpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun viewportSetVrsMode(viewport: RID, mode: ViewportVRSMode) {
    TransferContext.writeArguments(_RID to viewport, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetVrsModePtr, NIL)
  }

  public fun viewportSetVrsTexture(viewport: RID, texture: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.viewportSetVrsTexturePtr, NIL)
  }

  public fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skyCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun skySetRadianceSize(sky: RID, radianceSize: Int) {
    TransferContext.writeArguments(_RID to sky, LONG to radianceSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.skySetRadianceSizePtr, NIL)
  }

  public fun skySetMode(sky: RID, mode: SkyMode) {
    TransferContext.writeArguments(_RID to sky, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.skySetModePtr, NIL)
  }

  public fun skySetMaterial(sky: RID, material: RID) {
    TransferContext.writeArguments(_RID to sky, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.skySetMaterialPtr, NIL)
  }

  public fun skyBakePanorama(
    sky: RID,
    energy: Float,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to sky, DOUBLE to energy.toDouble(), BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.skyBakePanoramaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.environmentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun environmentSetBackground(env: RID, bg: EnvironmentBG) {
    TransferContext.writeArguments(_RID to env, LONG to bg.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBackgroundPtr, NIL)
  }

  public fun environmentSetSky(env: RID, sky: RID) {
    TransferContext.writeArguments(_RID to env, _RID to sky)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyPtr, NIL)
  }

  public fun environmentSetSkyCustomFov(env: RID, scale: Float) {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyCustomFovPtr, NIL)
  }

  public fun environmentSetSkyOrientation(env: RID, orientation: Basis) {
    TransferContext.writeArguments(_RID to env, BASIS to orientation)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSkyOrientationPtr, NIL)
  }

  public fun environmentSetBgColor(env: RID, color: Color) {
    TransferContext.writeArguments(_RID to env, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBgColorPtr, NIL)
  }

  public fun environmentSetBgEnergy(
    env: RID,
    multiplier: Float,
    exposureValue: Float,
  ) {
    TransferContext.writeArguments(_RID to env, DOUBLE to multiplier.toDouble(), DOUBLE to exposureValue.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetBgEnergyPtr, NIL)
  }

  public fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int) {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetCanvasMaxLayerPtr, NIL)
  }

  @JvmOverloads
  public fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    ambient: EnvironmentAmbientSource =
        RenderingServer.EnvironmentAmbientSource.ENV_AMBIENT_SOURCE_BG,
    energy: Float = 1.0f,
    skyContibution: Float = 0.0f,
    reflectionSource: EnvironmentReflectionSource =
        RenderingServer.EnvironmentReflectionSource.ENV_REFLECTION_SOURCE_BG,
  ) {
    TransferContext.writeArguments(_RID to env, COLOR to color, LONG to ambient.id, DOUBLE to energy.toDouble(), DOUBLE to skyContibution.toDouble(), LONG to reflectionSource.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetAmbientLightPtr, NIL)
  }

  public fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levels: PackedFloat32Array,
    intensity: Float,
    strength: Float,
    mix: Float,
    bloomThreshold: Float,
    blendMode: EnvironmentGlowBlendMode,
    hdrBleedThreshold: Float,
    hdrBleedScale: Float,
    hdrLuminanceCap: Float,
    glowMapStrength: Float,
    glowMap: RID,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, PACKED_FLOAT_32_ARRAY to levels, DOUBLE to intensity.toDouble(), DOUBLE to strength.toDouble(), DOUBLE to mix.toDouble(), DOUBLE to bloomThreshold.toDouble(), LONG to blendMode.id, DOUBLE to hdrBleedThreshold.toDouble(), DOUBLE to hdrBleedScale.toDouble(), DOUBLE to hdrLuminanceCap.toDouble(), DOUBLE to glowMapStrength.toDouble(), _RID to glowMap)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetGlowPtr, NIL)
  }

  public fun environmentSetTonemap(
    env: RID,
    toneMapper: EnvironmentToneMapper,
    exposure: Float,
    white: Float,
  ) {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper.id, DOUBLE to exposure.toDouble(), DOUBLE to white.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetTonemapPtr, NIL)
  }

  public fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Float,
    contrast: Float,
    saturation: Float,
    use1dColorCorrection: Boolean,
    colorCorrection: RID,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to brightness.toDouble(), DOUBLE to contrast.toDouble(), DOUBLE to saturation.toDouble(), BOOL to use1dColorCorrection, _RID to colorCorrection)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetAdjustmentPtr, NIL)
  }

  public fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Int,
    fadeIn: Float,
    fadeOut: Float,
    depthTolerance: Float,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to maxSteps.toLong(), DOUBLE to fadeIn.toDouble(), DOUBLE to fadeOut.toDouble(), DOUBLE to depthTolerance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsrPtr, NIL)
  }

  public fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Float,
    intensity: Float,
    power: Float,
    detail: Float,
    horizon: Float,
    sharpness: Float,
    lightAffect: Float,
    aoChannelAffect: Float,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to radius.toDouble(), DOUBLE to intensity.toDouble(), DOUBLE to power.toDouble(), DOUBLE to detail.toDouble(), DOUBLE to horizon.toDouble(), DOUBLE to sharpness.toDouble(), DOUBLE to lightAffect.toDouble(), DOUBLE to aoChannelAffect.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsaoPtr, NIL)
  }

  public fun environmentSetFog(
    env: RID,
    enable: Boolean,
    lightColor: Color,
    lightEnergy: Float,
    sunScatter: Float,
    density: Float,
    height: Float,
    heightDensity: Float,
    aerialPerspective: Float,
    skyAffect: Float,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, COLOR to lightColor, DOUBLE to lightEnergy.toDouble(), DOUBLE to sunScatter.toDouble(), DOUBLE to density.toDouble(), DOUBLE to height.toDouble(), DOUBLE to heightDensity.toDouble(), DOUBLE to aerialPerspective.toDouble(), DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetFogPtr, NIL)
  }

  public fun environmentSetSdfgi(
    env: RID,
    enable: Boolean,
    cascades: Int,
    minCellSize: Float,
    yScale: EnvironmentSDFGIYScale,
    useOcclusion: Boolean,
    bounceFeedback: Float,
    readSky: Boolean,
    energy: Float,
    normalBias: Float,
    probeBias: Float,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to cascades.toLong(), DOUBLE to minCellSize.toDouble(), LONG to yScale.id, BOOL to useOcclusion, DOUBLE to bounceFeedback.toDouble(), BOOL to readSky, DOUBLE to energy.toDouble(), DOUBLE to normalBias.toDouble(), DOUBLE to probeBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiPtr, NIL)
  }

  public fun environmentSetVolumetricFog(
    env: RID,
    enable: Boolean,
    density: Float,
    albedo: Color,
    emission: Color,
    emissionEnergy: Float,
    anisotropy: Float,
    length: Float,
    pDetailSpread: Float,
    giInject: Float,
    temporalReprojection: Boolean,
    temporalReprojectionAmount: Float,
    ambientInject: Float,
    skyAffect: Float,
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to density.toDouble(), COLOR to albedo, COLOR to emission, DOUBLE to emissionEnergy.toDouble(), DOUBLE to anisotropy.toDouble(), DOUBLE to length.toDouble(), DOUBLE to pDetailSpread.toDouble(), DOUBLE to giInject.toDouble(), BOOL to temporalReprojection, DOUBLE to temporalReprojectionAmount.toDouble(), DOUBLE to ambientInject.toDouble(), DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogPtr, NIL)
  }

  public fun environmentGlowSetUseBicubicUpscale(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentGlowSetUseBicubicUpscalePtr, NIL)
  }

  public fun environmentSetSsrRoughnessQuality(quality: EnvironmentSSRRoughnessQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsrRoughnessQualityPtr, NIL)
  }

  public fun environmentSetSsaoQuality(
    quality: EnvironmentSSAOQuality,
    halfSize: Boolean,
    adaptiveTarget: Float,
    blurPasses: Int,
    fadeoutFrom: Float,
    fadeoutTo: Float,
  ) {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget.toDouble(), LONG to blurPasses.toLong(), DOUBLE to fadeoutFrom.toDouble(), DOUBLE to fadeoutTo.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsaoQualityPtr, NIL)
  }

  public fun environmentSetSsilQuality(
    quality: EnvironmentSSILQuality,
    halfSize: Boolean,
    adaptiveTarget: Float,
    blurPasses: Int,
    fadeoutFrom: Float,
    fadeoutTo: Float,
  ) {
    TransferContext.writeArguments(LONG to quality.id, BOOL to halfSize, DOUBLE to adaptiveTarget.toDouble(), LONG to blurPasses.toLong(), DOUBLE to fadeoutFrom.toDouble(), DOUBLE to fadeoutTo.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSsilQualityPtr, NIL)
  }

  public fun environmentSetSdfgiRayCount(rayCount: EnvironmentSDFGIRayCount) {
    TransferContext.writeArguments(LONG to rayCount.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiRayCountPtr, NIL)
  }

  public fun environmentSetSdfgiFramesToConverge(frames: EnvironmentSDFGIFramesToConverge) {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiFramesToConvergePtr, NIL)
  }

  public fun environmentSetSdfgiFramesToUpdateLight(frames: EnvironmentSDFGIFramesToUpdateLight) {
    TransferContext.writeArguments(LONG to frames.id)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetSdfgiFramesToUpdateLightPtr,
        NIL)
  }

  public fun environmentSetVolumetricFogVolumeSize(size: Int, depth: Int) {
    TransferContext.writeArguments(LONG to size.toLong(), LONG to depth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogVolumeSizePtr, NIL)
  }

  public fun environmentSetVolumetricFogFilterActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentSetVolumetricFogFilterActivePtr,
        NIL)
  }

  public fun environmentBakePanorama(
    environment: RID,
    bakeIrradiance: Boolean,
    size: Vector2i,
  ): Image? {
    TransferContext.writeArguments(_RID to environment, BOOL to bakeIrradiance, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.environmentBakePanoramaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public fun screenSpaceRoughnessLimiterSetActive(
    enable: Boolean,
    amount: Float,
    limit: Float,
  ) {
    TransferContext.writeArguments(BOOL to enable, DOUBLE to amount.toDouble(), DOUBLE to limit.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.screenSpaceRoughnessLimiterSetActivePtr, NIL)
  }

  public fun subSurfaceScatteringSetQuality(quality: SubSurfaceScatteringQuality) {
    TransferContext.writeArguments(LONG to quality.id)
    TransferContext.callMethod(rawPtr, MethodBindings.subSurfaceScatteringSetQualityPtr, NIL)
  }

  public fun subSurfaceScatteringSetScale(scale: Float, depthScale: Float) {
    TransferContext.writeArguments(DOUBLE to scale.toDouble(), DOUBLE to depthScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.subSurfaceScatteringSetScalePtr, NIL)
  }

  public fun cameraAttributesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun cameraAttributesSetDofBlurQuality(quality: DOFBlurQuality, useJitter: Boolean) {
    TransferContext.writeArguments(LONG to quality.id, BOOL to useJitter)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurQualityPtr, NIL)
  }

  public fun cameraAttributesSetDofBlurBokehShape(shape: DOFBokehShape) {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurBokehShapePtr, NIL)
  }

  public fun cameraAttributesSetDofBlur(
    cameraAttributes: RID,
    farEnable: Boolean,
    farDistance: Float,
    farTransition: Float,
    nearEnable: Boolean,
    nearDistance: Float,
    nearTransition: Float,
    amount: Float,
  ) {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to farEnable, DOUBLE to farDistance.toDouble(), DOUBLE to farTransition.toDouble(), BOOL to nearEnable, DOUBLE to nearDistance.toDouble(), DOUBLE to nearTransition.toDouble(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetDofBlurPtr, NIL)
  }

  public fun cameraAttributesSetExposure(
    cameraAttributes: RID,
    multiplier: Float,
    normalization: Float,
  ) {
    TransferContext.writeArguments(_RID to cameraAttributes, DOUBLE to multiplier.toDouble(), DOUBLE to normalization.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetExposurePtr, NIL)
  }

  public fun cameraAttributesSetAutoExposure(
    cameraAttributes: RID,
    enable: Boolean,
    minSensitivity: Float,
    maxSensitivity: Float,
    speed: Float,
    scale: Float,
  ) {
    TransferContext.writeArguments(_RID to cameraAttributes, BOOL to enable, DOUBLE to minSensitivity.toDouble(), DOUBLE to maxSensitivity.toDouble(), DOUBLE to speed.toDouble(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.cameraAttributesSetAutoExposurePtr, NIL)
  }

  public fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun scenarioSetEnvironment(scenario: RID, environment: RID) {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetEnvironmentPtr, NIL)
  }

  public fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetFallbackEnvironmentPtr, NIL)
  }

  public fun scenarioSetCameraAttributes(scenario: RID, effects: RID) {
    TransferContext.writeArguments(_RID to scenario, _RID to effects)
    TransferContext.callMethod(rawPtr, MethodBindings.scenarioSetCameraAttributesPtr, NIL)
  }

  public fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceCreate2Ptr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.instanceCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun instanceSetBase(instance: RID, base: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetBasePtr, NIL)
  }

  public fun instanceSetScenario(instance: RID, scenario: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetScenarioPtr, NIL)
  }

  public fun instanceSetLayerMask(instance: RID, mask: Long) {
    TransferContext.writeArguments(_RID to instance, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetLayerMaskPtr, NIL)
  }

  public fun instanceSetPivotData(
    instance: RID,
    sortingOffset: Float,
    useAabbCenter: Boolean,
  ) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to sortingOffset.toDouble(), BOOL to useAabbCenter)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetPivotDataPtr, NIL)
  }

  public fun instanceSetTransform(instance: RID, transform: Transform3D) {
    TransferContext.writeArguments(_RID to instance, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetTransformPtr, NIL)
  }

  public fun instanceAttachObjectInstanceId(instance: RID, id: Long) {
    TransferContext.writeArguments(_RID to instance, LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceAttachObjectInstanceIdPtr, NIL)
  }

  public fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Int,
    weight: Float,
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to shape.toLong(), DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetBlendShapeWeightPtr, NIL)
  }

  public fun instanceSetSurfaceOverrideMaterial(
    instance: RID,
    surface: Int,
    material: RID,
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to surface.toLong(), _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetSurfaceOverrideMaterialPtr, NIL)
  }

  public fun instanceSetVisible(instance: RID, visible: Boolean) {
    TransferContext.writeArguments(_RID to instance, BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetVisiblePtr, NIL)
  }

  public fun instanceGeometrySetTransparency(instance: RID, transparency: Float) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to transparency.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetTransparencyPtr, NIL)
  }

  public fun instanceSetCustomAabb(instance: RID, aabb: CoreAABB) {
    TransferContext.writeArguments(_RID to instance, VariantTypeAABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetCustomAabbPtr, NIL)
  }

  public fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to skeleton)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceAttachSkeletonPtr, NIL)
  }

  public fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetExtraVisibilityMarginPtr, NIL)
  }

  public fun instanceSetVisibilityParent(instance: RID, parent: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetVisibilityParentPtr, NIL)
  }

  public fun instanceSetIgnoreCulling(instance: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to instance, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceSetIgnoreCullingPtr, NIL)
  }

  public fun instanceGeometrySetFlag(
    instance: RID,
    flag: InstanceFlags,
    enabled: Boolean,
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetFlagPtr, NIL)
  }

  public fun instanceGeometrySetCastShadowsSetting(instance: RID,
      shadowCastingSetting: ShadowCastingSetting) {
    TransferContext.writeArguments(_RID to instance, LONG to shadowCastingSetting.id)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetCastShadowsSettingPtr, NIL)
  }

  public fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetMaterialOverridePtr, NIL)
  }

  public fun instanceGeometrySetMaterialOverlay(instance: RID, material: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetMaterialOverlayPtr, NIL)
  }

  public fun instanceGeometrySetVisibilityRange(
    instance: RID,
    min: Float,
    max: Float,
    minMargin: Float,
    maxMargin: Float,
    fadeMode: VisibilityRangeFadeMode,
  ) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), DOUBLE to minMargin.toDouble(), DOUBLE to maxMargin.toDouble(), LONG to fadeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetVisibilityRangePtr, NIL)
  }

  public fun instanceGeometrySetLightmap(
    instance: RID,
    lightmap: RID,
    lightmapUvScale: Rect2,
    lightmapSlice: Int,
  ) {
    TransferContext.writeArguments(_RID to instance, _RID to lightmap, RECT2 to lightmapUvScale, LONG to lightmapSlice.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetLightmapPtr, NIL)
  }

  public fun instanceGeometrySetLodBias(instance: RID, lodBias: Float) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to lodBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetLodBiasPtr, NIL)
  }

  public fun instanceGeometrySetShaderParameter(
    instance: RID,
    parameter: StringName,
    `value`: Any?,
  ) {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometrySetShaderParameterPtr, NIL)
  }

  public fun instanceGeometryGetShaderParameter(instance: RID, parameter: StringName): Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometryGetShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun instanceGeometryGetShaderParameterDefaultValue(instance: RID, parameter: StringName):
      Any? {
    TransferContext.writeArguments(_RID to instance, STRING_NAME to parameter)
    TransferContext.callMethod(rawPtr,
        MethodBindings.instanceGeometryGetShaderParameterDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun instanceGeometryGetShaderParameterList(instance: RID):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to instance)
    TransferContext.callMethod(rawPtr, MethodBindings.instanceGeometryGetShaderParameterListPtr,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  @JvmOverloads
  public fun instancesCullAabb(aabb: CoreAABB, scenario: RID = RID()): PackedInt64Array {
    TransferContext.writeArguments(VariantTypeAABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullAabbPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  @JvmOverloads
  public fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID(),
  ): PackedInt64Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullRayPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  @JvmOverloads
  public fun instancesCullConvex(convex: VariantArray<Plane>, scenario: RID = RID()):
      PackedInt64Array {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr, MethodBindings.instancesCullConvexPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public fun bakeRenderUv2(
    base: RID,
    materialOverrides: VariantArray<RID>,
    imageSize: Vector2i,
  ): VariantArray<Image> {
    TransferContext.writeArguments(_RID to base, ARRAY to materialOverrides, VECTOR2I to imageSize)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeRenderUv2Ptr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  public fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2,
  ) {
    TransferContext.writeArguments(_RID to canvas, _RID to item, VECTOR2 to mirroring)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetItemMirroringPtr, NIL)
  }

  public fun canvasSetModulate(canvas: RID, color: Color) {
    TransferContext.writeArguments(_RID to canvas, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetModulatePtr, NIL)
  }

  public fun canvasSetDisableScale(disable: Boolean) {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetDisableScalePtr, NIL)
  }

  public fun canvasTextureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasTextureSetChannel(
    canvasTexture: RID,
    channel: CanvasTextureChannel,
    texture: RID,
  ) {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to channel.id, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetChannelPtr, NIL)
  }

  public fun canvasTextureSetShadingParameters(
    canvasTexture: RID,
    baseColor: Color,
    shininess: Float,
  ) {
    TransferContext.writeArguments(_RID to canvasTexture, COLOR to baseColor, DOUBLE to shininess.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetShadingParametersPtr, NIL)
  }

  public fun canvasTextureSetTextureFilter(canvasTexture: RID, filter: CanvasItemTextureFilter) {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetTextureFilterPtr, NIL)
  }

  public fun canvasTextureSetTextureRepeat(canvasTexture: RID, repeat: CanvasItemTextureRepeat) {
    TransferContext.writeArguments(_RID to canvasTexture, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasTextureSetTextureRepeatPtr, NIL)
  }

  public fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasItemSetParent(item: RID, parent: RID) {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetParentPtr, NIL)
  }

  public fun canvasItemSetDefaultTextureFilter(item: RID, filter: CanvasItemTextureFilter) {
    TransferContext.writeArguments(_RID to item, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDefaultTextureFilterPtr, NIL)
  }

  public fun canvasItemSetDefaultTextureRepeat(item: RID, repeat: CanvasItemTextureRepeat) {
    TransferContext.writeArguments(_RID to item, LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDefaultTextureRepeatPtr, NIL)
  }

  public fun canvasItemSetVisible(item: RID, visible: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisiblePtr, NIL)
  }

  public fun canvasItemSetLightMask(item: RID, mask: Int) {
    TransferContext.writeArguments(_RID to item, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetLightMaskPtr, NIL)
  }

  public fun canvasItemSetVisibilityLayer(item: RID, visibilityLayer: Long) {
    TransferContext.writeArguments(_RID to item, LONG to visibilityLayer)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisibilityLayerPtr, NIL)
  }

  public fun canvasItemSetTransform(item: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetTransformPtr, NIL)
  }

  public fun canvasItemSetClip(item: RID, clip: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetClipPtr, NIL)
  }

  public fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDistanceFieldModePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
  ) {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCustomRectPtr, NIL)
  }

  public fun canvasItemSetModulate(item: RID, color: Color) {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetModulatePtr, NIL)
  }

  public fun canvasItemSetSelfModulate(item: RID, color: Color) {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetSelfModulatePtr, NIL)
  }

  public fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDrawBehindParentPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to item, VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddLinePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddPolyline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPolylinePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddMultiline(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
  ) {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMultilinePtr, NIL)
  }

  public fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color,
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddRectPtr, NIL)
  }

  public fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Float,
    color: Color,
  ) {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddCirclePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTextureRectPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddMsdfTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Int = 0,
    pxRange: Float = 1.0f,
    scale: Float = 1.0f,
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, LONG to outlineSize.toLong(), DOUBLE to pxRange.toDouble(), DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMsdfTextureRectRegionPtr, NIL)
  }

  public fun canvasItemAddLcdTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color,
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddLcdTextureRectRegionPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTextureRectRegionPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: NinePatchAxisMode = RenderingServer.NinePatchAxisMode.NINE_PATCH_STRETCH,
    yAxisMode: NinePatchAxisMode = RenderingServer.NinePatchAxisMode.NINE_PATCH_STRETCH,
    drawCenter: Boolean = true,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, RECT2 to source, _RID to texture, VECTOR2 to topleft, VECTOR2 to bottomright, LONG to xAxisMode.id, LONG to yAxisMode.id, BOOL to drawCenter, COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddNinePatchPtr, NIL)
  }

  public fun canvasItemAddPrimitive(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: RID,
  ) {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPrimitivePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddPolygon(
    item: RID,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to item, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddPolygonPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddTriangleArray(
    item: RID,
    indices: PackedInt32Array,
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    bones: PackedInt32Array = PackedInt32Array(),
    weights: PackedFloat32Array = PackedFloat32Array(),
    texture: RID = RID(),
    count: Int = -1,
  ) {
    TransferContext.writeArguments(_RID to item, PACKED_INT_32_ARRAY to indices, PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, PACKED_INT_32_ARRAY to bones, PACKED_FLOAT_32_ARRAY to weights, _RID to texture, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddTriangleArrayPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
    texture: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to item, _RID to mesh, TRANSFORM2D to transform, COLOR to modulate, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMeshPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID = RID(),
  ) {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddMultimeshPtr, NIL)
  }

  public fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
  ) {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddParticlesPtr, NIL)
  }

  public fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddSetTransformPtr, NIL)
  }

  public fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddClipIgnorePtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemAddAnimationSlice(
    item: RID,
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0,
  ) {
    TransferContext.writeArguments(_RID to item, DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemAddAnimationSlicePtr, NIL)
  }

  public fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetSortChildrenByYPtr, NIL)
  }

  public fun canvasItemSetZIndex(item: RID, zIndex: Int) {
    TransferContext.writeArguments(_RID to item, LONG to zIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetZIndexPtr, NIL)
  }

  public fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetZAsRelativeToParentPtr, NIL)
  }

  public fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2,
  ) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCopyToBackbufferPtr, NIL)
  }

  public fun canvasItemClear(item: RID) {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemClearPtr, NIL)
  }

  public fun canvasItemSetDrawIndex(item: RID, index: Int) {
    TransferContext.writeArguments(_RID to item, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetDrawIndexPtr, NIL)
  }

  public fun canvasItemSetMaterial(item: RID, material: RID) {
    TransferContext.writeArguments(_RID to item, _RID to material)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetMaterialPtr, NIL)
  }

  public fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetUseParentMaterialPtr, NIL)
  }

  public fun canvasItemSetVisibilityNotifier(
    item: RID,
    enable: Boolean,
    area: Rect2,
    enterCallable: Callable,
    exitCallable: Callable,
  ) {
    TransferContext.writeArguments(_RID to item, BOOL to enable, RECT2 to area, CALLABLE to enterCallable, CALLABLE to exitCallable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetVisibilityNotifierPtr, NIL)
  }

  @JvmOverloads
  public fun canvasItemSetCanvasGroupMode(
    item: RID,
    mode: CanvasGroupMode,
    clearMargin: Float = 5.0f,
    fitEmpty: Boolean = false,
    fitMargin: Float = 0.0f,
    blurMipmaps: Boolean = false,
  ) {
    TransferContext.writeArguments(_RID to item, LONG to mode.id, DOUBLE to clearMargin.toDouble(), BOOL to fitEmpty, DOUBLE to fitMargin.toDouble(), BOOL to blurMipmaps)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasItemSetCanvasGroupModePtr, NIL)
  }

  public fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to light, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightAttachToCanvasPtr, NIL)
  }

  public fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetEnabledPtr, NIL)
  }

  public fun canvasLightSetTextureScale(light: RID, scale: Float) {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTextureScalePtr, NIL)
  }

  public fun canvasLightSetTransform(light: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to light, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTransformPtr, NIL)
  }

  public fun canvasLightSetTexture(light: RID, texture: RID) {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTexturePtr, NIL)
  }

  public fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
    TransferContext.writeArguments(_RID to light, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetTextureOffsetPtr, NIL)
  }

  public fun canvasLightSetColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetColorPtr, NIL)
  }

  public fun canvasLightSetHeight(light: RID, height: Float) {
    TransferContext.writeArguments(_RID to light, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetHeightPtr, NIL)
  }

  public fun canvasLightSetEnergy(light: RID, energy: Float) {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetEnergyPtr, NIL)
  }

  public fun canvasLightSetZRange(
    light: RID,
    minZ: Int,
    maxZ: Int,
  ) {
    TransferContext.writeArguments(_RID to light, LONG to minZ.toLong(), LONG to maxZ.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetZRangePtr, NIL)
  }

  public fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Int,
    maxLayer: Int,
  ) {
    TransferContext.writeArguments(_RID to light, LONG to minLayer.toLong(), LONG to maxLayer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetLayerRangePtr, NIL)
  }

  public fun canvasLightSetItemCullMask(light: RID, mask: Int) {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetItemCullMaskPtr, NIL)
  }

  public fun canvasLightSetItemShadowCullMask(light: RID, mask: Int) {
    TransferContext.writeArguments(_RID to light, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetItemShadowCullMaskPtr, NIL)
  }

  public fun canvasLightSetMode(light: RID, mode: CanvasLightMode) {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetModePtr, NIL)
  }

  public fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowEnabledPtr, NIL)
  }

  public fun canvasLightSetShadowFilter(light: RID, filter: CanvasLightShadowFilter) {
    TransferContext.writeArguments(_RID to light, LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowFilterPtr, NIL)
  }

  public fun canvasLightSetShadowColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowColorPtr, NIL)
  }

  public fun canvasLightSetShadowSmooth(light: RID, smooth: Float) {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetShadowSmoothPtr, NIL)
  }

  public fun canvasLightSetBlendMode(light: RID, mode: CanvasLightBlendMode) {
    TransferContext.writeArguments(_RID to light, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightSetBlendModePtr, NIL)
  }

  public fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to occluder, _RID to canvas)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderAttachToCanvasPtr, NIL)
  }

  public fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to occluder, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetEnabledPtr, NIL)
  }

  public fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
    TransferContext.writeArguments(_RID to occluder, _RID to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetPolygonPtr, NIL)
  }

  public fun canvasLightOccluderSetAsSdfCollision(occluder: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to occluder, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetAsSdfCollisionPtr, NIL)
  }

  public fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to occluder, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetTransformPtr, NIL)
  }

  public fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int) {
    TransferContext.writeArguments(_RID to occluder, LONG to mask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasLightOccluderSetLightMaskPtr, NIL)
  }

  public fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PackedVector2Array,
    closed: Boolean,
  ) {
    TransferContext.writeArguments(_RID to occluderPolygon, PACKED_VECTOR2_ARRAY to shape, BOOL to closed)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonSetShapePtr, NIL)
  }

  public fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID,
      mode: CanvasOccluderPolygonCullMode) {
    TransferContext.writeArguments(_RID to occluderPolygon, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.canvasOccluderPolygonSetCullModePtr, NIL)
  }

  public fun canvasSetShadowTextureSize(size: Int) {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canvasSetShadowTextureSizePtr, NIL)
  }

  public fun globalShaderParameterAdd(
    name: StringName,
    type: GlobalShaderParameterType,
    defaultValue: Any?,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, ANY to defaultValue)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterAddPtr, NIL)
  }

  public fun globalShaderParameterRemove(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterRemovePtr, NIL)
  }

  public fun globalShaderParameterGetList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public fun globalShaderParameterSet(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterSetPtr, NIL)
  }

  public fun globalShaderParameterSetOverride(name: StringName, `value`: Any?) {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterSetOverridePtr, NIL)
  }

  public fun globalShaderParameterGet(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun globalShaderParameterGetType(name: StringName): GlobalShaderParameterType {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.globalShaderParameterGetTypePtr, LONG)
    return RenderingServer.GlobalShaderParameterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  public fun requestFrameDrawnCallback(callable: Callable) {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.requestFrameDrawnCallbackPtr, NIL)
  }

  public fun hasChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getRenderingInfo(info: RenderingInfo): Long {
    TransferContext.writeArguments(LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderingInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getVideoAdapterVendor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterVendorPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getVideoAdapterType(): RenderingDevice.DeviceType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterTypePtr, LONG)
    return RenderingDevice.DeviceType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getVideoAdapterApiVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterApiVersionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun makeSphereMesh(
    latitudes: Int,
    longitudes: Int,
    radius: Float,
  ): RID {
    TransferContext.writeArguments(LONG to latitudes.toLong(), LONG to longitudes.toLong(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.makeSphereMeshPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTestCubePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTestTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWhiteTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  @JvmOverloads
  public fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true,
  ) {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to useFilter)
    TransferContext.callMethod(rawPtr, MethodBindings.setBootImagePtr, NIL)
  }

  public fun getDefaultClearColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultClearColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setDefaultClearColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultClearColorPtr, NIL)
  }

  public fun hasFeature(feature: Features): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, MethodBindings.hasOsFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDebugGenerateWireframes(generate: Boolean) {
    TransferContext.writeArguments(BOOL to generate)
    TransferContext.callMethod(rawPtr, MethodBindings.setDebugGenerateWireframesPtr, NIL)
  }

  public fun isRenderLoopEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRenderLoopEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setRenderLoopEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setRenderLoopEnabledPtr, NIL)
  }

  public fun getFrameSetupTimeCpu(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameSetupTimeCpuPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun forceSync() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceSyncPtr, NIL)
  }

  @JvmOverloads
  public fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0) {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, MethodBindings.forceDrawPtr, NIL)
  }

  public fun getRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderingDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  public fun createLocalRenderingDevice(): RenderingDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createLocalRenderingDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderingDevice?)
  }

  public enum class TextureLayeredType(
    id: Long,
  ) {
    TEXTURE_LAYERED_2D_ARRAY(0),
    TEXTURE_LAYERED_CUBEMAP(1),
    TEXTURE_LAYERED_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureLayeredType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CubeMapLayer(
    id: Long,
  ) {
    CUBEMAP_LAYER_LEFT(0),
    CUBEMAP_LAYER_RIGHT(1),
    CUBEMAP_LAYER_BOTTOM(2),
    CUBEMAP_LAYER_TOP(3),
    CUBEMAP_LAYER_FRONT(4),
    CUBEMAP_LAYER_BACK(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CubeMapLayer = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShaderMode(
    id: Long,
  ) {
    SHADER_SPATIAL(0),
    SHADER_CANVAS_ITEM(1),
    SHADER_PARTICLES(2),
    SHADER_SKY(3),
    SHADER_FOG(4),
    SHADER_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShaderMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ArrayType(
    id: Long,
  ) {
    ARRAY_VERTEX(0),
    ARRAY_NORMAL(1),
    ARRAY_TANGENT(2),
    ARRAY_COLOR(3),
    ARRAY_TEX_UV(4),
    ARRAY_TEX_UV2(5),
    ARRAY_CUSTOM0(6),
    ARRAY_CUSTOM1(7),
    ARRAY_CUSTOM2(8),
    ARRAY_CUSTOM3(9),
    ARRAY_BONES(10),
    ARRAY_WEIGHTS(11),
    ARRAY_INDEX(12),
    ARRAY_MAX(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long,
  ) {
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    ARRAY_CUSTOM_RG_HALF(2),
    ARRAY_CUSTOM_RGBA_HALF(3),
    ARRAY_CUSTOM_R_FLOAT(4),
    ARRAY_CUSTOM_RG_FLOAT(5),
    ARRAY_CUSTOM_RGB_FLOAT(6),
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayCustomFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public sealed interface ArrayFormat {
    public val flag: Long

    public infix fun or(other: godot.RenderingServer.ArrayFormat): godot.RenderingServer.ArrayFormat
        = ArrayFormatValue(flag.or(other.flag))

    public infix fun or(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.or(other))

    public infix fun xor(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.xor(other.flag))

    public infix fun xor(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.xor(other))

    public infix fun and(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.and(other.flag))

    public infix fun and(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.and(other))

    public operator fun plus(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.plus(other.flag))

    public operator fun plus(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.plus(other))

    public operator fun minus(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.minus(other.flag))

    public operator fun minus(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.minus(other))

    public operator fun times(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.times(other.flag))

    public operator fun times(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.times(other))

    public operator fun div(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.div(other.flag))

    public operator fun div(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.div(other))

    public operator fun rem(other: godot.RenderingServer.ArrayFormat):
        godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.rem(other.flag))

    public operator fun rem(other: Long): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag.rem(other))

    public fun unaryPlus(): godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.unaryPlus())

    public fun unaryMinus(): godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.unaryMinus())

    public fun inv(): godot.RenderingServer.ArrayFormat = ArrayFormatValue(flag.inv())

    public infix fun shl(bits: Int): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag shl bits)

    public infix fun shr(bits: Int): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag shr bits)

    public infix fun ushr(bits: Int): godot.RenderingServer.ArrayFormat =
        ArrayFormatValue(flag ushr bits)

    public companion object {
      public val ARRAY_FORMAT_VERTEX: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(1)

      public val ARRAY_FORMAT_NORMAL: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(2)

      public val ARRAY_FORMAT_TANGENT: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(4)

      public val ARRAY_FORMAT_COLOR: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(8)

      public val ARRAY_FORMAT_TEX_UV: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(16)

      public val ARRAY_FORMAT_TEX_UV2: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(32)

      public val ARRAY_FORMAT_CUSTOM0: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(64)

      public val ARRAY_FORMAT_CUSTOM1: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(128)

      public val ARRAY_FORMAT_CUSTOM2: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(256)

      public val ARRAY_FORMAT_CUSTOM3: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(512)

      public val ARRAY_FORMAT_BONES: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(1_024)

      public val ARRAY_FORMAT_WEIGHTS: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(2_048)

      public val ARRAY_FORMAT_INDEX: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(4_096)

      public val ARRAY_FORMAT_BLEND_SHAPE_MASK: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(7)

      public val ARRAY_FORMAT_CUSTOM_BASE: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM_BITS: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(3)

      public val ARRAY_FORMAT_CUSTOM0_SHIFT: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM1_SHIFT: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(16)

      public val ARRAY_FORMAT_CUSTOM2_SHIFT: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(19)

      public val ARRAY_FORMAT_CUSTOM3_SHIFT: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(22)

      public val ARRAY_FORMAT_CUSTOM_MASK: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(7)

      public val ARRAY_COMPRESS_FLAGS_BASE: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(25)

      public val ARRAY_FLAG_USE_2D_VERTICES: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(33_554_432)

      public val ARRAY_FLAG_USE_DYNAMIC_UPDATE: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(67_108_864)

      public val ARRAY_FLAG_USE_8_BONE_WEIGHTS: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(134_217_728)

      public val ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY: godot.RenderingServer.ArrayFormat =
          godot.RenderingServer.ArrayFormatValue(268_435_456)
    }
  }

  @JvmInline
  internal value class ArrayFormatValue internal constructor(
    override val flag: Long,
  ) : godot.RenderingServer.ArrayFormat

  public enum class PrimitiveType(
    id: Long,
  ) {
    PRIMITIVE_POINTS(0),
    PRIMITIVE_LINES(1),
    PRIMITIVE_LINE_STRIP(2),
    PRIMITIVE_TRIANGLES(3),
    PRIMITIVE_TRIANGLE_STRIP(4),
    PRIMITIVE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PrimitiveType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BlendShapeMode(
    id: Long,
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendShapeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class MultimeshTransformFormat(
    id: Long,
  ) {
    MULTIMESH_TRANSFORM_2D(0),
    MULTIMESH_TRANSFORM_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MultimeshTransformFormat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightProjectorFilter(
    id: Long,
  ) {
    LIGHT_PROJECTOR_FILTER_NEAREST(0),
    LIGHT_PROJECTOR_FILTER_LINEAR(1),
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS(2),
    LIGHT_PROJECTOR_FILTER_LINEAR_MIPMAPS(3),
    LIGHT_PROJECTOR_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    LIGHT_PROJECTOR_FILTER_LINEAR_MIPMAPS_ANISOTROPIC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightProjectorFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightType(
    id: Long,
  ) {
    LIGHT_DIRECTIONAL(0),
    LIGHT_OMNI(1),
    LIGHT_SPOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightParam(
    id: Long,
  ) {
    LIGHT_PARAM_ENERGY(0),
    LIGHT_PARAM_INDIRECT_ENERGY(1),
    LIGHT_PARAM_VOLUMETRIC_FOG_ENERGY(2),
    LIGHT_PARAM_SPECULAR(3),
    LIGHT_PARAM_RANGE(4),
    LIGHT_PARAM_SIZE(5),
    LIGHT_PARAM_ATTENUATION(6),
    LIGHT_PARAM_SPOT_ANGLE(7),
    LIGHT_PARAM_SPOT_ATTENUATION(8),
    LIGHT_PARAM_SHADOW_MAX_DISTANCE(9),
    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(10),
    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(11),
    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(12),
    LIGHT_PARAM_SHADOW_FADE_START(13),
    LIGHT_PARAM_SHADOW_NORMAL_BIAS(14),
    LIGHT_PARAM_SHADOW_BIAS(15),
    LIGHT_PARAM_SHADOW_PANCAKE_SIZE(16),
    LIGHT_PARAM_SHADOW_OPACITY(17),
    LIGHT_PARAM_SHADOW_BLUR(18),
    LIGHT_PARAM_TRANSMITTANCE_BIAS(19),
    LIGHT_PARAM_INTENSITY(20),
    LIGHT_PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightParam = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightBakeMode(
    id: Long,
  ) {
    LIGHT_BAKE_DISABLED(0),
    LIGHT_BAKE_STATIC(1),
    LIGHT_BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightBakeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightOmniShadowMode(
    id: Long,
  ) {
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),
    LIGHT_OMNI_SHADOW_CUBE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightOmniShadowMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightDirectionalShadowMode(
    id: Long,
  ) {
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightDirectionalShadowMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class LightDirectionalSkyMode(
    id: Long,
  ) {
    LIGHT_DIRECTIONAL_SKY_MODE_LIGHT_AND_SKY(0),
    LIGHT_DIRECTIONAL_SKY_MODE_LIGHT_ONLY(1),
    LIGHT_DIRECTIONAL_SKY_MODE_SKY_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LightDirectionalSkyMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShadowQuality(
    id: Long,
  ) {
    SHADOW_QUALITY_HARD(0),
    SHADOW_QUALITY_SOFT_VERY_LOW(1),
    SHADOW_QUALITY_SOFT_LOW(2),
    SHADOW_QUALITY_SOFT_MEDIUM(3),
    SHADOW_QUALITY_SOFT_HIGH(4),
    SHADOW_QUALITY_SOFT_ULTRA(5),
    SHADOW_QUALITY_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ReflectionProbeUpdateMode(
    id: Long,
  ) {
    REFLECTION_PROBE_UPDATE_ONCE(0),
    REFLECTION_PROBE_UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ReflectionProbeUpdateMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ReflectionProbeAmbientMode(
    id: Long,
  ) {
    REFLECTION_PROBE_AMBIENT_DISABLED(0),
    REFLECTION_PROBE_AMBIENT_ENVIRONMENT(1),
    REFLECTION_PROBE_AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ReflectionProbeAmbientMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DecalTexture(
    id: Long,
  ) {
    DECAL_TEXTURE_ALBEDO(0),
    DECAL_TEXTURE_NORMAL(1),
    DECAL_TEXTURE_ORM(2),
    DECAL_TEXTURE_EMISSION(3),
    DECAL_TEXTURE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DecalTexture = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DecalFilter(
    id: Long,
  ) {
    DECAL_FILTER_NEAREST(0),
    DECAL_FILTER_LINEAR(1),
    DECAL_FILTER_NEAREST_MIPMAPS(2),
    DECAL_FILTER_LINEAR_MIPMAPS(3),
    DECAL_FILTER_NEAREST_MIPMAPS_ANISOTROPIC(4),
    DECAL_FILTER_LINEAR_MIPMAPS_ANISOTROPIC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DecalFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VoxelGIQuality(
    id: Long,
  ) {
    VOXEL_GI_QUALITY_LOW(0),
    VOXEL_GI_QUALITY_HIGH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VoxelGIQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticlesMode(
    id: Long,
  ) {
    PARTICLES_MODE_2D(0),
    PARTICLES_MODE_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticlesMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticlesTransformAlign(
    id: Long,
  ) {
    PARTICLES_TRANSFORM_ALIGN_DISABLED(0),
    PARTICLES_TRANSFORM_ALIGN_Z_BILLBOARD(1),
    PARTICLES_TRANSFORM_ALIGN_Y_TO_VELOCITY(2),
    PARTICLES_TRANSFORM_ALIGN_Z_BILLBOARD_Y_TO_VELOCITY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticlesTransformAlign = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticlesDrawOrder(
    id: Long,
  ) {
    PARTICLES_DRAW_ORDER_INDEX(0),
    PARTICLES_DRAW_ORDER_LIFETIME(1),
    PARTICLES_DRAW_ORDER_REVERSE_LIFETIME(2),
    PARTICLES_DRAW_ORDER_VIEW_DEPTH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticlesDrawOrder = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticlesCollisionType(
    id: Long,
  ) {
    PARTICLES_COLLISION_TYPE_SPHERE_ATTRACT(0),
    PARTICLES_COLLISION_TYPE_BOX_ATTRACT(1),
    PARTICLES_COLLISION_TYPE_VECTOR_FIELD_ATTRACT(2),
    PARTICLES_COLLISION_TYPE_SPHERE_COLLIDE(3),
    PARTICLES_COLLISION_TYPE_BOX_COLLIDE(4),
    PARTICLES_COLLISION_TYPE_SDF_COLLIDE(5),
    PARTICLES_COLLISION_TYPE_HEIGHTFIELD_COLLIDE(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticlesCollisionType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ParticlesCollisionHeightfieldResolution(
    id: Long,
  ) {
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_256(0),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_512(1),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_1024(2),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_2048(3),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_4096(4),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_8192(5),
    PARTICLES_COLLISION_HEIGHTFIELD_RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParticlesCollisionHeightfieldResolution = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class FogVolumeShape(
    id: Long,
  ) {
    FOG_VOLUME_SHAPE_ELLIPSOID(0),
    FOG_VOLUME_SHAPE_CONE(1),
    FOG_VOLUME_SHAPE_CYLINDER(2),
    FOG_VOLUME_SHAPE_BOX(3),
    FOG_VOLUME_SHAPE_WORLD(4),
    FOG_VOLUME_SHAPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FogVolumeShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportScaling3DMode(
    id: Long,
  ) {
    VIEWPORT_SCALING_3D_MODE_BILINEAR(0),
    VIEWPORT_SCALING_3D_MODE_FSR(1),
    VIEWPORT_SCALING_3D_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportScaling3DMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportUpdateMode(
    id: Long,
  ) {
    VIEWPORT_UPDATE_DISABLED(0),
    VIEWPORT_UPDATE_ONCE(1),
    VIEWPORT_UPDATE_WHEN_VISIBLE(2),
    VIEWPORT_UPDATE_WHEN_PARENT_VISIBLE(3),
    VIEWPORT_UPDATE_ALWAYS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportUpdateMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportClearMode(
    id: Long,
  ) {
    VIEWPORT_CLEAR_ALWAYS(0),
    VIEWPORT_CLEAR_NEVER(1),
    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportClearMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportEnvironmentMode(
    id: Long,
  ) {
    VIEWPORT_ENVIRONMENT_DISABLED(0),
    VIEWPORT_ENVIRONMENT_ENABLED(1),
    VIEWPORT_ENVIRONMENT_INHERIT(2),
    VIEWPORT_ENVIRONMENT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportEnvironmentMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportSDFOversize(
    id: Long,
  ) {
    VIEWPORT_SDF_OVERSIZE_100_PERCENT(0),
    VIEWPORT_SDF_OVERSIZE_120_PERCENT(1),
    VIEWPORT_SDF_OVERSIZE_150_PERCENT(2),
    VIEWPORT_SDF_OVERSIZE_200_PERCENT(3),
    VIEWPORT_SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportSDFOversize = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportSDFScale(
    id: Long,
  ) {
    VIEWPORT_SDF_SCALE_100_PERCENT(0),
    VIEWPORT_SDF_SCALE_50_PERCENT(1),
    VIEWPORT_SDF_SCALE_25_PERCENT(2),
    VIEWPORT_SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportSDFScale = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportMSAA(
    id: Long,
  ) {
    VIEWPORT_MSAA_DISABLED(0),
    VIEWPORT_MSAA_2X(1),
    VIEWPORT_MSAA_4X(2),
    VIEWPORT_MSAA_8X(3),
    VIEWPORT_MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportMSAA = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportScreenSpaceAA(
    id: Long,
  ) {
    VIEWPORT_SCREEN_SPACE_AA_DISABLED(0),
    VIEWPORT_SCREEN_SPACE_AA_FXAA(1),
    VIEWPORT_SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportScreenSpaceAA = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportOcclusionCullingBuildQuality(
    id: Long,
  ) {
    VIEWPORT_OCCLUSION_BUILD_QUALITY_LOW(0),
    VIEWPORT_OCCLUSION_BUILD_QUALITY_MEDIUM(1),
    VIEWPORT_OCCLUSION_BUILD_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportOcclusionCullingBuildQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportRenderInfo(
    id: Long,
  ) {
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
    VIEWPORT_RENDER_INFO_PRIMITIVES_IN_FRAME(1),
    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(2),
    VIEWPORT_RENDER_INFO_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportRenderInfo = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportRenderInfoType(
    id: Long,
  ) {
    VIEWPORT_RENDER_INFO_TYPE_VISIBLE(0),
    VIEWPORT_RENDER_INFO_TYPE_SHADOW(1),
    VIEWPORT_RENDER_INFO_TYPE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportRenderInfoType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportDebugDraw(
    id: Long,
  ) {
    VIEWPORT_DEBUG_DRAW_DISABLED(0),
    VIEWPORT_DEBUG_DRAW_UNSHADED(1),
    VIEWPORT_DEBUG_DRAW_LIGHTING(2),
    VIEWPORT_DEBUG_DRAW_OVERDRAW(3),
    VIEWPORT_DEBUG_DRAW_WIREFRAME(4),
    VIEWPORT_DEBUG_DRAW_NORMAL_BUFFER(5),
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    VIEWPORT_DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    VIEWPORT_DEBUG_DRAW_SHADOW_ATLAS(9),
    VIEWPORT_DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    VIEWPORT_DEBUG_DRAW_SCENE_LUMINANCE(11),
    VIEWPORT_DEBUG_DRAW_SSAO(12),
    VIEWPORT_DEBUG_DRAW_SSIL(13),
    VIEWPORT_DEBUG_DRAW_PSSM_SPLITS(14),
    VIEWPORT_DEBUG_DRAW_DECAL_ATLAS(15),
    VIEWPORT_DEBUG_DRAW_SDFGI(16),
    VIEWPORT_DEBUG_DRAW_SDFGI_PROBES(17),
    VIEWPORT_DEBUG_DRAW_GI_BUFFER(18),
    VIEWPORT_DEBUG_DRAW_DISABLE_LOD(19),
    VIEWPORT_DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    VIEWPORT_DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    VIEWPORT_DEBUG_DRAW_CLUSTER_DECALS(22),
    VIEWPORT_DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    VIEWPORT_DEBUG_DRAW_OCCLUDERS(24),
    VIEWPORT_DEBUG_DRAW_MOTION_VECTORS(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportDebugDraw = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ViewportVRSMode(
    id: Long,
  ) {
    VIEWPORT_VRS_DISABLED(0),
    VIEWPORT_VRS_TEXTURE(1),
    VIEWPORT_VRS_XR(2),
    VIEWPORT_VRS_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ViewportVRSMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SkyMode(
    id: Long,
  ) {
    SKY_MODE_AUTOMATIC(0),
    SKY_MODE_QUALITY(1),
    SKY_MODE_INCREMENTAL(2),
    SKY_MODE_REALTIME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SkyMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentBG(
    id: Long,
  ) {
    ENV_BG_CLEAR_COLOR(0),
    ENV_BG_COLOR(1),
    ENV_BG_SKY(2),
    ENV_BG_CANVAS(3),
    ENV_BG_KEEP(4),
    ENV_BG_CAMERA_FEED(5),
    ENV_BG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentBG = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentAmbientSource(
    id: Long,
  ) {
    ENV_AMBIENT_SOURCE_BG(0),
    ENV_AMBIENT_SOURCE_DISABLED(1),
    ENV_AMBIENT_SOURCE_COLOR(2),
    ENV_AMBIENT_SOURCE_SKY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentAmbientSource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentReflectionSource(
    id: Long,
  ) {
    ENV_REFLECTION_SOURCE_BG(0),
    ENV_REFLECTION_SOURCE_DISABLED(1),
    ENV_REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentReflectionSource = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentGlowBlendMode(
    id: Long,
  ) {
    ENV_GLOW_BLEND_MODE_ADDITIVE(0),
    ENV_GLOW_BLEND_MODE_SCREEN(1),
    ENV_GLOW_BLEND_MODE_SOFTLIGHT(2),
    ENV_GLOW_BLEND_MODE_REPLACE(3),
    ENV_GLOW_BLEND_MODE_MIX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentGlowBlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentToneMapper(
    id: Long,
  ) {
    ENV_TONE_MAPPER_LINEAR(0),
    ENV_TONE_MAPPER_REINHARD(1),
    ENV_TONE_MAPPER_FILMIC(2),
    ENV_TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentToneMapper = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSSRRoughnessQuality(
    id: Long,
  ) {
    ENV_SSR_ROUGHNESS_QUALITY_DISABLED(0),
    ENV_SSR_ROUGHNESS_QUALITY_LOW(1),
    ENV_SSR_ROUGHNESS_QUALITY_MEDIUM(2),
    ENV_SSR_ROUGHNESS_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSSRRoughnessQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSSAOQuality(
    id: Long,
  ) {
    ENV_SSAO_QUALITY_VERY_LOW(0),
    ENV_SSAO_QUALITY_LOW(1),
    ENV_SSAO_QUALITY_MEDIUM(2),
    ENV_SSAO_QUALITY_HIGH(3),
    ENV_SSAO_QUALITY_ULTRA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSSAOQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSSILQuality(
    id: Long,
  ) {
    ENV_SSIL_QUALITY_VERY_LOW(0),
    ENV_SSIL_QUALITY_LOW(1),
    ENV_SSIL_QUALITY_MEDIUM(2),
    ENV_SSIL_QUALITY_HIGH(3),
    ENV_SSIL_QUALITY_ULTRA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSSILQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSDFGIYScale(
    id: Long,
  ) {
    ENV_SDFGI_Y_SCALE_50_PERCENT(0),
    ENV_SDFGI_Y_SCALE_75_PERCENT(1),
    ENV_SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSDFGIYScale = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSDFGIRayCount(
    id: Long,
  ) {
    ENV_SDFGI_RAY_COUNT_4(0),
    ENV_SDFGI_RAY_COUNT_8(1),
    ENV_SDFGI_RAY_COUNT_16(2),
    ENV_SDFGI_RAY_COUNT_32(3),
    ENV_SDFGI_RAY_COUNT_64(4),
    ENV_SDFGI_RAY_COUNT_96(5),
    ENV_SDFGI_RAY_COUNT_128(6),
    ENV_SDFGI_RAY_COUNT_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSDFGIRayCount = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSDFGIFramesToConverge(
    id: Long,
  ) {
    ENV_SDFGI_CONVERGE_IN_5_FRAMES(0),
    ENV_SDFGI_CONVERGE_IN_10_FRAMES(1),
    ENV_SDFGI_CONVERGE_IN_15_FRAMES(2),
    ENV_SDFGI_CONVERGE_IN_20_FRAMES(3),
    ENV_SDFGI_CONVERGE_IN_25_FRAMES(4),
    ENV_SDFGI_CONVERGE_IN_30_FRAMES(5),
    ENV_SDFGI_CONVERGE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSDFGIFramesToConverge = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class EnvironmentSDFGIFramesToUpdateLight(
    id: Long,
  ) {
    ENV_SDFGI_UPDATE_LIGHT_IN_1_FRAME(0),
    ENV_SDFGI_UPDATE_LIGHT_IN_2_FRAMES(1),
    ENV_SDFGI_UPDATE_LIGHT_IN_4_FRAMES(2),
    ENV_SDFGI_UPDATE_LIGHT_IN_8_FRAMES(3),
    ENV_SDFGI_UPDATE_LIGHT_IN_16_FRAMES(4),
    ENV_SDFGI_UPDATE_LIGHT_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentSDFGIFramesToUpdateLight = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SubSurfaceScatteringQuality(
    id: Long,
  ) {
    SUB_SURFACE_SCATTERING_QUALITY_DISABLED(0),
    SUB_SURFACE_SCATTERING_QUALITY_LOW(1),
    SUB_SURFACE_SCATTERING_QUALITY_MEDIUM(2),
    SUB_SURFACE_SCATTERING_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SubSurfaceScatteringQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DOFBokehShape(
    id: Long,
  ) {
    DOF_BOKEH_BOX(0),
    DOF_BOKEH_HEXAGON(1),
    DOF_BOKEH_CIRCLE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DOFBokehShape = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class DOFBlurQuality(
    id: Long,
  ) {
    DOF_BLUR_QUALITY_VERY_LOW(0),
    DOF_BLUR_QUALITY_LOW(1),
    DOF_BLUR_QUALITY_MEDIUM(2),
    DOF_BLUR_QUALITY_HIGH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DOFBlurQuality = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class InstanceType(
    id: Long,
  ) {
    INSTANCE_NONE(0),
    INSTANCE_MESH(1),
    INSTANCE_MULTIMESH(2),
    INSTANCE_PARTICLES(3),
    INSTANCE_PARTICLES_COLLISION(4),
    INSTANCE_LIGHT(5),
    INSTANCE_REFLECTION_PROBE(6),
    INSTANCE_DECAL(7),
    INSTANCE_VOXEL_GI(8),
    INSTANCE_LIGHTMAP(9),
    INSTANCE_OCCLUDER(10),
    INSTANCE_VISIBLITY_NOTIFIER(11),
    INSTANCE_FOG_VOLUME(12),
    INSTANCE_MAX(13),
    INSTANCE_GEOMETRY_MASK(14),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InstanceType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class InstanceFlags(
    id: Long,
  ) {
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),
    INSTANCE_FLAG_USE_DYNAMIC_GI(1),
    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(2),
    INSTANCE_FLAG_IGNORE_OCCLUSION_CULLING(3),
    INSTANCE_FLAG_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InstanceFlags = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class ShadowCastingSetting(
    id: Long,
  ) {
    SHADOW_CASTING_SETTING_OFF(0),
    SHADOW_CASTING_SETTING_ON(1),
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowCastingSetting = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class VisibilityRangeFadeMode(
    id: Long,
  ) {
    VISIBILITY_RANGE_FADE_DISABLED(0),
    VISIBILITY_RANGE_FADE_SELF(1),
    VISIBILITY_RANGE_FADE_DEPENDENCIES(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VisibilityRangeFadeMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class BakeChannels(
    id: Long,
  ) {
    BAKE_CHANNEL_ALBEDO_ALPHA(0),
    BAKE_CHANNEL_NORMAL(1),
    BAKE_CHANNEL_ORM(2),
    BAKE_CHANNEL_EMISSION(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeChannels = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasTextureChannel(
    id: Long,
  ) {
    CANVAS_TEXTURE_CHANNEL_DIFFUSE(0),
    CANVAS_TEXTURE_CHANNEL_NORMAL(1),
    CANVAS_TEXTURE_CHANNEL_SPECULAR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasTextureChannel = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class NinePatchAxisMode(
    id: Long,
  ) {
    NINE_PATCH_STRETCH(0),
    NINE_PATCH_TILE(1),
    NINE_PATCH_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): NinePatchAxisMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasItemTextureFilter(
    id: Long,
  ) {
    CANVAS_ITEM_TEXTURE_FILTER_DEFAULT(0),
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST(1),
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR(2),
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(4),
    CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    CANVAS_ITEM_TEXTURE_FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasItemTextureFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasItemTextureRepeat(
    id: Long,
  ) {
    CANVAS_ITEM_TEXTURE_REPEAT_DEFAULT(0),
    CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(1),
    CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(2),
    CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(3),
    CANVAS_ITEM_TEXTURE_REPEAT_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasItemTextureRepeat = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasGroupMode(
    id: Long,
  ) {
    CANVAS_GROUP_MODE_DISABLED(0),
    CANVAS_GROUP_MODE_CLIP_ONLY(1),
    CANVAS_GROUP_MODE_CLIP_AND_DRAW(2),
    CANVAS_GROUP_MODE_TRANSPARENT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasGroupMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasLightMode(
    id: Long,
  ) {
    CANVAS_LIGHT_MODE_POINT(0),
    CANVAS_LIGHT_MODE_DIRECTIONAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasLightMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasLightBlendMode(
    id: Long,
  ) {
    CANVAS_LIGHT_BLEND_MODE_ADD(0),
    CANVAS_LIGHT_BLEND_MODE_SUB(1),
    CANVAS_LIGHT_BLEND_MODE_MIX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasLightBlendMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasLightShadowFilter(
    id: Long,
  ) {
    CANVAS_LIGHT_FILTER_NONE(0),
    CANVAS_LIGHT_FILTER_PCF5(1),
    CANVAS_LIGHT_FILTER_PCF13(2),
    CANVAS_LIGHT_FILTER_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasLightShadowFilter = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class CanvasOccluderPolygonCullMode(
    id: Long,
  ) {
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),
    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),
    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CanvasOccluderPolygonCullMode = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class GlobalShaderParameterType(
    id: Long,
  ) {
    GLOBAL_VAR_TYPE_BOOL(0),
    GLOBAL_VAR_TYPE_BVEC2(1),
    GLOBAL_VAR_TYPE_BVEC3(2),
    GLOBAL_VAR_TYPE_BVEC4(3),
    GLOBAL_VAR_TYPE_INT(4),
    GLOBAL_VAR_TYPE_IVEC2(5),
    GLOBAL_VAR_TYPE_IVEC3(6),
    GLOBAL_VAR_TYPE_IVEC4(7),
    GLOBAL_VAR_TYPE_RECT2I(8),
    GLOBAL_VAR_TYPE_UINT(9),
    GLOBAL_VAR_TYPE_UVEC2(10),
    GLOBAL_VAR_TYPE_UVEC3(11),
    GLOBAL_VAR_TYPE_UVEC4(12),
    GLOBAL_VAR_TYPE_FLOAT(13),
    GLOBAL_VAR_TYPE_VEC2(14),
    GLOBAL_VAR_TYPE_VEC3(15),
    GLOBAL_VAR_TYPE_VEC4(16),
    GLOBAL_VAR_TYPE_COLOR(17),
    GLOBAL_VAR_TYPE_RECT2(18),
    GLOBAL_VAR_TYPE_MAT2(19),
    GLOBAL_VAR_TYPE_MAT3(20),
    GLOBAL_VAR_TYPE_MAT4(21),
    GLOBAL_VAR_TYPE_TRANSFORM_2D(22),
    GLOBAL_VAR_TYPE_TRANSFORM(23),
    GLOBAL_VAR_TYPE_SAMPLER2D(24),
    GLOBAL_VAR_TYPE_SAMPLER2DARRAY(25),
    GLOBAL_VAR_TYPE_SAMPLER3D(26),
    GLOBAL_VAR_TYPE_SAMPLERCUBE(27),
    GLOBAL_VAR_TYPE_MAX(28),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GlobalShaderParameterType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class RenderingInfo(
    id: Long,
  ) {
    RENDERING_INFO_TOTAL_OBJECTS_IN_FRAME(0),
    RENDERING_INFO_TOTAL_PRIMITIVES_IN_FRAME(1),
    RENDERING_INFO_TOTAL_DRAW_CALLS_IN_FRAME(2),
    RENDERING_INFO_TEXTURE_MEM_USED(3),
    RENDERING_INFO_BUFFER_MEM_USED(4),
    RENDERING_INFO_VIDEO_MEM_USED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderingInfo = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class Features(
    id: Long,
  ) {
    FEATURE_SHADERS(0),
    FEATURE_MULTITHREADED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Features = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val texture2dCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_create")

    public val texture2dLayeredCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layered_create")

    public val texture3dCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_create")

    public val textureProxyCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_proxy_create")

    public val texture2dUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_update")

    public val texture3dUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_update")

    public val textureProxyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_proxy_update")

    public val texture2dPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_placeholder_create")

    public val texture2dLayeredPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layered_placeholder_create")

    public val texture3dPlaceholderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_placeholder_create")

    public val texture2dGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_get")

    public val texture2dLayerGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_2d_layer_get")

    public val texture3dGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_3d_get")

    public val textureReplacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_replace")

    public val textureSetSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_size_override")

    public val textureSetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_path")

    public val textureGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_path")

    public val textureSetForceRedrawIfVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_set_force_redraw_if_visible")

    public val textureGetRdTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_rd_texture")

    public val textureGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "texture_get_native_handle")

    public val shaderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_create")

    public val shaderSetCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_code")

    public val shaderSetPathHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_path_hint")

    public val shaderGetCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_code")

    public val getShaderParameterListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_shader_parameter_list")

    public val shaderGetParameterDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_parameter_default")

    public val shaderSetDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_set_default_texture_parameter")

    public val shaderGetDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "shader_get_default_texture_parameter")

    public val materialCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_create")

    public val materialSetShaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_shader")

    public val materialSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_param")

    public val materialGetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_get_param")

    public val materialSetRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_render_priority")

    public val materialSetNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "material_set_next_pass")

    public val meshCreateFromSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_create_from_surfaces")

    public val meshCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_create")

    public val meshSurfaceGetFormatOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_offset")

    public val meshSurfaceGetFormatVertexStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_vertex_stride")

    public val meshSurfaceGetFormatAttributeStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_attribute_stride")

    public val meshSurfaceGetFormatSkinStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_format_skin_stride")

    public val meshAddSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_add_surface")

    public val meshAddSurfaceFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_add_surface_from_arrays")

    public val meshGetBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_blend_shape_count")

    public val meshSetBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_blend_shape_mode")

    public val meshGetBlendShapeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_blend_shape_mode")

    public val meshSurfaceSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_set_material")

    public val meshSurfaceGetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_material")

    public val meshGetSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_surface")

    public val meshSurfaceGetArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_arrays")

    public val meshSurfaceGetBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_get_blend_shape_arrays")

    public val meshGetSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_surface_count")

    public val meshSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_custom_aabb")

    public val meshGetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_get_custom_aabb")

    public val meshClearPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "mesh_clear")

    public val meshSurfaceUpdateVertexRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_vertex_region")

    public val meshSurfaceUpdateAttributeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_attribute_region")

    public val meshSurfaceUpdateSkinRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_surface_update_skin_region")

    public val meshSetShadowMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "mesh_set_shadow_mesh")

    public val multimeshCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_create")

    public val multimeshAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_allocate_data")

    public val multimeshGetInstanceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_instance_count")

    public val multimeshSetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_mesh")

    public val multimeshInstanceSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_transform")

    public val multimeshInstanceSetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_transform_2d")

    public val multimeshInstanceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_color")

    public val multimeshInstanceSetCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_set_custom_data")

    public val multimeshGetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_mesh")

    public val multimeshGetAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_aabb")

    public val multimeshInstanceGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_transform")

    public val multimeshInstanceGetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_transform_2d")

    public val multimeshInstanceGetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_color")

    public val multimeshInstanceGetCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_instance_get_custom_data")

    public val multimeshSetVisibleInstancesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_visible_instances")

    public val multimeshGetVisibleInstancesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_visible_instances")

    public val multimeshSetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_set_buffer")

    public val multimeshGetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "multimesh_get_buffer")

    public val skeletonCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_create")

    public val skeletonAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_allocate_data")

    public val skeletonGetBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_get_bone_count")

    public val skeletonBoneSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_set_transform")

    public val skeletonBoneGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_get_transform")

    public val skeletonBoneSetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_set_transform_2d")

    public val skeletonBoneGetTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_bone_get_transform_2d")

    public val skeletonSetBaseTransform2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "skeleton_set_base_transform_2d")

    public val directionalLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_light_create")

    public val omniLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "omni_light_create")

    public val spotLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "spot_light_create")

    public val lightSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_color")

    public val lightSetParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_param")

    public val lightSetShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_shadow")

    public val lightSetProjectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_projector")

    public val lightSetNegativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_negative")

    public val lightSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_cull_mask")

    public val lightSetDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_distance_fade")

    public val lightSetReverseCullFaceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_reverse_cull_face_mode")

    public val lightSetBakeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_bake_mode")

    public val lightSetMaxSdfgiCascadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_set_max_sdfgi_cascade")

    public val lightOmniSetShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_omni_set_shadow_mode")

    public val lightDirectionalSetShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_shadow_mode")

    public val lightDirectionalSetBlendSplitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_blend_splits")

    public val lightDirectionalSetSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_directional_set_sky_mode")

    public val lightProjectorsSetFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "light_projectors_set_filter")

    public val positionalSoftShadowFilterSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "positional_soft_shadow_filter_set_quality")

    public val directionalSoftShadowFilterSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_soft_shadow_filter_set_quality")

    public val directionalShadowAtlasSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "directional_shadow_atlas_set_size")

    public val reflectionProbeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_create")

    public val reflectionProbeSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_update_mode")

    public val reflectionProbeSetIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_intensity")

    public val reflectionProbeSetAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_mode")

    public val reflectionProbeSetAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_color")

    public val reflectionProbeSetAmbientEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_ambient_energy")

    public val reflectionProbeSetMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_max_distance")

    public val reflectionProbeSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_size")

    public val reflectionProbeSetOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_origin_offset")

    public val reflectionProbeSetAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_as_interior")

    public val reflectionProbeSetEnableBoxProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_enable_box_projection")

    public val reflectionProbeSetEnableShadowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_enable_shadows")

    public val reflectionProbeSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_cull_mask")

    public val reflectionProbeSetResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_resolution")

    public val reflectionProbeSetMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "reflection_probe_set_mesh_lod_threshold")

    public val decalCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_create")

    public val decalSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_size")

    public val decalSetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_texture")

    public val decalSetEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_emission_energy")

    public val decalSetAlbedoMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_albedo_mix")

    public val decalSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_modulate")

    public val decalSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_cull_mask")

    public val decalSetDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_distance_fade")

    public val decalSetFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_fade")

    public val decalSetNormalFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decal_set_normal_fade")

    public val decalsSetFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "decals_set_filter")

    public val giSetUseHalfResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "gi_set_use_half_resolution")

    public val voxelGiCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_create")

    public val voxelGiAllocateDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_allocate_data")

    public val voxelGiGetOctreeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_octree_size")

    public val voxelGiGetOctreeCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_octree_cells")

    public val voxelGiGetDataCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_data_cells")

    public val voxelGiGetDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_distance_field")

    public val voxelGiGetLevelCountsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_level_counts")

    public val voxelGiGetToCellXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_get_to_cell_xform")

    public val voxelGiSetDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_dynamic_range")

    public val voxelGiSetPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_propagation")

    public val voxelGiSetEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_energy")

    public val voxelGiSetBakedExposureNormalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_baked_exposure_normalization")

    public val voxelGiSetBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_bias")

    public val voxelGiSetNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_normal_bias")

    public val voxelGiSetInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_interior")

    public val voxelGiSetUseTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_use_two_bounces")

    public val voxelGiSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "voxel_gi_set_quality")

    public val lightmapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_create")

    public val lightmapSetTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_textures")

    public val lightmapSetProbeBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_bounds")

    public val lightmapSetProbeInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_interior")

    public val lightmapSetProbeCaptureDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_capture_data")

    public val lightmapGetProbeCapturePointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_points")

    public val lightmapGetProbeCaptureShPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_sh")

    public val lightmapGetProbeCaptureTetrahedraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_tetrahedra")

    public val lightmapGetProbeCaptureBspTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_get_probe_capture_bsp_tree")

    public val lightmapSetBakedExposureNormalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_baked_exposure_normalization")

    public val lightmapSetProbeCaptureUpdateSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "lightmap_set_probe_capture_update_speed")

    public val particlesCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_create")

    public val particlesSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_mode")

    public val particlesSetEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_emitting")

    public val particlesGetEmittingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_get_emitting")

    public val particlesSetAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_amount")

    public val particlesSetLifetimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_lifetime")

    public val particlesSetOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_one_shot")

    public val particlesSetPreProcessTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_pre_process_time")

    public val particlesSetExplosivenessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_explosiveness_ratio")

    public val particlesSetRandomnessRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_randomness_ratio")

    public val particlesSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_custom_aabb")

    public val particlesSetSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_speed_scale")

    public val particlesSetUseLocalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_use_local_coordinates")

    public val particlesSetProcessMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_process_material")

    public val particlesSetFixedFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_fixed_fps")

    public val particlesSetInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_interpolate")

    public val particlesSetFractionalDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_fractional_delta")

    public val particlesSetCollisionBaseSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_collision_base_size")

    public val particlesSetTransformAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_transform_align")

    public val particlesSetTrailsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_trails")

    public val particlesSetTrailBindPosesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_trail_bind_poses")

    public val particlesIsInactivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_is_inactive")

    public val particlesRequestProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_request_process")

    public val particlesRestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_restart")

    public val particlesSetSubemitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_subemitter")

    public val particlesEmitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_emit")

    public val particlesSetDrawOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_order")

    public val particlesSetDrawPassesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_passes")

    public val particlesSetDrawPassMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_draw_pass_mesh")

    public val particlesGetCurrentAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_get_current_aabb")

    public val particlesSetEmissionTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_set_emission_transform")

    public val particlesCollisionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_create")

    public val particlesCollisionSetCollisionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_collision_type")

    public val particlesCollisionSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_cull_mask")

    public val particlesCollisionSetSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_sphere_radius")

    public val particlesCollisionSetBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_box_extents")

    public val particlesCollisionSetAttractorStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_strength")

    public val particlesCollisionSetAttractorDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_directionality")

    public val particlesCollisionSetAttractorAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_attractor_attenuation")

    public val particlesCollisionSetFieldTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_field_texture")

    public val particlesCollisionHeightFieldUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_height_field_update")

    public val particlesCollisionSetHeightFieldResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "particles_collision_set_height_field_resolution")

    public val fogVolumeCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_create")

    public val fogVolumeSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_shape")

    public val fogVolumeSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_size")

    public val fogVolumeSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "fog_volume_set_material")

    public val visibilityNotifierCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_create")

    public val visibilityNotifierSetAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_set_aabb")

    public val visibilityNotifierSetCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "visibility_notifier_set_callbacks")

    public val occluderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "occluder_create")

    public val occluderSetMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "occluder_set_mesh")

    public val cameraCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_create")

    public val cameraSetPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_perspective")

    public val cameraSetOrthogonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_orthogonal")

    public val cameraSetFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_frustum")

    public val cameraSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_transform")

    public val cameraSetCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_cull_mask")

    public val cameraSetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_environment")

    public val cameraSetCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_camera_attributes")

    public val cameraSetUseVerticalAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_set_use_vertical_aspect")

    public val viewportCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_create")

    public val viewportSetUseXrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_xr")

    public val viewportSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_size")

    public val viewportSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_active")

    public val viewportSetParentViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_parent_viewport")

    public val viewportAttachToScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_to_screen")

    public val viewportSetRenderDirectToScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_render_direct_to_screen")

    public val viewportSetCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_cull_mask")

    public val viewportSetScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scaling_3d_mode")

    public val viewportSetScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scaling_3d_scale")

    public val viewportSetFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_fsr_sharpness")

    public val viewportSetTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_texture_mipmap_bias")

    public val viewportSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_update_mode")

    public val viewportSetClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_clear_mode")

    public val viewportGetRenderTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_render_target")

    public val viewportGetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_texture")

    public val viewportSetDisable3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_disable_3d")

    public val viewportSetDisable2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_disable_2d")

    public val viewportSetEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_environment_mode")

    public val viewportAttachCameraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_camera")

    public val viewportSetScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_scenario")

    public val viewportAttachCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_attach_canvas")

    public val viewportRemoveCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_remove_canvas")

    public val viewportSetSnap2dTransformsToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_snap_2d_transforms_to_pixel")

    public val viewportSetSnap2dVerticesToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_snap_2d_vertices_to_pixel")

    public val viewportSetDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_default_canvas_item_texture_filter")

    public val viewportSetDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_default_canvas_item_texture_repeat")

    public val viewportSetCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_transform")

    public val viewportSetCanvasStackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_canvas_stacking")

    public val viewportSetTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_transparent_background")

    public val viewportSetGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_global_canvas_transform")

    public val viewportSetSdfOversizeAndScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_sdf_oversize_and_scale")

    public val viewportSetPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_positional_shadow_atlas_size")

    public val viewportSetPositionalShadowAtlasQuadrantSubdivisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_positional_shadow_atlas_quadrant_subdivision")

    public val viewportSetMsaa3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_msaa_3d")

    public val viewportSetMsaa2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_msaa_2d")

    public val viewportSetScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_screen_space_aa")

    public val viewportSetUseTaaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_taa")

    public val viewportSetUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_debanding")

    public val viewportSetUseOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_use_occlusion_culling")

    public val viewportSetOcclusionRaysPerThreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_occlusion_rays_per_thread")

    public val viewportSetOcclusionCullingBuildQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_occlusion_culling_build_quality")

    public val viewportGetRenderInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_render_info")

    public val viewportSetDebugDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_debug_draw")

    public val viewportSetMeasureRenderTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_measure_render_time")

    public val viewportGetMeasuredRenderTimeCpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_measured_render_time_cpu")

    public val viewportGetMeasuredRenderTimeGpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_get_measured_render_time_gpu")

    public val viewportSetVrsModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_vrs_mode")

    public val viewportSetVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "viewport_set_vrs_texture")

    public val skyCreatePtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "sky_create")

    public val skySetRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_radiance_size")

    public val skySetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_mode")

    public val skySetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_set_material")

    public val skyBakePanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sky_bake_panorama")

    public val environmentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_create")

    public val environmentSetBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_background")

    public val environmentSetSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky")

    public val environmentSetSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky_custom_fov")

    public val environmentSetSkyOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sky_orientation")

    public val environmentSetBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_bg_color")

    public val environmentSetBgEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_bg_energy")

    public val environmentSetCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_canvas_max_layer")

    public val environmentSetAmbientLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ambient_light")

    public val environmentSetGlowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_glow")

    public val environmentSetTonemapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_tonemap")

    public val environmentSetAdjustmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_adjustment")

    public val environmentSetSsrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssr")

    public val environmentSetSsaoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssao")

    public val environmentSetFogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_fog")

    public val environmentSetSdfgiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi")

    public val environmentSetVolumetricFogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog")

    public val environmentGlowSetUseBicubicUpscalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_glow_set_use_bicubic_upscale")

    public val environmentSetSsrRoughnessQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssr_roughness_quality")

    public val environmentSetSsaoQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssao_quality")

    public val environmentSetSsilQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_ssil_quality")

    public val environmentSetSdfgiRayCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_ray_count")

    public val environmentSetSdfgiFramesToConvergePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_frames_to_converge")

    public val environmentSetSdfgiFramesToUpdateLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_sdfgi_frames_to_update_light")

    public val environmentSetVolumetricFogVolumeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog_volume_size")

    public val environmentSetVolumetricFogFilterActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_set_volumetric_fog_filter_active")

    public val environmentBakePanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "environment_bake_panorama")

    public val screenSpaceRoughnessLimiterSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "screen_space_roughness_limiter_set_active")

    public val subSurfaceScatteringSetQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sub_surface_scattering_set_quality")

    public val subSurfaceScatteringSetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "sub_surface_scattering_set_scale")

    public val cameraAttributesCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_create")

    public val cameraAttributesSetDofBlurQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur_quality")

    public val cameraAttributesSetDofBlurBokehShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur_bokeh_shape")

    public val cameraAttributesSetDofBlurPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_dof_blur")

    public val cameraAttributesSetExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_exposure")

    public val cameraAttributesSetAutoExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "camera_attributes_set_auto_exposure")

    public val scenarioCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_create")

    public val scenarioSetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_environment")

    public val scenarioSetFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_fallback_environment")

    public val scenarioSetCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "scenario_set_camera_attributes")

    public val instanceCreate2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_create2")

    public val instanceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_create")

    public val instanceSetBasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_base")

    public val instanceSetScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_scenario")

    public val instanceSetLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_layer_mask")

    public val instanceSetPivotDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_pivot_data")

    public val instanceSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_transform")

    public val instanceAttachObjectInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_attach_object_instance_id")

    public val instanceSetBlendShapeWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_blend_shape_weight")

    public val instanceSetSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_surface_override_material")

    public val instanceSetVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_visible")

    public val instanceGeometrySetTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_transparency")

    public val instanceSetCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_custom_aabb")

    public val instanceAttachSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_attach_skeleton")

    public val instanceSetExtraVisibilityMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_extra_visibility_margin")

    public val instanceSetVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_visibility_parent")

    public val instanceSetIgnoreCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_set_ignore_culling")

    public val instanceGeometrySetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_flag")

    public val instanceGeometrySetCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_cast_shadows_setting")

    public val instanceGeometrySetMaterialOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_material_override")

    public val instanceGeometrySetMaterialOverlayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_material_overlay")

    public val instanceGeometrySetVisibilityRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_visibility_range")

    public val instanceGeometrySetLightmapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_lightmap")

    public val instanceGeometrySetLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_lod_bias")

    public val instanceGeometrySetShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_set_shader_parameter")

    public val instanceGeometryGetShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter")

    public val instanceGeometryGetShaderParameterDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter_default_value")

    public val instanceGeometryGetShaderParameterListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instance_geometry_get_shader_parameter_list")

    public val instancesCullAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_aabb")

    public val instancesCullRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_ray")

    public val instancesCullConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "instances_cull_convex")

    public val bakeRenderUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "bake_render_uv2")

    public val canvasCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_create")

    public val canvasSetItemMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_item_mirroring")

    public val canvasSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_modulate")

    public val canvasSetDisableScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_disable_scale")

    public val canvasTextureCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_create")

    public val canvasTextureSetChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_channel")

    public val canvasTextureSetShadingParametersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_shading_parameters")

    public val canvasTextureSetTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_texture_filter")

    public val canvasTextureSetTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_texture_set_texture_repeat")

    public val canvasItemCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_create")

    public val canvasItemSetParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_parent")

    public val canvasItemSetDefaultTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_default_texture_filter")

    public val canvasItemSetDefaultTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_default_texture_repeat")

    public val canvasItemSetVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visible")

    public val canvasItemSetLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_light_mask")

    public val canvasItemSetVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visibility_layer")

    public val canvasItemSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_transform")

    public val canvasItemSetClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_clip")

    public val canvasItemSetDistanceFieldModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_distance_field_mode")

    public val canvasItemSetCustomRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_custom_rect")

    public val canvasItemSetModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_modulate")

    public val canvasItemSetSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_self_modulate")

    public val canvasItemSetDrawBehindParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_draw_behind_parent")

    public val canvasItemAddLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_line")

    public val canvasItemAddPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_polyline")

    public val canvasItemAddMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_multiline")

    public val canvasItemAddRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_rect")

    public val canvasItemAddCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_circle")

    public val canvasItemAddTextureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_texture_rect")

    public val canvasItemAddMsdfTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_msdf_texture_rect_region")

    public val canvasItemAddLcdTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_lcd_texture_rect_region")

    public val canvasItemAddTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_texture_rect_region")

    public val canvasItemAddNinePatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_nine_patch")

    public val canvasItemAddPrimitivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_primitive")

    public val canvasItemAddPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_polygon")

    public val canvasItemAddTriangleArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_triangle_array")

    public val canvasItemAddMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_mesh")

    public val canvasItemAddMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_multimesh")

    public val canvasItemAddParticlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_particles")

    public val canvasItemAddSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_set_transform")

    public val canvasItemAddClipIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_clip_ignore")

    public val canvasItemAddAnimationSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_add_animation_slice")

    public val canvasItemSetSortChildrenByYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_sort_children_by_y")

    public val canvasItemSetZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_z_index")

    public val canvasItemSetZAsRelativeToParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_z_as_relative_to_parent")

    public val canvasItemSetCopyToBackbufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_copy_to_backbuffer")

    public val canvasItemClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_clear")

    public val canvasItemSetDrawIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_draw_index")

    public val canvasItemSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_material")

    public val canvasItemSetUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_use_parent_material")

    public val canvasItemSetVisibilityNotifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_visibility_notifier")

    public val canvasItemSetCanvasGroupModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_item_set_canvas_group_mode")

    public val canvasLightCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_create")

    public val canvasLightAttachToCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_attach_to_canvas")

    public val canvasLightSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_enabled")

    public val canvasLightSetTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture_scale")

    public val canvasLightSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_transform")

    public val canvasLightSetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture")

    public val canvasLightSetTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_texture_offset")

    public val canvasLightSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_color")

    public val canvasLightSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_height")

    public val canvasLightSetEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_energy")

    public val canvasLightSetZRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_z_range")

    public val canvasLightSetLayerRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_layer_range")

    public val canvasLightSetItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_item_cull_mask")

    public val canvasLightSetItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_item_shadow_cull_mask")

    public val canvasLightSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_mode")

    public val canvasLightSetShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_enabled")

    public val canvasLightSetShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_filter")

    public val canvasLightSetShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_color")

    public val canvasLightSetShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_shadow_smooth")

    public val canvasLightSetBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_set_blend_mode")

    public val canvasLightOccluderCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_create")

    public val canvasLightOccluderAttachToCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_attach_to_canvas")

    public val canvasLightOccluderSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_enabled")

    public val canvasLightOccluderSetPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_polygon")

    public val canvasLightOccluderSetAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_as_sdf_collision")

    public val canvasLightOccluderSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_transform")

    public val canvasLightOccluderSetLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_light_occluder_set_light_mask")

    public val canvasOccluderPolygonCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_create")

    public val canvasOccluderPolygonSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_set_shape")

    public val canvasOccluderPolygonSetCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_occluder_polygon_set_cull_mode")

    public val canvasSetShadowTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "canvas_set_shadow_texture_size")

    public val globalShaderParameterAddPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_add")

    public val globalShaderParameterRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_remove")

    public val globalShaderParameterGetListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get_list")

    public val globalShaderParameterSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_set")

    public val globalShaderParameterSetOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_set_override")

    public val globalShaderParameterGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get")

    public val globalShaderParameterGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "global_shader_parameter_get_type")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "free_rid")

    public val requestFrameDrawnCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "request_frame_drawn_callback")

    public val hasChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_changed")

    public val getRenderingInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_rendering_info")

    public val getVideoAdapterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_name")

    public val getVideoAdapterVendorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_vendor")

    public val getVideoAdapterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_type")

    public val getVideoAdapterApiVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_video_adapter_api_version")

    public val makeSphereMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "make_sphere_mesh")

    public val getTestCubePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_test_cube")

    public val getTestTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_test_texture")

    public val getWhiteTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_white_texture")

    public val setBootImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_boot_image")

    public val getDefaultClearColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_default_clear_color")

    public val setDefaultClearColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_default_clear_color")

    public val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_feature")

    public val hasOsFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "has_os_feature")

    public val setDebugGenerateWireframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_debug_generate_wireframes")

    public val isRenderLoopEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "is_render_loop_enabled")

    public val setRenderLoopEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "set_render_loop_enabled")

    public val getFrameSetupTimeCpuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_frame_setup_time_cpu")

    public val forceSyncPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "force_sync")

    public val forceDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("RenderingServer", "force_draw")

    public val getRenderingDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "get_rendering_device")

    public val createLocalRenderingDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderingServer", "create_local_rendering_device")
  }
}

public infix fun Long.or(other: ArrayFormat): Long = this.or(other.flag)

public infix fun Long.xor(other: ArrayFormat): Long = this.xor(other.flag)

public infix fun Long.and(other: ArrayFormat): Long = this.and(other.flag)

public operator fun Long.plus(other: ArrayFormat): Long = this.plus(other.flag)

public operator fun Long.minus(other: ArrayFormat): Long = this.minus(other.flag)

public operator fun Long.times(other: ArrayFormat): Long = this.times(other.flag)

public operator fun Long.div(other: ArrayFormat): Long = this.div(other.flag)

public operator fun Long.rem(other: ArrayFormat): Long = this.rem(other.flag)
