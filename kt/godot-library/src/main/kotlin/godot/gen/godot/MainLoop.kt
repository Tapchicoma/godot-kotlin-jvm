// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class MainLoop : Object() {
  public val onRequestPermissionsResult: Signal2<String, Boolean> by signal("permission", "granted")

  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MAINLOOP, scriptIndex)
    return true
  }

  public open fun _initialize() {
  }

  public open fun _physicsProcess(delta: Double): Boolean {
    throw NotImplementedError("_physics_process is not implemented for MainLoop")
  }

  public open fun _process(delta: Double): Boolean {
    throw NotImplementedError("_process is not implemented for MainLoop")
  }

  public open fun _finalize() {
  }

  public companion object {
    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    public final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 2010

    public final const val NOTIFICATION_WM_ABOUT: Long = 2011

    public final const val NOTIFICATION_CRASH: Long = 2012

    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018
  }

  internal object MethodBindings {
    public val _initializePtr: VoidPtr = TypeManager.getMethodBindPtr("MainLoop", "_initialize")

    public val _physicsProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MainLoop", "_physics_process")

    public val _processPtr: VoidPtr = TypeManager.getMethodBindPtr("MainLoop", "_process")

    public val _finalizePtr: VoidPtr = TypeManager.getMethodBindPtr("MainLoop", "_finalize")
  }
}
