package com.google.android.gms.internal.ads;

import I8.AbstractC0695t0;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1621Dj0 {
    public static final InterfaceC1517Bj0 a(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new InterfaceC1517Bj0() { // from class: com.google.android.gms.internal.ads.Cj0
            @Override // com.google.android.gms.internal.ads.InterfaceC1517Bj0
            public final /* synthetic */ I8.O zza() {
                return I8.P.a(AbstractC0695t0.c(executorService));
            }
        };
    }
}
