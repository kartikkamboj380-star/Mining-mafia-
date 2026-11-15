package B4;

import H4.C0654z;
import H4.m2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f226i = new f(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f227j = new f(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f228k = new f(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f229l = new f(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f230m = new f(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f231n = new f(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f232o = new f(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f233p = new f(-3, -4, "fluid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f234q = new f(0, 0, "invalid");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f235r = new f(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f243h;

    static {
        new f(-3, 0, "search_v2");
    }

    public f(int i10, int i11) {
        String strValueOf = i10 == -1 ? "FULL" : String.valueOf(i10);
        String strValueOf2 = i11 == -2 ? "AUTO" : String.valueOf(i11);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + 3);
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(i10, i11, sb.toString());
    }

    public static f a(Context context, int i10) {
        f fVarS = L4.g.s(context, i10, 50, 0);
        fVarS.f239d = true;
        return fVarS;
    }

    public static f b(Context context, int i10) {
        int iY = L4.g.y(context, 0);
        if (iY == -1) {
            return f234q;
        }
        f fVar = new f(i10, 0);
        fVar.f241f = iY;
        fVar.f240e = true;
        return fVar;
    }

    public static f e(int i10, int i11) {
        f fVar = new f(i10, 0);
        fVar.f241f = i11;
        fVar.f240e = true;
        if (i11 < 32) {
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 118);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i11);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            L4.p.f(sb.toString());
        }
        return fVar;
    }

    public int c() {
        return this.f237b;
    }

    public int d(Context context) {
        int i10 = this.f237b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return m2.a(context.getResources().getDisplayMetrics());
        }
        C0654z.a();
        return L4.g.c(context, i10);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f236a == fVar.f236a && this.f237b == fVar.f237b && this.f238c.equals(fVar.f238c);
    }

    public int f() {
        return this.f236a;
    }

    public int g(Context context) {
        int i10 = this.f236a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            C0654z.a();
            return L4.g.c(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<m2> creator = m2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean h() {
        return this.f236a == -3 && this.f237b == -4;
    }

    public int hashCode() {
        return this.f238c.hashCode();
    }

    final boolean i() {
        return this.f239d;
    }

    final boolean j() {
        return this.f240e;
    }

    final void k(boolean z9) {
        this.f240e = true;
    }

    final void l(int i10) {
        this.f241f = i10;
    }

    final int m() {
        return this.f241f;
    }

    final boolean n() {
        return this.f242g;
    }

    final void o(boolean z9) {
        this.f242g = true;
    }

    final int p() {
        return this.f243h;
    }

    final void q(int i10) {
        this.f243h = i10;
    }

    public String toString() {
        return this.f238c;
    }

    f(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 26);
            sb.append("Invalid width for AdSize: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 27);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f236a = i10;
        this.f237b = i11;
        this.f238c = str;
    }
}
