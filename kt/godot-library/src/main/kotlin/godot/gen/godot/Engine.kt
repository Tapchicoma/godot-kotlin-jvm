// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public object Engine : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_ENGINE)
    return false
  }

  public fun setPhysicsTicksPerSecond(physicsTicksPerSecond: Int) {
    TransferContext.writeArguments(LONG to physicsTicksPerSecond.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsTicksPerSecondPtr, NIL)
  }

  public fun getPhysicsTicksPerSecond(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsTicksPerSecondPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setMaxPhysicsStepsPerFrame(maxPhysicsSteps: Int) {
    TransferContext.writeArguments(LONG to maxPhysicsSteps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxPhysicsStepsPerFramePtr, NIL)
  }

  public fun getMaxPhysicsStepsPerFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPhysicsStepsPerFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setPhysicsJitterFix(physicsJitterFix: Double) {
    TransferContext.writeArguments(DOUBLE to physicsJitterFix)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsJitterFixPtr, NIL)
  }

  public fun getPhysicsJitterFix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsJitterFixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsInterpolationFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setMaxFps(maxFps: Int) {
    TransferContext.writeArguments(LONG to maxFps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxFpsPtr, NIL)
  }

  public fun getMaxFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTimeScale(timeScale: Double) {
    TransferContext.writeArguments(DOUBLE to timeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setTimeScalePtr, NIL)
  }

  public fun getTimeScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getFramesDrawn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesDrawnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesPerSecondPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getProcessFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainLoopPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MainLoop?)
  }

  public fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAuthorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getCopyrightInfo(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCopyrightInfoPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  public fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDonorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getArchitectureName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getArchitectureNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInPhysicsFramePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun hasSingleton(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSingletonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getSingleton(name: StringName): Object? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  public fun registerSingleton(name: StringName, instance: Object) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to instance)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSingletonPtr, NIL)
  }

  public fun unregisterSingleton(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterSingletonPtr, NIL)
  }

  public fun getSingletonList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun registerScriptLanguage(language: ScriptLanguage): GodotError {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.registerScriptLanguagePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun unregisterScriptLanguage(language: ScriptLanguage): GodotError {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterScriptLanguagePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getScriptLanguageCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguageCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getScriptLanguage(index: Int): ScriptLanguage? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptLanguage?)
  }

  public fun isEditorHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEditorHintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getWriteMoviePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWriteMoviePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setPrintErrorMessages(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrintErrorMessagesPtr, NIL)
  }

  public fun isPrintingErrorMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPrintingErrorMessagesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  internal object MethodBindings {
    public val setPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_ticks_per_second")

    public val getPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_ticks_per_second")

    public val setMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_max_physics_steps_per_frame")

    public val getMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_max_physics_steps_per_frame")

    public val setPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_jitter_fix")

    public val getPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_jitter_fix")

    public val getPhysicsInterpolationFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_interpolation_fraction")

    public val setMaxFpsPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "set_max_fps")

    public val getMaxFpsPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_max_fps")

    public val setTimeScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "set_time_scale")

    public val getTimeScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_time_scale")

    public val getFramesDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_drawn")

    public val getFramesPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_per_second")

    public val getPhysicsFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_frames")

    public val getProcessFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_process_frames")

    public val getMainLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_main_loop")

    public val getVersionInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_version_info")

    public val getAuthorInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_author_info")

    public val getCopyrightInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_copyright_info")

    public val getDonorInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_donor_info")

    public val getLicenseInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_info")

    public val getLicenseTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_text")

    public val getArchitectureNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_architecture_name")

    public val isInPhysicsFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_in_physics_frame")

    public val hasSingletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "has_singleton")

    public val getSingletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_singleton")

    public val registerSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_singleton")

    public val unregisterSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_singleton")

    public val getSingletonListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_singleton_list")

    public val registerScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_script_language")

    public val unregisterScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_script_language")

    public val getScriptLanguageCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language_count")

    public val getScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language")

    public val isEditorHintPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "is_editor_hint")

    public val getWriteMoviePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_write_movie_path")

    public val setPrintErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_print_error_messages")

    public val isPrintingErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_printing_error_messages")
  }
}
