package p016b5;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f11612a;

    l(m mVar) {
        Objects.requireNonNull(mVar);
        this.f11612a = mVar;
    }

    @Override // p016b5.e, p016b5.v
    public final void q5(Status status) {
        this.f11612a.setResult(status);
    }
}
