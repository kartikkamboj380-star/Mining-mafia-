package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38590a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final GoogleApiAvailabilityLight f38591b = GoogleApiAvailabilityLight.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f38592c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static DynamiteModule f38593d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f38594e = "0";

    public static Task a(final Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        final C7094k c7094k = new C7094k();
        if (b()) {
            c7094k.c(null);
            return c7094k.a();
        }
        new Thread(new Runnable() { // from class: o5.a
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                C7094k c7094k2 = c7094k;
                try {
                    com.google.android.gms.net.a.e(context2);
                    c7094k2.c(null);
                } catch (Exception e10) {
                    c7094k2.b(e10);
                }
            }
        }).start();
        return c7094k.a();
    }

    public static boolean b() {
        return c() != null;
    }

    static DynamiteModule c() {
        DynamiteModule dynamiteModule;
        synchronized (f38592c) {
            dynamiteModule = f38593d;
        }
        return dynamiteModule;
    }

    static String d() {
        String str;
        synchronized (f38592c) {
            str = f38594e;
        }
        return str;
    }

    public static void e(Context context) {
        synchronized (f38592c) {
            try {
                if (b()) {
                    return;
                }
                Preconditions.checkNotNull(context, "Context must not be null");
                try {
                    ((ClassLoader) Preconditions.checkNotNull(a.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = f38591b;
                    googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleE = DynamiteModule.e(context, DynamiteModule.f17195b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleE.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                                Log.e(f38590a, "ImplVersion class is missing from Cronet module.");
                                throw new GooglePlayServicesNotAvailableException(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            int iIntValue = ((Integer) Preconditions.checkNotNull((Integer) method.invoke(null, null))).intValue();
                            f38594e = (String) Preconditions.checkNotNull((String) method2.invoke(null, null));
                            if (apiLevel <= iIntValue) {
                                f38593d = dynamiteModuleE;
                                return;
                            }
                            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                            if (errorResolutionIntent == null) {
                                Log.e(f38590a, "Unable to fetch error resolution intent");
                                throw new GooglePlayServicesNotAvailableException(2);
                            }
                            String str = f38594e;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(iIntValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str);
                            throw new GooglePlayServicesRepairableException(2, sb.toString(), errorResolutionIntent);
                        } catch (Exception e10) {
                            Log.e(f38590a, "Unable to read Cronet version from the Cronet module ", e10);
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e10));
                        }
                    } catch (DynamiteModule.a e11) {
                        Log.e(f38590a, "Unable to load Cronet module", e11);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e11));
                    }
                } catch (ClassNotFoundException e12) {
                    Log.e(f38590a, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
