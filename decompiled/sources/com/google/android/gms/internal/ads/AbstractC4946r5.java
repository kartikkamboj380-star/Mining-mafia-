package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4946r5 {
    public static void a(InterfaceC5198t5 interfaceC5198t5, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        for (int i10 = 0; i10 < interfaceC5198t5.zza(); i10++) {
            long jB = interfaceC5198t5.b(i10);
            List listA = interfaceC5198t5.a(jB);
            if (!listA.isEmpty()) {
                if (i10 == interfaceC5198t5.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jB2 = interfaceC5198t5.b(i10 + 1) - interfaceC5198t5.b(i10);
                if (jB2 > 0) {
                    interfaceC3977jO.zza(new C4695p5(listA, jB, jB2));
                }
            }
        }
    }
}
