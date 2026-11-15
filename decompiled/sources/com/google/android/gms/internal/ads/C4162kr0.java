package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4162kr0 implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4540nr0 f30891a;

    C4162kr0(C4540nr0 c4540nr0) {
        Objects.requireNonNull(c4540nr0);
        this.f30891a = c4540nr0;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z9) {
        C4540nr0 c4540nr0 = this.f30891a;
        synchronized (c4540nr0) {
            try {
                if (z9) {
                    c4540nr0.f(System.currentTimeMillis());
                    c4540nr0.i(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c4540nr0.g() > 0 && jCurrentTimeMillis >= c4540nr0.g()) {
                        c4540nr0.h(jCurrentTimeMillis - c4540nr0.g());
                    }
                    c4540nr0.i(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
