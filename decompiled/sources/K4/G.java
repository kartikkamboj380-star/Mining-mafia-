package K4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f2610a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f2611b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f2612c = new ArrayList();

    public final G a(String str, double d10, double d11) {
        List list;
        int i10 = 0;
        while (true) {
            list = this.f2610a;
            if (i10 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.f2612c.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.f2611b.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        list.add(i10, str);
        this.f2612c.add(i10, Double.valueOf(d10));
        this.f2611b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final H b() {
        return new H(this, null);
    }

    final /* synthetic */ List c() {
        return this.f2610a;
    }

    final /* synthetic */ List d() {
        return this.f2611b;
    }

    final /* synthetic */ List e() {
        return this.f2612c;
    }
}
