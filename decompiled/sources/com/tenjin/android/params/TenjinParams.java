package com.tenjin.android.params;

import com.tenjin.android.TenjinSDK;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.store.DataStore;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinParams extends AParamProvider {
    private final DataStore store;

    public TenjinParams(DataStore dataStore) {
        this.store = dataStore;
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        map.put("sdk_version", getSdkVersion());
        map.put("analytics_installation_id", getAnalyticsInstallationID());
        return map;
    }

    public String getAnalyticsInstallationID() {
        String string;
        if (this.store.contains(TenjinConsts.TENJIN_REFERENCE_ID)) {
            string = this.store.getString(TenjinConsts.TENJIN_REFERENCE_ID, null);
            this.store.remove(TenjinConsts.TENJIN_REFERENCE_ID);
            this.store.putString(TenjinConsts.ANALYTICS_INSTALLATION_ID, string);
        } else {
            string = this.store.getString(TenjinConsts.ANALYTICS_INSTALLATION_ID, null);
        }
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.store.putString(TenjinConsts.ANALYTICS_INSTALLATION_ID, string2);
        return string2;
    }

    public String getSdkVersion() {
        String str = TenjinSDK.wrapperVersion;
        return (str == null || str.isEmpty()) ? "1.17.2" : String.format("%s-%s", "1.17.2", TenjinSDK.wrapperVersion);
    }
}
