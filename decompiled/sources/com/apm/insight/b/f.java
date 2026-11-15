package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f12760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f12761c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f12762b;

    private f(@NonNull Context context) {
        this.f12762b = new b(context);
        g gVar = new g();
        f12761c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f12760a == null) {
            synchronized (f.class) {
                try {
                    if (f12760a == null) {
                        f12760a = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12760a;
    }

    public static g b() {
        return f12761c;
    }

    public final void c() {
        this.f12762b.a();
    }

    public final void d() {
        this.f12762b.b();
    }

    public final b a() {
        return this.f12762b;
    }
}
