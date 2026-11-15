package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class R7 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f36483c;

    public R7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f36483c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        try {
            return AbstractC6176c3.a(this.f36483c.call());
        } catch (Exception unused) {
            return InterfaceC6289p.f36808x;
        }
    }
}
