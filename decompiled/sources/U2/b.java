package U2;

import I2.f;
import I2.g;
import I2.h;
import J2.EnumC0729n;
import Y1.e;
import Y1.i;
import Y1.k;
import android.net.Uri;
import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final e f5841A = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f5842y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f5843z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0089b f5845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f5846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f5848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I2.d f5852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f5853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h f5854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final I2.b f5855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f5856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f5857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f5858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f5859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f5860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f5861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f5862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Q2.e f5863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Boolean f5864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final EnumC0729n f5865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f5866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f5867x;

    class a implements e {
        a() {
        }

        @Override // Y1.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.v();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: U2.b$b, reason: collision with other inner class name */
    public enum EnumC0089b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5877a;

        c(int i10) {
            this.f5877a = i10;
        }

        public static c c(c cVar, c cVar2) {
            return cVar.d() > cVar2.d() ? cVar : cVar2;
        }

        public int d() {
            return this.f5877a;
        }
    }

    protected b(U2.c cVar) {
        this.f5845b = cVar.d();
        Uri uriR = cVar.r();
        this.f5846c = uriR;
        this.f5847d = x(uriR);
        this.f5849f = cVar.w();
        this.f5850g = cVar.u();
        this.f5851h = cVar.j();
        this.f5852i = cVar.i();
        this.f5853j = cVar.o();
        this.f5854k = cVar.q() == null ? h.c() : cVar.q();
        this.f5855l = cVar.c();
        this.f5856m = cVar.n();
        this.f5857n = cVar.k();
        boolean zT = cVar.t();
        this.f5859p = zT;
        int iE = cVar.e();
        this.f5858o = zT ? iE : iE | 48;
        this.f5860q = cVar.v();
        this.f5861r = cVar.S();
        this.f5862s = cVar.l();
        this.f5863t = cVar.m();
        this.f5864u = cVar.p();
        this.f5865v = cVar.h();
        this.f5867x = cVar.f();
        this.f5866w = cVar.g();
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return U2.c.x(uri).a();
    }

    private static int x(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (p063g2.f.n(uri)) {
            return 0;
        }
        if (uri.getPath() != null && p063g2.f.l(uri)) {
            return p003a2.a.c(p003a2.a.b(uri.getPath())) ? 2 : 3;
        }
        if (p063g2.f.k(uri)) {
            return 4;
        }
        if (p063g2.f.h(uri)) {
            return 5;
        }
        if (p063g2.f.m(uri)) {
            return 6;
        }
        if (p063g2.f.g(uri)) {
            return 7;
        }
        return p063g2.f.o(uri) ? 8 : -1;
    }

    public I2.b b() {
        return this.f5855l;
    }

    public EnumC0089b c() {
        return this.f5845b;
    }

    public int d() {
        return this.f5858o;
    }

    public int e() {
        return this.f5867x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (f5842y) {
            int i10 = this.f5844a;
            int i11 = bVar.f5844a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
        }
        if (this.f5850g == bVar.f5850g && this.f5859p == bVar.f5859p && this.f5860q == bVar.f5860q && i.a(this.f5846c, bVar.f5846c) && i.a(this.f5845b, bVar.f5845b) && i.a(this.f5866w, bVar.f5866w) && i.a(this.f5848e, bVar.f5848e) && i.a(this.f5855l, bVar.f5855l) && i.a(this.f5852i, bVar.f5852i) && i.a(this.f5853j, bVar.f5853j) && i.a(this.f5856m, bVar.f5856m) && i.a(this.f5857n, bVar.f5857n) && i.a(Integer.valueOf(this.f5858o), Integer.valueOf(bVar.f5858o)) && i.a(this.f5861r, bVar.f5861r) && i.a(this.f5864u, bVar.f5864u) && i.a(this.f5865v, bVar.f5865v) && i.a(this.f5854k, bVar.f5854k) && this.f5851h == bVar.f5851h) {
            d dVar = this.f5862s;
            S1.d dVarA = dVar != null ? dVar.a() : null;
            d dVar2 = bVar.f5862s;
            if (i.a(dVarA, dVar2 != null ? dVar2.a() : null) && this.f5867x == bVar.f5867x) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f5866w;
    }

    public EnumC0729n g() {
        return this.f5865v;
    }

    public I2.d h() {
        return this.f5852i;
    }

    public int hashCode() {
        boolean z9 = f5843z;
        int i10 = z9 ? this.f5844a : 0;
        if (i10 != 0) {
            return i10;
        }
        d dVar = this.f5862s;
        int iA = p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(p014b3.a.a(0, this.f5845b), this.f5846c), Boolean.valueOf(this.f5850g)), this.f5855l), this.f5856m), this.f5857n), Integer.valueOf(this.f5858o)), Boolean.valueOf(this.f5859p)), Boolean.valueOf(this.f5860q)), this.f5852i), this.f5861r), this.f5853j), this.f5854k), dVar != null ? dVar.a() : null), this.f5864u), this.f5865v), Integer.valueOf(this.f5867x)), Boolean.valueOf(this.f5851h));
        if (z9) {
            this.f5844a = iA;
        }
        return iA;
    }

    public boolean i() {
        return Build.VERSION.SDK_INT >= 29 && this.f5851h;
    }

    public boolean j() {
        return this.f5850g;
    }

    public c k() {
        return this.f5857n;
    }

    public d l() {
        return this.f5862s;
    }

    public int m() {
        g gVar = this.f5853j;
        if (gVar != null) {
            return gVar.f1617b;
        }
        return 2048;
    }

    public int n() {
        g gVar = this.f5853j;
        if (gVar != null) {
            return gVar.f1616a;
        }
        return 2048;
    }

    public f o() {
        return this.f5856m;
    }

    public boolean p() {
        return this.f5849f;
    }

    public Q2.e q() {
        return this.f5863t;
    }

    public g r() {
        return this.f5853j;
    }

    public Boolean s() {
        return this.f5864u;
    }

    public h t() {
        return this.f5854k;
    }

    public String toString() {
        return i.b(this).b("uri", this.f5846c).b("cacheChoice", this.f5845b).b("decodeOptions", this.f5852i).b("postprocessor", this.f5862s).b(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, this.f5856m).b("resizeOptions", this.f5853j).b("rotationOptions", this.f5854k).b("bytesRange", this.f5855l).b("resizingAllowedOverride", this.f5864u).b("downsampleOverride", this.f5865v).c("progressiveRenderingEnabled", this.f5849f).c("localThumbnailPreviewsEnabled", this.f5850g).c("loadThumbnailOnly", this.f5851h).b("lowestPermittedRequestLevel", this.f5857n).a("cachesDisabled", this.f5858o).c("isDiskCacheEnabled", this.f5859p).c("isMemoryCacheEnabled", this.f5860q).b("decodePrefetches", this.f5861r).a("delayMs", this.f5867x).toString();
    }

    public synchronized File u() {
        try {
            if (this.f5848e == null) {
                k.g(this.f5846c.getPath());
                this.f5848e = new File(this.f5846c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5848e;
    }

    public Uri v() {
        return this.f5846c;
    }

    public int w() {
        return this.f5847d;
    }

    public boolean y(int i10) {
        return (i10 & d()) == 0;
    }

    public Boolean z() {
        return this.f5861r;
    }
}
