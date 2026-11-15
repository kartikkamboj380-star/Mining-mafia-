package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ou {
    private static final AtomicInteger bob;
    private static final AtomicInteger fou;
    private static final AtomicInteger kq;
    private static final AtomicInteger oq;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        kq = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        oq = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        bob = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        fou = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void kq() {
        try {
            long jKq = com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "upload_time_key", 0L);
            if (jKq <= 0 || System.currentTimeMillis() - jKq < 86400000) {
                if (jKq <= 0 || jKq > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            oq();
            synchronized (ou.class) {
                kq.set(0);
                oq.set(0);
                bob.set(0);
                fou.set(0);
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void oq() {
        final int i10 = kq.get();
        final int i11 = oq.get();
        final int i12 = bob.get();
        final int i13 = fou.get();
        com.bytedance.sdk.openadsdk.mxq.bob.kq("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.core.ou.1
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("crypt_v4_statistics").oq(jSONObject.toString());
            }
        });
    }

    public static synchronized void oq(boolean z9) {
        try {
            if (z9) {
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(kq.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(oq.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void kq(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.mxq.bob.kq("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.core.ou.2
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("crypt_v4_fail").oq(jSONObject.toString());
            }
        });
    }

    public static synchronized void kq(boolean z9) {
        try {
            if (z9) {
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(bob.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(bob.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void kq(JSONObject jSONObject) {
        oq(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
