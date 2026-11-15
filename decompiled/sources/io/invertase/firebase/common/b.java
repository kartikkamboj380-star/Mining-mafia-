package io.invertase.firebase.common;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f45186a = new a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f45187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45188c;

    public b(Context context, String str) {
        this.f45187b = context;
        this.f45188c = str;
    }

    public Context a() {
        return this.f45187b;
    }

    public String b() {
        return "Universal" + this.f45188c + "Module";
    }

    public void c() {
        this.f45186a.j();
    }
}
