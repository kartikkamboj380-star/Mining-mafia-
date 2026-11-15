package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2026Le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3007bf f20565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4011jf f20566f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20574n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f20567g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f20568h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList f20569i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList f20570j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20571k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20572l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20573m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f20575o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f20576p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f20577q = "";

    public C2026Le(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        this.f20561a = i10;
        this.f20562b = i11;
        this.f20563c = i12;
        this.f20564d = z9;
        this.f20565e = new C3007bf(i13);
        this.f20566f = new C4011jf(i14, i15, i16);
    }

    private final void m(String str, boolean z9, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f20563c) {
                return;
            }
            synchronized (this.f20567g) {
                try {
                    this.f20568h.add(str);
                    this.f20571k += str.length();
                    if (z9) {
                        ArrayList arrayList = this.f20569i;
                        arrayList.add(str);
                        this.f20570j.add(new C2649Xe(f10, f11, f12, f13, arrayList.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String n(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb.append((String) arrayList.get(i11));
            sb.append(' ');
            i11++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f20567g) {
            z9 = this.f20573m == 0;
        }
        return z9;
    }

    public final String b() {
        return this.f20575o;
    }

    public final String c() {
        return this.f20577q;
    }

    public final void d() {
        synchronized (this.f20567g) {
            this.f20573m--;
        }
    }

    public final void e() {
        synchronized (this.f20567g) {
            this.f20573m++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2026Le)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C2026Le) obj).f20575o;
        return str != null && str.equals(this.f20575o);
    }

    public final void f(String str, boolean z9, float f10, float f11, float f12, float f13) {
        m(str, z9, f10, f11, f12, f13);
        synchronized (this.f20567g) {
            try {
                if (this.f20573m < 0) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.a("ActivityContent: negative number of WebViews.");
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, boolean z9, float f10, float f11, float f12, float f13) {
        m(str, z9, f10, f11, f12, f13);
    }

    public final void h() {
        synchronized (this.f20567g) {
            try {
                int iJ = j(this.f20571k, this.f20572l);
                if (iJ > this.f20574n) {
                    this.f20574n = iJ;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int hashCode() {
        return this.f20575o.hashCode();
    }

    public final void i() {
        synchronized (this.f20567g) {
            try {
                int iJ = j(this.f20571k, this.f20572l);
                if (iJ > this.f20574n) {
                    this.f20574n = iJ;
                    if (!G4.t.l().r().zzc()) {
                        C3007bf c3007bf = this.f20565e;
                        this.f20575o = c3007bf.a(this.f20568h);
                        this.f20576p = c3007bf.a(this.f20569i);
                    }
                    if (!G4.t.l().r().zze()) {
                        this.f20577q = this.f20566f.a(this.f20569i, this.f20570j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final int j(int i10, int i11) {
        return this.f20564d ? this.f20562b : (i10 * this.f20561a) + (i11 * this.f20562b);
    }

    public final void k(int i10) {
        this.f20572l = i10;
    }

    final int l() {
        return this.f20571k;
    }

    public final String toString() {
        ArrayList arrayList = this.f20568h;
        int i10 = this.f20572l;
        int i11 = this.f20574n;
        int i12 = this.f20571k;
        String strN = n(arrayList, 100);
        String strN2 = n(this.f20569i, 100);
        String str = this.f20575o;
        String str2 = this.f20576p;
        String str3 = this.f20577q;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i11).length();
        int length3 = String.valueOf(i12).length();
        int length4 = String.valueOf(strN).length();
        int length5 = String.valueOf(strN2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i10);
        sb.append(" score:");
        sb.append(i11);
        sb.append(" total_length:");
        sb.append(i12);
        sb.append("\n text: ");
        sb.append(strN);
        sb.append("\n viewableText");
        sb.append(strN2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
