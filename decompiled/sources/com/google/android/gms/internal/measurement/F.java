package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class F implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6157a2 f36271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36272b;

    public F(C6157a2 c6157a2, String str) {
        this.f36271a = c6157a2;
        this.f36272b = str;
    }

    @Override // com.google.android.gms.internal.measurement.G
    public final C6157a2 a(InterfaceC6289p interfaceC6289p) {
        C6157a2 c6157a2C = this.f36271a.c();
        c6157a2C.f(this.f36272b, interfaceC6289p);
        return c6157a2C;
    }
}
