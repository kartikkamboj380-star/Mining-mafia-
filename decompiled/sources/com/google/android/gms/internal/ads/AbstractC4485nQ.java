package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4485nQ {
    public static boolean a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return g("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean b() {
        return g("EGL_KHR_surfaceless_context");
    }

    public static boolean c(int i10) {
        if (i10 == 6) {
            return d();
        }
        if (i10 == 7) {
            return g("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 33 && g("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void e() throws MP {
        StringBuilder sb = new StringBuilder();
        C5553vu0 c5553vu0 = new C5553vu0();
        boolean z9 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z9) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            c5553vu0.g(Integer.valueOf(iGlGetError));
            z9 = true;
        }
        if (z9) {
            throw new MP(sb.toString(), c5553vu0.j());
        }
    }

    public static void f(boolean z9, String str) throws MP {
        if (!z9) {
            throw new MP(str, AbstractC5931yu0.l());
        }
    }

    private static boolean g(String str) throws MP {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        f(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
