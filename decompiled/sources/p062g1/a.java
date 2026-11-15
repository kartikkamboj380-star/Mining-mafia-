package p062g1;

import kotlin.jvm.internal.Intrinsics;
import p012b1.C;
import p132n1.o;
import p192t1.F;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    @Override // p062g1.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(C c10, o oVar) {
        if (!Intrinsics.b(c10.c(), "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c10);
        sb.append(':');
        sb.append(F.d(oVar.c().getResources().getConfiguration()));
        return sb.toString();
    }
}
