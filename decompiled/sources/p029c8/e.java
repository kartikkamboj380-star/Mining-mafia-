package p029c8;

import U7.a;
import U7.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a implements a {
    public e(Context context, p019b8.a aVar, c cVar, d dVar, h hVar) {
        super(context, cVar, aVar, dVar);
        this.f11878e = new f(hVar, this);
    }

    @Override // U7.a
    public void a(Activity activity) {
        Object obj = this.f11874a;
        if (obj != null) {
            ((M4.a) obj).f(activity);
        } else {
            this.f11879f.handleError(b.a(this.f11876c));
        }
    }

    @Override // p029c8.a
    protected void c(AdRequest adRequest, U7.b bVar) {
        M4.a.b(this.f11875b, this.f11876c.b(), adRequest, ((f) this.f11878e).e());
    }
}
