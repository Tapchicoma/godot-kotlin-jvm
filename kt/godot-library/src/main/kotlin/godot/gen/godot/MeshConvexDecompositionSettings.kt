// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class MeshConvexDecompositionSettings : RefCounted() {
  public var maxConcavity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxConcavityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxConcavityPtr, NIL)
    }

  public var symmetryPlanesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSymmetryPlanesClippingBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSymmetryPlanesClippingBiasPtr, NIL)
    }

  public var revolutionAxesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRevolutionAxesClippingBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRevolutionAxesClippingBiasPtr, NIL)
    }

  public var minVolumePerConvexHull: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinVolumePerConvexHullPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinVolumePerConvexHullPtr, NIL)
    }

  public var resolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getResolutionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResolutionPtr, NIL)
    }

  public var maxNumVerticesPerConvexHull: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxNumVerticesPerConvexHullPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxNumVerticesPerConvexHullPtr, NIL)
    }

  public var planeDownsampling: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlaneDownsamplingPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlaneDownsamplingPtr, NIL)
    }

  public var convexHullDownsampling: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConvexHullDownsamplingPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConvexHullDownsamplingPtr, NIL)
    }

  public var normalizeMesh: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalizeMeshPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalizeMeshPtr, NIL)
    }

  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return MeshConvexDecompositionSettings.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  public var convexHullApproximation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConvexHullApproximationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConvexHullApproximationPtr, NIL)
    }

  public var maxConvexHulls: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxConvexHullsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxConvexHullsPtr, NIL)
    }

  public var projectHullVertices: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectHullVerticesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectHullVerticesPtr, NIL)
    }

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS, scriptIndex)
    return true
  }

  public enum class Mode(
    id: Long,
  ) {
    CONVEX_DECOMPOSITION_MODE_VOXEL(0),
    CONVEX_DECOMPOSITION_MODE_TETRAHEDRON(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMaxConcavityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_concavity")

    public val getMaxConcavityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_concavity")

    public val setSymmetryPlanesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias")

    public val getSymmetryPlanesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias")

    public val setRevolutionAxesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias")

    public val getRevolutionAxesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias")

    public val setMinVolumePerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull")

    public val getMinVolumePerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull")

    public val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_resolution")

    public val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_resolution")

    public val setMaxNumVerticesPerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull")

    public val getMaxNumVerticesPerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull")

    public val setPlaneDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_plane_downsampling")

    public val getPlaneDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_plane_downsampling")

    public val setConvexHullDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_downsampling")

    public val getConvexHullDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_downsampling")

    public val setNormalizeMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_normalize_mesh")

    public val getNormalizeMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_normalize_mesh")

    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_mode")

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_mode")

    public val setConvexHullApproximationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_approximation")

    public val getConvexHullApproximationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_approximation")

    public val setMaxConvexHullsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_convex_hulls")

    public val getMaxConvexHullsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_convex_hulls")

    public val setProjectHullVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_project_hull_vertices")

    public val getProjectHullVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_project_hull_vertices")
  }
}
