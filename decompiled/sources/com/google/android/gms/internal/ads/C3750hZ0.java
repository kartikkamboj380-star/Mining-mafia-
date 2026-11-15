package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3750hZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f29018a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29019b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1961Jx0 f29020c;

    public C3750hZ0(O1 o10, InterfaceC5576w5 interfaceC5576w5) {
    }

    public final void a(InterfaceC1961Jx0 interfaceC1961Jx0) {
        if (interfaceC1961Jx0 != this.f29020c) {
            this.f29020c = interfaceC1961Jx0;
            this.f29018a.clear();
            this.f29019b.clear();
        }
    }
}
