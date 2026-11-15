package G2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public p023c2.a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public p023c2.a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public p023c2.a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract p023c2.a d(int i10, int i11, Bitmap.Config config);
}
