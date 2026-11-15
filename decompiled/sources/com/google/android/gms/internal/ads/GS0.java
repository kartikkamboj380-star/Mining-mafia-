package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface GS0 {
    static boolean b(int i10, boolean z9) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z9 && i11 == 3;
        }
        return true;
    }

    String n();

    void p();

    int s(JY0 jy0);

    void w(FS0 fs0);

    int zza();

    int zzu();
}
