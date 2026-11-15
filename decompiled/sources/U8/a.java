package U8;

import T8.b;
import X8.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final b a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.a().b() ? bVar : new m(bVar);
    }
}
