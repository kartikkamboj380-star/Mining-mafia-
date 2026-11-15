package L4;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f3107b;

    d(g gVar, Context context, String str) {
        this.f3106a = context;
        this.f3107b = str;
        Objects.requireNonNull(gVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new v(this.f3106a, null).b(this.f3107b, null);
    }
}
