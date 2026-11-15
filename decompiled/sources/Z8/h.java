package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y8.b f7197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l writer, Y8.b json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f7197c = json;
    }

    @Override // Z8.g
    public void b() {
        l(true);
        this.f7198d++;
    }

    @Override // Z8.g
    public void c() {
        l(false);
        i("\n");
        int i10 = this.f7198d;
        for (int i11 = 0; i11 < i10; i11++) {
            i(this.f7197c.c().n());
        }
    }

    @Override // Z8.g
    public void d() {
        if (a()) {
            l(false);
        } else {
            c();
        }
    }

    @Override // Z8.g
    public void m() {
        e(' ');
    }

    @Override // Z8.g
    public void n() {
        this.f7198d--;
    }
}
