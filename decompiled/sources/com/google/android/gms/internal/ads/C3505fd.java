package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3505fd implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3757hd f28450a;

    C3505fd(C3757hd c3757hd) {
        Objects.requireNonNull(c3757hd);
        this.f28450a = c3757hd;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z9) {
        if (z9) {
            C3757hd c3757hd = this.f28450a;
            c3757hd.e(System.currentTimeMillis());
            c3757hd.h(true);
            return;
        }
        C3757hd c3757hd2 = this.f28450a;
        long jF = c3757hd2.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jF > 0 && jCurrentTimeMillis >= c3757hd2.f()) {
            c3757hd2.g(jCurrentTimeMillis - c3757hd2.f());
        }
        c3757hd2.h(false);
    }
}
