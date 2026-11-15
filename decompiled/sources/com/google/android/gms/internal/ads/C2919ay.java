package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2919ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private L4.a f26675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f26678d;

    public final C2919ay a(L4.a aVar) {
        this.f26675a = aVar;
        return this;
    }

    public final C2919ay b(Context context) {
        this.f26678d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f26676b = context;
        return this;
    }

    public final C2919ay c(long j10) {
        this.f26677c = j10;
        return this;
    }

    final /* synthetic */ L4.a d() {
        return this.f26675a;
    }

    final /* synthetic */ Context e() {
        return this.f26676b;
    }

    final /* synthetic */ long f() {
        return this.f26677c;
    }

    final /* synthetic */ WeakReference g() {
        return this.f26678d;
    }
}
