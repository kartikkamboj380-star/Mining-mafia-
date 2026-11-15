package p048e7;

import V8.d;
import W8.c;
import W8.e;
import X8.f;
import X8.j;
import X8.o;
import X8.t;
import X8.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
@Metadata
public final class Y {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43416c;

    public /* synthetic */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43417a;

        @NotNull
        private static final d descriptor;

        static {
            a aVar = new a();
            f43417a = aVar;
            t tVar = new t("com.google.firebase.sessions.Time", aVar, 3);
            tVar.o("ms", false);
            tVar.o("us", true);
            tVar.o("seconds", true);
            descriptor = tVar;
        }

        private a() {
        }

        @Override // T8.b, T8.e, T8.a
        public final d a() {
            return descriptor;
        }

        @Override // X8.f
        public T8.b[] b() {
            return f.a.a(this);
        }

        @Override // X8.f
        public final T8.b[] e() {
            j jVar = j.f6788a;
            return new T8.b[]{jVar, jVar, jVar};
        }

        @Override // T8.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Y d(e decoder) {
            int i10;
            long jC;
            long j10;
            long j11;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            d dVar = descriptor;
            c cVarA = decoder.a(dVar);
            if (cVarA.i()) {
                long jC2 = cVarA.c(dVar, 0);
                long jC3 = cVarA.c(dVar, 1);
                jC = cVarA.c(dVar, 2);
                i10 = 7;
                j10 = jC2;
                j11 = jC3;
            } else {
                long jC4 = 0;
                boolean z9 = true;
                int i11 = 0;
                long jC5 = 0;
                long jC6 = 0;
                while (z9) {
                    int iN = cVarA.n(dVar);
                    if (iN == -1) {
                        z9 = false;
                    } else if (iN == 0) {
                        jC5 = cVarA.c(dVar, 0);
                        i11 |= 1;
                    } else if (iN == 1) {
                        jC6 = cVarA.c(dVar, 1);
                        i11 |= 2;
                    } else {
                        if (iN != 2) {
                            throw new T8.f(iN);
                        }
                        jC4 = cVarA.c(dVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jC = jC4;
                j10 = jC5;
                j11 = jC6;
            }
            cVarA.b(dVar);
            return new Y(i10, j10, j11, jC, null);
        }

        @Override // T8.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void c(W8.f encoder, Y value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            d dVar = descriptor;
            W8.d dVarA = encoder.a(dVar);
            Y.d(value, dVarA, dVar);
            dVarA.b(dVar);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final T8.b serializer() {
            return a.f43417a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Y(int i10, long j10, long j11, long j12, y yVar) {
        if (1 != (i10 & 1)) {
            o.a(i10, 1, a.f43417a.a());
        }
        this.f43414a = j10;
        this.f43415b = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.f43416c = j10 / ((long) 1000);
        } else {
            this.f43416c = j12;
        }
    }

    public static final /* synthetic */ void d(Y y9, W8.d dVar, d dVar2) {
        dVar.l(dVar2, 0, y9.f43414a);
        if (dVar.f(dVar2, 1) || y9.f43415b != y9.f43414a * ((long) 1000)) {
            dVar.l(dVar2, 1, y9.f43415b);
        }
        if (!dVar.f(dVar2, 2) && y9.f43416c == y9.f43414a / ((long) 1000)) {
            return;
        }
        dVar.l(dVar2, 2, y9.f43416c);
    }

    public final long a() {
        return this.f43416c;
    }

    public final long b() {
        return this.f43415b;
    }

    public final long c(Y time) {
        Intrinsics.checkNotNullParameter(time, "time");
        kotlin.time.b.a aVar = kotlin.time.b.f46051b;
        return kotlin.time.c.q(this.f43414a - time.f43414a, H8.b.MILLISECONDS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && this.f43414a == ((Y) obj).f43414a;
    }

    public int hashCode() {
        return Long.hashCode(this.f43414a);
    }

    public String toString() {
        return "Time(ms=" + this.f43414a + ')';
    }

    public Y(long j10) {
        this.f43414a = j10;
        long j11 = 1000;
        this.f43415b = j10 * j11;
        this.f43416c = j10 / j11;
    }
}
