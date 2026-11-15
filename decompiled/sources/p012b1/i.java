package p012b1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import p192t1.F;

/* JADX INFO: loaded from: classes.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11523b;

    public i(Drawable drawable, boolean z9) {
        this.f11522a = drawable;
        this.f11523b = z9;
    }

    @Override // p012b1.n
    public long a() {
        return b.d(((long) F.f(this.f11522a)) * 4 * ((long) F.b(this.f11522a)), 0L);
    }

    @Override // p012b1.n
    public boolean b() {
        return this.f11523b;
    }

    @Override // p012b1.n
    public void c(Canvas canvas) {
        this.f11522a.draw(canvas);
    }

    public final Drawable d() {
        return this.f11522a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.b(this.f11522a, iVar.f11522a) && this.f11523b == iVar.f11523b;
    }

    @Override // p012b1.n
    public int getHeight() {
        return F.b(this.f11522a);
    }

    @Override // p012b1.n
    public int getWidth() {
        return F.f(this.f11522a);
    }

    public int hashCode() {
        return (this.f11522a.hashCode() * 31) + Boolean.hashCode(this.f11523b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f11522a + ", shareable=" + this.f11523b + ')';
    }
}
