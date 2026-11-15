package K4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f2613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f2614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double[] f2615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f2616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2617e;

    /* synthetic */ H(G g10, byte[] bArr) {
        int size = g10.d().size();
        this.f2613a = (String[]) g10.c().toArray(new String[size]);
        this.f2614b = c(g10.d());
        this.f2615c = c(g10.e());
        this.f2616d = new int[size];
        this.f2617e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final void a(double d10) {
        this.f2617e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f2615c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f2614b[i10]) {
                int[] iArr = this.f2616d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final List b() {
        String[] strArr = this.f2613a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            double[] dArr = this.f2615c;
            double[] dArr2 = this.f2614b;
            int[] iArr = this.f2616d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new F(str, d10, d11, ((double) i11) / ((double) this.f2617e), i11));
        }
        return arrayList;
    }
}
