package c9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f12177e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1221i[] f12178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1221i[] f12179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f12180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f12181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f12182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f12183k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f12186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f12187d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        C1221i c1221i = C1221i.f12148o1;
        C1221i c1221i2 = C1221i.f12151p1;
        C1221i c1221i3 = C1221i.f12154q1;
        C1221i c1221i4 = C1221i.f12106a1;
        C1221i c1221i5 = C1221i.f12118e1;
        C1221i c1221i6 = C1221i.f12109b1;
        C1221i c1221i7 = C1221i.f12121f1;
        C1221i c1221i8 = C1221i.f12139l1;
        C1221i c1221i9 = C1221i.f12136k1;
        C1221i[] c1221iArr = {c1221i, c1221i2, c1221i3, c1221i4, c1221i5, c1221i6, c1221i7, c1221i8, c1221i9};
        f12178f = c1221iArr;
        C1221i[] c1221iArr2 = {c1221i, c1221i2, c1221i3, c1221i4, c1221i5, c1221i6, c1221i7, c1221i8, c1221i9, C1221i.f12076L0, C1221i.f12078M0, C1221i.f12132j0, C1221i.f12135k0, C1221i.f12067H, C1221i.f12075L, C1221i.f12137l};
        f12179g = c1221iArr2;
        a aVarB = new a(true).b((C1221i[]) Arrays.copyOf(c1221iArr, c1221iArr.length));
        G g10 = G.TLS_1_3;
        G g11 = G.TLS_1_2;
        f12180h = aVarB.e(g10, g11).d(true).a();
        f12181i = new a(true).b((C1221i[]) Arrays.copyOf(c1221iArr2, c1221iArr2.length)).e(g10, g11).d(true).a();
        f12182j = new a(true).b((C1221i[]) Arrays.copyOf(c1221iArr2, c1221iArr2.length)).e(g10, g11, G.TLS_1_1, G.TLS_1_0).d(true).a();
        f12183k = new a(false).a();
    }

    public l(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f12184a = z9;
        this.f12185b = z10;
        this.f12186c = strArr;
        this.f12187d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z9) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f12186c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = d9.e.E(enabledCipherSuites, this.f12186c, C1221i.f12107b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f12187d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = d9.e.E(enabledProtocols, this.f12187d, p159p8.a.b());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iX = d9.e.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C1221i.f12107b.c());
        if (z9 && iX != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = d9.e.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z9) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z9);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f12187d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f12186c);
        }
    }

    public final List d() {
        String[] strArr = this.f12186c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1221i.f12107b.b(str));
        }
        return CollectionsKt.w0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f12184a) {
            return false;
        }
        String[] strArr = this.f12187d;
        if (strArr != null && !d9.e.u(strArr, socket.getEnabledProtocols(), p159p8.a.b())) {
            return false;
        }
        String[] strArr2 = this.f12186c;
        return strArr2 == null || d9.e.u(strArr2, socket.getEnabledCipherSuites(), C1221i.f12107b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z9 = this.f12184a;
        l lVar = (l) obj;
        if (z9 != lVar.f12184a) {
            return false;
        }
        return !z9 || (Arrays.equals(this.f12186c, lVar.f12186c) && Arrays.equals(this.f12187d, lVar.f12187d) && this.f12185b == lVar.f12185b);
    }

    public final boolean f() {
        return this.f12184a;
    }

    public final boolean h() {
        return this.f12185b;
    }

    public int hashCode() {
        if (!this.f12184a) {
            return 17;
        }
        String[] strArr = this.f12186c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f12187d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f12185b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f12187d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(G.f11964b.a(str));
        }
        return CollectionsKt.w0(arrayList);
    }

    public String toString() {
        if (!this.f12184a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f12185b + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f12189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f12190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12191d;

        public a(boolean z9) {
            this.f12188a = z9;
        }

        public final l a() {
            return new l(this.f12188a, this.f12191d, this.f12189b, this.f12190c);
        }

        public final a b(C1221i... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f12188a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C1221i c1221i : cipherSuites) {
                arrayList.add(c1221i.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f12188a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f12189b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a d(boolean z9) {
            if (!this.f12188a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f12191d = z9;
            return this;
        }

        public final a e(G... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f12188a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (G g10 : tlsVersions) {
                arrayList.add(g10.d());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f12188a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f12190c = (String[]) tlsVersions.clone();
            return this;
        }

        public a(l connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f12188a = connectionSpec.f();
            this.f12189b = connectionSpec.f12186c;
            this.f12190c = connectionSpec.f12187d;
            this.f12191d = connectionSpec.h();
        }
    }
}
