package com.facebook.react.modules.systeminfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.react.AbstractC1314o;
import com.facebook.react.AbstractC1316q;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p129m8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15014a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15015b = a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f15016c;

    private a() {
    }

    public static final String a(int i10) {
        return "adb reverse tcp:" + i10 + " tcp:" + i10;
    }

    public static final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(f15014a.d(context));
    }

    private final int d(Context context) {
        return context.getResources().getInteger(AbstractC1314o.f15067a);
    }

    public static final String e() {
        if (f15014a.k()) {
            String str = Build.MODEL;
            Intrinsics.c(str);
            return str;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static final Map f(Context context) {
        String packageName;
        String string;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            packageName = context.getPackageName();
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                Intrinsics.c(string);
            }
        } else {
            packageName = null;
            string = null;
        }
        return E.j(q.a("appDisplayName", string), q.a("appIdentifier", packageName), q.a("platform", "android"), q.a("deviceName", Build.MODEL), q.a("reactNativeVersion", f15014a.h()));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    private final synchronized String g() {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        Exception e10;
        String str;
        String str2 = f15016c;
        if (str2 != null) {
            Intrinsics.c(str2);
            return str2;
        }
        try {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
                    String str3 = "";
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str3 = line;
                        } catch (Exception e11) {
                            e10 = e11;
                            Z1.a.J(f15015b, "Failed to query for metro.host prop:", e10);
                            f15016c = "";
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (processExec != null) {
                            }
                            str = f15016c;
                            if (str == null) {
                                str = "";
                            }
                            return str;
                        }
                    }
                    f15016c = str3;
                    bufferedReader.close();
                } catch (Exception e12) {
                    bufferedReader = null;
                    e10 = e12;
                } catch (Throwable th2) {
                    bufferedReader = null;
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            bufferedReader = null;
            e10 = e13;
            processExec = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            processExec = null;
        }
        processExec.destroy();
        str = f15016c;
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    private final String h() {
        String str;
        Map map = b.f15018b;
        Object obj = map.get("major");
        Object obj2 = map.get("minor");
        Object obj3 = map.get("patch");
        Object obj4 = map.get("prerelease");
        if (obj4 != null) {
            str = "-" + obj4;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        return obj + "." + obj2 + "." + obj3 + str;
    }

    public static final String i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = f15014a;
        return aVar.j(context, aVar.d(context));
    }

    private final String j(Context context, int i10) {
        String strG;
        if (g().length() > 0) {
            strG = g();
        } else if (k()) {
            strG = "10.0.3.2";
        } else {
            strG = l() ? "10.0.2.2" : "localhost";
        }
        H h10 = H.f45976a;
        String str = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{strG, Integer.valueOf(i10)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final boolean k() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        return StringsKt.P(FINGERPRINT, "vbox", false, 2, null);
    }

    private final boolean l() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.P(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        return StringsKt.J(FINGERPRINT, "google/sdk_gphone", false, 2, null);
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getString(AbstractC1316q.f15081G) + ":" + d(context);
    }
}
