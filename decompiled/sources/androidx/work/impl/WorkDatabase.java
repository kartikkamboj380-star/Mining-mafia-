package androidx.work.impl;

import A0.h;
import B0.f;
import K0.C0750c;
import K0.C0753f;
import K0.C0754g;
import K0.C0755h;
import K0.C0756i;
import K0.D;
import K0.j;
import K0.k;
import K0.l;
import K0.m;
import K0.n;
import K0.s;
import S0.InterfaceC0959b;
import S0.e;
import S0.o;
import S0.r;
import S0.v;
import S0.z;
import android.content.Context;
import androidx.room.t;
import androidx.room.u;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
@Metadata
public abstract class WorkDatabase extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11270a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h c(Context context, h.b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            h.b.a aVarA = h.b.f24f.a(context);
            aVarA.d(configuration.f26b).c(configuration.f27c).e(true).a(true);
            return new f().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, boolean z9) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            return (WorkDatabase) (z9 ? t.c(context, WorkDatabase.class).c() : t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: K0.y
                @Override // A0.h.c
                public final A0.h a(A0.h.b bVar) {
                    return WorkDatabase.a.c(context, bVar);
                }
            })).g(queryExecutor).a(C0750c.f2472a).b(C0756i.f2477c).b(new s(context, 2, 3)).b(j.f2478c).b(k.f2479c).b(new s(context, 5, 6)).b(l.f2480c).b(m.f2481c).b(n.f2482c).b(new D(context)).b(new s(context, 10, 11)).b(C0753f.f2474c).b(C0754g.f2475c).b(C0755h.f2476c).e().d();
        }

        private a() {
        }
    }

    public static final WorkDatabase d(Context context, Executor executor, boolean z9) {
        return f11270a.b(context, executor, z9);
    }

    public abstract InterfaceC0959b e();

    public abstract e f();

    public abstract S0.j g();

    public abstract o h();

    public abstract r i();

    public abstract v j();

    public abstract z k();
}
