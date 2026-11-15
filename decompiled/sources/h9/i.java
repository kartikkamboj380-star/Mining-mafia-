package h9;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f44960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f44961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f44960a = firstConnectException;
        this.f44961b = firstConnectException;
    }

    public final void a(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        p129m8.a.a(this.f44960a, e10);
        this.f44961b = e10;
    }

    public final IOException b() {
        return this.f44960a;
    }

    public final IOException c() {
        return this.f44961b;
    }
}
