package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2759Zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f26277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f26278d;

    /* synthetic */ AbstractC2759Zh(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.f26275a = i10;
        this.f26276b = str;
        this.f26277c = obj;
        this.f26278d = obj2;
        H4.B.b().a(this);
    }

    public static AbstractC2759Zh h(int i10, String str, int i11, int i12) {
        return new C2551Vh(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static AbstractC2759Zh i(int i10, String str, long j10, long j11) {
        return new C2603Wh(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static AbstractC2759Zh j(int i10, String str, float f10, float f11) {
        return new C2655Xh(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static AbstractC2759Zh k(int i10, String str) {
        C2707Yh c2707Yh = new C2707Yh(1, "gads:sdk_core_constants:experiment_id", null, null);
        H4.B.b().b(c2707Yh);
        return c2707Yh;
    }

    public static AbstractC2759Zh l(int i10, String str) {
        C2707Yh c2707Yh = new C2707Yh(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        H4.B.b().c(c2707Yh);
        return c2707Yh;
    }

    public abstract Object a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, Object obj);

    protected abstract Object c(JSONObject jSONObject);

    protected abstract Object d(SharedPreferences sharedPreferences);

    public final String e() {
        return this.f26276b;
    }

    public final Object f() {
        return H4.B.c().b() ? this.f26278d : this.f26277c;
    }

    public final Object g() {
        return H4.B.c().d(this);
    }

    public final int m() {
        return this.f26275a;
    }
}
