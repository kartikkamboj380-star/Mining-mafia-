package com.bytedance.sdk.openadsdk.sns;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static int bob = 1;
    public static int csi = 3;
    public static int fou = 2;
    public static int kq = -1;
    public static int oq;
    private int rhi = kq;
    private long rjo = 0;
    private long syt = 0;
    private final List<bob> dgq = new ArrayList();
    private long nn = 0;

    public void bob(long j10) {
        int i10;
        int i11 = this.rhi;
        if (i11 == kq || i11 == (i10 = fou) || i11 == csi) {
            return;
        }
        this.rhi = i10;
        this.nn = j10;
    }

    public void fou(long j10) {
        int i10 = this.rhi;
        if (i10 == kq || i10 != fou) {
            return;
        }
        this.rhi = bob;
        this.dgq.add(new bob(this.nn, j10));
        this.nn = 0L;
    }

    public void kq(long j10) {
        this.rhi = oq;
        this.rjo = j10;
    }

    public void oq(long j10) {
        int i10;
        int i11 = this.rhi;
        if (i11 == kq || i11 == (i10 = csi)) {
            return;
        }
        this.rhi = i10;
        this.syt = j10;
    }

    public long kq(long j10, long j11) {
        long j12;
        long j13;
        long jOq;
        long j14 = this.syt;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (bob bobVar : this.dgq) {
            if (bobVar.oq() > j10) {
                if (j10 < bobVar.kq()) {
                    j13 = i10;
                    jOq = bobVar.oq() - bobVar.kq();
                } else {
                    j13 = i10;
                    jOq = bobVar.oq() - j10;
                }
                i10 = (int) (j13 + jOq);
            }
        }
        long j15 = this.rjo;
        if (j15 < j10) {
            long j16 = this.nn;
            if (j16 == 0) {
                j16 = this.syt;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - ((long) i10);
        }
        long j17 = this.nn;
        if (j17 == 0) {
            j17 = this.syt;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - ((long) i10);
        return j12 - ((long) i10);
    }

    public int kq() {
        return this.rhi;
    }
}
