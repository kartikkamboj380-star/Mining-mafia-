package com.tenjin.android.params.referral;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.utils.Reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public class HuaweiInstallReferrer implements InvocationHandler {
    private static final String TAG = "HuaweiInstallReferrer";
    private static final int referrerRetryLimit = 3;
    public HuaweiAttributionCallback callback;
    private final Context context;
    private Object installReferrerClient;
    private int referrerRetryCount = 0;
    private final boolean IS_TEST = false;
    private final Object installReferrerLock = new Object();
    private boolean installReferrerReceived = false;

    public interface HuaweiAttributionCallback {
        void onComplete(String str, long j10, long j11);

        void onFail();
    }

    static class InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;

        InstallReferrerResponse() {
        }
    }

    public HuaweiInstallReferrer(Context context) {
        this.context = context;
    }

    private void closeInstallReferrerClient() {
        Object obj = this.installReferrerClient;
        if (obj == null) {
            return;
        }
        try {
            Reflection.runInstanceMethod(obj, "endConnection", null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.installReferrerClient = null;
    }

    private Object createInstallReferrerClient(Context context) {
        try {
            Object objRunStaticMethod = Reflection.runStaticMethod("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context);
            if (objRunStaticMethod == null) {
                return null;
            }
            objRunStaticMethod.getClass().getDeclaredMethod("setTest", Boolean.TYPE).invoke(objRunStaticMethod, Boolean.FALSE);
            return Reflection.runInstanceMethod(objRunStaticMethod, "build", null, new Object[0]);
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
        Object obj = this.installReferrerClient;
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
        try {
            return Class.forName("com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private InstallReferrerDetails getReferralData(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InstallReferrerDetails((String) Reflection.runInstanceMethod(obj, "getInstallReferrer", null, new Object[0]), ((Long) Reflection.runInstanceMethod(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue(), ((Long) Reflection.runInstanceMethod(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue());
    }

    private void handleInstallReferrerClientResponse(int i10) {
        Log.d(TAG, "installReferrer client response: " + i10);
        if (i10 == -1) {
            retryInstallClientConnection();
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
        HuaweiAttributionCallback huaweiAttributionCallback = this.callback;
        if (huaweiAttributionCallback != null) {
            huaweiAttributionCallback.onFail();
        }
    }

    private void handleReferralDetails(InstallReferrerDetails installReferrerDetails) {
        if (installReferrerDetails != null) {
            Log.d(TAG, "installReferrer: " + installReferrerDetails.url);
            Log.d(TAG, "clickTime: " + installReferrerDetails.clickTimestamp);
            Log.d(TAG, "installBeginTime: " + installReferrerDetails.installTimestamp);
        }
        HuaweiAttributionCallback huaweiAttributionCallback = this.callback;
        if (huaweiAttributionCallback != null) {
            if (installReferrerDetails != null) {
                huaweiAttributionCallback.onComplete(installReferrerDetails.url, installReferrerDetails.clickTimestamp, installReferrerDetails.installTimestamp);
            } else {
                huaweiAttributionCallback.onFail();
            }
        }
    }

    private void retryInstallClientConnection() {
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

    private boolean startInstallReferrerConnection(Class cls, Object obj) {
        try {
            Reflection.runInstanceMethod(this.installReferrerClient, "startConnection", new Class[]{cls}, obj);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void tryExtractReferralDetails() {
        try {
            handleReferralDetails(getReferralData(getInstallReferrerDetails()));
            synchronized (this.installReferrerLock) {
                this.installReferrerReceived = true;
            }
            closeInstallReferrerClient();
        } catch (Exception unused) {
            retryInstallClientConnection();
        }
    }

    public boolean getInstallReferrer(HuaweiAttributionCallback huaweiAttributionCallback) {
        if (huaweiAttributionCallback == null) {
            Log.e(TAG, "getInstallReferrer callback is null");
            return false;
        }
        this.callback = huaweiAttributionCallback;
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
                Log.d(TAG, "InstallReferrer onInstallReferrerSetupFinished responseCode no result");
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof Integer)) {
                Log.d(TAG, "InstallReferrer onInstallReferrerSetupFinished responseCode not int");
                return null;
            }
            handleInstallReferrerClientResponse(((Integer) obj2).intValue());
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            Log.d(TAG, "InstallReferrer onInstallReferrerServiceDisconnected");
        }
        return null;
    }

    public boolean startConnection() {
        Log.d(TAG, "Attempting to retrieve Huawei referral info, attempt " + this.referrerRetryCount);
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
                this.installReferrerClient = objCreateInstallReferrerClient;
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
                return startInstallReferrerConnection(installReferrerStateListenerClass, objCreateProxyInstallReferrerStateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
