package p132n1;

import kotlin.enums.EnumEntries;
import p189s8.a;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f46548h = a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46550b;

    c(boolean z9, boolean z10) {
        this.f46549a = z9;
        this.f46550b = z10;
    }

    public final boolean d() {
        return this.f46549a;
    }

    public final boolean e() {
        return this.f46550b;
    }
}
