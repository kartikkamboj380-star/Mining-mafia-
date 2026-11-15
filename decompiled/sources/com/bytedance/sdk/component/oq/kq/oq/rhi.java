package com.bytedance.sdk.component.oq.kq.oq;

/* JADX INFO: loaded from: classes.dex */
final class rhi {
    static csi kq;
    static long oq;

    private rhi() {
    }

    static csi kq() {
        synchronized (rhi.class) {
            csi csiVar = kq;
            if (csiVar == null) {
                return new csi();
            }
            kq = csiVar.rhi;
            csiVar.rhi = null;
            oq -= 8192;
            return csiVar;
        }
    }

    static void kq(csi csiVar) {
        if (csiVar.rhi == null && csiVar.rjo == null) {
            if (csiVar.fou) {
                return;
            }
            synchronized (rhi.class) {
                try {
                    long j10 = oq;
                    if (j10 + 8192 > 65536) {
                        return;
                    }
                    oq = j10 + 8192;
                    csiVar.rhi = kq;
                    csiVar.bob = 0;
                    csiVar.oq = 0;
                    kq = csiVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
