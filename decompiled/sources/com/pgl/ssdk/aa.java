package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f41900a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f41901b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f41902c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f41903d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f41904e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f41905f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f41906g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f41907h;

    static class a implements DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f41901b) {
            return;
        }
        if (f41900a == null) {
            f41900a = new a();
        }
        if (f41907h == null) {
            f41907h = (DisplayManager) context.getSystemService("display");
        }
        if (f41907h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f41907h.registerDisplayListener(f41900a, handlerB);
            f41901b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z9 = false;
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (objA != null && objA3 != null && ((Integer) objA).intValue() == ((Integer) objA3).intValue()) {
            z9 = true;
        }
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf(z9));
    }

    private static String a(int i10) {
        Display display = f41907h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f41902c)) {
                    return;
                }
                f41902c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f41904e)) {
                        return;
                    }
                    f41904e = strA;
                    return;
                }
                if (strA.equals(f41903d)) {
                    return;
                }
                f41903d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f41901b && (f41902c != null || f41903d != null || f41904e != null)) {
            return true;
        }
        if (f41901b && f41905f) {
            return f41906g;
        }
        if (context == null) {
            return false;
        }
        if (f41907h == null) {
            f41907h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f41907h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    f41906g = true;
                    break;
                }
            }
        }
        f41905f = true;
        return f41906g;
    }
}
