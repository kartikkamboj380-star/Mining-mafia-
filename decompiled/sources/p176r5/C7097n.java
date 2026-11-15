package p176r5;

import java.util.Objects;

/* JADX INFO: renamed from: r5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C7097n implements InterfaceC7090g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7091h f48302a;

    C7097n(r rVar, InterfaceC7091h interfaceC7091h) {
        this.f48302a = interfaceC7091h;
        Objects.requireNonNull(rVar);
    }

    @Override // p176r5.InterfaceC7090g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f48302a.a();
    }
}
