package F;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f649e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f653d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f650a = i10;
        this.f651b = i11;
        this.f652c = i12;
        this.f653d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return c(bVar.f650a + bVar2.f650a, bVar.f651b + bVar2.f651b, bVar.f652c + bVar2.f652c, bVar.f653d + bVar2.f653d);
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.max(bVar.f650a, bVar2.f650a), Math.max(bVar.f651b, bVar2.f651b), Math.max(bVar.f652c, bVar2.f652c), Math.max(bVar.f653d, bVar2.f653d));
    }

    public static b c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f649e : new b(i10, i11, i12, i13);
    }

    public static b d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b e(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f653d == bVar.f653d && this.f650a == bVar.f650a && this.f652c == bVar.f652c && this.f651b == bVar.f651b;
    }

    public Insets f() {
        return a.a(this.f650a, this.f651b, this.f652c, this.f653d);
    }

    public int hashCode() {
        return (((((this.f650a * 31) + this.f651b) * 31) + this.f652c) * 31) + this.f653d;
    }

    public String toString() {
        return "Insets{left=" + this.f650a + ", top=" + this.f651b + ", right=" + this.f652c + ", bottom=" + this.f653d + '}';
    }
}
