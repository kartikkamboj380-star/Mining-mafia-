package Z8;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f7206a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f7207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7208c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7209a = new a();

        private a() {
        }
    }

    public t() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f7207b = iArr;
        this.f7208c = -1;
    }

    private final void e() {
        int i10 = this.f7208c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f7206a, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f7206a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f7207b, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f7207b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i10 = this.f7208c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f7206a[i11];
            if (obj instanceof V8.d) {
                V8.d dVar = (V8.d) obj;
                if (!Intrinsics.b(dVar.getKind(), V8.g.b.f6153a)) {
                    int i12 = this.f7207b[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        sb.append(dVar.e(i12));
                    }
                } else if (this.f7207b[i11] != -1) {
                    sb.append("[");
                    sb.append(this.f7207b[i11]);
                    sb.append("]");
                }
            } else if (obj != a.f7209a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i10 = this.f7208c;
        int[] iArr = this.f7207b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f7208c = i10 - 1;
        }
        int i11 = this.f7208c;
        if (i11 != -1) {
            this.f7208c = i11 - 1;
        }
    }

    public final void c(V8.d sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i10 = this.f7208c + 1;
        this.f7208c = i10;
        if (i10 == this.f7206a.length) {
            e();
        }
        this.f7206a[i10] = sd;
    }

    public final void d() {
        int[] iArr = this.f7207b;
        int i10 = this.f7208c;
        if (iArr[i10] == -2) {
            this.f7206a[i10] = a.f7209a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f7207b;
        int i10 = this.f7208c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f7208c = i11;
            if (i11 == this.f7206a.length) {
                e();
            }
        }
        Object[] objArr = this.f7206a;
        int i12 = this.f7208c;
        objArr[i12] = obj;
        this.f7207b[i12] = -2;
    }

    public final void g(int i10) {
        this.f7207b[this.f7208c] = i10;
    }

    public String toString() {
        return a();
    }
}
