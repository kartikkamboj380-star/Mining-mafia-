package p029c8;

import U7.a;
import U7.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes3.dex */
public class g extends a implements a {
    public g(Context context, p019b8.a aVar, c cVar, d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f11878e = new h(iVar, this);
    }

    @Override // U7.a
    public void a(Activity activity) {
        Object obj = this.f11874a;
        if (obj != null) {
            ((U4.c) obj).i(activity, ((h) this.f11878e).f());
        } else {
            this.f11879f.handleError(b.a(this.f11876c));
        }
    }

    @Override // p029c8.a
    protected void c(AdRequest adRequest, U7.b bVar) {
        U4.c.d(this.f11875b, this.f11876c.b(), adRequest, ((h) this.f11878e).e());
    }
}
