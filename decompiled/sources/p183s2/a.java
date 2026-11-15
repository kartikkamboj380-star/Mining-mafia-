package p183s2;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;
import p163q2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f48585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48586c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48587d = -1;

    public a(b bVar) {
        this.f48585b = bVar;
    }

    @Override // p163q2.c, p163q2.d
    public void m(String id, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f48587d = jCurrentTimeMillis;
        b bVar = this.f48585b;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f48586c);
        }
    }

    @Override // p163q2.c, p163q2.d
    public void q(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f48586c = System.currentTimeMillis();
    }
}
