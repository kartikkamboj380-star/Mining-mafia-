package com.unity3d.ads.core.domain;

import I8.O;
import K8.v;
import android.app.Activity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
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
@f(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1", f = "AndroidGetLifecycleFlow.kt", l = {TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING}, m = "invokeSuspend")
@Metadata
final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1 extends l implements Function2<O, b, Object> {
    final /* synthetic */ v $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(v vVar, Activity activity, b bVar) {
        super(2, bVar);
        this.$$this$channelFlow = vVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final b create(@Nullable Object obj, @NotNull b bVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(this.$$this$channelFlow, this.$activity, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull O o10, @Nullable b bVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1) create(o10, bVar)).invokeSuspend(Unit.f45918a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objE = p179r8.b.e();
        int i10 = this.label;
        if (i10 == 0) {
            n.b(obj);
            v vVar = this.$$this$channelFlow;
            LifecycleEvent.Started started = new LifecycleEvent.Started(new WeakReference(this.$activity));
            this.label = 1;
            if (vVar.k(started, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        return Unit.f45918a;
    }
}
