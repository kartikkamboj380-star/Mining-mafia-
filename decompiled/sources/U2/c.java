package U2;

import I2.f;
import I2.g;
import I2.h;
import J2.C0735u;
import J2.EnumC0729n;
import Q2.e;
import Y1.k;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f5878t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f5892n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5896r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f5879a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.c f5880b = b.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5881c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f5882d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f5883e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private I2.d f5884f = I2.d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.EnumC0089b f5885g = b.EnumC0089b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5886h = C0735u.J().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5887i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5888j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f5889k = f.HIGH;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f5890l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f5891m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private I2.b f5893o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f5894p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private EnumC0729n f5895q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f5897s = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c B(int i10) {
        this.f5881c = i10;
        if (this.f5885g != b.EnumC0089b.DYNAMIC) {
            this.f5897s = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return x(bVar.v()).F(bVar.h()).z(bVar.b()).A(bVar.c()).H(bVar.j()).G(bVar.i()).I(bVar.k()).B(bVar.d()).J(bVar.l()).K(bVar.p()).M(bVar.o()).N(bVar.r()).L(bVar.q()).P(bVar.t()).Q(bVar.z()).C(bVar.e()).D(bVar.f()).E(bVar.g()).O(bVar.s());
    }

    public static boolean s(Uri uri) {
        Set set = f5878t;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c x(Uri uri) {
        return new c().R(uri);
    }

    public c A(b.EnumC0089b enumC0089b) {
        this.f5885g = enumC0089b;
        return this;
    }

    public c C(int i10) {
        this.f5896r = i10;
        return this;
    }

    public c D(String str) {
        this.f5897s = str;
        return this;
    }

    public c E(EnumC0729n enumC0729n) {
        this.f5895q = enumC0729n;
        return this;
    }

    public c F(I2.d dVar) {
        this.f5884f = dVar;
        return this;
    }

    public c G(boolean z9) {
        this.f5888j = z9;
        return this;
    }

    public c H(boolean z9) {
        this.f5887i = z9;
        return this;
    }

    public c I(b.c cVar) {
        this.f5880b = cVar;
        return this;
    }

    public c J(d dVar) {
        this.f5890l = dVar;
        return this;
    }

    public c K(boolean z9) {
        this.f5886h = z9;
        return this;
    }

    public c L(e eVar) {
        this.f5892n = eVar;
        return this;
    }

    public c M(f fVar) {
        this.f5889k = fVar;
        return this;
    }

    public c N(g gVar) {
        this.f5882d = gVar;
        return this;
    }

    public c O(Boolean bool) {
        this.f5894p = bool;
        return this;
    }

    public c P(h hVar) {
        this.f5883e = hVar;
        return this;
    }

    public c Q(Boolean bool) {
        this.f5891m = bool;
        return this;
    }

    public c R(Uri uri) {
        k.g(uri);
        this.f5879a = uri;
        return this;
    }

    public Boolean S() {
        return this.f5891m;
    }

    protected void T() {
        Uri uri = this.f5879a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (p063g2.f.m(uri)) {
            if (!this.f5879a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f5879a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f5879a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (p063g2.f.h(this.f5879a) && !this.f5879a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public b a() {
        T();
        return new b(this);
    }

    public I2.b c() {
        return this.f5893o;
    }

    public b.EnumC0089b d() {
        return this.f5885g;
    }

    public int e() {
        return this.f5881c;
    }

    public int f() {
        return this.f5896r;
    }

    public String g() {
        return this.f5897s;
    }

    public EnumC0729n h() {
        return this.f5895q;
    }

    public I2.d i() {
        return this.f5884f;
    }

    public boolean j() {
        return this.f5888j;
    }

    public b.c k() {
        return this.f5880b;
    }

    public d l() {
        return this.f5890l;
    }

    public e m() {
        return this.f5892n;
    }

    public f n() {
        return this.f5889k;
    }

    public g o() {
        return this.f5882d;
    }

    public Boolean p() {
        return this.f5894p;
    }

    public h q() {
        return this.f5883e;
    }

    public Uri r() {
        return this.f5879a;
    }

    public boolean t() {
        if ((this.f5881c & 48) == 0) {
            return p063g2.f.n(this.f5879a) || s(this.f5879a);
        }
        return false;
    }

    public boolean u() {
        return this.f5887i;
    }

    public boolean v() {
        return (this.f5881c & 15) == 0;
    }

    public boolean w() {
        return this.f5886h;
    }

    public c y(boolean z9) {
        return z9 ? P(h.c()) : P(h.e());
    }

    public c z(I2.b bVar) {
        this.f5893o = bVar;
        return this;
    }
}
