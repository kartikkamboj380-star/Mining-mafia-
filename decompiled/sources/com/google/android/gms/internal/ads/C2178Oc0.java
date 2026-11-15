package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2178Oc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21609a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21611c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2126Nc0 f21610b = new C2126Nc0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21612d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21613e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21614f = 0;

    public C2178Oc0() {
        long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
        this.f21609a = jCurrentTimeMillis;
        this.f21611c = jCurrentTimeMillis;
    }

    public final void a() {
        this.f21611c = G4.t.o().currentTimeMillis();
        this.f21612d++;
    }

    public final void b() {
        this.f21613e++;
        this.f21610b.f21296a = true;
    }

    public final void c() {
        this.f21614f++;
        this.f21610b.f21297b++;
    }

    public final long d() {
        return this.f21609a;
    }

    public final long e() {
        return this.f21611c;
    }

    public final int f() {
        return this.f21612d;
    }

    public final C2126Nc0 g() {
        C2126Nc0 c2126Nc0 = this.f21610b;
        C2126Nc0 c2126Nc0Clone = c2126Nc0.clone();
        c2126Nc0.f21296a = false;
        c2126Nc0.f21297b = 0;
        return c2126Nc0Clone;
    }

    public final String h() {
        return "Created: " + this.f21609a + " Last accessed: " + this.f21611c + " Accesses: " + this.f21612d + "\nEntries retrieved: Valid: " + this.f21613e + " Stale: " + this.f21614f;
    }
}
