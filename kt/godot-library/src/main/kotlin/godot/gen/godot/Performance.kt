// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public object Performance : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PERFORMANCE)
    return false
  }

  public fun getMonitor(monitor: Monitor): Double {
    TransferContext.writeArguments(LONG to monitor.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMonitorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  @JvmOverloads
  public fun addCustomMonitor(
    id: StringName,
    callable: Callable,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ) {
    TransferContext.writeArguments(STRING_NAME to id, CALLABLE to callable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomMonitorPtr, NIL)
  }

  public fun removeCustomMonitor(id: StringName) {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCustomMonitorPtr, NIL)
  }

  public fun hasCustomMonitor(id: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCustomMonitorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getCustomMonitor(id: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomMonitorPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun getMonitorModificationTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMonitorModificationTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getCustomMonitorNames(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomMonitorNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public enum class Monitor(
    id: Long,
  ) {
    TIME_FPS(0),
    TIME_PROCESS(1),
    TIME_PHYSICS_PROCESS(2),
    TIME_NAVIGATION_PROCESS(3),
    MEMORY_STATIC(4),
    MEMORY_STATIC_MAX(5),
    MEMORY_MESSAGE_BUFFER_MAX(6),
    OBJECT_COUNT(7),
    OBJECT_RESOURCE_COUNT(8),
    OBJECT_NODE_COUNT(9),
    OBJECT_ORPHAN_NODE_COUNT(10),
    RENDER_TOTAL_OBJECTS_IN_FRAME(11),
    RENDER_TOTAL_PRIMITIVES_IN_FRAME(12),
    RENDER_TOTAL_DRAW_CALLS_IN_FRAME(13),
    RENDER_VIDEO_MEM_USED(14),
    RENDER_TEXTURE_MEM_USED(15),
    RENDER_BUFFER_MEM_USED(16),
    PHYSICS_2D_ACTIVE_OBJECTS(17),
    PHYSICS_2D_COLLISION_PAIRS(18),
    PHYSICS_2D_ISLAND_COUNT(19),
    PHYSICS_3D_ACTIVE_OBJECTS(20),
    PHYSICS_3D_COLLISION_PAIRS(21),
    PHYSICS_3D_ISLAND_COUNT(22),
    AUDIO_OUTPUT_LATENCY(23),
    NAVIGATION_ACTIVE_MAPS(24),
    NAVIGATION_REGION_COUNT(25),
    NAVIGATION_AGENT_COUNT(26),
    NAVIGATION_LINK_COUNT(27),
    NAVIGATION_POLYGON_COUNT(28),
    NAVIGATION_EDGE_COUNT(29),
    NAVIGATION_EDGE_MERGE_COUNT(30),
    NAVIGATION_EDGE_CONNECTION_COUNT(31),
    NAVIGATION_EDGE_FREE_COUNT(32),
    MONITOR_MAX(33),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Monitor = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getMonitorPtr: VoidPtr = TypeManager.getMethodBindPtr("Performance", "get_monitor")

    public val addCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "add_custom_monitor")

    public val removeCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "remove_custom_monitor")

    public val hasCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "has_custom_monitor")

    public val getCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_custom_monitor")

    public val getMonitorModificationTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_monitor_modification_time")

    public val getCustomMonitorNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_custom_monitor_names")
  }
}
