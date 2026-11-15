package com.bytedance.adsdk.oq;

/* JADX INFO: loaded from: classes.dex */
public enum gm {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.gm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[gm.values().length];
            kq = iArr;
            try {
                iArr[gm.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[gm.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[gm.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean kq(int i10, boolean z9, int i11) {
        int i12 = AnonymousClass1.kq[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z9 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
