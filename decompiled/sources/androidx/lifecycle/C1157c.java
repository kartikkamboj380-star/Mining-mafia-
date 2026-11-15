package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1157c implements InterfaceC1168n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1161g[] f10209a;

    public C1157c(InterfaceC1161g[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f10209a = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r source, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new C1178y();
        InterfaceC1161g[] interfaceC1161gArr = this.f10209a;
        if (interfaceC1161gArr.length > 0) {
            InterfaceC1161g interfaceC1161g = interfaceC1161gArr[0];
            throw null;
        }
        if (interfaceC1161gArr.length <= 0) {
            return;
        }
        InterfaceC1161g interfaceC1161g2 = interfaceC1161gArr[0];
        throw null;
    }
}
