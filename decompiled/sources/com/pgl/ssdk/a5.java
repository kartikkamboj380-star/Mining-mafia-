package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41894a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f41895b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f41896c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f41897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f41898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f41899f;

    public static void a(Context context, String str) {
        if (f41899f == null) {
            f41899f = context;
        }
        int i10 = f41894a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f41898e = System.currentTimeMillis();
        f41897d = false;
        f41895b = str;
        f41894a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f41899f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f41894a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f41896c)) {
                f41896c = (String) com.pgl.ssdk.ces.a.meta(303, f41899f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41896c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f41899f, bArr);
    }
}
