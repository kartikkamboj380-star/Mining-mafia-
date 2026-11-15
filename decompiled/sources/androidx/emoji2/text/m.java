package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f9789d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f9791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f9792c = 0;

    m(l lVar, int i10) {
        this.f9791b = lVar;
        this.f9790a = i10;
    }

    private p041e0.a g() {
        ThreadLocal threadLocal = f9789d;
        p041e0.a aVar = (p041e0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new p041e0.a();
            threadLocal.set(aVar);
        }
        this.f9791b.d().j(aVar, this.f9790a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f9791b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f9791b.c(), this.f9790a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f9792c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f9792c & 4) > 0;
    }

    public void l(boolean z9) {
        int iD = d();
        if (z9) {
            this.f9792c = iD | 4;
        } else {
            this.f9792c = iD;
        }
    }

    public void m(boolean z9) {
        int i10 = this.f9792c & 4;
        this.f9792c = z9 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb.append(Integer.toHexString(b(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
