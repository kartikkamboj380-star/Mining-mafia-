package com.bytedance.sdk.openadsdk.rhi;

import com.bytedance.sdk.openadsdk.core.bob;
import com.bytedance.sdk.openadsdk.core.suf;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile kq kq;
    private boolean bob;
    private int[] csi;
    private int[] dgq;
    private boolean fou;
    private boolean mxq;
    private boolean nn;
    private int nze;
    private boolean oq;
    private int[] rhi;
    private int[] rjo;
    private boolean sns;
    private boolean suf;
    private int[] syt;
    private boolean ubx;
    private int[] vvw;
    private boolean wki;

    private kq() {
        oq();
    }

    public int[] mxq() {
        return this.vvw;
    }

    public int[] nn() {
        return this.rhi;
    }

    public boolean nze() {
        return this.ubx;
    }

    public boolean sns() {
        return this.wki;
    }

    public boolean suf() {
        return this.nn;
    }

    public int[] ubx() {
        return this.rjo;
    }

    public int[] vvw() {
        return this.syt;
    }

    public boolean wcx() {
        return this.sns;
    }

    public int[] wki() {
        return this.dgq;
    }

    public int[] dgq() {
        return this.csi;
    }

    public boolean rjo() {
        return this.bob;
    }

    public boolean syt() {
        return this.fou;
    }

    public boolean csi() {
        return this.mxq;
    }

    public int fou() {
        return this.nze;
    }

    public boolean rhi() {
        return this.oq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] bob(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void oq() {
        suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rhi.kq.1
            @Override // java.lang.Runnable
            public void run() {
                kq.this.suf = com.bytedance.sdk.openadsdk.jhe.kq.kq("feature_switch", false);
                if (kq.this.suf) {
                    try {
                        kq.this.sns = com.bytedance.sdk.openadsdk.jhe.kq.kq("exclude_banner_native", false);
                        kq.this.nze = com.bytedance.sdk.openadsdk.jhe.kq.kq("feature_timer_interval", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                        kq.this.mxq = com.bytedance.sdk.openadsdk.jhe.kq.kq("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_dislike_cnt", "1,3,5session").split(",");
                        kq kqVar = kq.this;
                        kqVar.oq = kqVar.kq(strArrSplit);
                        kq kqVar2 = kq.this;
                        kqVar2.bob = kqVar2.kq(strArrSplit2);
                        kq kqVar3 = kq.this;
                        kqVar3.fou = kqVar3.kq(strArrSplit3);
                        kq kqVar4 = kq.this;
                        kqVar4.csi = kqVar4.oq(strArrSplit);
                        kq kqVar5 = kq.this;
                        kqVar5.rhi = kqVar5.oq(strArrSplit2);
                        kq kqVar6 = kq.this;
                        kqVar6.rjo = kqVar6.oq(strArrSplit3);
                        kq kqVar7 = kq.this;
                        kqVar7.vvw = kqVar7.bob(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_video_stay_time", "1,3,5&session").split("&");
                        kq kqVar8 = kq.this;
                        kqVar8.nn = kqVar8.kq(strArrSplit5);
                        kq kqVar9 = kq.this;
                        kqVar9.ubx = kqVar9.kq(strArrSplit6);
                        kq kqVar10 = kq.this;
                        kqVar10.syt = kqVar10.oq(strArrSplit5);
                        kq kqVar11 = kq.this;
                        kqVar11.dgq = kqVar11.oq(strArrSplit6);
                        kq.this.wki = com.bytedance.sdk.openadsdk.jhe.kq.kq("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] oq(String[] strArr) {
        if (strArr.length > 0) {
            return bob(strArr[0].split(","));
        }
        return new int[0];
    }

    public static kq kq() {
        if (kq == null) {
            synchronized (bob.class) {
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

    public boolean bob() {
        return this.suf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kq(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
