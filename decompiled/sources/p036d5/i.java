package p036d5;

import android.os.Looper;
import android.os.Message;
import p096j5.f;

/* JADX INFO: loaded from: classes2.dex */
final class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6949c f43109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C6949c c6949c, Looper looper) {
        super(looper);
        this.f43109b = c6949c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6949c.g(this.f43109b, message);
    }
}
