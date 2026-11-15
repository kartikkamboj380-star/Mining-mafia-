package com.bytedance.sdk.openadsdk.core.syt;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile long bob;
    private static volatile kq kq;
    private static volatile boolean oq;
    private Handler csi;
    private final Queue<C0275kq> fou = new LinkedList();
    private final ubx rhi = sns.fou();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.syt.kq$kq, reason: collision with other inner class name */
    private static class C0275kq {
        private final long kq;
        private final String oq;

        private C0275kq(long j10, String str) {
            this.kq = j10;
            this.oq = str;
        }
    }

    private kq() {
    }

    private synchronized boolean oq(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iKtb = this.rhi.ktb();
        long jZfx = this.rhi.zfx();
        if (this.fou.size() <= 0 || this.fou.size() < iKtb) {
            this.fou.offer(new C0275kq(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.fou.peek().kq);
            if (jAbs <= jZfx) {
                oq(jZfx - jAbs);
                return true;
            }
            this.fou.poll();
            this.fou.offer(new C0275kq(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String bob() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0275kq c0275kq : this.fou) {
                if (map.containsKey(c0275kq.oq)) {
                    map.put(c0275kq.oq, Integer.valueOf(((Integer) map.get(c0275kq.oq)).intValue() + 1));
                } else {
                    map.put(c0275kq.oq, 1);
                }
            }
            str = "";
            int i10 = LinearLayoutManager.INVALID_OFFSET;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static kq kq() {
        if (kq == null) {
            synchronized (kq.class) {
                try {
                    if (kq == null) {
                        kq = new kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public synchronized boolean kq(String str) {
        try {
            if (oq(str)) {
                kq(true);
                kq(bob);
            } else {
                kq(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return oq;
    }

    private synchronized void kq(long j10) {
        try {
            if (this.csi == null) {
                this.csi = new Handler(Looper.getMainLooper());
            }
            this.csi.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syt.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.kq(false);
                }
            }, j10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean oq() {
        return oq;
    }

    private synchronized void oq(long j10) {
        bob = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kq(boolean z9) {
        oq = z9;
    }
}
