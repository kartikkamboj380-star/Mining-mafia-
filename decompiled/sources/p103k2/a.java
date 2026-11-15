package p103k2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45598a = new a();

    private a() {
    }

    @Override // p103k2.b
    public void a(p093j2.a tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // p103k2.b
    public boolean b(p093j2.a tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return false;
    }

    @Override // p103k2.b
    public void c(p093j2.a tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
    }
}
