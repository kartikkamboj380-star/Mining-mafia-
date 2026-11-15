package com.tenjin.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.tenjin.android.config.SDKConfig;
import com.tenjin.android.config.SDKConfigKeys;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.enums.AppStoreTypeEnum;
import com.tenjin.android.model.EventKey;
import com.tenjin.android.model.EventName;
import com.tenjin.android.model.Transaction;
import com.tenjin.android.params.AndroidParams;
import com.tenjin.android.params.AttributionParams;
import com.tenjin.android.params.ConsentParamFilter;
import com.tenjin.android.params.DMAParams;
import com.tenjin.android.params.MetaReferrerParams;
import com.tenjin.android.params.TenjinParams;
import com.tenjin.android.params.base.ParamProvider;
import com.tenjin.android.params.platform.PlatformParams;
import com.tenjin.android.store.QueueEvent;
import com.tenjin.android.store.SharedPrefsStore;
import com.tenjin.android.store.TenjinDatasource;
import com.tenjin.android.userprofile.UserProfileData;
import com.tenjin.android.userprofile.UserProfileManager;
import com.tenjin.android.utils.GDPRHelper;
import com.tenjin.android.utils.TenjinStartup;
import com.tenjin.android.utils.TenjinUtils;
import com.tenjin.android.utils.adnetwork.AdMobHelper;
import com.tenjin.android.utils.adnetwork.AppLovinHelper;
import com.tenjin.android.utils.adnetwork.CASHelper;
import com.tenjin.android.utils.adnetwork.HyperBidHelper;
import com.tenjin.android.utils.adnetwork.IronSourceHelper;
import com.tenjin.android.utils.adnetwork.TopOnHelper;
import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import com.tenjin.android.utils.threading.IThreading;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinSDK {
    public static final String DEEPLINK_URL = "deferred_deeplink_url";
    private static final int FETCH_ATTRIBUTION_INFO_DATA_MAX_BACKOFF_TIME = 10000;
    private static final int FETCH_ATTRIBUTION_INFO_DATA_RETRY_COUNT = 5;
    private static AppStoreType appStoreType;
    private static TenjinSDK tenjinSDK;
    private boolean amazonSandboxMode;
    private String apiKey;
    private Integer appSubversion;
    private IThreading async;
    private Map<String, String> attributionResult;
    private Callback callback;
    private boolean clickedTenjinLink;
    private SDKConfig config;
    private AsyncTask connectTask;
    private long connectThreshold;
    private final ConsentParamFilter consentParamFilter;
    private Context context;
    private TenjinDatasource datasource;
    private String deferredDeeplink;
    private final List<ParamProvider> paramProviders;
    private Map<String, Long> requestProcessingQueue;
    private Map<String, Object> requestQueue;
    private long requestThreshold;
    private Map<String, String> result;
    private String sessionId;
    private String sharedSecret;
    private TenjinStartup startup;
    private final Object startupLock;
    private UserProfileManager userProfileManager;
    private static final AtomicBoolean deepLinkSent = new AtomicBoolean(false);
    private static final AtomicBoolean connectSent = new AtomicBoolean(false);
    private static final AtomicBoolean attributionInfoSent = new AtomicBoolean(false);
    public static String wrapperVersion = "";

    public enum AppStoreType {
        unspecified,
        googleplay,
        amazon,
        other
    }

    private class AsyncConnect extends AsyncTask<Void, Void, Boolean> {
        private Map<String, String> postParams;

        private AsyncConnect() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            Boolean boolValueOf;
            Log.d(TenjinConsts.LOG_TAG, "Starting connect task");
            boolean zConnect = false;
            try {
                String str = "Basic " + Base64.encodeToString(TenjinSDK.this.apiKey.getBytes(), 10);
                HashMap map = new HashMap();
                map.put("Authorization", str);
                Log.d(TenjinConsts.LOG_TAG, "Ready to connect - lock available? " + TenjinSDK.this.isReadyToConnect());
                synchronized (TenjinSDK.this.startupLock) {
                    Log.d(TenjinConsts.LOG_TAG, "Acquired startup lock, sending connect.");
                    this.postParams = TenjinSDK.this.getParams();
                    zConnect = new HttpConnection().connect(TenjinConsts.eventUrl, this.postParams, map, TenjinSDK.this.context);
                    boolValueOf = Boolean.valueOf(zConnect);
                }
                return boolValueOf;
            } catch (Exception e10) {
                e10.printStackTrace();
                return Boolean.valueOf(zConnect);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            Map<String, String> map;
            if (bool.booleanValue() && (map = this.postParams) != null && map.containsKey(TenjinConsts.REFERRER_PARAM)) {
                SharedPreferences sharedPreferences = TenjinSDK.this.context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
                if (!sharedPreferences.getBoolean(TenjinConsts.REFERRAL_SENT_KEY, false)) {
                    Log.d(TenjinConsts.LOG_TAG, "Confirmed referral sent");
                    sharedPreferences.edit().putBoolean(TenjinConsts.REFERRAL_SENT_KEY, true).apply();
                }
            }
            synchronized (TenjinSDK.connectSent) {
                TenjinSDK.connectSent.set(bool.booleanValue());
            }
            TenjinSDK.this.connectTask = null;
            if (bool.booleanValue()) {
                TenjinSDK.this.processQueue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class AsyncEvent extends AsyncTask<Void, Void, Boolean> {
        private JSONObject adImpressionData;
        private String adRevenueAdNetwork;
        private String currencyCode;
        private String dataSignature;
        private QueueEvent event;
        private String eventId;
        private int intValue;
        private String name;
        private Map<String, String> params;
        private String postURL;
        private String productId;
        private String purchaseData;
        private int quantity;
        private String receiptId;
        private String type;
        private double unitPrice;
        private String userId;
        private String value;

        public static /* synthetic */ void a(TenjinDatasource tenjinDatasource, QueueEvent queueEvent, List list) {
            if (list.isEmpty()) {
                tenjinDatasource.insertEvent(queueEvent);
            }
        }

        void handleCacheEvent(final QueueEvent queueEvent) {
            final TenjinDatasource tenjinDatasource = new TenjinDatasource(TenjinSDK.this.context);
            tenjinDatasource.getEventWithParams(queueEvent.getParams(), new TenjinDatasource.TenjinCallback() { // from class: com.tenjin.android.b
                @Override // com.tenjin.android.store.TenjinDatasource.TenjinCallback
                public final void onEventsLoaded(List list) {
                    TenjinSDK.AsyncEvent.a(tenjinDatasource, queueEvent, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            QueueEvent queueEvent;
            byte b10;
            Double dValueOf;
            Double dValueOf2;
            int i10;
            try {
                String str = this.name;
                if (str == null) {
                    str = "";
                }
                Map<String, String> params = this.params;
                if (params == null) {
                    params = TenjinSDK.this.getParams();
                }
                try {
                    if (this.params == null) {
                        params.put("event", str);
                    }
                    if (this.value == null && (i10 = this.intValue) != 0) {
                        params.put("value", Integer.toString(i10));
                    }
                    String str2 = this.value;
                    if (str2 != null) {
                        params.put("value", str2);
                    }
                    if (this.postURL.equals(TenjinConsts.purchaseURL)) {
                        params.put("currency", this.currencyCode);
                        params.put("product_id", this.productId);
                        params.put("quantity", String.valueOf(this.quantity));
                        params.put(InAppPurchaseMetaData.KEY_PRICE, String.valueOf(this.unitPrice));
                        String str3 = this.dataSignature;
                        if (str3 != null) {
                            params.put(InAppPurchaseMetaData.KEY_SIGNATURE, str3);
                        }
                        String str4 = this.purchaseData;
                        if (str4 != null) {
                            params.put("receipt", str4);
                        }
                        String str5 = this.receiptId;
                        if (str5 != null) {
                            params.put("receipt_id", str5);
                        }
                        String str6 = this.userId;
                        if (str6 != null) {
                            params.put("user_id", str6);
                        }
                    }
                    if (!TextUtils.isEmpty(this.adRevenueAdNetwork) && this.adImpressionData != null) {
                        String str7 = this.adRevenueAdNetwork;
                        String str8 = TenjinConsts.AD_NETWORK_IRONSOURCE;
                        switch (str7) {
                            case "ironsource":
                                b10 = 1;
                                break;
                            case "hyperbid":
                                b10 = 2;
                                break;
                            case "cas":
                                b10 = 5;
                                break;
                            case "admob":
                                b10 = 3;
                                break;
                            case "topon":
                                b10 = 4;
                                break;
                            case "applovin":
                                b10 = 0;
                                break;
                            case "tradplus":
                                b10 = 6;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        String str9 = "publisher_revenue";
                        switch (b10) {
                            case 0:
                                str8 = "max";
                                str9 = "revenue";
                                break;
                            case 1:
                                str9 = "revenue";
                                break;
                            case 2:
                                str8 = TenjinConsts.AD_NETWORK_HYPERBID;
                                break;
                            case 3:
                                str9 = AdMobHelper.KEY_VALUE_MICROS;
                                str8 = TenjinConsts.AD_NETWORK_ADMOB;
                                break;
                            case 4:
                                str8 = TenjinConsts.AD_NETWORK_TOPON;
                                break;
                            case 5:
                                str8 = TenjinConsts.AD_NETWORK_CAS;
                                str9 = "revenue";
                                break;
                            case 6:
                                str8 = TenjinConsts.AD_NETWORK_TRADPLUS;
                                str9 = "revenue";
                                break;
                            default:
                                str8 = this.adRevenueAdNetwork;
                                break;
                        }
                        params.put("ad_revenue_mediation", this.adRevenueAdNetwork);
                        try {
                            if (TenjinConsts.AD_NETWORK_ADMOB.equals(this.adRevenueAdNetwork)) {
                                double d10 = this.adImpressionData.getDouble(str9);
                                dValueOf2 = Double.valueOf(d10);
                                dValueOf = Double.valueOf(d10 / 1000000.0d);
                            } else {
                                double d11 = this.adImpressionData.getDouble(str9);
                                dValueOf = Double.valueOf(d11);
                                dValueOf2 = Double.valueOf(d11 * 1000000.0d);
                            }
                            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
                            ((DecimalFormat) numberFormat).applyPattern("################################################.###########################################");
                            String str10 = numberFormat.format(dValueOf);
                            if (str10 != null) {
                                params.put(str8 + "[publisher_revenue_decimal]", str10);
                            }
                            String str11 = numberFormat.format(dValueOf2);
                            if (str11 != null) {
                                params.put(str8 + "[publisher_revenue_micro]", str11);
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        Iterator<String> itKeys = this.adImpressionData.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            params.put(str8 + "[" + next + "]", this.adImpressionData.getString(next));
                        }
                    }
                    String str12 = "Basic " + Base64.encodeToString(TenjinSDK.this.apiKey.getBytes(), 10);
                    HashMap map = new HashMap();
                    map.put("Authorization", str12);
                    Pair<Boolean, Boolean> pairConnectWithRetryCheck = new HttpConnection().connectWithRetryCheck(this.postURL, params, map, TenjinSDK.this.context);
                    TenjinDatasource tenjinDatasource = new TenjinDatasource(TenjinSDK.this.context);
                    if (((Boolean) pairConnectWithRetryCheck.first).booleanValue() && tenjinDatasource.getCacheEventSetting().booleanValue() && (queueEvent = this.event) != null) {
                        tenjinDatasource.deleteEvent(queueEvent);
                    } else if (!((Boolean) pairConnectWithRetryCheck.first).booleanValue() && ((Boolean) pairConnectWithRetryCheck.second).booleanValue() && tenjinDatasource.getCacheEventSetting().booleanValue() && this.event == null) {
                        QueueEvent queueEvent2 = new QueueEvent();
                        queueEvent2.setDate(new Date());
                        queueEvent2.setEndpoint(this.postURL);
                        queueEvent2.setParams(params);
                        handleCacheEvent(queueEvent2);
                    }
                    return (Boolean) pairConnectWithRetryCheck.first;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (!bool.booleanValue() && this.event == null) {
                TenjinSDK.this.addRequestQueue(this);
            } else {
                TenjinSDK.this.removeRequestQueue(this.eventId);
                TenjinSDK.this.removeProcessingRequest(this.eventId);
            }
        }

        private AsyncEvent(String str) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = TenjinConsts.EVENT_NAME;
            this.eventId = EventKey.getEventKey(str);
            this.name = str;
        }

        private AsyncEvent(String str, String str2) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = TenjinConsts.EVENT_NAME_VALUE;
            this.eventId = EventKey.getEventKey(str, str2);
            this.name = str;
            this.value = str2;
        }

        private AsyncEvent(String str, int i10) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = TenjinConsts.EVENT_NAME_INT_VALUE;
            this.eventId = EventKey.getEventKey(str, i10);
            this.name = str;
            this.intValue = i10;
        }

        private AsyncEvent(String str, String str2, int i10, double d10) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = TenjinConsts.EVENT_NAME_TRANSACTION;
            this.eventId = EventKey.getEventKey(str, str2, i10, d10);
            this.postURL = TenjinConsts.purchaseURL;
            this.productId = str;
            this.currencyCode = str2;
            this.quantity = i10;
            this.unitPrice = d10;
        }

        private AsyncEvent(String str, String str2, int i10, double d10, String str3, String str4) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = TenjinConsts.EVENT_NAME_TRANSACTION_DATA;
            this.eventId = EventKey.getEventKey(str, str2, i10, d10, str3, str4);
            this.postURL = TenjinConsts.purchaseURL;
            this.productId = str;
            this.currencyCode = str2;
            this.quantity = i10;
            this.unitPrice = d10;
            this.purchaseData = str3;
            this.dataSignature = str4;
        }

        private AsyncEvent(Transaction transaction) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.type = transaction.transactionEventName();
            this.eventId = EventKey.getEventKey(transaction);
            this.postURL = TenjinConsts.purchaseURL;
            this.productId = transaction.getProductId();
            this.currencyCode = transaction.getCurrencyCode();
            this.quantity = transaction.getQuantity();
            this.unitPrice = transaction.getUnitPrice();
            this.receiptId = transaction.getReceiptId();
            this.userId = transaction.getUserId();
            this.purchaseData = transaction.getPurchaseData();
        }

        private AsyncEvent(String str, JSONObject jSONObject) {
            this.postURL = TenjinConsts.eventUrl;
            byte b10 = 0;
            this.intValue = 0;
            str.getClass();
            switch (str.hashCode()) {
                case -927389981:
                    if (!str.equals(TenjinConsts.AD_NETWORK_IRONSOURCE)) {
                        b10 = -1;
                    }
                    break;
                case -114321647:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_HYPERBID) ? (byte) -1 : (byte) 1;
                    break;
                case 98261:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_CAS) ? (byte) -1 : (byte) 2;
                    break;
                case 92668925:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_ADMOB) ? (byte) -1 : (byte) 3;
                    break;
                case 110546420:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_TOPON) ? (byte) -1 : (byte) 4;
                    break;
                case 1179703863:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_APPLOVIN) ? (byte) -1 : (byte) 5;
                    break;
                case 1271564347:
                    b10 = !str.equals(TenjinConsts.AD_NETWORK_TRADPLUS) ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_IRONSOURCE;
                    this.postURL = TenjinConsts.adRevenueIronSourceURL;
                    break;
                case 1:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_HYPERBID;
                    this.postURL = TenjinConsts.adRevenueHyperBidURL;
                    break;
                case 2:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_CAS;
                    this.postURL = TenjinConsts.adRevenueCASURL;
                    break;
                case 3:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_ADMOB;
                    this.postURL = TenjinConsts.adRevenueAdMobURL;
                    break;
                case 4:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_TOPON;
                    this.postURL = TenjinConsts.adRevenueTopOnURL;
                    break;
                case 5:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_APPLOVIN;
                    this.postURL = TenjinConsts.adRevenueAppLovinURL;
                    break;
                case 6:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_TRADPLUS;
                    this.postURL = TenjinConsts.adRevenueTradPlusURL;
                    break;
                default:
                    this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA;
                    this.postURL = TenjinConsts.adRevenueURL;
                    break;
            }
            this.adRevenueAdNetwork = str;
            this.eventId = EventKey.getEventKey(str, jSONObject, TenjinSDK.this.sessionId);
            this.adImpressionData = jSONObject;
        }

        private AsyncEvent(QueueEvent queueEvent) {
            this.postURL = TenjinConsts.eventUrl;
            this.intValue = 0;
            this.params = queueEvent.getParams();
            this.postURL = queueEvent.getEndpoint();
            this.event = queueEvent;
            this.eventId = EventKey.getEventKey(Integer.toString(queueEvent.getId()));
        }
    }

    private class AsyncGetAttributionInfo extends AsyncTask<Callback, Void, String> {
        private final AttributionInfoCallback attributionInfoCallback;

        public AsyncGetAttributionInfo(AttributionInfoCallback attributionInfoCallback) {
            this.attributionInfoCallback = attributionInfoCallback;
        }

        private String fetchAndReturnUserData() {
            Map<String, String> params = TenjinSDK.this.getParams();
            params.put("api_key", TenjinSDK.this.apiKey);
            String user = new HttpConnection().getUser(TenjinConsts.userUrl, params, TenjinSDK.this.context);
            if (user != null) {
                TenjinSDK.this.sendResultToAttributionInfoCallback(this.attributionInfoCallback, user);
            }
            return user;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(Callback... callbackArr) {
            int i10 = 0;
            String strFetchAndReturnUserData = null;
            while (i10 < 5) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempting to retrieve getAttributionInfo, attempt ");
                    int i11 = i10 + 1;
                    sb.append(i11);
                    sb.append(" of ");
                    sb.append(5);
                    Log.d(TenjinConsts.LOG_TAG, sb.toString());
                    if (TenjinSDK.this.isReadyToConnect()) {
                        strFetchAndReturnUserData = fetchAndReturnUserData();
                    }
                    if (strFetchAndReturnUserData != null && !strFetchAndReturnUserData.replaceAll("[\\s]+", "").equals("{}")) {
                        return strFetchAndReturnUserData;
                    }
                    Thread.sleep(Math.min((long) (Math.pow(2.0d, i10) * 1000.0d * (Math.random() + 0.5d)), 10000L));
                    i10 = i11;
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    return null;
                }
            }
            return strFetchAndReturnUserData;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            TenjinSDK.this.processOnPostExecuteCallback(str, TenjinConsts.EVENT_GET_ATTRIBUTION_INFO, this.attributionInfoCallback);
        }
    }

    private class AsyncGetDeeplink extends AsyncTask<Callback, Void, String> {
        private final Callback callback;

        public AsyncGetDeeplink(Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(Callback... callbackArr) {
            SharedPreferences sharedPreferences = TenjinSDK.this.context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
            boolean z9 = sharedPreferences.getBoolean(TenjinConsts.FIRST_LAUNCH_KEY, true);
            if (TenjinSDK.this.isReadyToConnect()) {
                if (z9) {
                    sharedPreferences.edit().putBoolean(TenjinConsts.FIRST_LAUNCH_KEY, false).apply();
                }
                Map<String, String> params = TenjinSDK.this.getParams();
                params.put("api_key", TenjinSDK.this.apiKey);
                String user = new HttpConnection().getUser(TenjinConsts.userUrl, params, TenjinSDK.this.context);
                if (user != null) {
                    TenjinSDK.this.sendResultToCallback(this.callback, user, z9);
                }
                return user;
            }
            TenjinSDK.this.callback = this.callback;
            try {
                Thread.sleep(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                if (z9) {
                    sharedPreferences.edit().putBoolean(TenjinConsts.FIRST_LAUNCH_KEY, false).apply();
                }
                Map<String, String> params2 = TenjinSDK.this.getParams();
                params2.put("api_key", TenjinSDK.this.apiKey);
                String user2 = new HttpConnection().getUser(TenjinConsts.userUrl, params2, TenjinSDK.this.context);
                if (user2 != null) {
                    TenjinSDK.this.sendResultToCallback(this.callback, user2, z9);
                }
                return user2;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            TenjinSDK.this.processOnPostExecuteCallback(str, TenjinConsts.EVENT_GET_DEEP_LINK, this.callback);
        }
    }

    private class AsyncUpdateConversion extends AsyncTask<Void, Void, Boolean> {
        private Integer conversionValue;
        private String eventId;
        private Map<String, String> postParams;

        private AsyncUpdateConversion(Integer num) {
            this.conversionValue = num;
            this.eventId = EventKey.getEventKey(TenjinConsts.REQUEST_CONVERSION_UPDATE, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            boolean zConnect;
            Log.d(TenjinConsts.LOG_TAG, "Starting conversion task");
            try {
                String str = "Basic " + Base64.encodeToString(TenjinSDK.this.apiKey.getBytes(), 10);
                HashMap map = new HashMap();
                map.put("Authorization", str);
                HashMap map2 = new HashMap();
                map2.put("conversion_value", this.conversionValue.toString());
                this.postParams = TenjinSDK.this.getParams(map2);
                zConnect = new HttpConnection().connect(TenjinConsts.conversionURL, this.postParams, map, TenjinSDK.this.context);
            } catch (Exception e10) {
                e10.printStackTrace();
                zConnect = false;
            }
            return Boolean.valueOf(zConnect);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                TenjinSDK.this.removeRequestQueue(this.eventId);
            } else {
                TenjinSDK.this.addRequestQueue(this.eventId);
            }
        }
    }

    private TenjinSDK(Context context, String str, String str2, Integer num) {
        this(getStandardParams(context), str, str2, num);
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.datasource = new TenjinDatasource(applicationContext);
        String strValueOf = String.valueOf(new Date().getTime());
        this.datasource.setInitializedAt(strValueOf);
        Log.d(TenjinConsts.LOG_TAG, "Stored initialized_at timestamp: " + strValueOf);
        this.userProfileManager = UserProfileManager.getInstance(this.context, this.datasource);
    }

    public static /* synthetic */ void a(TenjinSDK tenjinSDK2, List list) {
        tenjinSDK2.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QueueEvent queueEvent = (QueueEvent) it.next();
            queueEvent.getParams().put("retry_items", Integer.toString(list.size()));
            new AsyncEvent(queueEvent).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private void addAppSubversionToParams(Map<String, String> map) {
        Integer num = this.appSubversion;
        if (num == null || num.intValue() == 0) {
            return;
        }
        map.put("app_subversion", String.valueOf(this.appSubversion));
    }

    private boolean addConversionUpdateRequestQueue(int i10) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(TenjinConsts.REQUEST_CONVERSION_UPDATE, i10);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(eventKey, TenjinConsts.REQUEST_CONVERSION_UPDATE, i10));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void addCustomerUserIdToParams(Map<String, String> map) {
        map.put(TenjinConsts.CUSTOMER_USER_ID, getCustomerUserId());
    }

    private void addDeeplinkToParams(Map<String, String> map) {
        String str = this.deferredDeeplink;
        if (str != null) {
            map.put("deeplink_url", decodeDeeplink(str));
        }
    }

    private void addEphemeralDataToParams(Map<String, String> map) {
        map.put("session_id", this.sessionId);
        map.put("sent_at", String.valueOf(new Date().getTime()));
    }

    private void addInitializedAtToParams(Map<String, String> map) {
        String initializedAt;
        TenjinDatasource tenjinDatasource = this.datasource;
        if (tenjinDatasource == null || (initializedAt = tenjinDatasource.getInitializedAt()) == null) {
            return;
        }
        map.put("initialized_at", initializedAt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean addRequestQueue(String str) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void addRetryEnabledToParams(Map<String, String> map) {
        map.put(TenjinConsts.RETRY_ENABLED, new TenjinDatasource(this.context).getCacheEventSetting().toString());
    }

    private void addSandboxModeToParams(Map<String, String> map) {
        if (this.amazonSandboxMode) {
            map.put("sandbox", "true");
        }
    }

    private void addSignatureToParams(Map<String, String> map) {
        String str = this.sharedSecret;
        if (str != null) {
            map.put(InAppPurchaseMetaData.KEY_SIGNATURE, TenjinUtils.getHMACSignature(map, str));
        }
    }

    private void addUserProfileScalarParams(Map<String, String> map) {
        Map<String, String> scalarProfileMap;
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager == null || (scalarProfileMap = userProfileManager.getScalarProfileMap()) == null || scalarProfileMap.isEmpty()) {
            return;
        }
        map.putAll(scalarProfileMap);
    }

    private void applyTrackingParams(Map<String, String> map) {
        synchronized (this.paramProviders) {
            try {
                Iterator<ParamProvider> it = this.paramProviders.iterator();
                while (it.hasNext()) {
                    it.next().apply(map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String decodeDeeplink(String str) {
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            String strDecode2 = URLDecoder.decode(strDecode, "UTF-8");
            String strDecode3 = URLDecoder.decode(strDecode2, "UTF-8");
            if (str.equals(strDecode)) {
                return URLEncoder.encode(strDecode, "UTF-8");
            }
            if (strDecode.equals(strDecode2)) {
                return URLEncoder.encode(strDecode2, "UTF-8");
            }
            return strDecode2.equals(strDecode3) ? URLEncoder.encode(strDecode3, "UTF-8") : URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private void executeRequestWithCallback(String str, BasicCallback basicCallback) {
        if (requestIsProcessing(str)) {
            return;
        }
        if (connectSent.get()) {
            startAsyncTask(str, basicCallback);
            return;
        }
        addRequestQueue(str, basicCallback);
        if (this.connectTask != null) {
            connect();
        }
    }

    private double extractRevenueFromAdData(String str, JSONObject jSONObject) {
        try {
            if (TenjinConsts.AD_NETWORK_ADMOB.equals(str)) {
                if (jSONObject.has(AdMobHelper.KEY_VALUE_MICROS)) {
                    return jSONObject.getDouble(AdMobHelper.KEY_VALUE_MICROS) / 1000000.0d;
                }
                return 0.0d;
            }
            if (!TenjinConsts.AD_NETWORK_HYPERBID.equals(str) && !TenjinConsts.AD_NETWORK_TOPON.equals(str)) {
                if (jSONObject.has("revenue")) {
                    return jSONObject.getDouble("revenue");
                }
                return 0.0d;
            }
            if (jSONObject.has("publisher_revenue")) {
                return jSONObject.getDouble("publisher_revenue");
            }
            return 0.0d;
        } catch (Exception e10) {
            Log.d(TenjinConsts.LOG_TAG, "Error parsing revenue from ad data: " + e10.getMessage());
            return 0.0d;
        }
    }

    public static AppStoreType getAppStore() {
        return appStoreType;
    }

    public static TenjinSDK getInstance(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, (String) null, (Integer) null);
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    public static TenjinSDK getInstanceWithAppSubversion(Context context, String str, Integer num) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, (String) null, num);
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    public static TenjinSDK getInstanceWithSharedSecret(Context context, String str, String str2) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, str2, (Integer) null);
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    public static TenjinSDK getInstanceWithSharedSecretAppSubversion(Context context, String str, String str2, Integer num) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, str2, num);
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    private JSONObject getJsonObjectFromJsonString(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            Log.d(TenjinConsts.LOG_TAG, "Error while creating JSON object from string", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getParams() {
        return getParams(new HashMap());
    }

    private static List<ParamProvider> getStandardParams(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AndroidParams(context));
        arrayList.add(new TenjinParams(new SharedPrefsStore(context)));
        arrayList.add(new DMAParams(context));
        arrayList.add(new MetaReferrerParams(context));
        return arrayList;
    }

    private void handleCachedEvents() {
        TenjinDatasource tenjinDatasource = new TenjinDatasource(this.context);
        if (tenjinDatasource.getCacheEventSetting().booleanValue()) {
            tenjinDatasource.getAllEvents(new TenjinDatasource.TenjinCallback() { // from class: com.tenjin.android.a
                @Override // com.tenjin.android.store.TenjinDatasource.TenjinCallback
                public final void onEventsLoaded(List list) {
                    TenjinSDK.a(this.f42640a, list);
                }
            });
        }
    }

    private boolean hasJsonData(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).length() > 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private boolean inRequestQueue(String str) {
        return this.requestQueue.containsKey(str);
    }

    private boolean isILRDfeatureEnabled() {
        if (this.config.boolForKey(SDKConfigKeys.TenjinConfigKeyILRDEnabled).booleanValue()) {
            return true;
        }
        Log.d(TenjinConsts.LOG_TAG, "Received ILRD data, but ILRD feature is not enabled");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReadyToConnect() {
        TenjinStartup tenjinStartup = this.startup;
        if (tenjinStartup == null) {
            return false;
        }
        return tenjinStartup.completed().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processOnPostExecuteCallback(String str, String str2, BasicCallback basicCallback) {
        if (hasJsonData(str)) {
            removeRequestQueue(str2);
        } else {
            addRequestQueue(str2, basicCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processQueue() {
        synchronized (this.requestQueue) {
            try {
                Iterator<Map.Entry<String, Object>> it = this.requestQueue.entrySet().iterator();
                while (it.hasNext()) {
                    EventName eventName = (EventName) it.next().getValue();
                    String type = eventName.getType();
                    if (type.equals(TenjinConsts.EVENT_NAME)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getName()));
                        eventWithName(eventName.getName());
                    } else if (type.equals(TenjinConsts.EVENT_NAME_VALUE)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getName(), eventName.getValue()));
                        eventWithNameAndValue(eventName.getName(), eventName.getValue());
                    } else if (type.equals(TenjinConsts.EVENT_NAME_INT_VALUE)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getName(), eventName.getIntValue()));
                        eventWithNameAndValue(eventName.getName(), eventName.getIntValue());
                    } else if (type.equals(TenjinConsts.EVENT_NAME_TRANSACTION)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getProductId(), eventName.getCurrencyCode(), eventName.getQuantity(), eventName.getUnitPrice()));
                        transaction(eventName.getProductId(), eventName.getCurrencyCode(), eventName.getQuantity(), eventName.getUnitPrice());
                    } else if (type.equals(TenjinConsts.EVENT_NAME_TRANSACTION_DATA)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getProductId(), eventName.getCurrencyCode(), eventName.getQuantity(), eventName.getUnitPrice(), eventName.getPurchaseData(), eventName.getDataSignature()));
                        transaction(eventName.getProductId(), eventName.getCurrencyCode(), eventName.getQuantity(), eventName.getUnitPrice(), eventName.getPurchaseData(), eventName.getDataSignature());
                    } else if (type.equals(TenjinConsts.EVENT_NAME_TRANSACTION_AMAZON)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getProductId(), eventName.getCurrencyCode(), eventName.getQuantity(), eventName.getUnitPrice(), eventName.getReceiptId(), eventName.getUserId(), eventName.getPurchaseData()));
                        transactionAmazon(eventName.getTransactionData());
                    } else if (type.equals(TenjinConsts.EVENT_GET_DEEP_LINK)) {
                        removeProcessingRequest(TenjinConsts.EVENT_GET_DEEP_LINK);
                        getDeeplink(eventName.getDeferredDeeplinkCallback());
                    } else if (type.equals(TenjinConsts.EVENT_GET_ATTRIBUTION_INFO)) {
                        removeProcessingRequest(TenjinConsts.EVENT_GET_ATTRIBUTION_INFO);
                        getAttributionInfo(eventName.getAttributionInfoCallback());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_APPLOVIN)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionAppLovin(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_IRONSOURCE)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionIronSource(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_HYPERBID)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionHyperBid(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_ADMOB)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionAdMob(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_TOPON)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionTopOn(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_CAS)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionCAS(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA_TRADPLUS)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpressionTradPlus(eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.EVENT_AD_IMPRESSION_DATA) && eventName.getAdImpressionAdNetwork() != null) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData(), this.sessionId));
                        eventAdImpression(eventName.getAdImpressionAdNetwork(), eventName.getAdImpressionData());
                    } else if (type.equals(TenjinConsts.REQUEST_CONVERSION_UPDATE)) {
                        removeProcessingRequest(EventKey.getEventKey(eventName.getName()));
                        updateConversionValue(eventName.getIntValue());
                    }
                }
                this.requestQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean queueProcessingEvent(String str) {
        this.requestProcessingQueue.put(str, Long.valueOf(new Date().getTime()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeProcessingRequest(String str) {
        if (!this.requestProcessingQueue.containsKey(str)) {
            return false;
        }
        this.requestProcessingQueue.remove(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeRequestQueue(String str) {
        if (!this.requestQueue.containsKey(str)) {
            return false;
        }
        this.requestQueue.remove(str);
        return true;
    }

    private boolean requestIsProcessing(String str) {
        if (!this.requestProcessingQueue.containsKey(str)) {
            queueProcessingEvent(str);
            return false;
        }
        if (new Date().getTime() - this.requestProcessingQueue.get(str).longValue() < (str.equals("connect") ? this.connectThreshold : this.requestThreshold)) {
            return true;
        }
        removeProcessingRequest(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResultToAttributionInfoCallback(final AttributionInfoCallback attributionInfoCallback, String str) {
        HashMap map = new HashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    map.put("ad_network", jSONObject.optString("ad_network", null));
                    map.put(TenjinConsts.ATTR_PARAM_CAMPAIGN_NAME, jSONObject.optString(TenjinConsts.ATTR_PARAM_CAMPAIGN_NAME, null));
                    map.put(TenjinConsts.ATTR_PARAM_CAMPAIGN_ID, jSONObject.optString(TenjinConsts.ATTR_PARAM_CAMPAIGN_ID, null));
                    map.put(TenjinConsts.ATTR_PARAM_ADVERTISING_ID, jSONObject.optString(TenjinConsts.ATTR_PARAM_ADVERTISING_ID, null));
                    map.put(TenjinConsts.ATTR_PARAM_CREATIVE_NAME, jSONObject.optString(TenjinConsts.ATTR_PARAM_CREATIVE_NAME, null));
                    map.put(TenjinConsts.ATTR_PARAM_SITE_ID, jSONObject.optString(TenjinConsts.ATTR_PARAM_SITE_ID, null));
                    map.put(TenjinConsts.ATTR_PARAM_REMOTE_CAMPAIGN_ID, jSONObject.optString(TenjinConsts.ATTR_PARAM_REMOTE_CAMPAIGN_ID, null));
                    map.put("deferred_deeplink_url", jSONObject.optString("deferred_deeplink_url", null));
                    map.put(TenjinConsts.ATTR_PARAM_CLICK_ID, jSONObject.optString(TenjinConsts.ATTR_PARAM_CLICK_ID, null));
                    this.attributionResult = map;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tenjin.android.TenjinSDK.4
            @Override // java.lang.Runnable
            public void run() {
                attributionInfoCallback.onSuccess(TenjinSDK.this.attributionResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResultToCallback(final Callback callback, String str, final boolean z9) {
        AtomicBoolean atomicBoolean = deepLinkSent;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        HashMap map = new HashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    JSONArray jSONArrayNames = jSONObject.names();
                    for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                        map.put(jSONArrayNames.getString(i10), jSONObject.getString(jSONArrayNames.getString(i10)));
                    }
                    this.result = map;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.clickedTenjinLink = this.context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0).getBoolean(TenjinConsts.REFERRAL_SENT_KEY, false);
            if (map.get("ad_network") != null) {
                this.clickedTenjinLink = !Objects.equals(map.get("ad_network"), "organic");
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tenjin.android.TenjinSDK.3
            @Override // java.lang.Runnable
            public void run() {
                callback.onSuccess(TenjinSDK.this.clickedTenjinLink, z9, TenjinSDK.this.result);
            }
        });
    }

    public static void setWrapperVersion(String str) {
        wrapperVersion = str;
    }

    private void startAsyncTask(String str, BasicCallback basicCallback) {
        str.getClass();
        if (str.equals(TenjinConsts.EVENT_GET_DEEP_LINK)) {
            new AsyncGetDeeplink((Callback) basicCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Callback[0]);
        } else {
            if (str.equals(TenjinConsts.EVENT_GET_ATTRIBUTION_INFO)) {
                new AsyncGetAttributionInfo((AttributionInfoCallback) basicCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Callback[0]);
                return;
            }
            throw new IllegalStateException("Unexpected event name in executing request with callback: " + str);
        }
    }

    private void startup() {
        Context context = this.context;
        TenjinStartup tenjinStartup = new TenjinStartup(context, new SharedPrefsStore(context));
        this.startup = tenjinStartup;
        tenjinStartup.callback = new TenjinStartup.StartupCallback() { // from class: com.tenjin.android.TenjinSDK.1
            @Override // com.tenjin.android.utils.TenjinStartup.StartupCallback
            public void onStartupComplete(AttributionParams attributionParams, PlatformParams platformParams) {
                Log.d("TenjinStartup", "Startup completed");
                synchronized (TenjinSDK.this.paramProviders) {
                    if (attributionParams != null) {
                        try {
                            TenjinSDK.this.paramProviders.add(attributionParams);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (platformParams != null) {
                        TenjinSDK.this.paramProviders.add(platformParams);
                    }
                }
            }
        };
        TenjinUtils.runAsync(new Runnable() { // from class: com.tenjin.android.TenjinSDK.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (TenjinSDK.this.startupLock) {
                    TenjinSDK.this.startup.doStartup();
                    Log.d(TenjinConsts.LOG_TAG, "Releasing startup lock");
                }
            }
        });
    }

    public void appendAppSubversion(Integer num) {
        this.appSubversion = num;
    }

    public void connect() {
        connect(null, null);
    }

    public void eventAdImpression(String str, JSONObject jSONObject) {
        if (this.userProfileManager != null && jSONObject != null) {
            try {
                double dExtractRevenueFromAdData = extractRevenueFromAdData(str, jSONObject);
                if (dExtractRevenueFromAdData > 0.0d) {
                    this.userProfileManager.recordILRDRevenue(str, dExtractRevenueFromAdData);
                }
            } catch (Exception e10) {
                Log.d(TenjinConsts.LOG_TAG, "Error extracting ILRD revenue: " + e10.getMessage());
            }
        }
        String eventKey = EventKey.getEventKey(str, jSONObject, this.sessionId);
        if (!requestIsProcessing(eventKey) || inRequestQueue(eventKey)) {
            if (connectSent.get()) {
                handleCachedEvents();
                new AsyncEvent(str, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                addRequestQueue(str, jSONObject);
                if (this.connectTask == null) {
                    connect();
                }
            }
        }
    }

    public void eventAdImpressionAdMob(Object obj, Object obj2) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionAdMob(AdMobHelper.convertToJsonObject(obj, obj2));
        }
    }

    public void eventAdImpressionAppLovin(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionAppLovin(AppLovinHelper.convertToJsonObject(this.context, obj));
        }
    }

    public void eventAdImpressionCAS(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionCAS(CASHelper.convertToJsonObject(obj));
        }
    }

    public void eventAdImpressionHyperBid(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionHyperBid(HyperBidHelper.convertToJsonObject(obj));
        }
    }

    public void eventAdImpressionIronSource(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionIronSource(IronSourceHelper.convertToJsonObject(obj));
        }
    }

    public void eventAdImpressionTopOn(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionTopOn(TopOnHelper.convertToJsonObject(obj));
        }
    }

    public void eventAdImpressionTradPlus(Object obj) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionTradPlus(TradPlusHelper.convertToJsonObject(obj));
        }
    }

    public void eventWithName(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your event was not sent because the eventName was not valid.");
            return;
        }
        String eventKey = EventKey.getEventKey(str);
        if (!requestIsProcessing(eventKey) || inRequestQueue(eventKey)) {
            if (connectSent.get()) {
                handleCachedEvents();
                new AsyncEvent(str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                addRequestQueue(str);
                if (this.connectTask == null) {
                    connect();
                }
            }
        }
    }

    @Deprecated
    public void eventWithNameAndValue(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your event was not sent because the eventName or eventValue was not valid.");
            return;
        }
        String eventKey = EventKey.getEventKey(str, str2);
        if (!requestIsProcessing(eventKey) || inRequestQueue(eventKey)) {
            if (connectSent.get()) {
                handleCachedEvents();
                new AsyncEvent(str, str2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                addRequestQueue(str, str2);
                if (this.connectTask == null) {
                    connect();
                }
            }
        }
    }

    public String getAnalyticsInstallationId() {
        return new TenjinParams(new SharedPrefsStore(this.context)).getAnalyticsInstallationID();
    }

    public void getAttributionInfo(AttributionInfoCallback attributionInfoCallback) {
        executeRequestWithCallback(TenjinConsts.EVENT_GET_ATTRIBUTION_INFO, attributionInfoCallback);
    }

    public String getCustomerUserId() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
        Log.d(TenjinConsts.LOG_TAG, "Get customer user id");
        return sharedPreferences.getString(TenjinConsts.CUSTOMER_USER_ID, null);
    }

    public void getDeeplink(Callback callback) {
        executeRequestWithCallback(TenjinConsts.EVENT_GET_DEEP_LINK, callback);
    }

    public UserProfileData getUserProfile() {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            return userProfileManager.getProfileData();
        }
        return null;
    }

    public Map<String, Object> getUserProfileDictionary() {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            return userProfileManager.getProfileDictionary();
        }
        return null;
    }

    Map<String, String> getUserProfileScalarMap() {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            return userProfileManager.getScalarProfileMap();
        }
        return null;
    }

    public void optIn() {
        this.consentParamFilter.optIn();
    }

    public void optInGoogleDMA() {
        new GDPRHelper(this.context).setGoogleDMASetting(false);
    }

    public boolean optInOutUsingCMP() {
        boolean zOptIn = new GDPRHelper(this.context).optIn();
        if (zOptIn) {
            optIn();
            return zOptIn;
        }
        optOut();
        return zOptIn;
    }

    public void optInParams(String[] strArr) {
        this.consentParamFilter.optInToParameters(strArr);
    }

    public void optOut() {
        this.consentParamFilter.optOut();
    }

    public void optOutGoogleDMA() {
        new GDPRHelper(this.context).setGoogleDMASetting(true);
    }

    public void optOutParams(String[] strArr) {
        this.consentParamFilter.outOutOfParameters(strArr);
    }

    public void resetUserProfile() {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            userProfileManager.resetProfile();
        }
    }

    public void setAmazonSandboxMode() {
        this.amazonSandboxMode = true;
    }

    public void setAppStore(AppStoreType appStoreType2) {
        appStoreType = appStoreType2;
    }

    public void setCacheEventSetting(Boolean bool) {
        new TenjinDatasource(this.context).setCacheEventSetting(bool);
    }

    public void setCustomerUserId(String str) {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
        Log.d(TenjinConsts.LOG_TAG, "Set customer user id " + str);
        sharedPreferences.edit().putString(TenjinConsts.CUSTOMER_USER_ID, str).apply();
    }

    public void setEncryptRequestsSetting(Boolean bool) {
        new TenjinDatasource(this.context).setEncryptRequestsSetting(bool);
    }

    public void setGoogleDMAParameters(boolean z9, boolean z10) {
        new GDPRHelper(this.context).setGoogleDMAParameters(z9, z10);
    }

    public void setSessionTime(long j10) {
        this.connectThreshold = j10;
    }

    public void transaction(String str, String str2, int i10, double d10) {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            userProfileManager.recordIAPTransaction(str, str2, ((double) i10) * d10);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TenjinConsts.CUR_SET.contains(str2) || i10 <= 0) {
            Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your purchase was not sent because you didn't have valid parameters.");
            return;
        }
        if (requestIsProcessing(EventKey.getEventKey(str, str2, i10, d10))) {
            return;
        }
        if (connectSent.get()) {
            handleCachedEvents();
            new AsyncEvent(str, str2, i10, d10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            addRequestQueue(str, str2, i10, d10);
            if (this.connectTask == null) {
                connect();
            }
        }
    }

    public void transactionAmazon(String str, String str2, int i10, double d10, String str3, String str4, String str5) {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            userProfileManager.recordIAPTransaction(str, str2, ((double) i10) * d10);
        }
        Transaction transaction = new Transaction(AppStoreTypeEnum.AMAZON, str, str2, i10, d10, str3, str4, str5, "");
        if (!TextUtils.isEmpty(str5)) {
            try {
                transaction.setPurchaseData(URLEncoder.encode(str5, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your purchase was not sent because purchaseData failed to be encoded.");
            }
        }
        if (TextUtils.isEmpty(transaction.getProductId()) || TextUtils.isEmpty(transaction.getCurrencyCode()) || !TenjinConsts.CUR_SET.contains(transaction.getCurrencyCode()) || transaction.getQuantity() <= 0 || TextUtils.isEmpty(transaction.getReceiptId()) || TextUtils.isEmpty(transaction.getUserId())) {
            Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your purchase was not sent because you didn't have valid parameters.");
            return;
        }
        if (requestIsProcessing(EventKey.getEventKey(transaction))) {
            return;
        }
        if (connectSent.get()) {
            handleCachedEvents();
            new AsyncEvent(transaction).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            addRequestQueue(transaction);
            if (this.connectTask == null) {
                connect();
            }
        }
    }

    public void updateConversionValue(int i10) {
        Log.d(TenjinConsts.LOG_TAG, "update conversion value " + i10);
        String eventKey = EventKey.getEventKey(TenjinConsts.REQUEST_CONVERSION_UPDATE, i10);
        if (!requestIsProcessing(eventKey) || inRequestQueue(eventKey)) {
            if (connectSent.get()) {
                new AsyncUpdateConversion(Integer.valueOf(i10)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            }
            addConversionUpdateRequestQueue(i10);
            if (this.connectTask == null) {
                connect();
            }
        }
    }

    public void appendAppSubversion(int i10) {
        this.appSubversion = new Integer(i10);
    }

    public void connect(String str) {
        connect(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getParams(Map<String, String> map) {
        try {
            applyTrackingParams(map);
            addEphemeralDataToParams(map);
            addAppSubversionToParams(map);
            addDeeplinkToParams(map);
            addCustomerUserIdToParams(map);
            addRetryEnabledToParams(map);
            addInitializedAtToParams(map);
            addUserProfileScalarParams(map);
            map = this.consentParamFilter.apply(map);
            addSignatureToParams(map);
            addSandboxModeToParams(map);
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            return map;
        }
    }

    public void connect(String str, String str2) {
        Log.d(TenjinConsts.LOG_TAG, "Connecting...");
        if (str2 != null) {
            if (str2.toLowerCase().equals("optin")) {
                optIn();
            } else if (str2.toLowerCase().equals("optout")) {
                optOut();
            }
        }
        if (str != null) {
            this.deferredDeeplink = str;
        }
        if (!requestIsProcessing("connect") && this.connectTask == null) {
            this.connectTask = new AsyncConnect().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            Log.d(TenjinConsts.LOG_TAG, "Dropping duplicate connect call");
        }
    }

    public void eventAdImpressionAdMob(String str) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionAdMob(getJsonObjectFromJsonString(str));
        }
    }

    public void eventAdImpressionAppLovin(String str) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionAppLovin(getJsonObjectFromJsonString(str));
        }
    }

    public void eventAdImpressionCAS(String str) {
        if (isILRDfeatureEnabled()) {
            try {
                eventAdImpressionCAS(new JSONObject(str));
            } catch (JSONException e10) {
                Log.d(TenjinConsts.LOG_TAG, "Error while creating JSON CAS object from string", e10);
            }
        }
    }

    public void eventAdImpressionHyperBid(String str) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionHyperBid(getJsonObjectFromJsonString(str));
        }
    }

    public void eventAdImpressionIronSource(String str) {
        if (isILRDfeatureEnabled()) {
            eventAdImpressionIronSource(getJsonObjectFromJsonString(str));
        }
    }

    public void eventAdImpressionTopOn(String str) {
        if (isILRDfeatureEnabled()) {
            try {
                eventAdImpressionTopOn(new JSONObject(str));
            } catch (JSONException e10) {
                Log.d(TenjinConsts.LOG_TAG, "Error while creating JSON TopOn object from string", e10);
            }
        }
    }

    public void eventAdImpressionTradPlus(String str) {
        if (isILRDfeatureEnabled()) {
            try {
                eventAdImpressionTradPlus(new JSONObject(str));
            } catch (JSONException e10) {
                Log.d(TenjinConsts.LOG_TAG, "Error while creating JSON CAS object from string", e10);
            }
        }
    }

    public static TenjinSDK getInstanceWithAppSubversion(Context context, String str, int i10) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, (String) null, new Integer(i10));
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    public static TenjinSDK getInstanceWithSharedSecretAppSubversion(Context context, String str, String str2, int i10) {
        if (context == null || str == null) {
            return null;
        }
        if (tenjinSDK == null) {
            tenjinSDK = new TenjinSDK(context, str, str2, new Integer(i10));
        }
        tenjinSDK.startup();
        return tenjinSDK;
    }

    public void eventAdImpressionAdMob(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_ADMOB, jSONObject);
        }
    }

    public void eventAdImpressionAppLovin(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_APPLOVIN, jSONObject);
        }
    }

    public void eventAdImpressionHyperBid(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_HYPERBID, jSONObject);
        }
    }

    public void eventAdImpressionIronSource(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_IRONSOURCE, jSONObject);
        }
    }

    private TenjinSDK(List<ParamProvider> list, String str, String str2, Integer num) {
        this.consentParamFilter = new ConsentParamFilter();
        this.deferredDeeplink = null;
        this.clickedTenjinLink = false;
        this.connectThreshold = 0L;
        this.requestThreshold = 1000L;
        this.requestProcessingQueue = Collections.synchronizedMap(new LinkedHashMap());
        this.requestQueue = Collections.synchronizedMap(new LinkedHashMap());
        this.result = new HashMap();
        this.attributionResult = new HashMap();
        this.connectTask = null;
        this.amazonSandboxMode = false;
        this.apiKey = str;
        this.sharedSecret = str2;
        this.appSubversion = num;
        this.startupLock = new Object();
        this.sessionId = UUID.randomUUID().toString();
        this.config = new SDKConfig();
        this.paramProviders = list;
        TenjinUtils.startTime = new Date().getTime();
    }

    public void eventAdImpressionCAS(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_CAS, jSONObject);
        }
    }

    public void eventAdImpressionTopOn(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_TOPON, jSONObject);
        }
    }

    public void eventAdImpressionTradPlus(JSONObject jSONObject) {
        if (isILRDfeatureEnabled()) {
            eventAdImpression(TenjinConsts.AD_NETWORK_TRADPLUS, jSONObject);
        }
    }

    private boolean addRequestQueue(String str, String str2) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str, str2);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str, str2));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void eventWithNameAndValue(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            String eventKey = EventKey.getEventKey(str, i10);
            if (!requestIsProcessing(eventKey) || inRequestQueue(eventKey)) {
                if (!connectSent.get()) {
                    addRequestQueue(str, i10);
                    if (this.connectTask == null) {
                        connect();
                        return;
                    }
                    return;
                }
                handleCachedEvents();
                new AsyncEvent(str, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            }
            return;
        }
        Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your event was not sent because the eventName or eventValue is not valid.");
    }

    public void transaction(String str, String str2, int i10, double d10, String str3, String str4) {
        UserProfileManager userProfileManager = this.userProfileManager;
        if (userProfileManager != null) {
            userProfileManager.recordIAPTransaction(str, str2, ((double) i10) * d10);
        }
        try {
            String strEncode = URLEncoder.encode(str3, "UTF-8");
            String strEncode2 = URLEncoder.encode(str4, "UTF-8");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TenjinConsts.CUR_SET.contains(str2) && i10 > 0) {
                if (requestIsProcessing(EventKey.getEventKey(str, str2, i10, d10, strEncode, strEncode2))) {
                    return;
                }
                if (!connectSent.get()) {
                    addRequestQueue(str, str2, i10, d10, strEncode, strEncode2);
                    if (this.connectTask == null) {
                        connect();
                        return;
                    }
                    return;
                }
                handleCachedEvents();
                new AsyncEvent(str, str2, i10, d10, strEncode, strEncode2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            }
            Log.d(TenjinConsts.LOG_TAG, "Tenjin WARNING: Your purchase was not sent because you didn't have valid parameters.");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            transaction(str, str2, i10, d10);
        }
    }

    private boolean addRequestQueue(String str, int i10) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str, i10);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str, i10));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void transactionAmazon(Transaction transaction) {
        transactionAmazon(transaction.getProductId(), transaction.getCurrencyCode(), transaction.getQuantity(), transaction.getUnitPrice(), transaction.getReceiptId(), transaction.getUserId(), transaction.getPurchaseData());
    }

    private boolean addRequestQueue(Transaction transaction) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(transaction);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(transaction));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean addRequestQueue(String str, String str2, int i10, double d10) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str, str2, i10, d10);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str, str2, i10, d10));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean addRequestQueue(String str, String str2, int i10, double d10, String str3, String str4) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str, str2, i10, d10, str3, str4);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str, str2, i10, d10, str3, str4));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean addRequestQueue(String str, JSONObject jSONObject) {
        synchronized (this.requestQueue) {
            try {
                String eventKey = EventKey.getEventKey(str, jSONObject, this.sessionId);
                if (this.requestQueue.containsKey(eventKey)) {
                    return false;
                }
                this.requestQueue.put(eventKey, new EventName(str, jSONObject));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean addRequestQueue(String str, BasicCallback basicCallback) {
        synchronized (this.requestQueue) {
            try {
                if (this.requestQueue.containsKey(str)) {
                    return false;
                }
                this.requestQueue.put(str, new EventName(str, basicCallback));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean addRequestQueue(AsyncEvent asyncEvent) {
        String str = asyncEvent.type;
        str.getClass();
        switch (str) {
            case "eventNameValue":
                return addRequestQueue(asyncEvent.name, asyncEvent.value);
            case "eventNameTransactionData":
                return addRequestQueue(asyncEvent.productId, asyncEvent.currencyCode, asyncEvent.quantity, asyncEvent.unitPrice, asyncEvent.purchaseData, asyncEvent.dataSignature);
            case "eventNameIntValue":
                return addRequestQueue(asyncEvent.name, asyncEvent.intValue);
            case "eventAdImpressionDataAdMob":
            case "eventAdImpressionDataTopOn":
            case "eventAdImpressionDataHyperBid":
            case "eventAdImpressionData":
            case "eventAdImpressionDataIronSource":
            case "eventAdImpressionDataAppLovin":
            case "eventAdImpressionDataTradPlus":
            case "eventAdImpressionDataCAS":
                return addRequestQueue(asyncEvent.adRevenueAdNetwork, asyncEvent.adImpressionData);
            case "eventName":
                return addRequestQueue(asyncEvent.name);
            case "eventNameTransaction":
                return addRequestQueue(asyncEvent.productId, asyncEvent.currencyCode, asyncEvent.quantity, asyncEvent.unitPrice);
            default:
                return false;
        }
    }
}
