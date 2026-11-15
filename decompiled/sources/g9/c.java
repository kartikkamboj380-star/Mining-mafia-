package g9;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f44439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z9, Function0 function0) {
        super(str, z9);
        this.f44439e = function0;
    }

    @Override // g9.a
    public long f() {
        this.f44439e.invoke();
        return -1L;
    }
}
