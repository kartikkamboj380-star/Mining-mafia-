package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends W8.b implements Y8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f7223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y8.b f7224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f7225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y8.e[] f7226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a9.b f7227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y8.d f7228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7231i;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7232a;

        static {
            int[] iArr = new int[D.values().length];
            try {
                iArr[D.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7232a = iArr;
        }
    }

    public y(g composer, Y8.b json, D mode, Y8.e[] eVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f7223a = composer;
        this.f7224b = json;
        this.f7225c = mode;
        this.f7226d = eVarArr;
        this.f7227e = n().d();
        this.f7228f = n().c();
        int iOrdinal = mode.ordinal();
        if (eVarArr != null) {
            Y8.e eVar = eVarArr[iOrdinal];
            if (eVar == null && eVar == this) {
                return;
            }
            eVarArr[iOrdinal] = this;
        }
    }

    private final void u(String str, String str2) {
        this.f7223a.c();
        r(str);
        this.f7223a.e(':');
        this.f7223a.m();
        r(str2);
    }

    @Override // W8.f
    public W8.d a(V8.d descriptor) {
        Y8.e eVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D dB = E.b(n(), descriptor);
        char c10 = dB.f7182a;
        if (c10 != 0) {
            this.f7223a.e(c10);
            this.f7223a.b();
        }
        String str = this.f7230h;
        if (str != null) {
            String strH = this.f7231i;
            if (strH == null) {
                strH = descriptor.h();
            }
            u(str, strH);
            this.f7230h = null;
            this.f7231i = null;
        }
        if (this.f7225c == dB) {
            return this;
        }
        Y8.e[] eVarArr = this.f7226d;
        return (eVarArr == null || (eVar = eVarArr[dB.ordinal()]) == null) ? new y(this.f7223a, n(), dB, this.f7226d) : eVar;
    }

    @Override // W8.d
    public void b(V8.d descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f7225c.f7183b != 0) {
            this.f7223a.n();
            this.f7223a.d();
            this.f7223a.e(this.f7225c.f7183b);
        }
    }

    @Override // W8.f
    public void c(double d10) {
        if (this.f7229g) {
            r(String.valueOf(d10));
        } else {
            this.f7223a.f(d10);
        }
        if (this.f7228f.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw q.a(Double.valueOf(d10), this.f7223a.f7195a.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    @Override // W8.b, W8.f
    public void e(T8.e serializer, Object obj) {
        String strA;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (n().c().p()) {
            serializer.c(this, obj);
            return;
        }
        int i10 = w.a.f7212a[n().c().f().ordinal()];
        if (i10 == 1 || i10 == 2) {
            strA = null;
        } else {
            if (i10 != 3) {
                throw new p129m8.k();
            }
            V8.f kind = serializer.a().getKind();
            if (Intrinsics.b(kind, V8.g.a.f6152a) || Intrinsics.b(kind, V8.g.d.f6155a)) {
                strA = w.a(serializer.a(), n());
            } else {
                strA = null;
            }
        }
        if (strA != null) {
            String strH = serializer.a().h();
            this.f7230h = strA;
            this.f7231i = strH;
        }
        serializer.c(this, obj);
    }

    @Override // W8.d
    public boolean f(V8.d descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f7228f.i();
    }

    @Override // W8.b, W8.f
    public void h(long j10) {
        if (this.f7229g) {
            r(String.valueOf(j10));
        } else {
            this.f7223a.h(j10);
        }
    }

    @Override // W8.f
    public void i() {
        this.f7223a.i("null");
    }

    @Override // W8.f
    public void j(boolean z9) {
        if (this.f7229g) {
            r(String.valueOf(z9));
        } else {
            this.f7223a.j(z9);
        }
    }

    @Override // Y8.e
    public Y8.b n() {
        return this.f7224b;
    }

    @Override // W8.b, W8.f
    public void o(int i10) {
        if (this.f7229g) {
            r(String.valueOf(i10));
        } else {
            this.f7223a.g(i10);
        }
    }

    @Override // W8.b, W8.d
    public void q(V8.d descriptor, int i10, T8.e serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f7228f.j()) {
            super.q(descriptor, i10, serializer, obj);
        }
    }

    @Override // W8.b, W8.f
    public void r(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7223a.k(value);
    }

    @Override // W8.b
    public boolean s(V8.d descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = a.f7232a[this.f7225c.ordinal()];
        if (i11 != 1) {
            boolean z9 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f7223a.a()) {
                        this.f7223a.e(',');
                    }
                    this.f7223a.c();
                    r(s.g(descriptor, n(), i10));
                    this.f7223a.e(':');
                    this.f7223a.m();
                } else {
                    if (i10 == 0) {
                        this.f7229g = true;
                    }
                    if (i10 == 1) {
                        this.f7223a.e(',');
                        this.f7223a.m();
                        this.f7229g = false;
                    }
                }
            } else if (this.f7223a.a()) {
                this.f7229g = true;
                this.f7223a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f7223a.e(',');
                    this.f7223a.c();
                    z9 = true;
                } else {
                    this.f7223a.e(':');
                    this.f7223a.m();
                }
                this.f7229g = z9;
            }
        } else {
            if (!this.f7223a.a()) {
                this.f7223a.e(',');
            }
            this.f7223a.c();
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(l output, Y8.b json, D mode, Y8.e[] modeReuseCache) {
        this(i.a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
