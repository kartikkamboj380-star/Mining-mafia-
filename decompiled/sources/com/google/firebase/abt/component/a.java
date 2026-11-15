package com.google.firebase.abt.component;

import G6.b;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p017b6.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f39961a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f39962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f39963c;

    protected a(Context context, b bVar) {
        this.f39962b = context;
        this.f39963c = bVar;
    }

    protected c a(String str) {
        return new c(this.f39962b, this.f39963c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f39961a.containsKey(str)) {
                this.f39961a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c) this.f39961a.get(str);
    }
}
