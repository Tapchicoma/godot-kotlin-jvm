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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
public object OS : Object() {
  override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_OS)
    return false
  }

  public fun getConnectedMidiInputs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedMidiInputsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun openMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.openMidiInputsPtr, NIL)
  }

  public fun closeMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closeMidiInputsPtr, NIL)
  }

  @JvmOverloads
  public fun alert(text: String, title: String = "Alert!") {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.alertPtr, NIL)
  }

  public fun crash(message: String) {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, MethodBindings.crashPtr, NIL)
  }

  public fun setLowProcessorUsageMode(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModePtr, NIL)
  }

  public fun isInLowProcessorUsageMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInLowProcessorUsageModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLowProcessorUsageModeSleepUsec(usec: Int) {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModeSleepUsecPtr, NIL)
  }

  public fun getLowProcessorUsageModeSleepUsec(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLowProcessorUsageModeSleepUsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setDeltaSmoothing(deltaSmoothingEnabled: Boolean) {
    TransferContext.writeArguments(BOOL to deltaSmoothingEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDeltaSmoothingPtr, NIL)
  }

  public fun isDeltaSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDeltaSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getProcessorCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getProcessorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getSystemFonts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun getSystemFontPath(
    fontName: String,
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): String {
    TransferContext.writeArguments(STRING to fontName, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getSystemFontPathForText(
    fontName: String,
    text: String,
    locale: String = "",
    script: String = "",
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING to fontName, STRING to text, STRING to locale, STRING to script, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathForTextPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExecutablePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun readStringFromStdin(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readStringFromStdinPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun execute(
    path: String,
    arguments: PackedStringArray,
    output: VariantArray<Any?> = godot.core.variantArrayOf(),
    readStderr: Boolean = false,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, ARRAY to output, BOOL to readStderr, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun createProcess(
    path: String,
    arguments: PackedStringArray,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.createProcessPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun createInstance(arguments: PackedStringArray): Int {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.createInstancePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun kill(pid: Int): GodotError {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.killPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun shellOpen(uri: String): GodotError {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, MethodBindings.shellOpenPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun shellShowInFileManager(fileOrDirPath: String, openFolder: Boolean = true): GodotError {
    TransferContext.writeArguments(STRING to fileOrDirPath, BOOL to openFolder)
    TransferContext.callMethod(rawPtr, MethodBindings.shellShowInFileManagerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun isProcessRunning(pid: Int): Boolean {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getProcessId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun hasEnvironment(variable: String): Boolean {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.hasEnvironmentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getEnvironment(variable: String): String {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setEnvironment(variable: String, `value`: String) {
    TransferContext.writeArguments(STRING to variable, STRING to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public fun unsetEnvironment(variable: String) {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.unsetEnvironmentPtr, NIL)
  }

  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDistributionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDistributionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getCmdlineArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getCmdlineUserArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineUserArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getVideoAdapterDriverInfo(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterDriverInfoPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  @JvmOverloads
  public fun setRestartOnExit(restart: Boolean, arguments: PackedStringArray =
      PackedStringArray()) {
    TransferContext.writeArguments(BOOL to restart, PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.setRestartOnExitPtr, NIL)
  }

  public fun isRestartOnExitSet(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRestartOnExitSetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getRestartOnExitArguments(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRestartOnExitArgumentsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun delayUsec(usec: Int) {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayUsecPtr, NIL)
  }

  public fun delayMsec(msec: Int) {
    TransferContext.writeArguments(LONG to msec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayMsecPtr, NIL)
  }

  public fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getLocaleLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocaleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModelNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUserfsPersistentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStdoutVerbosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDebugBuildPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryPeakUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getMemoryInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMemoryInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun moveToTrash(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.moveToTrashPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUserDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getSystemDir(dir: SystemDir, sharedStorage: Boolean = true): String {
    TransferContext.writeArguments(LONG to dir.id, BOOL to sharedStorage)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConfigDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getKeycodeString(code: Key): String {
    TransferContext.writeArguments(LONG to code.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getKeycodeStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isKeycodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeycodeUnicodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun findKeycodeFromString(string: String): Key {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.findKeycodeFromStringPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseFileAccessSaveAndSwapPtr, NIL)
  }

  public fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setThreadNamePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getThreadCallerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThreadCallerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getMainThreadId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainThreadIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getGrantedPermissions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGrantedPermissionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public enum class RenderingDriver(
    id: Long,
  ) {
    RENDERING_DRIVER_VULKAN(0),
    RENDERING_DRIVER_OPENGL3(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderingDriver = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class SystemDir(
    id: Long,
  ) {
    SYSTEM_DIR_DESKTOP(0),
    SYSTEM_DIR_DCIM(1),
    SYSTEM_DIR_DOCUMENTS(2),
    SYSTEM_DIR_DOWNLOADS(3),
    SYSTEM_DIR_MOVIES(4),
    SYSTEM_DIR_MUSIC(5),
    SYSTEM_DIR_PICTURES(6),
    SYSTEM_DIR_RINGTONES(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SystemDir = entries.single {
          it.id == `value`
      }
    }
  }

  internal object MethodBindings {
    public val getConnectedMidiInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_connected_midi_inputs")

    public val openMidiInputsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "open_midi_inputs")

    public val closeMidiInputsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "close_midi_inputs")

    public val alertPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "alert")

    public val crashPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "crash")

    public val setLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode")

    public val isInLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_in_low_processor_usage_mode")

    public val setLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode_sleep_usec")

    public val getLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_low_processor_usage_mode_sleep_usec")

    public val setDeltaSmoothingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_delta_smoothing")

    public val isDeltaSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_delta_smoothing_enabled")

    public val getProcessorCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_count")

    public val getProcessorNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_name")

    public val getSystemFontsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_system_fonts")

    public val getSystemFontPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path")

    public val getSystemFontPathForTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path_for_text")

    public val getExecutablePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_executable_path")

    public val readStringFromStdinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "read_string_from_stdin")

    public val executePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "execute")

    public val createProcessPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "create_process")

    public val createInstancePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "create_instance")

    public val killPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "kill")

    public val shellOpenPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "shell_open")

    public val shellShowInFileManagerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "shell_show_in_file_manager")

    public val isProcessRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_process_running")

    public val getProcessIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_process_id")

    public val hasEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "has_environment")

    public val getEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_environment")

    public val setEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "set_environment")

    public val unsetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "unset_environment")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_name")

    public val getDistributionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_distribution_name")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_version")

    public val getCmdlineArgsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_cmdline_args")

    public val getCmdlineUserArgsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_cmdline_user_args")

    public val getVideoAdapterDriverInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_video_adapter_driver_info")

    public val setRestartOnExitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_restart_on_exit")

    public val isRestartOnExitSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_restart_on_exit_set")

    public val getRestartOnExitArgumentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_restart_on_exit_arguments")

    public val delayUsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_usec")

    public val delayMsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_msec")

    public val getLocalePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_locale")

    public val getLocaleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_locale_language")

    public val getModelNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_model_name")

    public val isUserfsPersistentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_userfs_persistent")

    public val isStdoutVerbosePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "is_stdout_verbose")

    public val isDebugBuildPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "is_debug_build")

    public val getStaticMemoryUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_usage")

    public val getStaticMemoryPeakUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_peak_usage")

    public val getMemoryInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_memory_info")

    public val moveToTrashPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "move_to_trash")

    public val getUserDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_user_data_dir")

    public val getSystemDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_system_dir")

    public val getConfigDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_config_dir")

    public val getDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_data_dir")

    public val getCacheDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_cache_dir")

    public val getUniqueIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_unique_id")

    public val getKeycodeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_keycode_string")

    public val isKeycodeUnicodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_keycode_unicode")

    public val findKeycodeFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "find_keycode_from_string")

    public val setUseFileAccessSaveAndSwapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_use_file_access_save_and_swap")

    public val setThreadNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "set_thread_name")

    public val getThreadCallerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_thread_caller_id")

    public val getMainThreadIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_main_thread_id")

    public val hasFeaturePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "has_feature")

    public val requestPermissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permission")

    public val requestPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permissions")

    public val getGrantedPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_granted_permissions")
  }
}
