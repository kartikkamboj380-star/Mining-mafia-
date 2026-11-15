package p055f4;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C1415c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes2.dex */
public class k implements h {
    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C) || (unsatisfiedLinkError instanceof B)) {
            return false;
        }
        String strA = ((C) unsatisfiedLinkError).a();
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strA == null ? "" : ", retrying for specific library " + strA);
        p.b("SoLoader", sb.toString());
        for (E e10 : eArr) {
            if (e10 instanceof G) {
                G g10 = (G) e10;
                if (g10 instanceof C1415c) {
                    continue;
                } else {
                    try {
                        p.b("SoLoader", "Runpacking " + g10.c());
                        g10.e(2);
                    } catch (Exception e11) {
                        p.c("SoLoader", "Encountered an exception while reunpacking " + g10.c() + " for library " + strA + ": ", e11);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
