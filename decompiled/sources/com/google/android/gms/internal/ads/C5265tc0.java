package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5265tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5139sc0 f33430a = new C5139sc0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33435f;

    C5265tc0() {
    }

    public final void a() {
        this.f33433d++;
    }

    public final void b() {
        this.f33434e++;
    }

    public final void c() {
        this.f33431b++;
        this.f33430a.f33198a = true;
    }

    public final void d() {
        this.f33432c++;
        this.f33430a.f33199b = true;
    }

    public final void e() {
        this.f33435f++;
    }

    public final C5139sc0 f() {
        C5139sc0 c5139sc0 = this.f33430a;
        C5139sc0 c5139sc0Clone = c5139sc0.clone();
        c5139sc0.f33198a = false;
        c5139sc0.f33199b = false;
        return c5139sc0Clone;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f33433d + "\n\tNew pools created: " + this.f33431b + "\n\tPools removed: " + this.f33432c + "\n\tEntries added: " + this.f33435f + "\n\tNo entries retrieved: " + this.f33434e + "\n";
    }
}
