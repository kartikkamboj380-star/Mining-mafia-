package p048e7;

import V8.d;
import W8.c;
import W8.e;
import X8.f;
import X8.g;
import X8.j;
import X8.o;
import X8.t;
import X8.y;
import X8.z;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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
public final class J {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43319d;

    public /* synthetic */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43320a;

        @NotNull
        private static final d descriptor;

        static {
            a aVar = new a();
            f43320a = aVar;
            t tVar = new t("com.google.firebase.sessions.SessionDetails", aVar, 4);
            tVar.o(JsonStorageKeyNames.SESSION_ID_KEY, false);
            tVar.o("firstSessionId", false);
            tVar.o("sessionIndex", false);
            tVar.o("sessionStartTimestampUs", false);
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
            z zVar = z.f6821a;
            return new T8.b[]{zVar, zVar, g.f6785a, j.f6788a};
        }

        @Override // T8.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final J d(e decoder) {
            String strQ;
            int i10;
            int iD;
            String str;
            long jC;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            d dVar = descriptor;
            c cVarA = decoder.a(dVar);
            if (cVarA.i()) {
                strQ = cVarA.q(dVar, 0);
                String strQ2 = cVarA.q(dVar, 1);
                i10 = 15;
                iD = cVarA.d(dVar, 2);
                str = strQ2;
                jC = cVarA.c(dVar, 3);
            } else {
                strQ = null;
                String strQ3 = null;
                boolean z9 = true;
                long jC2 = 0;
                int i11 = 0;
                int iD2 = 0;
                while (z9) {
                    int iN = cVarA.n(dVar);
                    if (iN == -1) {
                        z9 = false;
                    } else if (iN == 0) {
                        strQ = cVarA.q(dVar, 0);
                        i11 |= 1;
                    } else if (iN == 1) {
                        strQ3 = cVarA.q(dVar, 1);
                        i11 |= 2;
                    } else if (iN == 2) {
                        iD2 = cVarA.d(dVar, 2);
                        i11 |= 4;
                    } else {
                        if (iN != 3) {
                            throw new T8.f(iN);
                        }
                        jC2 = cVarA.c(dVar, 3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                iD = iD2;
                str = strQ3;
                jC = jC2;
            }
            String str2 = strQ;
            cVarA.b(dVar);
            return new J(i10, str2, str, iD, jC, null);
        }

        @Override // T8.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void c(W8.f encoder, J value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            d dVar = descriptor;
            W8.d dVarA = encoder.a(dVar);
            J.e(value, dVarA, dVar);
            dVarA.b(dVar);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final T8.b serializer() {
            return a.f43320a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ J(int i10, String str, String str2, int i11, long j10, y yVar) {
        if (15 != (i10 & 15)) {
            o.a(i10, 15, a.f43320a.a());
        }
        this.f43316a = str;
        this.f43317b = str2;
        this.f43318c = i11;
        this.f43319d = j10;
    }

    public static final /* synthetic */ void e(J j10, W8.d dVar, d dVar2) {
        dVar.g(dVar2, 0, j10.f43316a);
        dVar.g(dVar2, 1, j10.f43317b);
        dVar.m(dVar2, 2, j10.f43318c);
        dVar.l(dVar2, 3, j10.f43319d);
    }

    public final String a() {
        return this.f43317b;
    }

    public final String b() {
        return this.f43316a;
    }

    public final int c() {
        return this.f43318c;
    }

    public final long d() {
        return this.f43319d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Intrinsics.b(this.f43316a, j10.f43316a) && Intrinsics.b(this.f43317b, j10.f43317b) && this.f43318c == j10.f43318c && this.f43319d == j10.f43319d;
    }

    public int hashCode() {
        return (((((this.f43316a.hashCode() * 31) + this.f43317b.hashCode()) * 31) + Integer.hashCode(this.f43318c)) * 31) + Long.hashCode(this.f43319d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f43316a + ", firstSessionId=" + this.f43317b + ", sessionIndex=" + this.f43318c + ", sessionStartTimestampUs=" + this.f43319d + ')';
    }

    public J(String sessionId, String firstSessionId, int i10, long j10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f43316a = sessionId;
        this.f43317b = firstSessionId;
        this.f43318c = i10;
        this.f43319d = j10;
    }
}
