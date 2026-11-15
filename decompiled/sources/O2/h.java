package O2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
class h extends b {
    protected h(p023c2.a aVar, o oVar, int i10, int i11) {
        super(aVar, oVar, i10, i11);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Z1.a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected h(Bitmap bitmap, p023c2.g gVar, o oVar, int i10, int i11) {
        super(bitmap, gVar, oVar, i10, i11);
    }
}
