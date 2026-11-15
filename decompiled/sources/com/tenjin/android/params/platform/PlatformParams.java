package com.tenjin.android.params.platform;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.model.AdvertiserInfo;
import com.tenjin.android.params.AndroidParams;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.store.TenjinDatasource;
import com.tenjin.android.utils.AppSetIdProvider;
import com.tenjin.android.utils.ImeiRequester;
import com.tenjin.android.utils.OaidRequester;
import com.tenjin.android.utils.Reflection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformParams extends AParamProvider {
    public final AdvertiserInfo adInfo;

    public PlatformParams(AdvertiserInfo advertiserInfo) {
        this.adInfo = advertiserInfo;
    }

    public static AdvertiserInfo adInfoForAmazon(IAdvertisingIdProvider iAdvertisingIdProvider) {
        String id;
        Boolean boolValueOf = Boolean.FALSE;
        AdvertiserInfo advertiserInfo = new AdvertiserInfo();
        try {
            id = iAdvertisingIdProvider.getId();
            try {
                boolValueOf = Boolean.valueOf(iAdvertisingIdProvider.isLimitAdTrackingEnabled());
                Log.d("PlatformParams", "Got advertising ID from Amazon provider: " + id + ", LAT: " + boolValueOf);
            } catch (Exception e10) {
                e = e10;
                Log.e("Tenjin", "Error retrieving Amazon advertising info", e);
            }
        } catch (Exception e11) {
            e = e11;
            id = "";
        }
        advertiserInfo.setAdvertisingId(id);
        advertiserInfo.setLimitAdTracking(boolValueOf);
        return advertiserInfo;
    }

    @NonNull
    public static AdvertiserInfo adInfoForGooglePlay(IAdvertisingIdProvider iAdvertisingIdProvider, IDataSource iDataSource) throws Exception {
        String storedAdvertisingId;
        Boolean storedLimitAdTracking;
        Boolean bool = Boolean.FALSE;
        try {
            storedAdvertisingId = iAdvertisingIdProvider.getId();
            storedLimitAdTracking = Boolean.valueOf(iAdvertisingIdProvider.isLimitAdTrackingEnabled());
            Log.d("PlatformParams", "Got advertising ID from provider: " + storedAdvertisingId + ", LAT: " + storedLimitAdTracking);
            if (storedAdvertisingId != null) {
                iDataSource.setAdvertisingIdInfo(storedAdvertisingId, storedLimitAdTracking);
            }
        } catch (Exception e10) {
            Log.e("PlatformParams", "Failed to get advertising ID from provider, checking stored data.", e10);
            if (iDataSource.getStoredAdvertisingId() == null || iDataSource.getStoredLimitAdTracking() == null) {
                Log.e("PlatformParams", "No stored data available, rethrowing exception.");
                throw new Exception("Failed to get advertising ID from Google provider and no stored data available", e10);
            }
            bool = Boolean.TRUE;
            storedAdvertisingId = iDataSource.getStoredAdvertisingId();
            storedLimitAdTracking = iDataSource.getStoredLimitAdTracking();
            Log.d("PlatformParams", "Using stored advertising ID: " + storedAdvertisingId + ", LAT: " + storedLimitAdTracking);
        }
        AdvertiserInfo advertiserInfo = new AdvertiserInfo();
        advertiserInfo.setAdvertisingId(storedAdvertisingId);
        advertiserInfo.setLimitAdTracking(storedLimitAdTracking);
        advertiserInfo.setIsFromLocalStorage(bool);
        return advertiserInfo;
    }

    public static Object getAdvertisingInfoObject(Context context) {
        return getAdvertisingInfoObjectWithRetry(context, 3);
    }

    public static Object getAdvertisingInfoObjectWithRetry(Context context, Integer num) {
        if (num.intValue() <= 0) {
            Log.e("Tenjin", "Failed to retrieve advertising ID - giving up");
            return null;
        }
        try {
            return Reflection.runStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
        } catch (Exception e10) {
            Log.e("Tenjin", "Error in retrieving advertising ID via reflection: " + e10.getMessage(), e10);
            if (e10 instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) e10).getTargetException();
                Class<?> clsForName = Reflection.forName("com.google.android.gms.common.GooglePlayServicesRepairableException");
                if ((targetException instanceof IOException) || (clsForName != null && targetException.getClass().isAssignableFrom(clsForName))) {
                    return getAdvertisingInfoObjectWithRetry(context, Integer.valueOf(num.intValue() - 1));
                }
            }
            Log.e("Tenjin", "Unexpected exception in reflection for getAdvertisingIdInfo");
            return null;
        }
    }

    public static PlatformParams getParamsForPlatform(Context context) throws Exception {
        AdvertiserInfo advertiserInfoAdInfoForAmazon;
        if (context == null) {
            Log.e("PlatformParams", "Context is null. Cannot proceed with getParamsForPlatform.");
            throw new IllegalStateException("Context cannot be null in getParamsForPlatform.");
        }
        TenjinDatasource tenjinDatasource = new TenjinDatasource(context);
        if (AndroidParams.getPlatform().equals("amazon")) {
            advertiserInfoAdInfoForAmazon = adInfoForAmazon(new AmazonAdvertisingIdProvider(context.getContentResolver()));
        } else {
            AdvertiserInfo advertiserInfoAdInfoForGooglePlay = adInfoForGooglePlay(new GoogleAdvertisingIdProvider(getAdvertisingInfoObject(context)), tenjinDatasource);
            advertiserInfoAdInfoForGooglePlay.setOaid(new OaidRequester(context).getOaid());
            advertiserInfoAdInfoForGooglePlay.setImei(new ImeiRequester(context).getImei());
            AppSetIdProvider appSetIdProvider = new AppSetIdProvider(context);
            String appSetId = appSetIdProvider.getAppSetId();
            String appSetIdScope = appSetIdProvider.getAppSetIdScope();
            Log.d("PlatformParams", "AppSet ID fetched: " + appSetId + ", Scope: " + appSetIdScope);
            advertiserInfoAdInfoForGooglePlay.setAppSetId(appSetId);
            advertiserInfoAdInfoForGooglePlay.setAppSetIdScope(appSetIdScope);
            advertiserInfoAdInfoForAmazon = advertiserInfoAdInfoForGooglePlay;
        }
        return new PlatformParams(advertiserInfoAdInfoForAmazon);
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        map.put(TenjinConsts.ATTR_PARAM_ADVERTISING_ID, this.adInfo.getAdvertisingId());
        map.put("limit_ad_tracking", String.valueOf(this.adInfo.getLimitAdTracking()));
        map.put("ad_id_local", String.valueOf(this.adInfo.getIsFromLocalStorage()));
        String oaid = this.adInfo.getOaid();
        if (oaid != null) {
            map.put("oaid", oaid);
        }
        String imei = this.adInfo.getImei();
        if (imei != null) {
            map.put("imei", imei);
        }
        String appSetId = this.adInfo.getAppSetId();
        if (appSetId != null) {
            map.put("developer_device_id", appSetId);
            Log.d("PlatformParams", "Adding developer_device_id to request: " + appSetId);
        } else {
            Log.d("PlatformParams", "AppSet ID is null, not adding developer_device_id to request");
        }
        String appSetIdScope = this.adInfo.getAppSetIdScope();
        if (appSetIdScope != null) {
            map.put("developer_device_id_scope", appSetIdScope);
            Log.d("PlatformParams", "Adding developer_device_id_scope to request: " + appSetIdScope);
        }
        return map;
    }

    public Boolean isReady() {
        return Boolean.valueOf(this.adInfo != null);
    }
}
