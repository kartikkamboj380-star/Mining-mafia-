package R2;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: R2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0957g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p023c2.g f5136e;

    /* JADX INFO: renamed from: R2.g$a */
    class a implements p023c2.g {
        a() {
        }

        @Override // p023c2.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                C0957g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C0957g(int i10, int i11) {
        Y1.k.b(Boolean.valueOf(i10 > 0));
        Y1.k.b(Boolean.valueOf(i11 > 0));
        this.f5134c = i10;
        this.f5135d = i11;
        this.f5136e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iJ = Z2.d.j(bitmap);
        Y1.k.c(this.f5132a > 0, "No bitmaps registered.");
        long j10 = iJ;
        Y1.k.d(j10 <= this.f5133b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iJ), Long.valueOf(this.f5133b));
        this.f5133b -= j10;
        this.f5132a--;
    }

    public synchronized int b() {
        return this.f5132a;
    }

    public synchronized int c() {
        return this.f5134c;
    }

    public synchronized int d() {
        return this.f5135d;
    }

    public p023c2.g e() {
        return this.f5136e;
    }

    public synchronized long f() {
        return this.f5133b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iJ = Z2.d.j(bitmap);
        int i10 = this.f5132a;
        if (i10 < this.f5134c) {
            long j10 = this.f5133b;
            long j11 = iJ;
            if (j10 + j11 <= this.f5135d) {
                this.f5132a = i10 + 1;
                this.f5133b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
