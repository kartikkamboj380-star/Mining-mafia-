package O5;

import android.os.Bundle;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
abstract class s extends P5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final P5.p f4539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C7094k f4540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f4541c;

    s(u uVar, P5.p pVar, C7094k c7094k) {
        this.f4541c = uVar;
        this.f4539a = pVar;
        this.f4540b = c7094k;
    }

    @Override // P5.m
    public void f0(Bundle bundle) {
        this.f4541c.f4546a.u(this.f4540b);
        this.f4539a.c("onCompleteUpdate", new Object[0]);
    }

    @Override // P5.m
    public void h5(Bundle bundle) {
        this.f4541c.f4546a.u(this.f4540b);
        this.f4539a.c("onRequestInfo", new Object[0]);
    }
}
