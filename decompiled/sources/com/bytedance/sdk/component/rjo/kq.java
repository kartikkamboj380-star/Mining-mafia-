package com.bytedance.sdk.component.rjo;

import android.os.Bundle;
import com.bytedance.sdk.component.oq.kq.kq.kq.csi;
import com.bytedance.sdk.component.oq.kq.syt;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.rjo.bob.bob;
import com.bytedance.sdk.component.rjo.oq.fou;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static csi kq;
    private ubx oq;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.rjo.kq$kq, reason: collision with other inner class name */
    public static final class C0255kq {
        private Set<String> csi;
        private Bundle rhi;
        final List<syt> fou = new ArrayList();
        int kq = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        int oq = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        int bob = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;

        public C0255kq bob(long j10, TimeUnit timeUnit) {
            this.bob = kq("timeout", j10, timeUnit);
            return this;
        }

        public C0255kq kq(boolean z9) {
            return this;
        }

        public C0255kq oq(long j10, TimeUnit timeUnit) {
            this.oq = kq("timeout", j10, timeUnit);
            return this;
        }

        public C0255kq kq(long j10, TimeUnit timeUnit) {
            this.kq = kq("timeout", j10, timeUnit);
            return this;
        }

        public C0255kq kq(syt sytVar) {
            this.fou.add(sytVar);
            return this;
        }

        private static int kq(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(str + " too small.");
            }
            throw new NullPointerException("unit == null");
        }

        public kq kq() {
            return new kq(this);
        }
    }

    public static boolean csi() {
        csi csiVar = kq;
        if (csiVar == null) {
            return false;
        }
        return csiVar.kq();
    }

    public static void kq() {
        bob.kq(bob.kq.DEBUG);
    }

    public com.bytedance.sdk.component.rjo.oq.oq bob() {
        return new com.bytedance.sdk.component.rjo.oq.oq(this.oq);
    }

    public com.bytedance.sdk.component.rjo.oq.kq fou() {
        return new com.bytedance.sdk.component.rjo.oq.kq(this.oq);
    }

    public fou oq() {
        return new fou(this.oq);
    }

    public ubx rhi() {
        return this.oq;
    }

    private kq(C0255kq c0255kq) {
        ubx.kq kqVar = new ubx.kq();
        long j10 = c0255kq.kq;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ubx.kq kqVarOq = kqVar.kq(j10, timeUnit).bob(c0255kq.bob, timeUnit).oq(c0255kq.oq, timeUnit);
        List<syt> list = c0255kq.fou;
        if (list != null && list.size() > 0) {
            Iterator<syt> it = c0255kq.fou.iterator();
            while (it.hasNext()) {
                kqVarOq.kq(it.next());
            }
        }
        if (c0255kq.rhi != null) {
            Bundle unused = c0255kq.rhi;
        }
        Set unused2 = c0255kq.csi;
        this.oq = kqVarOq.kq();
    }

    public static void kq(csi csiVar) {
        kq = csiVar;
    }
}
