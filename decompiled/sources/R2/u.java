package R2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class u implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final B f5160a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f5163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5164e;

    public u(int i10, int i11, G g10, p013b2.d dVar) {
        this.f5161b = i10;
        this.f5162c = i11;
        this.f5163d = g10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap f(int i10) {
        this.f5163d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void i(int i10) {
        Bitmap bitmap;
        while (this.f5164e > i10 && (bitmap = (Bitmap) this.f5160a.pop()) != null) {
            int iA = this.f5160a.a(bitmap);
            this.f5164e -= iA;
            this.f5163d.b(iA);
        }
    }

    @Override // p013b2.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f5164e;
            int i12 = this.f5161b;
            if (i11 > i12) {
                i(i12);
            }
            Bitmap bitmap = (Bitmap) this.f5160a.get(i10);
            if (bitmap == null) {
                return f(i10);
            }
            int iA = this.f5160a.a(bitmap);
            this.f5164e -= iA;
            this.f5163d.e(iA);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p013b2.f, p023c2.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.f5160a.a(bitmap);
        if (iA <= this.f5162c) {
            this.f5163d.c(iA);
            this.f5160a.put(bitmap);
            synchronized (this) {
                this.f5164e += iA;
            }
        }
    }
}
