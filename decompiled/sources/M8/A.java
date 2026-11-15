package M8;

import L8.C;
import L8.K;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
final class A extends C implements K {
    public A(int i10) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, K8.a.DROP_OLDEST);
        c(Integer.valueOf(i10));
    }

    @Override // L8.K
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zC;
        synchronized (this) {
            zC = c(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return zC;
    }
}
