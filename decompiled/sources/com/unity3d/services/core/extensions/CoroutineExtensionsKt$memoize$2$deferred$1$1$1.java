package com.unity3d.services.core.extensions;

import I8.O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.n;
import p169q8.b;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
@Metadata
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends l implements Function2<O, b, Object> {
    final /* synthetic */ Function1<b, Object> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(Function1<? super b, ? extends Object> function1, b bVar) {
        super(2, bVar);
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final b create(@Nullable Object obj, @NotNull b bVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull O o10, @Nullable b bVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(o10, bVar)).invokeSuspend(Unit.f45918a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objE = p179r8.b.e();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return obj;
        }
        n.b(obj);
        Function1<b, Object> function1 = this.$action;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == objE ? objE : objInvoke;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        return this.$action.invoke(this);
    }
}
