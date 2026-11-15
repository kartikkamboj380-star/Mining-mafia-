package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f42044a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f42045b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f42046c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f42047d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f42048e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f42049f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f42050g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f42051h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f42052i;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42055c;

        a(String str, Context context, int i10) {
            this.f42053a = str;
            this.f42054b = context;
            this.f42055c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.f42050g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f42053a);
            }
            InputManager inputManagerB = y.b(this.f42054b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f42055c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    static /* synthetic */ int b() {
        int i10 = f42046c;
        f42046c = i10 + 1;
        return i10;
    }

    static /* synthetic */ int c() {
        int i10 = f42049f;
        f42049f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int d() {
        int i10 = f42044a;
        f42044a = i10 + 1;
        return i10;
    }

    static /* synthetic */ int e() {
        int i10 = f42047d;
        f42047d = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f() {
        int i10 = f42045b;
        f42045b = i10 + 1;
        return i10;
    }

    static /* synthetic */ int g() {
        int i10 = f42048e;
        f42048e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f42051h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f42049f = sharedPreferencesA.getInt("nihc", 0);
                f42048e = sharedPreferencesA.getInt("eihc", 0);
                f42047d = sharedPreferencesA.getInt("vihc", 0);
                f42051h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.getClass();
        switch (str) {
            case "eic":
                return f42045b;
            case "nic":
                return f42046c;
            case "vic":
                return f42044a;
            case "eihc":
                return f42048e;
            case "nihc":
                return f42049f;
            case "vihc":
                return f42047d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public static void a(MotionEvent motionEvent, Context context) {
        String string;
        if (motionEvent == null || context == null) {
            return;
        }
        if (f42050g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    string = Arrays.toString(new Exception().getStackTrace());
                    if (string.contains("android.view.InputEventReceiver") || string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") || string.contains("android.view.ViewRootImpl$InputStage")) {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        ar.b(new a(string, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f42052i == null) {
            f42052i = (InputManager) context.getSystemService("input");
        }
        return f42052i;
    }
}
