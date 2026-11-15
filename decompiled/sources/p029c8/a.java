package p029c8;

import U7.b;
import U7.c;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f11874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f11875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f11876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected p019b8.a f11877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f11878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d f11879f;

    public a(Context context, c cVar, p019b8.a aVar, d dVar) {
        this.f11875b = context;
        this.f11876c = cVar;
        this.f11877d = aVar;
        this.f11879f = dVar;
    }

    public void b(b bVar) {
        AdRequest adRequestB = this.f11877d.b(this.f11876c.a());
        if (bVar != null) {
            this.f11878e.a(bVar);
        }
        c(adRequestB, bVar);
    }

    protected abstract void c(AdRequest adRequest, b bVar);

    public void d(Object obj) {
        this.f11874a = obj;
    }
}
