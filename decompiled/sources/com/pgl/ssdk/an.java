package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41952a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f41953b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f41954c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f41955d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f41956e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f41957f = "";

    public static String a() {
        return f41952a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f41957f;
    }

    public static void a(int i10) {
        f41952a = i10;
    }

    public static void b(String str) {
        f41957f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f41953b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f41953b)) {
            au.a("updateIndex");
            int i10 = f41956e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f41956e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f41956e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f41953b)) {
            return f41953b;
        }
        try {
            if (f41956e == Integer.MIN_VALUE) {
                f41956e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f41955d;
            return strArr[f41956e % strArr.length];
        } catch (Throwable unused) {
            return f41954c;
        }
    }
}
