package com.tenjin.android.params.referral;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.tenjin.android.utils.Reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class PlayStoreInstallReferrer implements InvocationHandler {
    private static final String REFERRER_LOG_TAG = "Tenjin";
    private static final ExecutorService referrerCallbackExecutor = Executors.newSingleThreadExecutor();
    private static final int referrerRetryLimit = 3;
    public PlayStoreAttributionCallback callback;
    private final ExecutorService callbackExecutor;
    private final Context context;
    private Object googleInstallReferrerClient;
    private final InstallReferrerClientFactory installReferrerClientFactory;
    private final Object installReferrerLock;
    private boolean installReferrerReceived;
    private int referrerRetryCount;

    static class GooglePlayInstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int DISCONNECTED = -1;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_UNAVAILABLE = 1;

        GooglePlayInstallReferrerResponse() {
        }
    }

    interface InstallReferrerClientFactory {
        Object create(Context context);
    }

    public interface PlayStoreAttributionCallback {
        void onComplete(String str, long j10, long j11);

        void onFail();
    }

    static class ReflectionInstallReferrerClientFactory implements InstallReferrerClientFactory {
        ReflectionInstallReferrerClientFactory() {
        }

        @Override // com.tenjin.android.params.referral.PlayStoreInstallReferrer.InstallReferrerClientFactory
        public Object create(Context context) {
            return Reflection.runInstanceMethod(Reflection.runStaticMethod("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", null, new Object[0]);
        }
    }

    public PlayStoreInstallReferrer(Context context) {
        this(context, new ReflectionInstallReferrerClientFactory(), referrerCallbackExecutor);
    }

    public static /* synthetic */ void a(PlayStoreInstallReferrer playStoreInstallReferrer, Integer num) {
        playStoreInstallReferrer.getClass();
        playStoreInstallReferrer.handleGooglePlayReferrerClientResponse(num.intValue());
    }

    private void closeInstallReferrerClient() {
        Object obj = this.googleInstallReferrerClient;
        if (obj == null) {
            return;
        }
        try {
            Reflection.runInstanceMethod(obj, "endConnection", null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.googleInstallReferrerClient = null;
    }

    private Object createInstallReferrerClient(Context context) {
        try {
            return this.installReferrerClientFactory.create(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private Object createProxyInstallReferrerStateListener(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException | NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private Object getInstallReferrerDetails() {
        Object obj = this.googleInstallReferrerClient;
        if (obj == null) {
            return null;
        }
        try {
            return Reflection.runInstanceMethod(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private Class getInstallReferrerStateListenerClass() {
        return InstallReferrerStateListener.class;
    }

    private InstallReferrerDetails getReferralData(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InstallReferrerDetails((String) Reflection.runInstanceMethod(obj, "getInstallReferrer", null, new Object[0]), ((Long) Reflection.runInstanceMethod(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue(), ((Long) Reflection.runInstanceMethod(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGooglePlayReferrerClientResponse(final int i10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.callbackExecutor.execute(new Runnable() { // from class: com.tenjin.android.params.referral.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42648a.handleGooglePlayReferrerClientResponse(i10);
                }
            });
            return;
        }
        Log.d("Tenjin", "installReferrer client response: " + i10);
        if (i10 == -1) {
            retryGoogleInstallClientConnection();
            return;
        }
        if (i10 == 0) {
            tryExtractReferralDetails();
            return;
        }
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            closeInstallReferrerClient();
            return;
        }
        PlayStoreAttributionCallback playStoreAttributionCallback = this.callback;
        if (playStoreAttributionCallback != null) {
            playStoreAttributionCallback.onFail();
        }
    }

    private void retryGoogleInstallClientConnection() {
        synchronized (this.installReferrerLock) {
            try {
                if (this.installReferrerReceived) {
                    return;
                }
                int i10 = this.referrerRetryCount + 1;
                this.referrerRetryCount = i10;
                if (i10 > 3) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                    startConnection();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean startGoogleInstallReferrerConnection(Class cls, Object obj) {
        try {
            Reflection.runInstanceMethod(this.googleInstallReferrerClient, "startConnection", new Class[]{cls}, obj);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void tryExtractReferralDetails() {
        try {
            InstallReferrerDetails referralData = getReferralData(getInstallReferrerDetails());
            PlayStoreAttributionCallback playStoreAttributionCallback = this.callback;
            if (playStoreAttributionCallback != null) {
                playStoreAttributionCallback.onComplete(referralData.url, referralData.clickTimestamp, referralData.installTimestamp);
            }
            Log.d("Tenjin", "installReferrer: " + referralData.url);
            Log.d("Tenjin", "clickTime: " + referralData.clickTimestamp);
            Log.d("Tenjin", "installBeginTime: " + referralData.installTimestamp);
            synchronized (this.installReferrerLock) {
                this.installReferrerReceived = true;
            }
            closeInstallReferrerClient();
        } catch (Exception unused) {
            retryGoogleInstallClientConnection();
        }
    }

    public boolean getInstallReferrer(PlayStoreAttributionCallback playStoreAttributionCallback) {
        if (playStoreAttributionCallback == null) {
            Log.e("Tenjin", "getInstallReferrer callback is null");
            return false;
        }
        this.callback = playStoreAttributionCallback;
        return startConnection();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name;
        if (method == null || (name = method.getName()) == null) {
            return null;
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                Log.d("Tenjin", "InstallReferrer onInstallReferrerSetupFinished responseCode no result");
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof Integer)) {
                Log.d("Tenjin", "InstallReferrer onInstallReferrerSetupFinished responseCode not int");
                return null;
            }
            final Integer num = (Integer) obj2;
            this.callbackExecutor.execute(new Runnable() { // from class: com.tenjin.android.params.referral.b
                @Override // java.lang.Runnable
                public final void run() {
                    PlayStoreInstallReferrer.a(this.f42650a, num);
                }
            });
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            Log.d("Tenjin", "InstallReferrer onInstallReferrerServiceDisconnected");
        }
        return null;
    }

    public boolean startConnection() {
        Log.d("Tenjin", "Attempting to retrieve Play Store referral info, attempt " + this.referrerRetryCount + 1);
        synchronized (this.installReferrerLock) {
            try {
                closeInstallReferrerClient();
                if (this.installReferrerReceived) {
                    return false;
                }
                Context context = this.context;
                if (context == null) {
                    return false;
                }
                Object objCreateInstallReferrerClient = createInstallReferrerClient(context);
                this.googleInstallReferrerClient = objCreateInstallReferrerClient;
                if (objCreateInstallReferrerClient == null) {
                    return false;
                }
                Class installReferrerStateListenerClass = getInstallReferrerStateListenerClass();
                if (installReferrerStateListenerClass == null) {
                    return false;
                }
                Object objCreateProxyInstallReferrerStateListener = createProxyInstallReferrerStateListener(installReferrerStateListenerClass);
                if (objCreateProxyInstallReferrerStateListener == null) {
                    return false;
                }
                return startGoogleInstallReferrerConnection(installReferrerStateListenerClass, objCreateProxyInstallReferrerStateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    PlayStoreInstallReferrer(Context context, InstallReferrerClientFactory installReferrerClientFactory, ExecutorService executorService) {
        this.referrerRetryCount = 0;
        this.context = context.getApplicationContext();
        this.installReferrerLock = new Object();
        this.installReferrerReceived = false;
        this.installReferrerClientFactory = installReferrerClientFactory;
        this.callbackExecutor = executorService;
    }
}
