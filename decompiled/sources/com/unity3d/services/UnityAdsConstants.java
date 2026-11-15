package com.unity3d.services;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

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
public final class UnityAdsConstants {

    @NotNull
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    @Metadata
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;

        @NotNull
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    @Metadata
    public static final class Cache {

        @NotNull
        public static final String CACHE_SCHEME = "unity-ads-cache";

        @NotNull
        public static final String DATASTORE_PATH = "unityAdsDatastore/";

        @NotNull
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    @Metadata
    public static final class ClientInfo {

        @NotNull
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41606;

        @NotNull
        public static final String SDK_VERSION_NAME = "4.16.6";

        private ClientInfo() {
        }
    }

    @Metadata
    public static final class DefaultUrls {

        @NotNull
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";

        @NotNull
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";

        @NotNull
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&mode=ad-viewer&";

        @NotNull
        public static final String CACHE_DIR_NAME = "UnityAdsCache";

        @NotNull
        public static final String CACHE_WEBVIEW_DIR_NAME = "webview_cache";

        @NotNull
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";

        @NotNull
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";

        @NotNull
        public static final String HTTP_CACHE_OK_HTTP_DIR_NAME = "UnityAdsOkHttpCache";

        @NotNull
        public static final DefaultUrls INSTANCE = new DefaultUrls();

        @NotNull
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";

        @NotNull
        public static final String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";

        @NotNull
        public static final String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    @Metadata
    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;

        @NotNull
        public static final ErrorHandler INSTANCE = new ErrorHandler();

        private ErrorHandler() {
        }
    }

    @Metadata
    public static final class Messages {

        @NotNull
        public static final Messages INSTANCE = new Messages();

        @NotNull
        public static final String MSG_INTERNAL_ERROR = "Internal error";

        @NotNull
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    @Metadata
    public static final class OpenMeasurement {

        @NotNull
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();

        @NotNull
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";

        @NotNull
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";

        @NotNull
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";

        @NotNull
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";

        @NotNull
        public static final String OM_PARTNER_NAME = "Unity3d";

        @NotNull
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    @Metadata
    public static final class Preferences {

        @NotNull
        public static final Preferences INSTANCE = new Preferences();

        @NotNull
        public static final String PREF_KEY_AUID = "auid";

        @NotNull
        public static final String PREF_KEY_IDFI = "unityads-idfi";

        @NotNull
        public static final String PREF_KEY_UNITY_INSTALLATION_ID = "unity_connect.installation_id";

        @NotNull
        public static final String PREF_KEY_UNITY_MEGA_SESSION_ID = "unity_connect.mega_session_id";

        @NotNull
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";

        @NotNull
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        @NotNull
        private static final String UNITY_PLAYER_PREF_PREFIX = "unity_connect";

        private Preferences() {
        }
    }

    @Metadata
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;

        @NotNull
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        private RequestPolicy() {
        }
    }

    @Metadata
    public static final class SafeGuards {

        @NotNull
        public static final SafeGuards INSTANCE = new SafeGuards();

        @Metadata
        public static final class InitRequestRetryPolicy {

            @NotNull
            public static final InitRequestRetryPolicy INSTANCE = new InitRequestRetryPolicy();
            public static final float MAX_JITTER_PCT = 100.0f;
            public static final int MIN_DURATION = 5000;
            public static final float MIN_JITTER_PCT = 0.0f;
            public static final int MIN_MAX_INTERVAL = 0;
            public static final float MIN_SCALING_FACTOR = 0.1f;
            public static final int MIN_WAIT_BASE = 0;

            private InitRequestRetryPolicy() {
            }
        }

        @Metadata
        public static final class InitRequestTimeoutPolicy {

            @NotNull
            public static final InitRequestTimeoutPolicy INSTANCE = new InitRequestTimeoutPolicy();
            public static final int MIN_TIMEOUT = 1000;

            private InitRequestTimeoutPolicy() {
            }
        }

        private SafeGuards() {
        }
    }

    @Metadata
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;

        @NotNull
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    @Metadata
    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000;

        @NotNull
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    private UnityAdsConstants() {
    }
}
