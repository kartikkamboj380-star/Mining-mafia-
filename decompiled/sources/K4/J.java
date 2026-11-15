package K4;

import com.google.android.gms.internal.ads.AbstractC3068c9;
import com.google.android.gms.internal.ads.C8;
import com.google.android.gms.internal.ads.D8;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class J extends AbstractC3068c9 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ Map f2620G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ L4.m f2621H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final /* synthetic */ byte[] f2622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(N n10, int i10, String str, D8 d10, C8 c10, byte[] bArr, Map map, L4.m mVar) {
        super(i10, str, d10, c10);
        this.f2622w = bArr;
        this.f2620G = map;
        this.f2621H = mVar;
        Objects.requireNonNull(n10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3068c9
    protected final void A(String str) {
        this.f2621H.e(str);
        super.A(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    public final Map n() {
        Map map = this.f2620G;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    public final byte[] o() {
        byte[] bArr = this.f2622w;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    protected final /* bridge */ /* synthetic */ void t(Object obj) {
        A((String) obj);
    }
}
