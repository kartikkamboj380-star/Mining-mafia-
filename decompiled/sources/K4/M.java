package K4;

import com.google.android.gms.internal.ads.AbstractC5960z8;
import com.google.android.gms.internal.ads.C2575Vt;
import com.google.android.gms.internal.ads.C5456v8;
import com.google.android.gms.internal.ads.E8;
import com.google.android.gms.internal.ads.V8;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends AbstractC5960z8 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2575Vt f2624m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final L4.m f2625v;

    public M(String str, Map map, C2575Vt c2575Vt) {
        super(0, str, new L(c2575Vt));
        this.f2624m = c2575Vt;
        L4.m mVar = new L4.m(null);
        this.f2625v = mVar;
        mVar.b(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    protected final E8 s(C5456v8 c5456v8) {
        return E8.a(c5456v8, V8.a(c5456v8));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    protected final /* bridge */ /* synthetic */ void t(Object obj) {
        C5456v8 c5456v8 = (C5456v8) obj;
        Map map = c5456v8.f34000c;
        int i10 = c5456v8.f33998a;
        L4.m mVar = this.f2625v;
        mVar.d(map, i10);
        byte[] bArr = c5456v8.f33999b;
        if (L4.m.j() && bArr != null) {
            mVar.f(bArr);
        }
        this.f2624m.b(c5456v8);
    }
}
