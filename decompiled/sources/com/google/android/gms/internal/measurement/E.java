package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class E implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6157a2 f36267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36268b;

    public E(C6157a2 c6157a2, String str) {
        this.f36267a = c6157a2;
        this.f36268b = str;
    }

    @Override // com.google.android.gms.internal.measurement.G
    public final C6157a2 a(InterfaceC6289p interfaceC6289p) {
        C6157a2 c6157a2C = this.f36267a.c();
        c6157a2C.g(this.f36268b, interfaceC6289p);
        return c6157a2C;
    }
}
