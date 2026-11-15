package p048e7;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f43467a = new c0();

    private c0() {
    }

    @Override // p048e7.b0
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
