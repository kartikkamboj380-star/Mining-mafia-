package p076h5;

import W4.c;
import W4.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class o extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7094k f44779a;

    o(p pVar, C7094k c7094k) {
        this.f44779a = c7094k;
    }

    @Override // p076h5.f
    public final void F5(Status status, f fVar) {
        TaskUtil.setResultOrApiException(status, fVar != null ? new c(fVar.zzb(), fVar.a()) : null, this.f44779a);
    }
}
