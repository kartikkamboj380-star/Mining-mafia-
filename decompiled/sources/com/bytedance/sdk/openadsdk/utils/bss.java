package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bss {
    private static float bob = -1.0f;
    private static int csi = -1;
    private static int dgq = -1;
    private static int fou = -1;
    private static float kq = -1.0f;
    private static float nn = -1.0f;
    private static int oq = -1;
    private static int rhi = -1;
    private static WindowManager rjo = null;
    private static ViewConfiguration syt = null;
    private static Boolean ubx = null;
    private static final Object vvw = new Object();
    private static boolean wki = true;

    private static boolean bob() {
        return kq < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || oq < 0 || bob < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fou < 0 || csi < 0;
    }

    public static int csi(Context context) {
        kq(context);
        return csi;
    }

    public static float dgq(Context context) {
        kq(context);
        return bob;
    }

    public static int fou(Context context) {
        kq(context);
        return bob(context, fou);
    }

    private static boolean kq(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static boolean mxq(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static int nn(Context context) {
        kq(context);
        return oq;
    }

    public static boolean nze(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int rhi(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.sns.kq();
        }
        if (context == null) {
            return rhi;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            rhi = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return rhi;
    }

    public static int rjo(Context context) {
        kq(context);
        return bob(context, csi);
    }

    public static boolean sns(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static boolean suf(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static float syt(Context context) {
        kq(context, true);
        return kq;
    }

    public static Pair<Integer, Integer> ubx(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sns.kq();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int vvw(Context context) {
        return ((Integer) ubx(context).second).intValue();
    }

    public static boolean wcx(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int wki(Context context) {
        return ((Integer) ubx(context).first).intValue();
    }

    public static int bob(Context context, float f10) {
        kq(context, true);
        float fSyt = syt(context);
        if (fSyt <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fSyt = 1.0f;
        }
        return (int) ((f10 / fSyt) + 0.5f);
    }

    public static void kq(Context context) {
        kq(context, false);
    }

    public static int oq(Context context, float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Float.valueOf(kq(context, f10, true)).intValue();
    }

    public static void csi(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.bss.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    bss.kq(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static boolean fou(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void kq(Context context, boolean z9) {
        Context contextKq = context == null ? com.bytedance.sdk.openadsdk.core.sns.kq() : context;
        if (contextKq == null) {
            return;
        }
        rjo = (WindowManager) contextKq.getSystemService("window");
        if (bob() || z9) {
            DisplayMetrics displayMetrics = contextKq.getResources().getDisplayMetrics();
            kq = displayMetrics.density;
            oq = displayMetrics.densityDpi;
            bob = displayMetrics.scaledDensity;
            fou = displayMetrics.widthPixels;
            csi = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = fou;
            int i11 = csi;
            if (i10 > i11) {
                fou = i11;
                csi = i10;
            }
        } else {
            int i12 = fou;
            int i13 = csi;
            if (i12 < i13) {
                fou = i13;
                csi = i12;
            }
        }
        rhi = configuration.smallestScreenWidthDp;
    }

    public static int[] oq(Context context) {
        if (context == null) {
            return null;
        }
        if (rjo == null) {
            rjo = (WindowManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = rjo;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void rjo(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int bob(Context context) {
        kq(context);
        return fou;
    }

    public static boolean fou(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    wki = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e10.getMessage());
            }
        }
        return false;
    }

    public static int[] bob(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void rhi(View view) {
        if (view == null) {
            return;
        }
        kq(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.bss.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean bob(Activity activity) {
        if (ubx == null) {
            synchronized (vvw) {
                try {
                    if (ubx == null) {
                        String strKq = com.bytedance.sdk.openadsdk.jhe.kq.kq("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strKq) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strKq);
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    if (str.equals(jSONArray.getString(i10))) {
                                        ubx = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e10) {
                                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e10.getMessage());
                            }
                        }
                        ubx = Boolean.valueOf(fou(activity) || kq("ro.miui.notch", activity) == 1 || suf(activity) || wcx(activity) || nze(activity) || mxq(activity) || sns(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ubx.booleanValue();
    }

    public static float kq(Context context, float f10) {
        kq(context);
        return f10 * dgq(context);
    }

    public static int[] oq(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float kq(Context context, float f10, boolean z9) {
        kq(context);
        return (f10 * syt(context)) + (z9 ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static void oq(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static int[] kq(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean oq() {
        return wki && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap oq(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        if (rhiVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rhiVar.getWidth(), rhiVar.getHeight(), Bitmap.Config.RGB_565);
            rhiVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kq(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !kq(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bob(final com.bytedance.sdk.openadsdk.core.model.uml umlVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.fou.bob.kq(System.currentTimeMillis(), umlVar, str, str2, new com.bytedance.sdk.openadsdk.mxq.bob.kq() { // from class: com.bytedance.sdk.openadsdk.utils.bss.4
                        @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
                        public JSONObject bob() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iKq = bss.kq(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iKq == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.ha.oq(umlVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.wki.bob.kq.kq().kq(umlVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static void kq(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void kq(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        kq(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static ArrayList<Integer> oq(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void kq(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void oq(View view, final float f10) {
        if (view != null && f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.bss.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap kq(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float kq() {
        float f10 = nn;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.sns.kq().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        nn = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void kq(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob("UIUtils", e10.getMessage());
        }
    }

    public static int kq(String str, Activity activity) {
        if (ibd.csi()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.fax.bob("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void kq(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.fax.bob("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void kq(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.fax.bob("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void kq(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void kq(TextView textView, com.bytedance.sdk.openadsdk.core.widget.mxq mxqVar, com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        kq(textView, mxqVar, umlVar, 14);
    }

    public static void kq(TextView textView, com.bytedance.sdk.openadsdk.core.widget.mxq mxqVar, com.bytedance.sdk.openadsdk.core.model.uml umlVar, int i10) {
        kq(textView, mxqVar, (umlVar == null || umlVar.xo() == null) ? -1.0d : umlVar.xo().fou(), i10);
    }

    public static void kq(TextView textView, com.bytedance.sdk.openadsdk.core.widget.mxq mxqVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            mxqVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            kq(mxqVar, d10, i10);
        }
    }

    public static void kq(com.bytedance.sdk.openadsdk.core.widget.mxq mxqVar, double d10, int i10) {
        if (d10 < 0.0d) {
            mxqVar.setVisibility(8);
        } else {
            mxqVar.setVisibility(0);
            mxqVar.kq(d10, i10);
        }
    }

    public static Bitmap kq(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        WebView webView = rhiVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapOq = oq(rhiVar);
        if (bitmapOq == null) {
            bitmapOq = kq(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapOq == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.fou.kq(bitmapOq, bitmapOq.getWidth() / 6, bitmapOq.getHeight() / 6);
    }

    public static void kq(final com.bytedance.sdk.openadsdk.core.model.uml umlVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        nz.oq(new com.bytedance.sdk.component.syt.syt("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.bss.3
            @Override // java.lang.Runnable
            public void run() {
                bss.bob(umlVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int kq(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListOq = oq(bitmap);
            if (arrayListOq == null) {
                return -1;
            }
            HashMap map = new HashMap();
            int size = arrayListOq.size();
            int iIntValue = 0;
            int i10 = 0;
            while (i10 < size) {
                Integer num = arrayListOq.get(i10);
                i10++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i11 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i11 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean kq(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (syt == null) {
                syt = ViewConfiguration.get(context);
            }
            if (dgq == -1) {
                dgq = syt.getScaledTouchSlop();
            }
            if (f10 - f11 > dgq) {
                return true;
            }
        }
        return false;
    }

    public static void kq(boolean z9) {
        ubx = Boolean.valueOf(z9);
    }
}
