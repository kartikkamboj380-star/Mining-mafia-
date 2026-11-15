package com.bytedance.sdk.openadsdk.fax.kq.oq;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.bob;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.vvw;
import com.bytedance.sdk.openadsdk.mxq.kq.fou;
import com.bytedance.sdk.openadsdk.mxq.oq;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile kq dgq;
    private final AtomicBoolean kq = new AtomicBoolean(false);
    private volatile Boolean oq = null;
    private AtomicLong bob = new AtomicLong(0);
    private int fou = 0;
    private String csi = "";
    private final CountDownLatch rhi = new CountDownLatch(1);
    private volatile boolean rjo = false;
    private String syt = "";

    private kq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fou() {
        if (this.oq == null) {
            synchronized (this) {
                try {
                    if (this.oq == null) {
                        this.oq = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= ubx.bob().kq("gid_status", 100));
                        if (this.oq.booleanValue()) {
                            try {
                                this.syt = ebt.kq();
                            } catch (Throwable unused) {
                                this.syt = BuildConfig.FLAVOR;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.oq.booleanValue();
    }

    public boolean bob() {
        return ubx.bob().ibd("gaid");
    }

    public String oq() {
        if (!bob()) {
            return "";
        }
        if (sns.fou().ldy() != 1) {
            return this.csi;
        }
        if (nz.rhi()) {
            return this.csi;
        }
        if (!this.rjo) {
            try {
                this.rhi.await(4L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            } finally {
                this.rjo = true;
                this.rhi.countDown();
            }
        }
        return this.csi;
    }

    public static kq kq() {
        if (dgq == null) {
            synchronized (kq.class) {
                try {
                    if (dgq == null) {
                        dgq = new kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dgq;
    }

    public void kq(boolean z9) {
        if (bob()) {
            if (this.fou == 1 || !TextUtils.isEmpty(this.csi)) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z9 || this.bob.get() <= jElapsedRealtime) {
                this.bob.set(jElapsedRealtime + 300000);
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                nz.kq(new syt("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.fax.kq.oq.kq.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.bob] */
                    /* JADX WARN: Type inference failed for: r4v0 */
                    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                    /* JADX WARN: Type inference failed for: r4v3 */
                    /* JADX WARN: Type inference failed for: r4v4 */
                    /* JADX WARN: Type inference failed for: r4v5 */
                    /* JADX WARN: Type inference failed for: r4v6 */
                    @Override // java.lang.Runnable
                    public void run() {
                        ?? r10;
                        boolean zIsLimitAdTrackingEnabled;
                        try {
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(sns.kq());
                            if (advertisingIdInfo != null) {
                                zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                                if (zIsLimitAdTrackingEnabled) {
                                    kq.this.fou = 1;
                                    kq.this.kq(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                r10 = zIsLimitAdTrackingEnabled;
                                if (!kq.this.bob()) {
                                    kq.this.kq(1, "not in privacy fields allowed", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else if (!zIsLimitAdTrackingEnabled) {
                                    String id = advertisingIdInfo.getId();
                                    String str = kq.this.csi;
                                    if (TextUtils.isEmpty(id)) {
                                        kq.this.kq(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    } else {
                                        kq.this.csi = id;
                                        kq.this.kq(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    }
                                    r10 = zIsLimitAdTrackingEnabled;
                                    if (!str.equals(id)) {
                                        vvw.kq();
                                    }
                                }
                            } else {
                                r10 = -1;
                            }
                            if (r10 != -1) {
                                r10 = zIsLimitAdTrackingEnabled;
                                r10 = zIsLimitAdTrackingEnabled;
                                bob.kq().kq("limit_ad_track", r10);
                            }
                        } catch (Throwable th) {
                            try {
                                kq.this.fou = 2;
                                kq.this.kq(3, th, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                fax.bob("AdvertisingIdHelper", th.getMessage());
                            } finally {
                                kq.this.rjo = true;
                                kq.this.rhi.countDown();
                                com.bytedance.sdk.openadsdk.core.nn.bob.kq(kq.this.csi);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!this.kq.getAndSet(true)) {
            kq(1, "not in privacy fields allowed", 0L);
        }
        this.rjo = true;
        this.rhi.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oq(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void kq(JSONObject jSONObject) {
        if (!bob() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", oq());
        } catch (JSONException unused) {
        }
    }

    public void kq(boolean z9, long j10) {
        kq(z9, 0, "", null, j10);
    }

    public void kq(int i10, String str, long j10) {
        kq(false, i10, str, null, j10);
    }

    public void kq(int i10, Throwable th, long j10) {
        kq(false, i10, "", th, j10);
    }

    public void kq(final boolean z9, final int i10, final String str, final Throwable th, final long j10) {
        if ((this.oq == null || this.oq.booleanValue()) && sns.kq() != null) {
            sns.csi().kq(new oq() { // from class: com.bytedance.sdk.openadsdk.fax.kq.oq.kq.2
                @Override // com.bytedance.sdk.openadsdk.mxq.oq
                public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                    if (!kq.this.fou()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", kq.this.syt);
                    jSONObject.put("is_success", z9);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? kq.oq(th) : str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("has_setting", ubx.bob().rhg() > 0);
                    return fou.oq().kq("gid_status").oq(jSONObject.toString());
                }
            }, false);
        }
    }
}
