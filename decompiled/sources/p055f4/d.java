package p055f4;

import com.facebook.soloader.C;
import com.facebook.soloader.C1415c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes2.dex */
public class d implements h {
    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/data missing libraries.");
        boolean z9 = false;
        for (E e10 : eArr) {
            if ((e10 instanceof G) && !(e10 instanceof C1415c)) {
                G g10 = (G) e10;
                try {
                    for (G.c cVar : g10.o()) {
                        if (g10.f(cVar.f16517a) == null) {
                            p.b("SoLoader", "Missing " + cVar.f16517a + " from " + g10.c() + ", will force prepare.");
                            g10.e(2);
                            z9 = true;
                            break;
                        }
                    }
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/data failure ", e11);
                    return false;
                }
            }
        }
        if (z9) {
            p.b("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        p.b("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
