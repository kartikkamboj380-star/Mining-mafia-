package Y7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a implements U7.a {
    public e(Context context, X7.a aVar, U7.c cVar, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, dVar);
        this.f7021e = new f(hVar, this);
    }

    @Override // U7.a
    public void a(Activity activity) {
        Object obj = this.f7017a;
        if (obj != null) {
            ((M4.a) obj).f(activity);
        } else {
            this.f7022f.handleError(com.unity3d.scar.adapter.common.b.a(this.f7019c));
        }
    }

    @Override // Y7.a
    protected void c(AdRequest adRequest, U7.b bVar) {
        M4.a.b(this.f7018b, this.f7019c.b(), adRequest, ((f) this.f7021e).e());
    }
}
