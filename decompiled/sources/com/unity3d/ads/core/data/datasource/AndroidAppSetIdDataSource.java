package com.unity3d.ads.core.data.datasource;

import L8.M;
import L8.x;
import W4.c;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p176r5.InterfaceC7090g;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final x _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final x isCollecting;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$invoke$2, reason: invalid class name */
    @Metadata
    static final class AnonymousClass2 extends m implements Function1<c, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return Unit.f45918a;
        }

        public final void invoke(c cVar) {
            String strA = cVar.a();
            Intrinsics.checkNotNullExpressionValue(strA, "it.id");
            AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(strA);
        }
    }

    public AndroidAppSetIdDataSource(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = M.a(Boolean.FALSE);
        this._appSetIdFlow = M.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Nullable
    public final String getAppSetId() {
        return (String) this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        x xVar = this.isCollecting;
        do {
            value = xVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!xVar.h(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task taskB = W4.a.a(this.applicationContext).b();
            final AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            taskB.g(new InterfaceC7090g() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // p176r5.InterfaceC7090g
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(anonymousClass2, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
