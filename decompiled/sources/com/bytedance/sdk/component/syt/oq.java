package com.bytedance.sdk.component.syt;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.nze;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: loaded from: classes.dex */
class oq implements Comparable, Runnable {
    private long bob;
    private Thread fou = null;
    private syt kq;
    private kq oq;

    public oq(syt sytVar, kq kqVar) {
        this.bob = 0L;
        this.kq = sytVar;
        this.oq = kqVar;
        this.bob = SystemClock.uptimeMillis();
    }

    private void kq(String str, String str2, long j10) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof oq) {
            return this.kq.compareTo(((oq) obj).kq());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        syt sytVar;
        return (obj instanceof oq) && (sytVar = this.kq) != null && sytVar.equals(((oq) obj).kq());
    }

    public int hashCode() {
        return this.kq.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.fou = Thread.currentThread();
        syt sytVar = this.kq;
        if (sytVar != null) {
            sytVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.oq != null) {
            fou.kq();
        }
        if (nze.kq()) {
            kq kqVar = this.oq;
            if (kqVar != null) {
                kqVar.kq();
            }
            syt sytVar2 = this.kq;
            if (sytVar2 != null) {
                sytVar2.getName();
            }
            String strKq = this.oq.kq();
            strKq.getClass();
            byte b10 = -1;
            switch (strKq.hashCode()) {
                case 3107:
                    if (strKq.equals("ad")) {
                        b10 = 0;
                    }
                    break;
                case 3366:
                    if (strKq.equals("io")) {
                        b10 = 1;
                    }
                    break;
                case 107332:
                    if (strKq.equals("log")) {
                        b10 = 2;
                    }
                    break;
                case 3237136:
                    if (strKq.equals("init")) {
                        b10 = 3;
                    }
                    break;
                case 212371911:
                    if (strKq.equals("computation")) {
                        b10 = 4;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        kq kqVar2 = this.oq;
                        String strKq2 = kqVar2 != null ? kqVar2.kq() : "null";
                        syt sytVar3 = this.kq;
                        kq(strKq2, sytVar3 != null ? sytVar3.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
                        kq kqVar3 = this.oq;
                        String strKq3 = kqVar3 != null ? kqVar3.kq() : "null";
                        syt sytVar4 = this.kq;
                        kq(strKq3, sytVar4 != null ? sytVar4.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        kq kqVar4 = this.oq;
                        String strKq4 = kqVar4 != null ? kqVar4.kq() : "null";
                        syt sytVar5 = this.kq;
                        kq(strKq4, sytVar5 != null ? sytVar5.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        kq kqVar5 = this.oq;
                        String strKq5 = kqVar5 != null ? kqVar5.kq() : "null";
                        syt sytVar6 = this.kq;
                        kq(strKq5, sytVar6 != null ? sytVar6.getName() : "null", jUptimeMillis2);
                    }
                    break;
            }
        }
    }

    public syt kq() {
        return this.kq;
    }
}
