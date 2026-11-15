package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f40119b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f40120c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f40121d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K6.a f40122a;

    private i(K6.a aVar) {
        this.f40122a = aVar;
    }

    public static i c() {
        return d(K6.b.a());
    }

    public static i d(K6.a aVar) {
        if (f40121d == null) {
            f40121d = new i(aVar);
        }
        return f40121d;
    }

    static boolean g(String str) {
        return f40120c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f40122a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(I6.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f40119b;
    }
}
