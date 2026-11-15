package p055f4;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f43651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43652c;

    public f(Context context, int i10) {
        this.f43650a = context;
        this.f43652c = i10;
        a aVar = new a(5);
        this.f43651b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // p055f4.i
    public h get() {
        return new e(new g(this.f43650a, this.f43651b), new b(this.f43650a, this.f43651b), new l(), new c(this.f43650a), new j(this.f43652c), new d(), new k(), new l());
    }
}
