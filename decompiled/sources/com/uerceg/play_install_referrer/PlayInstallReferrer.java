package com.uerceg.play_install_referrer;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes3.dex */
public class PlayInstallReferrer extends ReactContextBaseJavaModule {

    class a implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f42718a;

        /* JADX INFO: renamed from: com.uerceg.play_install_referrer.PlayInstallReferrer$a$a, reason: collision with other inner class name */
        class RunnableC0398a implements Runnable {
            RunnableC0398a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        ReferrerDetails installReferrer = a.this.f42718a.getInstallReferrer();
                        if (installReferrer != null) {
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                            long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                            long referrerClickTimestampServerSeconds = installReferrer.getReferrerClickTimestampServerSeconds();
                            long installBeginTimestampServerSeconds = installReferrer.getInstallBeginTimestampServerSeconds();
                            String installVersion = installReferrer.getInstallVersion();
                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            writableMapCreateMap.putString("installReferrer", installReferrer2);
                            writableMapCreateMap.putString("referrerClickTimestampSeconds", Long.toString(referrerClickTimestampSeconds));
                            writableMapCreateMap.putString("installBeginTimestampSeconds", Long.toString(installBeginTimestampSeconds));
                            writableMapCreateMap.putString("referrerClickTimestampServerSeconds", Long.toString(referrerClickTimestampServerSeconds));
                            writableMapCreateMap.putString("installBeginTimestampServerSeconds", Long.toString(installBeginTimestampServerSeconds));
                            writableMapCreateMap.putString("installVersion", installVersion);
                            writableMapCreateMap.putString("googlePlayInstant", Boolean.toString(googlePlayInstantParam));
                            PlayInstallReferrer playInstallReferrer = PlayInstallReferrer.this;
                            playInstallReferrer.sendEvent(playInstallReferrer.getReactApplicationContext(), "play_install_referrer_value", writableMapCreateMap);
                        } else {
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            writableMapCreateMap2.putString(PglCryptUtils.KEY_MESSAGE, "Response from install referrer library was null");
                            PlayInstallReferrer playInstallReferrer2 = PlayInstallReferrer.this;
                            playInstallReferrer2.sendEvent(playInstallReferrer2.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap2);
                        }
                    } catch (RemoteException e10) {
                        WritableMap writableMapCreateMap3 = Arguments.createMap();
                        writableMapCreateMap3.putString(PglCryptUtils.KEY_MESSAGE, "Exception while reading install referrer info: " + e10.getMessage());
                        PlayInstallReferrer playInstallReferrer3 = PlayInstallReferrer.this;
                        playInstallReferrer3.sendEvent(playInstallReferrer3.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap3);
                    }
                } finally {
                    a.this.f42718a.endConnection();
                }
            }
        }

        a(InstallReferrerClient installReferrerClient) {
            this.f42718a = installReferrerClient;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (i10 == -1) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("responseCode", "SERVICE_DISCONNECTED");
                writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, "SERVICE_DISCONNECTED");
                PlayInstallReferrer playInstallReferrer = PlayInstallReferrer.this;
                playInstallReferrer.sendEvent(playInstallReferrer.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap);
                this.f42718a.endConnection();
                return;
            }
            if (i10 == 0) {
                new Thread(new RunnableC0398a()).start();
                return;
            }
            if (i10 == 1) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("responseCode", "SERVICE_UNAVAILABLE");
                writableMapCreateMap2.putString(PglCryptUtils.KEY_MESSAGE, "SERVICE_UNAVAILABLE");
                PlayInstallReferrer playInstallReferrer2 = PlayInstallReferrer.this;
                playInstallReferrer2.sendEvent(playInstallReferrer2.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap2);
                this.f42718a.endConnection();
                return;
            }
            if (i10 == 2) {
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("responseCode", "FEATURE_NOT_SUPPORTED");
                writableMapCreateMap3.putString(PglCryptUtils.KEY_MESSAGE, "FEATURE_NOT_SUPPORTED");
                PlayInstallReferrer playInstallReferrer3 = PlayInstallReferrer.this;
                playInstallReferrer3.sendEvent(playInstallReferrer3.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap3);
                this.f42718a.endConnection();
                return;
            }
            if (i10 != 3) {
                return;
            }
            WritableMap writableMapCreateMap4 = Arguments.createMap();
            writableMapCreateMap4.putString("responseCode", "DEVELOPER_ERROR");
            writableMapCreateMap4.putString(PglCryptUtils.KEY_MESSAGE, "DEVELOPER_ERROR");
            PlayInstallReferrer playInstallReferrer4 = PlayInstallReferrer.this;
            playInstallReferrer4.sendEvent(playInstallReferrer4.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap4);
            this.f42718a.endConnection();
        }
    }

    public PlayInstallReferrer(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getInstallReferrerInfo() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(getReactApplicationContext()).build();
            installReferrerClientBuild.startConnection(new a(installReferrerClientBuild));
        } catch (Throwable th) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, "Exception while starting connection with referrer client: " + th.getMessage());
            sendEvent(getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlayInstallReferrer";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
