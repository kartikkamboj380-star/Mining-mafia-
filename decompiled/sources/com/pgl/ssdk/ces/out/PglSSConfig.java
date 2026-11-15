package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f41998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PglSSCallBack f41999f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42001b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f42002c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f42003d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f42000a)) {
                return null;
            }
            return new PglSSConfig(this.f42000a, this.f42001b, this.f42002c, this.f42003d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f42003d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f42000a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f42002c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f42001b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f41997d;
    }

    public String getAppId() {
        return this.f41994a;
    }

    public PglSSCallBack getCallBack() {
        return this.f41999f;
    }

    public int getCollectMode() {
        return this.f41996c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f41998e;
    }

    public int getOVRegionType() {
        return this.f41995b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f41999f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f41998e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f41994a = str;
        this.f41995b = i10;
        this.f41996c = i11;
        this.f41997d = str2;
    }
}
