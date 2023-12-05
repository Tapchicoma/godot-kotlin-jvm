// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class EditorVCSInterface internal constructor() : Object() {
  override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORVCSINTERFACE, scriptIndex)
    return true
  }

  public open fun _initialize(projectPath: String): Boolean {
    throw NotImplementedError("_initialize is not implemented for EditorVCSInterface")
  }

  public open fun _setCredentials(
    username: String,
    password: String,
    sshPublicKeyPath: String,
    sshPrivateKeyPath: String,
    sshPassphrase: String,
  ) {
  }

  public open fun _getModifiedFilesData(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_modified_files_data is not implemented for EditorVCSInterface")
  }

  public open fun _stageFile(filePath: String) {
  }

  public open fun _unstageFile(filePath: String) {
  }

  public open fun _discardFile(filePath: String) {
  }

  public open fun _commit(msg: String) {
  }

  public open fun _getDiff(identifier: String, area: Int): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_diff is not implemented for EditorVCSInterface")
  }

  public open fun _shutDown(): Boolean {
    throw NotImplementedError("_shut_down is not implemented for EditorVCSInterface")
  }

  public open fun _getVcsName(): String {
    throw NotImplementedError("_get_vcs_name is not implemented for EditorVCSInterface")
  }

  public open fun _getPreviousCommits(maxCommits: Int): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_previous_commits is not implemented for EditorVCSInterface")
  }

  public open fun _getBranchList(): VariantArray<String> {
    throw NotImplementedError("_get_branch_list is not implemented for EditorVCSInterface")
  }

  public open fun _getRemotes(): VariantArray<String> {
    throw NotImplementedError("_get_remotes is not implemented for EditorVCSInterface")
  }

  public open fun _createBranch(branchName: String) {
  }

  public open fun _removeBranch(branchName: String) {
  }

  public open fun _createRemote(remoteName: String, remoteUrl: String) {
  }

  public open fun _removeRemote(remoteName: String) {
  }

  public open fun _getCurrentBranchName(): String {
    throw NotImplementedError("_get_current_branch_name is not implemented for EditorVCSInterface")
  }

  public open fun _checkoutBranch(branchName: String): Boolean {
    throw NotImplementedError("_checkout_branch is not implemented for EditorVCSInterface")
  }

  public open fun _pull(remote: String) {
  }

  public open fun _push(remote: String, force: Boolean) {
  }

  public open fun _fetch(remote: String) {
  }

  public open fun _getLineDiff(filePath: String, text: String):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_line_diff is not implemented for EditorVCSInterface")
  }

  public fun createDiffLine(
    newLineNo: Int,
    oldLineNo: Int,
    content: String,
    status: String,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to newLineNo.toLong(), LONG to oldLineNo.toLong(), STRING to content, STRING to status)
    TransferContext.callMethod(rawPtr, MethodBindings.createDiffLinePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun createDiffHunk(
    oldStart: Int,
    newStart: Int,
    oldLines: Int,
    newLines: Int,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to oldStart.toLong(), LONG to newStart.toLong(), LONG to oldLines.toLong(), LONG to newLines.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createDiffHunkPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun createDiffFile(newFile: String, oldFile: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to newFile, STRING to oldFile)
    TransferContext.callMethod(rawPtr, MethodBindings.createDiffFilePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun createCommit(
    msg: String,
    author: String,
    id: String,
    unixTimestamp: Long,
    offsetMinutes: Long,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to msg, STRING to author, STRING to id, LONG to unixTimestamp, LONG to offsetMinutes)
    TransferContext.callMethod(rawPtr, MethodBindings.createCommitPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun createStatusFile(
    filePath: String,
    changeType: ChangeType,
    area: TreeArea,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to filePath, LONG to changeType.id, LONG to area.id)
    TransferContext.callMethod(rawPtr, MethodBindings.createStatusFilePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun addDiffHunksIntoDiffFile(diffFile: Dictionary<Any?, Any?>,
      diffHunks: VariantArray<Dictionary<Any?, Any?>>): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(DICTIONARY to diffFile, ARRAY to diffHunks)
    TransferContext.callMethod(rawPtr, MethodBindings.addDiffHunksIntoDiffFilePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun addLineDiffsIntoDiffHunk(diffHunk: Dictionary<Any?, Any?>,
      lineDiffs: VariantArray<Dictionary<Any?, Any?>>): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(DICTIONARY to diffHunk, ARRAY to lineDiffs)
    TransferContext.callMethod(rawPtr, MethodBindings.addLineDiffsIntoDiffHunkPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun popupError(msg: String) {
    TransferContext.writeArguments(STRING to msg)
    TransferContext.callMethod(rawPtr, MethodBindings.popupErrorPtr, NIL)
  }

  public enum class ChangeType(
    id: Long,
  ) {
    CHANGE_TYPE_NEW(0),
    CHANGE_TYPE_MODIFIED(1),
    CHANGE_TYPE_RENAMED(2),
    CHANGE_TYPE_DELETED(3),
    CHANGE_TYPE_TYPECHANGE(4),
    CHANGE_TYPE_UNMERGED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ChangeType = entries.single {
          it.id == `value`
      }
    }
  }

  public enum class TreeArea(
    id: Long,
  ) {
    TREE_AREA_COMMIT(0),
    TREE_AREA_STAGED(1),
    TREE_AREA_UNSTAGED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TreeArea = entries.single {
          it.id == `value`
      }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_initialize")

    public val _setCredentialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_set_credentials")

    public val _getModifiedFilesDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_modified_files_data")

    public val _stageFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_stage_file")

    public val _unstageFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_unstage_file")

    public val _discardFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_discard_file")

    public val _commitPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorVCSInterface", "_commit")

    public val _getDiffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_diff")

    public val _shutDownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_shut_down")

    public val _getVcsNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_vcs_name")

    public val _getPreviousCommitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_previous_commits")

    public val _getBranchListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_branch_list")

    public val _getRemotesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_remotes")

    public val _createBranchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_create_branch")

    public val _removeBranchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_remove_branch")

    public val _createRemotePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_create_remote")

    public val _removeRemotePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_remove_remote")

    public val _getCurrentBranchNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_current_branch_name")

    public val _checkoutBranchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_checkout_branch")

    public val _pullPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorVCSInterface", "_pull")

    public val _pushPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorVCSInterface", "_push")

    public val _fetchPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorVCSInterface", "_fetch")

    public val _getLineDiffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "_get_line_diff")

    public val createDiffLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "create_diff_line")

    public val createDiffHunkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "create_diff_hunk")

    public val createDiffFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "create_diff_file")

    public val createCommitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "create_commit")

    public val createStatusFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "create_status_file")

    public val addDiffHunksIntoDiffFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "add_diff_hunks_into_diff_file")

    public val addLineDiffsIntoDiffHunkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "add_line_diffs_into_diff_hunk")

    public val popupErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorVCSInterface", "popup_error")
  }
}
