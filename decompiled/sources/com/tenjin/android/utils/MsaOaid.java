package com.tenjin.android.utils;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class MsaOaid implements InvocationHandler {
    private static final String TAG = "MsaOaid";
    private Context context;
    BlockingQueue<String> oaidHolder = null;

    public class MsaErrorCode {
        public static final int INIT_ERROR_BEGIN = 1008610;
        public static final int INIT_ERROR_DEVICE_NOSUPPORT = 1008612;
        public static final int INIT_ERROR_LOAD_CONFIGFILE = 1008613;
        public static final int INIT_ERROR_MANUFACTURER_NOSUPPORT = 1008611;
        public static final int INIT_ERROR_RESULT_DELAY = 1008614;
        public static final int INIT_HELPER_CALL_ERROR = 1008615;

        public MsaErrorCode() {
        }
    }

    public MsaOaid(Context context) {
        this.context = context.getApplicationContext();
    }

    private Class MdidSdkHelper() {
        return Reflection.forName("com.bun.miitmdid.core.MdidSdkHelper");
    }

    private Object createOaidProxyListener(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException | NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private Class getOaidListenerClass() {
        return Reflection.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
    }

    private Object initMsaSdk(Class cls, Object obj) {
        if (cls != null && obj != null) {
            try {
                return Reflection.runStaticMethod("com.bun.miitmdid.core.MdidSdkHelper", "InitSdk", new Class[]{Context.class, Boolean.TYPE, cls}, this.context, Boolean.TRUE, obj);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void logInitResponse(Object obj) {
        if (obj == null) {
            Log.d(TAG, "MSA Response: null");
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        switch (iIntValue) {
            case MsaErrorCode.INIT_ERROR_BEGIN /* 1008610 */:
                Log.d(TAG, "MSA Error - INIT_ERROR_BEGIN");
                Log.d(TAG, "MSA Error - INIT_ERROR_DEVICE_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_ERROR_LOAD_CONFIGFILE");
                Log.d(TAG, "MSA Error - INIT_ERROR_MANUFACTURER_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_HELPER_CALL_ERROR");
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
            case MsaErrorCode.INIT_ERROR_MANUFACTURER_NOSUPPORT /* 1008611 */:
                Log.d(TAG, "MSA Error - INIT_ERROR_MANUFACTURER_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_HELPER_CALL_ERROR");
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
            case MsaErrorCode.INIT_ERROR_DEVICE_NOSUPPORT /* 1008612 */:
                Log.d(TAG, "MSA Error - INIT_ERROR_DEVICE_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_ERROR_LOAD_CONFIGFILE");
                Log.d(TAG, "MSA Error - INIT_ERROR_MANUFACTURER_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_HELPER_CALL_ERROR");
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
            case MsaErrorCode.INIT_ERROR_LOAD_CONFIGFILE /* 1008613 */:
                Log.d(TAG, "MSA Error - INIT_ERROR_LOAD_CONFIGFILE");
                Log.d(TAG, "MSA Error - INIT_ERROR_MANUFACTURER_NOSUPPORT");
                Log.d(TAG, "MSA Error - INIT_HELPER_CALL_ERROR");
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
            case MsaErrorCode.INIT_ERROR_RESULT_DELAY /* 1008614 */:
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
            case MsaErrorCode.INIT_HELPER_CALL_ERROR /* 1008615 */:
                Log.d(TAG, "MSA Error - INIT_HELPER_CALL_ERROR");
                Log.d(TAG, "MSA Error - INIT_ERROR_RESULT_DELAY");
                break;
        }
        Log.d(TAG, "MSA Response: " + iIntValue);
    }

    public String getOaid(long j10) {
        Object objCreateOaidProxyListener;
        this.oaidHolder = new LinkedBlockingQueue(1);
        Class oaidListenerClass = getOaidListenerClass();
        if (oaidListenerClass == null || (objCreateOaidProxyListener = createOaidProxyListener(oaidListenerClass)) == null) {
            return "";
        }
        logInitResponse(initMsaSdk(oaidListenerClass, objCreateOaidProxyListener));
        return this.oaidHolder.poll(j10, TimeUnit.MILLISECONDS);
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
        if (name.equals("OnSupport")) {
            if (!(objArr[0] instanceof Boolean)) {
                Log.d(TAG, "OnSupport isSupport is not Boolean");
                return null;
            }
            Object objRunInstanceMethod = Reflection.runInstanceMethod(objArr[1], "getOAID", null, new Object[0]);
            if (objRunInstanceMethod == null) {
                this.oaidHolder.offer("");
            } else {
                Log.d(TAG, "MSA OAID: " + objRunInstanceMethod);
                this.oaidHolder.offer((String) objRunInstanceMethod);
            }
        }
        return null;
    }
}
