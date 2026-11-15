package p078h7;

import V8.d;
import W8.c;
import W8.e;
import X8.f;
import X8.g;
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
public final class h {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f44835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f44836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f44837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f44838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f44839e;

    public /* synthetic */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44840a;

        @NotNull
        private static final d descriptor;

        static {
            a aVar = new a();
            f44840a = aVar;
            t tVar = new t("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            tVar.o("sessionsEnabled", false);
            tVar.o("sessionSamplingRate", false);
            tVar.o("sessionTimeoutSeconds", false);
            tVar.o("cacheDurationSeconds", false);
            tVar.o("cacheUpdatedTimeSeconds", false);
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
            T8.b bVarA = U8.a.a(X8.b.f6775a);
            T8.b bVarA2 = U8.a.a(X8.d.f6777a);
            g gVar = g.f6785a;
            return new T8.b[]{bVarA, bVarA2, U8.a.a(gVar), U8.a.a(gVar), U8.a.a(j.f6788a)};
        }

        @Override // T8.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final h d(e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            d dVar = descriptor;
            c cVarA = decoder.a(dVar);
            Boolean bool2 = null;
            if (cVarA.i()) {
                Boolean bool3 = (Boolean) cVarA.h(dVar, 0, X8.b.f6775a, null);
                Double d11 = (Double) cVarA.h(dVar, 1, X8.d.f6777a, null);
                g gVar = g.f6785a;
                Integer num3 = (Integer) cVarA.h(dVar, 2, gVar, null);
                bool = bool3;
                num2 = (Integer) cVarA.h(dVar, 3, gVar, null);
                l10 = (Long) cVarA.h(dVar, 4, j.f6788a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z9 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z9) {
                    int iN = cVarA.n(dVar);
                    if (iN == -1) {
                        z9 = false;
                    } else if (iN == 0) {
                        bool2 = (Boolean) cVarA.h(dVar, 0, X8.b.f6775a, bool2);
                        i11 |= 1;
                    } else if (iN == 1) {
                        d12 = (Double) cVarA.h(dVar, 1, X8.d.f6777a, d12);
                        i11 |= 2;
                    } else if (iN == 2) {
                        num4 = (Integer) cVarA.h(dVar, 2, g.f6785a, num4);
                        i11 |= 4;
                    } else if (iN == 3) {
                        num5 = (Integer) cVarA.h(dVar, 3, g.f6785a, num5);
                        i11 |= 8;
                    } else {
                        if (iN != 4) {
                            throw new T8.f(iN);
                        }
                        l11 = (Long) cVarA.h(dVar, 4, j.f6788a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            cVarA.b(dVar);
            return new h(i10, bool, d10, num, num2, l10, null);
        }

        @Override // T8.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void c(W8.f encoder, h value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            d dVar = descriptor;
            W8.d dVarA = encoder.a(dVar);
            h.f(value, dVarA, dVar);
            dVarA.b(dVar);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final T8.b serializer() {
            return a.f44840a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ h(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, y yVar) {
        if (31 != (i10 & 31)) {
            o.a(i10, 31, a.f44840a.a());
        }
        this.f44835a = bool;
        this.f44836b = d10;
        this.f44837c = num;
        this.f44838d = num2;
        this.f44839e = l10;
    }

    public static final /* synthetic */ void f(h hVar, W8.d dVar, d dVar2) {
        dVar.q(dVar2, 0, X8.b.f6775a, hVar.f44835a);
        dVar.q(dVar2, 1, X8.d.f6777a, hVar.f44836b);
        g gVar = g.f6785a;
        dVar.q(dVar2, 2, gVar, hVar.f44837c);
        dVar.q(dVar2, 3, gVar, hVar.f44838d);
        dVar.q(dVar2, 4, j.f6788a, hVar.f44839e);
    }

    public final Integer a() {
        return this.f44838d;
    }

    public final Long b() {
        return this.f44839e;
    }

    public final Double c() {
        return this.f44836b;
    }

    public final Integer d() {
        return this.f44837c;
    }

    public final Boolean e() {
        return this.f44835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.b(this.f44835a, hVar.f44835a) && Intrinsics.b(this.f44836b, hVar.f44836b) && Intrinsics.b(this.f44837c, hVar.f44837c) && Intrinsics.b(this.f44838d, hVar.f44838d) && Intrinsics.b(this.f44839e, hVar.f44839e);
    }

    public int hashCode() {
        Boolean bool = this.f44835a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f44836b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f44837c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f44838d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f44839e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f44835a + ", sessionSamplingRate=" + this.f44836b + ", sessionTimeoutSeconds=" + this.f44837c + ", cacheDurationSeconds=" + this.f44838d + ", cacheUpdatedTimeSeconds=" + this.f44839e + ')';
    }

    public h(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f44835a = bool;
        this.f44836b = d10;
        this.f44837c = num;
        this.f44838d = num2;
        this.f44839e = l10;
    }
}
