package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private static final AtomicInteger kq = new AtomicInteger(0);
    private static final AtomicBoolean oq = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void bob() {
        kq.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fou() {
        if (kq.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.nz.kq().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ubx.2
                @Override // java.lang.Runnable
                public void run() {
                    ubx.oq(vvw.kq(sns.kq()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    public static void oq(final String str) {
        com.bytedance.sdk.openadsdk.utils.nz.bob(new com.bytedance.sdk.component.syt.syt("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.ubx.1
            @Override // java.lang.Runnable
            public void run() {
                final String strGm = com.bytedance.sdk.openadsdk.utils.wol.gm();
                com.bytedance.sdk.openadsdk.mxq.bob.kq(0, strGm);
                com.bytedance.sdk.openadsdk.wcx.bob.kq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.1
                    @Override // com.bytedance.sdk.openadsdk.wcx.fou
                    public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                        kqVar.oq("ipv6");
                        return kqVar;
                    }
                });
                if (TextUtils.isEmpty(strGm)) {
                    com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, strGm, -1, "url is null");
                    com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", "", -2, "url is null");
                    com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.2
                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                            kqVar.oq("ipv6");
                            return kqVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.rjo.oq.fou fouVarOq = com.bytedance.sdk.openadsdk.gm.oq.oq().bob().oq();
                try {
                    fouVarOq.oq(strGm);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.ibd.kq(sns.kq(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.fou.kq.kq.kq().oq());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new nb(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 == null || jSONObjectEncryptType4.optInt("cypher") != 4) {
                        ou.oq(false);
                    } else {
                        ou.oq(true);
                        fouVarOq.oq("x-pgli18n", "4");
                        fouVarOq.oq(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json; charset=utf-8");
                    }
                    if (ubx.oq(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    fouVarOq.oq(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json; charset=utf-8");
                    fouVarOq.oq("User-Agent", com.bytedance.sdk.openadsdk.utils.wol.fou());
                    fouVarOq.kq(jSONObject);
                    fouVarOq.kq(6);
                    fouVarOq.kq("send_i_p_v6");
                    fouVarOq.kq(new com.bytedance.sdk.component.rjo.kq.kq() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.3
                        @Override // com.bytedance.sdk.component.rjo.kq.kq
                        public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, com.bytedance.sdk.component.rjo.oq oqVar) {
                            if (oqVar.rhi()) {
                                ubx.oq(oqVar.fou(), strGm);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, strGm, oqVar.kq(), oqVar.oq());
                            com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", strGm, oqVar.kq(), oqVar.oq());
                            com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                    kqVar.oq("ipv6");
                                    return kqVar;
                                }
                            });
                            ubx.fou();
                        }

                        @Override // com.bytedance.sdk.component.rjo.kq.kq
                        public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, strGm, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", strGm, -1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.wcx.fou
                                    public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                        kqVar.oq("ipv6");
                                        return kqVar;
                                    }
                                });
                            }
                            ubx.fou();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, strGm, -2, e10.getMessage());
                    com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", strGm, -3, e10.getMessage());
                    com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.1.4
                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                            kqVar.oq("ipv6");
                            return kqVar;
                        }
                    });
                    com.bytedance.sdk.component.utils.fax.bob("build ipv6 request failed:" + e10.getMessage(), new Object[0]);
                }
            }
        });
    }

    private static class kq implements com.bytedance.sdk.component.utils.ibd.kq {
        private static final AtomicBoolean kq = new AtomicBoolean(false);
        private static volatile long oq = -1;

        private kq() {
        }

        public static void kq() {
            if (kq.compareAndSet(false, true)) {
                oq = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.ibd.kq(new kq(), sns.kq());
            }
        }

        public void oq() {
            com.bytedance.sdk.component.utils.ibd.kq(this);
        }

        @Override // com.bytedance.sdk.component.utils.ibd.kq
        public void kq(Context context, Intent intent, boolean z9, int i10) {
            if (System.currentTimeMillis() - oq >= 2000 && i10 != 0) {
                ubx.bob();
                ubx.oq(vvw.kq(sns.kq()));
                oq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public static void oq(String str, String str2) {
        byte b10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -4, "cypher type error");
                com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.3
                    @Override // com.bytedance.sdk.openadsdk.wcx.fou
                    public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                        kqVar.oq("ipv6");
                        return kqVar;
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            if (pairDecryptType4.second != null) {
                JSONObject jSONObject2 = new JSONObject((String) pairDecryptType4.second);
                String strOptString = jSONObject2.optString("ip_type");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 3239397) {
                    if (iHashCode != 3239399) {
                        if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (strOptString.equals("ipv4")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    if (jSONObject2.has("ip")) {
                        String strOptString2 = jSONObject2.optString("ip");
                        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", "key_ipv4");
                        HashMap map = new HashMap();
                        map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.core.nn.oq.oq().kq(map);
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(1, str2);
                        com.bytedance.sdk.openadsdk.wcx.bob.oq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.5
                            @Override // com.bytedance.sdk.openadsdk.wcx.fou
                            public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                kqVar.oq("ipv6");
                                return kqVar;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -6, "no ip");
                    com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.6
                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                            kqVar.oq("ipv6");
                            return kqVar;
                        }
                    });
                    return;
                }
                if (b10 != 1) {
                    if (b10 != 2) {
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 3, "no ip type ");
                        com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -7, "no ip type ");
                        com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.9
                            @Override // com.bytedance.sdk.openadsdk.wcx.fou
                            public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                kqVar.oq("ipv6");
                                return kqVar;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (jSONObject2.has("ip")) {
                    com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                    com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                    com.bytedance.sdk.openadsdk.mxq.bob.kq(1, str2);
                    com.bytedance.sdk.openadsdk.wcx.bob.oq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.7
                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                            kqVar.oq("ipv6");
                            return kqVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 4, "no ip");
                com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -6, "no ip");
                com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.8
                    @Override // com.bytedance.sdk.openadsdk.wcx.fou
                    public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                        kqVar.oq("ipv6");
                        return kqVar;
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.4
                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                    kqVar.oq("ipv6");
                    return kqVar;
                }
            });
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.mxq.bob.kq(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.mxq.kq.csi.kq("ipv6", str2, -8, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ubx.10
                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                    kqVar.oq("ipv6");
                    return kqVar;
                }
            });
        }
    }

    public static void kq(String str) {
        AtomicBoolean atomicBoolean = oq;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.wcx.syt(sns.kq())) {
                atomicBoolean.set(false);
            } else {
                kq.kq();
                oq(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oq(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
