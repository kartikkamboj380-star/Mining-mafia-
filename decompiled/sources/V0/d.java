package V0;

import S0.i;
import S0.j;
import S0.o;
import S0.u;
import S0.x;
import S0.z;
import androidx.work.q;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f6073a;

    static {
        String strI = q.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f6073a = strI;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f5393a + "\t " + uVar.f5395c + "\t " + num + "\t " + uVar.f5394b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            i iVarA = jVar.a(x.a(uVar));
            sb.append(c(uVar, CollectionsKt.e0(oVar.b(uVar.f5393a), ",", null, null, 0, null, null, 62, null), iVarA != null ? Integer.valueOf(iVarA.f5366c) : null, CollectionsKt.e0(zVar.a(uVar.f5393a), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
