package com.bytedance.sdk.openadsdk.fou;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private long bob;
    private long csi;
    private long fou;
    private long kq;
    private long oq;

    public void bob(long j10) {
        if (this.bob <= 0) {
            this.bob = j10;
        }
    }

    public void csi(long j10) {
        if (this.csi <= 0) {
            this.csi = j10;
        }
    }

    public void fou(long j10) {
        if (this.fou <= 0) {
            this.fou = j10;
        }
    }

    public void kq(long j10) {
        if (this.kq <= 0) {
            this.kq = j10;
        }
    }

    public void oq(long j10) {
        if (this.oq <= 0) {
            this.oq = j10;
        }
    }

    public boolean kq() {
        return this.kq > 0;
    }

    public JSONObject oq() {
        return kq((JSONObject) null);
    }

    public void kq(long j10, float f10) {
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kq(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            kq(j10);
            oq(j10);
        }
        if (d10 >= 0.5d) {
            kq(j10);
            oq(j10);
            bob(j10);
        }
        if (d10 >= 0.75d) {
            kq(j10);
            oq(j10);
            bob(j10);
            fou(j10);
        }
        if (f10 >= 1.0f) {
            kq(j10);
            oq(j10);
            bob(j10);
            fou(j10);
            csi(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject kq(JSONObject jSONObject) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j10 = this.kq;
                if (j10 > 0) {
                    jSONObject.put("show_start", j10);
                    j11 = this.oq;
                    if (j11 > 0) {
                        jSONObject.put("show_firstQuartile", j11);
                        j12 = this.bob;
                        if (j12 > 0) {
                            jSONObject.put("show_mid", j12);
                            j13 = this.fou;
                            if (j13 > 0) {
                                jSONObject.put("show_thirdQuartile", j13);
                                j14 = this.csi;
                                if (j14 > 0) {
                                    jSONObject.put("show_full", j14);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j10 = this.kq;
            if (j10 > 0) {
                jSONObject.put("show_start", j10);
                j11 = this.oq;
                if (j11 > 0) {
                    jSONObject.put("show_firstQuartile", j11);
                    j12 = this.bob;
                    if (j12 > 0) {
                        jSONObject.put("show_mid", j12);
                        j13 = this.fou;
                        if (j13 > 0) {
                            jSONObject.put("show_thirdQuartile", j13);
                            j14 = this.csi;
                            if (j14 > 0) {
                                jSONObject.put("show_full", j14);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
