package Y7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f7017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected U7.c f7019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected X7.a f7020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f7021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f7022f;

    public a(Context context, U7.c cVar, X7.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f7018b = context;
        this.f7019c = cVar;
        this.f7020d = aVar;
        this.f7022f = dVar;
    }

    public void b(U7.b bVar) {
        AdRequest adRequestB = this.f7020d.b(this.f7019c.a());
        if (bVar != null) {
            this.f7021e.a(bVar);
        }
        c(adRequestB, bVar);
    }

    protected abstract void c(AdRequest adRequest, U7.b bVar);

    public void d(Object obj) {
        this.f7017a = obj;
    }
}
