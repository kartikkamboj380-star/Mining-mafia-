package com.tenjin.android.params;

import androidx.annotation.NonNull;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.utils.TenjinUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ConsentParamFilter extends AParamProvider {
    private static final String[] optOutKeysToRetain = (String[]) TenjinUtils.concat(TenjinConsts.REFERRAL_PARAMS, TenjinConsts.REQUIRED_PARAMS);
    protected ConsentState userState = ConsentState.IMPLICIT;
    private String[] customOptOutParameters = new String[0];
    private String[] customOptInParameters = new String[0];

    /* JADX INFO: renamed from: com.tenjin.android.params.ConsentParamFilter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState;

        static {
            int[] iArr = new int[ConsentState.values().length];
            $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState = iArr;
            try {
                iArr[ConsentState.IMPLICIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState[ConsentState.EXPLICIT_OPTIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState[ConsentState.EXPLICIT_OPTOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState[ConsentState.EXPLICIT_OPTOUT_BLACKLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState[ConsentState.EXPLICIT_OPTIN_WHITELIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum ConsentState {
        EXPLICIT_OPTIN,
        EXPLICIT_OPTOUT,
        EXPLICIT_OPTOUT_BLACKLIST,
        EXPLICIT_OPTIN_WHITELIST,
        IMPLICIT
    }

    private Map<String, String> filterMap(Map<String, String> map, String[] strArr) {
        HashMap map2 = new HashMap();
        for (String str : strArr) {
            if (map.get(str) != null) {
                map2.put(str, map.get(str));
            }
        }
        return map2;
    }

    @NonNull
    private Map<String, String> getOptInWhitelistParams(Map<String, String> map) {
        String[] strArr = (String[]) TenjinUtils.concat(this.customOptInParameters, TenjinConsts.REQUIRED_PARAMS);
        if (map.get("device_all") != null) {
            strArr = (String[]) TenjinUtils.concat(strArr, TenjinConsts.DEVICE_ALL_PARAMS);
        }
        if (map.get(TenjinConsts.REFERRER_PARAM) != null) {
            strArr = (String[]) TenjinUtils.concat(strArr, TenjinConsts.REFERRAL_PARAMS);
        }
        Map<String, String> mapFilterMap = filterMap(map, strArr);
        mapFilterMap.put("opt_in_params", TenjinUtils.join(this.customOptInParameters, ","));
        return mapFilterMap;
    }

    @NonNull
    private Map<String, String> getOptOutBlacklistParams(Map<String, String> map) {
        for (String str : this.customOptOutParameters) {
            map.remove(str);
        }
        map.put("opt_out_params", TenjinUtils.join(this.customOptOutParameters, ","));
        return map;
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        int i10 = AnonymousClass1.$SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState[this.userState.ordinal()];
        if (i10 == 2) {
            map.put("opt_in", String.valueOf(true));
            return map;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return i10 != 5 ? map : getOptInWhitelistParams(map);
            }
            return getOptOutBlacklistParams(map);
        }
        Map<String, String> mapFilterMap = filterMap(map, optOutKeysToRetain);
        mapFilterMap.put("opt_out", String.valueOf(true));
        return mapFilterMap;
    }

    public void optIn() {
        this.userState = ConsentState.EXPLICIT_OPTIN;
    }

    public void optInToParameters(String[] strArr) {
        this.customOptInParameters = strArr;
        this.userState = ConsentState.EXPLICIT_OPTIN_WHITELIST;
    }

    public void optOut() {
        this.userState = ConsentState.EXPLICIT_OPTOUT;
    }

    public void outOutOfParameters(String[] strArr) {
        this.customOptOutParameters = strArr;
        this.userState = ConsentState.EXPLICIT_OPTOUT_BLACKLIST;
    }
}
