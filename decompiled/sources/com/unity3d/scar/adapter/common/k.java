package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected V7.c f42780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map f42781b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected U7.a f42782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d f42783d;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f42784a;

        a(Activity activity) {
            this.f42784a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f42782c.a(this.f42784a);
        }
    }

    public k(d dVar) {
        this.f42783d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, boolean z9, V7.b bVar) {
        this.f42780a.a(context, z9, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, List list, V7.b bVar) {
        this.f42780a.b(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Context context, String str, U7.d dVar, V7.b bVar) {
        this.f42780a.c(context, str, dVar, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void e(Activity activity, String str, String str2) {
        U7.a aVar = (U7.a) this.f42781b.get(str2);
        if (aVar != null) {
            this.f42782c = aVar;
            l.a(new a(activity));
            return;
        }
        this.f42783d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
