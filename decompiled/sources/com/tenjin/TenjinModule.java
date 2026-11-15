package com.tenjin;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.tenjin.TenjinModule;
import com.tenjin.android.AttributionInfoCallback;
import com.tenjin.android.TenjinSDK;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129m8.k;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class TenjinModule extends NativeTenjinSpec {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String NAME = "Tenjin";

    @Nullable
    private TenjinSDK instance;

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TenjinModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final JSONArray convertArrayToJson(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                case 1:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i10));
                    break;
                case 3:
                    jSONArray.put(readableArray.getDouble(i10));
                    break;
                case 4:
                    jSONArray.put(readableArray.getString(i10));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i10);
                    if (map == null || jSONArray.put(convertMapToJson(map)) == null) {
                        jSONArray.put(JSONObject.NULL);
                    }
                    break;
                case 6:
                    ReadableArray array = readableArray.getArray(i10);
                    if (array == null || jSONArray.put(convertArrayToJson(array)) == null) {
                        jSONArray.put(JSONObject.NULL);
                    }
                    break;
                default:
                    throw new k();
            }
        }
        return jSONArray;
    }

    private final WritableArray convertJsonToArray(JSONArray jSONArray) throws JSONException {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }

    private final WritableMap convertJsonToMap(JSONObject jSONObject) throws JSONException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                Intrinsics.c(next);
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                Intrinsics.c(next);
                writableNativeMap.putArray(next, convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                Intrinsics.c(next);
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                Intrinsics.c(next);
                writableNativeMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                Intrinsics.c(next);
                writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                Intrinsics.c(next);
                writableNativeMap.putString(next, (String) obj);
            } else {
                Intrinsics.c(next);
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    private final WritableArray convertListToWritableArray(List<?> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                writableNativeArray.pushMap(convertMapToWritableMap((Map) obj));
            } else if (obj instanceof List) {
                writableNativeArray.pushArray(convertListToWritableArray((List) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                writableNativeArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(String.valueOf(obj));
            }
        }
        return writableNativeArray;
    }

    private final JSONObject convertMapToJson(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    jSONObject.put(strNextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    Intrinsics.c(map);
                    jSONObject.put(strNextKey, convertMapToJson(map));
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(strNextKey);
                    Intrinsics.c(array);
                    jSONObject.put(strNextKey, convertArrayToJson(array));
                    break;
                default:
                    throw new k();
            }
        }
        return jSONObject;
    }

    private final WritableMap convertMapToWritableMap(Map<String, ? extends Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                writableNativeMap.putMap(key, convertMapToWritableMap((Map) value));
            } else if (value instanceof List) {
                writableNativeMap.putArray(key, convertListToWritableArray((List) value));
            } else if (value instanceof Boolean) {
                writableNativeMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableNativeMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                writableNativeMap.putDouble(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                writableNativeMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                writableNativeMap.putString(key, (String) value);
            } else {
                writableNativeMap.putString(key, value.toString());
            }
        }
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAttributionInfo$lambda$0(AtomicBoolean atomicBoolean, Callback callback, TenjinModule tenjinModule, Callback callback2, Map map) {
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        try {
            Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            callback.invoke(tenjinModule.convertJsonToMap(new JSONObject(map)));
        } catch (JSONException e10) {
            callback2.invoke("JSON Parsing Error: " + e10.getMessage());
        }
    }

    private final String[] readableToArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            String string = readableArray.getString(i10);
            if (string == null) {
                string = "";
            }
            strArr[i10] = string;
        }
        return strArr;
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void appendAppSubversion(double d10) {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.appendAppSubversion((int) d10);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void connect() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.connect();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionAdMob(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionAdMob(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionAppLovin(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionAppLovin(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionHyperBid(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionHyperBid(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionIronSource(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionIronSource(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionTopOn(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionTopOn(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventAdImpressionTradPlus(@NotNull ReadableMap json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            TenjinSDK tenjinSDK = this.instance;
            if (tenjinSDK != null) {
                tenjinSDK.eventAdImpressionTradPlus(convertMapToJson(json));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventWithName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.eventWithName(name);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void eventWithNameAndValue(@NotNull String name, double d10) {
        Intrinsics.checkNotNullParameter(name, "name");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.eventWithNameAndValue(name, (int) d10);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void getAnalyticsInstallationId(@NotNull Callback callback) {
        String analyticsInstallationId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK == null || (analyticsInstallationId = tenjinSDK.getAnalyticsInstallationId()) == null) {
            analyticsInstallationId = "";
        }
        callback.invoke(analyticsInstallationId);
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void getAttributionInfo(@NotNull final Callback successCallback, @NotNull final Callback errorCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(errorCallback, "errorCallback");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.getAttributionInfo(new AttributionInfoCallback() { // from class: R7.a
                @Override // com.tenjin.android.AttributionInfoCallback
                public final void onSuccess(Map map) {
                    TenjinModule.getAttributionInfo$lambda$0(atomicBoolean, successCallback, this, errorCallback, map);
                }
            });
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void getCustomerUserId(@NotNull Callback callback) {
        String customerUserId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK == null || (customerUserId = tenjinSDK.getCustomerUserId()) == null) {
            customerUserId = "";
        }
        callback.invoke(customerUserId);
    }

    @Override // com.tenjin.NativeTenjinSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Tenjin";
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void getUserProfileDictionary(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        TenjinSDK tenjinSDK = this.instance;
        Map<String, Object> userProfileDictionary = tenjinSDK != null ? tenjinSDK.getUserProfileDictionary() : null;
        if (userProfileDictionary == null) {
            callback.invoke(new WritableNativeMap());
            return;
        }
        try {
            callback.invoke(convertMapToWritableMap(userProfileDictionary));
        } catch (Exception unused) {
            callback.invoke(new WritableNativeMap());
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void initialize(@NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.instance = TenjinSDK.getInstance(this.reactContext, apiKey);
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optIn() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optIn();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optInGoogleDMA() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optInGoogleDMA();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optInOutUsingCMP() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optInOutUsingCMP();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optInParams(@NotNull ReadableArray params) {
        Intrinsics.checkNotNullParameter(params, "params");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optInParams(readableToArray(params));
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optOut() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optOut();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optOutGoogleDMA() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optOutGoogleDMA();
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void optOutParams(@NotNull ReadableArray params) {
        Intrinsics.checkNotNullParameter(params, "params");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.optOutParams(readableToArray(params));
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void resetUserProfile() {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.resetUserProfile();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void setAppStore(@NotNull String type) {
        TenjinSDK.AppStoreType appStoreType;
        Intrinsics.checkNotNullParameter(type, "type");
        int iHashCode = type.hashCode();
        if (iHashCode != -1534319379) {
            if (iHashCode != -1414265340) {
                if (iHashCode == 106069776 && type.equals("other")) {
                    appStoreType = TenjinSDK.AppStoreType.other;
                } else {
                    appStoreType = TenjinSDK.AppStoreType.unspecified;
                }
            } else if (type.equals("amazon")) {
                appStoreType = TenjinSDK.AppStoreType.amazon;
            } else {
                appStoreType = TenjinSDK.AppStoreType.unspecified;
            }
        } else if (type.equals("googleplay")) {
            appStoreType = TenjinSDK.AppStoreType.googleplay;
        } else {
            appStoreType = TenjinSDK.AppStoreType.unspecified;
        }
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.setAppStore(appStoreType);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void setCacheEventSetting(boolean z9) {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.setCacheEventSetting(Boolean.valueOf(z9));
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void setCustomerUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.setCustomerUserId(userId);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void setEncryptRequestsSetting(boolean z9) {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.setEncryptRequestsSetting(Boolean.valueOf(z9));
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void setGoogleDMAParameters(boolean z9, boolean z10) {
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.setGoogleDMAParameters(z9, z10);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void transaction(@NotNull String productName, @NotNull String currencyCode, double d10, double d11) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.transaction(productName, currencyCode, (int) d10, d11);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void transactionWithDataSignature(@NotNull String productName, @NotNull String currencyCode, double d10, double d11, @NotNull String purchaseData, @NotNull String dataSignature) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Intrinsics.checkNotNullParameter(dataSignature, "dataSignature");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.transaction(productName, currencyCode, (int) d10, d11, purchaseData, dataSignature);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void transactionWithReceipt(@NotNull String productName, @NotNull String currencyCode, double d10, double d11, @NotNull String transaction, @NotNull String data) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(data, "data");
        TenjinSDK tenjinSDK = this.instance;
        if (tenjinSDK != null) {
            tenjinSDK.transaction(productName, currencyCode, (int) d10, d11, transaction, data);
        }
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void updatePostbackConversionValue(double d10) {
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void updatePostbackConversionValueWithCoarseValue(double d10, @NotNull String coarseValue) {
        Intrinsics.checkNotNullParameter(coarseValue, "coarseValue");
    }

    @Override // com.tenjin.NativeTenjinSpec
    @ReactMethod
    public void updatePostbackConversionValueWithCoarseValueAndLockWindow(double d10, @NotNull String coarseValue, boolean z9) {
        Intrinsics.checkNotNullParameter(coarseValue, "coarseValue");
    }
}
