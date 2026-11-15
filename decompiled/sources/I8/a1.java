package I8;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient B0 f1757a;

    public a1(String str, B0 b10) {
        super(str);
        this.f1757a = b10;
    }

    public a1(String str) {
        this(str, null);
    }
}
