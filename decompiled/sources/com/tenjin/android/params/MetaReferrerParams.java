package com.tenjin.android.params;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.params.referral.MetaInstallReferrer;
import com.tenjin.android.params.referral.MetaInstallReferrerInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MetaReferrerParams extends AParamProvider {
    private final Context context;
    private final MetaInstallReferrer metaInstallReferrer;

    public MetaReferrerParams(Context context) {
        this.context = context;
        this.metaInstallReferrer = new MetaInstallReferrer();
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        try {
            MetaInstallReferrerInfo installReferrerInfo = this.metaInstallReferrer.getInstallReferrerInfo(this.context);
            if (installReferrerInfo != null && installReferrerInfo.getInstallReferrer() != null && !installReferrerInfo.getInstallReferrer().isEmpty()) {
                map.put(TenjinConsts.META_REFERRER_PARAM, URLEncoder.encode(installReferrerInfo.getInstallReferrer(), "UTF-8"));
                map.put(TenjinConsts.META_REFERRER_TIMESTAMP_PARAM, String.valueOf(installReferrerInfo.getActualTimestamp()));
                map.put(TenjinConsts.META_REFERRER_CLICKTHROUGH_PARAM, String.valueOf(installReferrerInfo.isClickThrough()));
                return map;
            }
            return map;
        } catch (UnsupportedEncodingException | NullPointerException e10) {
            Log.e(TenjinConsts.LOG_TAG, "Error getting Meta Install Referrer: " + e10.getMessage());
            return map;
        }
    }

    public MetaReferrerParams(Context context, MetaInstallReferrer metaInstallReferrer) {
        this.context = context;
        this.metaInstallReferrer = metaInstallReferrer;
    }
}
