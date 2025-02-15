#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#define GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H

#include "jni/jvm.h"

#include <core/io/dir_access.h>
#include <editor/export/editor_export_platform.h>
#include <editor/export/editor_export_plugin.h>

class KotlinEditorExportPlugin : public EditorExportPlugin {
public:
    void _export_begin(const HashSet<String>& p_features, bool p_debug, const String& p_path, int p_flags) override;
    String _get_name() const override;

private:
    void _generate_export_configuration_file(jni::Jvm::Type vm_type);
    static void _copy_jre_to(const char* jre_folder, Ref<DirAccess> dir_access);
};

#endif// GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H

#endif
