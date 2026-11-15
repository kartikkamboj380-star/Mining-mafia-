package p152p1;

import O1.f;
import O1.g;
import android.graphics.Canvas;
import p012b1.n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f47750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f47751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47753d;

    public e(g gVar, f fVar, int i10, int i11) {
        this.f47750a = gVar;
        this.f47751b = fVar;
        this.f47752c = i10;
        this.f47753d = i11;
    }

    @Override // p012b1.n
    public long a() {
        return 2048L;
    }

    @Override // p012b1.n
    public boolean b() {
        return true;
    }

    @Override // p012b1.n
    public void c(Canvas canvas) {
        this.f47750a.o(canvas, this.f47751b);
    }

    @Override // p012b1.n
    public int getHeight() {
        return this.f47753d;
    }

    @Override // p012b1.n
    public int getWidth() {
        return this.f47752c;
    }
}
