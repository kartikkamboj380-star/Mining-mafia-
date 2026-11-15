package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2449Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23596c;

    protected C2449Ti(String str, Object obj, int i10) {
        this.f23594a = str;
        this.f23595b = obj;
        this.f23596c = i10;
    }

    public static C2449Ti a(String str, boolean z9) {
        return new C2449Ti(str, Boolean.valueOf(z9), 1);
    }

    public static C2449Ti b(String str, long j10) {
        return new C2449Ti(str, Long.valueOf(j10), 2);
    }

    public static C2449Ti c(String str, double d10) {
        return new C2449Ti(str, Double.valueOf(d10), 3);
    }

    public static C2449Ti d(String str, String str2) {
        return new C2449Ti("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object e() {
        InterfaceC1464Aj interfaceC1464AjA = AbstractC1568Cj.a();
        if (interfaceC1464AjA == null) {
            AbstractC1568Cj.b();
            return this.f23595b;
        }
        int i10 = this.f23596c - 1;
        if (i10 == 0) {
            return interfaceC1464AjA.d(this.f23594a, ((Boolean) this.f23595b).booleanValue());
        }
        if (i10 != 1) {
            return i10 != 2 ? interfaceC1464AjA.a(this.f23594a, (String) this.f23595b) : interfaceC1464AjA.c(this.f23594a, ((Double) this.f23595b).doubleValue());
        }
        return interfaceC1464AjA.b(this.f23594a, ((Long) this.f23595b).longValue());
    }
}
