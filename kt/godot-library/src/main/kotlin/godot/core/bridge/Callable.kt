@file:JvmName("CallableUtils")
@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.Object
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr

class Callable : NativeCoreType {

    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType.CALLABLE)
    }

    constructor(target: Object, methodName: StringName) {
        TransferContext.writeArguments(VariantType.OBJECT to target, VariantType.STRING_NAME to methodName)
        _handle = Bridge.engine_call_constructor_object_string_name()
        MemoryManager.registerNativeCoreType(this, VariantType.CALLABLE)
    }

    constructor(callable: Callable) {
        TransferContext.writeArguments(VariantType.CALLABLE to callable)
        _handle = Bridge.engine_call_copy_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType.CALLABLE)
    }

    internal constructor(_handle: VoidPtr){
        this._handle = _handle
        MemoryManager.registerNativeCoreType(this, VariantType.CALLABLE)
    }

    fun bind(vararg args: Any?): Callable {
        TransferContext.writeArguments(*args.map { VariantType.ANY to it }.toTypedArray())
        Bridge.engine_call_bind(_handle)
        return TransferContext.readReturnValue(VariantType.CALLABLE, false) as Callable
    }

    fun bindv(args: VariantArray<Any?>): Callable {
        TransferContext.writeArguments(VariantType.ARRAY to args)
        Bridge.engine_call_bindv(_handle)
        return TransferContext.readReturnValue(VariantType.CALLABLE, false) as Callable
    }

    fun call(vararg args: Any?): Any? {
        TransferContext.writeArguments(*args.map { VariantType.ANY to it }.toTypedArray())
        Bridge.engine_call_call(_handle)
        return TransferContext.readReturnValue(VariantType.ANY, true)
    }

    fun callDeferred(vararg args: Any?) {
        TransferContext.writeArguments(*args.map { VariantType.ANY to it }.toTypedArray())
        Bridge.engine_call_call_deferred(_handle)
    }

    fun callv(args: VariantArray<Any?>): Any? {
        TransferContext.writeArguments(VariantType.ARRAY to args)
        Bridge.engine_call_callv(_handle)
        return TransferContext.readReturnValue(VariantType.ANY, true)
    }

    fun getBoundArguments(): VariantArray<Any?> {
        Bridge.engine_call_get_bound_arguments(_handle)
        return TransferContext.readReturnValue(VariantType.ARRAY, false) as VariantArray<Any?>
    }

    fun getBoundArgumentCount(): Int {
        Bridge.engine_call_get_bound_arguments_count(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT, false) as Int
    }

    fun getMethod(): StringName {
        Bridge.engine_call_get_method(_handle)
        return TransferContext.readReturnValue(VariantType.STRING_NAME, false) as StringName
    }

    fun getObject(): Object {
        Bridge.engine_call_get_object(_handle)
        return TransferContext.readReturnValue(VariantType.OBJECT, false) as Object
    }

    fun getObjectId(): ObjectID {
        Bridge.engine_call_get_object_id(_handle)
        return ObjectID(TransferContext.readReturnValue(VariantType.LONG) as Long)
    }

    override fun hashCode(): Int {
        Bridge.engine_call_hash(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    fun isCustom(): Boolean {
        Bridge.engine_call_is_custom(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    fun isNull(): Boolean {
        Bridge.engine_call_is_null(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    fun isStandard(): Boolean {
        Bridge.engine_call_is_standard(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    fun isValid(): Boolean {
        Bridge.engine_call_is_valid(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    fun rpc(vararg args: Any?) {
        TransferContext.writeArguments(*args.map { VariantType.ANY to it }.toTypedArray())
        Bridge.engine_call_rpc(_handle)
    }

    fun rpcId(peerId: Long, vararg args: Any?) {
        TransferContext.writeArguments(VariantType.LONG to peerId, *args.map { VariantType.ANY to it }.toTypedArray())
        Bridge.engine_call_rpc_id(_handle)
    }

    fun unbind(argCount: Int): Callable {
        TransferContext.writeArguments(VariantType.JVM_INT to argCount)
        Bridge.engine_call_unbind(_handle)
        return TransferContext.readReturnValue(VariantType.CALLABLE, false) as Callable
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Callable) return false
        if(getObject() != other.getObject() || getMethod() != other.getMethod()) return false
        return true
    }

    @Suppress("FunctionName")
    object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_constructor_object_string_name(): VoidPtr
        //external fun engine_call_constructor_kt_custom_callable(callable: KtCustomCallable): VoidPtr
        external fun engine_call_copy_constructor(): VoidPtr

        external fun engine_call_bind(_handle: VoidPtr)
        external fun engine_call_bindv(_handle: VoidPtr)
        external fun engine_call_call(handle: VoidPtr)
        external fun engine_call_call_deferred(handle: VoidPtr)
        external fun engine_call_callv(_handle: VoidPtr)
        external fun engine_call_get_bound_arguments(_handle: VoidPtr)
        external fun engine_call_get_bound_arguments_count(_handle: VoidPtr)
        external fun engine_call_get_method(_handle: VoidPtr)
        external fun engine_call_get_object(_handle: VoidPtr)
        external fun engine_call_get_object_id(_handle: VoidPtr)
        external fun engine_call_hash(_handle: VoidPtr)
        external fun engine_call_is_custom(_handle: VoidPtr)
        external fun engine_call_is_null(_handle: VoidPtr)
        external fun engine_call_is_standard(_handle: VoidPtr)
        external fun engine_call_is_valid(_handle: VoidPtr)
        external fun engine_call_rpc(_handle: VoidPtr)
        external fun engine_call_rpc_id(_handle: VoidPtr)
        external fun engine_call_unbind(_handle: VoidPtr)
    }
}


//TODO: Enable that code again when KtCustomCallable is back
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.() -> R
//) = Callable(
//    target,
//    TargetedCall(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        }
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified P0 : Any?, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.(P0) -> R
//) = Callable(
//    target,
//    TargetedCall1(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant type."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified P0 : Any?, reified P1 : Any?, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.(P0, P1) -> R
//) = Callable(
//    target,
//    TargetedCall2(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified P0 : Any?, reified P1 : Any?, reified P2 : Any?, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2) -> R
//) = Callable(
//    target,
//    TargetedCall3(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified P0 : Any?, reified P1 : Any?, reified P2 : Any?, reified P3 : Any?, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2, P3) -> R
//) = Callable(
//    target,
//    TargetedCall4(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P3::class]) {
//            "Cannot map parameter type ${P3::class} to variant."
//        } to true
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <T : KtObject, reified P0 : Any?, reified P1 : Any?, reified P2 : Any?, reified P3 : Any?, reified P4 : Any?, reified R : Any?> callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2, P3, P4) -> R
//) = Callable(
//    target,
//    TargetedCall5(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P3::class]) {
//            "Cannot map parameter type ${P3::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P4::class]) {
//            "Cannot map parameter type ${P4::class} to variant."
//        } to true
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <
//    T : KtObject,
//    reified P0 : Any?,
//    reified P1 : Any?,
//    reified P2 : Any?,
//    reified P3 : Any?,
//    reified P4 : Any?,
//    reified P5 : Any?,
//    reified R : Any?,
//    > callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2, P3, P4, P5) -> R
//) = Callable(
//    target,
//    TargetedCall6(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P3::class]) {
//            "Cannot map parameter type ${P3::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P4::class]) {
//            "Cannot map parameter type ${P4::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P5::class]) {
//            "Cannot map parameter type ${P5::class} to variant."
//        } to true,
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <
//    T : KtObject,
//    reified P0 : Any?,
//    reified P1 : Any?,
//    reified P2 : Any?,
//    reified P3 : Any?,
//    reified P4 : Any?,
//    reified P5 : Any?,
//    reified P6 : Any?,
//    reified R : Any?,
//    > callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2, P3, P4, P5, P6) -> R
//) = Callable(
//    target,
//    TargetedCall7(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P3::class]) {
//            "Cannot map parameter type ${P3::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P4::class]) {
//            "Cannot map parameter type ${P4::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P5::class]) {
//            "Cannot map parameter type ${P5::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P6::class]) {
//            "Cannot map parameter type ${P6::class} to variant."
//        } to true,
//    ) as KtCallable<KtObject, *>
//)
//
//@Suppress("UNCHECKED_CAST")
//inline fun <
//    T : KtObject,
//    reified P0 : Any?,
//    reified P1 : Any?,
//    reified P2 : Any?,
//    reified P3 : Any?,
//    reified P4 : Any?,
//    reified P5 : Any?,
//    reified P6 : Any?,
//    reified P7 : Any?,
//    reified R : Any?,
//    > callable(
//    target: Object,
//    noinline function: T.(P0, P1, P2, P3, P4, P5, P6, P7) -> R
//) = Callable(
//    target,
//    TargetedCall8(
//        function,
//        checkNotNull(variantMapper[R::class]) {
//            "Cannot map return type ${R::class} to variant."
//        },
//        checkNotNull(variantMapper[P0::class]) {
//            "Cannot map parameter type ${P0::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P1::class]) {
//            "Cannot map parameter type ${P1::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P2::class]) {
//            "Cannot map parameter type ${P2::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P3::class]) {
//            "Cannot map parameter type ${P3::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P4::class]) {
//            "Cannot map parameter type ${P4::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P5::class]) {
//            "Cannot map parameter type ${P5::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P6::class]) {
//            "Cannot map parameter type ${P6::class} to variant."
//        } to true,
//        checkNotNull(variantMapper[P7::class]) {
//            "Cannot map parameter type ${P7::class} to variant."
//        } to true,
//    ) as KtCallable<KtObject, *>
//)
//
//fun callable(jvmCall: () -> Unit) = Callable(jvmCall)
