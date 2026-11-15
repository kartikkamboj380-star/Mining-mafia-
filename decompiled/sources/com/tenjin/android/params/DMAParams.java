package com.tenjin.android.params;

import android.content.Context;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.utils.GDPRHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DMAParams extends AParamProvider {
    private final Context context;

    public DMAParams(Context context) {
        this.context = context;
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        GDPRHelper gDPRHelper = new GDPRHelper(this.context);
        if (!gDPRHelper.isGoogleDMADisabled()) {
            Boolean googleAdPersonalization = gDPRHelper.getGoogleAdPersonalization();
            Boolean googleAdUserData = gDPRHelper.getGoogleAdUserData();
            String purposeConsentsTCF = gDPRHelper.getPurposeConsentsTCF();
            if (googleAdPersonalization != null) {
                map.put(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION, googleAdPersonalization.booleanValue() ? "true" : "false");
            }
            if (googleAdUserData != null) {
                map.put(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA, googleAdUserData.booleanValue() ? "true" : "false");
            }
            if (purposeConsentsTCF != null) {
                map.put(TenjinConsts.TENJIN_IAB_TCF, purposeConsentsTCF);
            }
        }
        return map;
    }
}
