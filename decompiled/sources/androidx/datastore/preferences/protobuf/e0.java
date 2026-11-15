package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9468a;

    public e0(J j10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f9468a = null;
    }

    public C1125v a() {
        return new C1125v(getMessage());
    }
}
