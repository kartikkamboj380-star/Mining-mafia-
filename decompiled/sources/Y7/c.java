package Y7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f7024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B4.h f7027j;

    public c(Context context, RelativeLayout relativeLayout, X7.a aVar, U7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.f7024g = relativeLayout;
        this.f7025h = i10;
        this.f7026i = i11;
        this.f7027j = new B4.h(this.f7018b);
        this.f7021e = new d(gVar, this);
    }

    @Override // Y7.a
    protected void c(AdRequest adRequest, U7.b bVar) {
        B4.h hVar;
        RelativeLayout relativeLayout = this.f7024g;
        if (relativeLayout == null || (hVar = this.f7027j) == null) {
            return;
        }
        relativeLayout.addView(hVar);
        this.f7027j.setAdSize(new B4.f(this.f7025h, this.f7026i));
        this.f7027j.setAdUnitId(this.f7019c.b());
        this.f7027j.setAdListener(((d) this.f7021e).d());
        this.f7027j.b(adRequest);
    }

    public void e() {
        B4.h hVar;
        RelativeLayout relativeLayout = this.f7024g;
        if (relativeLayout == null || (hVar = this.f7027j) == null) {
            return;
        }
        relativeLayout.removeView(hVar);
    }
}
