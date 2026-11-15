package B4;

import H4.B;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static f a(Context context, f fVar, List list) {
        f fVar2 = null;
        if (list != null && fVar != null) {
            if (!fVar.j() && !fVar.n()) {
                float f10 = context.getResources().getDisplayMetrics().density;
                fVar = new f(Math.round(fVar.g(context) / f10), Math.round(fVar.d(context) / f10));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f fVar3 = (f) it.next();
                if (fVar3 != null) {
                    int iF = fVar.f();
                    int iF2 = fVar3.f();
                    int iC = fVar.c();
                    double d10 = ((double) iF) * 0.5d;
                    double d11 = iF2;
                    int iC2 = fVar3.c();
                    if (d10 <= d11 && iF >= iF2) {
                        if (fVar.n()) {
                            int iP = fVar.p();
                            if (((Integer) B.c().d(AbstractC3892ii.f29824f9)).intValue() <= iF2) {
                                if (((Integer) B.c().d(AbstractC3892ii.f29835g9)).intValue() <= iC2 && iP >= iC2) {
                                    if (fVar2 != null || fVar2.f() * fVar2.c() <= fVar3.f() * fVar3.c()) {
                                        fVar2 = fVar3;
                                    }
                                }
                            }
                        } else if (fVar.j()) {
                            if (fVar.m() >= iC2) {
                                if (fVar2 != null) {
                                }
                                fVar2 = fVar3;
                            }
                        } else if (((double) iC) * 0.7d <= iC2 && iC >= iC2) {
                            if (fVar2 != null) {
                            }
                            fVar2 = fVar3;
                        }
                    }
                }
            }
        }
        return fVar2;
    }
}
