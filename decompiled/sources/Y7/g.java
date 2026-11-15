package Y7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes3.dex */
public class g extends a implements U7.a {
    public g(Context context, X7.a aVar, U7.c cVar, com.unity3d.scar.adapter.common.d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f7021e = new h(iVar, this);
    }

    @Override // U7.a
    public void a(Activity activity) {
        Object obj = this.f7017a;
        if (obj != null) {
            ((U4.c) obj).i(activity, ((h) this.f7021e).f());
        } else {
            this.f7022f.handleError(com.unity3d.scar.adapter.common.b.a(this.f7019c));
        }
    }

    @Override // Y7.a
    protected void c(AdRequest adRequest, U7.b bVar) {
        U4.c.d(this.f7018b, this.f7019c.b(), adRequest, ((h) this.f7021e).e());
    }
}
