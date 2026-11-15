package p162q1;

import O1.f;
import O1.g;
import android.graphics.RectF;
import p012b1.n;
import p132n1.o;
import p152p1.b;
import p152p1.e;

/* JADX INFO: loaded from: classes.dex */
final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f47979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f47980b;

    public a(g gVar) {
        this.f47979a = gVar;
    }

    @Override // p162q1.b
    public void a(String str) {
        this.f47979a.t(str);
    }

    @Override // p162q1.b
    public void b(String str) {
        this.f47979a.r(str);
    }

    @Override // p162q1.b
    public void c(float[] fArr) {
        g gVar = this.f47979a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        gVar.s(f10, f11, fArr[2] - f10, fArr[3] - f11);
    }

    @Override // p162q1.b
    public float[] d() {
        RectF rectFG = this.f47979a.g();
        if (rectFG != null) {
            return new float[]{rectFG.left, rectFG.top, rectFG.right, rectFG.bottom};
        }
        return null;
    }

    @Override // p162q1.b
    public void e(o oVar) {
        String strA = b.a(oVar);
        if (strA != null) {
            f fVar = new f();
            fVar.a(strA);
            this.f47980b = fVar;
        }
    }

    @Override // p162q1.b
    public n f(int i10, int i11) {
        return new e(this.f47979a, this.f47980b, i10, i11);
    }

    @Override // p162q1.b
    public float getHeight() {
        return this.f47979a.f();
    }

    @Override // p162q1.b
    public float getWidth() {
        return this.f47979a.h();
    }
}
