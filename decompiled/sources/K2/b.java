package K2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p083i2.b {
    @Override // p083i2.b
    public void f(p083i2.c cVar) {
        if (cVar.c()) {
            p023c2.a aVar = (p023c2.a) cVar.a();
            try {
                g((aVar == null || !(aVar.G() instanceof O2.c)) ? null : ((O2.c) aVar.G()).Q0());
            } finally {
                p023c2.a.x(aVar);
            }
        }
    }

    protected abstract void g(Bitmap bitmap);
}
