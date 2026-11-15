package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6612q2 extends B3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f38271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6598o2 f38274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6598o2 f38275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6598o2 f38276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6598o2 f38277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C6598o2 f38278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6598o2 f38279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6598o2 f38280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C6598o2 f38281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C6598o2 f38282n;

    C6612q2(X2 x10) {
        super(x10);
        this.f38271c = (char) 0;
        this.f38272d = -1L;
        this.f38274f = new C6598o2(this, 6, false, false);
        this.f38275g = new C6598o2(this, 6, true, false);
        this.f38276h = new C6598o2(this, 6, false, true);
        this.f38277i = new C6598o2(this, 5, false, false);
        this.f38278j = new C6598o2(this, 5, true, false);
        this.f38279k = new C6598o2(this, 5, false, true);
        this.f38280l = new C6598o2(this, 4, false, false);
        this.f38281m = new C6598o2(this, 3, false, false);
        this.f38282n = new C6598o2(this, 2, false, false);
    }

    static String A(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z9, obj);
        String strB2 = B(z9, obj2);
        String strB3 = B(z9, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    static String B(boolean z9, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z9) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C6605p2) {
                return ((C6605p2) obj).a();
            }
            return z9 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z9 ? th.getClass().getName() : th.toString());
        String strC = C(X2.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    static String C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new C6605p2(str);
    }

    final /* synthetic */ char D() {
        return this.f38271c;
    }

    final /* synthetic */ void E(char c10) {
        this.f38271c = c10;
    }

    final /* synthetic */ long F() {
        return this.f38272d;
    }

    final /* synthetic */ void G(long j10) {
        this.f38272d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return false;
    }

    public final C6598o2 o() {
        return this.f38274f;
    }

    public final C6598o2 p() {
        return this.f38275g;
    }

    public final C6598o2 q() {
        return this.f38276h;
    }

    public final C6598o2 r() {
        return this.f38277i;
    }

    public final C6598o2 s() {
        return this.f38278j;
    }

    public final C6598o2 t() {
        return this.f38279k;
    }

    public final C6598o2 u() {
        return this.f38280l;
    }

    public final C6598o2 v() {
        return this.f38281m;
    }

    public final C6598o2 w() {
        return this.f38282n;
    }

    protected final void y(int i10, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z9 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z10 || i10 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        T2 t2A = this.f37374a.A();
        if (t2A == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!t2A.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            t2A.t(new RunnableC6591n2(this, i10, str, obj, obj2, obj3));
        }
    }

    protected final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f38273e == null) {
                    this.f38273e = this.f37374a.w().u();
                }
                Preconditions.checkNotNull(this.f38273e);
                str = this.f38273e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
