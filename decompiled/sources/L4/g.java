package L4;

import H4.B;
import H4.S1;
import H4.h2;
import H4.l2;
import H4.m2;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC5278tj;
import com.google.android.gms.internal.ads.AbstractC6031zh0;
import com.google.android.gms.internal.ads.HandlerC3644gj0;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f3110b = new HandlerC3644gj0(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3111c = B4.h.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3112d = M4.a.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3113e = C4.b.class.getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3114f = C4.c.class.getName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3115g = AbstractC6031zh0.class.getName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f3116h = com.google.android.gms.ads.b.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3117a = -1.0f;

    public static S1 A(Context context, S4.b bVar, int i10) {
        int iD;
        int iIntValue;
        h2 h2VarA = l2.f1364a.a(context, bVar.b().a());
        int iIntValue2 = 1;
        if (i10 == 1) {
            h2VarA.f1293c.putBoolean("is_sdk_preload", true);
        } else {
            h2VarA.f1293c.putBoolean("zenith_v2", true);
        }
        if (bVar.d() <= 0) {
            B4.b bVarA = bVar.a();
            B4.b bVar2 = B4.b.BANNER;
            int iOrdinal = bVarA.ordinal();
            if (iOrdinal == 1) {
                iD = ((Integer) B.c().d(AbstractC3892ii.f29782c0)).intValue();
            } else if (iOrdinal == 2) {
                iD = ((Integer) B.c().d(AbstractC3892ii.f29793d0)).intValue();
            } else if (iOrdinal != 5) {
                iD = 1;
            } else {
                iD = ((Integer) B.c().d(AbstractC3892ii.f29771b0)).intValue();
            }
        } else {
            iD = bVar.d();
        }
        B4.b bVarA2 = bVar.a();
        B4.b bVar3 = B4.b.BANNER;
        int iOrdinal2 = bVarA2.ordinal();
        if (iOrdinal2 == 1) {
            iIntValue = ((Integer) B.c().d(AbstractC3892ii.f29749Z)).intValue();
        } else if (iOrdinal2 == 2) {
            iIntValue = ((Integer) B.c().d(AbstractC3892ii.f29760a0)).intValue();
        } else if (iOrdinal2 != 5) {
            iIntValue = 1;
        } else {
            iIntValue = ((Integer) B.c().d(AbstractC3892ii.f29739Y)).intValue();
        }
        int iMax = Math.max(Math.min(iIntValue, 15), 1);
        int iOrdinal3 = bVar.a().ordinal();
        if (iOrdinal3 == 1) {
            iIntValue2 = ((Integer) B.c().d(AbstractC3892ii.f29815f0)).intValue();
        } else if (iOrdinal3 == 2) {
            iIntValue2 = ((Integer) B.c().d(AbstractC3892ii.f29826g0)).intValue();
        } else if (iOrdinal3 == 5) {
            iIntValue2 = ((Integer) B.c().d(AbstractC3892ii.f29804e0)).intValue();
        }
        return new S1(bVar.c(), bVar.a().d(), h2VarA, Math.max(Math.min(iD, iMax), Math.min(iIntValue2, iMax)));
    }

    public static final int B(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String C(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f3111c.equalsIgnoreCase(className2) || f3112d.equalsIgnoreCase(className2) || f3113e.equalsIgnoreCase(className2) || f3114f.equalsIgnoreCase(className2) || f3115g.equalsIgnoreCase(className2) || f3116h.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i11].getClassName();
                break;
            }
            i10 = i11;
        }
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean D() {
        boolean zBooleanValue = ((Boolean) B.c().d(AbstractC3892ii.Sc)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean E(Context context, int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i10) == 0;
    }

    public static final boolean F(Context context) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    public static final boolean G() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int a(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void b(Context context, String str, String str2, Bundle bundle, boolean z9, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString(AppsFlyerProperties.APP_ID, applicationContext.getPackageName());
        if (str == null) {
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            StringBuilder sb = new StringBuilder(String.valueOf(apkVersion).length() + 10);
            sb.append(apkVersion);
            sb.append(".254715000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.k(builderAppendQueryParameter.toString());
    }

    public static final int c(Context context, int i10) {
        return B(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String d(Context context) {
        AbstractC3892ii.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || D()) {
            string = "emulator";
        }
        return e(string, "MD5");
    }

    private static String e(String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray f(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void g(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(v((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(t((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(f((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(w((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void h(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) B.c().d(AbstractC3892ii.f29957s)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, v((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, t((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), f((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, f(Arrays.asList((Object[]) obj)));
            return;
        }
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i10 < length) {
                    numArr2[i10] = Integer.valueOf(iArr[i10]);
                    i10++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, w(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i10 < length2) {
                    dArr3[i10] = Double.valueOf(dArr2[i10]);
                    i10++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, w(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i10 < length3) {
                    lArr2[i10] = Long.valueOf(jArr[i10]);
                    i10++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, w(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i10 < length4) {
                boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                i10++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, w(boolArr));
    }

    private static final void i(ViewGroup viewGroup, m2 m2Var, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int iC = c(context, 3);
        int i12 = m2Var.f1376f;
        int i13 = m2Var.f1373c;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i12 - iC, i13 - iC, 17));
        viewGroup.addView(frameLayout, i12, i13);
    }

    public static Object m(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static ActivityManager.MemoryInfo n(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            p.f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static String o(String str) {
        return e(str, "MD5");
    }

    public static String p(String str) {
        return e(str, "SHA-256");
    }

    public static String r() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static B4.f s(Context context, int i10, int i11, int i12) {
        int iRound;
        int iY = y(context, i12);
        if (iY == -1) {
            return B4.f.f234q;
        }
        int iMin = Math.min(90, Math.round(iY * 0.15f));
        if (i10 > 655) {
            iRound = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            iRound = 81;
        } else if (i10 > 526) {
            iRound = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            iRound = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return new B4.f(i10, Math.max(Math.min(iRound, iMin), 50));
    }

    public static boolean x(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC5278tj.f33464d.e());
    }

    public static int y(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        return i10 == i11 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static S4.b z(S1 s10) {
        String str = s10.f1242a;
        B4.b bVarC = B4.b.c(s10.f1243b);
        if (bVarC == null) {
            return null;
        }
        h2 h2Var = s10.f1244c;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = h2Var.f1295e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.c((String) it.next());
            }
        }
        builder.j(h2Var.f1303m);
        Bundle bundle = h2Var.f1304v;
        for (String str2 : bundle.keySet()) {
            builder.a(str2, bundle.getString(str2));
        }
        builder.f(h2Var.f1286O);
        String str3 = h2Var.f1302l;
        if (str3 != null) {
            builder.g(str3);
        }
        builder.h(h2Var.f1284M);
        builder.i(h2Var.f1278G);
        AdRequest adRequestN = builder.n();
        S4.b.a aVar = new S4.b.a(str, bVarC);
        aVar.b(adRequestN);
        aVar.c(s10.f1245d);
        return aVar.a();
    }

    public final int j(Context context, int i10) {
        if (this.f3117a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (this) {
                try {
                    if (this.f3117a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f3117a = displayMetrics.density;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.round(i10 / this.f3117a);
    }

    public final void k(ViewGroup viewGroup, m2 m2Var, String str, String str2) {
        if (str2 != null) {
            p.f(str2);
        }
        i(viewGroup, m2Var, str, -65536, -16777216);
    }

    public final void l(ViewGroup viewGroup, m2 m2Var, String str) {
        i(viewGroup, m2Var, "Ads by Google", -16777216, -1);
    }

    public final void q(final Context context, String str, String str2, Bundle bundle, boolean z9) {
        b(context, str, "gmob-apps", bundle, true, new f() { // from class: L4.e
            @Override // L4.f
            public final /* synthetic */ u k(String str3) {
                new d(this.f3108a, context, str3).start();
                return u.SUCCESS;
            }
        });
    }

    public final JSONObject t(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                h(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject u(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return v(bundle);
            } catch (JSONException e10) {
                p.d("Error converting Bundle to JSON", e10);
            }
        }
        return null;
    }

    public final JSONObject v(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            h(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    final JSONArray w(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            g(jSONArray, obj);
        }
        return jSONArray;
    }
}
