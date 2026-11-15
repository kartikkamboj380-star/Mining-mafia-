package com.bytedance.sdk.openadsdk;

import G1.e;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nze;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int bob;
    private float csi;
    private int dgq;
    private int ebt;
    private int fax;
    private float fou;
    private String gm;
    private long ibd;
    private int jhe;
    private String kq;
    private int mq;
    private String mxq;
    private int nb;
    private String nn;
    private String nze;
    private int oq;
    private boolean ou;
    private int rhi;
    private boolean rjo;
    private Map<String, Object> rs;
    private String sns;
    private boolean suf;
    private String syt;
    private String ubx;
    private int uml;
    private int vvw;
    private String wcx;
    private boolean wki;

    public static class Builder {
        private String kq;
        private int mq;
        private String mxq;
        private int nn;
        private String nze;
        private String sns;
        private String suf;
        private String syt;
        private float ubx;
        private float vvw;
        private String wcx;
        private boolean wki;
        private int oq = 640;
        private int bob = 320;
        private final boolean fou = true;
        private int csi = 1;
        private final String rhi = "";
        private final int rjo = 0;
        private String dgq = "defaultUser";
        private boolean gm = true;
        private Map<String, Object> fax = null;
        private int jhe = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.kq = this.kq;
            adSlot.rhi = this.csi;
            adSlot.rjo = true;
            adSlot.oq = this.oq;
            adSlot.bob = this.bob;
            float f10 = this.ubx;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                adSlot.fou = this.oq;
                adSlot.csi = this.bob;
            } else {
                adSlot.fou = f10;
                adSlot.csi = this.vvw;
            }
            adSlot.syt = "";
            adSlot.dgq = 0;
            adSlot.nn = this.syt;
            adSlot.ubx = this.dgq;
            adSlot.vvw = this.nn;
            adSlot.wki = this.gm;
            adSlot.suf = this.wki;
            adSlot.nze = this.suf;
            adSlot.mxq = this.nze;
            adSlot.sns = this.mxq;
            adSlot.wcx = this.sns;
            adSlot.gm = this.wcx;
            adSlot.rs = this.fax;
            adSlot.uml = this.mq;
            adSlot.nb = this.jhe;
            return adSlot;
        }

        public Builder isExpressAd(boolean z9) {
            this.wki = z9;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.csi = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.nze = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.jhe = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.kq = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.mxq = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.mq = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.ubx = f10;
            this.vvw = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.sns = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.oq = i10;
            this.bob = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z9) {
            this.gm = z9;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.syt = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.nn = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.fax = map;
            return this;
        }

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z9) {
            return this;
        }

        public Builder setUserData(String str) {
            this.wcx = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.dgq = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (nze.fou()) {
                e.a(str);
            }
            this.suf = str;
            return this;
        }
    }

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.rhi;
    }

    public String getAdId() {
        return this.mxq;
    }

    public int getBannerType() {
        return this.nb;
    }

    public String getBidAdm() {
        return this.nze;
    }

    public int getCacheScene() {
        return this.ebt;
    }

    public long getCacheTime() {
        return this.ibd;
    }

    public String getCodeId() {
        return this.kq;
    }

    public String getCreativeId() {
        return this.sns;
    }

    public int getDurationSlotType() {
        return this.uml;
    }

    public float getExpressViewAcceptedHeight() {
        return this.csi;
    }

    public float getExpressViewAcceptedWidth() {
        return this.fou;
    }

    public String getExt() {
        return this.wcx;
    }

    public int getImgAcceptedHeight() {
        return this.bob;
    }

    public int getImgAcceptedWidth() {
        return this.oq;
    }

    public int getIsRotateBanner() {
        return this.fax;
    }

    public String getMediaExtra() {
        return this.nn;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.rs;
    }

    public int getRewardAmount() {
        return this.dgq;
    }

    public String getRewardName() {
        return this.syt;
    }

    public int getRotateOrder() {
        return this.jhe;
    }

    public int getRotateTime() {
        return this.mq;
    }

    public String getUserData() {
        return this.gm;
    }

    public String getUserID() {
        return this.ubx;
    }

    public boolean isAutoPlay() {
        return this.wki;
    }

    public boolean isExpressAd() {
        return this.suf;
    }

    public boolean isPreload() {
        return this.ou;
    }

    public boolean isSupportDeepLink() {
        return this.rjo;
    }

    public void setAdCount(int i10) {
        this.rhi = i10;
    }

    public void setCacheScene(int i10) {
        this.ebt = i10;
    }

    public void setCacheTime(long j10) {
        this.ibd = j10;
    }

    public void setDurationSlotType(int i10) {
        this.uml = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.fou = f10;
        this.csi = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.fax = i10;
    }

    public void setPreload(boolean z9) {
        this.ou = z9;
    }

    public void setRotateOrder(int i10) {
        this.jhe = i10;
    }

    public void setRotateTime(int i10) {
        this.mq = i10;
    }

    public void setUserData(String str) {
        this.gm = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.kq);
            jSONObject.put("mAdCount", this.rhi);
            jSONObject.put("mIsAutoPlay", this.wki);
            jSONObject.put("mImgAcceptedWidth", this.oq);
            jSONObject.put("mImgAcceptedHeight", this.bob);
            jSONObject.put("mExpressViewAcceptedWidth", this.fou);
            jSONObject.put("mExpressViewAcceptedHeight", this.csi);
            jSONObject.put("mSupportDeepLink", this.rjo);
            jSONObject.put("mRewardName", this.syt);
            jSONObject.put("mRewardAmount", this.dgq);
            jSONObject.put("mMediaExtra", this.nn);
            jSONObject.put("mUserID", this.ubx);
            jSONObject.put("mNativeAdType", this.vvw);
            jSONObject.put("mIsExpressAd", this.suf);
            jSONObject.put("mAdId", this.mxq);
            jSONObject.put("mCreativeId", this.sns);
            jSONObject.put("mExt", this.wcx);
            jSONObject.put("mBidAdm", this.nze);
            jSONObject.put("mUserData", this.gm);
            jSONObject.put("mDurationSlotType", this.uml);
            jSONObject.put("mBannerType", this.nb);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.wki = true;
        this.suf = false;
        this.fax = 0;
        this.mq = 0;
        this.jhe = 0;
        this.nb = 1;
    }
}
