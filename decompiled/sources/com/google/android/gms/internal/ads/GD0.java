package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GD0 extends RuntimeException {
    public GD0(String str) {
        super(str);
    }

    public static Object a(FD0 fd0) {
        try {
            return fd0.zza();
        } catch (Exception e10) {
            throw new GD0(e10);
        }
    }

    public GD0(String str, Throwable th) {
        super(str, th);
    }

    public GD0(Throwable th) {
        super(th);
    }
}
