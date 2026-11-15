package p029c8;

import B4.f;
import B4.h;
import U7.b;
import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.g;
import p019b8.a;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f11881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f11884j;

    public c(Context context, RelativeLayout relativeLayout, a aVar, U7.c cVar, int i10, int i11, d dVar, g gVar) {
        super(context, cVar, aVar, dVar);
        this.f11881g = relativeLayout;
        this.f11882h = i10;
        this.f11883i = i11;
        this.f11884j = new h(this.f11875b);
        this.f11878e = new d(gVar, this);
    }

    @Override // p029c8.a
    protected void c(AdRequest adRequest, b bVar) {
        h hVar;
        RelativeLayout relativeLayout = this.f11881g;
        if (relativeLayout == null || (hVar = this.f11884j) == null) {
            return;
        }
        relativeLayout.addView(hVar);
        this.f11884j.setAdSize(new f(this.f11882h, this.f11883i));
        this.f11884j.setAdUnitId(this.f11876c.b());
        this.f11884j.setAdListener(((d) this.f11878e).d());
        this.f11884j.b(adRequest);
    }

    public void e() {
        h hVar;
        RelativeLayout relativeLayout = this.f11881g;
        if (relativeLayout == null || (hVar = this.f11884j) == null) {
            return;
        }
        relativeLayout.removeView(hVar);
    }
}
