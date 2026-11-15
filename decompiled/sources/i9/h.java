package i9;

import c9.E;
import c9.x;
import kotlin.jvm.internal.Intrinsics;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC7107j f45141d;

    public h(String str, long j10, InterfaceC7107j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f45139b = str;
        this.f45140c = j10;
        this.f45141d = source;
    }

    @Override // c9.E
    public InterfaceC7107j e1() {
        return this.f45141d;
    }

    @Override // c9.E
    public long j() {
        return this.f45140c;
    }

    @Override // c9.E
    public x n() {
        String str = this.f45139b;
        if (str != null) {
            return x.f12264e.c(str);
        }
        return null;
    }
}
