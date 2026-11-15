package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1521Bl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f17687a;

    public C1521Bl0(ExecutorService executorService) {
        this.f17687a = executorService;
    }

    public final AbstractC5031rl0 a(File file, InterfaceC5863yM0 interfaceC5863yM0, Function function) {
        return new C1469Al0(file, this.f17687a, new C5787xl0(interfaceC5863yM0), function);
    }

    public final AbstractC5031rl0 b(File file, byte[] bArr, Function function) {
        return new C1469Al0(file, this.f17687a, new C5283tl0(bArr), function);
    }
}
