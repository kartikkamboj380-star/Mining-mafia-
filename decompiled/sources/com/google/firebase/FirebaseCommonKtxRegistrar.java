package com.google.firebase;

import I8.AbstractC0695t0;
import I8.K;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p057f6.C6982c;
import p057f6.E;
import p057f6.InterfaceC6983d;
import p057f6.g;
import p057f6.q;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39957a = new a();

        @Override // p057f6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC6983d interfaceC6983d) {
            Object objE = interfaceC6983d.e(E.a(p047e6.a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objE, "get(...)");
            return AbstractC0695t0.b((Executor) objE);
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39958a = new b();

        @Override // p057f6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC6983d interfaceC6983d) {
            Object objE = interfaceC6983d.e(E.a(p047e6.c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objE, "get(...)");
            return AbstractC0695t0.b((Executor) objE);
        }
    }

    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39959a = new c();

        @Override // p057f6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC6983d interfaceC6983d) {
            Object objE = interfaceC6983d.e(E.a(p047e6.b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objE, "get(...)");
            return AbstractC0695t0.b((Executor) objE);
        }
    }

    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f39960a = new d();

        @Override // p057f6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC6983d interfaceC6983d) {
            Object objE = interfaceC6983d.e(E.a(p047e6.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objE, "get(...)");
            return AbstractC0695t0.b((Executor) objE);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C6982c> getComponents() {
        C6982c c6982cD = C6982c.c(E.a(p047e6.a.class, K.class)).b(q.k(E.a(p047e6.a.class, Executor.class))).f(a.f39957a).d();
        Intrinsics.checkNotNullExpressionValue(c6982cD, "build(...)");
        C6982c c6982cD2 = C6982c.c(E.a(p047e6.c.class, K.class)).b(q.k(E.a(p047e6.c.class, Executor.class))).f(b.f39958a).d();
        Intrinsics.checkNotNullExpressionValue(c6982cD2, "build(...)");
        C6982c c6982cD3 = C6982c.c(E.a(p047e6.b.class, K.class)).b(q.k(E.a(p047e6.b.class, Executor.class))).f(c.f39959a).d();
        Intrinsics.checkNotNullExpressionValue(c6982cD3, "build(...)");
        C6982c c6982cD4 = C6982c.c(E.a(p047e6.d.class, K.class)).b(q.k(E.a(p047e6.d.class, Executor.class))).f(d.f39960a).d();
        Intrinsics.checkNotNullExpressionValue(c6982cD4, "build(...)");
        return CollectionsKt.l(c6982cD, c6982cD2, c6982cD3, c6982cD4);
    }
}
