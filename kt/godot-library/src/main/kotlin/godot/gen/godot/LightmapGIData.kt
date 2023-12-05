// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class LightmapGIData : Resource() {
  public var lightTexture: TextureLayered?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TextureLayered?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightTexturePtr, NIL)
    }

  public var usesSphericalHarmonics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingSphericalHarmonicsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUsesSphericalHarmonicsPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPGIDATA, scriptIndex)
    return true
  }

  public fun addUser(
    path: NodePath,
    uvScale: Rect2,
    sliceIndex: Int,
    subInstance: Int,
  ) {
    TransferContext.writeArguments(NODE_PATH to path, RECT2 to uvScale, LONG to sliceIndex.toLong(), LONG to subInstance.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addUserPtr, NIL)
  }

  public fun getUserCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUserCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getUserPath(userIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to userIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUserPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun clearUsers() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearUsersPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setLightTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "set_light_texture")

    public val getLightTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "get_light_texture")

    public val setUsesSphericalHarmonicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "set_uses_spherical_harmonics")

    public val isUsingSphericalHarmonicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "is_using_spherical_harmonics")

    public val addUserPtr: VoidPtr = TypeManager.getMethodBindPtr("LightmapGIData", "add_user")

    public val getUserCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "get_user_count")

    public val getUserPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "get_user_path")

    public val clearUsersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGIData", "clear_users")
  }
}
