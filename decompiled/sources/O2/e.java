package O2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface e extends c {
    static e B(Bitmap bitmap, p023c2.g gVar, o oVar, int i10) {
        return K(bitmap, gVar, oVar, i10, 0);
    }

    static e K(Bitmap bitmap, p023c2.g gVar, o oVar, int i10, int i11) {
        return b.X() ? new b(bitmap, gVar, oVar, i10, i11) : new h(bitmap, gVar, oVar, i10, i11);
    }

    static e p0(p023c2.a aVar, o oVar, int i10, int i11) {
        return b.X() ? new b(aVar, oVar, i10, i11) : new h(aVar, oVar, i10, i11);
    }

    int n0();

    int y0();
}
