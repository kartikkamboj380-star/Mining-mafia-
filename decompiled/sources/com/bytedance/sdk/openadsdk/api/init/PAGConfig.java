package com.bytedance.sdk.openadsdk.api.init;

import G1.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.rjo.bob.bob;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.nze;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.zfx;
import com.bytedance.sdk.openadsdk.utils.wol;

/* JADX INFO: loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String dgq;
    private String kq;
    private String nn;
    private boolean oq;
    private boolean rhi;
    private String rjo;
    private String syt;
    private int bob = -1;
    private int fou = -1;
    private int csi = 0;

    public static class Builder {
        private String dgq;
        private String kq;
        private boolean oq;
        private String[] rjo;
        private String syt;
        private int bob = -1;
        private int fou = -1;
        private int csi = 0;
        private boolean rhi = false;
        private String nn = "";

        @Deprecated
        public Builder appIcon(int i10) {
            return this;
        }

        public Builder appId(String str) {
            this.kq = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.oq(this.kq);
            pAGConfig.bob(this.csi);
            pAGConfig.oq(this.rhi);
            pAGConfig.kq(this.bob);
            pAGConfig.oq(this.fou);
            pAGConfig.kq(this.oq);
            pAGConfig.bob(this.syt);
            pAGConfig.kq(this.dgq);
            pAGConfig.fou(this.nn);
            return pAGConfig;
        }

        public Builder debugLog(boolean z9) {
            this.oq = z9;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.rjo = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.nn = str;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.bob = i10;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
            if (i10 == 0 || i10 == 1) {
                this.fou = i10;
                return this;
            }
            this.fou = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.syt = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.dgq = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z9) {
            this.rhi = z9;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.csi = i10;
            return this;
        }

        public Builder useTextureView(boolean z9) {
            return this;
        }
    }

    public static void debugLog(boolean z9) {
        if (zfx.kq() != null) {
            if (z9) {
                zfx.kq().bob(1);
                zfx.kq().kq();
                return;
            }
            zfx.kq().bob(0);
            bob.kq(bob.kq.OFF);
            nze.bob();
            a.d();
            fax.oq();
        }
    }

    public static int getGDPRConsent() {
        if (!wol.dgq("getGdpr")) {
            return -1;
        }
        int iOq = zfx.kq().oq();
        if (iOq == 1) {
            return 0;
        }
        if (iOq == 0) {
            return 1;
        }
        return iOq;
    }

    public static int getPAConsent() {
        if (wol.dgq("getPAConsent")) {
            return zfx.kq().csi();
        }
        return -1;
    }

    public static void setAppIconId(int i10) {
        if (zfx.kq() != null) {
            zfx.kq().fou(i10);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        wol.dgq("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        zfx.kq().oq(i10);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        if (wol.dgq("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                zfx.kq().csi(i10);
            } else {
                zfx.kq().csi(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        dgq = str;
    }

    public static void setUserData(String str) {
        if (zfx.kq() != null) {
            zfx.kq().oq(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.nn;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.syt;
    }

    public boolean getDebugLog() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.rjo) ? dgq : this.rjo;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.csi;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.rhi;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fou(String str) {
        this.nn = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bob(int i10) {
        this.csi = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bob(String str) {
        this.rjo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(String str) {
        this.syt = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(String str) {
        this.kq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(boolean z9) {
        this.oq = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(int i10) {
        this.fou = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.bob = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(boolean z9) {
        this.rhi = z9;
        A1.a.h(z9);
    }
}
