package godot.codegen.constants

val jvmMethodToNotGenerate = listOf(
    "Object" to "free",
    "InterpolatedCamera" to "setTarget"
)

val enumsToNotGenerate = listOf(
    "Error"
)
